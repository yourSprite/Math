import java.util.ArrayList;

public class Lesson5_1 {

    public static long[] rewards = {1, 2, 5, 10}; // 四种面额纸币

    /**
     * @Description: 使用函数的递归调用，找出所有可能的奖赏组合
     * @param: [totalReward- 奖赏总金额, result- 保存当前解]
     * @return: void
     */
    public static void get(long totalReward, ArrayList<Long> result) {

        // 递归结束条件
        if (totalReward == 0) {
            System.out.println(result);
            return;
        } else if (totalReward < 0) {
            return;
        } else {
            for (int i = 0; i < rewards.length; i++) {
                ArrayList<Long> newResult = (ArrayList<Long>) (result.clone());
                newResult.add(rewards[i]); // 记录当前的选择，解决一点问题
                get(totalReward - rewards[i], newResult); // 剩下的问题，留给嵌套调用取解决
            }
        }
    }

    public static void main(String[] args) {

        int totalReward = 10;
        Lesson5_1.get(totalReward, new ArrayList<Long>());
    }
}
