package org.yjj.chapter.s048;

public class Java200Math {

	public static int sumEach(int n){
		int tot=0;
		while(n!=0){
			tot+=n%10;
			n/=10;    
		}
		return tot;
	 }
	 public static void main(String[] args) {
		int number=1234567;
		int value=sumEach(number);
		System.out.printf("%d에 대한 각자리의 수 합: %d",number,value);
	 }
	 public static boolean isPrime(int n){
		boolean isS=true;
		for (int i = 2; i <=(int)Math.sqrt(n); i++) {
			if(n%i==0){
				isS=false;
				break;
			}
		}
		return isS;
	 }
		
		public static int gcd(int m, int n){
			if(m==1 || n==1 ){
				return 1;
			}else if( m==n){
				return m;
			}else if(m>n){
				return gcd(m-n,n);
			}else{
				return gcd(m,n-m);
			}
		}

		public static void printPrime(){
			for (int i = 10000; i < 20000; i++) {
				if(isPrime(i)){
					System.out.println(i);
				}
			}
		}
		public static void printDivide(int n){
			if(n==1){
				System.out.println("[1]");
			}else{
				System.out.printf("[1,");
				for (int i = 2; i <n; i++) {
					if(n%i==0){
						System.out.printf("%d,",i);
					}
				}
				System.out.println(n+"]");
			}
		}

		public static int sumSmith(int n){
			int tot=0;
			int a=2;
			while(n!=1){
				if(n%a==0){
					tot+=sumEach(a);
					n/=a;
				}else{
					a++;
				}
			}
			return tot;
		}
		public static void printSmith(int t1, int t2){
			for (int i = t1; i < t2; i++) {
				if(!isPrime(i) && sumEach(i)==sumSmith(i)){
					System.out.printf("%d는 스미스 수: ",i);
					printPrimeDivide(i);
				}
			}
		}
		
		public static void printPrimeDivide(int n){
			int a=2;
			while(n!=1){
				if(n%a==0){
					if(n/a==1){
						System.out.println(a);
					}else{
						System.out.print(a+"x");
					}
					n/=a;
				}else{
					a++;
				}
			}
		}
	  
		public static int divide(int num){
			int tot=1;
			for(int i=2; i<num ; i++){
				if(num%i==0){
					tot+=i;
				}
			}
			return tot;
		}
		public static void printPerfect(int t1, int t2){
			for (int i = t1; i < t2; i++) {
				if(i==divide(i)){
					System.out.printf("%d는 완전 수: ",i);
					printDivide(i);
				}
			}
		}
		
		public static void printAmicable(int t1, int t2){
			for (int i = t1; i < t2; i++) {
				int a=i;
				int b=divide(a);
				int c=divide(b);
				
				if(a<b && a==c){
					System.out.printf("(%d,%d)는 친화 수: ",a,b);
					printDivide(a);
					printDivide(b);
				}
			}
		}
		public static void printSociable5(int t1, int t2){
			for (int i = t1; i < t2; i++) {
				int a=i;
				int b=divide(a);
				int c=divide(b);
				int d=divide(c);
				int e=divide(d);
				int f=divide(e);
				if(a<b && a<e && a!=c && b!=d && a==f){
					System.out.printf("(%d,%d, %d,%d, %d)는 Sociable수\n",a,b,c,d,e);
					System.out.println(b);
					System.out.println(c);
					System.out.println(d);
					System.out.println(e);
					System.out.println(f);
				
				}
			}
		}
}
