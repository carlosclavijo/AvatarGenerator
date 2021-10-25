
package dao;

import dto.characteristics.Eyes;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class EyesDao {
    
    public abstract void insert(Eyes obj);
    
    public abstract void update(Eyes obj);
    
    public abstract void delete(int obj);
    
    public abstract Eyes get(int obj);
    
    public abstract List<Eyes> list();
    
}
