import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EnunciadoComponent } from './enunciado/enunciado.component';
import { ListaProdutoComponent } from './lista-produto/lista-produto.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { ToastrModule } from 'ngx-toastr';

const routes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'home', component: HomeComponent },
  { path: 'enunciado', component: EnunciadoComponent },
  { path: 'listar', component: ListaProdutoComponent },
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
    BrowserAnimationsModule,
    ToastrModule.forRoot({ progressBar: true, timeOut: 5000 }),
  ],
  exports: [RouterModule],
})
export class AppRoutingModule {}
