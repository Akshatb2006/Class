/*object methods--Object.keys()
                --Object.values()
                --Object.entries()*/
    
//object operations or methods
/* 1.Object.keys()-- returns the array of all the keys
let std={
    name:"Mayank",
    age:18,
    Rollno:5
}
let arr=Object.keys(std)
for(let i of arr){
    console.log(std[i])
}*/
/* 2.Object.values()--returns values of object in an array 
let obj={
    name:"Horse",
    age:17,
    rollno:2
}
console.log(Object.values(obj))*/
/* 3.Object.entries()-- converts object into array
let obj = {
    name:"Anurag",
    age:17,
    rollno:45
}
let arr=Object.entries(obj)
for(let i of arr){
    console.log(i[1])
}*/
 //concept of closure--allows us to access the value outisde its lexical scope
 //child function can access the properties the properties of parent function     
 /*function test1(){
    let a=5;
    return a
 }
 console.log(test1())
 console.log(a)
 function test2(){
    let a=5;
    function right(){ //child function
        return a
    }
    return right; // returned a function
 }
 let check = test2()
 console.log(check())*/
 // NOTE=> 1. By default we cannot access variables or properties outside their lexical scope but because of closure
 //             we can accessthen outside their lexical scope
 //        2. When function returns then it destroys all its properties but bcz of closure child function can always 
 //              access the properties of its parent function no matter parent function has returned on net.
 //        
 /*function parent(a){
    let b=5
    function child(){
        return a+b;
    }
    return child;//child has returned by parent function
 }
 let childfunc=parent(4)//called parent function
 console.log(childfunc())//9*/

 /*function parent(a){
    let b=5;
    function child1(){
        return a+b;
    }
    function child2(){
        return b;
    }
    return child1;
 }
 let childfunc=parent(5)
 console.log(childfunc())*/

 //Type Casting: when u change datatype of data then it is known as type casting
 /*let a="123"
 let b=parseInt(a)
 console.log(typeof b)//number*/
 //string should be a valid number.....parseInt converts string to number
 /*let d=123
 let c= d.toString()
 console.log(typeof c)*/

 //Dynamic v/s Static typed Language: defined with the help of datatypes
 // when we donot need to define the type of data in code then that language is dynamically typed.