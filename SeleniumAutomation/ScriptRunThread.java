/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SeleniumAutomation;

import java.awt.AWTException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mpentakota
 */
public class ScriptRunThread extends Thread{
    static String casepath;
    public ScriptRunThread(String casepath){
        this.casepath = casepath;
    }
    @Override
    public void run() {
        try {
            
            DriverScript.Initializationscript(casepath);
        } catch (InterruptedException ex) {
            Logger.getLogger(ScriptRunThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (AWTException ex) {
            Logger.getLogger(ScriptRunThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ScriptRunThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ScriptRunThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(ScriptRunThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(ScriptRunThread.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ScriptRunThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
