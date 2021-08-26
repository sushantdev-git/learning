// function User(name) {
//     this.isAdmin = false;
//   }
//   var user = new User("James");
//   console.log(user);


// function Person(age) {
//   this.age = age;
//   }
//   var p1 = new Person(9);
//   console.log(Person.hasOwnProperty("length"));
//   // property like "name", "length" automatically get inherited 
//   // by object, read more about it


// class Dog{
//   constructor(name,age,color){
//     this.name = name;
//     this.age = age;
//     this.color = color;
//   }

//   info(){
//     console.log(this.name, this.age+"years", this.color)
//   }
// }

// var Bruno = new Dog("Bruno", 5, "Brown")
// console.log(Bruno.info())

bike();
function bike(){
 console.log(this.name);
}
var name="abc";

addEventListener