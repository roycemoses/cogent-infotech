var global = "Global Variable!";
function scopeTest()
{
    var local = "Local Variable!";
    document.write("global: " + global + "<br>");
    document.write("local: " + local + "<br>");
}
scopeTest();
document.write("local (doesn't work!): " + local + "<br>")
