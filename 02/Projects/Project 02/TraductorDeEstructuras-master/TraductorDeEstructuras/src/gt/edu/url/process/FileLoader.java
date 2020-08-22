package gt.edu.url.process;

import java.io.*;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class FileLoader {
            
    public String Read(String Name){
        File F;
        FileReader fileReader;
        try{
            F = new File(Name);
            fileReader = new FileReader(F);
            String S;
            try (BufferedReader BR = new BufferedReader(fileReader)) {
                S = "";
                String Aux = "";
                while(true){
                    Aux = BR.readLine();
                    if(Aux != null){
                        S = S + Aux + "\n";
                    }else{
                        break;
                    }
                }
            }
            fileReader.close();
            return S;
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
            return null;
    }
    
    public String FileLoader2(){
        File F;
        javax.swing.JFileChooser J = new javax.swing.JFileChooser();
        FileNameExtensionFilter docFilter = new FileNameExtensionFilter("Text Files","txt");
        J.setFileFilter(docFilter);
        J.showOpenDialog(J);
        String Path = J.getSelectedFile().getAbsolutePath();
        String Lecture = "";
        F = new File(Path);
        try{
            FileReader FR = new FileReader(F);
            BufferedReader BR = new BufferedReader(FR);
            String Aux;
            while((Aux = BR.readLine())!= null){
                Lecture = Lecture + Aux + "\n";
            }
            }catch(IOException e){
             JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
            return Lecture;
    }
}