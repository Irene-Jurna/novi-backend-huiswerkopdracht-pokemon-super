public class WaterPokemon extends Pokemon implements DragonPokemon {
    private double height;
    private double weight;

    public WaterPokemon(String name, int hp, String sound, double height, double weight) {
        super(name, hp, sound);
        this.height = height;
        this.weight = weight;
    }

    public void hydroCanon() {
        System.out.println("Hydro canon attack!");
    }

    public void rainDance() {
        System.out.println("Dancing in the rain");
    }

    public void fly() {
        System.out.println("I'm a water dragon pokemon");
    }

    @Override
    public void eat() {
        System.out.println(getPokemonName() + " eats waterplants and fish.");
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
