package model;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
  
  //Atributos
  private String speciality;

  //Método constructor
  public Doctor(String name, String email){
    super(name,email);
    System.out.println("Construyendo el Objeto Doctor");
  }
  
  //Sobrecarga del método constructor Doctor
  public Doctor(String name, String email, String speciality ){
    super(name,email);
    System.out.println("El nombre del médico asignado es: " + name);
    id++;
    this.speciality = speciality; 
  }
  
  //Comportamientos o Métodos
  //collección
  ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
  public void addAvailableAppointment(Date date, String time){
     availableAppointments.add(new Doctor.AvailableAppointment(date, time));
  }

  public ArrayList<AvailableAppointment> getAvailableAppointments(){
    return availableAppointments;
  }

  //Getters and Setters
  //Speciality
  //Set
  public void setSpeciality(String speciality){
    this.speciality = speciality;
  }

  //Get
  public String getSpeciality(){
    return this.speciality;
  }

  //Sobrecarga del Método toString
  @Override
  public String toString(){
    return super.toString() + "\nSpeciality: " + speciality + "\nAvailable:" + availableAppointments;
  }

  //Implamentando el Método Abstracto de la clase User
  @Override
  public void showDataUser(){
    System.out.println("Empleado del Hospital: Cruz Roja");
    System.out.println("Departamento: Oncologia");
  }

  //Clase interna para gestionar las citas
  public static class AvailableAppointment{
    
    //AvaibleAppointment
    private int id;
    private Date date;
    private String time;

    //constructor
    public AvailableAppointment(Date date, String time){
      this.date = date;
      this.time = time;
    }

    //Getters and Setters
    //Id
    //Set
    public void setId(int id){
      this.id = id;
    }

    //Get
    public int getId(){
      return this.id;
    }

    //Date
    //Set
    public void setDate(){
      this.date = date;
    }

    //Get
    public Date getDate(){
      return this.date;
    }

    //Time
    //Set
    public void setTime(){
      this.time = time;
    }

    //Get
    public String getTime(){
      return this.time;
    }

    //Sobrecarga del Método toString
    @Override
    public String toString(){
      return "Available Appoiments \nDate: "+date+"\nTime: "+ 
      time;
    }

  }

}