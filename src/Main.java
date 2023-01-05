public class Main {
    public static void main(String[] args) {

        // Instantiatie voorbeeld #1
        FirePokemon charmander = new FirePokemon("Charmander", 100, "charmander char", 15, "an omnivorous diet");

        System.out.println("General information on this Pokemon:\n- Name: " + charmander.getPokemonName() + "\n- Health points: " + charmander.getHealthPoints() + "\n- Level: " + charmander.getLevel());

        charmander.eat();
        charmander.fireLash();
        charmander.flameThrower();
        charmander.sleep();

        System.out.println(charmander.getFood());

        charmander.setPokemonName("Charizard");
        charmander.setPokemonType("Fire Pokemon");
        System.out.println("Charmander evoluded to " + charmander.getPokemonName() + "!");
        System.out.println(charmander.getPokemonName() + " is a " + charmander.getPokemonType());
        charmander.setHealthPoints(150);
        System.out.println("She has " + charmander.getHealthPoints() + " health points");
        charmander.setLevel(20);
        charmander.setFood("Fire food for adult animals");
        System.out.println(charmander.getPokemonName() + " is now in level " + charmander.getLevel() + ". Her new diet is " + charmander.getFood() + ".");

        // Instantiatie voorbeeld #2
        WaterPokemon waterTurtle = new WaterPokemon("Waterturtle", 10, "Tuuuuuurtle", 0.58, 2.5);

        System.out.println("General information on this Pokemon:\n- Name: " + waterTurtle.getPokemonName() + "\n- Health points: " + waterTurtle.getHealthPoints() + "\n- Weight: " + waterTurtle.getWeight());

        waterTurtle.rainDance();
        waterTurtle.eat();
        waterTurtle.setWeight(3.0);
        System.out.println(waterTurtle.getPokemonName() + " ate too much. He now weights: " + waterTurtle.getWeight() + " kilos");

        // Instantiatie voorbeeld #3
        GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 9, "bulba bulba bulba sour", "just grass", 5.5);

        System.out.println("General information on this Pokemon:\n- Name: " + bulbasaur.getPokemonName() + "\n- Health points: " + bulbasaur.getHealthPoints() + "\n- Food: " + bulbasaur.getFood());

        bulbasaur.leaveBlade();
        bulbasaur.psyBeam();
        System.out.println(bulbasaur.getPokemonName() + " won the match! She now has " + (bulbasaur.getHealthPoints() + 1) + " health points.");

        // Instantiatie voorbeeld #4
        ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 25, "Pika pika");

        pikachu.setSpecial("ability to fly");

        System.out.println("General information on this Pokemon:\n- Name: " + pikachu.getPokemonName() + "\n- Health points: " + pikachu.getHealthPoints() + "\n- Special: " + pikachu.getSpecial());

        System.out.println(pikachu.getSound());
    }
}
