package kata4;

import kata4.Load.Loader;
import kata4.Load.FileLoader;
import kata4.Load.EmailLoader;
import java.io.File;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        Histogram<String> histogram = new Histogram<String>();
        
        Loader loader = new EmailLoader(new FileLoader(new File("email.txt")));
        List<String> emails = loader.load();
            
        for (String email : emails) {
                histogram.increment(email);
        }
        
        HistogramDisplay histogramDisplay = new HistogramDisplay("Histogram display", histogram);
        histogramDisplay.execute();
        
    }
    
}
