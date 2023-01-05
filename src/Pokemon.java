// Bonusopdracht 1 en 2: abstracte klasse en methode implementeren
public abstract class Pokemon {

    // Minimaal 2 private variabelen
    private String pokemonName;
    private int healthPoints;
    private String pokemonType;
    private String sound;

    // Constructor
    public Pokemon(String name, int hp, String sound) {
        this.pokemonName = name;
        this.healthPoints = hp;
        this.sound = sound;
    }

    // 2 Methodes
    public abstract void eat();
    public void sleep() {
        System.out.println(getPokemonName() + " has to sleep now. Good night!");
    }

    // Minimaal 2 getters
    public int getHealthPoints() {
        return healthPoints;
    }

    public String getPokemonType() {
        return pokemonType;
    }

    public String getPokemonName() {
        return pokemonName;
    }

    public String getSound() {return sound;}

    // Minimaal 2 setters
    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public void setPokemonType(String pokemonType) {
        this.pokemonType = pokemonType;
    }

    public void setPokemonName(String pokemonName) {
        this.pokemonName = pokemonName;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }
}
