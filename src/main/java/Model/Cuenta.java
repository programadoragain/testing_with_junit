package Model;

import java.math.BigDecimal;

public class Cuenta {
	private String persona;
	private BigDecimal saldo;
	
	public Cuenta(String persona, BigDecimal saldo) {
		this.persona= persona;
		this.saldo = saldo;
	}
	
	public String getPersona() {
		return persona;
	}
	
	public void setPersona(String persona) {
		this.persona = persona;
	}
	
	public BigDecimal getSaldo() {
		return saldo;
	}
	
	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}
	
	public void debito(BigDecimal monto) {
		saldo= saldo.subtract(monto);
	}
	
	public void credito(BigDecimal monto) {
		saldo= saldo.add(monto);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Cuenta)) return false;
		Cuenta c= (Cuenta) obj;
		return persona.equals(c.persona);
	}
	
}
