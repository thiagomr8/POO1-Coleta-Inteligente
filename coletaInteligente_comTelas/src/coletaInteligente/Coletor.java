package coletaInteligente;

import Validador.ValidadorColetor;
import java.util.Random;

public class Coletor {
    
    int codigo;
    String placa;
    float capacidade;
    String marca;
    String modelo;
    int ano;
    float latitude;
    float longitude;
    
    
    public Coletor (){
    }
     
    public Coletor(String placa, String marca, String  modelo, String ano, String capacidade ) throws Exception{
        Random random = new Random();
        setCodigo(Integer.toString(random.nextInt(100)));
        setPlaca(placa);
        setMarca(marca);
        setModelo(modelo);
        setAno(Integer.parseInt(ano));
        setCapacidade(Float.parseFloat(capacidade));
        setLatitude(random.nextFloat());
        setLongitude(random.nextFloat());
    }
   
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) throws Exception {
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.codigo(codigo);
        this.codigo = Integer.parseInt(codigo);
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) throws Exception {
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.verificaPlaca(placa);
        this.placa = placa;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) throws Exception{
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.verificaCapacidade(Float.toString(capacidade));
        this.capacidade = capacidade;
    }

    public String getMarca(){
       return marca;
    }
    
    public void setMarca(String marca) throws Exception{
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.verificaMarca(marca);
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) throws Exception {
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.verificaModelo(modelo);
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws Exception{
        ValidadorColetor validaColetor = new ValidadorColetor();
        validaColetor.verificaAno(Integer.toString(ano));
        this.ano = ano;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getPlaca()+", "+getMarca()+", "+getModelo()+", "+getAno()+", "+getCapacidade()+", "+getLatitude()+", "+getLongitude() ;
    }

}