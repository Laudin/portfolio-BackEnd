package com.portfolio.app.controller;

import java.util.List;

import com.portfolio.app.models.User;
import com.portfolio.app.service.IAppService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
   
   @Autowired
   private IAppService interUser;

   @GetMapping("/usuario")
   public List<User> getUsers() {
      return interUser.getUsers();
   }

   @PostMapping("/usuario")
   public String createUser(@RequestBody User user) {
      interUser.saveUser(user);
      return "El usuario fue creado.";
   }
}
