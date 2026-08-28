public class Refillable {
    private int amount;
    private int totalUsed;
    private int totalTimeUsedHappens;

    public Refillable(){
        amount = 10;
        totalUsed = 0;
        totalTimeUsedHappens = 0;
    }

    public Refillable(int a){
        amount = a;
        totalUsed = 0;
        totalTimeUsedHappens = 0;
    }

    public void useUp(int u){
        amount -= u;
        totalUsed += u;
        totalTimeUsedHappens += 1;

    }

    public void addTo(int a){
        amount += a;
    }

    public double avgUse(){
         return totalUsed *1.0 / totalTimeUsedHappens;

    }

    public int getAmount(){
        return amount;
    }
    
}
