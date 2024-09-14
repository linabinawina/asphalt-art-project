import org.code.neighborhood.*;

public class NeighborhoodRunner {
  public static void main(String[] args) {

    // Creates the mural painter and makes the background color white
    MuralPainter mp = new MuralPainter();
    mp.paintBackground("white", 12);

    // Creates the pokeball painter and assigns indiviudal colors to each arguement
    PokeBallPainter pbp = new PokeBallPainter();
    pbp.paintPokeBall("red", "white", "black", "gray");

    
  }
}