public class Lesson10_1 {

    /**
     * @Description: 状态转移方程
     * @param: [a- 第一个字符串, b- 第二个字符串]
     * @return: int- 两者之间的编辑距离
     */
    public static int getStrDistance(String a, String b) {

        // a， b都为空的情况
        if (a == null || b == null) return -1;

// 初始用于记录状态转移的的二维表
        int[][] d = new int[a.length() + 1][b.length() + 1];

        // 如果i为0，且j大于等于0，那么d[i][j]为j
        for (int j = 0; j <= b.length(); j++) {
            d[0][j] = j;
        }

        // 如果j为0，且i大于等于0，那么d[i][j]为i
        for (int i = 0; i <= a.length(); i++) {
            d[i][0] = i;
        }

// 实现状态转移方程
        // 状态转移由d[i][j]到d[i+1][j+1]
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {

                int r = 0;
                if (a.charAt(i) != b.charAt(j)) {
                    r = 1;
                }

                int first_append = d[i][j + 1] + 1;
                int second_append = d[i + 1][j] + 1;
                int replace = d[i][j] + r;

                int min = Math.min(first_append, second_append);
                min = Math.min(min, replace);
                d[i + 1][j + 1] = min;
            }
        }

        return d[a.length()][b.length()];
    }

    public static void main(String[] args) {
        System.out.println(Lesson10_1.getStrDistance("mouse", "mouuse"));
    }
}