package PatronIterator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author angel
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
      String fileName = new String("archivo.txt");
      
      try{
      BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
      
      IteratorReader iteratorReader = new IteratorReader(reader);
          for (String line : iteratorReader) {
              System.out.println(line);
          }
              
      /*
            while(true){
                String line = reader.redLine();
                if(line  == null) break;
                System.out.println(line);
            }
      */     
      }catch (FileNotFoundException exception){
          System.out.println("Error" + exception.getMessage());
      }catch(IOException ex){
          System.out.println("Error" + ex.getMessage());
          
          }

    }
    
}
