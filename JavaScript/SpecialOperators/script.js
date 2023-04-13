var iResult = 10;
var result = (iResult <= 20) ? true : false; // is iResult less than 20? true : false
document.write("Result: " + result + "<br>");
document.write("typeof iResult: " + typeof iResult + "<br>");

person = new Object();
person.firstName = "Royce"
person.lastName = "Moses"
person.age = 22
person.address = "Rosemead"

with (person)
{
    document.write(firstName);
    document.write(lastName);
    document.write(age);
    document.write(address);
}