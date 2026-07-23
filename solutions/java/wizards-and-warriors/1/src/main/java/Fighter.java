class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

class Warrior extends Fighter {

    @Override
    boolean isVulnerable() {
        return false;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return fighter.isVulnerable() 
            ? 10
            : 6;
    }

    @Override
    public String toString() {
        return "Fighter is a Warrior";
    }
}

class Wizard extends Fighter {
    private boolean isVulnerable = true;

    @Override
    boolean isVulnerable() {
        return isVulnerable;
    }

    @Override
    int getDamagePoints(Fighter fighter){
        return this.isVulnerable() 
            ? 3
            : 12;
    }    

    void prepareSpell() {
        this.isVulnerable = false;
    }

    @Override
    public String toString() {
        return "Fighter is a Wizard";
    }
}
