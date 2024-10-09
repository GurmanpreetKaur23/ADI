// https://leetcode.com/problems/kth-smallest-element-in-a-sorted-matrix/description/

class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>() ;

        for(int i=0 ; i<matrix.length ; i++) {
            for(int j=0; j<matrix[0].length ; j++) {
                pq.add(matrix[i][j]) ;
            }
        }

        while(k-->1) {
            pq.poll() ;
        }
        return pq.poll() ;

    }
}
