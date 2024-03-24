import java.io.BufferedWriter;
import java.io.*;

public class FileHandling {
 public static void main(String[] args)throws Exception {
    File dir=new File("FileHandling");
    dir.mkdir();
    File file=new File(dir,"BufferFileData.doc");
    file.createNewFile();
    FileWriter fw=new FileWriter(file);
    fw.write("\"Dream Is NOt That Which You See While Sleeping,\nIt Is Someting That Does Not Let You Sleep\"");
    BufferedWriter bfw=new BufferedWriter(fw);
    bfw.newLine();
    bfw.write("If you want shine like a sun, first burn like a sun.");
    bfw.close();

    File file2=new File(dir,"BufferFileData.doc");
    FileReader fr=new FileReader(file2);
    BufferedReader br=new BufferedReader(fr);
    String str=br.readLine();
    while(str!=null)
    {
        System.out.println(str);
        str=br.readLine();
    }
    br.close();
 }   
}
