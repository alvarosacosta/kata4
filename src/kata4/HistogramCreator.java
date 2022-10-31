package kata4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HistogramCreator<T> implements Histogram {
    private final Map<T, Integer> map = new HashMap<T, Integer>();
    
    
    @Override
    public Set<T> keySet() {
        return this.map.keySet();
    }
    
    public void increment(T key) {
        this.map.put(key, this.map.containsKey(key) ? this.map.get(key) + 1 : 1);
    }

    @Override
    public Map<T, Integer> getMap() {
        return map;
    }

    @Override
    public Integer get(Object key) {
        return this.map.get(key);
    }
    
}