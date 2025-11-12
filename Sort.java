import java.util.Scanner;
public class Sort {

	public static void main(String[] args) {
		
		        Scanner s = new Scanner(System.in);

		        System.out.print("number of elements: ");
		        int a = s.nextInt();

		        int numbers[] = new int[a];

		        
		       
		        for (int i = 0; i <numbers.length; i++) {
		        	System.out.print("NUMBER "+(i+1)+" : ");
		            numbers[i] = s.nextInt();
		        }

		        
		        for (int i = 0; i <numbers.length  ; i++)
		        {
		            for (int j = 0; j < numbers.length - 1-i; j++)
		            {
		                if (numbers[j] > numbers[j + 1]) {
		                 
		                    int temp = numbers[j];
		                    numbers[j] = numbers[j + 1];
		                    numbers[j + 1] = temp;
		                }
		            }
		        }

		        System.out.println("Sorted array in ascending order:");
		        for (int num : numbers) {
		            System.out.print(num + " ");
		        }

		      
		    }
		}

	


