package day06;

import org.junit.Test;

/**
 * @author halley
 * @version 1.0
 * @description: TODO
 * @date 2021/12/12 12:59 下午
 */
public class T566_MatrixReshape {
    public int[][] matrixReshape(int[][] mat, int r, int c){//二维数组
        int row=mat.length;
        int col=mat[0].length;
        if(row*col!=r*c) return mat;
        int m=0,n=0;
        int[][] newmat=new int[r][c];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                newmat[m][n++]=mat[i][j];
                if(n==c){
                    n=0;
                    m++;
                }
            }
        }
        return newmat;
    }
    @Test
    public void test_566(){
        matrixReshape(new int[][]{{1,2,3},{4,5,6}},3,2);
    }
}
