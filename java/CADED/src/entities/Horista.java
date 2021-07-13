package entities;

public class Horista  implements Pagamentos{

		private String cpf;
		private double horas;
		private double valorHora;
		
		
		public Horista(String cpf, double horas, double valorHora) {
			super();
			this.cpf = cpf;
			this.horas = horas;
			this.valorHora = valorHora;
		}
		public String getCpf() {
			return cpf;
		}
		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		public double getHoras() {
			return horas;
		}
		public void setHoras(double horas) {
			this.horas = horas;
		}
		public double getValorHora() {
			return valorHora;
		}
		public void setValorHora(double valorHora) {
			this.valorHora = valorHora;
		}
		
		public double payExtra() {
			
			return horas * valorHora;
		}
		
		public void paySalario() {
			 
		}
		
		public void payHoras() {
			
		}
		
		
		
		
}
