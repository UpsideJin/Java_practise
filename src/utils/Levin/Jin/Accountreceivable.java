package utils.Levin.Jin;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Accountreceivable {
    protected final static Scanner input = new Scanner(System.in);
    protected String Type;
    protected String str;
    protected String date;
    protected int number;
    protected ArrayList db = new ArrayList();
    protected int sum = 0;

    public String getType(int n) {
        if (n == 2) {
            Type = "支出";
        } else {
            Type = "收入";
        }
        return Type;
    }

    public int getNumber() {
        System.out.print("本次" + Type + "金额：");
        number = input.nextInt();
        return number;
    }

    public String getMemo() {
        System.out.print("本次" + Type + "说明：");
        str = input.next();
        return str;
    }

    public String getDate() {
        Date day = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyy-MM-dd HH:mm:ss");
        date = dateFormat.format(day);
        return date;
    }


}
