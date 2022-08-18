import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { EnunciadoComponent } from './enunciado/enunciado.component';
import { ListaProdutoComponent } from './lista-produto/lista-produto.component';
import { ProdutoService } from './service/produto.service';

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    EnunciadoComponent,
    ListaProdutoComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [ProdutoService],
  bootstrap: [AppComponent]
})

export class AppModule {}
