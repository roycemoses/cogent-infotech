import { Injectable } from '@angular/core'

@Injectable({
    providedIn:'root'
})
export class ProductService
{
    constructor() {}
    getData()
    {
        return [
        {'id':'1','title':'Stonecutter','price':400,'stock':100},
        {'id':'2','title':'Hammer','price':1100,'stock':50},
        {'id':'3','title':'Axe','price':700,'stock':25},
        {'id':'4','title':'Furnace','price':1500,'stock':10},
        {'id':'5','title':'Bucket','price':80,'stock':80},
        {'id':'6','title':'Tape','price':50,'stock':220},
        {'id':'7','title':'Pencil','price':10,'stock':550},
        {'id':'8','title':'Nailgun','price':250,'stock':25},
        {'id':'9','title':'Can opener','price':75,'stock':70},
        {'id':'10','title':'Rice cooker','price':250,'stock':90},
        ]
    }
}