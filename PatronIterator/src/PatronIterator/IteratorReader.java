package PatronIterator;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;

/**
 * Patron Iterator
 * Hacemos un recorido de forma secuencial a un agregado.
 * @author angel
 */
public class IteratorReader implements Iterable<String> {
   
    private final BufferedReader reader;

    public IteratorReader(BufferedReader reader) {
        this.reader = reader;
    }
    
    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>(){
          String currentLine = readLine();

            @Override
            public boolean hasNext() {
                return currentLine != null;
            }

            @Override
            public String next() {
                String resultLine = currentLine;
                currentLine = readLine();
                return resultLine;
            }

            @Override
            public void remove() {
                Iterator.super.remove(); 
            }

            private String readLine() {
              try {
                  return reader.readLine();
              } catch (IOException ex) {
                    return null;
              }
            }
                   
        };
    }
}
