public class RefillableMain {
    public static void main(String[] args) {
        Refillable r1 = new Refillable(67); 
        
        r1.useUp(20);
        r1.addTo(17);
        r1.useUp(3);

        System.out.println("Amount: " + r1.getAmount());
    }
}
