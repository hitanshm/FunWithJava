public class Main {
    public static void main(String[] args) {
        System.out.println("running multiplication");
        int a [][] = {{1,2,3},{4,5,6}};
        int b [][] = {{1,3},{1,2},{1,2}};
        MatrixMult test = new MatrixMult(a,b);
        System.out.println(test.multMatrix());
    }
}