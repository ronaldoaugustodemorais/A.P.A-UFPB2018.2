import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class InsertionSort
{	

    public static void main(String[] args)
    {
	int maior=0,menor=0,temp=0;

/*  

### // LEITURA DO ARQUIVO // ###


	Scanner ler = new Scanner(System.in);

	System.out.printf("Informe o nome de arquivo texto:\n");
	String nome = ler.nextLine();

	try {
      		FileReader arq = new FileReader(nome);
			BufferedReader lerArq = new BufferedReader(arq);
 
		String linha = lerArq.readLine(); // lê a primeira linha
			
			while (linha != null)
			{
			        System.out.printf("%s\n", linha);
      				linha = lerArq.readLine();
      		}
 
      		arq.close();
    	} catch (IOException e)
		{
        	System.err.printf("Erro na abertura do arquivo: %s.\n",
	        e.getMessage());
		}


### // ESCRITA DO ARQUIVO // ###


	FileWriter arq = new FileWriter("d:\\InsertionSortOK.txt");
    	PrintWriter gravarArq = new PrintWriter(arq);
 
 		gravarArq.printf("NUMEROS ORDENADOS");
			for (i=1; i<=arq.length; i++)
			{
				gravarArq.printf(arq[i])); //NUMEROS DO ARQUIVO EM ORDEM CRESCENTE
			}		
 
		arq.close();
 
    System.out.printf("\nArquivo criado com sucesso.\n");

*/

	int quantidade = arq.length();
    int[] vetor = new int[quantidade];
    
    for (int i = 0; i < vetor.length; i++)
	{
     vetor[i] = (int) (Math.random()*quantidade);
    }
    
     long tempoInicial = System.currentTimeMillis();
    
     insertionSort(vetor);    
        
	}
	
	public static void insertionSort(int[] vetor)
	{
    int j;
    int key;
    int i;
    
    for (j = 1; j < vetor.length; j++)
    {
      key = vetor[j];
      for (i = j - 1; (i >= 0) && (vetor[i] > key); i--)
      {
         vetor[i + 1] = vetor[i];
       }
        vetor[i + 1] = key;
    }
}

}