package com.iveely.database.ui;

import com.iveely.framework.text.JSONUtil;

/**
 * @author liufanping@iveely.com
 * @date 2015-3-28 18:14:35
 */
public class WebSocketMessage {

  public class DatabaseShown {

    private String command;
    private String[] dbs;

    public DatabaseShown() {

    }

    /**
     * @return the command
     */
    public String getCommand() {
      return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(String command) {
      this.command = command;
    }

    /**
     * @return the dbs
     */
    public String[] getDbs() {
      return dbs;
    }

    /**
     * @param dbs the dbs to set
     */
    public void setDbs(String[] dbs) {
      this.dbs = dbs;
    }

    public String toJson() {
      return JSONUtil.toString(this);
    }

  }

  public class TableShown {

    private String command;
    private String[] names;
    private Integer[] counter;

    /**
     * @return the command
     */
    public String getCommand() {
      return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(String command) {
      this.command = command;
    }

    /**
     * @return the dbs
     */
    public String[] getNames() {
      return names;
    }

    /**
     * @param names
     */
    public void setNames(String[] names) {
      this.names = names;
    }

    public String toJson() {
      return JSONUtil.toString(this);
    }

    /**
     * @return the counter
     */
    public Integer[] getCounter() {
      return counter;
    }

    /**
     * @param counter the counter to set
     */
    public void setCounter(Integer[] counter) {
      this.counter = counter;
    }
  }

  public class TableDroped {

    private String command;

    /**
     * @return the command
     */
    public String getCommand() {
      return command;
    }

    /**
     * @param command the command to set
     */
    public void setCommand(String command) {
      this.command = command;
    }

    public String toJson() {
      return JSONUtil.toString(this);
    }
  }

}
