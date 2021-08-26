class Vehicle{

    constructor(numWheels, price){  // this is how a constructor function looks inside a class
        this.numWheels = numWheels;//these properties will be added to constructor(Vehile)
        this.price = price;
    }

    getPrice(){//this function will be added to prototype of constructor(Vehicle)
        return this.price;
    }

}
/*
    This works as same as prototype and function is not get copied 
    but all object can access that function

    class data type if as of a function but it is not similar as function
    you can say classes are special functions

    you can't call class without 'new' keyword

    ##in classes hoisting does not work

    you can store class in a var as in case of function (class expression)
    var Vehicle = class{
        
    }


*/
var Vehicle1 = new Vehicle(2, 50000)
var Vehicle2 = new Vehicle(4, 500000)

console.log(Vehicle1,Vehicle2)

console.log(Vehicle.prototype == Object.getPrototypeOf(Vehicle1))

console.log(typeof(Vehicle))//function