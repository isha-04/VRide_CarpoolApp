import { Component, OnInit } from '@angular/core';
import * as sweetalert from 'sweetalert';



@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.css']
})



export class HomepageComponent implements OnInit {
  constructor() {}
  	 ngOnInit() {
	    sweetalert({
          title: "Hi! Welcome to Car Pool",
          text: "- To see company dashboard use Email:johndoe@vride.com and Password:qwertyuiop",
          icon: "info",
        });
     }
}