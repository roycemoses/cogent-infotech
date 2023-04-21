import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';

import { AppComponent } from './app.component';
import { RoutingHomeComponent } from './routing-home/routing-home.component';
import { RoutingAboutComponent } from './routing-about/routing-about.component';
import { RoutingCareersComponent } from './routing-careers/routing-careers.component';
import { RoutingContactComponent } from './routing-contact/routing-contact.component';
import { RoutingPageNotFoundComponent } from './routing-page-not-found/routing-page-not-found.component';

@NgModule({
  declarations: [
    AppComponent,
    RoutingHomeComponent,
    RoutingAboutComponent,
    RoutingCareersComponent,
    RoutingContactComponent,
    RoutingPageNotFoundComponent
  ],
  imports: [
    BrowserModule, AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
