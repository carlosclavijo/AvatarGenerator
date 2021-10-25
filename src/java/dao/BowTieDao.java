
package dao;

import dto.characteristics.BowTie;
import java.util.List;

/**
 *
 * @author Carlos
 */
public abstract class BowTieDao {
    
    public abstract void insert(BowTie obj);
    
    public abstract void update(BowTie obj);
    
    public abstract void delete(int obj);
    
    public abstract BowTie get(int obj);
    
    public abstract List<BowTie> list();
    
}
