package mayton.exods.lru;

public interface LRU<K,V> {

    V lookup(K k);

}
