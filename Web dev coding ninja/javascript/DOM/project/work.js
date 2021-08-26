// const text = 'abcdef'
// const editedText = text.slice(0, -1)
// console.log(editedText)
var st='12+6*2'
var x="",y="",se="";
var operation="";
function add(a,b){
    a=parseInt(a);
    b=parseInt(b);
    console.log(a,b)
    return a+b
}

function multiply(a,b){
    a=parseInt(a);
    b=parseInt(b);
    console.log(a,b)
    return a*b
}
function calculate(st){
    console.log(st)
    var operation="";
    var x="",y;
    if (st.length == 0){
        return x;
    }
    for(var i=0;i<st.length;i++){
        // console.log(i,st[i])
        var xx=Number(st[i])
        // console.log(xx)
        if(isNaN(xx)){
            operation=st[i];
            se=st.slice(i+1,st.length)
            y=calculate(se)
            break;
        }
        else{
            x+=st[i];
        }
    }
    if (operation == '+'){
        return add(x,y)
    }
    if(operation == '*'){

        return multiply(x*y)
    }
    console.log(x,y,operation)
    return x;
}
console.log(calculate(st))
