import java.io.*;
public class FileOpWithPrintWriter{
    public static void main(String[] args)throws Exception {
    
        File dir=new File("PrintWriter");
        dir.mkdir();
        File file= new File(dir, "PrintWriter.txt");
        file.createNewFile();
        
        PrintWriter pw=new PrintWriter(file);
        pw.print(1);
        pw.println("->PrintWriter class is used with FileWriter.");
        pw.print(2);
        pw.println("->PrintWriter is used to write various type of data in file.");
        pw.println("such as: boolen,int,string etc.");
        pw.println(100);
        pw.println(true);
        pw.close();
    }
    
    

}
