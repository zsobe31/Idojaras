
package idojaras;


public class Ido {
    
    private String idokep;
    private int hom;
    private int szelirany;
    private int szelero;
    private int legnyomas;
    private double para;
    private int ora;
    
    public Ido(String[] tomb, int db){
        idokep = tomb[0];
        hom = Integer.parseInt(tomb[1]);
        szelirany = Integer.parseInt(tomb[2]);
        szelero = Integer.parseInt(tomb[3]);
        legnyomas = Integer.parseInt(tomb[4]);
        para = Double.parseDouble(tomb[5]);
        ora = db;
    }

    public String getIdokep() {
        return idokep;
    }

    public int getHom() {
        return hom;
    }

    public int getSzelirany() {
        return szelirany;
    }

    public int getSzelero() {
        return szelero;
    }

    public int getLegnyomas() {
        return legnyomas;
    }

    public double getPara() {
        return para;
    }

    public int getOra() {
        return ora;
    }
    
    @Override
    public String toString(){
        return "Idő{" + "időkép=" + idokep + ", hőmérséklet=" + 
                ", szélirány=" + szelirany + ", szélerő=" + 
                szelero + ", légnyomás=" + legnyomas + ", pára=" +
                 para + ", óra=" + ora + '}';
    }
    
}
