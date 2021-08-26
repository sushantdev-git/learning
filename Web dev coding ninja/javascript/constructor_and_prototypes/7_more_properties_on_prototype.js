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

Vehicle.prototype.color="black";

var vehicle1 = new Vehicle(2, 50000)
var vehicle2 = new Vehicle(4, 500000)

//vehicle1.__proto__ == Vehicle.prototype
//__proto__ is known as dunder proto

//console.log(vehicle1, vehicle2)
//console.log(vehicle1.getprice())

console.log(Object.getPrototypeOf(vehicle1))
console.log(Object.getPrototypeOf(vehicle1) === Vehicle.prototype)
// this means both we can reach to same prototype

console.log(Vehicle.prototype.isPrototypeOf(vehicle1))
//checking vehicle1 and Vehicle have same prototype

console.log(vehicle1.hasOwnProperty('price'));
// this means vehicle1 has own property named "price"

console.log(vehicle1.hasOwnProperty('getprice'))
//vechicel1 don't have property name 'getprice'

console.log(vehicle1.color)

vehicle1.color = "white" // here i am adding property in vehicle 1 
// not in its prototype

console.log(vehicle1, Vehicle.prototype)

//constructor by default have property name and length
//name will be name of constructor