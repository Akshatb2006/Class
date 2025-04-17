import { Component } from "react";
class ClassGreeting extends Component{
 // static defaultProps = {
 // name : "xyz"
 // }
 render(){
 return(
 <>
 <h1>
 Hi {this.props.name}
 </h1>
 </>
 )
 }
}
ClassGreeting.defaultProps = {
    name : "xyz"
   }
   export default ClassGreeting