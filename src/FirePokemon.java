public class FirePokemon extends Pokemon {

    // Minimaal 2 private variabelen
    private int level;
    private String food;

    // Constructor
    public FirePokemon(String name, int hp, String sound, int level, String food) {
        super(name, hp, sound);
        this.level = level;
        this.food = food;
    }

    // 2 Methodes (uit inspiratie-sectie)
    public void fireLash() {
        System.out.println("Firelash attack!");
    }

    public void flameThrower() {
        System.out.println("Flamethrower attack!");
    }

    // 1 Override methode
    @Override
    public void eat() {
        System.out.println(getPokemonName() + " eats " + food);
    }

    // 2 getters
    public int getLevel() {
        return level;
    }

    public String getFood() {
        return food;
    }

    // 2 setters
    public void setLevel(int level) {
        this.level = level;
    }

    public void setFood(String food) {
        this.food = food;
    }
}
