import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from 'src/environments/environment';
import { Account } from './account';

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  private apiServiceURL = environment.apiBaseURL;
  constructor(private http: HttpClient) { }

  public addAccount(account: Account): Observable<Account> {
    return this.http.get<Account>(`${this.apiServiceURL}/api/v1/AddAccount`);
  }

  public updateAccount(account: Account): Observable<Account> {
    return this.http.get<Account>(`${this.apiServiceURL}/api/v1/UpdateAccount`);
  }

  public getAccounts(): Observable<Account[]> {
    return this.http.get<Account[]>(`${this.apiServiceURL}/api/v1/ShowAccounts`);
  }

  public transferAccounts(fromAccount: Account, toAccount: AccountService, transfer: number): Observable<void> {
    return this.http.get<void>(`${this.apiServiceURL}/api/v1/Transfer`);
  }

  public findAccount(cif: string): Observable<Account> {
    return this.http.get<Account>(`${this.apiServiceURL}/api/v1/QueryAccount/${cif}`);
  }
}
