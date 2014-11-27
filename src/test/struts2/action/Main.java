package test.struts2.action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;

public class Main extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	public List<String> listComp;
	public String compuerta = "";
	public String valor1 = "";
	public String valor2 = "";
	public String resultado = "";
	public boolean validar = true;
	public String compValor = "";
	public String validaV1 = "";
	public String validaV2 = "";
	public String valorImg = "";
	
	public String execute(){
		
		listComp = new ArrayList<String>();
		listComp.add("and");
		listComp.add("or");
		listComp.add("not");
		
		if(getCompuerta().equals("not")){
			if(getValor1().equals("")){
				setValidaV1("Campo Requerido");
				setValidar(false);
			}
		}else{
			if(getValor1().equals("")){
				setValidaV1("Campo Requerido");
				setValidar(false);
			}
			if(getValor2().equals("")){
				setValidaV2("Campo Requerido");
				setValidar(false);
			}
		}
		
		if(getCompuerta().equals("")){
			setCompuerta("and");
			setValidaV1("");
			setValidaV2("");
		}
		
		if(validar){
			if(getCompuerta().equals("and")){
				if(getValor1().equals("1") && getValor2().equals("1")){
					setResultado("1");
					setValorImg("and11");
				}else{
					setResultado("0");
				}
			}
			if(getCompuerta().equals("or")){
				if(getValor1().equals("0") && getValor2().equals("0")){
					setResultado("0");
				}else{
					setResultado("1");
				}
			}
			if(getCompuerta().equals("not")){
				if(getValor1().equals("0")){
					setResultado("1");
				}else{
					setResultado("0");
				}
			}
			if(getValor1().equals("") && getValor2().equals("")){
				setResultado("");
			}
		}
		
		return "SUCCESS";
		
	}
	
	public String getCompuerta() {
		return compuerta;
	}
	public void setCompuerta(String compuerta) {
		this.compuerta = compuerta;
	}
	
	public List<String> getListComp() {
		return listComp;
	}
	public void setListComp(List<String> listComp) {
		this.listComp = listComp;
	}

	public String getValor1() {
		return this.valor1;
	}
	public void setValor1(final String valor1) {
		this.valor1 = valor1;
	}

	public String getValor2() {
		return this.valor2;
	}

	public void setValor2(final String valor2) {
		this.valor2 = valor2;
	}

	public String getResultado() {
		return this.resultado;
	}
	public void setResultado(final String resultado) {
		this.resultado = resultado;
	}

	public boolean isValidar() {
		return this.validar;
	}
	public void setValidar(final boolean validar) {
		this.validar = validar;
	}

	public String getCompValor() {
		return this.compValor;
	}
	public void setCompValor(final String compValor) {
		this.compValor = compValor;
	}

	public String getValidaV1() {
		return this.validaV1;
	}
	public void setValidaV1(final String validaV1) {
		this.validaV1 = validaV1;
	}

	public String getValidaV2() {
		return this.validaV2;
	}
	public void setValidaV2(final String validaV2) {
		this.validaV2 = validaV2;
	}

	public String getValorImg() {
		return this.valorImg;
	}
	public void setValorImg(final String valorImg) {
		this.valorImg = valorImg;
	}

}
