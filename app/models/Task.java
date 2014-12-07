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
  public String h_number;
  public String m_number;
  
  public void setId(Long id) {
	this.id = id;
  }
  public Long getId() {
    return id;
  }
  
  public void setName(String name) {
	this.name = name;
  }
  public String getName() {
    return name;
  }

  public void setH_number(String number) {
	this.h_number = number;
  }
  public String getH_number() {
    return h_number;
  }
  
  public void setM_number(String number) {
	this.m_number = number;
  }
  public String getM_number() {
    return m_number;
  }
  
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
}