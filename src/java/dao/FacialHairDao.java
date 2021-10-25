
package dao;

import dto.characteristics.FacialHair;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class FacialHairDao {
    
    public abstract void insert(FacialHair obj);
    
    public abstract void update(FacialHair obj);
    
    public abstract void delete(int obj);
    
    public abstract FacialHair get(int obj);
    
    public abstract List<FacialHair> list();
    
}
