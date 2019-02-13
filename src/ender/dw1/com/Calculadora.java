package ender.dw1.com;
public class Calculadora {

	int operadorA;
	int operadorB;
	
	public Calculadora(int i, int j) {
		operadorA=i;
		operadorB=j;
	}
	
	public int suma() {		
		int resultado= operadorA+operadorB;
		return resultado;
	}

	public int resta() {
		return operadorA-operadorB;
	}

	public int multiplica() {
		return operadorA*operadorB;
	}

	public int divide() {
		return operadorA/operadorB;
	}
	
	
}
