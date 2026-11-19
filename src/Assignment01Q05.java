public class Assignment01Q05 {
    public static int findShortestPath(int[][] m, int i, int j) {
        boolean[] visited = new boolean[m.length];
        visited[i] = true;

        return findShortestPathRecursive(m, new int[]{i}, 1, j, 0, visited);
        
    }

    public static int findShortestPathRecursive(int[][] m, int[] level, int size, int j, int steps, boolean[] visited) {
        if (visited[j]) return steps;
        if (size==0) return -1;

        int n = m.length;
        int[] next = new int[n];
        int nextSize = 0;

        for (int t = 0; t<size; t++) {
            int x = level[t];
            for (int k=0; k<n; k++) {
                if (m[x][k] == 1 && !visited[k]) {
                    visited[k] = true;
                    next[nextSize] = k;
                    nextSize++;
                }
            }
        }

        return findShortestPathRecursive(m, next, nextSize, j, steps+1, visited);

    }


    public static void main(String[] args) {
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 0, 1)); // -1
        System.out.println(
            findShortestPath(new int[][]{{0,0,0}, {0,0,0}, {0,0,0}}, 1, 1)); // 0
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,0}, {0,0,1,0}, {0,0,0,1}, {1,0,0,0}}, 0, 2)); // 2
        System.out.println(
            findShortestPath(new int[][]{{0,1,0,1}, {0,0,0,1}, {0,0,0,0}, {0,0,1,0}}, 0, 2)); // 2
    }
}