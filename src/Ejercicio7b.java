public class Ejercicio7b {
	private static final int MAX = 10;

	// Hacer un programa que cargue un arreglo de tamaño MAX=10 con números
	// enteros aleatorios entre 0 y 100 de tal manera que quede ordenado
	// decrecientemente. Finalmente imprima el arreglo.
	public static void main(String arg[]) {
		int arr[] = create();
		ordenarBurbuja(arr);
		imprimirArreglo(arr);
	}

	private static void imprimirArreglo(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

	private static void ordenarBurbuja(int[] arr) {
		// 1,2,3,4,5,7,8,10,11,57
		int temp = 0;
		for (int k = 0; k < arr.length; k++) {
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] < arr[i+1]) {
					temp = arr[i+1];
					arr[i+1] = arr[i];
					arr[i] = temp;
				}
			}
		}
	}

	private static int[] create() {
		int arr[] = new int[MAX];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
		
		}
		return arr;
	}
}
