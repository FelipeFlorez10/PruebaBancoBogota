import { Component } from '@angular/core';


import { Employee } from './models/employee'
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {

  constructor(private router:Router){
    this.list();
  }

  list(){
    this.router.navigate(["list"]);
  }
  
  employeeArray: Employee[] = [
    /*{emp_id:1,emp_name: "Felipe",emp_function:"Desarrollo",emp_date_admission:09/08/2019,emp_salary:300000,emp_boss_id:2},
    {emp_id:2,emp_name: "Andres",emp_function:"Desarrollo",emp_date_admission:"09/08/2019",emp_salary:300000,emp_boss_id:3},
    {emp_id:3,emp_name: "Pamela",emp_function:"Desarrollo",emp_date_admission:"09/08/2019",emp_salary:300000,emp_boss_id:1}*/
  ]

}
