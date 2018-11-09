import java.awt.Color;
import java.awt.Graphics;

public class Alien_beam extends Alien{
    Color color;

    public Alien_beam(double x, double y) {
        super(x, y);
        this.color = Color.lightGray;
        this.speed_y = 5;

    }

    public void draw(Graphics g) {
        g.setColor(this.color);
        g.fillRect((int) this.x, (int) this.y,1, 4 );

    }
    public void update(int pic_width, int pic_height, int frame) {
        this.y += speed_y;
    }
        // if the y coordinate and the x coordinate match up with that of the alien, then it disappears??????????????




    }
