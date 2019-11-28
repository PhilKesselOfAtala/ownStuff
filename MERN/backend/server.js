const express = require('express');
const app = express();
const bodyParser = require('body-parser');
const cors = require('cors');
const mongoose = require('mongoose');
const todoRoutes = express.Router();
const PORT = 4000;
let Todo = require('./todo.model');

app.use(cors());
app.use(bodyParser.json());
//With listener it will be outside from own network
/*app.listen(PORT,"0.0.0.0", function(){
    console.log("connect 0.0.0.0");
});
*/

mongoose.connect('mongodb+srv://user:password@cluster0-rbynk.mongodb.net/todos', {useNewUrlParser: true});
const connection = mongoose.connection;

connection.once('open', function() {
    console.log("MongoDB database connection established successfully");
})

todoRoutes.route('/').get(function(req, res) {
    console.log("TODO : " + req.id);
    Todo.find(function(err, todos) {
        if (err) {
            console.log("err: " + err);
        } else {
            console.log("todos: " + todos);
            res.json(todos);
        }
    });
});

todoRoutes.route('/:id').get(function(req, res) {
    let id = req.params.id;
    Todo.findById(id, function(err, todo) {
        res.json(todo);
        console.log("server - id - " + todo);
    });
});

todoRoutes.route('/update/:id').post(function(req, res) {
    console.log("update");
    Todo.findById(req.params.id, function(err, todo) {
        if (!todo)
            res.status(404).send("data is not found");
        else
            todo.todo_description = req.body.todo_description;
            todo.todo_responsible = req.body.todo_responsible;
            todo.todo_priority = req.body.todo_priority;
            todo.todo_completed = req.body.todo_completed;

            todo.save().then(todo => {
                res.json('Todo updated!');
                console.log("update: " + todo);
            })
            .catch(err => {
                res.status(400).send("Update not possible");
            });
    });
});

todoRoutes.route('/del/:id').post(function(req, res) {
    console.log("del - id: "+req.params.id);
    Todo.findByIdAndDelete(req.params.id, function(err, todo) {
        if (!todo)
            res.status(404).send("Deleting failed.");
        //else
        //    console.log("DELETED!");
    });
});

todoRoutes.route('/add').post(function(req, res) {
    let todo = new Todo(req.body);
    todo.save()
        .then(todo => {
            res.status(200).json({'todo': 'todo added successfully'});
        })
        .catch(err => {
            res.status(400).send('adding new todo failed');
        });
});

app.use('/todos', todoRoutes);

app.listen(PORT, function() {
    console.log("Server is running on Port: " + PORT);
});