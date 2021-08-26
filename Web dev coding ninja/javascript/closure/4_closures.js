var i=10;

function outer(){
    var j=20;
    console.log(i,j)
    var inner = function(){
        var k =30;
        console.log(j,k)
    }
    return inner;
}
var inner = outer();
inner();
/*
    What do you think will be the output of above code,
    Now , lets dig deeper
    At first the outer function is called and and executed
    it print 10 20

    Now the inner function is returned
    After retruning it is stroed in var inner which is present in global socpe
    and, then the inner function is executed,

    if we run the same code in c++ or java we get an error because

    the lexical scope of inner function is inside outer function 
    and when outer function completes everything inside it will be destroyed

    but when we run inner function it runs and knows what is the value of j
    this means it store it somewhere and this concept is known as closure.

    the inner function have access to scope of outer function
    that why it knows what is the value of j

    variable created in scope of outer function is not destroyed
    only in case if a function inside a function is used outside that function
 */

var i=10;

function outer(){
    var j=20;
    var inner = function(){
        var k =30;
        console.log(i,j,k)
        i++;
        j++;
        k++;
    }
    return inner;
}
var inner = outer();
inner();
inner();
inner();
/*
    The solution of above code is
    10 20 30
    11 21 30
    12 22 30

    this is happened because the scope of outer and global is 
    same everytime when so the updated value stays there

    but in case of inner the scope is created and destroyed,
    so the value created updated and destroyed;
 */

var i=10;

function outer(){
    var j=20;
    var inner = function(){
        var k =30;
        console.log(i,j,k)
        i++;
        j++;
        k++;
    }
    return inner;
}
var inner = outer(); // outer scope created 
inner();
inner = outer(); // new outer scope created , and inner will refer to new outer scope,
inner();
//hence value of j appears to be remian same