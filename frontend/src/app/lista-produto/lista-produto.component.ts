import { Produto } from './../Objetos/produto';
import { Component, OnInit, SimpleChanges } from '@angular/core';
import { ProdutoService } from '../service/produto.service';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-lista-produto',
  templateUrl: './lista-produto.component.html',
  styleUrls: ['./lista-produto.component.css'],
})
export class ListaProdutoComponent implements OnInit {
  produtos: Array<Produto> = [];
  novoProduto: Produto = {
    codigo: 0,
    nome: '',
    comprado: false,
  };

  produtoEditado: Produto = {
    codigo: 0,
    nome: '',
    comprado: false,
    editarState: false,
  };

  carregarLoading = false;
  constructor(
    private toastr: ToastrService,
    private produtoService: ProdutoService,
    private router: Router
  ) {}

  ngOnInit(): void {
    this.produtoService.listar().subscribe((produto: Produto[]) => {
      setTimeout(() => {
        this.carregarLoading = true;
        this.produtos = produto;
      }, 2000);
    });
  }

  incluirProduto(): void {
    this.produtoService.salvar(this.novoProduto).subscribe((response) => {
      response['codigo'] = response['id'];
      delete response['id'];
      this.novoProduto.codigo = this.produtos.push(response);
      this.toastr.success('Produto incluído com sucesso');
    });
  }

  editarProduto(produto: Produto): void {
    produto.editarState = !produto.editarState;
    produto.nome = this.produtoEditado.nome;
    const index = this.produtos.findIndex(
      (obj) => obj.codigo == produto.codigo
    );
    this.produtos[index].nome = produto.nome;
  }

  updateProduto(produto: Produto): void {
    console.log(produto);
    this.produtoService.update(produto).subscribe((response) => {
      response['codigo'] = response['id'];
      delete response['id'];
    });
    produto.editarState = false;
  }

  apagarProduto(produto: Produto): void {
    this.produtoService.deletar(produto).subscribe(() => {
      this.produtos = this.produtos.filter((e) => e.codigo !== produto.codigo);
      this.toastr.success('Produto excluído com sucesso');
    });
  }

  concluirCompra() {
    this.produtos.forEach((element) => {
      element.comprado = true;
      this.updateProduto(element);
    });
    this.toastr.success('Produtos comprados com sucesso');
  }

  cancelarCompra() {
    this.produtos.forEach((element) => {
      element.comprado = false;
      this.updateProduto(element);
    });
    this.toastr.success('Produtos cancelados com sucesso');
  }
}
