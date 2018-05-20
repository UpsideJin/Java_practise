package utils.Levin.Jin;

public class Bill extends Accountreceivable {
    private int sum = 0;

    public void formStr(int n) {
        String Type = getType(n);
        int Num = getNumber();
        String Memo = getMemo();
        String Date = getDate();

        if (n == 2) {
            sum = sum + Num;
        } else {
            sum = sum - Num;
        }
        String Str = Type + "   " + Num + "       " + sum + "          " + Memo + "       " + Date;
        db.add(Str);
        System.out.print("请选择（1-4）：");
    }

    public void showBill() {
        System.out.println("----------------------当前收支明细记录--------------------------");
        System.out.println("收支   账户金额   收支金额      说   明       时   间");
        for (int i = 0; i < db.size(); i++) {
            System.out.println(db.get(i).toString());
        }
        System.out.println("---------------------------------------------------------------");

    }
}