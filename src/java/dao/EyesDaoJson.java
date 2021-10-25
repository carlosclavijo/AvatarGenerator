package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dal.ConnectionJson;
import dto.characteristics.Eyes;
import dto.characteristics.Eyes;
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
public class EyesDaoJson extends EyesDao{

    @Override
    public void insert(Eyes obj) {
        try {
            ConnectionJson con = new ConnectionJson("Eyes");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<Eyes> list = new Gson().fromJson(reader, new TypeToken<List<Eyes>>() {}.getType());
            list.add(obj);
            String json = new Gson().toJson(list);
            FileWriter writer = new FileWriter(file, false);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(EyesDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(Eyes obj) {
        try {
            ConnectionJson con = new ConnectionJson("Eyes");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<Eyes> list = new Gson().fromJson(reader, new TypeToken<List<Eyes>>() {}.getType());
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
            ConnectionJson con = new ConnectionJson("Eyes");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<Eyes> list = new Gson().fromJson(reader, new TypeToken<List<Eyes>>() {}.getType());
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
            Logger.getLogger(EyesDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public Eyes get(int obj) {
        try {
            ConnectionJson con = new ConnectionJson("Eyes");
            FileReader reader = con.getReader();
            List<Eyes> list = new Gson().fromJson(reader, new TypeToken<List<Eyes>>() {}.getType());
            return list.get(obj);
        } catch (FileNotFoundException ex) {
            System.out.println("No such file");
        } catch (IOException ex) {
            Logger.getLogger(EyesDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<Eyes> list() {
        try {
            ConnectionJson con = new ConnectionJson("Eyes");
            FileReader reader = con.getReader();
            List<Eyes> list = new Gson().fromJson(reader, new TypeToken<List<Eyes>>() {}.getType());
            return list;
        } catch (FileNotFoundException ex) {
            System.out.println("There's no list");
        } catch (IOException ex) {
            Logger.getLogger(EyesDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
