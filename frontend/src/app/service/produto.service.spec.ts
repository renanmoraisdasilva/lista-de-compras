import { TestBed } from '@angular/core/testing';
import { ProdutoService } from './produto.service';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { HttpClient } from '@angular/common/http';


describe('ProdutoService', () => {

  let service: ProdutoService;
  let httpClient: HttpClient;

  beforeEach(() => {

    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule],
      providers: [ProdutoService]
    });

    service = TestBed.inject(ProdutoService);
    httpClient = TestBed.inject(HttpClient);
  });

  it('Componente criado', () => {

    expect(service).toBeTruthy();
  });

  it('Listar', () => {

    expect(service.listar()).toBeTruthy();
  });
});
