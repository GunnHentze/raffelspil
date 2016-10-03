public class Main {

    public static void main(String[] args) {
        spiller sp = new spiller();
        System.out.println("Welcome: "+sp.toString());

        Terning cup = new Terning();
        System.out.println("Slag: " + cup.t1 + ", " + cup.t2);
        System.out.println("Summen af de to slag: "+ cup.sum);

        }
    }