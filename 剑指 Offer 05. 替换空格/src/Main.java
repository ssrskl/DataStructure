/**
 * 请实现一个函数，把字符串 s 中的每个空格替换成"%20"。
 */
public class Main {

  // 1. 最无脑，使用replaceAll方法,实际上用的是java自带的算法
  public String replaceSpace(String s) {
    return s.replaceAll(" ", "%20");
  }

  /**
   *1。初始化一个StringBuilder
   *2. 遍历字符串s
   *
   */
  public String replaceSpace2(String s){
    StringBuilder stringBuilder = new StringBuilder();
    // 将字符串转换为字符数组，并遍历
    for (Character character: s.toCharArray()){
      // 为空格则追加%20,否则追加本身
      if (character == ' '){
        stringBuilder.append("%20");
      }else {
        stringBuilder.append(character);
      }
    }
    return stringBuilder.toString();
  }
  public static void main(String[] args) {
    String s = "We are happy.";
    Main main = new Main();
    String s1 = main.replaceSpace2(s);
    System.out.println(s1);
  }
}
