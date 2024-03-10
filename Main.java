import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Bienvenido a tu agenda de Tareas");
        System.out.println("¿Cuantas tareas deseas crear?");
        int n = sc.nextInt();
        Agenda agenda = new Agenda(); 
        procesoTareas(n, agenda);
        agenda.mostrarTareas();

        //Modificar el estado de una tarea
        System.out.println("Si deseas modificar el estado de una tarea, indica el nombre");
        String nombreTarea = sc.next();     
        agenda.actualizarTarea(nombreTarea);
        agenda.mostrarTareas();

    }
    public static void procesoTareas(int n, Agenda agenda){
    
    for (int i = 1; i <= n; i++) {
        
        System.out.println("Tarea #"+i);

        System.out.println("¿Que nombre asignaras a la tarea?");
        String nombreTarea = sc.next();

        System.out.println("¿Que duracion en minutos tendra la tarea?");
        int duracion = sc.nextInt();

        System.out.println("¿Cual es el nombre de la persona encargada?");
        String nombrePersona = sc.next();

        Persona persona = agenda.buscarPersona(nombrePersona);

        if(persona==null){
            System.out.println("Deberas crear una nueva persona");
            System.out.println("Indica el nombre de la persona");
            nombrePersona = sc.next(); 
            System.out.println("Indica el numero de telefono de la persona");
            String phone_number = sc.next();
            System.out.println("Indica el id de la persona");
            String id = sc.next(); 

            persona = new Persona(nombrePersona, id, phone_number);
            agenda.agregarPersona(persona);
        } 

        System.out.println("Actualmente la tarea va a estar activa");
        Estado.estadoTarea estado = Estado.estadoTarea.ACTIVA; 
      
        Tarea tarea = new Tarea(nombreTarea, duracion, persona, estado);
        agenda.agregarTarea(tarea);
        System.out.println("Tarea agregada correctamente");
        
    }
    }

}