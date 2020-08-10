import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ListComponent } from './Employee/list/list.component';
import { AddComponent } from './Employee/add/add.component';
import { DeleteComponent } from './Employee/delete/delete.component';

const routes: Routes = [
  {path:'list',component:ListComponent},
  {path:'add',component:AddComponent},
  {path:'delete',component:DeleteComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
