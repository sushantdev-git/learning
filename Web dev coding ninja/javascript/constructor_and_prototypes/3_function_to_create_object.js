function create_student(name, rollNO, marks){
    //this function will create a student object and it return it
    var student={}; //new Object();
    student.name=name;
    student.rollNO=rollNO;
    student.marks=marks;

    return student;
}

var student1 = create_student("sushant", 10, 100) // here we call function and store a student object in variabel created
var student2 = create_student("abcd" , 20, 100)

console.log(student1,student2)