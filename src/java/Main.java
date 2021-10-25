
import dao.FacialHairDao;
import dao.FacialHairDaoJson;
import dto.characteristics.FacialHair;
import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    
   public static void main(String args[]) throws FileNotFoundException {       
       FacialHairDao facialHair = new FacialHairDaoJson();
       //System.out.println(facialHair.list());
       //System.out.println(facialHair.get(1));
       //facialHair.insert(new FacialHair(20, 1, 2, 3, 4, 5, "", ""));
       //facialHair.update(new FacialHair(20, 5, 4, 3, 2, 1, "", ""));
       //facialHair.delete(20);
       /**
        * LIST
        * System.out.println(user.list());
        * 
        * GET
        * System.out.println(user.get(1));
        * 
        * INSERT
        * user.insert(new User(3, "Unknown", "none"));
        * 
        * UPDATE
        * user.update(new User(2, "Alberto", "contrasenia"));
        * 
        * DELETE
        * user.delete(3);
        **/
   }
}