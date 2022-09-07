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
public class Experiencia {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   private String puesto;
   private String periodo;
   private String descripcion;
   private String logo;

   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public String getPuesto() {
      return puesto;
   }
   public void setPuesto(String puesto) {
      this.puesto = puesto;
   }
   public String getPeriodo() {
      return periodo;
   }
   public void setPeriodo(String periodo) {
      this.periodo = periodo;
   }
   public String getDescripcion() {
      return descripcion;
   }
   public void setDescripcion(String descripcion) {
      this.descripcion = descripcion;
   }
   public String getLogo() {
      return logo;
   }
   public void setLogo(String logo) {
      this.logo = logo;
   }
   
}
