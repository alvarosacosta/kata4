package kata4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public interface Histogram<T> {
    public Map<T, Integer> getMap();
    public Integer get(T key);
    public Set<T> keySet();
    
}
