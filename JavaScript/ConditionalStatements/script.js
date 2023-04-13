var i = 0;
// for (i = 0; i <= 100; i++)
// {
//     if (i % 2 == 0)
//     {
//         document.write(i + "<br>");
//     }
// }

// while (i <= 100)
// {
//     if (i % 2 == 0)
//     {
//         document.write(i + "<br>");
//     }
//     console.log(i);
//     i++;
// }

var numNumber = 123456789;
var num = numNumber.toString();
var reverseNum = "";
for (i = num.length - 1; i >= 0; i--)
{
    reverseNum += + num[i];
}

document.write("__ datatype string __ <br>")
document.write("num: " + num + "<br>");
document.write("reverseNum: " + reverseNum + "<br>");

num = Number(num);
reverseNum = Number(reverseNum);
document.write("__ datatype Number __ <br>");
document.write("num: " + num + "<br>");
document.write("reverseNum: " + reverseNum + "<br>");
document.write("sum of the two above: " + (num + reverseNum) + "<br>");
