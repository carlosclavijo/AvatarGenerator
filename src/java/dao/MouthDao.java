
package dao;

import dto.characteristics.Mouth;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class MouthDao {
    
    public abstract void insert(Mouth obj);
    
    public abstract void update(Mouth obj);
    
    public abstract void delete(int obj);
    
    public abstract Mouth get(int obj);
    
    public abstract List<Mouth> list();
    
}
