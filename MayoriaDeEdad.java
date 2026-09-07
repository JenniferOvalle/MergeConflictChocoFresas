import java.io.*;
import java.time.LocalDate;
import java.time.Period;

public class MayoriaDeEdad {
  public static void main(String[] args) throws Exception{ 
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
<<<<<<< HEAD
    System.out.print("Ingrese día de nacimiento: :D");
    int day_ = Integer.parseInt(reader.readLine());
=======
    System.out.print("Ingrese la fecha en que nació ");
    int day = Integer.parseInt(reader.readLine());
>>>>>>> 2e18933172fd02a406c4705ede0242a3095ebda5
    System.out.print("Ingrese mes de nacimiento (1-12): ");
    int mes = Integer.parseInt(reader.readLine());
    System.out.print("Ingrese año de nacimiento: ");
    int año = Integer.parseInt(reader.readLine());
<<<<<<< HEAD
    LocalDate fecha = LocalDate.of(año,mes,day_);
=======
    LocalDate fecha = LocalDate.of(año,mes,day);
>>>>>>> 2e18933172fd02a406c4705ede0242a3095ebda5
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