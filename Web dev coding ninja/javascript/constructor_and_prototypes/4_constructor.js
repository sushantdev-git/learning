function Student(name,rollNo, marks){
    this.name = name;
    this.rollNo = rollNo;
    this.marks = marks;
}

var student1 = new Student("sushnat", 10 ,100)
var student2 = new Student("Rahul", 30, 100)
/*
    Here 'Student' function is working as a constunctor

    when you call a function as constructor, you don't have to create a object inside function and return it
    a constructor is called with "new" keyword
    ex: var arr = new Array();

    when i call the constructor "Student" an object is created and that object call the function Student
    in construtor we initialize a porperty with a "this" keyword, because we don't know what is the object name
    ex: this.name = name
        student.name = name

    the constructor will return an object that will be stored in a variable thorugh which we are calling it.
 */

console.log(student1,student2)