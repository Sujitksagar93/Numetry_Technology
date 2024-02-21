

//javascript only hoists declaration not intialization (variable undefined until it reach where initialized)
//hoisting gives benifit we can access function and variable even before initializing it 


console.log(a)     // can not initalize but hoisting allowed
//console.log(b)
//console.log(c)
demo()

function demo() 
{
    console.log("hello")

}
//demo()

var a=10;    // declaration hoisted to top but initialization not hoisted 
console.log(a)  

//let b = 10 ;     // let and const declaratio  not hoisted

//const c = 10 ;  // let and const declaratio  not hoisted


//funtion expression and class expression not hoisted
/*
const demo = function demo1 = () =>
{
    console.log("hello")         funtion expression and class expression not hoisted

}
*/