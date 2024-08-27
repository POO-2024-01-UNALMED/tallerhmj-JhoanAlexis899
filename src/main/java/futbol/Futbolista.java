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
        return "El futbolista " + this.getNombre() + " tiene " + this.getEdad() + ", y juega de "+this.getPosicion();
    }

    public boolean equals(Futbolista f){
        if(this.getNombre().equals(f.getNombre()) && this.getPosicion().equals(f.getPosicion()) && this.getEdad() == f.getEdad()){
            return true;
        }
        return false;
    }

    public abstract boolean jugarConLasManos();

}