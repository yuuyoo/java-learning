package cn.technotes.java.base;

/**
 * <p>Title: StringLearning</p>
 * <p>Description: </p>
 *
 * @author DJL
 * @version 1.0.0
 * @date 2021/03/02 23:33
 */
public class StringLearning {

    public static void main(String[] args) {
        String str1 = new String("hello,world");
        String str2 = "hello,world";
        String str3 = "hello," + "world";

        /**
         * new String() 构造方法创建的字符串会在堆上创建对象
         * 字面量常量会分配在常量区
         */
        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
    }

}
