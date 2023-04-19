import { ItemEntity } from "./item.entity";
import { Component } from "@angular/core"

@Component({
    selector:'itemlist',
    templateUrl:'./itemlist.html'
})
export class ItemListComponent
{
    public items:Array<ItemEntity>;
    constructor()
    {
        var item1:ItemEntity = new ItemEntity("1001", "T-Shirt");
        var item2:ItemEntity = new ItemEntity("1002", "Pants");
        var item3:ItemEntity = new ItemEntity("1003", "Tie");
        var item4:ItemEntity = new ItemEntity("1004", "Shoes");
        var item5:ItemEntity = new ItemEntity("1005", "Hat");
        this.items = [item1, item2, item3, item4, item5];
    }
}