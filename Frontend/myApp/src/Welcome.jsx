import React, { Component } from "react";

class Welcome extends React.Component {
    constructor(props) {
        super(props);
        this.state = {count:this.props.initial};
        console.log("Constructor Called!")
    }
    componentDidMount() {
        console.log('Component Mounted!')
    }
    componentDidUpdate(prevProps,prevState) {
        console.log('Previous state:', prevState.count)
        console.log('Current state:', this.state.count)
    }
    increment() {
        this.setState({count: this.state.count + this.props.step})
    }
    decrement() {
        if(this.state.count>-10)
        this.setState({count: this.state.count - this.props.step})
    }
    alert = () => alert("Limit Reached")
    render() {
        return (
        <div style={{border: '5px solid black', padding: '10px', margin: '10px',display: 'inline-block',textSize: '50px'}}>
         {/* <h1>WELCOME, {this.props.{name}}</h1> */}
         {this.state.count}<br/>
        <button onClick={() => this.state.count<this.props.upperlimit ? this.increment() : this.alert()}>+</button>
            <button onClick={() => this.state.count>this.props.limit ? this.decrement() : this.alert()}>-</button>
        </div>
        )
    }
}

export default Welcome;