let direction;
let filter;

$(document).ready(function () {

});

getBodies();

function getBodies() {
    jQuery.ajax({
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        'type': 'GET',
        'url': '../api/body/get',
        'dataType': 'json', // lo que se recibe 
        'success': showBodies
    });
}

function showBodies(response) {
    if (response.success) {
        var list = response.response;
        var string = "";
        var n;
        for (var i in list) {
            if (i == 0) {
                n = 1;
                string += '<div class="row" id="row' + n + '">';
            }
            string += '<div class="option" onclick="' + "avatar('Monster" + ', 1)>' +
            '<img class="imgOption" id="option1"' +  'src="Monsters/Monster 1.png" alt="Monster 1" onError = "notExistImage(1)">' +
          '</div>';
            if(i % 5 == 0) {
                n++;
                string += '</div><div class="row" id="row' + n + '">';
            }
        }
        string += "</div>";
        console.log(string);
        
    }
}

function avatar(type, num) {
  direction = source(type, num);
  var element = document.getElementById("Avatar");
  element.removeAttribute('class');
  element.src = direction;
}

function source(type, num) {
  return `${type}s/${type} ${num}.png`;
}

function changeColor(color) {
  let element = document.getElementById("Avatar");
  element.removeAttribute('class');
  element.classList.add(color);
}

function previous() {
  alert("PREVIOUS");
}

function next(thing) {
  let options = document.getElementsByClassName("option");
  let imgOptions = document.getElementsByClassName("imgOption");
  for (var i = 0; i < options.length; ++i) {
    var itemOption = options[i];
    var itemImg = imgOptions[i];
    itemOption.setAttribute("onClick", `mouth('${thing}', ${i + 1})`);
    itemImg.setAttribute("src", `${thing}s/${thing} ${i + 1}.png`);
    itemImg.setAttribute("alt", `${thing} ${i + 1}`);
  }
  hideColors();
}

function notExistImage(num) {
  document.getElementById("option" + num).parentNode.style.display = "none";
}

function mouth(type, num) {
  existElementById(type);
  direction = source(type, num);
  var tag = document.createElement("img");
  document.getElementById("AvatarContainer").innerHTML += `<img id="${type}" src="${type}s/${type} ${num}.png" alt="${type} ${num}">`;
}

function existElementById(type) {
  var idElement = document.getElementById(type);
  if(idElement){
      idElement.remove();
  }
}

function hideColors() {
  let colorList = document.getElementsByClassName("color");
  for (var i = 0; i < colorList.length; ++i) {
    colorList[i].style.display = "none";
  }
}

function displayColors() {
  let colorList = document.getElementsByClassName("color");
  for (var i = 0; i < colorList.length; ++i) {
    colorList[i].style.display = "flex";
  }
}
