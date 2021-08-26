class Vehicle{

    constructor(numWheels, price){  
        this.numWheels = numWheels;
        this.price = price;
    }

    getPrice(){
        return this.price;
    }

    printdescription(){
        console.log("Vehicle", this.numWheels, this.price)
    }
}

class Car extends Vehicle{ // class car is going to extend property from vehicle
    constructor(numWheels,price,numDoor){
        super(numWheels, price); // if this class is an extension of some class then first 
        //you have to pass the value for the parent class using function super();
        this.numDoor = numDoor;
    }
    //object created through this class have access to methods defined in parent class

    printDescription(){
        this.printdescription();// acessing parent method
        //you can also use this instead of super;
        //only if you don't have a function name as same in super class
        console.log('Car Door',this.numDoor)
    }
}

var c = new Car(4, 500000, 4)

c.printDescription();