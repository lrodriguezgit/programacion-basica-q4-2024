package ejercicios.gabo.ColorGhost;

import java.util.Random;

public class Ghost {
    private String color;

    // Constructor
    public Ghost (){
        this.color = randomColor();
    }

    public String randomColor(){
        Random random = new Random();
        String color = "default";
        int num = random.nextInt(4)+1;
        if (num == 1) color = "white";
        else if (num == 2) color = "yellow";
        else if (num == 3) color = "purple";
        else if (num == 4) color = "red";
        return color;
    }

    public String getColor(){
        return color;
    }
}

