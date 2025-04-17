/*for(let i=1;i<=10; i++)
{
    console.log(i*5)
}


function calculateSum(){
    let sum = 0;
    for(let i = 2; i<=5; i++)
    {
        sum +=i ;
    }
    return sum;
}
console.log("Sum is :", calculateSum());


function printNumbers(){
    let i = 1;
    while (i<= 10)
    {
        i++;
        console.log(i);
        
    }
}
printNumbers()

function printEvenNumbers() {
    let i = 0;
    do {
        console.log(i);
        i++
    }while(i<=10)
}
printEvenNumbers()

function infiniteLoop() {
    let i = 0;
    while (true){
        console.log("infinite loop starts:")
        i++;
    }
}
infiniteLoop()

function print() {
    const car = {make : 'maruti',
                model: 'Baleno',
                  year: 2020
    };

    for(let key in car){
        console.log(`${key} : ${car[key]}`)
    }
}
print(); 

    const fruits = ["apple", "mango"]
    for (let i of fruits){
        console.log(i)
    }

    function printExecuteContinue()
    {
        for(let i = 0; i<= 10; i++)
            {
             if(i == 5)
             {
                continue;
             }
             console.log(i)
        }
    }
    printExecuteContinue()*/


//print nos 1 to n    
/*let n = 9;
for(let i = 0; i<=n; i++){
    console.log(i)
}*/

   

//print the even numbers upto n using while loop
/*function even(n){
    let i=0;
    while(i<=n){
        if (i%2==0)
        
        console.log(i);
        i++;
}
}
even(10)*/

//print odd numbers using do while loop
  /*function odd(a){
    let i=2
    do{
        if(i%2!=0){
            console.log(i)
    }
        i++
    }
    while(i<=a)
  }
odd(5)*/


//reverse the value of an array
/*function reverseArr(arr){
for(let i=0; i<arr.length/2; i++){
    let temp = arr[i]
    arr[i]= arr[arr.length-1-i]
    arr[arr.length-1-i]=temp  
}
console.log(arr)
}
reverseArr([1,2,3,4,5,6])*/

//print natural numbers n to 1






