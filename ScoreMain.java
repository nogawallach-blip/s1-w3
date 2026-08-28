public class ScoreMain {
    public static void main(String[] args) {

        Score s1 = new Score();

        s1.increase(40);
        s1.dec(50);

      System.out.println("Total score: " + s1.getPoints());

    }
}