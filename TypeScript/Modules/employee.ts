export class Employee {
    empID:number;
    empName:string;
    constructor(id:number, name:string)
    {
        this.empID = id;
        this.empName = name;
    }

    showInfo()
    {
        console.log("id: " + this.empID);
        console.log("name: " + this.empName);
    }

}