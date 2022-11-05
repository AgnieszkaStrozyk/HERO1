public class Hero {

    private String name;
    private String classHero;
    private int strengthPoints;
    private int manyPoints;
    private boolean oldOrNew;

    Hero(String name, String classHero, int strengthPoints, int manyPoints, boolean oldOrNew){
        this.name = name;
        this.classHero = classHero;
        this.strengthPoints = strengthPoints;
        this.manyPoints = manyPoints;
        this.oldOrNew = oldOrNew;
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }

    void setClassHero(String classHero){
        this.classHero = classHero;
    }

    String getClassHero(){
        return this.classHero;
    }

    void setStrengthPoints(int strengthPoints){
        this.strengthPoints = strengthPoints;
    }

    int getStrengthPoints(){
        return this.strengthPoints;
    }

    void setManyPoints(int manyPoints){
        this.manyPoints = manyPoints;
    }

    int getManyPoints() {
        return this.manyPoints;
    }

    void setOldOrNew(boolean oldOrNew){
        this.oldOrNew = oldOrNew;
    }

    boolean getOldOrNew() {
        return this.oldOrNew;
    }
}
