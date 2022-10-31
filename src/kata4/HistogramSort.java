package kata4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HistogramSort<T> implements Histogram {
    Histogram histogram;
    private Map<T, Integer> map = new TreeMap<T, Integer>();
    
    public HistogramSort(Histogram histogram){
        this.histogram = histogram;
        map = histogram.getMap();
        
    }

    @Override
    public Map getMap() {
        return this.map;
    }

    @Override
    public Integer get(Object key) {
        return this.map.get(key);
    }

    @Override
    public Set keySet() {
        return this.map.keySet();
    }
    
}
