package herencia3;

public class Ave extends Animal{

    public void vuela(){
        System.out.println("Fiummm");
    }
    public void quitarPlumas(){
        System.out.println("Quitando plumas");
    }

    @Override
    public void duerme() {
        super.duerme();
    }
    
}
