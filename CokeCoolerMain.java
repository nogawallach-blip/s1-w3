public class CokeCoolerMain{
    public static void main(String[] args){

        CokeCooler c1 = new CokeCooler();

        c1.remove(20);
        System.out.println(c1.cCokes());
        c1.fill(5);
        System.out.println(c1.cCokes());
    }

}