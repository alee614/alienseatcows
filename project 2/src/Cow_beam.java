import java.awt.Color;
import java.awt.Graphics;

public class Cow_beam extends Cow{
    Color color;

    public Cow_beam(double x, double y) {
        super(x, y);
        this.color = new Color (102, 20, 10);
        this.speed_y = -7;
    }

    @Override
    public void draw(Graphics g) {
        g.fillOval((int)this.x, (int)this.y, 5, 5);
        g.fillOval((int)this.x + 2, (int) this.y + 2, 5, 5);
        g.fillOval((int)this.x + 4, (int) this.y + 4, 5, 5);

    }
    
}
