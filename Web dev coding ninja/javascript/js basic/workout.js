// arr=[1,2,3,4]
// console.log(arr.push(0))
console.log(abc("Hello"));
function abc(x){
    return x+" Hello"
}
console.log(abc("hi"))

function abc(firstName, lastName) 
{​​​​
    function getFullName() 
    {​​​​
        return firstName + " " + lastName;
    }​​​​
 
    alert( "Hello, " + getFullName() );
    alert( "Bye, " + getFullName() );
 
}​​​​
 
abc("ambuj","agarwal");