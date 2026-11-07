EstudianteGraduado.java


public class Estudiante extends Persona {
    private String codigo;
    private String proyectoGrado;
    private String directorTesis;
    private Int tituloObtenido;


    public Estudiante(String nombre, String id, String correo, String carrera, String codigo, int materiasInscritas, int totalMaterias ) {
        super(nombre, id, correo);
        this.codigo = codigo;
        this.carrera = carrera;
        this.directorTesis = directorTesis;
        this.tituloObtenido = tituloObtenido;    
    }

    
    public Materia(){
        this.materiasInscritas = "Sin materias inscritas"
        this.proyectoGrado = "Sin materias inscritas"
    }

    public Materia(){
        this.materiasInscritas = "Sin materias inscritas"
        this.proyectoGrado = "Sin materias inscritas"
    }


   }

public super.presentarse(){
 System.out.println("Soy estudiante graduadio " + carrera);
 System.out.println("Codigo estudiantil" + codigo);
 System.out.println("Materias inscritas: " + totalMaterias);
}



 public void inscribir(materia) {
        if (totalMaterias >= 10) {
            System.out.println("Límite de materias alcanzado" + correo);
            retun = null
        } else {
            materiasInscritas[totalMaterias] = materia
            totalMaterias = totalMAterias + 1 
            System.out.println("Materia inscrita: " + materia + "(Sin grupo especifico)");
        }
    }

public void inscribir(materia, grupo){
    if (totalMaterias == 0) {
            System.out.println("No hay materias inscritas");
            retun = null
        } else {
            System.out.println("Materia de: " + nombre + ": "(Sin grupo especifico)"
             + (i+1) + ". " + materiasInscritas[i]);
        }

}    
    