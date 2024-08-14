package Array;

import java.util.*;

public class sort_by_frequency {
    public static void main(String[] args) {
        int[] arr = {2,3,1,3,2};
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        LinkedHashMap<Integer, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int num : arr) {
            if(map.containsKey(num))
                 map.put(num, map.get(num) + 1);
            else
                map.put(num, 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            list.add(entry.getValue());
        }

//        Collections.sort(list, new Comparator<Integer>() {
//            public int compare(Integer a, Integer b) {
//                return a.compareTo(b);
//            }
//        });
        Collections.sort(list);
        for(int num : list) {
            for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if(entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(map);
        System.out.println(sortedMap);

        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            int x = entry.getValue();
            for(int i=0;i<x;i++) {
                ans.add(entry.getKey());
            }
        }

        int[] result = new int[ans.size()];
        for(int i=0;i<ans.size();i++) {
            result[i] = ans.get(i);
        }
        for(int x : result)
            System.out.print(x + " ");
    }
}
