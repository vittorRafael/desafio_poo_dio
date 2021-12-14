package br.com.dio.desafio.dominio;

public abstract class Conteudo {

   protected static final double XP_PADRAO = 10d;
   private String titulo;
   private String desc;

   public abstract double calcularXP();

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

}
