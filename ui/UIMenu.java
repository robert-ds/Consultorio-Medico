package ui;

import model.Doctor;
import model.Patient;

import ui.UIDoctorMenu.*;

import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu{

  public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

  public static Doctor doctorLogged;
  public static Patient patientLogget;

  public static void showMenu(){
    System.out.println("Welcome to My Appointments");
    System.out.println("Seleciona la opcion deseada");

    int response = 0;
    do{
      System.out.println("1. Doctor");
      System.out.println("2. Patient");
      System.out.println("0. exit");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response) {
        case 1:
          System.out.println("Doctor");
          //response = 0;
          authUser(1);
          break;
        
        case 2:
          //response = 0;
          authUser(2);
          break;

        case 0:
          System.out.println("Thank you for you visit"); 
          break;         
      
        default:
          System.out.println("Please select a correct answer");

      }
    }while(response != 0 );

  }

  //Metodo para simular autenticacion
  private static void authUser(int userType){
    //userType = 1 Doctor
    //userType = 2 Patient

    ArrayList<Doctor> doctors = new ArrayList<>();
    doctors.add(new Doctor("Alejandro Martinez", "alejandro@gmail.com"));
    doctors.add(new Doctor("Javier Montoya", "lavier@gmail.com"));
    doctors.add(new Doctor("Jose Gregorio", "jose@gmail.com"));

    ArrayList<Patient> patients = new ArrayList<>();
    patients.add(new Patient("Maria Camacho", "maria@gmail.com"));
    patients.add(new Patient("Julio Rodriguez", "julio@gmail.com"));
    patients.add(new Patient("Agatha Mill", "agatha@gmail.com"));

    boolean emailCorrect = false;

    do{
      System.out.println("Insertert your Email: [a@a.com]");
      Scanner sc = new Scanner(System.in);
      String email = sc.nextLine();

      if(userType == 1){
        for(Doctor d: doctors){
          if(d.getEmail().equals(email)){
            emailCorrect = true;
            //Obtener el usuario logeado
            doctorLogged = d;
           UIDoctorMenu.showDoctorMenu();
          }
        }
      }else if(userType == 2){
        for(Patient p: patients){
          if(p.getEmail().equals(email)){
            emailCorrect = true;
            patientLogget = p;
          }
        }
      }      
    }while(!emailCorrect);

  }
  
  public static void showPatientMenu(){
    int response = 0;

    do{
      System.out.println("\n\n");
      System.out.println("Patient");
      System.out.println("1. Book an appointment");
      System.out.println("2. My appointment");
      System.out.println("0. return");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch (response) {
        case 1:
          System.out.println(":: Book an appointment");
          for(int i = 1; i < 4; i++){
            System.out.println(i+". " + MONTHS[i]);
          }
          break;

        case 2:
          System.out.println("::My appointments");
          break;
      
        case 0:
          showMenu();
          break;
      }

    }while(response != 0);
  }

}