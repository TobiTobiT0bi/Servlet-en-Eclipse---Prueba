package tobispring.model;

//User.java
import jakarta.persistence.*;

@Entity
@Table(name = "users")
public class User {

 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String name;
 
 private String surname;

 private String email;
 
 private int age;

//Getters and setters 
 public Long getId() {
	 return id;
 } 

 public void setId(Long id) {
 	this.id = id;
 }

 public String getName() {
 	return name;
 }

 public void setName(String name) {
 	this.name = name;
 }

 public String getSurname() {
 	return surname;
 }

 public void setSurname(String surname) {
 	this.surname = surname;
 }

 public String getEmail() {
 	return email;
 }

 public void setEmail(String email) {
 	this.email = email;
 }

 public int getAge() {
 	return age;
 }

 public void setAge(int age) {
	this.age = age;
 }

}