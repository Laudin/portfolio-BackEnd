package com.portfolio.app.controller;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;

import com.portfolio.app.models.*;
import com.portfolio.app.service.IAppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
public class AppController {
   
   @Autowired
   private IAppService service;

   @GetMapping("/usuario")
   public List<User> getUsers() {
      try {
         return service.getUsers();
      } catch(Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @PostMapping("/usuario")
   public String createUser(@RequestBody User user) {
      try {
         service.saveUser(user);
         return "El usuario fue creado.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   
   //EDUCACION
   @GetMapping("/educacion")
   public List<Educacion> getEducacionList() {
      try {
         return service.getEducacionList();
      } catch(Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @PostMapping("/educacion")
   public String createEducacion(@RequestBody Educacion educacion) {
      try {
         service.saveEducacion(educacion);
         return "Educaci??n agregada con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @PutMapping("/educacion/{id}")
   public Educacion editarEducacion(@PathVariable Long id, @RequestBody Educacion educacion) {
      
      Educacion educacionObj = service.findEducacion(id);
      try {
         educacionObj.setInstituto(educacion.getInstituto());
         educacionObj.setLogo(educacion.getLogo());
         educacionObj.setPeriodo(educacion.getPeriodo());

         service.saveEducacion(educacionObj);
         return educacionObj;
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @DeleteMapping("/educacion/{id}")
   public String deleteEducacion(@PathVariable Long id) {
      try {
         service.deleteEducacion(id);
         return "Educaci??n eliminada con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }

   // EXPERIENCIA
   @GetMapping("/experiencia")
   public List<Experiencia> getExperienciaList() {
      try {
         return service.getExperiencias();
      } catch(Exception e) {
         System.out.println(e);   
      }
      return null;
   }

   @PostMapping("/experiencia")
   public String createExperiencia(@RequestBody Experiencia experiencia) {
      try {
         service.saveExperiencia(experiencia);
         return "Experiencia agregada con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @PutMapping("/experiencia/{id}")
   public Experiencia editarExperiencia(@PathVariable Long id, @RequestBody Experiencia experiencia) {
      
      Experiencia experienciaObj = service.findExperiencia(id);
      try {
         experienciaObj.setDescripcion(experiencia.getDescripcion());
         experienciaObj.setLogo(experiencia.getLogo());
         experienciaObj.setPeriodo(experiencia.getPeriodo());
         experienciaObj.setPuesto(experiencia.getPuesto());

         service.saveExperiencia(experienciaObj);
         return experienciaObj;
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @DeleteMapping("/experiencia/{id}")
   public String deleteExperiencia(@PathVariable Long id) {
      try {
         service.deleteExperiencia(id);
         return "Experiencia eliminada con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }


   @GetMapping("/persona")
   public List<Persona> getPersona() {
      try {
         return service.getPersona();
      } catch(Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @PutMapping("/persona/{id}")
   public Persona editaPersona(@PathVariable Long id, @RequestBody Persona persona) {
      
      Persona personaObj = service.findPersona(id);
      try {
         personaObj.setAcerca_de(persona.getAcerca_de());
         personaObj.setApellido(persona.getApellido());
         personaObj.setGithub(persona.getGithub());
         personaObj.setLinkedin(persona.getLinkedin());
         personaObj.setNombre(persona.getNombre());
         personaObj.setTitulo(persona.getTitulo());
         personaObj.setBanner(persona.getBanner());
         personaObj.setProfile(persona.getProfile());

         service.savePersona(personaObj);
         return personaObj;
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }

   // PROYECTO
   @GetMapping("/proyecto")
   public List<Proyecto> getProyectosList() {
      try {
         return service.getProyectos();
      } catch(Exception e) {
         System.out.println(e);   
      }
      return null;
   }

   @PostMapping("/proyecto")
   public String createProyecto(@RequestBody Proyecto proyecto) {
      try {
         service.saveProyecto(proyecto);
         return "Proyecto agregado con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @PutMapping("/proyecto/{id}")
   public Proyecto editarProyecto(@PathVariable Long id, @RequestBody Proyecto proyecto) {
      
      Proyecto proyectoObj = service.findProyecto(id);
      try {
         proyectoObj.setDescripcion(proyecto.getDescripcion());
         proyectoObj.setCodigo(proyecto.getCodigo());
         proyectoObj.setTitulo(proyecto.getTitulo());
         proyectoObj.setVista(proyecto.getVista());

         service.saveProyecto(proyectoObj);
         return proyectoObj;
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @DeleteMapping("/proyecto/{id}")
   public String deleteProyecto(@PathVariable Long id) {
      try {
         service.deleteProyecto(id);
         return "Proyecto eliminado con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }

   // TECNOLOGIA
   @GetMapping("/tecnologia")
   public List<Tecnologia> getTecnologiasList() {
      try {
         return service.getTecnologias();
      } catch(Exception e) {
         System.out.println(e);   
      }
      return null;
   }

   @PostMapping("/tecnologia")
   public String createTecnologia(@RequestBody Tecnologia tecnologia) {
      try {
         service.saveTecnologia(tecnologia);
         return "Tecnologia agregado con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @PutMapping("/tecnologia/{id}")
   public Tecnologia editarTecnologia(@PathVariable Long id, @RequestBody Tecnologia tecnologia) {
      
      Tecnologia tecnologiaObj = service.findTecnologia(id);
      try {
         tecnologiaObj.setNivel(tecnologia.getNivel());
         tecnologiaObj.setNombre(tecnologia.getNombre());

         service.saveTecnologia(tecnologiaObj);
         return tecnologiaObj;
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }
   @DeleteMapping("/tecnologia/{id}")
   public String deleteTecnologia(@PathVariable Long id) {
      try {
         service.deleteTecnologia(id);
         return "Tecnologia eliminado con ??xito.";
      } catch (Exception e) {
         System.out.println(e);   
      }
      return null;
   }

   @PostMapping("/file")
   public String uploadFile(@RequestParam("file") MultipartFile file) {
      try (InputStream inputStream = file.getInputStream()){
         
         UUID uuid = UUID.randomUUID();

         Path path = Paths.get("src/main/resources/static/" + file.getOriginalFilename());
         
         Files.copy(inputStream, path, StandardCopyOption.REPLACE_EXISTING);

         return "Imagen guardada con ??xito";

      } catch (Exception e) {
         System.out.println(e);   
         
         return "Imagen no guardad";
      }
   }

   @PostMapping("/static/image")
   @ResponseBody
   // data recived is form-data and has a multipart
   public ResponseEntity<String> post(@RequestPart("image") MultipartFile multipartFile) throws IOException {
      // path where it will be stores. Needs to pass throw this funct to convert it to Path format: C:\somethins\..
      Path uploadPath = Paths.get("src/main/resources/static/");      
      // if is not png or jpeg return Incorrect
      if (!(multipartFile.getContentType().equals("image/png") || multipartFile.getContentType().equals("image/jpeg"))) {
         return new ResponseEntity<>("Incorrect file extension", HttpStatus.NOT_ACCEPTABLE);
      }
      // loads the image
      try (InputStream inputStream = multipartFile.getInputStream()) {
         // where it will be stored + the name (resolve adds that to the uploadPath)
         Path filePath;
         if (multipartFile.getContentType().equals("image/png")) {
            filePath = uploadPath.resolve("Image.png");
            } else {
            filePath = uploadPath.resolve("Image.jpg");
         }
         // copies the file into the path and replaces it
         Files.copy(inputStream, filePath, StandardCopyOption.REPLACE_EXISTING);
      } catch (IOException ioe) {
         return new ResponseEntity<>("Could not save image file", HttpStatus.INTERNAL_SERVER_ERROR);
      }
      return new ResponseEntity<>("Image saved succefully", HttpStatus.OK);
   }

}