import { NgModule } from '@angular/core'
import { Routes, RouterModule } from '@angular/router';

import { RoutingHomeComponent } from './routing-home/routing-home.component'
import { RoutingAboutComponent } from './routing-about/routing-about.component';
import { RoutingCareersComponent } from './routing-careers/routing-careers.component';
import { RoutingContactComponent } from './routing-contact/routing-contact.component';
import { RoutingPageNotFoundComponent } from './routing-page-not-found/routing-page-not-found.component';

const routes: Routes = [
    { path: '', redirectTo: '/home', pathMatch: 'full' },
    { path: 'home', component: RoutingHomeComponent },
    { path: 'about', component: RoutingAboutComponent },
    { path: 'careers', component: RoutingCareersComponent },
    { path: 'contact', component: RoutingContactComponent },
    { path: '**', component: RoutingPageNotFoundComponent }
]

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})

export class AppRoutingModule {};