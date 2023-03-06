package Herencia.Ejercicio3;

public class Perro extends Mamifero{

    public void ladra(){
        System.out.println("Guau guau guau");
    }
    public void sientate(){
        System.out.println("Me siento");
    }

    @Override
    public void cuidaCrias() {
        super.cuidaCrias(); 
    }
    
}
