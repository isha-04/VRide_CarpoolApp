import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../models/user.model';
import { UserloginService } from './userlogin.service';
import swal from 'sweetalert';



@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent {

 user: User = new User();
  constructor(private router: Router, private userloginService: UserloginService) {

  }

 	login(){
	    this.userloginService.checkUser(this.user)
	      .subscribe( data => {
	        if(!data){
            swal({
                title: "Wrong Email or Password",
                icon: "error",
              });

            return;
	        }else if(!data.emp_id)
        	{
	        	swal({
                title: "Wrong Email or Password",
                icon: "error",
              });

             return;
        	}else{
        		sessionStorage.setItem('userId', data.emp_id);
            sessionStorage.setItem('userCid', data.c_Name);
            sessionStorage.setItem('userName', data.f_Name);

            swal({
                title: "Login Successfull!",
                icon: "success",
              });

            this.router.navigate(['/userDashboard']);
        	}
	      });
	}
}



