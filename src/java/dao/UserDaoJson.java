package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dal.ConnectionJson;
import dto.User;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Carlos
 */
public class UserDaoJson extends UserDao{

    @Override
    public void insert(User obj) {
        try {
            ConnectionJson con = new ConnectionJson("User");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<User> list = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
            list.add(obj);
            String json = new Gson().toJson(list);
            FileWriter writer = new FileWriter(file, false);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(UserDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(User obj) {
        try {
            ConnectionJson con = new ConnectionJson("User");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<User> list = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
            int num = obj.getId();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == num) {
                    list.get(i).setName(obj.getName());
                    list.get(i).setPassword(obj.getPassword());
                }
            }
            String json = new Gson().toJson(list);
            FileWriter writer = new FileWriter(file, false);
            writer.write(json);
            writer.close();
        } catch (IOException ex) {
            
        }
    }

    @Override
    public void delete(int obj) {
        try {
            ConnectionJson con = new ConnectionJson("User");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<User> list = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == obj) {
                    list.remove(list.get(i));
                }
            }
            String json = new Gson().toJson(list);
            FileWriter writer = new FileWriter(file, false);
            writer.write(json);
            writer.close();
        } catch (IOException ex) {
            Logger.getLogger(UserDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public User get(int obj) {
        try {
            ConnectionJson con = new ConnectionJson("User");
            FileReader reader = con.getReader();
            List<User> list = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
            return list.get(obj);
        } catch (FileNotFoundException ex) {
            System.out.println("No such file");
        } catch (IOException ex) {
            Logger.getLogger(UserDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<User> list() {
        try {
            ConnectionJson con = new ConnectionJson("User");
            FileReader reader = con.getReader();
            List<User> list = new Gson().fromJson(reader, new TypeToken<List<User>>() {}.getType());
            return list;
        } catch (FileNotFoundException ex) {
            System.out.println("There's no list");
        } catch (IOException ex) {
            Logger.getLogger(UserDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
