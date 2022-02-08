import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CIFQueryComponent } from './cif-query/cif-query.component';
import { TransferComponent } from './transfer/transfer.component';
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';
import { CreateAccountComponent } from './create-account/create-account.component'; 


const routes: Routes = [
  { path: 'QueryAccount', component: CIFQueryComponent },
  { path: 'Transfer', component: TransferComponent },
  { path: 'CreateAccount', component: CreateAccountComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    CIFQueryComponent,
    TransferComponent,
    CreateAccountComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
