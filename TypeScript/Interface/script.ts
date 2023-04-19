interface myProduct 
{
    id:number,
    name:string,
    price:number,
    calculate:(qty:number) => number;
}

let product:myProduct =
{
    id:1,
    name:"Boba",
    price:123.456789,
    calculate(qty:number):number
    {
        return this.price * qty;
    }
}

console.log(product.id + '\n');
console.log(product.name + '\n');
console.log(product.price + '\n');
console.log(product.calculate(10) + '\n');