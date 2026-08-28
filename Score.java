public class Score {
    private int points;

    public Score(){
        points = 50;

    }

    public void score(int p){
        points = p;
    }

    public void dec(int d){
        points -= d;
    
    }

    public void increase(int n){
        points += n;

    }

    public int getPoints(){
        return points;
    }



}
