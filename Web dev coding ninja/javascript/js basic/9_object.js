//javascript is a object oriented programming language

var student = {}; //empty object
console.log(typeof(student))

student ={
    name:"abc",
    rollNo:135,
    marks:90
};
//objects are like key values pairs #ex be dict in python
//here, keys and value is property of student class
//keys are strings
console.log(student)
console.log(student.marks)// acessing marks from student object
student.marks=100 //updating value of a key
console.log(student)
// if you want to assign a key and its value then
student.sem=4  //adding semester of student
console.log(student.sem)
// if you access a key that is not in student object (like student.gf) then it will not throw an 
// error and it will show it's value is undefined, but gf keyword will not be added in student object with undefined value




/*Square Bracket Notation */
console.log("Square Bracket Notation");
// var obj = {};
// var obj = new Object(); //creating object like this

//acessing property in a different way like dict in pyhton
console.log(student["marks"]); //and the key must be in string not simply written


//printing property, preffer squre bracket for accessing value of a key
function printProperty(obj,prop){
    console.log(obj[prop]);
}
printProperty(student,"marks")



/*Deleting Propety from an object*/
console.log("Deleting element from object")
delete student["marks"]
console.log(student)






/*How objects are stored */
console.log("How objects are stored")
var obj = {
    "p1":10,
}
//here keys and value are stored in memory and the variable obj is pointing to that memory location
//now if i create another variable and and assingn obj to that variable then
//the new variable will be pointing to the same memory location.
var obj2 = obj;
console.log(obj2)
obj2.p1=200
console.log(obj)//{ p1: 200 }
console.log(obj===obj2)//true
// now, if i create two differernt object with same key and value pair, then their memory location will not be same.





/*Iteration over object*/
console.log("Iteration over object")
for(var prop in student){
    console.log(prop, student[prop]);
}


console.log("Printing keys of object")
var keys = Object.keys(student)
console.log(keys)

var keys = Object.getOwnPropertyNames(student);
console.log(keys)