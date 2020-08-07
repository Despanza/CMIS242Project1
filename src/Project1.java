import javax.swing.*;
import java.io.*;
/* Project 1
Sterling Despanza
January 26 2020
Find Minimum, Maximum and Average
 */

import static java.lang.Double.parseDouble;

public class Project1 {
    public static void main(String[] args) throws IOException {

        Weight[] weight = new Weight[25];//cannot get weight to accept a string conversion. Also cannot compare values of Type Weight
        double[] weightd = new double[25];
        JFileChooser chooser = new JFileChooser();//used to choose file
        JButton showFileDialogButton = new JButton("Open File");// creating button
        int returnVal = chooser.showOpenDialog(null);
        if(returnVal == chooser.APPROVE_OPTION){//if clicked perform
            File selected = chooser.getSelectedFile();
            System.out.println(selected.getAbsoluteFile());//Prints file path of chosen file
            FileReader fr = new FileReader(selected.getAbsoluteFile());//used to know what file to read from and what location
            BufferedReader br = new BufferedReader(fr);
            String line;
            int i = 0;
            Double d = 0.0;
            while((line = br.readLine()) != null){//reading until no results, to store into an array
               // weight[i] = new Weight(line);
                if(i > 24){ //checking to see if data set contains more than 25 numbers. Arrays start at 0
                    throw new IOException("To many records, choose a file with 25 or less");

                }
                weightd[i] = d.parseDouble(line);//used to get double value from file

                i++;
            }


                Project1 p1 = new Project1();

                System.out.println("The minimum is: " + p1.findMinimum(weightd));
                System.out.println("The maximum is: " + p1.findMaximum(weightd));
                System.out.println("The average is: " + p1.findAverage(weightd));



        }




    }
    private static double findMinimum(double [] weights){
        double minimum = weights[0];//used to have a value to compare to
        for (int i = 1; i< weights.length; i++ ){ // goes through line by line
           if(minimum > (weights[i])){ //Compares current line to the current minimum
               minimum = weights[i];//set new minimum if true
            }
        }
        return minimum;
    }
    private double findMaximum(double [] weights){
        double maximum = weights[0];//used to have a value to compare to
        for(int i = 1; i < weights.length; i++){// goes through line by line
            if(weights[i] > maximum){//Compares current line to the current maximum
                maximum = weights[i];//set new maximum if true
            }
        }
        return maximum;
    }
    private double findAverage(double[] weights){
        double total = 0;//used to keep a running total
        for (int i = 0; i < weights.length; i++){
            total = total + weights[i]; //used to update total after reading each line
        }
        double average = total / weights.length;//formula to find average
        return average;
    }
}
