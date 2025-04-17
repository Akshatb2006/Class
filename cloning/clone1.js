//import solution from "lodash"--if it doesnt work then write the below statement
/*const solution = require ("lodash")
let obj={
    name:"xyz",
    age:18,
    address:{
        city:"bangalore",
        state:"karnatka"
    }
}
let obj1=solution.cloneDeep(obj)
console.log(obj1)*/

//with lodash we create a perfect solution of deep copy

//Practice
/*console.log(Math.max(4,3,2,1))
console.log(Math.min(4,3,2,1))
console.log(Math.abs(-5))
console.log(Math.round(4.6))
console.log(Math.ceil(-3.6))
console.log(Math.floor(-4.1))
console.log(Math.trunc(-4.1))
console.log(Math.pow(2,3))
console.log(Math.sqrt(2))
console.log(Math.random())
console.log(Math.random()*10)
console.log(Math.floor(Math.random()*10))
console.log(Math.floor(Math.random()*10000))*/


/*Question 1: Object Manipulation
You are given an object representing a student's information. 
Your task is to write a JavaScript function that takes this object as input and performs the following tasks:
Add a new property called "averageGrade" to the object. 
Calculate the average grade by summing all the grades (located in the "grades" array) and dividing by the number of grades.
Create a copy of the student object without modifying the original object. 
The copy should include all properties except the "grades" property.
Finally, return the modified original object and the copy as a pair of objects in an array.*/
function manipulatesStudentInfo(student){
    let totalGrades = 0;
    for (let i = 0; i < student.grades.length; i++) {
        totalGrades += student.grades[i];
    }
    const averageGrade = totalGrades / student.grades.length;
    student.averageGrade = averageGrade;
    const studentCopy = {};
    for (let key in student) {
        if (key !== 'grades') {
            studentCopy[key] = student[key];
        }
    }
    return [student, studentCopy];
}
const student = {
    name : "John Doe",
    age : 20,
    grades : [85, 90, 78, 92, 88],
    city: "New York"
}
const [modifiedStudent, studentCopy] = manipulatesStudentInfo(student);
console.log(modifiedStudent);
console.log(studentCopy);

/*Question 2: Pizza Order
You are planning to throw a party and want to order Pizzas for the guests. 
Assuming each person gets 3 slices of Pizza and that each Pizza has 8 slices, 
you want to find out how many Pizzas should be ordered for this party. 
Write a JavaScript function that takes the number of people invited to the party as an 
input and returns the total number of Pizzas required.
Your function should:
Take the number of guests as input.
Use the assumption that each Pizza has 8 slices and each person gets 3 slices.
Round the result to the nearest whole number using `Math.ceil()`.
Return the count of Pizzas you should order as an integer.*/
function getPizzaCount(guests){
    let PizzaToBeOrdered = Math.ceil(guests*3/8);
    return PizzaToBeOrdered
}
const guestsInvited = 12
const PizzaToBeOrdered = getPizzaCount(guestsInvited)
console.log(PizzaToBeOrdered)
