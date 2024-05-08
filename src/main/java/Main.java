/*
Kod bazowy programu Commit4_0: 
• Program dodaje do prostej bazy danych (pliku db.txt) dane odnośnie Studentów.
• Studenci dodawani są w klasie Main.
• Wszyscy studenci są wypisywani na końcu klasy Main.
• Klasa Service obsługuje odczyt i zapis do pliku bazy danych.
• Klasa Student reprezentuje pojedynczego studenta (Imię, Wiek).
*/


import java.io.IOException;
import java.lang.Math;
import java.util.Random;

import java.util.Scanner; // Add this import statement
class Main {
public static void main(String[] args) {
try {
Service s = new Service();
Scanner scanner = new Scanner(System.in);
System.out.println("imie studenta: ");
System.out.println("nazwisko studenta: ");
String name = scanner.next();
String nazwisko = scanner.next();
System.out.println("wiek studenta: ");
int age = scanner.nextInt();
s.addStudent(new Student(name, age));
s.addStudent(new Student("Krzysztof", 20));
s.addStudent(new Student("Janusz", 40));
var students = s.getStudents();
for(Student current : students) {
System.out.println(current.toString()); // Update to use toString method
}
} catch (IOException e) {
}
}
}