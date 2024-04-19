package Unknow;

import java.util.Arrays;
import java.util.Scanner;

public class Phusit {

    public static void main(String[] args) {
        System.out.println("""
                วิธีใช้งานโปรแกรม
                - ให้ใส่ข้อมูลน้ำหนักลงไปเป็นกิโลกรัม ต้ั้งแต่ 45.0-75.5 เท่านั้น
                - ข้อมูลต้องเป็นตัวเลขเท่านั้น หลังจากพิมพ์น้ำหนักเสร็จให้กด Enter
                - เมื่อเพิ่มข้อมูลสำเร็จจะมีข้อความบอก ตัวเลขในวงเล็บข้างหน้าข้อความคือจำนวนข้อมูลที่เพิ่ม
                - หากต้องการจบการทำงานพิมพ์อะไรก็ได้ที่ไม่ใช่ตัวเลข""");
        Scanner scanner = new Scanner(System.in);
        double[][] array = new double[5][4];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (scanner.hasNextDouble()) {
                    double num = scanner.nextDouble();
                    while (num < 45.0 || num > 75.5) {
                        System.out.println("คุณจะต้องใส่น้ำหนัก ตั้งแต่ 45.0 - 75.5 เท่านั้น กรุณาใส่ใหม่ให้ถูกต้อง");
                        num = scanner.nextDouble();
                    }
                    count++;
                    array[i][j] = num;
                    System.out.println("[" + count + "] คุณได้ทำการเพิ่มน้ำหนัก " + num + " ไปทีโปรแกรมแล้ว");
                    //System.out.println(i + " " + j);
                } else {
                    break;
                }
            }
        }
        System.out.println("รับข้อมูลไป " + count + " ครั้ง");
        System.out.println(Arrays.deepToString(array));
    }

}
