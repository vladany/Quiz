$(document).ready(

  function x() {

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

 
  
  )