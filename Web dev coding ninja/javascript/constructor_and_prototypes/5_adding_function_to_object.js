/*
    In languages like c++ and java we can add methods/function to class or constructor
    In c++ or java when an object is created then it have seprate variables
    but if that constructor contian a function then that function is not copied to object,
    (rahter whenever that function is needed that can be loaded from memory)
    because that function is performing the same task so copying it will be a waste of memory.

    But in js, if we create an object through a constructor and the constructor 
    contain a function then it will be copied to every object that is created through
    that constructor.
    So, there is a huge memory waste in creating object through constructor in js.

    
    
    #we can add methods to objects singularly or vai constructor(which would be much easier)



*/

function Vehicle(numWheels, price){  // this is our constructor for vehicle
    this.numWheels = numWheels;
    this.price = price;
    this.getprice = function(){
        return this.price;
    }
}

var vehicle1 = new Vehicle(2, 50000)
var vehicle2 = new Vehicle(4, 500000)

console.log(vehicle1.getprice())