import { Component } from "@angular/core";

@Component({
    selector:'account',
    templateUrl:'./account.component.html'
})

export class AccountComponent
{
    displayBalance(balance:any)
    {
        console.log(balance);
    }
}