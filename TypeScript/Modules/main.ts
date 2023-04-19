import * as Emp from "./employee";
import * as Shape from "./area";
let employee = new Emp.Employee(1, "Royce Moses");

console.log(employee);
console.log(employee.showInfo());

let rectangle:Shape.Rectangle =
{
    calcRectangleArea(length:number, width:number):number
    {
        return length * width;
    }
}

let triangle:Shape.Triangle =
{
    calcTriangleArea(base:number, height:number):number
    {
        return base * height / 2;
    }
}

console.log(rectangle.calcRectangleArea(2, 3));
console.log(triangle.calcTriangleArea(5, 10));