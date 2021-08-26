function outer1(){
    var outerVar=10;
    function inner(){
        console.log(outerVar);
    }
    inner() // inner function is inside scope of outer function
}
//outer1()
//execution context
// global  > outer > inner > outer > global

var name="global"
function outer(){
    var outerVar=10;
    var name="outer"
    function inner(){
        var name="inner"  // if we don't have var name in inner scope then interpreter will search for it in outer scope.
                            // and console.log will print outer
        console.log(name);
    }
    inner()
    console.log(name)
}
//outer()
//console.log(name)




///Fucntion Expressions
// here we can create function as value of a variable
var factorial = function fact(n){
    if (n==0){
        return 1;
    }
    return n*fact(n-1)
};

// how to call
console.log(factorial) // it will return the whole function
console.log(factorial(5))  // you  can't call function as console.log(fact(5))

var factorial2 = function (n){  // if you don't give function name then it will take name of variable
    var ans =1;
    for(var i=1; i<=n;i++){
        ans*=i
    }
    return ans;
}
console.log(factorial2(5))
// in case of 'Function Expression' Hoisting dosen't work, but in case of function declaration hoisting work