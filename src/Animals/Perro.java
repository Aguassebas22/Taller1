
package Animals;

public  class Perro extends Caninos {

    @Override
    public String getnombre() {
       return "Canis lupus familiaris";
    }

    @Override
    public String getsonido() {
       return "Ladrar";
    }

    @Override
    public String getalimentos() {
        return "Carnivoro";
    }

    @Override
    public String gethabitad() {
        return "Domestico";
    }

}