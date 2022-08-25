package com.portfolio.app.service;

import java.util.List;

import com.portfolio.app.models.User;

public interface IAppService {
   public List<User> getUsers();

   public void saveUser(User user);

   public void deleteUser(Long id);

   public User findUser(Long id);
}
