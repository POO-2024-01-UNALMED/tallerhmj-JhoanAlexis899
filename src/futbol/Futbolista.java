package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
    private String nombre;
    private int edad;
    private final String posicion;


    public Futbolista(String nombre, int edad, String posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista(){
        this("Maradona",30,"delantero");
    }

    public void setNombre(String s){
        nombre = s;
    }

    public void setEdad(int e){
        edad = e;
    }


    public String getNombre(){return nombre;}

    public String getPosicion(){return posicion;}

    public int getEdad(){return edad;}

    public String toString(){
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de "+posicion;
    }

    public boolean equals(Futbolista f){
        if(nombre.equals(f.getNombre()) && posicion.equals(f.getPosicion()) && edad == f.getEdad()){
            return true;
        }
        return false;
    }

    public abstract boolean jugarConLasManos();



}