// // var multiply = function(x,y){
// //     return x*y
// // }


// // the above function can be written is smaller format as below
// // this type of function is called arrow funtion
// var multiply = (x,y) => {return x*y};


// // if function executes a single statement then you can remove brackets and return

// var multiply = (x,y) => x*y;

// var double = x => 2*x; 

// console.log(multiply(5,4))


//BINDING IN ARROW FUNCTION

function Person(name){
    this.name = name;
    console.log(this);

    setTimeout(() => console.log(this), 1000); // setTimeout written in arrow function type
}

var p = new Person("Sushant")


let user1 = {
    firstname: 'John',
    lastname: 'Doe',
    getFullName: function(){
        return function(){
            console.log(`The full name of the user is ${this.firstname} ${this.lastname} `);
        }
    }    
}
user1.getFullName()();

/*
    In the given example, the function which is getting returned i.e.
    return function(){ console.log(`The full name of the user is ${this.firstname} ${this.lastname} `); } 
    Is a unbounded function (An unbound function is a function that is not bound to an object) 
    So this in the above function refers to the global (window) object. 
    Since unbound functions are implicitly bound to the global scope). 
    And since no firstname and lastname variables were defined in the window environment, 
    ${this.firstname} ${this.lastname} prints undefined undefined.
*/


let user2 = {
    firstname: 'John',
    lastname: 'Doe',
    getFullName: function(){
        return() => {
            console.log(`The full name of the user is ${this.firstname} ${this.lastname} `);
        }
    }    
 }
 user2.getFullName()();

//ES6 arrow functions can’t be bound to a this keyword, so it will lexically go up a scope, 
//and use the value of this in the scope in which it was defined. Hence this refers to the 
//user object in this case and thus ${this.firstname} ${this.lastname} will print John Doe.