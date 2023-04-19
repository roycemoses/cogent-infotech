class Person
{
    firstName:string=""
    lastName:string=""

    constructor (firstName:string, lastName:string)
    {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    getName():string {
        return this.firstName + " " + this.lastName;
    }
}

// let person1 = new Person();
// person1.firstName = "Royce";
// person1.lastName = "Moses";
// console.log(person1);

let person1 = new Person("Royce", "Moses");
console.log(person1);
console.log(person1.getName());

class Employee extends Person
{
    designation:string = ""
}

let employee = new Employee("ABC", "XYZ");
employee.designation = "Los Angeles";
console.log(employee);
console.log(employee.getName());