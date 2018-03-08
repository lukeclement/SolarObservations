import java.io.*;
import java.util.*;

public class Read{
    private String fileName;
    private String line=null;
    
    public Read(String name){
        fileName=name;
    }
    
    public ArrayList<ArrayList<Double>> results(){
        List<String> recordings=new ArrayList<>();
        try{
            FileReader fileReader = new FileReader(fileName);
            BufferedReader br=new BufferedReader(fileReader);
            while((line=br.readLine())!=null){
                String[] values=line.split("");
                String recording="";
                for(String a:values){
                    if(a.equals("0")||a.equals("1")||a.equals("2")||a.equals("3")||a.equals("4")||a.equals("5")||a.equals("6")||a.equals("7")||a.equals("8")||a.equals("9")||a.equals(".")){
                        //System.out.print(a);
                        recording+=a;
                    }else{
                        //System.out.print(" ");
                        recording+=",";
                    }
                    
                }
                recordings.add(recording);
                //System.out.println();
            }
            br.close();
        }catch(Exception ex){
            System.out.println("Error");
            System.out.println(ex);
        }
        
        ArrayList<Double> ISO=new ArrayList<>();
        ArrayList<Double> exp=new ArrayList<>();
        ArrayList<Double> meanCount=new ArrayList<>();//C1
        ArrayList<Double> sdCount=new ArrayList<>();//C4
        
        
        for(String r:recordings){
            String[] v=r.split(",");
            meanCount.add(Double.parseDouble(v[1]));
            sdCount.add(Double.parseDouble(v[6]));
            String[] eT=fileName.split(";");
            ISO.add(Double.parseDouble(eT[0]));
            exp.add(1/Double.parseDouble(eT[1]));
        }
        ArrayList<ArrayList<Double>> output=new ArrayList<ArrayList<Double>>();
        output.add(ISO);
        output.add(exp);
        output.add(meanCount);
        output.add(sdCount);
        
        return output;
    }
}
