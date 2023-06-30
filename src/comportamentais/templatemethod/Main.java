package comportamentais.templatemethod;

public class Main {
    public static void main(String[] args) {
        HouseBuilder modernHouseBuilder = new ModernHouseBuilder();
        modernHouseBuilder.buildHouse();
        // Saída:
        // Construindo uma base sólida para a casa moderna
        // Construindo paredes modernas
        // Construindo um telhado plano para a casa moderna
        // Decorando a casa moderna com móveis elegantes
        // Construindo um jardim paisagístico para a casa moderna
        // Casa moderna concluída

        System.out.println();

        HouseBuilder traditionalHouseBuilder = new TraditionalHouseBuilder();
        traditionalHouseBuilder.buildHouse();
        // Saída:
        // Construindo uma base sólida para a casa tradicional
        // Construindo paredes tradicionais de tijolos
        // Construindo um telhado inclinado para a casa tradicional
        // Decorando a casa tradicional com móveis clássicos
        // Casa tradicional concluída
    }
}
