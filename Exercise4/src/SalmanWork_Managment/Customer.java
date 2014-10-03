package SalmanWork_Managment;

public class Customer extends Thread {

	public void run() {
		System.out.println("I am in salmaning");
		try {
			sleep(10000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}

}
