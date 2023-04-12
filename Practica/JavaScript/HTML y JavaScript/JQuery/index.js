$(() => {
  $(".hide").mouseenter(() => {
    $(".hide").css({ "border-radius": "10px" });
  });

  $(".hide").click(() => {
    $("h1").fadeOut("slow");
  });

  $(".show").click(() => {
    $("h1").fadeIn("slow");
  });

  $(".el-1").click(() => {
    $("h1").css({ color: "red" });
  });

  $(".el-2").click(() => {
    $("h1").css({ color: "green" });
  });

  $(".el-3").click(() => {
    $("h1").css({ color: "black" });
  });
});
