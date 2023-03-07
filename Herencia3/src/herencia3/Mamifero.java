package herencia3;

public class Mamifero extends Animal {

    public void cuidaCrias(){
        System.out.println("Cuidando crias");
    }
    public void rompeNueces(){
        System.out.println("ñam");
    }
    public void andar(){
        System.out.println("Andando");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo de todo");
    }
    
}
