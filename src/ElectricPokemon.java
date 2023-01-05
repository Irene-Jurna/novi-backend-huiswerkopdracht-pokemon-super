public class ElectricPokemon extends Pokemon{
    private String special;
    private int accuracy;

    public ElectricPokemon(String name, int hp, String sound) {
        super(name, hp, sound);
    }

    public ElectricPokemon(String name, int hp, String sound, String special, int accuracy) {
        super(name, hp, sound);
        this.special = special;
        this.accuracy = accuracy;
    }

    public void voltTackle() {
        System.out.println("Attack! Volt Tackle!");
    }

    public void electroBall() {
        System.out.println("There it comes! Electro Ball!");
    }

    @Override
    public void eat() {
        System.out.println("You can give tihs Pokemon sweets to eat");
    }

    public String getSpecial() {
        return special;
    }

    public int getAccuracy() {
        return accuracy;
    }

    public void setSpecial(String special) {
        this.special = special;
    }

    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }
}
