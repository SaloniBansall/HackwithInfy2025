
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;

public class GCDecomposition {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Set<Integer> st = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            st.add(x);
        }
        if (st.size() < 2) {
            System.out.println("No");
        }
        List<Integer> l = new ArrayList<>(st);
        // build graph on the basis of two numbers whose gcd is 1
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < l.size(); i++) {
            adj.add(new ArrayList<>());
        }
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                int a = l.get(i);
                int b = l.get(j);
                if (GCD(a, b) == 1) {
                    adj.get(i).add(j);
                    adj.get(j).add(i);
                }
            }
        }
        if (isBipartite(adj)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

    public static boolean isBipartite(List<List<Integer>> adj) {
        // write your code here
        int[] color = new int[adj.size()];
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < adj.size(); i++) {
            if (color[i] == 0) {
                color[i] = 1;
                q.add(i);
                while (!q.isEmpty()) {
                    int node = q.poll();
                    for (int neigh : adj.get(node)) {
                        if (color[neigh] == 0) {
                            color[neigh] = 3 - color[node];
                            q.add(neigh);

                        } else if (color[neigh] == color[node]) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static int GCD(int a, int b) {
        if (a % b == 0) {
            return b;
        }
        return GCD(b, a % b);
    }

}
