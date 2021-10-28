public class Principal{

    public static void main (String args[]){

    Novo novo=new Novo();
    Velho velho=new Velho();

    novo.setEndereco("Nestor de Barros");
    novo.setPreco(250000);
    novo.setAdicionalPreco(0.2*novo.getPreco());
    System.out.println(novo.getPreco()+novo.getAdicionalPreco());
    }

}