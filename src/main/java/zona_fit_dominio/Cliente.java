package zona_fit_dominio;

import java.util.Objects;

public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int membresia;

    public Cliente(){}

    public Cliente(int id){
        this.id = id;
    }

    public Cliente(String nombre, String apellido, int membresia){
        this.nombre = nombre;
        this.apellido = apellido;
        this.membresia = membresia;
    }

    public Cliente(int id, String nombre, String apellido, int membresia){
        this(nombre, apellido, membresia);
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMembresia() {
        return membresia;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", membresia=" + membresia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cliente cliente)) return false;

        if (id != cliente.id) return false;
        if (membresia != cliente.membresia) return false;
        if (!nombre.equals(cliente.nombre)) return false;
        return apellido.equals(cliente.apellido);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + nombre.hashCode();
        result = 31 * result + apellido.hashCode();
        result = 31 * result + membresia;
        return result;
    }
    /*
    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, membresia);
    }*/
}
