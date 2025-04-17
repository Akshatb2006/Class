/*let obj = {
    firstName: "RAJ",
    secondName: "XXX",
    fullName(){
        console.log(this.firstName + this.secondName )
    }
}
obj.fullName()*/

const { reject } = require("lodash");

//const { indexOf } = require("lodash");

//const { sum } = require("lodash");

//factory function--it returns the object,they donot have prototype, they will not return prototype name
/*function PSTSTD(name, age, roll, fee){
    return{
        //everything we write inside will act as an object
          name: name, 
          age: age,
          roll: roll,
          fees: fee
    }
}*/
/*console.log(PSTSTD("Karan", 18, 1, 2000))
let std1 = PSTSTD("xyz", 19, 2, 2000)*/

/*function PSTSTD(name, age, roll, cost){
    return{
        //everything we write inside will act as an object
          name,
          age,
         roll,
         cost
    }
}
console.log(PSTSTD("kishan", 18, 69, 1))*/
//dynamic nature of an object= it is changeable


//constructor function--do not return the object, they have prototype, they will return prototype name
/*function PSTSTD(name, age, roll){
             this.name=name
             this.age=age
             this.roll=roll
}
let std1= new PSTSTD("sugarDONATOR", 41, 1);
console.log(std1);*/



/*function PSTSTD(name, age, roll){
          this.name=name;
          this.age=age;
          this.roll=roll;
          this.Intro = function(){
            console.log(`My name is ${this.name}`)
          }
}
let std1= new PSTSTD("x", 1, 1)
std1.Intro()
console.log(std1.roll);*/

/*function rentalCarCost(d) {
    if (d>=7){
      return d*40-(50);
    }else if ( d>=3){
      return d*40-(20);
    }
      else{
        return d*40;
      }
    }*/


      /*let str  = "Jayaprasad"
      let srr = str.split("")
      let start =0
      let end = srr.length-1
      while (start<=end){
          let temp =srr[start]
          srr[start]= srr[end]
          srr[end]= temp
          start+=1
          end-=1
      }
      console.log(srr.join(''))*/

      //create a function Car which take an object which has properties car model,color,year of purchase 
      //and a function which will calculate the car how old it is. This function will take one parameter which is 
      //current year and display the result (your tesla car is 18 year old) 
       /* function Car(car_model,color,year_purchase)
         {
          return{
            car_model,
            color,
            year_purchase,

            old(current_year){
             console.log(`my ${car_model} is ${current_year-year_purchase} year old`)
            }
          }
         }
         const car1=Car('tesla', 'black', 2020)
         car1.old(2024)*/

         /*let std = {
          name: 'Himkar',
          age: '18',
          address: {
            state: 'karnatka',
            city: 'bangalore'
          },
          Intro: function(){
            console.log("My name is "+ this.name)
          }
         }
         let copystd=std
         copystd.name= "Tanzilla"
         console.log(std)
         console.log(copystd)*/


         /*let std = {
          name: 'Himkar',
          age: '18',
          address: {
            state: 'karnatka',
            city: 'bangalore'
          },
          Intro: function(){
            console.log("My name is "+ this.name)
          }
         }
         let copystd = Object.assign({}, std)
               copystd.name= 'std'
               console.log(std)
               console.log(copystd)
               copystd.address.city= 'xyz'
               console.log('std')
               console.log(copystd)*/


               /*let std = {
                name : "Himkar",
                age : 28 ,
                address : {
                   state : "Karnatka",
                   city : "Banglore",
                },
                Intro : function (){
                   console.log("My name is "+this.name)
                 }   
                }
             let copystd = {...std}
             copystd.name = "xyz"
             console.log(std)
             console.log(copystd)
             copystd.address.city="xyz"
             console.log(std)
             console.log(copystd)*/

             /*let std = {
              name : "Himkar",
              age : 28 ,
              address : {
                 state : "Karnatka",
                 city : "Banglore",
              }  
              }
              let copystd= JSON.parse  (JSON.stringify(std))
              copystd.address.city= 'xyz'
             console.log(std)
             console.log(copystd)*/
              

            /* let std = {
              name : "Himkar",
              age : 28 ,
              address : {
                 state : "Karnatka",
                 city : "Banglore",
              },
              Intro : function (){
                 console.log("My name is "+this.name)
               }   
              }
              let copystd= JSON.parse  (JSON.stringify(std))
              copystd.address.city= 'xyz'
             console.log(std)
             console.log(copystd)
             copystd.Intro()*/

 //find second largest element from an array

 //for in loop!!
 /*let obj={
  name:'xyz',
  class:'btech',
  rollno:45
 }
 for(let key in obj){
  console.log(key) ; //we r just printing the key...for in loop can only access the keys...to acess the values we need
  console.log(obj[key]);  //to print the obj[key]
    }                
    
  let arr=[640,540,8,12,0]
  for(let i in arr ){
    console.log(i) // giving the index values
    console.log(arr[i])  //printing the values...it has smaller syntax than for loop but it is not flexible
  }

    //for of loop!! it only work with arrays 
    //syntax-- for(let val of arrayName){
             //logic or code}
let arr=[2,4,5,6,9]
for(let d of arr){
  console.log(d)
}
//print even numbers using for loop
let arr=[2,4,3,1,5,9,12]
for(let d of arr){
  if(d%2==1){
    continue;   //the loop will skip the code which is written below continue
  }
  console.log(d)
  };*/

/*let people=["Raj", "Anshuman", "Sachin", "Shrey"]
for(let name of people){
  if(name==="Shrey"){
    break;
  }
  console.log(name)
}*/

//factory fuctions
/*function std(name,age,rollno){
  return{
    name,
    age,
    rollno
  }
}
let std1=std("Nivedita",17,1)
console.log(std1)
 console.log(typeof std("Arpit", 17,2))*/

//constructor function
/*function vichitraprani(name,Class,age){
  this.name=name
  this.Class=Class
  this.age=age
}
let std1= new vichitraprani("Sachin", "Mtech", 21)
let std2= new vichitraprani("priyanka", "phd", 25)
console.log(new vichitraprani("akb", "btech", 18))
console.log(std1)
console.log(std2)   

function fun(){
  return 'you need to run me to make urself correct'
}
console.log(typeof fun)// function datatype doesnt exist & type of function is function*/

// rest operator
/*let arr=[4,3,2,5,6]
let [a,b,...c]= arr
console.log(a)
console.log(b)
console.log(c)

let [a,b,...c]=[4,3,2,5,6]
console.log(a)
console.log(b)
console.log(c)

let arr1=[...arr]
console.log(arr1)
arr1[0]=10
console.log(arr)
function sum(...n){
  let sum=0
  for(let val of n){
    sum+=val;
  }
  console.log(sum)
}
sum(1,2,3,4,5)
sum(1)
sum(1,2,3)*/

/*let str1= "Hello, ";
let str2= "World!";
let result1 = str1 + str2;
console.log(result1);

result1 += "  I am at Polaris !!"
console.log(result1);*/

/*let str = "hello"
console.log(str.slice(-3))
console.log(str.slice(-3,-2))
console.log(str.substr(2,2))
console.log(str.charAt(1))
let msg="Hello Yug"
let newmsg=msg.replace("Yug", "xyz")         
console.log(newmsg)
console.log(msg)*/

/*let a="Hello Yug, Hey yug"
let res=a.replaceAll(/Yug/gi, "Yugji")// /Yug/gi this syntax is used to ignore the capital or small case n will globally replace the word
console.log(res)

let a="Hello"
let arr = a.split("")
//arr=['H','e','l','l','o']
console.log(arr)*/

/*let str="Hey! are you there"
let arr=str.split("").reverse('').join('')
console.log(arr)*/

/*let d = new Date()
console.log(d)
console.log(d.getTime())
console.log(d.getFullYear())
console.log(d.getMonth())
console.log(d.getDay())
console.log(d.getHours())
console.log(d.getMinutes())
console.log(d.getSeconds())
console.log(d.getMilliseconds())
console.log(d.getTimezoneOffset())*/


/*let add= function(a,b){
  return a+b;
}
console.log(add(2,5))*/

//let add =(a,b) => a+b;
//console.log(add(2,5))


/*function Greeting(name="student"){
  console.log(`Hello ${name}`)
}
Greeting('kanika')*/


/*let d = new Date("2023-09-04")
console.log(d)
let d1= new Date(2023, 09, 04)
console.log(d1)*/

/*let arr=[1,2,3];
arr=[];
console.log(arr);

let arr1 =[1,2,3];
arr1.length=0;
console.log(arr1);

let arr2=[1,2,3];
arr.splice(0,arr2.length);
console.log(arr2);

let arr3=[1,2,3];
while(arr.length){
  arr.pop();
}
console.log(arr3)*/


 /*let arr = [10,1,5,7,3,2];
 let newarr = arr.slice(0,3);
 console.log(newarr);
 let arr1=[2,3,4,6,9]
 let combined = arr.concat(arr1);
 console.log(combined);
 console.log(arr.join(arr1));
 console.log(arr.sort())*/

/*function person(name, age){
   return{
    name:name,
    age: age
   }
  }


let stu=person("akb",18)
console.log(stu);*/

/*function greet(name, callback) {
  console.log("hi" + ' '+ name)
  callback();
}
function callMe(){
  console.log('i am a callback function');
  
}
greet('peter', callMe)*/


/*function processUserInput(userName, callback){
  console.log('welcome'+ " " + userName)
  callback()
}
function callMe(){
  console.log('Congrats u hv been selected');
  
}
processUserInput('Chaitanya', callMe)*/

/*let myPromise = new Promise(function(resolve, reject) {
  let success = true;
  if (success) {
    resolve("successfully")
  } else{
    reject("error")
  }
});
myPromise.then(function(message) {
  console.log(message);
}).catch(function(error){
  console.log(error);
});*/

/*let promise = new Promise(function(resolve, reject) {
  const x = "geeksforgeeks";
  const y = "geeksforgeeks"
  if (x===y) {
    resolve();
  }else{
    reject();
  }
})
promise.then(function() {
  console.log('Success, You are a Geek');
}).catch(function() {
  console.log('Some error has occured');
});*/

/*let count = 0
function increaedcount(){
  count +=1;
  console.log(count);
  
}
let id = setTimeout(increaedcount, 3000);
clearTimeout(id)
console.log('setTimeout is stopped')*/

/*console.log('hi');
setTimeout(()=> {
  console.log('i am a polaris');
  
},2000)
console.log("student")*/


/*let res = fetch("https://dummyjson.com/c/3029-d29f-4014-9fb4")
let resp=res.then(res=>res.json())
resp.then((data)=>{
  console.log(data)
})
resp.catch(err=>{
  console.log('im getting error', err )
})*/


/*let count=0
let res=setInterval(()=>{
  console.log("ketchup")
  count++
  if (count==5)
  {
    clearInterval(res)
  }
},5000)*/
/*function greetDevelopers(list) {
const greet = ["Hi ${firstName}, what do you like the most about ${language}"]
return greet.map((e)=>{
  list,
  greet
} )
}*/

/*function square_sums_row(n){
  const isPerfectSquare = (num) => Number.isInteger(Math.sqrt(num));
   const result = [];
   const used = Array(n + 1).fill(false);

   const backtrack = (current) => {
       if (current.length === n) return true;
       for (let i = 1; i <= n; i++) {
           if (!used[i] && (current.length === 0 || isPerfectSquare(current[current.length - 1] + i))) {
               used[i] = true;
               current.push(i);
               if (backtrack(current)) return true;
               current.pop();
               used[i] = false;
           }
       }
       return false;
}
}*/

/*let str='Am a polaris student p'
console.log(str.indexOf('p,-10'))
let str1='Am a polaris student'
console.log(str1.substring(-4))
console.log(str1.substr(-4))
console.log(str1.slice(3,-4))
console.log(str1.split('a'))
console.log(str1.replace('student', 'teacher'));*/

/*let a = "Akshat"
const vowels='aeiouAEIOU'
let count = 0
for(i=0; i<a.length; i++){
  if(vowels.includes(a.charAt(i)))
    { count +=1
      }
}
console.log(count)

  const obj ={
    name: 'Akshat',
    last_name: 'Baranwal'
  }
  console.log(Object.keys(obj))
  console.log(Object.values(obj));
  console.log(Object.entries(obj));*/

 /* function f1(){
    let a=10
    function f2()
    {
      b=20
      console.log(a)
      console.log(b);
      
    }
    f2()
  }
  f1()*/
// it is a scope in which it includes the properties of parent functions--lexical scope
/*function f1(){
  let a=10
  function f2(){
    let b=20
    console.log(a)
    console.log(b)
  }
  return f2
}
console.log(f1())*/

  
/*function isPrime(num) {
  if (num <= 1) return false;
  if (num <= 3) return true;

  if (num % 2 === 0 || num % 3 === 0) return false;

  for (let i = 5; i * i <= num; i += 6) {
    if (num % i === 0 || num % (i + 2) === 0) return false;
  }

  return true;
}
console.log(isPrime(2))*/

















