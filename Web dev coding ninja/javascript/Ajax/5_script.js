function fetchNasaImage(){
    var date = $('#img_date').val();
    console.log(date);
    if(date==""){
        alert("Choose a date")
    }else{
        function displayImage(data){
            let div =document.createElement('div');
            $(div).attr("class",'show')
            $('<h3> Image of Day | Date: '+date+'</h3>').appendTo($(div));
            $('<img>', {
                src:data.url
            }).appendTo($(div));
            $('<p class="info"><i>'+data.explanation+'</i></p>').appendTo($(div));
            $(div).prependTo($('#show_image'))
        }
    
        $.ajax({
            url:'https://api.nasa.gov/planetary/apod',
            method:'get',
            success: displayImage,
            data:{
                //you can pass query to api in data object
                api_key: "WhcIhVTzLDnbrnb2sfggMI4Vnw2sELPVOB7VQHNv",
                date: date,
            }
        }).fail(function(){
            alert("404: Image not Found")
        });
    }
    
}


$('#fetch_image').click(fetchNasaImage)