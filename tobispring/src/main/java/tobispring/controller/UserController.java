package tobispring.controller;
//UserController.java
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import tobispring.model.*;
import tobispring.repo.*;

@RestController
public class UserController {

 @Autowired
 private UserRepo userRepo;

 @GetMapping("/")
 public String page() {
	 return "Welcome!";
 }

 @GetMapping("/users")
 public List<User> getUsers() {
     return userRepo.findAll();
 }
 
 @GetMapping("/user/{id}")
 public User getUserById(@PathVariable Long id) {
     return userRepo.findById(id).get();
 }
 
 @PostMapping("/save")
 public String createUser(@RequestBody User user) {
     userRepo.save(user);
     return "Guardado...";
 }

 @PutMapping("/update/{id}")
 public User updateUser(@PathVariable Long id, @RequestBody User user) {
	 User updatedUser = userRepo.findById(id).get();
	 
	 updatedUser.setName(user.getName());
	 updatedUser.setSurname(user.getSurname());
	 updatedUser.setEmail(user.getEmail());
	 updatedUser.setAge(user.getAge());
	 
     return userRepo.save(updatedUser);
 }

 @DeleteMapping("/delete/{id}")
 public void deleteUser(@PathVariable Long id) {
     userRepo.delete(userRepo.findById(id).get());
 }
}