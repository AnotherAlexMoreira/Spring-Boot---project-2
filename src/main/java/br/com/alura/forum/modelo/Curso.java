package br.com.alura.forum.modelo;

import javax.persistence.*;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @ManyToOne
    private Subcategoria subcategoria;

    // construtor default exigido pela JPA
    protected Curso() {
    }

    // getters
    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Subcategoria getSubcategoria() {
        return subcategoria;
    }
}
