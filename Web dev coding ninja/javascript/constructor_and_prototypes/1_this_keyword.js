// this refer to js object

//global context
//console.log(this); // this is refring to window object

//function context
// whenever a function is called it create a lexical scope
// and it contain (variables, refrence to outer environment, this)

function demo(){
    console.log(this);
}
//demo(); // if you call function in this way then "this" refer to global/ window object

var obj = {
    "prop1": 12,
    "print": function(){
        console.log(this); // here this refer to obj and print all the peroperties and value of refrence object
    },
    "name":"sushant"
}

obj.print(); 

/*
    There is four ways to call a function
    1.Simple way
    2.Via object
    3.function as a constructor
    4.functiona stored in a variable
    
*/