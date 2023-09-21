
/*
 * QUESTION
 * you are given an m x n binary matrix of 1's(representing soldiers) and 0's
 * (representing civilians). The soldiers are positioned in front of the
 * civilians. That is, all the 1's will appear to the left of all the 0's in
 * each row./*
 * A row i is weaker than a row j if one of the following is true:/
 * 
 * /*
 * The number of soldiers in row i is less than the number of soldiers in row j.
 * Both rows have the same number of soldiers and i < j.
 * Return the indices of the k weakest rows in the matrix ordered from weakest
 * to strongest.
 */

// for solving this, we will follow sorting approach, for this we will be
// sorting rows

// at first, we will be calculating the soldiers strength by counting it using
// iteration and then we will be storing two values index value and position to
// verify whether the condition is satisfied or not 
//sorting wil be done in sorting in strength in ascending order to get the rows with less strength and to avoid conflict between the strength another sorting needed to be done in rows order

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