$(document).ready(

function (){
  $('.click').click(function() {
    var inhalt = $(this).text();
    var requestUrl = "http://localhost:9596/check?name=" + inhalt
    $.ajax({
        url: requestUrl,
        type: 'GET',
        success: function(result){
          if (result == "Korrekt") {
            console.log(result + "Success");
            // GET NEW QUSTION
          } else {
            console.log("That's the end.");
          }
        }
    })
  }
)}

)