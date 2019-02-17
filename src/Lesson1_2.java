import java.math.BigInteger;

public class Lesson1_2 {

    /**
     * @Description: 向左移位
     * @param: [num- 等待移位的十进制数, m- 向做梦移的位数]
     * @return: int- 移位后的十进制数
     */
    public static int leftShift(int num, int m) {
        return num << m;
    }

    /**
     * @Description: 向右移位
     * @param: [num- 等待移位的十进制数, m- 向右移的位数]
     * @return: int- 移位后的十进制数
     */
    public static int rightShift(int num, int m) {
        return num >>> m; // 逻辑右移>>，算数右移>>>，java，python中第一位为符号位
    }

    public static void main(String[] args) {

        int num = 53;
        int m = 1;
        System.out.println(String.format("数字%d的二进制左移%d位是%d", num, m, Lesson1_2.leftShift(num, m)));
        System.out.println(String.format("数字%d的二进制右移%d位是%d", num, m, Lesson1_2.rightShift(num, m)));

        System.out.println();

        m = 3;
        System.out.println(String.format("数字%d的二进制左移%d位是%d", num, m, Lesson1_2.leftShift(num, m)));
        System.out.println(String.format("数字%d的二进制右移%d位是%d", num, m, Lesson1_2.rightShift(num, m)));

        System.out.println();

        System.out.println("左移一位翻倍，右移一位除以2并求整数商");
        System.out.println("左移n位乘2的n次方，右移n位除以2的n次方并求整数商");
    }
}
