package kata4.Load;

import java.util.ArrayList;
import java.util.List;

public class EmailParser implements Loader{
    public final Loader loader;

    public EmailParser(Loader loader) {
        this.loader = loader;
    }
    
    @Override
    public List<String> load() {
        List<String> result = new ArrayList<String>();
        List<String> source = loader.load();
        
        for (String email : source) {
                result.add(email.substring(email.indexOf("@") + 1));
        }
        
        return result;
    }
    
}
