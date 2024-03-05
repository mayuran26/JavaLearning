package com.selflearning.accessingFileLocation;

import javax.imageio.IIOException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyHandler {

    private Properties mainProp = new Properties();
    private Properties envProp = new Properties();
    public PropertyHandler(){
        loadProperties("config.properties", mainProp);
        String env = "dev";
        loadProperties(String.format("config/%s/env.properties", env), envProp);
        //loadProperties(String.format("config/%s/env.properties", env), envProp);
    }

    private void loadProperties(String path, Properties properties){

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(path);
        if(inputStream!=null){
            try {
                properties.load(inputStream);
            }catch (IOException e){
                throw new RuntimeException(e);
            }
        }else {
            throw new RuntimeException("Property file " +path + "not found in the class path");
        }

    }
    public String getStoreBaseurl()
    {
        String url; //= System.getProperty("store.base.url");
        url = envProp.getProperty("store.base.url");
        return url;
    }
}
