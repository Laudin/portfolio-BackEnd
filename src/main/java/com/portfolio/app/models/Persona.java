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
   private String banner;
   private String profile;

   public Long getId() {
      return id;
   }
   public void setId(final Long id) {
      this.id = id;
   }
   public String getNombre() {
      return nombre;
   }
   public void setNombre(final String nombre) {
      this.nombre = nombre;
   }
   public String getApellido() {
      return apellido;
   }
   public void setApellido(final String apellido) {
      this.apellido = apellido;
   }
   public String getTitulo() {
      return titulo;
   }
   public void setTitulo(final String titulo) {
      this.titulo = titulo;
   }
   public String getAcerca_de() {
      return acerca_de;
   }
   public void setAcerca_de(final String acerca_de) {
      this.acerca_de = acerca_de;
   }
   public String getLinkedin() {
      return linkedin;
   }
   public void setLinkedin(final String linkedin) {
      this.linkedin = linkedin;
   }
   public String getGithub() {
      return github;
   }
   public void setGithub(final String github) {
      this.github = github;
   }
   public String getBanner() {
      return banner;
   }
   public void setBanner(final String banner) {
      this.banner = banner;
   }
   public String getProfile() {
      return profile;
   }
   public void setProfile(final String profile) {
      this.profile = profile;
   }
}