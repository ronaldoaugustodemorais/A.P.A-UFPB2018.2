import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


/*  LEITURA DO ARQUIVO
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

*/

/* ESCREVER NO ARQUIVO

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



*/




public class SelectionSort
{

  private long[] a;
  private int nElems;
  public SelectionSort(int max) {
    a = new long[max];
    nElems = 0;
  }
  public void insert(long value) {
    a[nElems] = value;
    nElems++;
  }
  public void display() {
    for (int j = 0; j < nElems; j++)
      System.out.print(a[j] + " ");
    System.out.println("");
  }
  public void selectionSort() {
    int out, in, min;
    for (out = 0; out < nElems - 1; out++) // outer loop
    {
      min = out; // minimum
      for (in = out + 1; in < nElems; in++)
        // inner loop
        if (a[in] < a[min]) // if min greater,
          min = in; // a new min
      swap(out, min); // swap them
    }
  }
  private void swap(int one, int two) {
    long temp = a[one];
    a[one] = a[two];
    a[two] = temp;
  }
  public static void main(String[] args)
{
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
}