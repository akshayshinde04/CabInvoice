package com.bl;

public class InvoiceGenrator {
	private static final int costPerTime = 1;
	private static final int minimumCostPerKilometer = 10;
	private static final int miniumFares = 5;

	public double CalculateFare(double distance, int time) {
		double totalDistance = distance * minimumCostPerKilometer + time * costPerTime;
		if (totalDistance < miniumFares) {
			return miniumFares;
		}
		return totalDistance;
	}

	public double CalculateFare(Rides[] ride) {
		double totalFare = 0;
		for (Rides rides : ride) {
			totalFare += this.CalculateFare(rides.distances, rides.time);
		}
		return totalFare;
	}
}
