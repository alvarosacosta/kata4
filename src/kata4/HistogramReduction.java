package kata4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HistogramReduction<T> implements Histogram {
    public final Histogram histogram;
    private final Map<T, Integer> map = new HashMap<T, Integer>();
    
    public HistogramReduction(Histogram histogram) {
        this.histogram = histogram;
        Map<T, Integer> source = histogram.getMap();
        
        for (T key : source.keySet()){
            if(source.get(key) <= 10){
                this.map.put((T) "Otro", this.map.containsKey("Otro") ? this.map.get("Otro") + source.get(key) : source.get(key));
            } else {
                this.map.put(key, source.get(key));
            }
        }
    }
    
    @Override
    public Map getMap() {
        return map;
    }

    @Override
    public Set<T> keySet() {
        return this.map.keySet();
    }

    @Override
    public Integer get(Object key) {
        return this.map.get(key);
    }
    
    
}
