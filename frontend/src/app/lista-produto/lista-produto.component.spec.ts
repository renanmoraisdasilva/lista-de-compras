import { ComponentFixture, TestBed, tick } from '@angular/core/testing';
import { ListaProdutoComponent } from './lista-produto.component';
import { RouterTestingModule } from '@angular/router/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';


describe('ListaProdutoComponent', () => {

  let component: ListaProdutoComponent;
  let fixture: ComponentFixture<ListaProdutoComponent>;
  let httpMock: HttpTestingController;

  beforeEach(async () => {

      await TestBed.configureTestingModule({
        imports: [
          HttpClientTestingModule,
          RouterTestingModule.withRoutes([{
            path: 'cadastro/:id',
            component: ListaProdutoComponent
          }])
        ],
        declarations: [ ListaProdutoComponent ]
      }).compileComponents();

      httpMock = TestBed.inject(HttpTestingController);
      fixture = TestBed.createComponent(ListaProdutoComponent);
      component = fixture.componentInstance;
      fixture.detectChanges();
  });

  it('Componente criado', () => {

    httpMock.expectOne('http://localhost:8080/api/produto').flush({});
  });
});
