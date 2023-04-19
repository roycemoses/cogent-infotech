import { Component } from '@angular/core';

@Component({
    selector: 'item',
    templateUrl: './item.component.html',
    styleUrls: ['./item.component.css']
})

export class ItemComponent
{
    title:string = 'ngSwitch Examples'
    num:number = 0;

    items: item[] = [{name: 'One', val: 1}, {name: 'Two', val: 2}, {name: 'Three', val: 3}, {name: 'Four', val: 4}];
    selectedValue1: string = 'One';
    selectedValue2: string = 'One';
    selectedValue3: string = 'One';
    selectedValue4: string = 'One';

    days: day[] = [{name: 'Sunday', val: 1}, {name: 'Monday', val: 2}, {name: 'Tuesday', val: 3}, {name: 'Wednesday', val: 4}, 
                    {name: 'Thursday', val: 5}, {name: 'Friday', val: 6}, {name: 'Saturday', val: 7}]

}

class item {
    name!:string;
    val!:number;
}

class day {
    name!:string;
    val!:number;
}