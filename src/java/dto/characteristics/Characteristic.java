/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto.characteristics;

/**
 *
 * @author Carlos
 */
public abstract class Characteristic {
    
    protected int id;
    protected int posX;
    protected int posY;
    protected int width;
    protected int height;
    protected int zIndex;
    protected String source;
    protected String filter;

    public abstract int getId();
    
    public abstract void setId(int id);
    
    public abstract int getPosX();
    
    public abstract void setPosX(int posX);

    public abstract int getPosY();

    public abstract void setPosY(int posY);
    
    public abstract int getWidth();
    
    public abstract void setWidth(int width);
    
    public abstract int getHeight();
    
    public abstract void setHeight(int height);
    
    public abstract int getzIndex();
    
    public abstract void setzIndex(int zIndex);

    public abstract String getSource();
    
    public abstract void setSource(String source);

    public abstract String getFilter();

    public abstract void setFilter(String filter);

}
