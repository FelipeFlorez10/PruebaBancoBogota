import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {ServiceService} from '../../Service/service.service'
import { Employee } from 'src/app/models/employee';

@Component({
  selector: 'app-list',
  templateUrl: './list.component.html',
  styleUrls: ['./list.component.css']
})
export class ListComponent implements OnInit {


  employee:Employee[];
  constructor(private service:ServiceService, private router:Router) { }

  ngOnInit(): void {
    this.service.getEmployee()
    .subscribe(data =>{
      this.employee=data;
    });
  }

  selectedEmployee: Employee = new Employee();


  add(){

    if(this.selectedEmployee.emp_id == 0){

      this.selectedEmployee.emp_id = this.employee.length + 1;
      this.employee.push(this.selectedEmployee);

      this.service.createEmployee(this.selectedEmployee)
      .subscribe(data =>{
        alert("Usuario se agrego de forma correcta")
      });
      
    }

    this.selectedEmployee = new Employee();
  }

  openForEdit(employee: Employee){
    this.selectedEmployee = employee;
  }

  delete(employee: Employee){
    if(confirm('Estas seguro de eliminar')){
      this.service.deleteEmployee(this.selectedEmployee)
      .subscribe(data=>{
        this.employee=this.employee.filter(p=>p!==employee);
        alert("usuario eliminado")
      });
      this.selectedEmployee = new Employee(); 
    }
  }

}
