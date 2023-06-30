package comportamentais.templatemethod;

public class TraditionalHouseBuilder extends HouseBuilder{

    protected void buildFoundation() {
        System.out.println("Construindo uma base sólida para a casa tradicional");
    }

    protected void buildWalls() {
        System.out.println("Construindo paredes tradicionais de tijolos");
    }

    protected void buildRoof() {
        System.out.println("Construindo um telhado inclinado para a casa tradicional");
    }

    protected void decorateHouse() {
        System.out.println("Decorando a casa tradicional com móveis clássicos");
    }

    @Override
    protected void buildGarden() {

    }

    protected void completeHouse() {
        System.out.println("Casa tradicional concluída");
    }
}
