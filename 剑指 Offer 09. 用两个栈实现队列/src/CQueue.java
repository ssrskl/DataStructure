import java.util.LinkedList;

/**
 * @author 猫颜
 * @date 2021/10/20 8:04
 * 剑指 Offer 09. 用两个栈实现队列
 */
public class CQueue {
    LinkedList<Integer> A,B;
    public CQueue() {
        A = new LinkedList<>();
        B = new LinkedList<>();
    }

    // 添加队尾，即为入栈
    public void appendTail(int value) {
        A.addLast(value);
    }

    /**
     * 删除队首
     * 1. 将A栈出栈，放入B栈
     * 2. 将B栈栈顶出栈
     * 3. 将B栈出栈，放入A栈
      */
    public int deleteHead() {
        if (A.isEmpty()){
            return -1;
        }
        while (!A.isEmpty()){
            B.addLast(A.removeLast());
        }
        return B.removeLast();
//        B.removeLast();
//        while (!B.isEmpty()){
//            A.addLast(B.removeLast());
//        }

    }
    public static void main(String[] args) {
        CQueue cQueue = new CQueue();
        cQueue.A.add(1);
        cQueue.A.add(2);
        cQueue.A.add(3);
        cQueue.A.add(4);
        cQueue.appendTail(11);
    }
}
