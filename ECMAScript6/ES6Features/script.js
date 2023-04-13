// New features in ES6

// let KEYWORD scope example
let nbr = 42;
{
    let nbr=1000;
    document.write(nbr + "<br>"); // outputs 1000
}
document.write(nbr); // outputs 42

document.write("<br><br>");


// const KEYWORD error example
const a = 100;
// a = 200; // error

document.write("<br><br>");


// let KEYWORD on array
let arr=[];
for (let i = 0; i < 2; i++)
{
    arr.push(function(){return i});
}
let value = arr[1]()
document.write(value);

document.write("<br><br>");


// arrow function example (lambda functions)
let getNumber=()=>42;
document.write(typeof getNumber + "<br>");
document.write(getNumber() + "<br>")

document.write("<br><br>");


// arrow function example 2
let getPrice=(quantity, tax)=>(quantity * 5) * (1 + tax);
document.write(getPrice(2, 0.95) + "<br>");
const gl = (message) => document.write(message + "<br>");
gl("Royce");

document.write("<br><br>");


// default params test
let getTwoSum = function (a = 1, b = 41) { // if no params are passed, the default values will be used (1 and 41 respectively)
    document.write((a + b) + "<br>");
}
getTwoSum();               // 42
getTwoSum(1, 2);           // 3
getTwoSum(10);             // 51
getTwoSum(null, 6);        // 6 
getTwoSum(undefined, 6);   // 7

document.write("<br><br>");


// default params test 2 (using strings)
let getName = function (firstName = "John", lastName = "Doe") { // if no params are passed, the default values will be used (1 and 41 respectively)
    document.write((firstName + " " + lastName) + "<br>");

}
getName();       // John Doe
getName("Jane"); // Jane Doe

document.write("<br><br>");


// collection parameter example
let showCollections = function(id, ...collection)
{
    document.write("collection: " + collection + "<br>");
    document.write("collection.length: " + collection.length);
}
showCollections(41, "movies", "music");

document.write("<br><br>");


// array copy
let values = [100, 300, 400];
let newSet = [100, ...values, 500];
document.write(newSet);

document.write("<br><br>");


// object instantiation
let price = 5.20, quantity = 20;
let invoiceData = {
    price:price,
    quantity:quantity
}
document.write(invoiceData.price + "<br>" + invoiceData.quantity);

document.write("<br><br>");


// template literal
let user = "Koko";
document.write(`Hi ${user}!`);
let name = "Royce";
document.write("<br> name: " + name); // use template literal, this way is deprecated

document.write("<br><br>");

