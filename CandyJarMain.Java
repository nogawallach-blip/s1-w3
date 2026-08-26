public class CandyJarMain {
    public static void main(String[] args){
        CandyJar a1 = new CandyJar(100);
        CandyJar a2 = new CandyJar();
    

        a1.eat(20);
        a2.refill(30);
        a1.printState();
        a2.printState();
    }
}
