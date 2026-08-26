public class CokeCooler {
    private int numCokes;

    public CokeCooler(int n){
        numCokes = n; 
    }
    public CokeCooler(){
        numCokes = 100;
    }


    public void remove(int r){
        numCokes -= r;
    }

    public void fill(int f){
        numCokes += f;
    }

    public int cCokes(){
        return numCokes;
    }

    public void printState(){
        System.out.println("Number of Cokes: " + numCokes);
    }
}
