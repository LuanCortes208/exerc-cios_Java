package entities.enuns;

public class OrderLevel {
	
	public enum OrderStatus {
		PEDING_PAYMENT(0),
		PROCESSING(1),
		SHIPPED(2),
		DELIVERED(3);

		private Integer numero;
		
		OrderStatus(int numero) {
			this.numero = numero;
		}

		public Integer getNumero() {
			return numero;
		}
	}
}
