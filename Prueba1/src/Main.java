import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = JOptionPane.showInputDialog("Ingrese un numero");
        String num2 = JOptionPane.showInputDialog("Ingrese otro numero");
        String num3 = JOptionPane.showInputDialog("Ingrese otro numero mas");
        System.out.println((Float.parseFloat(num1)+Float.parseFloat(num2)+Float.parseFloat(num3)) / 3);
    }
}