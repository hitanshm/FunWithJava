import java.util.ArrayList;

public class MatrixMult {
    private int [][] one;
    private int [][] two;
    private int lengthOne;
    private int lengthTwo;

    public MatrixMult(int [][] one, int[][] two){
        this.one=one;
        this.two=two;
        lengthOne=one.length;
        lengthTwo=two.length;
    }
    public boolean doesWork(){

        if(one[0].length==lengthTwo){
            return true;
        }
        return false;
    }
    public String multMatrix(){
        int [][] result = new int[lengthOne][two[0].length];
        int sum = 0;
        if(doesWork()){
                    for (int i = 0; i < one.length; i++) {
                        for (int k = 0; k < two[0].length; k++) {
                            for (int j = 0; j < two.length; j++) {
                                sum += one[i][j] * two[j][k];
                            }
                            result[i][k] = sum;
                            sum = 0;
                        }
            }
            String sb = "";
            for(int r=0;r<result.length;r++){
                for(int c=0;c<result[0].length;c++){
                    sb+=result[r][c]+" ";
                    //System.out.print(result[r][c]+ " ");
                }
                sb+="\n";
            };
            return sb+"finished";
        }

        return "error";
    }
}
