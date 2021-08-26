var progressBars = document.querySelectorAll(".skill-progress > div");
var skillsContainer = document.getElementById('skills-container');
var animationDone = false;



function initialiseBars() {
    for (var bar of progressBars) {
        bar.style.width = 0 + '%';
    }
}

initialiseBars();



function fillBars() {

    for (let bar of progressBars) {
        let currentWidth = 0;
        let interval = setInterval(function () {
            let targetWidth = bar.getAttribute('data-bar-width');
            if (currentWidth >= targetWidth) {
                clearInterval(interval);
                return;
            }
            currentWidth++;
            bar.style.width = currentWidth + '%';
        }, 10);
    }
}



function checkScroll() {

    var coordinates = skillsContainer.getBoundingClientRect();
    //console.log(window.innerHeight,coordinates.top,coordinates.bottom)
    if (!animationDone && coordinates.top <= window.innerHeight) { // this line here means when the skill sction section enter in viewport
        animationDone = true;
        fillBars();
    } else if (coordinates.top > window.innerHeight || coordinates.bottom <= 0) { // if skill section move outside of viewport reinitialize it...
        animationDone = false;
        initialiseBars();
    }

}



window.addEventListener("scroll", checkScroll);

// This event fills the progress bars if they are displayed on the screen when the page is loaded.
//window.addEventListener("load", checkScroll);

var id;
var links = document.querySelectorAll('.nav-menu a')

for(var i=0; i<links.length; i++){
    links[i].addEventListener('click',function(e){
        e.preventDefault();
        
        var targetSectionID = this.textContent.trim().toLowerCase();
        console.log(targetSectionID)
        
        var targetSection = document.getElementById(targetSectionID);
        
        id= setInterval(function(){
            scrollVertically(targetSection)
        },20);
    });
}

function scrollVertically(targetSection){
    var targetSectionCoordinates = targetSection.getBoundingClientRect();
    
    if(targetSectionCoordinates.top <= 20){
        clearInterval(id);
    }
    window.scrollBy(0,50);
}