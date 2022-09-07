package com.portfolio.app.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Getter 
@Setter
@Entity
public class Persona {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   private String nombre;
   private String apellido;
   private String titulo;
   private String acerca_de;
   private String linkedin;
   private String github;

   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public String getNombre() {
      return nombre;
   }
   public void setNombre(String nombre) {
      this.nombre = nombre;
   }
   public String getApellido() {
      return apellido;
   }
   public void setApellido(String apellido) {
      this.apellido = apellido;
   }
   public String getTitulo() {
      return titulo;
   }
   public void setTitulo(String titulo) {
      this.titulo = titulo;
   }
   public String getAcerca_de() {
      return acerca_de;
   }
   public void setAcerca_de(String acerca_de) {
      this.acerca_de = acerca_de;
   }
   public String getLinkedin() {
      return linkedin;
   }
   public void setLinkedin(String linkedin) {
      this.linkedin = linkedin;
   }
   public String getGithub() {
      return github;
   }
   public void setGithub(String github) {
      this.github = github;
   }
}