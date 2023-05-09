import { Component } from "@angular/core";
import { FormBuilder } from "@angular/forms";

@Component({
    selector:'item',
    templateUrl:'./item.component.html'
})
export class ItemComponent 
{

    checkoutForm = this.formBuilder.group({
        itemName: '',
        itemPrice: '',
        itemDescription: '',
        itemImageURL: '',
        itemBrandName: ''
    });

    onSubmit(currentFormItemToEdit:any): void {
        currentFormItemToEdit.itemName = this.checkoutForm.controls['itemName'].value;
        currentFormItemToEdit.itemPrice = this.checkoutForm.controls['itemPrice'].value;
        currentFormItemToEdit.itemDescription = this.checkoutForm.controls['itemDescription'].value;
        currentFormItemToEdit.itemImageURL = this.checkoutForm.controls['itemImageURL'].value;
        currentFormItemToEdit.itemBrandName = this.checkoutForm.controls['itemBrandName'].value;
        const form = document.getElementById('Form');
        if (form != null)
        {
            form.style.display = "none"
        }
        this.checkoutForm.reset();
    }

    constructor (
        private formBuilder: FormBuilder,
    ) {}

    currentFormItemToEdit:any = Object;
    itemList:Array<any> = [
        {
            itemNo: 4001,
            itemName: "ASUS TUF Gaming NVIDIA GeForce RTX 3060 V2 OC Edition Graphics Card (PCIe 4.0, 12GB GDDR6, HDMI 2.1, DisplayPort 1.4a, Dual Ball Fan Bearings, Military-Grade Certification, GPU Tweak II)",
            itemPrice: 409.99,
            itemDescription: "NVIDIA Ampere Streaming Multiprocessors: The building blocks for the world’s fastest, most efficient GPU, the all-new Ampere SM brings 2X the FP32 throughput and improved power efficiency.",
            itemImageURL: "assets/diagram.png",
            itemBrandName: "NVIDIA"

        },
        {
            itemNo : 4002,
            itemName : "AKAI Professional MPK Mini MK3",
            itemPrice : 99.99,
            itemDescription : "Music Production and Beat Maker Essential – USB powered MIDI controller with 25 mini MIDI keyboard velocity-sensitive keys for studio production, virtual synthesizer control and beat production",
            itemImageURL : "https://t3.gstatic.com/images?q=tbn:ANd9GcSmHq-m-f1OPxuQBAsjfPDf7h0h_9K7ZBcU4VwX9vVfSfawDEdy",
            itemBrandName : "AKAI"
        },
        {
            itemNo : 4003,
            itemName : "Xbox Core Wireless Controller – Shock Blue",
            itemPrice : 49.99,
            itemDescription : "Experience the modernized design of the Xbox Wireless Controller in Shock Blue, featuring sculpted surfaces and refined geometry for enhanced comfort and effortless control during gameplay with battery usage up to 40 hours.",
            itemImageURL : "https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcQSh0zRdF4cE7GMQyf6YGcazM6JbYJlGWiy8tacO3tX7tPyPnWJ",
            itemBrandName : "Microsoft"
        },
        {
            itemNo : 4004,
            itemName : "ATERCEL Workout Gloves for Men and Women, Exercise Gloves for Weight Lifting, Cycling, Gym, Training, Breathable and Snug fit",
            itemPrice : 13.95,
            itemDescription : "Innovative Palm Design Maximizes Your Grip: We researched how hundreds of people use workout gloves to enhance our ergonomic design, leverage the muscle direction and placement and optimize grip functionality all to bring you a better glove. The result protects your hands from calluses, reduces friction discomfort all while still maintaining a strong grip on what you are holding onto.",
            itemImageURL : "https://m.media-amazon.com/images/I/71ssIG3SZ1L._AC_UL400_.jpg",
            itemBrandName : "ATERCEL"
        },
        {
            itemNo : 4005,
            itemName : "Logitech Mouse Pad - Studio Series, Computer Mouse Mat with Anti-Slip Rubber Base, Easy Gliding, Spill-Resistant Surface, Durable Materials, Portable, in a Fresh Modern Design, Graphite",
            itemPrice : 5.55,
            itemDescription : "Move and glide effortlessly: The Studio Series mouse pad features a smooth, comfortable cloth surface with a fine weave for effortless, silent gliding on any surface whether in the office or at home",
            itemImageURL : "https://m.media-amazon.com/images/I/81WQsjtppYL._AC_UL400_.jpg",
            itemBrandName : "Logitech"
        }
    ]

    message()
    {
        alert("Hi! This is an item component message!");
    }

    edit(itemNo:number)
    {
        const form = document.getElementById('Form');
        // alert("You just clicked on item #" + itemNo);
        if (form != null)
            form.style.display = "block";

        const index = this.itemList.findIndex(item => item.itemNo == itemNo);
        this.currentFormItemToEdit = this.itemList[index];
        console.log(this.currentFormItemToEdit.itemNo);
    }

    delete(itemNo:number)
    {
        const index = this.itemList.findIndex(item => item.itemNo == itemNo);
        if (index > -1) {
            this.itemList.splice(index, 1);
        }
    }

}