
package dao;

import dto.characteristics.Wallpaper;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class WallpaperDao {
    
    public abstract void insert(Wallpaper obj);
    
    public abstract void update(Wallpaper obj);
    
    public abstract void delete(int obj);
    
    public abstract Wallpaper get(int obj);
    
    public abstract List<Wallpaper> list();
    
}
