package kata4.Load;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class EmailLoader implements Loader{
    private final Loader loader;

    public EmailLoader(Loader loader) {
        this.loader = loader;
    }

    @Override
    public List<String> load() {
        List<String> result = new ArrayList<String>();
        List<String> source = loader.load();
        
        for (String email : source) {
            if(isEmail(email)){
                result.add(email);
            }
        }
        
        return result;
    }
    
    private static final Pattern pattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    private boolean isEmail(String email) {
       
        return pattern.matcher(email).matches();
    }
    
    
}
