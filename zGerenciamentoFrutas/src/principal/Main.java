package principal;
//Importa métodos da biblioteca java que serão necessários para o código
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

//classe principal, onde irá conter todas as informações e m[etodos
public class Main {
	
	
	//Criação do Scanner e do Array (que será feito de String)
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> frutas = new ArrayList<>();
		
		//Enquanto o programa estiver ativo(simboliza o "true"), terá essas seguintes opções para selecionar (simboliza o "Try)
		while (true) {
			try {
				System.out.println("\nEscolha uma Opção: ");
				System.out.println("1.Adicionar uma Fruta");
				System.out.println("2.Listar todas as frutas");
				System.out.println("3.Modificar uma Fruta");
				System.out.println("4.Remover uma Fruta");
				System.out.println("5.Sair");
				System.out.println("Opção: ");
								
			//Coloca o Scanner para você selecionar a opção que você quer
			int opcao = scanner.nextInt();
			scanner.nextLine();
				
				
			/*A partir do switch, será realizado a parte lógica de cada método (do 1 ao 5)
			Tendo 5 casos, cada um correspondendo a opção que foi selecionada anteriormente
			Break é onde finaliza a parte lógica de 1 caso, indo para o outro
			*/
			switch(opcao){
			
			//Add para adicionar uma fruta
			/*NEXT.LINE é utilizado em quase todos os casos, e serve para limpar as informações que foram colocadas no scanner, 
			mas não foram retiradas de lá, em outras palavras, "ele limpa o scanner"
			*/
				case 1:
					System.out.println("Digite o nome da Fruta para adicionar: ");
					String novaFruta = scanner.nextLine();
					frutas.add(novaFruta);
					System.out.println(novaFruta + " foi adicionada");
					break;
					
				case 2:
					System.out.println("Frutas: " + frutas);
					break;
					
				case 3:
					System.out.println("Digite o índice da fruta que deseja modificar: ");
					int indiceModificar = scanner.nextInt();
					scanner.nextLine();
				//Cria uma condição para que a modificação aconteça de uma forma correta
				//O indice de modificação precisa ter alguma letra (não pode ser 0) e ele não pode ser maior q o array (2 frutas em 1)
				if (indiceModificar >= 0 && indiceModificar < frutas.size()){
					System.out.println("Digite o novo nome da Fruta: ");
					String frutaModificada = scanner.nextLine();
					frutas.set(indiceModificar, frutaModificada);
					System.out.println("fruta do índice: " + indiceModificar + " foi modificada para: " + frutaModificada);
				}
					else {
					System.out.println("índice Inválido");
					
				}
				break;
				
				case 4:
					System.out.println("Digite o nome da Fruta que deseja remover: ");
					String frutaRemover = scanner.nextLine();
					if (frutas.remove(frutaRemover)) {
						System.out.println(frutaRemover + " foi removida");
					} else {
						System.out.println(frutaRemover + "não foi encontrada");
					}
				break;
				
			//Return é para finalizar a execução do programa e o scanner.close é para fechar o scanner, impossibilitando o usuário de escrever mais.
				case 5:
					System.out.println("Saindo...");
					scanner.close();
					return;
				//Caso o que você tenha escrito em qualquer caso não dê certo, irá printar essa frase	
				default:
					System.out.println("Opção Inválida. Tente novamente.");
			}
		//Se o usuário digitou um número ou letra não correspondente aos 5 números, irá printar essa frase	
		}catch (InputMismatchException e) {
			System.out.println("Entrada inválida. Por Favor digite um número");
			
			}
		}
		
	}
}	
	

