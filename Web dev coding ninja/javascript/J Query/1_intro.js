//this is how do in simple js
// var para1 = document.querySelector('#para1')
// para1.innerHTML="welcome"


//now write it in j query

$('#para1').html('Welcome');

//what is going on

/*
    function $(query){
        return document.querySelector(query);
        //the $ don't actually return dom object
        //it return jquery object
    }
*/

//$('#para1').hide();

var para = $('p')
para.html("Welcome")

var p1 = para.eq(0)
p1.html("Hello")

//in jquery a function return j query object
//you can check in scratch js
// don't use tag name as variable
