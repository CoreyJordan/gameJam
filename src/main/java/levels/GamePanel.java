package levels;

import javax.swing.*;
import java.awt.*;

public abstract class GamePanel extends JPanel {
    // TILE SETTINGS
    private final int tileBits = 16;
    private final int scale = 3;
    private final int tileSize = tileBits * scale;

    // SCREEN SETTINGS
    private final int columns = 17;
    private final int rows = 10;
    private final int screenWidth = tileSize * columns;
    private final int screenHeight = tileSize * rows;

    // PROPERTIES
    private String title;

    public GamePanel(String title) {
        this.title = title;
        setPreferredSize(new Dimension(screenWidth, screenHeight));
        setBackground(Color.BLACK);
        setDoubleBuffered(true);
    }

    public String getTitle() {
        return title;
    }
}
