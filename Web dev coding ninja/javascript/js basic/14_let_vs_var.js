//var vs let

// for(var i=1; i<=5; i++){
//     setTimeout(function(){
//         console.log(i)
//     },1000)
// }
/*
    The output of above code is : 6 6 6 6 6
    This is happening because the for loop run very instantly
    and the setTimeout function will run after one second or 1000ms
    Now, here the i is in global scope and can be used anywhere
    so, when one second completes the value of i becomes 6 and it is printed 
    6 times.
    
    To fix this we can change var with let
 */
for(let i=1; i<=5; i++){
    setTimeout(function(){
        console.log(i)
    },1000)
}
/*  
    The output of the above code is: 1 2 3 4 5
    Here when the for loop runs the value of i is different for
    different iterations of for loop
    So, the different value of i is bound to setTimeout function
    or you can say value of i is only available to the block scope
    and on every iteration block scope chnage.

*/

// let and const is only availabel in ES6 version of js