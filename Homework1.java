/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework1;
import java.util.*;
/**
 *
 * @author Mihnea
 */
public class Homework1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Homework1 app = new Homework1();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n= sc.nextInt();
        long startTime = System.currentTimeMillis();
        int [] [] lsq = new int [30101][30101];
        int k = n+1;
        for(int i=1; i<=n; i++)
        {
            int m = k;
            int a = 1;
            for(int j=1; j<=n; j++)
            {
                if(m<=n)
                {
                    lsq[i][j] = m;
                    m++;
                }
                else if(a<k)
                {
                    lsq[i][j] = a;
                    a++;
                }
            }
            k--;
        }
            for(int i=1; i<=n; i++)
            {
               if(n > 30_000) { break; }
               String row = app.createRowString(i, lsq, n);
               String col = app.createColumnString(i, lsq, n);
               System.out.println("Linia " + i + ":" + row);
               System.out.println("Coloana " + i + ":" + col);
            }
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("Run time is " + elapsedTime + "ms .");
    }
    
    private String createRowString(int rowNum, int [] [] mat, int dim)
    {
        StringBuilder row = new StringBuilder();
        for(int i=1; i<=dim; i++)
        {
            row.append(mat[rowNum][i]);
        }
        return row.toString();
    }
    private String createColumnString(int colNum, int [] [] mat, int dim)
    {
        StringBuilder col = new StringBuilder();
        for(int i=1; i<=dim; i++)
        {
            col.append(mat[i][colNum]);
        }
        return col.toString();
    }
    
}
