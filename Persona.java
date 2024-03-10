public class Persona {
    
    private String name;
    private String id;
    private String phone_number;
    
    public Persona(String name, String id, String phone_number){
        this.name = name;
        this.id = id;
        this.phone_number = phone_number; 
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPhone_number() {
        return phone_number;
    }
}
