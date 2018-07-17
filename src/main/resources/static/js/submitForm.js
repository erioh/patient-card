function submit() {
  var form = {id: null};
  form["firstName"] = $("#firstName").val().trim();
  form["lastName"] = $("#lastName").val().trim();
  form["patronymic"] = $("#patronymic").val().trim();
  form["sex"] = $("input[name=sex]:checked").val().trim();
  form["dateOfBirth"] = $("#dateOfBirth").val().trim();
  var phoneNumber = [];

  $(".phoneNumber").each(function (index, element) {
    phoneNumber.push({id: null, phoneNumber: element.value.trim()})
  });

  form["phoneSet"] = phoneNumber;
  form["email"] = $("#email").val().trim();
  form["address"] = {id: null, text: $("#address").val()}
  // form["debt"] = $("#debt").val().trim();
  var json = JSON.stringify(form);
  $.ajax({
    type: "POST",
    url: "/patient/add",
    data: json,
    dataType: "JSON",
    contentType: "application/json",
    error: function (e) {
      console.log(e)
    },
    success: function (response) {
      var alert = $(".alert");
      alert.addClass(" alert-success alert-dismissible");
      alert.show();
      if (response.body === 'SUCCESS') location.href = '/patient';
    }
  });
}