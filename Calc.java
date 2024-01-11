// import calc.*;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        // コマンドプロンプトを使用するとコンパイルのタイミングでクラスが作成呼び出されたクラスのクラスファイルが作成される
        double x;
        double y;
        String mark;
        
        System.out.println("計算したい数字1を入力してください(半角数字)");
        try {
            x = new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            System.out.println("半角数字を入力してください。");
            throw new IllegalArgumentException("プログラムを中断します。");
        }
        System.out.println("計算したい記号を入力してください(半角,+,-,*,/)");
        try {
            mark = new Scanner(System.in).nextLine();
        } catch (Exception e) {
            System.out.println("半角で計算したい記号(+,-,*,/)を入力してください。");
            throw new IllegalArgumentException("プログラムを中断します。");
        }
        System.out.println("計算したい数字2を入力してください(半角数字)");
        try {
            y = new Scanner(System.in).nextDouble();
        } catch (Exception e) {
            System.out.println("半角数字を入力してください。");
            throw new IllegalArgumentException("プログラムを中断します。");
        }

        switch (mark) {
            case "+":
                System.out.println("足し算の結果は" + Add.add(x, y) + "です。");
                break;
            case "-":
                System.out.println("引き算の結果は" + Sub.sub(x, y) + "です。");
                break;
            case "*":
                System.out.println("掛け算の結果は" + Multi.multi(x, y) + "です。");
                break;
            case "/":
                System.out.println("割り算の結果は" + Div.div(x, y) + "です。");
                break;
            default:
                System.out.println("記号は半角で入力しましたか?");
                throw new IllegalArgumentException("エラーが発生したため、プログラムを中断します。");
        }
    }
}
