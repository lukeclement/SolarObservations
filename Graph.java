import java.util.*;
import java.io.*;

public class Graph{
    public Graph(ArrayList<Double> Y, ArrayList<Double> X, ArrayList<Double> YE, String name){
        
        
        //Writing grapher
        System.out.println("Writing up python code...");
        String pythonCode="graph.py";
        try{
            int da=0;
            FileWriter write = new FileWriter(pythonCode, false);
            PrintWriter print_line = new PrintWriter(write);
            print_line.printf( "%s" + "%n" , "import numpy as n");
            print_line.printf( "%s" + "%n" , "import matplotlib.pyplot as plt");
            print_line.printf( "%s" + "%n" , "plt.style.use('_classic_test')");
            print_line.printf( "%s" , "x=n.array([");
            for(int i=da;i<X.size();i++){
                if(i==da){
                    print_line.printf( "%s" , X.get(i));
                }else if(i>da){
                    print_line.printf( "%s" , ","+X.get(i));
                }
                
            }
            print_line.printf( "%s" + "%n" , "])");
            print_line.printf( "%s" , "y=n.array([");
            for(int i=da;i<X.size();i++){
                if(i==da){
                    print_line.printf( "%s" , Y.get(i));
                }else if(i>da){
                    print_line.printf( "%s" , ","+Y.get(i));
                }
            }
            print_line.printf( "%s" + "%n", "])");
            print_line.printf( "%s" , "err=n.array([");
            for(int i=da;i<X.size();i++){
                if(i==da){
                    print_line.printf( "%s" , YE.get(i));
                }else if(i>da){
                    print_line.printf( "%s" , ","+YE.get(i));
                }
            }
            print_line.printf( "%s" + "%n", "])");
            print_line.printf( "%s" + "%n", "plt.figure(num=None, figsize=(8,6), dpi=80, facecolor='w', edgecolor='k')");
            print_line.printf( "%s" + "%n", "plt.errorbar(x,y,yerr=err,fmt='x')");
            print_line.printf( "%s" + "%n", "plt.savefig(\""+name+".png\")");
            print_line.close();
            
            System.out.println("Python coded!");
        }catch(Exception ex){
            System.out.println("A problem occured!");
            System.out.println(ex);
        }
        
        //Executing grapher
        System.out.println("Executing python...");
        Process p;
        try{
            p = Runtime.getRuntime().exec("python graph.py");
            p.waitFor();
            System.out.println("Finished successfully!");
        }catch(Exception ex){
            System.out.println("Something has went wrong!");
            System.out.println(ex);
        }
    }
}
