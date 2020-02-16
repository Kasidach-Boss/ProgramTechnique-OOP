class Main {
    public static void main(String[] args) {
    Pokemon pikachu = new Pokemon("Pikachu");
    Pokemon pikachu1 = new Pokemon("PikachuLevel1");
    /*System.out.println(pikachu.toString());
    System.out.println(pikachu1.toString());
    pikachu.eat();
    pikachu1.eat();
    System.out.println(pikachu.toString());
    System.out.println(pikachu1.toString());*/
    System.out.println("________________________ARRAYLIST");
    PokemonCenter pc = new PokemonCenter();
    pc.add(pikachu);
    pc.add(pikachu1);
    System.out.println("Before feed");
    pc.printPokemons();
    System.out.println("After feed");
    pc.feed();
    pc.printPokemons();

    }
}