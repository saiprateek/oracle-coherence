import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

/**
 * @author Prateek Singh
 *
 */
public class CoherenceTest {

 /**
 * @param args
 */
 public static void main(String[] args) {
 String key = "key";
 String value = "this value is cached in coherence cache";
 CacheFactory.ensureCluster();
 NamedCache cache = CacheFactory.getCache("prateek-cache");
 cache.put(key, value);
 System.out.println("=================> Result : "+(String)cache.get(key));
 
 CacheFactory.shutdown();

 }

}
