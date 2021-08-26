// $('p').css("color",'red');
// $('p').css("fontSize",'30px');

$('p').css({
    fontSize:"30px",
    color:"grey"
});

$('div').css({
    width:"100px",
    height:"100px",
    backgroundColor:"cyan"
});

//Event Handling

// $('div').click(function(){
//     alert("Div clicked")
// })


$('div').on('click',function(){
    var element = $(this);
    element.width(element.width()+10+"px");
    //alert("Div clicked")
})

$('a').on('click',function(event){
    event.preventDefault();//stopping default behaviour of anchor tag
    alert("Anchor element clicked")
})

$("input").click( function() {
    $("input:text").val("How are you");
});