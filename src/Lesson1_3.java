import java.math.BigInteger;

public class Lesson1_3 {

    /**
     * @Description: 二进制按位"或"的操作
     * @param: [num1- 第一个数字, num2- 第二个数字]
     * @return: int- 二进制按位或的数字
     */
    public static int or(int num1, int num2) {
        return (num1 | num2);
    }


    /**
     * @Description: 二进制按位"与"的操作
     * @param: [num1- 第一个数字, num2- 第二个数字]
     * @return: int- 二进制按位与的数字
     */
    public static int and(int num1, int num2) {
        return (num1 & num2);
    }

    /**
     * @Description: 二进制按位"亦或"的操作
     * @param: [num1- 第一个数字, num2- 第二个数字]
     * @return: int- 二进制按位亦或的数字
     */
    public static int xor(int num1, int num2) {
        return (num1 ^ num2);
    }

    public static void main(String[] args) {

        int a = 53;
        int b = 35;

        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位'或'结果是%d(%s)",
                a, Lesson1_1.decimalToBinary(a),
                b, Lesson1_1.decimalToBinary(b),
                Lesson1_3.or(a, b), Lesson1_1.decimalToBinary(Lesson1_3.or(a, b))));
        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位'与'结果是%d(%s)",
                a, Lesson1_1.decimalToBinary(a),
                b, Lesson1_1.decimalToBinary(b),
                Lesson1_3.and(a, b), Lesson1_1.decimalToBinary(Lesson1_3.and(a, b))));
        System.out.println(String.format("数字%d(%s)和数字%d(%s)的按位'异或'结果是%d(%s)",
                a, Lesson1_1.decimalToBinary(a),
                a, Lesson1_1.decimalToBinary(a),
                Lesson1_3.xor(a, a), Lesson1_1.decimalToBinary(Lesson1_3.xor(a, a))));
    }
}
