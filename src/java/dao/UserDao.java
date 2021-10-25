
package dao;

import dto.User;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class UserDao {
    
    public abstract void insert(User obj);
    
    public abstract void update(User obj);
    
    public abstract void delete(int obj);
    
    public abstract User get(int obj);
    
    public abstract List<User> list();
    
}
