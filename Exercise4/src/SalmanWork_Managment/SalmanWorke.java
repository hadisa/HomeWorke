package SalmanWork_Managment;

public class SalmanWorke {
	static boolean isSalmanFree;
	static Thread[] customeres;

	public static void main(String[] args) {
		

		System.out.println("Salman Worke Managment!!!!...");
		customeres = new Thread[10];
		for (;;) {
			System.out.println("new Customer is comeing!!!");
			Customer currentCustomeres = new Customer();
			CheackingEmptyChair(customeres, currentCustomeres);
			
		}
		

	}

	private static void CheackingEmptyChair(Thread[] customeres,
			Thread currentCustomer) {
		for (int i = 0; i < customeres.length; i++) {
			if (customeres[i].equals(null)) {
				customeres[i] = currentCustomer;
				break;

			}
		}
		for (int i = 0; i < customeres.length; i++) {
			if (customeres[i] != null) {
				if (isSalmanFree) {
					AccessToSalman(customeres[i], i);

				}

			}

		}

	}

	synchronized static void AccessToSalman(Thread thread, int indexOfCurrentThread) {

		thread.start();
		customeres[indexOfCurrentThread] = null;
		isSalmanFree = true;

	}

}
