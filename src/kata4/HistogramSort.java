package kata4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HistogramSort<T> implements Histogram {
    Histogram histogram;
    private Map<Integer, T> map = new TreeMap<Integer, T>();
    private Map<T, Integer> mapOG;
    
    public HistogramSort(Histogram histogram){
        this.histogram = histogram;
        this.mapOG = histogram.getMap();
        
        for (T key : mapOG.keySet()) {
            this.map.put(this.mapOG.get(key), key);
        }
        
    }

    @Override
    public Map getMap() {
        return this.mapOG;
    }

    @Override
    public Integer get(Object key) {
        return mapOG.get(key);
    }

    @Override
    public Set keySet() {
        return this.mapOG.keySet();
    }
    
    public Object getSort(Integer key) {
        return this.map.get(key);
    }
}
