// console.log((function(x, f = () => x) {
//     var x;
//     var y = x;
//     x = 2;
//     return [x, y, f()];
// })(1));


// function makeCounter() {
//     let count = 0;
//     return function() {
//       return count++;
//     };
//   }
//   let counter1 = makeCounter();
//   let counter2 = makeCounter();
//   console.log( counter1() ); 
//   console.log( counter1() ); 
//   console.log( counter2() ); 

// function makeArmy() {
//     let shooters = [];
//     let i = 0;
//     while (i < 10) {
//       let shooter = function() {
//         console.log( i ); 
//       };
//       shooters.push(shooter);
//       i++;
//     }
//     console.log(shooters)
//     return shooters;
//   }
//   let army = makeArmy();
//   army[0]();
//   army[5]();


// var Sequence = (function sequenceIIFE() {
//   var current = 0;
//   return {
//       getCurrentValue: function() {
//           return current;
//       },  
//       getNextValue: function() {
//           current = current + 1;
//           return current;
//       }
//  };
// }());
// console.log(Sequence.getNextValue());
// console.log(Sequence.getNextValue());
// console.log(Sequence.getCurrentValue());


// let People = function(person, age) { 
//   this.person = person; 
//   this.age = age; 
//   this.info = function() { 
//       console.log(this);  
//      setTimeout(() => {  
//       console.log(this.person + " is " + this.age + " years old"); 
//      }, 3000); 
//   } 
// }  
// let person1 = new People('John', 21); 
// person1.info();

var arguments = [1, 2, 3];
var arr = () => arguments[2];
arr();
function foo(n) {
  var f = () => arguments[0] + n; 
  return f();
}
console.log(foo(3));   