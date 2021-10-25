
package dao;

import dto.characteristics.Hair;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class HairDao {
    
    public abstract void insert(Hair obj);
    
    public abstract void update(Hair obj);
    
    public abstract void delete(int obj);
    
    public abstract Hair get(int obj);
    
    public abstract List<Hair> list();
    
}
