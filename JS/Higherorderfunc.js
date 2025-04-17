/*let radius = [3,6,2,4];
function Area(r){
    let result=[]
    for(let i=0;i<r.length;i++)
        result.push(Math.PI*r[i]*r[i])
    return result
}
function diameter(r){
    let result=[]
    for(let i=0;i<r.length;i++)
        result.push(2*r[i])
    return result
}
function circumference(r){
    let result=[]
    for(let i=0;i<r.length;i++)
        result.push(Math.PI*2*r[i])
    return result
}
console.log(Area(radius))
console.log(diameter(radius));
console.log(circumference(radius));*/

//these are the functions that atke one or more functions as arguments and return functions
/* these can do at least on of the following
     -accept other functions as arguments
     -return a function asa result*/

/*function f1(jp, f3){
    console.log('hey i am function 1')
        jp() 
        f3()
        return f1
}
function f2(){
    console.log('hey i am function 2')
}
function f3(){
    console.log('hey i am function 3')
}
f1(f2,f3)*/
/*function Area(r){
   return (Math.PI*r*r)
}
function diameter(r){
    return (2*r)
}
function circumference(r)
{
    return (2*Math.PI*r)
}
function calc(radius, logic)
{
    let res=[]
for(let i=0;i<radius.length;i++)
{
    res.push(logic(radius[i]))
}
     return res
}
let radius = [3,6,2,4]
console.log(calc(radius,Area))
console.log(calc(radius,diameter))*/

/* filter()--this fucntiontakes an array and returns a new array with only the values that meet certain criteria.*/

/*let arr = [1,2,3,4,5]
let new_result = arr.filter(f1)
function f1(ele,index,arr)
{
    console.log(ele,index,arr) 
}
let new_result1= arr.filter((ele) => ele%2==0)
console.log(new_result1);*/
/*const words = ["apple", "banana", "grape", "kiwi", "orange"];
console.log(words.filter((e) => e.length>5))

const people =[
    {name:'Alice', age:30},
    {name:'Bob', age:20},
    {name:'Charlie', age:25},
    {name:'David', age:40}
]
console.log(people.filter((e) => e.age<=25 ))*/
 
/*arr = [1,2,3,4,5,6,8,12]
 console.log(arr.some(e=>e>5))
 console.log(arr.every(e=>e>5))*/

/*const arr = [1,2,3,4,5,6,8,12]
arr.reduce((total,value)=>{
    total=total+value
    return total
},0)
console.log(result)*/

function createDiscountCalculator(discouuntRate){
    return function(price) {
        return price-[price*discouuntRate]
    }
}
const electronicDiscount = createDiscountCalculator(8,10)
console.log(electronicDiscount(1000))

