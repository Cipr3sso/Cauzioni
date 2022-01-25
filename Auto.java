package multe;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author Carlo
 */
public class Auto {
    
    protected String Marca;
    protected String Modello; //Di che animale si tratta
    protected String Prezzo;
    protected int Kw;

	public Auto(String M, String N, String P, int C){
            Marca = M;
            Modello = N;
            Prezzo=P;
            Kw=C;
	}
        
        public Auto(){
            Marca = "";
            Modello = "";
            Prezzo="";
            Kw=0;
        }
        public String getMarca(){
            return Marca;
        }

}
