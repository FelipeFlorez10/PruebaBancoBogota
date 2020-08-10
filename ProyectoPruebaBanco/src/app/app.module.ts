import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {FormsModule} from '@angular/forms';
import{ServiceService} from '../app/Service/service.service';
import{HttpClientModule} from '@angular/common/http';
import { ListComponent } from './Employee/list/list.component';
import { AddComponent } from './Employee/add/add.component';
import { DeleteComponent } from './Employee/delete/delete.component'

@NgModule({
  declarations: [
    AppComponent,
    ListComponent,
    AddComponent,
    DeleteComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
