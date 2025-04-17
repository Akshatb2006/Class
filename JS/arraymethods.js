//1. At--
/*let arr = ['H','E','L','L','O']
console.log(arr.at(2)) //L
console.log(arr.at(-4))//E

//2. Includes--> Returns boolean-->true/false
console.log(arr.includes('E'))//true
console.log(arr.includes('K'))//false

//3. Indexof --> returns index of element or -1 if element doesn’t exist
let arr=[1,2,3,4,5]
console.log(arr.indexOf(6))//-1
console.log(arr.indexOf(5))//4

//4. Splice-->
Splice(startIndex, no of element to be deleted, elements to be added)
let fruits = ["appple", "mango", "orange"]
// I want to delete mango
Fruits.splice(1,1)
console.log(fruits)//["apple","orange"]
console.log("kiwi")

//5. toSplice() -- After changes it creates new Array and rest its similar to splice
let arr=['a', 'c', 'd']
let newArr = arr.toSpliced(1, 0, 'b')
console.log(newArr)//['a', 'b', 'c', 'd']
console.log(arr)// ['a', 'c', 'd']*/

//6. sort()-- default, ascending order
/*let arr=[1,4,2,3]
arr.sort()
console.log(arr)//
//Descending order-->
arr.sort((a,b)=>b-a)
console.log(arr)*/

//7. Reverse()--> it reverse the order of elements
//let arr1=[2,3,1,4]
/*arr1.reverse()
console.log(arr1)*/

//8. toReversed()
/*let newarr1= arr1.toReversed()
console.log(newarr1)*/

//9. slice--> returns subarray for a particular range
/*let arr=[1,2,3,4,5]
let newarr=arr.slice(1,4)
console.log(newarr)// it wont modify original array
let Subarr=arr.slice(-4,-1)
console.log(Subarr)*/

//Join()--> it converts array into string
/*let arr=['H','E','L','L','O']
let str = arr.join("")
console.log(str)
let str1=arr.join("*")
console.log(str1)*/

//getter and setter
/*let obj = {
    fName:"ABC",
    lName: "XYZ",
    get fullName(){
        return this.fName + " " + this.lName
    }
}
console.log(obj.fullName)*/

/*let obj = {
    fName:"ABC",
    lName: "XYZ",
    set updateName(last){
        this.lName=last
    },
       get fullName(){
        return this.fName + " " + this.lName
    }
}
obj.updateName="XXX"
console.log(obj.fullName)*/

 //why are functions first class citizen in JS?
 /*-they can be assigned to variables
 -they can be passed as arguments to other functions
 -they can be returned from other functions
 -they can also be used as objects in js*/
 
/*
 let arr=['dog','cat','camel','duck','ant', {name:'jp'}]
 let new_arr=arr.slice(0,3)
 
 console.log("original",new_arr )*/

 /*let arr=[1,2,3,4,5,6,7,8]
 let res = [ ]
 let n=2
 for(let i=0; i<Array.length; i+=n){
    res.push(arr.slice(i, i+n))
 }
 console.log(res)*/
 

 