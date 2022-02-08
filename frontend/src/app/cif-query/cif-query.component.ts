import { HttpErrorResponse } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Account } from '../account';
import { AccountService } from '../account.service';

@Component({
  selector: 'app-cif-query',
  templateUrl: './cif-query.component.html',
  styleUrls: ['./cif-query.component.css']
})
export class CIFQueryComponent implements OnInit {
  

  constructor(private accountService: AccountService) {
  };

  ngOnInit(): void {
    //this.getAccounts();
  }

  public accounts: Account[] | undefined;
  public resultAccount: Account | undefined;

  public queryAccount(CIF: HTMLInputElement): boolean {
    this.accountService.findAccount(CIF.value).subscribe(
      (response: Account) => {
        this.resultAccount = response;       
      },
      (error: HttpErrorResponse) => {
        alert(error.message)       
      }
    );
    return false;
  }


  public getAccounts(): void {
    this.accountService.getAccounts().subscribe(
      (response: Account[]) => {
        this.accounts = response;       
      },
      (error: HttpErrorResponse) => {
        alert(error.message)       
      }
    );
  }
}
