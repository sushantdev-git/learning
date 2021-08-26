var name="global"
console.log(name)

function scopeDemo(){
    var i=10;
    var name="function";
    console.log(name);    // first interpreter look for name in current scope and then search in outer scope
}

//scopeDemo()
// console.log(i)  // i is not available in global scope
console.log(name)  
/*
A lexical scope in JavaScript means that a variable defined outside a function can be accessible inside another function
defined after the variable declaration. But the opposite is not true; the variables defined inside a function will not be
accessible outside that function.
 */
//execution context
//enviroment of the variable is known as execution context
//like (name="global") the execution context this var is global
//like when we call fucntion "scopeDemo" an enviroment is created and it contain information about variable inside it.



//execution stack
//it is like stack the last come goes first
//when a task is completed it will be popped out of stack

function c(){
    console.log("Inside c")
}
function b(){
    c();
    console.log("Inside b")
}
function a(){
    b();
    console.log("Inside a")
}

//a();
// how this  work is;
/*
    first a is called so, the execution context of a is created
    then a calls b so, the execution context of b is created 
    then b calls c so, the execution context of c is created
    and, there is no call in c so console.log inside c is executed, and then the c will be popped out of the execution stack
    and, then console.log inside b is executed, and then the b will be popped out of the execution stack
    and then, console.log inside a is executed, and then the a will be popped out of the execution stack

    stack-
    global > a > b > c > c executed> b executed> a is executed. //
    every execution context have refrence to previous environment
 */

function multiply(a, b) {
    return a*b;
};

//console.log(multiply);  // here if we just call function name it will just return whole function

var a = 1;

function b() {
    a = 10;
    return;
    function a() { } 
    /**
    look at this question 
    here inside b, due to hoisting the a function will be moved to top,
    and then the value of a is changed from function to a variable,
    that's why the environment of a will be inside b function and the value of
    outer a will remain same.
     */
}

b();
console.log(a);