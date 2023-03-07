package herencia3;

public class Gato extends Mamifero {

    public void maulla(){
        System.out.println("miauuuuu");
    }
    public void ronronear(){
        System.out.println("rrrrr");
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo pescado"); 
    }
    
}
