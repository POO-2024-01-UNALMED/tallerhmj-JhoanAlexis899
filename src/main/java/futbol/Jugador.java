package futbol;

public class Jugador extends Futbolista{
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal){
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(){
        super();
        golesMarcados = 289;
        dorsal = 7;
    }

    public int compareTo(Futbolista f){
        return Math.abs(this.getEdad() - f.getEdad());
    }

    public String toString(){
        return super.toString() + " con el dorsal "+ dorsal + ". Ha marcado "+golesMarcados;
    }

    public boolean jugarConLasManos(){
        return false;
    }


}