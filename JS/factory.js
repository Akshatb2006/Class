/*const friendOne = {
    name: "John",
    talk(){
        return(`hello I am ${this.name}`)
    }
}
friendOne.talk();

function createCircle() {
    return {
        draw: function() {
            console.log('draw')
        }
    }
}
createCircle();

//constructor function
function Person(name, age) {
    this.name = name,
    this.age = age,
    this.greet = function() {
        console.log("hello")
    }
}
const person1 = new Person("RAj",23);
const person2 = new Person("Chandu", 20);
console.log(person1.name, person1.age);
console.log(person2.name, person2.age);
console.log(person1) 



function createPerson(name, age){
    return{
        name:name,
        age:age,
        greet: "hello, are u ready?"
    }
}
const p1=createPerson('Alice', 25);
const p2=createPerson('xxx', 56)
console.log(p1.name);
console.log(p2.name);
console.log(p1.greet);*/

/*function Circle(radius, color){
         this.radius=radius;
         this.color=color
}
const c1=new Circle(5, "blue");

console.log(c1);
c1.diameter=10
console.log(c1);
c1.radius =3;
c1.diameter=6;
console.log(c1);*/

// spread operator
/*const userDetails = {
    name : "akb",
    age: 45,
    verified: false
}
let cloneUser = {...userDetails};
console.log(cloneUser);
cloneUser.name = 'kjsd';
console.log(cloneUser);
console.log(userDetails);*/


//Object.assign() Method
/*const userDetails = {
    name : "akb",
    age: 45,
    verified: false
}
let cloneUser = Object.assign({}, userDetails)
console.log(cloneUser)
cloneUser.age=69
console.log(cloneUser);
console.log(userDetails)*/

//JSON.Parse()
/*const userDetails = {
    name : "akb",
    age: 45,
    verified: false
}
let cloneUser = JSON.parse(JSON.stringify(userDetails))
console.log(cloneUser);
cloneUser.name= "jsg";
console.log(cloneUser)*/