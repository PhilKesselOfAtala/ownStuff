import React, { Component } from 'react';
import { Link } from 'react-router-dom';
import axios from 'axios';

const Todo = props => (
    <tr>
        <td>{props.todo.todo_description}</td>
        <td>{props.todo.todo_responsible}</td>
        <td>{props.todo.todo_priority}</td>
        <td>
            <Link to={"/edit/"+props.todo._id}>Edit</Link>
        </td>
        <td>
            <Link to={"/del/"+props.todo._id}>Delete</Link>
        </td>
    </tr>
)

//onClick={event =>  window.location.href='/'}
export default class TodosList extends Component {

    constructor(props) {
        super(props);
        this.state = {todos: []};
    }

//http:localhost:4000/todos/
    componentDidMount() {
        axios.get('http://'+ window.location.hostname +':4000/todos/')
            .then(response => {
                console.log("todos componentDidMount");
                this.setState({ todos: response.data });
            })
            .catch(function (error){
                console.log("tama niin");
                console.log(error);
            })
    }

    refreshPage() {
        console.log("refreshPage");

        //this.setState({});
    }

    todoList() {
        return this.state.todos.map(function(currentTodo, i){
            return <Todo todo={currentTodo} key={i} />;
        })
    }

    render() {
        return (
            <div>
                <h3>Todos List</h3>
                <table className="table table-striped" style={{ marginTop: 20 }} >
                    <thead>
                        <tr>
                            <th>Description</th>
                            <th>Responsible</th>
                            <th>Priority</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        { this.todoList() }
                    </tbody>
                </table>
            </div>
        )
    }
}