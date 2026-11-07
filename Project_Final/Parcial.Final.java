
Parcial.Final

public abstract class Persona {
    private String nombre;
    private String id;
    private String correo;

    public Personal(String nombre, String id, String correo) {
        this.nombre = nombre;
        this.id = id;
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getId() {
        return id;
    }

      public String getCorreo() {
        return correo;
    }

    public void setNombre() {
       this.nombre = nombre;
    }

    public void setId() {
        this.id = id;

      public void setCorreo() {
        this.id = id;
}



public void presentarse()
{
  System.out.println("Hola, soy " + nombre);
 System.out.println("Identificación" + id);
 System.out.println("Correo: " + correo);
}


 public void actualizarCorreo(nuevoCorreo) {
        if (nuevoCorreo.contains("@") && nuevoCorreo.contains (".")) {
            System.out.println("Correo actualizado" + correo);
            correo = nuevoCorreo
        } else {
            System.out.println("Correo inválido. No se realizo el cambio");
        }
    }
}    
}
