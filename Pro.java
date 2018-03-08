import java.util.*;
import java.io.*;

class Pro{
    public static void main(String[] args){
        //Name is ISO;(1/Exp);.lst
        ArrayList<Double> X=new ArrayList<>();
        ArrayList<Double> Y=new ArrayList<>();
        ArrayList<Double> Yerr=new ArrayList<>();
        //Start at T(x) vs C(y)
        //T=1/100
        for(int i=0;i<6;i++){
            String lol="160;";
            switch(i){
                case 0:lol+="100;.lst";
                    break;
                case 1:lol+="160;.lst";
                    break;
                case 2:lol+="200;.lst";
                    break;
                case 3:lol+="250;.lst";
                    break;
                case 4:lol+="320;.lst";
                    break;
                case 5:lol+="400;.lst";
                    break;
            }
            Read lolz=new Read(lol);
            for(int j=0;j<lolz.results().get(0).size();j++){
                X.add(lolz.results().get(1).get(j));
                Y.add(lolz.results().get(2).get(j));
                Yerr.add(lolz.results().get(3).get(j));
            }
            
        }
        Graph g=new Graph(Y,X,Yerr,"Time(x) vs Count(Y)");
        
        X.clear();
        Y.clear();
        Yerr.clear();
        //T=1/200
        for(int i=0;i<6;i++){
            String lol="200;";
            switch(i){
                case 0:lol+="100;.lst";
                    break;
                case 1:lol+="160;.lst";
                    break;
                case 2:lol+="200;.lst";
                    break;
                case 3:lol+="250;.lst";
                    break;
                case 4:lol+="320;.lst";
                    break;
                case 5:lol+="400;.lst";
                    break;
            }
            Read lolz=new Read(lol);
            for(int j=0;j<lolz.results().get(0).size();j++){
                X.add(lolz.results().get(1).get(j));
                Y.add(lolz.results().get(2).get(j));
                Yerr.add(lolz.results().get(3).get(j));
            }
            
        }
        Graph gra=new Graph(Y,X,Yerr,"Time(x) vs Count(Y) (2)");
        
        X.clear();
        Y.clear();
        Yerr.clear();
        
        //G(x) vs C(y)
        
        //G=160
        for(int i=0;i<6;i++){
            String lol="";
            switch(i){
                case 0:lol+="160;";
                    break;
                case 1:lol+="200;";
                    break;
                case 2:lol+="400;";
                    break;
                case 3:lol+="800;";
                    break;
                case 4:lol+="1600;";
                    break;
                case 5:lol+="3200;";
                    break;
            }
            lol+="100;.lst";
            Read lolz=new Read(lol);
            for(int j=0;j<lolz.results().get(0).size();j++){
                X.add(lolz.results().get(0).get(j));
                Y.add(lolz.results().get(2).get(j));
                Yerr.add(lolz.results().get(3).get(j));
            }
            
        }
        Graph gr=new Graph(Y,X,Yerr,"Gain(x) vs Count(Y) ");
        
        X.clear();
        Y.clear();
        Yerr.clear();
        
        
        
        //G=200
        for(int i=0;i<6;i++){
            String lol="";
            switch(i){
                case 0:lol+="160;";
                    break;
                case 1:lol+="200;";
                    break;
                case 2:lol+="400;";
                    break;
                case 3:lol+="800;";
                    break;
                case 4:lol+="1600;";
                    break;
                case 5:lol+="3200;";
                    break;
            }
            lol+="160;.lst";
            Read lolz=new Read(lol);
            for(int j=0;j<lolz.results().get(0).size();j++){
                X.add(lolz.results().get(0).get(j));
                Y.add(lolz.results().get(2).get(j));
                Yerr.add(lolz.results().get(3).get(j));
            }
            
        }
        Graph grap=new Graph(Y,X,Yerr,"Gain(x) vs Count(Y) (2)");
        
        X.clear();
        Y.clear();
        Yerr.clear();
        
        //Uncertainty vs Time
        for(int i=0;i<6;i++){
            String lol="160;";
            switch(i){
                case 0:lol+="100;.lst";
                    break;
                case 1:lol+="160;.lst";
                    break;
                case 2:lol+="200;.lst";
                    break;
                case 3:lol+="250;.lst";
                    break;
                case 4:lol+="320;.lst";
                    break;
                case 5:lol+="400;.lst";
                    break;
            }
            Read lolz=new Read(lol);
            double xMean=0;
            double yMean=0;
            double err=0;
            double min=9999;
            double max=0;
            for(int j=0;j<lolz.results().get(0).size();j++){
                if(lolz.results().get(3).get(j)*lolz.results().get(3).get(j)<min){
                    min=lolz.results().get(3).get(j)*lolz.results().get(3).get(j);
                }if(lolz.results().get(3).get(j)*lolz.results().get(3).get(j)>max){
                    max=lolz.results().get(3).get(j)*lolz.results().get(3).get(j);
                }
                xMean+=lolz.results().get(2).get(j);
                yMean+=lolz.results().get(3).get(j)*lolz.results().get(3).get(j);
                //X.add(lolz.results().get(1).get(j));
                //Y.add(lolz.results().get(3).get(j));
                //Yerr.add(0.0);
            }
            err=(max-min)/2;
            X.add(xMean/lolz.results().get(0).size());
            Y.add(yMean/lolz.results().get(0).size());
            Yerr.add(err);
            
        }
        Graph graph=new Graph(Y,X,Yerr,"Count(x) vs Uncertainty(Y)");
        X.clear();
        Y.clear();
        Yerr.clear();
        
        for(int i=0;i<6;i++){
            String lol="200;";
            switch(i){
                case 0:lol+="100;.lst";
                    break;
                case 1:lol+="160;.lst";
                    break;
                case 2:lol+="200;.lst";
                    break;
                case 3:lol+="250;.lst";
                    break;
                case 4:lol+="320;.lst";
                    break;
                case 5:lol+="400;.lst";
                    break;
            }
            Read lolz=new Read(lol);
            double xMean=0;
            double yMean=0;
            double err=0;
            double min=9999;
            double max=0;
            for(int j=0;j<lolz.results().get(0).size();j++){
                if(lolz.results().get(3).get(j)*lolz.results().get(3).get(j)<min){
                    min=lolz.results().get(3).get(j)*lolz.results().get(3).get(j);
                }if(lolz.results().get(3).get(j)*lolz.results().get(3).get(j)>max){
                    max=lolz.results().get(3).get(j)*lolz.results().get(3).get(j);
                }
                xMean+=lolz.results().get(2).get(j);
                yMean+=lolz.results().get(3).get(j)*lolz.results().get(3).get(j);
                //X.add(lolz.results().get(1).get(j));
                //Y.add(lolz.results().get(3).get(j));
                //Yerr.add(0.0);
            }
            err=(max-min)/2;
            X.add(xMean/lolz.results().get(0).size());
            Y.add(yMean/lolz.results().get(0).size());
            Yerr.add(err);
            
        }
        Graph grapher=new Graph(Y,X,Yerr,"Count(x) vs Uncertainty(Y) (2)");
    
        /*String test="100;100;.lst";
        String line=null;
        
        Read read=new Read(test);
        //Getting results
        ArrayList<ArrayList<Double>> r=read.results();
        for(ArrayList<Double> a:r){
            for(Double d:a){
                System.out.println(d);
            }
        }*/
    }
}
