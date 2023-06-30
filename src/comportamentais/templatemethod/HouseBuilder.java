package comportamentais.templatemethod;

abstract class HouseBuilder {
    // Método template que define a sequência de passos para construir uma casa
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRoof();
        decorateHouse();
        if (customerWantsGarden()) {
            buildGarden();
        }
        completeHouse();
    }

    // Métodos abstratos que devem ser implementados pelas subclasses
    protected abstract void buildFoundation();
    protected abstract void buildWalls();
    protected abstract void buildRoof();
    protected abstract void decorateHouse();
    protected abstract void buildGarden();
    protected abstract void completeHouse();

    // Método hook que pode ser sobrescrito pelas subclasses
    protected boolean customerWantsGarden() {
        return true;
    }
}
