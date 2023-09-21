/*
 * @lc app=leetcode id=1337 lang=java
 *
 * [1337] The K Weakest Rows in a Matrix
 */

// @lc code=start
import java.util.ArrayList;
import java.util.*;

public class matrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int m = mat.length;
        int n = mat[0].length;
        int strength;

        RowStrength[] rows = new RowStrength[m];
        for (int i = 0; i < m; i++) {
            strength = 0;
            for (int j = 0; j < n; j++) {
                strength += mat[i][j];
            }
            rows[i] = new RowStrength(i, strength);
        }

        Arrays.sort(rows, Comparator.comparingInt((RowStrength row) -> row.strength)
                .thenComparingInt(row -> row.index));

        // Extract the row indices of the k weakest rows
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = rows[i].index;
        }

        return result;
    }

    class RowStrength extends matrix {
        int index;
        int strength;

        public RowStrength(int index, int strength) {
            this.index = index;
            this.strength = strength;
        }
    }
}