package algorithm.lab.uva.problems;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

public class uva_problem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int n = sc.nextInt(), m = sc.nextInt();
            String h = sc.nextLine();
            String[] temp = new String[m];
            int[] dis = new int[m];
            for (int i = 0; i < m; i++) {
                temp[i] = sc.nextLine();
                for (int j = 0; j < n - 1; j++) {
                    for (int k = j + 1; k < n; k++) {
                        if (temp[i].charAt(j) > temp[i].charAt(k)) {
                            dis[i]++;
                        }
                    }
                }
            }
            System.out.println("");
            do {
                int min = 10000;
                int i = 0, pos = 0;
                for (i = 0; i < m; i++) {
                    if (dis[i] < min) {
                        pos = i;
                        min = dis[i];
                    }
                }
                dis[pos] = 10000;
                if (min == 10000) {
                    break;
                }
                System.out.println(temp[pos]);
            } while (true);
            if (t < T - 1) {
                System.out.println();
            }
        }
    }
}
