package com.portfolio.app.service;

import java.util.List;

import com.portfolio.app.models.Educacion;
import com.portfolio.app.models.Experiencia;
import com.portfolio.app.models.Persona;
import com.portfolio.app.models.Proyecto;
import com.portfolio.app.models.Tecnologia;
import com.portfolio.app.models.User;
import com.portfolio.app.repository.EducacionRepository;
import com.portfolio.app.repository.ExperienciaRepository;
import com.portfolio.app.repository.PersonaRepository;
import com.portfolio.app.repository.ProyectoRepository;
import com.portfolio.app.repository.TecnologiaRepository;
import com.portfolio.app.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService implements IAppService {
   
   @Autowired
   private UserRepository userRepository;
   @Autowired
   private EducacionRepository educacionRepository;
   @Autowired
   private ExperienciaRepository experienciaRepository;
   @Autowired
   private PersonaRepository personaRepository;
   @Autowired
   private ProyectoRepository proyectoRepository;
   @Autowired
   private TecnologiaRepository tecnologiaRepository;

   @Override
   public List<User> getUsers() {
      List<User> listaUsuarios = userRepository.findAll();
      return listaUsuarios;
   }
   @Override
   public void saveUser(User user) {
      userRepository.save(user);
   }
   @Override
   public void deleteUser(Long id) {
      userRepository.deleteById(id);
   }
   @Override
   public User findUser(Long id) {
      User user = userRepository.findById(id).orElse(null);
      return user;
   }
   // Educacion
   @Override
   public List<Educacion> getEducacionList() {
      List<Educacion> listaUsuarios = educacionRepository.findAll();
      return listaUsuarios;
   }
   @Override
   public void saveEducacion(Educacion educacion) {
      educacionRepository.save(educacion);
   }
   @Override
   public void deleteEducacion(Long id) {
      educacionRepository.deleteById(id);
   }
   @Override
   public Educacion findEducacion(Long id) {
      Educacion educacion = educacionRepository.findById(id).orElse(null);
      return educacion;
   }
   // Experiencia
   @Override
   public List<Experiencia> getExperiencias() {
      List<Experiencia> listaUsuarios = experienciaRepository.findAll();
      return listaUsuarios;
   }
   @Override
   public void saveExperiencia(Experiencia experiencia) {
      experienciaRepository.save(experiencia);
   }
   @Override
   public void deleteExperiencia(Long id) {
      experienciaRepository.deleteById(id);
   }
   @Override
   public Experiencia findExperiencia(Long id) {
      Experiencia experiencia = experienciaRepository.findById(id).orElse(null);
      return experiencia;
   }
   // Persona
   @Override
   public List<Persona> getPersona() {
      List<Persona> listaUsuarios = personaRepository.findAll();
      return listaUsuarios;
   }
   @Override
   public void savePersona(Persona persona) {
      personaRepository.save(persona);
   }
   @Override
   public void deletePersona(Long id) {
      personaRepository.deleteById(id);
   }
   @Override
   public Persona findPersona(Long id) {
      Persona persona = personaRepository.findById(id).orElse(null);
      return persona;
   }
   // Proyecto
   @Override
   public List<Proyecto> getProyectos() {
      List<Proyecto> listaUsuarios = proyectoRepository.findAll();
      return listaUsuarios;
   }
   @Override
   public void saveProyecto(Proyecto proyecto) {
      proyectoRepository.save(proyecto);
   }
   @Override
   public void deleteProyecto(Long id) {
      proyectoRepository.deleteById(id);
   }
   @Override
   public Proyecto findProyecto(Long id) {
      Proyecto proyecto = proyectoRepository.findById(id).orElse(null);
      return proyecto;
   }
   // Tecnologia
   @Override
   public List<Tecnologia> getTecnologias() {
      List<Tecnologia> listaUsuarios = tecnologiaRepository.findAll();
      return listaUsuarios;
   }
   @Override
   public void saveTecnologia(Tecnologia tecnologia) {
      tecnologiaRepository.save(tecnologia);
   }
   @Override
   public void deleteTecnologia(Long id) {
      tecnologiaRepository.deleteById(id);
   }
   @Override
   public Tecnologia findTecnologia(Long id) {
      Tecnologia tecnologia = tecnologiaRepository.findById(id).orElse(null);
      return tecnologia;
   }


}
