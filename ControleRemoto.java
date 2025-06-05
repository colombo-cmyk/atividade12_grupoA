public class ControleRemoto{
    private static ControleRemoto inst = null;
    
    private ControleRemoto(){

    }

    public static ControleRemoto GetInstance(){
        if(inst == null){
            inst = new ControleRemoto();
        }
      
            return inst;
    }
    
    public void aumentarVolume(){
        System.out.println("Volume aumentado");
    }

    public void diminuirVolume(){
        System.out.println("Volume diminuido");
    }
};

public class Main {
    public static void main(String[] args) {
        ControleRemoto i = ControleRemoto.GetInstance();
        ControleRemoto j = ControleRemoto.GetInstance();

        if(i == j){
            System.out.println("É o mesmo");
        }
    }
}
