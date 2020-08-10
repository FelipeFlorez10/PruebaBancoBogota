import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Employee } from '../models/employee';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {


  constructor(private http:HttpClient) { }

  Url='http://localhost:8080/EmployeeRest/webresource/employ';

  getEmployee(){
    return this.http.get<Employee[]>(this.Url);
  }

  createEmployee(employee:Employee){
    return this.http.post<Employee[]>(this.Url,employee);
  }

  deleteEmployee(employee:Employee){
    return this.http.delete<Employee>(this.Url+"/"+employee.emp_id);
  }
}
