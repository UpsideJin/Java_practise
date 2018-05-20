package utils.Levin.Jin;

import java.util.Scanner;

public class Exit {
    public static void apply() {
        Scanner input = new Scanner(System.in);
        System.out.print("确认是否退出？（Y/N）");
        String n = input.next();
        if (n.equals("Y")) {
            System.exit(0);
        } else {
            System.out.println("请选择（1-4）：");
        }
    }
}
