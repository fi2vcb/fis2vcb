import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cif-query',
  templateUrl: './cif-query.component.html',
  styleUrls: ['./cif-query.component.css']
})
export class CIFQueryComponent implements OnInit {
  queryCIF(CIF: HTMLInputElement): boolean {
    return false;
  }

  pageTitle: string;
  constructor() {
    this.pageTitle = "HIỂN THỊ THÔNG TIN KHÁCH HÀNG";
  };

  ngOnInit(): void {
  }

}
