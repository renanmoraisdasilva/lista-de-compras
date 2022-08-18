package br.com.stefanini.developerup.model;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "produto")
public class Produto extends PanacheEntityBase{

    @Id
    private Long id;

    @Column(name = "nome")
    private String nome;
    
    @Column(name = "comprado")
    private boolean comprado;


    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isComprado() {
        return this.comprado;
    }
    public void setComprado(boolean comprado) {
        this.comprado = comprado;
    }
}