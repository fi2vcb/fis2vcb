import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CIFQueryComponent } from './cif-query/cif-query.component';
import { TransferTrongvxComponent } from './transfer-trongvx/transfer-trongvx.component'; 
import { RouterModule, Routes } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';


const routes: Routes = [
  { path: 'QueryAccount', component: CIFQueryComponent },
  { path: 'Transfer', component: TransferTrongvxComponent }
];
@NgModule({
  declarations: [
    AppComponent,
    CIFQueryComponent,
    TransferTrongvxComponent
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
