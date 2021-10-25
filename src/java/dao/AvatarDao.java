
package dao;

import dto.Avatar;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class AvatarDao {
    
    public abstract void insert(Avatar obj);
    
    public abstract void update(Avatar obj);
    
    public abstract void delete(int obj);
    
    public abstract Avatar get(int obj);
    
    public abstract List<Avatar> list();
    
}
