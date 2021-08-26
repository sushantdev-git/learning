'use strict'
function demo(a,b){
    console.log(this); //undefined when called simply without bounding to an object
    console.log(a,b)
}
//demo();

var obj = {
    "prop1": 12,
    "print": function(){
        console.log(this);
    },
    "name":"sushant"
}

//obj.print(); 

demo.call(obj)
demo.call(obj, 1,2)
demo.apply(obj,[1,2])
/*
    When you don't use strict mode the this keyword automatically refer to window object
    
    But, when you use strict mode
    Then "this" keyword will not refer to window object if it is not bounded to an object
    The value of "this" will be undefined

    We can bound a function to an object via function name "call" or "apply"
    demo.call(obj)  then "this" in demo will refer to obj object
    You can pass any object like "window"

    In call mode you can pass object and argument also like:
    demo.call(obj,1,2)

    In apply mode you can pass obj but you have to pass argument as an array
    demo.apply(obj, [1,2])

*/