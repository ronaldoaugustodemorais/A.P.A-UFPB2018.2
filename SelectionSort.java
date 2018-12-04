import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.PrintWriter;

public class SelectionSort{

  private long[] a;
  private int nElems;
	  
	  public SelectionSort(int max)
	  {
		a = new long[max];
		nElems = 0;
	  }

	  public void insert(long value)
	  {
		a[nElems] = value;
		nElems++;
	  }
  
	  public void display()
	  {
		for (int j = 0; j < nElems; j++)
		{
		  System.out.print(a[j] + " ");
		  System.out.println("");
		}
	  }
	  public void selectionSort()
	  {
		int out, in, min;
		for (out = 0; out < nElems - 1; out++)
		{
		  min = out; // min.
		  for (in = out + 1; in < nElems; in++)
		  {			  
			if (a[in] < a[min]) // if min maior
			  min = in;
			swap(out, min); // swap
		  }
		}
	  }

	  private void swap(int one, int two)
	  {
		long temp = a[one];
		a[one] = a[two];
		a[two] = temp;
	  }

		public static void main(String[] args)
	{
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


	FileWriter arq = new FileWriter("d:\\SelectionSortOK.txt");
    	PrintWriter gravarArq = new PrintWriter(arq);
 
 		gravarArq.printf("NUMEROS ORDENADOS");
			for (i=1; i<=arq.length; i++)
			{
				gravarArq.printf(arq[i])); //NUMEROS DO ARQUIVO EM ORDEM CRESCENTE
			}		
 
		arq.close();
 
    System.out.printf("\nArquivo criado com sucesso.\n");

*/
		
		
		/*EXEMPLO*/
		
		int maxSize = 100;
		SelectionSort arr; // reference to array
		arr = new SelectionSort(maxSize); // create the array
		arr.insert(17); // insert 10 items
		arr.insert(29);
		arr.insert(34);
		arr.insert(45);
		arr.insert(52);
		arr.insert(68);
		arr.insert(71);
		arr.insert(80);
		arr.insert(96);
		arr.insert(33);
		arr.display();
		arr.selectionSort();
		arr.display();
		
		/*FIM DO EXEMPLO*/
	}
}