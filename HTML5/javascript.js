function openMenu(id) {
    menuAnimation(id);
}

function menuAnimation(id) {
    console.log(id);
    var aboutText = document.getElementById("aboutTextId");
    var about = document.getElementById("about");
    
    if (id === 1) {
        aboutText.style.transform = "scale(1.2)";

        //document.getElementById("aboutTextId").innerText = "Hello World!";
        //aboutText.style.zoom = "1.2";

        about.style.opacity = "0.9";
        about.style.padding = "100px";
        
    }
    
    if (id === 2) {

        about.style.opacity = "0.6";
        about.style.padding = "50px";
        aboutText.style.transform = "scale(1.0)";

        //document.getElementById("aboutTextId").innerText = platform;
    }
    
    if (id === 3) {
        aboutText.style.transform = "scale(0.5)";
        //document.getElementById("aboutTextId").innerText = platform;

    }
    
    if (id === 4) {
        aboutText.style.transform = "scale(1.0)";
        //document.getElementById("aboutTextId").innerText = language;

    }      
}

function getLorem() {
    return "Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Sed posuere interdum sem. Quisque ligula eros ullamcorper quis, lacinia quis facilisis sed sapien. Mauris varius diam vitae arcu. Sed arcu lectus auctor vitae, consectetuer et venenatis eget velit. Sed augue orci, lacinia eu tincidunt et eleifend nec lacus. Donec ultricies nisl ut felis, suspendisse potenti. Lorem ipsum ligula ut hendrerit mollis, ipsum erat vehicula risus, eu suscipit sem libero nec erat. Aliquam erat volutpat. Sed congue augue vitae neque. Nulla consectetuer porttitor pede. Fusce purus morbi tortor magna condimentum vel, placerat id blandit sit amet tortor.";

}

function getStats() {
    //console.log("jep");
    var a = navigator.language;
    var b = navigator.appVersion;
    var c = navigator.vendor;
    var d = navigator.platform;
    var e = navigator.userAgent;
    
    document.getElementById("stats1").innerText = a;
    document.getElementById("stats2").innerText = b;
    document.getElementById("stats3").innerText = c;
    document.getElementById("stats4").innerText = d;
    document.getElementById("stats5").innerText = e;

}