function sayHello(){
    console.log("hello");
}
setTimeout(sayHello,1000);//here time is given in milisecond #1000ms = 1s
//here i am passing function not calling function
// setTimeout will run only once on execution

sec=10;
function printsec(){
    console.log(sec," sec")
    sec--
     
    if (sec==0){
        clearInterval(id)   // here we are using clearInterval to stop setInterval function
                            //to stop setInterval function we need an ID that is provided by setInterval function
    }
}
var id = setInterval(printsec,1000) // the setInterval function will run forever untill you stop it