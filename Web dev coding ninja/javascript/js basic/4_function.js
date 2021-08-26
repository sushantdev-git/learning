//function in javascript

//alert function
function showAlert(msg){ // here msg in parameter
    // alert('"hey!"');  //for showing alert on wep page
    alert(msg);
}
var msg="hello!"
//showAlert(msg);   //msg in an argument


//sum function
function sum(a,b){
    //console.log(a+b)
    return a+b
}

//var result=sum(4,6) //here if you pass one argument then a get 4, and b will be 'undefined' and result will be NaN
//console.log(result) // and you pass three argument first two will be added and third will be ignored


//#function Hoisting
hoistDemo(); // here i am calling function before declaring it, but it will work becuase js automatically move the 'hoistDemo' function above it
                // but if you call a function that is not in there, then it will throw an error

function hoistDemo(){
    console.log(i)  // if the used variable(i) is not defined in the function scope then js throw an error, but if var i is in function scope
                    // but not declared till it's use then js will create a var i and its value will be undefined.
                    // this process is called "Variable Hoisting"
    var i=10;
}
//hoistDemo()

//Declaration mean creating a new varible, function etc;
//Initializing mean givig a value to the variable;
