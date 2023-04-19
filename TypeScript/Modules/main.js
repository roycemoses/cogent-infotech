"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var Emp = require("./employee");
var employee = new Emp.Employee(1, "Royce Moses");
console.log(employee);
console.log(employee.showInfo());
var rectangle = {
    calcRectangleArea: function (length, width) {
        return length * width;
    }
};
var triangle = {
    calcTriangleArea: function (base, height) {
        return base * height / 2;
    }
};
console.log(rectangle.calcRectangleArea(2, 3));
console.log(triangle.calcTriangleArea(5, 10));
