package de.rares.rarescloud.master.filemanager;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Prop {

    private File t;
    private Properties prop = new Properties();

    protected Prop(File f) throws Exception {
        t = f;
        prop.load(new FileInputStream(t));
    }


    private void applyProp() throws IOException {
        prop.store(new FileOutputStream(t), "null");
    }

    public void resetProp() throws IOException {
        prop.load(new FileInputStream(t));
    }

    public void setProp(String k, String v) throws IOException {
        prop.setProperty(k, v);
        applyProp();

    }

    public String getProp(String k) {
        return prop.getProperty(k);
    }

}
