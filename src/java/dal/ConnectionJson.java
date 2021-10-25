/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dal;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.json.Json;

/**
 *
 * @author Carlos
 */
public class ConnectionJson {
    
    private String url;
    private String name;
    private File file;
    private FileReader reader;

    public ConnectionJson() {
        
    }
    
    public ConnectionJson(String name) throws FileNotFoundException, IOException {
        this.name = name;
        url = "/Users/Eduardo/NetBeansProjects/Avatar Generator/src/java/Json/" + name + ".json";
        file = new File(url);
        reader = new FileReader(file);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public FileReader getReader() {
        return reader;
    }

    public void setReader(FileReader reader) {
        this.reader = reader;
    }
    
}
