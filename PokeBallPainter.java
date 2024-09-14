import org.code.neighborhood.*;

public class PokeBallPainter extends MuralPainter {


public PokeBallPainter() {
  
 }

  // combines methods to create the pokeball all in one
public void paintPokeBall (String mainColor, String secondColor, String thirdColor, String shadeColor) {
    paintTop(mainColor, secondColor, thirdColor, shadeColor);
    paintBottom(mainColor, secondColor, thirdColor, shadeColor);
    resetPosition();
}

  // Paints the top half of the pokeball
  // moves and turns the painter down each line
public void paintTop(String mainColor, String secondColor, String thirdColor, String shadeColor) {
  paintLine(secondColor, 4);
  paintLine(thirdColor, 4);
  paintLine(secondColor, 4);
  turnRight();
  move();
  turnRight();
  paintLine(secondColor, 2);
  paintLine(thirdColor, 2);
  paintLine(mainColor, 4);
  paintLine(thirdColor, 2);
  paintLine(secondColor, 2);
  turnLeft();
  move();
  turnLeft();
  paintLine(secondColor, 1);
  paintLine(thirdColor, 1);
  paintLine(mainColor, 8);
  paintLine(thirdColor, 1);
  paintLine(secondColor, 1);
  turnRight();
  move();
  turnRight();
  paintLine(secondColor, 1);
  paintLine(thirdColor, 1);
  paintLine(mainColor, 8);
  paintLine(thirdColor, 1);
  paintLine(secondColor, 1);
  turnLeft();
  move();
  turnLeft();
  paintLine(thirdColor, 1);
  paintLine(mainColor, 10);
  paintLine(thirdColor, 1);
  turnRight();
  move();
  turnRight();
  paintLine(thirdColor, 1);
  paintLine(mainColor, 4);
  paintLine(thirdColor, 2);
  paintLine(mainColor, 4);
  paintLine(thirdColor, 1);
  turnLeft();
  move();
  turnLeft();
  paintLine(thirdColor, 2);
  paintLine(mainColor, 2);
  paintLine(thirdColor, 1);
  paintLine(secondColor, 1);
  paintLine(shadeColor, 1);
  paintLine(thirdColor, 1);
  paintLine(mainColor, 2);
  paintLine(thirdColor, 2);

    }

  // Paints the bottom half of the pokeball
  // also moves the painter down and turns it
public void paintBottom(String mainColor, String secondColor, String thirdColor, String shadeColor) {
  turnRight();
  move();
  turnRight();
  paintLine(thirdColor, 1);
  paintLine(shadeColor, 1);
  paintLine(thirdColor, 3);
  paintLine(shadeColor, 2);
  paintLine(thirdColor, 3);
  paintLine(secondColor, 1);
  paintLine(thirdColor, 1);
  turnLeft();
  move();
  turnLeft();
  paintLine(secondColor, 1);
  paintLine(thirdColor, 1);
  paintLine(secondColor, 3);
  paintLine(thirdColor, 2);
  paintLine(shadeColor, 3);
  paintLine(thirdColor, 1);
  paintLine(secondColor, 1);
  turnRight();
  move();
  turnRight();
  paintLine(secondColor, 1);
  paintLine(thirdColor, 1);
  paintLine(shadeColor, 4);
  paintLine(secondColor, 3);
  paintLine(shadeColor, 1);
  paintLine(thirdColor, 1);
  paintLine(secondColor, 1);
  turnLeft();
  move();
  turnLeft();
  paintLine(secondColor, 2);
  paintLine(thirdColor, 2);
  paintLine(shadeColor, 4);
  paintLine(thirdColor, 2);
  paintLine(secondColor, 2);
  turnRight();
  move();
  turnRight();
  paintLine(secondColor, 4);
  paintLine(thirdColor, 4);
  paintLine(secondColor, 4);
  }

}