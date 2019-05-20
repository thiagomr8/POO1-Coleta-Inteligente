
package coletaInteligente;

import Validador.ValidadorCidadao;
//import java.util.Random;

public class Cidadao{
    //Random random = new Random();
    
    private int codigo;
    private String nome;
    private String email;
    private String senha;
    private float latitude;
    private float longitude;
    
    
    
    public Cidadao (){
        
    }
    /*NÃO ESTÁ DANDO CERTO CONSTRUTORES COM PAREMETROS POR MOTIVOS DE VALIDACAO
    public Cidadao (String nome, String email, String senha) throws Exception {
        ValidadorCidadao valCidadao = new ValidadorCidadao();
        valCidadao.verificaNome(nome);
        valCidadao.verificaEmail(email);
        valCidadao.verificaSenha(senha);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.codigo = random.nextInt(100);
        this.latitude = random.nextFloat();
        this.longitude = random.nextFloat();
    }*/
    
    public int getCodigo() {
        return codigo;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        ValidadorCidadao valCidadao = new ValidadorCidadao();
        valCidadao.verificaNome(nome);
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    

    public void setEmail(String email) throws Exception {
        ValidadorCidadao valCidadao = new ValidadorCidadao();
        valCidadao.verificaEmail(email);
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }
    
    
    public void setSenha(String senha) throws Exception {
        ValidadorCidadao valCidadao = new ValidadorCidadao();
        valCidadao.verificaSenha(senha);        
        this.senha = senha;
    }

    public float getLatitude() {
        return latitude;
    }
    
    public void setLatitude(float latitude){
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }
    
    public void setLongitude(float Longitude){
        this.longitude = Longitude;
    }

    @Override
    public String toString() {
        return getCodigo()+", "+getNome()+", "+getEmail()+", "+getSenha()+", "+getLatitude()+", "+getLongitude();   
    }



    

}