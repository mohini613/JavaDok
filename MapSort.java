          import java.util.Map;
          import java.util.TreeMap;
          import java.util.Comparator;

          public class MapSort {
          public static void main(String[] args) {
              System.out.println("MapSort loaded successfully");
          }

              // Sort by VALUE
              public static <K, V extends Comparable<V>> Map<K, V> sortByValue(Map<K, V> unsortedMap) {
                  Map<K, V> sortedMap = new TreeMap<>(new ValueComparator<>(unsortedMap));
                  sortedMap.putAll(unsortedMap);
                  return sortedMap;
              }

              // Sort by KEY
              public static <K extends Comparable<K>, V> Map<K, V> sortByKey(Map<K, V> unsortedMap) {
                  return new TreeMap<>(unsortedMap);
              }
          }

          class ValueComparator<K, V extends Comparable<V>> implements Comparator<K> {

              private final Map<K, V> map;

              public ValueComparator(Map<K, V> map) {
                  this.map = map;
              }

              @Override
              public int compare(K k1, K k2) {
                  int compare = map.get(k1).compareTo(map.get(k2));

                  // VERY IMPORTANT: avoid key collision in TreeMap
                  if (compare == 0) {
                      return 1;
                  }
                  return compare;
              }
          }
