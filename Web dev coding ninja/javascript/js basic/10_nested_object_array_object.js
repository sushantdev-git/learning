var student={
    "name":"Sushant",
    rollNo:21,
    marks:100,
    address:{
        city:'Chandigarh',  //nesting object
        pincode:160047,
    }
};
console.log(student)
//console.log(student.address.city)
console.log(student["address"]["city"])

/* Objects and array*/
// the array is same as an object
// the index of array is key and element is value
var arr=[20,30,40,50];
console.log(arr[0]);
console.log(arr["0"]) // here i am acessing 0th key of an array, and here the index i have passed is a
// number but the key should always be a string, this works because js automatically do type conversion 
// and change no to string and access the value using key

var obj={
    '0':20,
    '1':40,
    '2':60,
    '3':80,
}   //here obj is same as the arr defined above
// but array have some additional property like length, length work on arr but not on object
arr[6]="abb"
console.log(arr)  //[ 20, 30, 40, 50, <2 empty items>, 'abb' ] #here length is automatically adjusted, even if you add element that is 
// leaving some gap between last index and index you providing. But those element in between will be undefined.

//You can also add key and value to the array like:-
arr.popr1="demo"
console.log(arr) //[ 20, 30, 40, 50, <2 empty items>, 'abb', popr1: 'demo' ]
console.log(arr.length) //7 ,  but the length remain same 
arr[10]="dd"
console.log(arr)  //[20,30,40,50,<2 empty items>,'abb',<3 empty items>,'dd',popr1: 'demo']
console.log(arr.length) //11

//we can iterate over obj arr

for(var i in arr){
    console.log(i)
}
/*
0
1
2
3
6
10
popr1
 */