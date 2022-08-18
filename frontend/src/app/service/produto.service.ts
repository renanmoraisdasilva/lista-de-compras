import { Produto } from './../Objetos/produto';
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class ProdutoService {
  private readonly API = `${environment.API}produto`;

  constructor(private $http: HttpClient) {}

  listar(): Observable<Produto[]> {
    return this.$http.get<Produto[]>(`${this.API}`);
  }

  salvar(produto: Produto): Observable<Produto> {
    return this.$http.post<Produto>(`${this.API}`, produto);
  }

  deletar(produto: Produto): Observable<Produto> {
    return this.$http.delete<Produto>(`${this.API}/${produto.codigo}`);
  }

  update(produto: Produto): Observable<Produto> {
    return this.$http.put<Produto>(`${this.API}/${produto.codigo}`, produto);
  }
}
