
package idojaras;

import java.io.RandomAccessFile;

public class Idojaras {

   
    public static void main(String[] args) {

        int db;
        String sor;
        RandomAccessFile raf;
        Ido[] idok;
        
        // Olvassuk be és tároljuk el ezeket az adatokat.
        try{
            raf = new RandomAccessFile("idojaras.csv", "r");
            idok = new Ido[24];
            db = 0;
            raf.readLine();
            for(sor = raf.readLine(); sor != null; sor = raf.readLine()){
                idok[db] = new Ido(sor.split(";"), db);
                db++;
            }
            raf.close();
            /*  Kiiratas 
            for(Ido o : idok){
                System.out.println(o.toString());
            }
            */
            
            // Hány órakor volt a legmelegebb?
            System.out.println("\n2. feladat.");
            int homax = 0;
            for (int i = 0; i < idok.length; i++) {
                if (idok[i].getHom() > idok[homax].getHom()) {
                    homax = i;
                }
            }
            System.out.println(idok[homax].getOra() + " órakor volt a legmelegebb!");
            
            // Mikor fújt a legerősebben a szél?
            System.out.println("\n3. feladat.");
            int maxszel = 0;
            for (int i = 0; i < idok.length; i++) {
                if (idok[i].getSzelero() > idok[maxszel].getSzelero()) {
                    maxszel = i;
                }
            }
            System.out.println(idok[maxszel].getOra() + " órakor volt a legerősebb a szél!");
            
            // Mikor fújt ÉNY-i szél?
            System.out.println("\n4. feladat.");
            System.out.println("Ezekben az órákban fújt É-Ny-i szél!");
            for (int i = 0; i < idok.length; i++) {
                if (idok[i].getSzelirany() > 270 && idok[i].getSzelirany() < 360) {
                    System.out.print(idok[i].getOra() + " óra.");
                }
            }
            System.out.println();
            
            // Hányszor volt borult az ég?
            System.out.println("\n5. feladat.");
            int borultdb = 0;
            for (int i = 0; i < idok.length; i++) {
                if (idok[i].getIdokep().equalsIgnoreCase("borult")) {
                    borultdb++;
                }
            }
            System.out.println(borultdb + " alkalommal volt borult. ");
            
            // Mennyi volt a napi hőingás?
            System.out.println("\n6. feladat.");
            int homin = 0;
            for (int i = 0; i < idok.length; i++) {
                if (idok[i].getHom() < idok[homin].getHom()) {
                    homin = i;
                }
            }
            System.out.println(idok[homax].getHom() - idok[homin].getHom() + " fok volt a napi hőingadozás!");
            
            // Hányszor volt fagypont? tudni kell, mi a fagypont 🙂
            System.out.println("\n7. feladat.");
            int fagypont = 0;
            int fagypontdb = 0;
            for (int i = 0; i < idok.length; i++) {
                if (idok[i].getHom() < fagypont) {
                    fagypontdb++;
                }
            }
            System.out.println(fagypontdb + " volt fagypont alatti hőmérséklet!");
            
            int fagy = 0;
            for (int i = 0; i < idok.length; i++) {
                if (idok[i].getHom() < 0) {
                    fagy++;
                }
            }
            System.out.println(fagy + " alkalommal volt fagypont alatt a hőmérséklat!");
            
            
            
        }
        catch(Exception ex){
            System.out.println("Hiba: " + ex.toString());
        }

    }
    
}
