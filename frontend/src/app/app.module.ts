import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CIFQueryComponent } from './cif-query/cif-query.component';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: 'queryaccount', component: CIFQueryComponent },
];
@NgModule({
  declarations: [
    AppComponent,
    CIFQueryComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
