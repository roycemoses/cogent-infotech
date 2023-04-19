"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Employee = void 0;
var Employee = /** @class */ (function () {
    function Employee(id, name) {
        this.empID = id;
        this.empName = name;
    }
    Employee.prototype.showInfo = function () {
        console.log("id: " + this.empID);
        console.log("name: " + this.empName);
    };
    return Employee;
}());
exports.Employee = Employee;
