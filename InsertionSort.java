import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class InsertionSort{	

    public static void main(String[] args)
    {
	int maior=0,menor=0,temp=0;

	Scanner ler = new Scanner(System.in);

	System.out.printf("Informe o nome de arquivo texto:\n");
	String nome = ler.nextLine();

	try {
      		FileReader arq = new FileReader(nome);
		BufferedReader lerArq = new BufferedReader(arq);
 
		String linha = lerArq.readLine(); // lê a primeira linha
		// a variável "linha" recebe o valor "null" quando o processo
		// de repetição atingir o final do arquivo texto
			
			while (linha != null)
			{
			        System.out.printf("%s\n", linha);
      				linha = lerArq.readLine(); // lê da segunda até a última linha
					if(Integer.parseInt(linha) > maior && Integer.parseInt(linha) > menor)
					{
						maior = Integer.parseInt(linha);
					}
					else if(Integer.parseInt(linha) < maior)
					{
						maior = Integer.parseInt(linha);
					}
      			}
 
      		arq.close();
    	} catch (IOException e)
	{
        	System.err.printf("Erro na abertura do arquivo: %s.\n",
	        e.getMessage());
     }


//ESCREVER NO ARQUIVO

	FileWriter arq = new FileWriter("d:\\tabuada.txt");
    	PrintWriter gravarArq = new PrintWriter(arq);
 
 		gravarArq.printf("+--Resultado--+%n");
			for (i=1; i<=10; i++)
			{
				gravarArq.printf("| %2d X %d = %2d |%n", i, n, (i*n));
			}
		gravarArq.printf("+-------------+%n");
 
		arq.close();
 
    System.out.printf("\nTabuada do %d foi gravada com sucesso em \"d:\\tabuada.txt\".\n", n);






//RASCUNHO
    		for (int j = 1; j < alunos.length; j++)
		{
			int x = alunos[j];
			for (int i = j-1; i >= 0 && alunos[i] > x; i--)
			{
				alunos[i+1] = alunos[i]; 
				alunos[i] = x;
				trocas++;
			}
		} 
		for (int i = 0; i < alunos.length; ++i)
		{
			System.out.print("\nMatricula: 000"+alunos[i] + "\nNome: Recruta00"+alunosNome[i] + "\nAno: "+alunosAno[i]);
		}
		System.out.println("\n\nQtd. de Trocas: "+trocas);
		System.out.println("O tempo de execucao durou: " + (System.currentTimeMillis() - tempoInicial)+"ms");
		
		*/
		//FIM DO InsertionSort

    	}
}