package Array;


import java.util.Map;
import java.util.HashMap;

public class Winners {
    public static int winningPlayerCount(int n, int[][] pick) {
        HashMap<Integer, Map<Integer, Integer>> map= new HashMap<>();

        for(int[] arr : pick) {
            int player = arr[0];
            int color = arr[1];
            if(!map.containsKey(player)) {
                map.put(player, new HashMap<>());
            }

            map.get(player).put(color, map.get(player).getOrDefault(color, 0) + 1);

        }
        int winners = 0;
        for(int player = 0;player < n;player++) {
            if(map.containsKey(player)) {
                System.out.println(map.get(player).values());
                for(int cnt : map.get(player).values()) {

                    if(cnt > player) {
                        winners++;
                        break;
                    }
                }
            }
        }
        return winners;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] pick = {{0,0},{1,0},{1,0},{2,1},{2,1},{2,0}};
        int ans = winningPlayerCount(n, pick);
        System.out.println(ans);
    }
}
