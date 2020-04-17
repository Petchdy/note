package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //int number1 = 20;
        //int number2 = 0;
        //float number3 = 15.2f;
        //System.out.printf("(%d + %d) / %.1f = %f2",number1,number2,number3,((number1+number2)/number3));//printf->printformatstring
        //System.out.println("("+number1+" + "+number2+")/= "+number3 + " = "+ ((number1+number2)/number3));//ใส่สติงขั้นเสมอเป็นรูปแบบของprintln   หารด้วย0โฟทได้เพราะคอมคิดว่าคือเลขที่น้อยมากๆจนใกลืเป็น0
        ////////////////////////////////////////////////////////////////////
        Scanner scan = new Scanner(System.in);//บรรทัด3เอาเข้ามาเพื่อให้ใส่ค่าจากภายนอกได้
        //int number1 = scan.nextInt();
        //float number2 = scan.nextFloat();
        //double number3 = scan.nextDouble();
        //System.out.println((number1+number2)+number3);
        /////////////////////////////////////////////////////////////////
        //int x = 0;
        //System.out.println(x++);//ปิ้นก่อนค่อยบวก
        //System.out.println(++x);//บวกก่อนค่อยปิ้น
        //x=+20; //x=x+20
        //System.out.println(x);
        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        int number3 = scan.nextInt();
        System.out.printf("%d",number1+number2+number3);
    }
}
