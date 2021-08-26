function fetchRandomDogImage(){
    var xhrRequest =new XMLHttpRequest();//This function is used to request

    xhrRequest.onload = function(){
        
        console.log(xhrRequest.response);//printing the response
        var responseJSON = JSON.parse(xhrRequest.response);//converting response string to json
        var imageUrl = responseJSON.message;//fetching image url from json
        $('#dog_image').attr('src',imageUrl)//setting image in html

        //to convert json to string you can use JSON.stringify()
    };
    xhrRequest.onerror = function(){
        console.log("REquest failed")// this to hadle if request is failed
    }
    xhrRequest.open('get' , 'https://dog.ceo/api/breeds/image/random')
    //with (.open) you can initialize the request
    //in open you can pass method of request "get" and address of request
    // and third argument for "true" or "false" for "asynchronous" or "synchronous"

    xhrRequest.send();

}

$("#fetch_dog_image_button").click(fetchRandomDogImage);