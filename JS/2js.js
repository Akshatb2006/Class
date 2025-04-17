/*let num=0
if(num>0){
    console.log("it is positive ")
}
else if(num<0){
    console.log("it is negative")
}
else{
    console.log("it is zero")
}

let n=7
if(n%2==0){
    console.log("it is even")
}
else{
    console.log("it is odd")
}


let rating=3
if(rating<2){
    console.log("bad rating")
}
else if(rating>4){
    console.log("good")
}
else{
    console.log("average")
}


You are writing a program to determine the result of a student based on their
marks. The program should check whether the student has passed or failed, and if
the student has passed, it should further check if they achieved a distinction. The
conditions are as follows:


The student passes if their marks are 40 or above.
The student earns a Distinction if their marks are 80 or above.
If the student’s marks are below 40, they have failed.


let marks = 30;
if(marks>=40){
    if(marks>=80){
        console.log("distinction");
    }
    else{
        console.log("not distinction");
    }
}
else{
    console.log("failed")};


let day = 7;

switch(day){
    case 1 :
        console.log("sunday");
        break;
    case 2 : 
        console.log("monday");
        break;
    case 3 :
        console.log("tuesday");
        break;
    case 4 :
        console.log("wednesday");
        break;
    case 5 :
        console.log("thursday");
        break;
    case 6 :
        console.log("friday");
        break;
    case 7 :
        console.log("saturday");
}

let grades =1
switch(grades){
    case 1 :
        console.log("A");
        break;
    case 2 :
        console.log("B");
        break;
}

function year(x){
   if(x%4==0 && x%100!=0 || x%400==0){
    return "it is a leap year"
 }
 else {
    return "it is not a leap year"
 }
}
console.log(year(100))*/

//develop a color picker program that allow the user to enter a color code(R for Red, G for Green, B for Blue). Use of switch case statement to display a message 

// write a function month number as input and prints the corresponding the season of the year

/*switch (7){
    case 1 :
    case 12:
        case 4:
            console.log("winter");
            break;
    case 2:
        case 7 :
            case 8 :
               console.log("summer");
               break;
    default: 
    console.log("spring")
} */


//find errors
/*if("hello"){
    console.log(10)
} //if "if" has a truthy value then it will be executed.

switch(true){
    case 1 : console.log(1);break;
    case 2 : console.log(2);break;
    case 3 : console.log(3);break;
    
    default: console.log("?")
}

let a;
if(a=5){
    console.log("test1");
}
else{
    console.log('test failed')
}

if(8&2){
    console.log("test 3");
}
else if(1){
    console.log("test 4")
}

function test(){
    var a = 5
    console.log("func1")
}
console.log(a)

{
    var b = 5;
}
console.log(b)*/ //let and const is only accessible inside the block but var is globally accessible except function


//console.log(a)


//Td2-- temporal dead zone
//console.log(a)

//console.log(a) // we can access it
//var a = 5;

//console.log(b) b has been declared but we cannot access its value
//let b = 5


function largest(a, b, c){
    if(a>b&a>c){
        console.log(a)
    }
    else if(b>a&b>c){
        console.log(b)
    }
    else{
        console.log(c)
    }
}
largest(9, 7, 11)

//without logical operator with nested if else operator
let a = 9;
 b= 7;
 c = 5;
 if(a>b, a>c){
    console.log(a)
 }
 else if(b>a, b>c){
    console.log(b)
 }
 else{
    console.log(c)
 }


 