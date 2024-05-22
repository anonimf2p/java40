/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/
import java.util.Scanner;
import java.io.IOException;
class Main {
  public static void main(String[] args) {
    try {
      Service s = new Service();
      
      System.out.print("Co chcesz zrobić:\n");
      System.out.print("1 - dodac studenta \n");
      System.out.print("2 - wyswietlic studentow \n");
          System.out.print("0 - zakonczyc programu \n");
    
      Scanner scanner = new Scanner(System.in);
      while (true) {
        int wybor = scanner.nextInt();

        switch (wybor) {
          case 0:
            // zadanie 4_3
            System.out.println("Koniec programu.");
            return;
          case 1:
            // zadanie 4_1
            Scanner name = new Scanner(System.in);
            Scanner age = new Scanner(System.in);
            Scanner lname = new Scanner(System.in);
            
            System.out.print("imie: ");
            String imie = name.nextLine();
            System.out.print("nazwisko: ");
            String nazwisko = lname.nextLine();
            int wiek = age.nextInt();
            System.out.print("wiek studenta: ");
            s.addStudent(new Student(imie, nazwisko, wiek)); // Separate name and last name while creating the Student object
            break;
          case 2:
            var students = s.getStudents();
            for (Student current : students) {
              System.out.println(current.ToString());
            }
        }
      }
    } catch (IOException e) {
    }
  }
}