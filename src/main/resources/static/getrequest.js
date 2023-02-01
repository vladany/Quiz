$(document).ready(
//    function() {
//
//    $('.click').click(function() {
//    var inhalt = $(this).text();
//
//
//        if (inhalt == "China") {
//            alert("Richtig");
//            console.log(inhalt)
//
//        } else {
//
//        alert("Falsch")
//        console.log(inhalt)
//        }
//
//    })
//    }
    function (){
      $('.click').click(function() {
        var inhalt = $(this).text();
        var requestUrl = "http://localhost:9596/check?name=" + inhalt
        $.ajax({
            url: requestUrl,
            type: 'GET',
            success: function(result){
                alert(result);
            }
        })
      }
    )}


)