package br.com.impacta.classes;

public class Automovel {
	
	
//atributos.
 private String	marca;
 private String	modelo;
 private int	 ano;
 private String	placa;
 
 private final int chassi;
 

 
 public int getChassi() {
	return chassi;
}


public final  static String paisOrigem = "Brasil";
 
 
	public String getMarca() {
	return marca;
    }

    public void setMarca(String marca) {
	this.marca = marca;
   }

	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		
		if(ano < 1970) {			
			throw new NumberFormatException("O ano não pode ser menor que 1970.");
		}
		
		this.ano = ano;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String mostrar() {
		
		String titulo = "DADOS DO AUTOMÓVEL";
		
		String resposta = titulo + "\n\nMarca: " + this.getMarca() + 
				          "\nModelo: " + this.getModelo() + 
				          "\nChassi: " + this.getChassi();
			
		if(this.getAno() > 0) {
			resposta +=  "\nAno: " + this.getAno();
		}
		
		if(this.getPlaca() != null) {
			resposta += "\nPlaca: " + this.getPlaca();
		}	         
				      
		resposta +=	"\nPaís Origem: " + paisOrigem;
	
	return resposta;
		
		
	}
	
    public String mostrar(String titulo) {
		
		
		return  titulo + "\n\nMarca: " + this.getMarca() + 
				          "\nModelo: " + this.getModelo() + 
				          "\nAno: " + this.getAno() + 
				          "\nPlaca:" + this.getPlaca();
	
	 
		
		
	}
	
   
   

	public void lerDados(String marca, String modelo, int ano, String placa)
	{
		//this é uma referencia para termos acesso os atributos da classe.
		
		//this referencia da propria classe.
		
		this.setMarca(marca); 
		this.setModelo(modelo);
		this.setAno(ano);
		this.setPlaca(placa); 
		 
	}

	
	
	//construtores	
	
	public Automovel(String marca, String modelo) {
		
		this.chassi = (int) (Math.random() * 1000);
		this.setMarca(marca);
		this.setModelo(modelo);
		//this.setPlaca("Não informado");	
	}	
    public Automovel(String marca, String modelo, int ano) {
        this(marca,modelo);    	
		this.setAno(ano);	
	}
    
    public Automovel(String marca, String modelo, int ano, String placa) {	
    	this(marca,modelo,ano);
		this.setPlaca(placa);
		
	}
	

}























