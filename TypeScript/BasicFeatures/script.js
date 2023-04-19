function foo() {
    if (true) {
        var localVar = 1000;
        console.log(localVar);
    }
    console.log(localVar);
    function nested() {
        console.log(localVar);
    }
}
