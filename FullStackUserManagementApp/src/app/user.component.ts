import { Component, OnInit } from '@angular/core';
import { User } from './user';
import { UserService } from './user.service';

@Component({
    selector: 'user',
    templateUrl: './user.component.html',
    styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
    title = 'user-management-app';

    users:User[];
    userForm:User;
    currUser:User;
    currUserID:number;
    toggleEditForm:boolean=false;

    constructor(private userService:UserService) 
    {
        this.users = [];
        this.userForm = new User();
        this.currUser = new User();
        this.currUserID = 0;
    }

    ngOnInit(): void {
        this.userService.getUsers().subscribe((data:User[])=>{
            console.log(data);
            this.users = data;
        })
    }

    edit(id:number)
    {
        this.currUserID = id;
        this.toggleEditForm=true;   
    }

    onSubmitEdit(adduserform:any) // update
    {
        this.currUser.id = this.currUserID;
        this.currUser.name = adduserform.value.name;
        this.currUser.age = adduserform.value.age;
        this.currUser.salary = adduserform.value.salary;

        console.log(adduserform.value);

        this.toggleEditForm=false;
        this.userService.updateUser(this.currUser).subscribe();
    }

    delete(id:number)
    {
        this.userService.deleteUser(id).subscribe();
    }
    

    add(user:User)
    {
        this.userService.addUser(user).subscribe();
    }

    onSubmitAdd(adduserform:any)
    {
        this.currUser.id = adduserform.value.id;
        this.currUser.name = adduserform.value.name;
        this.currUser.age = adduserform.value.age;
        this.currUser.salary = adduserform.value.salary;

        console.log(adduserform.value);

        this.userService.addUser(this.currUser).subscribe();
    }

    refresh()
    {
        window.location.reload();
    }

    resetForm()
    {
        this.userForm = new User();
    }
}
