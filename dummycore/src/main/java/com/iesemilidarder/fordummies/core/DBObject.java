package com.iesemilidarder.fordummies.core;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class DBObject {

    private final Logger log = LoggerFactory.getLogger(DBObject.class);

    protected abstract void beforeSave();
    public void save(){
        try{
            beforeSave();
            //
        }catch (Exception e){
            log.error("Saving data",e);
        }
    }
    public void delete(){
      log.error("Not implemented yet");
    }
    public void update() {
        log.error("Not implemented yet");
    }

    protected void doLog(String txt){
        System.out.println("dbOperation" + txt);
        log.warn(txt);
    }
}
