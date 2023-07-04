import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the odd# size of the Magic Square --> ");
        int size = input.nextInt();
        MagicSquare magic = new MagicSquare(size);
        magic.computeMagicSquare();
        magic.displayMagicSquare();
        magic.checkRows();
        magic.checkColumns();
        magic.checkDiagonals();
        }
    }

