import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    
    ArrayList<Tarea> listaTareas = new ArrayList<>(); 
    ArrayList<Persona> listaPersonas = new ArrayList<>();
    Scanner sc = new Scanner(System.in);

    public Agenda(){
        this.listaTareas = new ArrayList<>();
        this.listaPersonas = new ArrayList<>(); 
    }

    public void agregarTarea(Tarea tarea){
        listaTareas.add(tarea);
    }

    public void agregarPersona(Persona persona){
        listaPersonas.add(persona);
    }

    public void mostrarTareas(){
        for (Tarea tarea : listaTareas) {
            System.out.println(tarea.atributosTarea());
        }
    }

    public Persona buscarPersona(String nombre){

        for (Persona persona : listaPersonas) {
            if(nombre.equalsIgnoreCase(persona.getName())){
                return persona; 
            }
        }
        return null; 
    }

    public void actualizarTarea(String nombreTarea){
        for (Tarea tarea : listaTareas) {
            if (tarea.getNombreTarea().equals(nombreTarea)) {
                System.out.println("¿En que estado esta tu tarea?");
                String selector = sc.nextLine();
                if(cambiarEstado(tarea, selector)){
                    System.out.println("El estado se ha cambiado correctamente a "+selector);
                } else{
                    System.out.println("Has ingresado informacion equivocada!");
                }
            }
        }
    }
    public boolean cambiarEstado(Tarea tarea, String selector){
        if (selector.equalsIgnoreCase("activa")) {
            tarea.setEstado(Estado.estadoTarea.ACTIVA);
            return true;
        } else if (selector.equalsIgnoreCase("desarrollo")){
            tarea.setEstado(Estado.estadoTarea.EN_DESARROLLO);
            return true;  
        } else if (selector.equalsIgnoreCase("realizada")){
            tarea.setEstado(Estado.estadoTarea.REALIZADA);
            return true;  
        } else { 
            return false;
        }
    }

}
