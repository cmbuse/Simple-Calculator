package Calculator;

import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num1=0;
int num2=0;
char operator;
double raspuns = 0.0;


Scanner input = new Scanner (System.in);
System.out.print("Introduceti primul numar:");
num1 = input.nextInt();
System.out.print("Introduceti al doi-lea numar: ");
num2 = input.nextInt();
System.out.print("Ce fel de operatie se va realiza?");
operator = input.next().charAt(0);
switch (operator) {
case '+': raspuns = num1+ num2;
break;
case '-': raspuns = num1- num2;
break;
case '*': raspuns = num1* num2;
break;
case'/': raspuns =num1/num2;
break;
}
System.out.print(num1 +" operator " + num2 + "= " + raspuns);

	}

}
