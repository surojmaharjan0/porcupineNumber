/*java file to find next porcupine number*/
public class Porcupine {

	public static void main(String[] args) {
		System.out.println("Hello galaxy!");
        System.out.println("Ginger");
        System.out.println("Salad");
        System.out.println("Plumber");
		System.out.println(nextPorcupine(150));
	}
	private static int isPrime(int n) {
		int i;
		if(n==1) return 0;
		for(i=2;i<n;i++) {
			if(n%i==0) return 0;
		}
		return 1;
	}
	private static int nextPorcupine(int n) {
		int toCheck=n;
		while(true) {
			toCheck++;
			if(isPrime(toCheck)==1 && toCheck%10==9) {
				//we got a number which is prime and ends with 9
				//we simply need to check another number as this
				int toCheck2=toCheck;
				while(true) {
					toCheck2++;
					if(isPrime(toCheck2)==1) {
						if(toCheck2%10==9) {
							return toCheck;
						}else {
							toCheck=toCheck2+1;
							break;
						}
					}
				}
			}
		}
	}

}