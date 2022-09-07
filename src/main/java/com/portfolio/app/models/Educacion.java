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
public class Educacion {
   
   @Id
   @GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
   private String periodo;
   private String instituto;
   private String logo;
   
   public Long getId() {
      return id;
   }
   public void setId(Long id) {
      this.id = id;
   }
   public String getPeriodo() {
      return periodo;
   }
   public void setPeriodo(String periodo) {
      this.periodo = periodo;
   }
   public String getInstituto() {
      return instituto;
   }
   public void setInstituto(String instituto) {
      this.instituto = instituto;
   }
   public String getLogo() {
      return logo;
   }
   public void setLogo(String logo) {
      this.logo = logo;
   }
   
}
