
package Animals;


public class Gato extends Felinos {
    
    @Override
    public String getnombre() {
       return "Felis Silvestre Catus";
    }

    @Override
    public String getsonido() {
       return "Maullido";
    }

    @Override
    public String getalimentos() {
        return "Ratones";
    }

    @Override
    public String gethabitad() {
        return "Domestico";
    }
}
