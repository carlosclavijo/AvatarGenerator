
package dao;

import dto.characteristics.EyeBrows;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class EyeBrowsDao {
    
    public abstract void insert(EyeBrows obj);
    
    public abstract void update(EyeBrows obj);
    
    public abstract void delete(int obj);
    
    public abstract EyeBrows get(int obj);
    
    public abstract List<EyeBrows> list();
    
}
