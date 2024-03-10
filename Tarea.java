
public class Tarea {

    public String nombreTarea;
    public int duracion;
    public Persona persona;
    public Estado.estadoTarea estado;

    public Tarea(String nombreTarea, int duracion, Persona persona, Estado.estadoTarea estado){
        this.nombreTarea = nombreTarea;
        this.duracion = duracion;
        this.persona = persona;
        this.estado = estado; 
    }

    public void setNombreTarea(String nombreTarea) {
        this.nombreTarea = nombreTarea;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public void setEstado(Estado.estadoTarea estado) {
        this.estado = estado;
    }

    public String getNombreTarea() {
        return nombreTarea;
    }

    public int getDuracion() {
        return duracion;
    }

    public Persona getPersona() {
        return persona;
    }

    public Estado.estadoTarea getEstado() {
        return estado;
    }

    public String atributosTarea(){
        return "Nombre tarea: "+nombreTarea+" Duracion: "+duracion+" Encargado: "+persona.getName()+" Estado: "+estado;
    }
}