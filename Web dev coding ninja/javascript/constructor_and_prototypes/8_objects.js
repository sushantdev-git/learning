/*
Objects are instances of class
instance means example
apple in an example of fruit (apple is object and fruit is class)

all the object in js is refered to "Object" prototype
ex if we create vehile1 through a constructor Vehicle
so it should refer to Vehicle prototype but vehicle1 will also
refer to "Object" prototype in heiarchial fashion

 #heiarchy of an object is like
 #object -> object.prototype -> Object
 //every object in js in children of Object(Object is a constructor which is used to create object)

the way to create an object in js is
obj={} or,
obj = new Object()  this is the way a constructor is called


if a property is inherited then hasOwnProperty function will show true;

 */


function Vehicle(numWheels, price){  // this is our constructor for vehicle
    this.numWheels = numWheels;
    this.price = price;
}

Vehicle.prototype.getprice = function(){
    return this.price;
}

Object.prototype.color="green"; // i have added property 'color to main parent object prototype 
// this means every object in js from now have property color

var vehicle1 = new Vehicle(2, 50000)
var vehicle2 = new Vehicle(4, 500000)

console.log(vehicle1.color) // green

console.log(Object.prototype == Vehicle.prototype)//false

/*
    object is data type in js
    Object is constructor function in js used to create data type of object
 */

obj={}
console.log(typeof(obj))//object
console.log(Object())