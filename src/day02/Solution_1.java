package day02;

/**
 * @author halley
 * @version 1.0
 * @description:
 * @date 2021/12/8 10:12 上午
 */
public class Solution_1 {
    public boolean isBadVersion(int n){
        if(n<0) return  false;
        else  return true;
    }
    public int firstBadVersion(int n) {
        if (isBadVersion(0)) return 0;//本应从-1开始，但是right - left可能会越界。因此从0开始，并首先判断。
        int left = 0, right = n;
        while (left+1!=right) {
            int mid =left+(right - left) / 2;
            if (!isBadVersion(mid)) {
                left=mid;
            } else {
                right=mid;
            }
        }
        return right;
    }

    public static void main(String[] args) {
        Solution_1 solution_1=new Solution_1();
        System.out.println(solution_1.firstBadVersion(214748364));
    }
}
