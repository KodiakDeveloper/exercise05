package basicAlgorithms;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		int averageSpeed, arrivalPoint = 0, departurePoint = 0, displacement, timeInterval, initialTime, finalTime;

		Scanner scan = new Scanner(System.in);

		System.out.println("Input arrival point: ");

		arrivalPoint = scan.nextInt();

		System.out.println("Input departure point: ");

		departurePoint = scan.nextInt();

		displacement = departurePoint - arrivalPoint;

		System.out.println("Input initial time: ");

		initialTime = scan.nextInt();

		System.out.println("Input final time : ");

		finalTime = scan.nextInt();

		if (initialTime >= finalTime) {

			System.out.println("Initial time cannot be greater or equal than final time, try again");

		} else if (departurePoint <= arrivalPoint) {

			System.out.println("Departure point must be greater than arrival point.");

		}

		else {

			scan.close();

			timeInterval = finalTime - initialTime;

			averageSpeed = displacement / timeInterval;

			System.out.println("Average Speed = " + averageSpeed);

		}

	}

}
