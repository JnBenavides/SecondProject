4. Profesor.java

java
public abstract class profesor {
    private String nombre;
    private String codigo;
    private int edad;

    public profesor(String nombre, String codigo, int edad) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public abstract String obtenerInfo();



    public class Profesor extends Persona {
    private String departamento;
    private double salarioBase;
    private Int horasContrato;

    public Profesor(String nombre, String id, String correo, String departamento, Int horasContrato, double salarioBase ) {
        super(nombre, id, correo);
        this.departamento = departamento;
        this.salarioBase = salarioBase;
        this.horasContrato = horasContrato;
        
    }
}
}
