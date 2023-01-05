public class GrassPokemon extends Pokemon {
    private String food;
    private double weight;

    public GrassPokemon(String name, int hp, String sound, String food, double weight) {
        super(name, hp, sound);
        this.food = food;
        this.weight = weight;
    }

    public void leaveBlade() {
        System.out.println("Leaves flying around!");
    }

    public void psyBeam() {
        System.out.println("Tree hypnosis!");
    }

    @Override
    public void eat() {
        System.out.println(getPokemonName() +  "eats " + getFood());
    }

    public String getFood() {
        return food;
    }

    public double getWeight() {
        return weight;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
