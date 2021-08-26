var a=10;
setTimeout(function(){
    console.log(a)  // and then this line is printed
},1000)
var a=20;   // here just value of a is updated and not new a is declared
console.log(a)   // first this line is printed 

//using variable in global scope is bad
// to avoid this you can use function to make scope for variables

// now there is a method called IIFE which would be helpful

//IIFE stand for Immidiately Invoked Function Expression

/*
    IIFE is declared directly if global scope

    syntax:

    (function(){
        //code here // you can treat this part as your gobal scope
    })();

    // this function will be invoked by itself
 */