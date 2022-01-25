import { Component } from '@angular/core';
import {
  Router
} from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  pageTitle: string;
  constructor(private router: Router) {
    this.pageTitle = "MÀN HÌNH CHÍNH";
  };
}
