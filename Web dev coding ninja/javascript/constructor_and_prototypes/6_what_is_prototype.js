/*
   every function you create - js create a prototype of that function 

    whenever that function is used as constructor that prototype is used to create
    object

    object refer to prototype

   Vehicle.prototype
    {constructor: ƒ}constructor: ƒ Vehicle(numWheels, price)arguments: [Exception: TypeError: 'caller', 'callee', and 'arguments' properties may not be accessed on strict mode functions or the arguments objects for calls to them
        at Function.o (<anonymous>:1:83)]caller: [Exception: TypeError: 'caller', 'callee', and 'arguments' properties may not be accessed on strict mode functions or the arguments objects for calls to them
        at Function.o (<anonymous>:1:83)]length: 2name: "Vehicle"prototype: {constructor: ƒ}__proto__: ƒ ()[[FunctionLocation]]: VM55:3[[Scopes]]: Scopes[1]__proto__: Objectconstructor: ƒ Object()hasOwnProperty: ƒ hasOwnProperty()isPrototypeOf: ƒ isPrototypeOf()propertyIsEnumerable: ƒ propertyIsEnumerable()toLocaleString: ƒ toLocaleString()toString: ƒ toString()valueOf: ƒ valueOf()__defineGetter__: ƒ __defineGetter__()__defineSetter__: ƒ __defineSetter__()__lookupGetter__: ƒ __lookupGetter__()__lookupSetter__: ƒ __lookupSetter__()get __proto__: ƒ __proto__()set __proto__: ƒ __proto__()

    Vehicle.prototype.constructor
    ƒ Vehicle(numWheels, price) {
        // this is our constructor for vehicle
        this.numWheels = numWheels;
        this.price = price;
        this.getprice = function () {
            return this.price;
        };
    }

    So, why we need protoytpe 
    We know that when we create object through constructor , if the constructor have any
    function, then that function will also be copied to that object, and that will lead to
    memory westage

    So, to remvoe this delima we use prototype
    we know that and object will refer to prototype of constructor
    so, instead of declaring a method inside constructor we can declare
    it in prototype of that constructor
    So whenever that method is required through that object 
    object can refter to that prototype and perform action


    when ever you need that a property/method should be shared between all
    objects that you should declare it inside prototype
*/

function Vehicle(numWheels, price){  // this is our constructor for vehicle
    this.numWheels = numWheels;
    this.price = price;
    // this.getprice = function(){
    //     return this.price;
    // }
}

Vehicle.prototype.getprice = function(){
    return this.price;
}

var vehicle1 = new Vehicle(2, 50000)
var vehicle2 = new Vehicle(4, 500000)

console.log(vehicle1, vehicle2)
console.log(vehicle1.getprice())
/*
OUTPUT
Vehicle { numWheels: 2, price: 50000 } 
Vehicle { numWheels: 4, price: 500000}
50000

You can see in output that object dont have function but it still works
*/

/*Student={
    "name":"sushant",
    "lname":"kumar"
}
Student.fullname = function(){
    return this.name+" "+this.lname;
}

console.log(Student.fullname())*/