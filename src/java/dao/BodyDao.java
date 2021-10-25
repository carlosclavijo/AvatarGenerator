
package dao;

import dto.characteristics.Body;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class BodyDao {
    
    public abstract void insert(Body obj);
    
    public abstract void update(Body obj);
    
    public abstract void delete(int obj);
    
    public abstract Body get(int obj);
    
    public abstract List<Body> list();
    
}
