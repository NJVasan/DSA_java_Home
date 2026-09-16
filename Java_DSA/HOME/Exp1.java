import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter number of scores :");
		int n = sc.nextInt();
		int count=0;
		double[] scores = new double[n];
		System.out.print("Enter "+n+" Scores :\n");
		for(int i=0;i<n;i++){
		    scores[i]=sc.nextDouble();
		    count+=scores[i];
		}
        System.out.println("Scores :");
        for(int i=0;i<n;i++){
            System.out.printf("%8.2f",scores[i]);
            if((i+1)%4 == 0){
                System.out.println();
            }
        if(n%4 != 0){
            System.out.println();
        }
        }
		double average = count/n;
		System.out.printf("Average :%.2f",average);
        
        double lowest = scores[0];
        double highest = scores[0];
        for(int i=0;i<n;i++){
            if (scores[i]<lowest){
                lowest=scores[i];
            }       
            if(scores[i]>highest){
                highest=scores[i];
            }
        }
        System.out.printf("\nHighest :%.2f",highest);
        System.out.printf("\nLowest :%.2f",lowest);
        System.out.print("\n\nScore\tDeviation\n");
        double variance = 0;
        for(int i=0;i<n;i++){
            double deviation = scores[i] - average;
            System.out.printf("\n%.2f\t%.2f",scores[i],deviation);
            variance += deviation * deviation;
        }
        double sd = Math.sqrt(variance/n);
        System.out.printf("\n\nStandard Deviation :%.2f",sd);
        int c=0;
        for(int i=0;i<n;i++){
            if(((average-sd)<= scores[i]) && ((average+sd)>= scores[i])){
             c++;               
            }
            
    
        }
        System.out.println("\nScore within one standard deviation :" + c);
	}
}
