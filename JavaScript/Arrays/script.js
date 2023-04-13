// ARRAY MANIPULATION
var account = ["Savings", 999.99, true];
account[2] = false;
document.write("Account type: " + account[0] + "<br>");
account.push(5.25/100);
document.write("Interest rate: " + account[3]*100 + "%<br>");

// ARRAY CONCATENATION
a = new Array('a', 'b', 'c', 'd', 'e', 'f');
b = new Array('x','y','z');
c = new Array();
c = c.concat(b); // c = {'x', 'y', 'z'}
document.write(c);

document.write("<br><br>");

// ARRAY ITERATION (numbers.length)
var numbers = new Array(10, 20, 30, 40, 50);
for (i = 0; i < numbers.length; i++)
    document.write(numbers[i] + "<br>");

document.write("<br><br>");

// ARRAY NUMERIC SORTING
arr = new Array(55, 32, 23, 73, 4462, 552, 121, 489, 762);
arr.sort(function(a, b){return a - b});
document.write(arr);

document.write("<br><br>")

// ARRAY REVERSAL
arr.reverse();
document.write(arr);

// ARRAY FIND MIN & MAX
var min = arr[0];
var max = arr[0];
for (i = 0; i < numbers.length; i++)
{
    if (arr[i] < min)
        min = arr[i];
    if (arr[i] > max)
        max = arr[i];
}

document.write("<br><br>")

document.writeln("min: " + min);
document.writeln("max: " + max);

document.write("<br><br>")

var animals = new Array("Dog", "Cat");
animals.push("Fox", "Fish")
// Pop off the last element and store it into fish
var fish = animals.pop(); 
// Push more animals to the FRONT of this array
animals.unshift("Bird", "Eagle") 
// Pop off the first element and store into bird (shift == pop_front)
var bird = animals.shift();
// Sort by string, ascending 
animals.sort() 
// Sort by string, descending (apply reversal)
animals.reverse() 
// Join all elements into a string
var all_four = animals.join(", ")
// Starting from index 1, remove 2 elements
animals.splice(1, 2); 
// Join all elements into a string
var all_two = animals.join(", "); 
// Display results
document.write("fish: " + fish + "<br>");
document.write("bird: " + bird + "<br>");
document.write("all_four: " + all_four + "<br>");
document.write("all_two: " + all_two + "<br>");
