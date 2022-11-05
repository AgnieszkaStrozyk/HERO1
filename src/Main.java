public class Main {
    public static void main(String[] args) {
        Hero dupa = new Hero("Zenon", "Nie wiem co?", 10, 2, false);
        dupa.setName("Agata");
        System.out.println(dupa.getName());
        dupa.setStrengthPoints(8);
        System.out.println(dupa.getStrengthPoints());
        dupa.setClassHero("kino");
        System.out.println(dupa.getClassHero());
        dupa.setManyPoints(0);
        System.out.println(dupa.getManyPoints());
        dupa.setOldOrNew(true);
        System.out.println(dupa.getOldOrNew());

    }

}
