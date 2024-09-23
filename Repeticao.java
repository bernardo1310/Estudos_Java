package bernardo;
import java.util.Scanner;
public class Repeticao {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int TAM;
		int INI;
		int num;

		//for(int i=INI;i<TAM;i++) {
			//System.out.println(i);
		//}
		
		do {
			System.out.println("Informe o inicio: ");
			INI = entrada.nextInt();
			System.out.println("Informe o final: ");
			TAM = entrada.nextInt();
		} while(INI>=TAM);

		do {
			System.out.println("Informe um valor positivo: ");
			num = entrada.nextInt();
		} while(num<1); 

		for(int i=INI;i<=TAM;i++) {
			System.out.println(i+" x "+num+" = "+(num*i));
		}

		entrada.close();
	}

}
