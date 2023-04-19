// optional params
function addNumbers(a, b, c) {
    if (c != undefined)
        return a + b + c;
    return a + b;
}
console.log(addNumbers(1, 2, 4) + "\n");
console.log(addNumbers(1, 2));
