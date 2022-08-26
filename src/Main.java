public class Main {
    public static void main(String[] args) {

        Persona hombre = new Persona();
        hombre.setNombre("Jose");
        hombre.setEdad(34);
        hombre.setTelefono("3135019958");
        Persona mujer = new Persona();
        mujer.setNombre("Marta");
        mujer.setEdad(29);
        mujer.setTelefono("3107542173");

        System.out.println(hombre.getNombre());
        System.out.println(hombre.getEdad());
        System.out.println(hombre.getTelefono());
        System.out.println(mujer.getNombre());
        System.out.println(mujer.getEdad());
        System.out.println(mujer.getTelefono());


    }
}

class Persona {
    private String nombre;
    private int edad;
    private String telefono;

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {

        return this.edad;

    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {

        return this.telefono;

    }
}