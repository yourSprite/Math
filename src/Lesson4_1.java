public class Lesson4_1 {

    public static void main(String[] args) {
        int grid = 63;
        long start, end = 0;
        start = System.currentTimeMillis();
        System.out.println(String.format("舍罕王给了这么多粒：%d", Lesson3_1.getNumnberOfWheat(grid)));
        end = System.currentTimeMillis();
        System.out.println(String.format("迭代法耗时%d毫秒", (end - start)));

        start = System.currentTimeMillis();
        System.out.println(String.format("舍罕王给了这么多粒：%d", (long)Math.pow(2, grid) - 1));
        end = System.currentTimeMillis();
        System.out.println(String.format("迭代法耗时%d毫秒", (end - start)));
    }

}