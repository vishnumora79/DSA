package Array;

import java.util.HashMap;
import java.util.Map;
public class Winners_lc {
    public int countWinners(int n, int[][] pick) {
        // Initialize a map to store the count of balls picked by each player
        Map<Integer, Map<Integer, Integer>> playerPicks = new HashMap<>();

        // Iterate through each pick
        for (int[] p : pick) {
            int player = p[0];
            int color = p[1];

            // Initialize the player's pick map if it doesn't exist
            if (!playerPicks.containsKey(player)) {
                playerPicks.put(player, new HashMap<>());
            }

            // Increment the count of the picked color
            playerPicks.get(player).put(color, playerPicks.get(player).getOrDefault(color, 0) + 1);
        }

        // Initialize the count of winners
        int winners = 0;

        // Iterate through each player
        for (int player = 0; player < n; player++) {
            // Check if the player has picked enough balls of the same color
            if (playerPicks.containsKey(player)) {
                for (int count : playerPicks.get(player).values()) {
                    if (count > player) {
                        winners++;
                        break;
                    }
                }
            }
        }

        return winners;
    }

    public static void main(String[] args) {
        Winners_lc counter = new Winners_lc();

        // Example 1
        int n = 4;
        int[][] pick = {{0, 0}, {1, 0}, {1, 0}, {2, 1}, {2, 1}, {2, 0}};
        System.out.println(counter.countWinners(n, pick)); // Output: 2

        // Example 2
        n = 5;
        pick = new int[][]{{1, 1}, {1, 2}, {1, 3}, {1, 4}};
        System.out.println(counter.countWinners(n, pick)); // Output: 0

        // Example 3
        n = 5;
        pick = new int[][]{{1, 1}, {2, 4}, {2, 4}, {2, 4}};
        System.out.println(counter.countWinners(n, pick)); // Output: 1
    }
}


