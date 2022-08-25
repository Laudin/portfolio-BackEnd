package com.portfolio.app.service;

import java.util.List;

import com.portfolio.app.models.User;
import com.portfolio.app.repository.AppRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService implements IAppService {
   
   @Autowired
   private AppRepository repository;

   @Override
   public List<User> getUsers() {
      List<User> listaUsuarios = repository.findAll();
      return listaUsuarios;
   }

   @Override
   public void saveUser(User user) {
      repository.save(user);
   }

   @Override
   public void deleteUser(Long id) {
      repository.deleteById(id);
   }

   @Override
   public User findUser(Long id) {
      User user = repository.findById(id).orElse(null);
      return user;
   }

}
