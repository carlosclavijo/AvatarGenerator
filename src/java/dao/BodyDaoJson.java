package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dal.ConnectionJson;
import dto.characteristics.Body;
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
public class BodyDaoJson extends BodyDao{

    @Override
    public void insert(Body obj) {
        try {
            ConnectionJson con = new ConnectionJson("Body");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<Body> list = new Gson().fromJson(reader, new TypeToken<List<Body>>() {}.getType());
            list.add(obj);
            String json = new Gson().toJson(list);
            FileWriter writer = new FileWriter(file, false);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(BodyDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Body obj) {
        try {
            ConnectionJson con = new ConnectionJson("Body");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<Body> list = new Gson().fromJson(reader, new TypeToken<List<Body>>() {}.getType());
            int num = obj.getId();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getId() == num) {
                    ;
                    list.get(i).setPosX(obj.getPosX());
                    list.get(i).setPosY(obj.getPosY());
                    list.get(i).setWidth(obj.getWidth());
                    list.get(i).setHeight(obj.getHeight());
                    list.get(i).setzIndex(obj.getzIndex());
                    list.get(i).setSource(obj.getSource());
                    list.get(i).setFilter(obj.getFilter());
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
            ConnectionJson con = new ConnectionJson("Body");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<Body> list = new Gson().fromJson(reader, new TypeToken<List<Body>>() {}.getType());
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
            Logger.getLogger(BodyDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Body get(int obj) {
        try {
            ConnectionJson con = new ConnectionJson("Body");
            FileReader reader = con.getReader();
            List<Body> list = new Gson().fromJson(reader, new TypeToken<List<Body>>() {}.getType());
            return list.get(obj);
        } catch (FileNotFoundException ex) {
            System.out.println("No such file");
        } catch (IOException ex) {
            Logger.getLogger(BodyDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Body> list() {
        try {
            ConnectionJson con = new ConnectionJson("Body");
            FileReader reader = con.getReader();
            List<Body> list = new Gson().fromJson(reader, new TypeToken<List<Body>>() {}.getType());
            return list;
        } catch (FileNotFoundException ex) {
            System.out.println("There's no list");
        } catch (IOException ex) {
            Logger.getLogger(BodyDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
