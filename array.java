package bernardo;
import java.util.Scanner;
public class array {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		final int TAM = 5;
		int[][] vet = new int[TAM][TAM];
		int maior = 0, menor = 0, soma=0;
		double media=0;

		for(int i = 0; i < TAM; i++) {
			for(int k=0;k<TAM;k++) {
				System.out.println("Informe um valor inteiro da posicao vet["+i+"]["+k+"]");
				vet[i][k] = read.nextInt();
				soma+=vet[i][k];

				if(i==0 && k==0) {
					maior = menor = vet[i][k];
				} else if(maior<vet[i][k]) {
					maior = vet[i][k];
				} else if(menor>vet[i][k]) {
					menor = vet[i][k];
				}
			}
		}
		for(int i=0;i<TAM;i++) {
			for(int k=0;k<TAM;k++) {
				System.out.print(vet[i][k]+"|");
			}
		}
		media = soma/TAM;
		System.out.println("\nMenor: "+menor+" | Maior: "+maior+" | Soma: "+media);
		read.close();
	}

}
