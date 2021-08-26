var arr1=[1,2,3,4,5]
var arr2 = new Array(1,2,3,4,5);

console.log(arr1)
console.log(arr2)
console.log(arr1[3])
// console.log(arr1[8]) = undefined
arr1[2]=90
console.log(arr1) //[ 1, 2, 90, 4, 5 ]
arr1[7]=100
console.log(arr1) //[ 1, 2, 90, 4, 5, <2 empty items>, 100 ]
console.log(arr1.length) //8
var arr= new Array(4) // if you pass one element it will be considered as length of array, and more than 1 element will be considred as element of array.
console.log(arr) //[ <4 empty items> ]

/////// hetrogeneous array in javascript

var arr= ["abc", 10, true, 20]
console.log(arr) //[ 'abc', 10, true, 20 ]

// in javascript arrays is not continious in nature
var arr =  new Array(1000);
console.log(arr) //[ <1000 empty items> ]

//function on array

var arr=[4,5,6,7];
console.log(arr.length);
arr.push(10); // element will be added to end;
console.log(arr)
arr.pop(); // element will be popped from end;
console.log(arr)
arr.shift(); //shifting all element to left and left most element will be popped;
console.log(arr)
arr.unshift(8); // shifting all element to right and the right most element will be popped; and the value provided will be added on 0th position.
console.log(arr);
console.log(arr.unshift())
console.log(arr.pop());

/*Splice function on array;
this function is used to add and delete element  from array
the syntax is arr.splice(starting index, deletion count, element to be inserted)
>starting index-- the index from where we want to start
>deletion count -- how many element we want to delete, if you don't provide deletion count it will delete all the elements from starting index.
>
*/
console.log("spice fuction")
arr=[1,2,3,4,5,6]
console.log(arr.splice(1,1));
console.log(arr.splice(1))
console.log(arr)
arr=[1,2,3,4,5]
arr.splice(2,0,10) //here i am inserting 10 at 2nd index
console.log(arr)
arr.splice(2,0,10,20,30);// providing 0 in deleting index nothing will be deleted;
console.log(arr);
arr.splice(2,4,40,50)
console.log(arr)

/*
Iterating over array
*/
console.log("Iterating over array")
var arr=[1,2,3,4,5,6,7]
// for(var i=0;i<=arr.length;i++){
//     console.log(arr[i])
// }

//for each method for iteration
function print(element){
    console.log(element)
}
arr.forEach(print); // forEach method will apply print function print on all the elements of array;