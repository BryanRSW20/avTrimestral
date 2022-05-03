package br.trimestral.senai.trimestral.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity(name = "filial")
public class Filiais {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "nome")
    @Size(max = 100)
    private String nome;

    @Size(max = 150)
    private String localizacao;

    @Size(max = 100)
    private String razaoSocial;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Filiais{" +
                "Id=" + Id +
                ", nome='" + nome + '\'' +
                ", localizacao='" + localizacao + '\'' +
                ", razaoSocial='" + razaoSocial + '\'' +
                '}';
    }
}
