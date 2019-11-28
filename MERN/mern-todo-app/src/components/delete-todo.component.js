import React, { Component } from 'react';
import axios from 'axios';

export default class DeleteTodo extends Component {

    constructor(props) {
        console.log("DeleteTodo");
        super(props); 
        
        this.onChangeTodoDescription = this.onChangeTodoDescription.bind(this);
        this.onChangeTodoResponsible = this.onChangeTodoResponsible.bind(this);
        this.onChangeTodoPriority = this.onChangeTodoPriority.bind(this);
        this.onChangeTodoCompleted = this.onChangeTodoCompleted.bind(this);
        this.onSubmit = this.onSubmit.bind(this);

        this.state = {
            todo_description: props.todo_description,
            todo_responsible: '',
            todo_priority: '',
            todo_completed: false
        }
    }

    componentDidMount() {
        console.log("DeleteTodo - componentDidMount");
        axios.get('http://'+ window.location.hostname +':4000/todos/'+this.props.match.params.id)
            .then(response => {
                this.setState({
                    todo_description: response.data.todo_description,
                    todo_responsible: response.data.todo_responsible,
                    todo_priority: response.data.todo_priority,
                    todo_completed: response.data.todo_completed
                })   
            })
            .catch(function (error) {
                console.log(error);
            })
            console.log("response: " + this.state.todo_description);
            this.delete();
    }

    onChangeTodoDescription(e) {
        this.setState({
            todo_description: e.target.value
        });
    }

    onChangeTodoResponsible(e) {
        this.setState({
            todo_responsible: e.target.value
        });
    }

    onChangeTodoPriority(e) {
        this.setState({
            todo_priority: e.target.value
        });
    }

    onChangeTodoCompleted(e) {
        this.setState({
            todo_completed: !this.state.todo_completed
        });
    }

    onSubmit(e) {
        e.preventDefault();
        const obj = {
            todo_description: this.state.todo_description,
            todo_responsible: this.state.todo_responsible,
            todo_priority: this.state.todo_priority,
            todo_completed: this.state.todo_completed
        };
        console.log(obj);

        //http://localhost:4000/todos/update/
        axios.post('http://'+ window.location.hostname +':4000/del/'+this.props.match.params.id, obj)
            .then(res => console.log(res.data));
        
        this.props.history.push('/');
    }

    delete() {
        console.log("delete - " + this.props.match.params.id);
        
        axios.post('http://'+ window.location.hostname +':4000/todos/del/'+this.props.match.params.id)
        .then(res => console.log(res.data))
        .catch(function (error) {
            console.log(error);
        })
    }

    render() {
        return (
            <div>
                <h3 align="center">Delete Todo</h3>
                    <div className="form-group"> 
                        <label>Description: {this.state.todo_description}</label>
                    </div>
                    <div className="form-group">
                        <label>Responsible: {this.state.todo_responsible}</label>
                    </div>
                    <div className="form-group">
                        <label className="form-check-label">Low: {this.state.todo_priority}</label>                        
                    </div>
            </div>
        )
    }
}