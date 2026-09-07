import java.io.*;
import java.time.LocalDate;
import java.time.Period;

public class MayoriaDeEdad {
  public static void main(String[] args) throws Exception{ 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
    System.out.print("Ingrese día de nacimiento: ");
    int dia = Integer.parseInt(reader.readLine());
    System.out.print("Ingrese mes de nacimiento (1-12): ");
    int mes = Integer.parseInt(reader.readLine());
    System.out.print("Ingrese año de nacimiento: ");
    int año = Integer.parseInt(reader.readLine());
    LocalDate fecha = LocalDate.of(año,mes,dia);
    LocalDate hoy = LocalDate.now();
    
    if (fecha.isAfter(hoy) == true) {
        System.out.println("No se aceptan fechas a futuro");
    } else {
        Period edad = Period.between(fecha, hoy);
        int años = edad.getYears();
        System.out.println("Edad: " + años + " años.");
    if (años >= 18) {
        System.out.println("Es mayor de edad en Guatemala");
    } else {
        System.out.println("Es menor de edad en Guatemala");
      }
    }
  }
}