var product = {
    id: 1,
    name: "Boba",
    price: 123.456789,
    calculate: function (qty) {
        return this.price * qty;
    }
};
console.log(product.id + '\n');
console.log(product.name + '\n');
console.log(product.price + '\n');
console.log(product.calculate(10) + '\n');
