package comportamentais.templatemethod;

public class ModernHouseBuilder extends HouseBuilder {

    @Override
    protected void buildFoundation() {
        System.out.println("Construindo uma base sólida para a casa moderna");
    }

    @Override
    protected void buildWalls() {
        System.out.println("Construindo paredes modernas");
    }

    @Override
    protected void buildRoof() {
        System.out.println("Construindo um telhado plano para a casa moderna");
    }

    @Override
    protected void decorateHouse() {
        System.out.println("Decorando a casa moderna com móveis elegantes");
    }

    @Override
    protected void buildGarden() {
        System.out.println("Construindo um jardim paisagístico para a casa moderna");
    }

    @Override
    protected void completeHouse() {
        System.out.println("Casa moderna concluída");
    }
}
