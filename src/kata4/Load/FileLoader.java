package kata4.Load;

import java.io.BufferedReader;
import java.util.List;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileLoader implements Loader {
    File file;

    public FileLoader(File file) {
        this.file = file;
    }

    @Override
    public List<String> load() {
        List<String> read = new ArrayList<String>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file));){
            while(true){
                String line = reader.readLine();
                if (line == null) break;
                read.add(line);
            
            }
        } catch (IOException ex) {
        }
        
        return read;
    }
    
    
}
