import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { ProductListComponent } from './product-list.component';
import { ConvertToSpacesPipe } from '/angular-app/src/app/products/convert-to-spaces.pipe';

declarations: [
   AppComponent,
   ProductListComponent,
   ConvertToSpacesPipe
 ]


@NgModule({
    declarations: [
        AppComponent,
        ProductListComponent
    ],
imports: [
    BrowserModule
],
providers: [],
bootstrap: [AppComponent]
})
export class AppModule { }