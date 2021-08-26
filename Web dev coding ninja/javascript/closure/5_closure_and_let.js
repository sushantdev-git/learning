for(let i=1;i<=5;i++){//let is used to declare scope of i for only one iteration
    setTimeout(function(){
        console.log(i);
    },1000*i); // printing after every ith second
}