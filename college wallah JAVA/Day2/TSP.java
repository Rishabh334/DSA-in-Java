import java.util.ArrayList;

public class TSP {

    static int N; // Number of nodes
    static int[][] graph; // Graph representation
    static ArrayList<Integer> bestPath;
    static int minCost;

    static void tsp(int currPos, int[] visited, int count, int cost, ArrayList<Integer> path) {
        if (count == N && graph[currPos][0] != 0) { // If all nodes have been visited
            if (cost + graph[currPos][0] < minCost) { // Check if current path is the best so far
                minCost = cost + graph[currPos][0];
                bestPath = new ArrayList<>(path);
                bestPath.add(0); // Add the return to start node
            }
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] == 0 && graph[currPos][i] != 0) {
                visited[i] = 1;
                path.add(i);
                tsp(i, visited, count + 1, cost + graph[currPos][i], path);
                visited[i] = 0;
                path.remove(path.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        // Example graph initialization
        N = 4;
        graph = new int[][]{{0, 10, 15, 20},
                             {10, 0, 35, 25},
                             {15, 35, 0, 30},
                             {20, 25, 30, 0}};

        int[] visited = new int[N];
        visited[0] = 1; // Start with the first node
        ArrayList<Integer> path = new ArrayList<>();
        path.add(0);
        bestPath = new ArrayList<>();
        minCost = Integer.MAX_VALUE;
        tsp(0, visited, 1, 0, path);

        System.out.println("Minimum cost: " + minCost);
        System.out.println("Best Path: " + bestPath);
    }
}

