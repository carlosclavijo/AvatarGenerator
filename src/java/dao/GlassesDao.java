
package dao;

import dto.characteristics.Glasses;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class GlassesDao {
    
    public abstract void insert(Glasses obj);
    
    public abstract void update(Glasses obj);
    
    public abstract void delete(int obj);
    
    public abstract Glasses get(int obj);
    
    public abstract List<Glasses> list();
    
}
