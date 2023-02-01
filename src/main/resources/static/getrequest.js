$(document).ready(
    function() {

    $('.click').click(function() {
    var inhalt = $(this).text();
        if (inhalt == $(quiz.OptionRight)) {
            alert("Richtig");
            console.log(inhalt)

        } else {

        alert("Falsch")
        console.log(inhalt)
    }
    
    }

    )})