package com.shlok.Collections.Map.Shopping;

public class Order {
	private int orderId;
	private int customerId;
	private double amount;

	public Order(int orderId, int customerId, double amount) {
		this.orderId = orderId;
		this.customerId = customerId;
		this.amount = amount;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", amount=" + amount + "]";
	}
}