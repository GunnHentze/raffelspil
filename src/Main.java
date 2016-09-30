public class Main {

    public static void main(String[] args) {
        spiller sp1 = new spiller();
        System.out.println("Welcome: "+sp1.toString());


        cup cup = new cup();
        System.out.println("Slag: " + cup.t1 + ", " + cup.t2);
        System.out.println("Summen af de to slag: "+ cup.sum);


    }
}
