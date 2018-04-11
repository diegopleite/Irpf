package irpf;

public class Irpf {
private String Nome;
private String Cpf;
private double TotRendimentos;
private double ContrPrev;
private int NroDep;
private int Idade;
private double ImpostoDevido=0;
private double bc=0;



	
	public Irpf(String nome,String cpf) {
		this.Nome=nome;
		this.Cpf=cpf;
	}
	public double getTotRendimentos() {
		return TotRendimentos;
	}

	public void setTotRendimentos(double totRendimentos) {
		TotRendimentos=totRendimentos;
	}
	public double getContrPrev() {
		return ContrPrev;
	}
	public void setContrPrev(double contrPrev) {
		ContrPrev=contrPrev;
	}
	public int getNroDep() {
	return NroDep;	
	}
	public void setNroDep(int nroDep) {
		NroDep=nroDep;
	}
	public int getIdade() {
		return Idade;
	}
	
	public void setIdade(int idade) {
		Idade=idade;
	}
	public String getNome() {
		return Nome;
	}
	
	public String getCpf() {
		return Cpf;
	}
	public double impostoDevido() {
		bc=TotRendimentos-ContrPrev;
		if(Idade<65) {
			if(NroDep>=0&&NroDep<=2) {
				bc=bc*0.975;
			}
			if(NroDep>=3&&NroDep<=5) {
				bc=bc*0.95;
			}
			if(NroDep>5) {
				bc=bc*0.9;
			}
		}
		if(Idade>=65) {
			if(NroDep>=0&&NroDep<=2) {
				bc=bc*0.97;
			}
			if(NroDep>=3&&NroDep<=5) {
				bc=bc*0.955;
			}
			if(NroDep>5) {
				bc=bc*0.94;
			}
		}
		
		if(bc<10000) {
			ImpostoDevido=0;
		}
		if(bc>=10000&&bc<=20000) {
			ImpostoDevido=(bc-10000)*0.15;
		}
		if(bc>20000) {
			ImpostoDevido=1500+((bc-20000)*0.3);
		}
		
		return ImpostoDevido;
	}
}
