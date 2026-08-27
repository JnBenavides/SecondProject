*//public class MiClase{
    private int edad;
    private double altura;
    private char sexo;
    edad = 27;
    altura = 170;
    sexo = "M";
    private boolean aprobado = true;
    String nombre = "Julian Benavides";
    String saludo = "Hola" + nombre;
    double precio = 9.99;
    int precioCortado = (int)precio;
    int entero = 5;
    double decimal = entero;
    
    String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
    System.out.println(mensaje);
    
}

int nota = 75;

if( nota >= 90){
    System.out.println("Excelente");
} else if (nota >= 70) {
    System.out.println("Reprobado");
  else if (nota >= 60) {
} System.out.println( "Aprbado");
} else {
    System.out.println("Reprobado");
}


public class EjercicioSwithch{
    int dia = 3;
String nombreDia;

switch (dia){
    case 1: 
        nombreDia = "Lunes";
        break;
    case 2:
        nombreDia = "Martes"
        break;
    case 3: 
        nombreDia = "Miercoles";
        break;
    default:
        nombreDia = "Dia no valido";
        break;            
}

System.out.println(nombreDia); // Miercoles
}



 import java.util.Scanner;

 public class App {

       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double base = 5.0;
        double altura = 3.0;
        
        double area = base * altura;

        System.out.println("Ingrese el area");
        String base = sc.nextLine();

        System.out.println("Ingrese el area");
        String altura = sc.nextLine();

        System.out.println("Ela rea del rectangulo es; " + area );

        sc.close();
      }      
}


        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Como te llamas?");
        String nombre = sc.nextLine();

        System.out.println("Cuantos años tienes?");
        int edad = sc.nextInt();

        System.out.println("Hola, " + nombre + ".Tienes " + edad + " años.");

        sc.close();

              *// public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
       
        int a = 10, b=3;
        int edad = 20;
        System.out.println(a + b); // 13 - suma
        System.out.println(a - b); // 7 - resta
        System.out.println(a * b); // 30 - multiplicacion
        System.out.println(a / b); // 3 - divisn entera ( ojo) 
        System.out.println(a % b); // 1 - modulo (residuo)
        int x = 10;
        
        //
        
        x += 5; // x = x + 5 
        x -= 3; // x = x -3 
        x *= 2; // x = x * 2 
        x /= 4; // x = x / 4 
        x++;    
        x--;

       // Operador de comparacion

        System.out.println(edad == 20);
        System.out.println(edad !=18);
        System.out.println(edad > 18);
        System.out.println(edad < 18);
        System.out.println(edad >= 20);
        System.out.println(edad <= 19); 

        //Operadores logicos OR(||) NOT(!) AND(&&) 

        boolean mayorEdad = true;
        boolean tieneCarnet = false;
        git status
    
        *//


        