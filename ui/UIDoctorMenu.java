package ui;

import java.util.Scanner;

public class UIDoctorMenu{

  public static void showDoctorMenu(){
    int response = 0;

    do{
      System.out.println("\n\n");
      System.out.println("Doctor");
      System.out.println("Welcome" + UIMenu.doctorLogged.getName());
      System.out.println("1. Add Availavle Appointent");
      System.out.println("2. My Schedule Appoinments");
      System.out.println("0 Logout");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      switch(response){
        
        case 1:
          break;

        case 2:
          break;

        case 0:
          UIMenu.showMenu();
          break;
        
        default:
          break;

      }

    }while(response != 0);
  }

  private static void showAddAvailableAppointmentsMenu(){
    int response = 0;

    do{
      System.out.println("\n");
      System.out.println(":: Add Available Appointment");
      System.out.println(":: Select a Months");

      for(int i = 0; i < 3; i++){
        int i = i + 1;
        System.out.println(j + "." + UIMenu.MONTHS[i]);
      }

      System.out.println("0. Return");

      Scanner sc = new Scanner(System.in);
      response = Integer.valueOf(sc.nextLine());

      if(response > 0 && response < 4){
        int monthSelected = response;
        System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected]);

        System.out.println("Insert the date Available: [dd/mm/yy]");
        String date = sc.nextLine();

        System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date ");

      }else if(){
        showDoctorMenu();
      }

    }while(response != 0);
  }

}