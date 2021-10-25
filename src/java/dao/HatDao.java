
package dao;

import dto.characteristics.Hat;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class HatDao {
    
    public abstract void insert(Hat obj);
    
    public abstract void update(Hat obj);
    
    public abstract void delete(int obj);
    
    public abstract Hat get(int obj);
    
    public abstract List<Hat> list();
    
}
