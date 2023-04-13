class Car
{
    constructor(brand)
    {
        this.brand = brand;
    }

    start()
    {
        console.log(`${this.brand} is ready to go!`);
    }
}

const myHonda = new Car("Honda");
myHonda.start();