package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;


@Entity
public class Task extends Model {

  @Id
  public Long id;
  
  @Required
  public String name;
  
  @Required
  public String mNumber;
  
  public String hNumber;
  
  public static Finder<Long,Task> find = new Finder(
    Long.class, Task.class
  );
  
  public static List<Task> all() {
    return find.all();
  }
  
  public static void create(Task task) {
    task.save();
  }
  
  public static void delete(Long id) {
    find.ref(id).delete();
  }
  
  public static void edit(Task task) {
    task.update();
  }
  
  public void setId(Long id) {
	this.id = id;
  }
  public Long getId() {
    return id;
  }

//пусть останется на всякий случай
  
//  public void setName(String name) {
//	  this.name = name;
//  }
//  public String getName() {
//    return name;
//  }

//  public void setHNumber(String number) {
//	  this.hNumber = number;
//  }
//  public String getHNumber() {
//    return hNumber;
//  }
  
//  public void setMNumber(String number) {
//	  this.mNumber = number;
//  }
//  public String getMNumber() {
//    return mNumber;
//  }
}