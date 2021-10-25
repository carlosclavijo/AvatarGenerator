
package dto.characteristics;

/**
 *
 * @author Carlos
 */
public class Body extends Characteristic{
    
    private int hPosX;
    private int hPosY;

    public Body() {}
    
    public Body(int id, int posX, int posY, int width, int height, int zIndex, String source, String filter, int hPosX, int hPosY) {
        this.id = id;
        this.posX = posX;
        this.posY = posY;
        this.width = width;
        this.height = height;
        this.zIndex = zIndex;
        this.source = source;
        this.filter = filter;
        this.hPosX = hPosX;
        this.hPosY = hPosY;
    }
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int getPosX() {
        return posX;
    }

    @Override
    public void setPosX(int posX) {
        this.posX = posX;
    }

    @Override
    public int getPosY() {
        return posY;
    }

    @Override
    public void setPosY(int posY) {
        this.posY = posY;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getzIndex() {
        return zIndex;
    }

    @Override
    public void setzIndex(int zIndex) {
        this.zIndex = zIndex;
    }

    @Override
    public String getSource() {
        return source;
    }

    @Override
    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String getFilter() {
        return filter;
    }

    @Override
    public void setFilter(String filter) {
        this.filter = filter;
    }

    public int gethPosX() {
        return hPosX;
    }

    public void sethPosX(int hPosX) {
        this.hPosX = hPosX;
    }

    public int gethPosY() {
        return hPosY;
    }

    public void sethPosY(int hPosY) {
        this.hPosY = hPosY;
    }

    @Override
    public String toString() {
        return "Body{\nid = " + id + ",\nposX = " + posX + ",\nposY = " + posY + ",\nwidth = " + width + ",\nheight = " + height + ",\nzIndex = " + zIndex + ",\nsource = " + source + ",\nhPosX = " + hPosX + ",\nhPosY = " + hPosY + "\n}";
    }

}
