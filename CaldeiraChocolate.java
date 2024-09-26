public class CaldeiraChocolate{
    public boolean vazia;
    public boolean fervida;
    private static CaldeiraChocolate instancia;


    public static CaldeiraChocolate getInstancia() {
        if (instancia == null) {
            instancia = new CaldeiraChocolate();
        }
        return instancia;
    }

    public void encher(){
        if (vazia == false){
            System.out.println("A Caldeira está cheia.");
        }else{
            System.out.println("A caldeira encheu");
            vazia =  false;
        }
    }

    public void  ferver(){
        if (vazia == false && fervida == false){
            fervida = true;
            System.out.println("A Caldeira está fervendo");
        }else{
            System.out.println("A caldeira está vazia ou o chocolate já foi fervida.");
        }
    }

    public void drenar(){
        if (fervida == true &&  vazia ==false){
            System.out.println("a fervura ocorreu e  a caldeira não está vazia");
        }else{
            System.out.println("A caldeira está vazia ou não foi possivel ferver");
        }
    }

    private  CaldeiraChocolate() {
        this.vazia = true;
        this.fervida = false;
    }
}