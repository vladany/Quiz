 
 function level2() {
  $.ajax({
    url: "http://localhost:9596/quiz1",
    method: "GET",
    dataType: "json",
    success: function (data) {


      var question = $("#question");
      var option1 = $("#option1")
      var option2 = $("#option2")
      var option3 = $("#option3");
      var option4 = $("#option4");

      $(data).each(function (index, element) {

        question.empty();
        question.append(element.quizText);

        option1.empty();
        option1.append(element.optionElse3);

        option2.empty();
        option2.append(element.optionRight);

        option3.empty();
        option3.append(element.optionElse1);

        option4.empty();
        option4.append(element.optionElse2);

      });
    }
  });
}

$(document).ready(

  function () {
    $('.click').click(function () {
      var inhalt = $(this).text();
      var requestUrl = "http://localhost:9596/check?name=" + inhalt
      $.ajax({
        url: requestUrl,
        type: 'GET',
        success: function (result) {
          if (result == "Korrekt") {
            console.log(result + "Success");
            
            level2();
            
            // GET NEW QUSTION

          } else {
            console.log("That's the end.");
            var failure = $("#failure");
            var question = $("#question");
            var option1 = $("#option1")
            var option2 = $("#option2")
            var option3 = $("#option3");
            var option4 = $("#option4");

            question.remove();
            option1.remove();
            option2.remove();
            option3.remove();
            option4.remove();

            failure.append("YOU LOOSE !!")
          }
        }
      })
    }
    )
  }

)
