function fetchRndomDogImage(){

    // $.ajax({
    //     url:"https://dog.ceo/api/breeds/image/random",
    //     method: 'get',
    //     success: function(data){
    //         var imageUrl = data.message;
    //         $('#dog_image').attr('src',imageUrl)
    //     }
    // }).fail(function(){
    //    console.log("error")
    // });

    $.get('https://dog.ceo/api/breeds/image/random',function(data){
        var imageUrl = data.message;
        $('#dog_image').attr('src',imageUrl)
    }).fail(function(xhr,textStatus, errorThrown){
        console.log('error') // this is as try and except in python
    });

}

$("#fetch_dog_image_button").click(fetchRndomDogImage);