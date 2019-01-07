import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;


public class MapGenerator {

    public static void main(String[] args){
        Map map = new Map();
        BufferedImage mountain_map = null;
        BufferedImage river_map = null;
        try{
            mountain_map = ImageIO.read(new File("/home/usuryjskij/Pulpit/Cywilizacja/MapGenerator/src/maps/mountains.jpg"));
            river_map = ImageIO.read(new File("/home/usuryjskij/Pulpit/Cywilizacja/MapGenerator/src/maps/rivers.jpg"));
        } catch(IOException e){
            System.out.print(e);
        }
        map.readMap(mountain_map, Map.MapType.MOUNTAIN_MAP);
        map.readMap(river_map, Map.MapType.RIVER_MAP);
        map.findLandBorder();
        map.setDistancesToWater();
        map.drawMap();

    }
}
