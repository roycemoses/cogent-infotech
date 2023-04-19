import { Component, Output, EventEmitter } from "@angular/core";

@Component({
    selector:'deposit',
    templateUrl: './deposit.component.html'
})

export class DepositComponent
{

    @Output()
    depositEventEmitter = new EventEmitter();
    balance = 0;
    deposit(amount:number) {
        this.balance += amount;
        this.depositEventEmitter.emit(this.balance);
    }


}