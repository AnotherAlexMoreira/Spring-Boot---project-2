package br.com.alura.forum.modelo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @OneToMany(targetEntity=Subcategoria.class, mappedBy="categoria", fetch=FetchType.EAGER)
    private List<Subcategoria> subcategorias = new ArrayList<>();

    public Categoria() {
    }

    public Categoria(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Subcategoria> getSubcategorias() {
        return subcategorias;
    }
}
