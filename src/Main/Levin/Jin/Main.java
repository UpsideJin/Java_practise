package Main.Levin.Jin;

import utils.Levin.Jin.Accountreceivable;
import utils.Levin.Jin.Bill;
import utils.Levin.Jin.Exit;
import utils.Levin.Jin.UI;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UI.showUI();
        Bill Family = new Bill();
        Accountreceivable transfer = new Accountreceivable();

        while (true) {
            Scanner input = new Scanner(System.in);
            int select = input.nextInt();
            switch (select) {
                case 1:
                    Family.showBill();
                    break;
                case 2:
                    Family.formStr(2);
                    break;
                case 3:
                    Family.formStr(3);
                    break;
                case 4:
                    Exit.apply();
                    break;

            }
        }
    }
}
