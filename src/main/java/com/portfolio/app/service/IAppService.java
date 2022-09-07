package com.portfolio.app.service;

import java.util.List;

import com.portfolio.app.models.Educacion;
import com.portfolio.app.models.Experiencia;
import com.portfolio.app.models.Persona;
import com.portfolio.app.models.Proyecto;
import com.portfolio.app.models.Tecnologia;
import com.portfolio.app.models.User;

public interface IAppService {
   public List<User> getUsers();
   public void saveUser(User user);
   public void deleteUser(Long id);
   public User findUser(Long id);
   
   public List<Educacion> getEducacionList();
   public void saveEducacion(Educacion educacion);
   public void deleteEducacion(Long id);
   public Educacion findEducacion(Long id);
   
   public List<Experiencia> getExperiencias();
   public void saveExperiencia(Experiencia experiencia);
   public void deleteExperiencia(Long id);
   public Experiencia findExperiencia(Long id);
   
   public List<Persona> getPersona();
   public void savePersona(Persona persona);
   public void deletePersona(Long id);
   public Persona findPersona(Long id);

   public List<Proyecto> getProyectos();
   public void saveProyecto(Proyecto proyecto);
   public void deleteProyecto(Long id);
   public Proyecto findProyecto(Long id);

   public List<Tecnologia> getTecnologias();
   public void saveTecnologia(Tecnologia tecnologia);
   public void deleteTecnologia(Long id);
   public Tecnologia findTecnologia(Long id);

}
