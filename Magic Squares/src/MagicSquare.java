public class MagicSquare {
    private int rows;
    private int cols;
    private int [][] square;
    //constructor that initializes rows, cols and square
    public MagicSquare (int size){
        rows = size;
        cols = size;
        square = new int[rows][cols];
    }
    //method that makes a magic square given the size of the square
    public void computeMagicSquare() {
        //initializes r to 0 and c to the index of the middle column
        int r = 0;
        int c = cols/2;
        //middle column of first row is 1
        square[r][c] = 1;
        //inserts all the numbers of the magic squares in the right place
        for(int i=1; i<rows*rows; i++){
            //checks if prev num is a multiple of the size and if true adds next num below prev
            if (i%rows==0){
                //moves down 1 row
                r+=1;
            }
            //if not true it adds the next num 1 spot right and 1 spot up
            else {
                //checks if prev num is on the first row
                if(r==0){
                    r=rows;
                }
                //checks if prev num is on last column
                if(c==cols-1){
                    c=-1;
                }
                //moves up one and right one
                r=r-1;
                c=c+1;
            }
            square[r][c]=i+1;
        }
    }

    //shows the magic square
    public void displayMagicSquare() {
        //initializing display
        String display=rows+"x"+rows+" Magic Square"+"\n";
        //goes through all the spaces in the square and adds it to display
        for(int ro = 0; ro <rows; ro++){
            for (int co = 0; co <cols; co++){
                display = display + square[ro][co]+" ";
            }
            //goes to next line after each row
            display = display +"\n";
        }
        System.out.println(display);
    }
    //adds all nums in rows to show it equals size times median
    public void checkRows(){
        //initializes sum and dis
        int sum=0;
        String dis="Checking Rows"+"\n"+"============="+"\n";
        //goes through all rows
        for(int rw=0; rw<rows; rw++){
            //sets sum and display to the num at rw in first column so there isn't a + infornt while displaying
            sum=square[rw][0];
            dis+= square[rw][0];
            //goes through the second column to the end and adds the column in each row to sum and shows addition in display
            for(int cl=1;cl<cols;cl++) {
                sum+= square[rw][cl];
                dis+= "+" + square[rw][cl];
            }
            //goes to next line after each row is added
            dis+= " = "+sum+"\n";
        }
        System.out.println(dis);
    }
    //adds all nums in columns to show it equals size times median
    public void checkColumns(){
        //initializes sum and dis
        int sum=0;
        String dis="Checking Columns"+"\n"+"================"+"\n";
        //goes through all the columns
        for(int cl=0; cl<cols; cl++){
            //sets sum and display to the num at cl in first row so there isn't a + infornt while displaying
            sum=square[0][cl];
            dis+=square[0][cl];
            //goes through the second row to the end and adds the rows in each column to sum and shows addition in display
            for(int rw=1;rw<cols;rw++) {
                sum+= square[rw][cl];
                dis+= "+" + square[rw][cl];
            }
            //goes to next line after each column is added
            dis +=" = "+sum+"\n";
        }
        System.out.println(dis);
    }
    //adds all nums in the diagonals to show it equals size times median
    public void checkDiagonals(){
        //initializes sum and dis
        int sum;
        String dis="Checking Diagonals"+"\n"+"=================="+"\n";
        //sets sum and dis to first num
        sum = square[0][0];
        dis+=square[0][0];
        //goes through the diagonal from top left to bottom right and adds the nums
        for(int i=1; i<rows; i++){
            sum+=square[i][i];
            dis+="+"+square[i][i];
        }
        dis+=" = "+sum+"\n";
        //sets sum to top right num and adds the top right num to dis
        sum = square[0][rows-1];
        dis+= square[0][rows-1];
        //goes through the diagonal from top right to bottom left and adds the nums
        for (int j=1;j<rows;j++){
            sum+=square[j][rows-j-1];
            dis=dis+ "+"+square[j][rows-j-1];
        }
        dis+=" = "+sum;
        System.out.println(dis);
    }
}