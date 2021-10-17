import java.util.*;

/**
 * @author 猫颜
 * @date 2021/10/17 14:51
 * 删除排序数组中的重复项
 * 给你一个有序数组 nums ，请你 原地 删除重复出现的元素，使每个元素 只出现一次 ，返回删除后数组的新长度。
 * 不要使用额外的数组空间，你必须在 原地 修改输入数组 并在使用 O(1) 额外空间的条件下完成。
 */
public class DeleteRepeatItem {
        public int removeDuplicates(int[] A) {
        // 判断边界条件
        if (A == null|| A.length == 0){
            return 0;
        }
        int left = 0;//左指针
//        int right = 0; // 右指针
        // 遍历数组
        for (int right = 1; right < A.length; right++) {
            System.out.println("乐翻天："+left);
            // 如果一样，左不动，右边向前
            // 如果不一样，则左向前移动一个，并被右指针赋值
            if(A[left] != A[right]){
                // 左+1
                left++;
                // 右边给左赋值
                A[left] = A[right];
            }
        }
        //返回左指针的大小

        return left+1;
    }
//    public int removeDuplicates(int[] A) {
////边界条件判断
//        if (A == null || A.length == 0) {
//            return 0;
//        }
//        int left = 0;
//        for (int right = 1; right < A.length; right++)
//            //如果左指针和右指针指向的值一样，说明有重复的，
//            //这个时候，左指针不动，右指针继续往右移。如果他俩
//            //指向的值不一样就把右指针指向的值往前挪
//        {
//            if (A[left] != A[right]) {
//                A[++left] = A[right];
//            }
//        }
//        return ++left;
//    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        DeleteRepeatItem deleteRepeatItem = new DeleteRepeatItem();
        int i = deleteRepeatItem.removeDuplicates(nums);
        for (int num :
                nums) {
            System.out.println(num);
        }
        System.out.println(i);
    }
}
