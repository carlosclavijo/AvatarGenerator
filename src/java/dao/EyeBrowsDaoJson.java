package dao;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import dal.ConnectionJson;
import dto.characteristics.EyeBrows;
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
public class EyeBrowsDaoJson extends EyeBrowsDao{

    @Override
    public void insert(EyeBrows obj) {
        try {
            ConnectionJson con = new ConnectionJson("EyeBrows");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<EyeBrows> list = new Gson().fromJson(reader, new TypeToken<List<EyeBrows>>() {}.getType());
            list.add(obj);
            String json = new Gson().toJson(list);
            FileWriter writer = new FileWriter(file, false);
            writer.write(json);
            writer.close();
        } catch (FileNotFoundException ex) {
            
        } catch (IOException ex) {
            Logger.getLogger(EyeBrowsDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void update(EyeBrows obj) {
        try {
            ConnectionJson con = new ConnectionJson("EyeBrows");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<EyeBrows> list = new Gson().fromJson(reader, new TypeToken<List<EyeBrows>>() {}.getType());
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
            ConnectionJson con = new ConnectionJson("EyeBrows");
            FileReader reader = con.getReader();
            File file= con.getFile();
            List<EyeBrows> list = new Gson().fromJson(reader, new TypeToken<List<EyeBrows>>() {}.getType());
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
            Logger.getLogger(EyeBrowsDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public EyeBrows get(int obj) {
        try {
            ConnectionJson con = new ConnectionJson("EyeBrows");
            FileReader reader = con.getReader();
            List<EyeBrows> list = new Gson().fromJson(reader, new TypeToken<List<EyeBrows>>() {}.getType());
            return list.get(obj);
        } catch (FileNotFoundException ex) {
            System.out.println("No such file");
        } catch (IOException ex) {
            Logger.getLogger(EyeBrowsDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    @Override
    public List<EyeBrows> list() {
        try {
            ConnectionJson con = new ConnectionJson("EyeBrows");
            FileReader reader = con.getReader();
            List<EyeBrows> list = new Gson().fromJson(reader, new TypeToken<List<EyeBrows>>() {}.getType());
            return list;
        } catch (FileNotFoundException ex) {
            System.out.println("There's no list");
        } catch (IOException ex) {
            Logger.getLogger(EyeBrowsDaoJson.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
