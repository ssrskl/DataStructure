import java.util.LinkedList;

public class Main {
  public int[] reversePrint(ListNode head) {
    //计数就完事=-=
    ListNode cur = head;
    int count = 0;
    // 遍历并统计节点个数
    while (cur != null) {
      cur = cur.next;
      count++;
    }
    //根据节点个数新建数组
    int[] arr = new int[count];

    cur = head;
    count--;
    // 遍历节点，并反着放到数组中
    while (cur != null && count >= 0) {
      arr[count--] = cur.val;
      cur = cur.next;
    }
    return arr;
  }
  // 2. 使用栈的方法
  public int[] reversePrint2(ListNode head){
    LinkedList<Integer> stack = new LinkedList<Integer>();
    // 循环入栈
    while(head != null) {
      stack.addLast(head.val);
      head = head.next;
    }
    // 根据栈长创建数组
    int[] res = new int[stack.size()];
    // 出栈放入数组
    for(int i = 0; i < res.length; i++) {
      res[i] = stack.removeLast();
    }
    return res;
  }

  public static void main(String[] args) {
    // 实例化节点
    ListNode head = new ListNode(1);
    ListNode second = new ListNode(3);
    ListNode three = new ListNode(2);
    // 构建指向引用
    head.next = second;
    second.next = three;

    Main main = new Main();
    for (int i:main.reversePrint2(head)){
      System.out.println(i);
    }
//    System.out.println(ints);
  }
}

class ListNode{
  int val;
  ListNode next;

  public ListNode(int val) {
    this.val = val;
  }
}
