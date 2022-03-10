package day02;

/**
 * @author halley
 * @version 1.0
 * @description:你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有版本都是错的。
 *
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 *
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 *
 * @date 2021/12/8 10:12 上午
 */
public class T278_FirstBadVersion {
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
        T278_FirstBadVersion t278FirstBadVersion =new T278_FirstBadVersion();
        System.out.println(t278FirstBadVersion.firstBadVersion(214748364));
    }
}
