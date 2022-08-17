package academy.learnprogramming;

// create a Movie class
// declare variables for the Movie class
// create an initializer constructor
// create a method for the plot
// create five additional classes which are going to inherit from the Movie class
// Initialize the name field from the base class
// Return the plot of each movie
// Create a method which will randomly return one of the five movies
// create a for loop to get a movie x times

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot() {
        return "No plot here";
    }

    public String getName(){
        return name;
    }
}

//Movie1
class Jaws extends Movie{
    public Jaws() {
        super("Jaws");
    }

    @Override
    public String plot() {
        return "A shark eats a lot of people";
    }
}

//Movie2
class IndependenceDay extends Movie{
    public IndependenceDay() {
        super("IndependenceDay");
    }

    @Override
    public String plot() {
        return "Aliens atempt to take over planert Earth";
    }
}

//Movie3
class MazeRunner extends Movie{
    public MazeRunner() {
        super("MazeRunner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze.";
    }
}

//Movie4
class StarWars extends Movie{
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial forces try to take over the universe.";
    }
}

//Movie5
class Forgetable extends Movie{
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i=1; i<11; i++) {
            Movie movie = randomMovie();
            System.out.println(("Movie #" +i +
                                " : " +movie.getName()) + "\n" +
                                "Plot: " + movie.plot() + "\n");
        }
    }

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random number generated was: " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new IndependenceDay();
            case 3:
                return new MazeRunner();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
        }

        return null;
    }
}