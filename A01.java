import java.util.*;
// branch job-A
//jerry1004 nate.com
//jerry1004 nate.com
//jerry1004 nate.com
//jerry1004 nate.com
//jerry1004 nate.com
//jerry1004 nate.com
//jerry1004 nate.com
//jerry1004 nate.com
//jerry1004 nate.com
class A01 {
	int age = 0;

	public static void main(String[] a){
		new A01().start();
	}

	void start(){
		Scanner s = new Scanner(System.in);

		System.out.print("나이를 입력:");
		int year = s.nextInt();
		this.age = 2016 - year + 1;	
		print();
	}

	void print(){
		if(age < 20)
			System.out.println("미성년자입니다.");
		else	
			System.out.println("미성년자가 아닙니다.");
	}
}
