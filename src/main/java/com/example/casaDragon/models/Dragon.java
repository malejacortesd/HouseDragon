package com.example.casaDragon.models;

import jakarta.persistence.*;

@Entity
@Table(name = "tabla_dragon")

public class Dragon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "nombres_dragon", nullable = true, length = 50 )
    private String nombre;
    @Column(name = "edad_dragon")
    private Integer edad;
    @Column(name = "altura_dragon")
    private Double altura;
    @Column(name = "numero_victorias_dragon")
    private Integer numeroVictorias;

    @OneToMany
    Jinete Jinete;

    public Dragon() {
    }

    public Dragon(Integer id, String nombre, Integer edad, Double altura, Integer numeroVictorias) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
        this.numeroVictorias = numeroVictorias;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getNumeroVictorias() {
        return numeroVictorias;
    }

    public void setNumeroVictorias(Integer numeroVictorias) {
        this.numeroVictorias = numeroVictorias;
    }
}
