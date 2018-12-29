/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author BADRUL
 */
public class AdjacencyList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            String filelink="GRAPH.txt";
            File file=new File(filelink);
            Scanner B=new Scanner(file);
            String read=B.nextLine(); //reading 1st line
            StringTokenizer st=new StringTokenizer(read,","); //spliting 1st line
            int v=Integer.parseInt(st.nextToken()); //vertex number
            int e=Integer.parseInt(st.nextToken()); //edge number
            //ArrayList<ArrayList<String>> a=new ArrayList<ArrayList<String>>();
            ArrayList<String> a1=new ArrayList<String>();
            read=B.nextLine(); //reading 2nd line
            st=new StringTokenizer(read,","); //spliting 2nd lne
            while(st.hasMoreElements())
            {
                String s=st.nextToken();
                
                //int n1=(s.codePointAt(0))-49;
                String n2=s.charAt(0)+" --> "+s.charAt(1);
                a1.add(n2);
                
            




//                for(int i=0;i<a1.size()-1;i++)
//                {
//                   a1.add(n2);
//                   
//               
//                }
                

                //a1.add(n2);
              //a.add(n1,a1);
               
              

               
               
               
            }
            
            
            for(int i=0;i<a1.size();i++)
            {
                System.out.println(a1.get(i));
            }
            System.out.println();
 
                                   
            

            
        }
        catch(IOException e)
        {
            System.out.println("File not found");
        }
    }
    
    
}



