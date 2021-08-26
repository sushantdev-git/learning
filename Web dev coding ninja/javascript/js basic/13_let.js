/*
    what is difference between var and let keyword
    > when you use var the variable is available in global scope
    > but, when you use let variable is available in block scope
    > in case of let hoisting dosen't work

 */
var a =10;  // here a is in global scope
if(a<=10){
    //console.log(b)  // will give error because hoisting dosen't work
    let b=40;  // here b is in block scope
}else{
    var c=50;
}

console.log(a,b,c)  //10 error //  because b is only available in if block scope