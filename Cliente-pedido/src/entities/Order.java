package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enuns.OrderLevel.OrderStatus;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> items = new ArrayList<>();
	private Client client;
	
	public Order(Date moment, OrderStatus status, Client client) {
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}
	
	public void addItem(OrderItem item) {
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}

	public Double total() {
		Double sum = 0.0;
		for (int i = 0; i < items.size(); i++) {
			sum += items.get(i).subTotal();
		}
		return sum;
	}
	
	public String toStringItems () {
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < items.size(); i++) {
			sb.append(items.get(i).getProduct().getName());
			sb.append(", ");
			sb.append(items.get(i).getPrice());
			sb.append(", ");
			sb.append("Quantity: ");
			sb.append(items.get(i).getQuantity());
			sb.append(", ");
			sb.append("Subtotal: ");
			sb.append(items.get(i).subTotal());
			sb.append("\n");
		}
		return sb.toString();
	}
}
