package SeleniumAutomation;

import static SeleniumAutomation.CommonFunctions.date;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JFileChooser;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Element;

//import com.thoughtworks.selenium.webdriven.commands.KeyEvent;
import SeleniumAutomation.DriverScript.ActionTypes;
import static SeleniumAutomation.DriverScript.blnResult;
import static SeleniumAutomation.DriverScript.failvalue;
import static SeleniumAutomation.ReportFunctions.FinalStatus;
import static SeleniumAutomation.ReportFunctions.xmlSavedLocation;
import static com.google.common.base.Predicates.or;
import com.sun.imageio.plugins.jpeg.JPEG;
import static com.sun.javafx.util.Utils.split;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.date;
import java.awt.Color;
import static java.awt.Color.blue;
import static java.awt.Color.red;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import static java.lang.ProcessBuilder.Redirect.to;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import static java.time.Instant.now;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Vector;
import net.iharder.Base64;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.JavascriptExecutor;
import static sun.util.calendar.CalendarUtils.mod;
import java.util.Date;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import static javafx.scene.paint.Color.color;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.Authenticator;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.script.Invocable;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.jasper.tagplugins.jstl.core.Catch;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import static org.apache.poi.hssf.usermodel.HeaderFooter.date;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.openxml4j.util.ZipSecureFile;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.HorizontalAlignment;
import org.apache.poi.ss.usermodel.IndexedColors;
import static org.apache.poi.ss.usermodel.IndexedColors.RED;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFFormulaEvaluator;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import static org.hamcrest.Matchers.array;
import static org.hamcrest.collection.IsArray.array;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.html5.WebStorage;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import GoogleAPI.SheetsAutomation;
import static GoogleAPI.SheetsAutomation.writeDatatoSheet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CommonFunctions {

    public static ExecutorService executorService = Executors.newFixedThreadPool(3);
    public static WebDriver driver;
    public static Connection conn;
    public final static HashMap<String, String> hmap = new HashMap<String, String>();
    public final static HashMap<String, Integer> TChmap = new HashMap<String, Integer>();
    public final static HashMap<String, String> TCstatushmap = new HashMap<String, String>();
    public final static HashMap<Integer, String> sanitymap = new HashMap<Integer, String>();
    public final static HashMap<String, List> GroupMap = new HashMap<String, List>();
    private static final String MSEC_SINCE_EPOCH = null;
    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue
            = new byte[]{'T', 'h', 'i', 's', 'I', 's', 'A', 'S', 'e', 'c', 'r', 'e', 't', 'K', 'e', 'y'};

    private static int flag;
    public static java.util.Date odate;
    public static String Tcase;
    public static int timer;
    static DriverScript ds;
    public static String user;
    public static String Tsuitename;
    public static String suitename;
    public static String Tcasename;
    public static String updstpstatus = null;
    public static String envfilepath = null;
    public static String savedlocation = null;
    public static String Tstep = "Tstep";
    public static String locator;
    public static Element prjElement = null;
    public static Element tsElement = null;
    public static Element tcElement = null;
    public static Element tstpElement = null;
    public static String SCellData;
    public static ChromeOptions options;
    public static String muldatastatus;
    public static String mulpledata;
    public static String url;
    public static Date date;
    public static DateFormat formatter;
    public static String today;
    public static String[] dateformat;
    public static String finaldate;
    public static String dat;
    public static int fcolval;
    public static String value;
    public static String data;
    public static String storedatavalue;
    public static Boolean storedataflag = null;
    public static boolean sendmail = false;
    public static int Tcasecount = 0;
    public static String TCasenames;
    public static String exsuitestatus = null;
    public static String exduration = null;
    public static String display;
    public static String exelcasefinalstatus;
    public static int casecount = 0;
    public static int sanitycnt = 1;
    public static int tempnum = 0;
    public static int sanitydash = 1000;
    public static int sanityVerifyFilterswithLOV = 2000;
    public static int sanityVerifyFilterswithText = 3000;
    public static int sanityVerifyOnPagePromptswithLOV = 4000;
    public static int sanityVerifyOnPagePromptswithText = 5000;
    public static int sanityVerifyFilterswithadaterange = 6000;
    public static int sanityVerifysavedFilterswithLOV = 7000;
    public static int sanityVerifysavedFilterswithText = 8000;
    public static int sanityVerifyNewformisloading = 9000;
    public static int sanityVerifySearch = 10000;
    public static int sanityVerifyFWDActions = 11000;
    public static int sanityVerifyDrills = 12000;
    public static int sanityVerifySortingfunctionality = 13000;
    public static int sanityVerifyangularpage = 14000;
    public static String casestatus;
    public static String Esuitename = null;
    public static String Esuiteduration;
    public static String ESuitestatus;
    public static int TCpasscount = 0;
    public static int TCfailcount = 0;
    public static String Stpname = null;
    public static String releasename;
    public static String environmentname;
    public static String mailgroup;
    public static String Customername;
    public static String Typeofrun;
    public static String sheetsuitename;
    public static String sheetenvironment;
    public static String writedatatoexcel;
    public static String Dashboard = null;
    public static String temp = null;
    public static HashSet<String> servicehistory = new HashSet<String>();
    public static ArrayList<String> Questionstype = new ArrayList<String>();
    public static ArrayList<String> Questions = new ArrayList<String>();
    public static HashMap<String, List> Questionsmap = new HashMap<String, List>();
    public static HashMap<String, List> Typemap = new HashMap<String, List>();
    public static String mailsuite = null;
    public static String stppass = null;
    public final static HashMap<String, String> hpass = new HashMap<String, String>();
    public static HashMap<String, List> teststepsmap = new HashMap<String, List>();
    public static ArrayList<String> teststepslist = new ArrayList<String>();
    public static ArrayList<String> teststeps = new ArrayList<String>();
    public static HashMap<String, List> xmlcases = new HashMap<String, List>();
    public static ArrayList<String> xmlsteps = new ArrayList<String>();
    public static HashMap<String, String> mailcontent = new HashMap<String, String>();
    public static String mailendtime = null;
    public static String mailstarttime = null;
    public static String ESuiteDuration = null;
    public static String day = null;
    public static String runsuser = null;
    public static String suitetenant;
    public static String suiterelease = null;
    public static String suiteenvurl = null;
    public static String summarypath = null;
    public static List<Object> Writedata = new ArrayList<Object>();
    public static List<List<Object>> writedatatosheet = new ArrayList<List<Object>>();
    public static String wait = "1";

    public enum ActionTypes {

        TAB, ENTER, F12, DOWN, ESCAPE, ORGANIZATION
    }

    public static void main(String[] args) throws Exception {

    }

    public static String readpath() throws IOException {

        String workingDirectory = new java.io.File(".").getCanonicalPath();
        try {
            System.out.println(workingDirectory);
            return workingDirectory;
        } catch (Exception e) {

            //e.printStackTrace();
            //  System.out.println(e.getMessage());
        }
        return workingDirectory;
    }

    public static boolean LAUNCHBROWSER(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {

        try {

            String workingDirectory = new java.io.File(".").getCanonicalPath();
            String actualurl = null;

            String[] arguments = splitfunction(parameters, "->");

            String browser = arguments[1];
            if (hmap.containsKey(arguments[2].trim())) {
                url = hmap.get(arguments[2].trim());
            } else {
                url = arguments[2].trim();
            }

            switch (browser) {

                case "IE explorer":
                    System.setProperty("webdriver.ie.driver", workingDirectory + "/JavaJarfiles/IEDriverServer.exe");
                    driver = new InternetExplorerDriver();
                    driver.get(url);
                    driver.manage().window().maximize();
                    actualurl = driver.getCurrentUrl();
                    break;
                case "FireFox":
                    workingDirectory = new java.io.File(".").getCanonicalPath();
                    String dpath = workingDirectory;
                    File file = new File(dpath + "\\Savedoutput");
                    String[] myFiles;
                    if (file.isDirectory()) {
                        myFiles = file.list();
                        for (int i = 0; i < myFiles.length; i++) {
                            File myFile = new File(file, myFiles[i]);
                            myFile.delete();
                        }
                    }
                    FirefoxProfile profile = new FirefoxProfile();
                    profile.setPreference("browser.download.dir", dpath + "\\Savedoutput");
                    profile.setPreference("browser.download.folderList", 2);
                    //profile.setPreference("browser.helperApps.alwaysAsk.force", "false");
                    profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/x-excel, application/x-msexcel, application/excel, application/vnd.ms-excel,application/xls;");
                    //profile.setPreference("browser.download.manager.showWhenStarting", "false");
                    profile.setPreference("pdfjs.disabled", "true");
                    driver = new FirefoxDriver((Capabilities) profile);
                    driver.get(url);
                    driver.manage().window().maximize();
                    actualurl = driver.getCurrentUrl();
                    break;
                case "Chrome":
//                    System.setProperty("webdriver.chrome.driver", workingDirectory + "/JavaJarfiles/chromedriver.exe");
//                    ChromeOptions options = new ChromeOptions();
//                    //options.setBinary( workingDirectory + "/JavaJarfiles/chrome-win/chrome.exe");
//                    options.setBinary("C:/Users/mpentakota/AppData/Local/Chromium/Application/chrome.exe");
//                    // System.setProperty("webdriver.chrome.driver", workingDirectory + "/JavaJarfiles/chromedriver.exe");
//                    // WebDriver driver = new ChromeDriver(options);
//                    options.addArguments("--disable-notifications");
//                    options.addArguments("disable-infobars");
//                    DesiredCapabilities caps = DesiredCapabilities.chrome();
//                    caps.setCapability(ChromeOptions.CAPABILITY, options);
//                    driver = new ChromeDriver(options);
//                    driver.get(url);
//                    driver.manage().window().maximize();
//                    actualurl = driver.getCurrentUrl();
                    System.setProperty("webdriver.chrome.driver", workingDirectory + "/JavaJarfiles/chromedriver.exe");
                    options = new ChromeOptions();
                    options.addArguments("disable-infobars");
                    // options.addArguments("--incognito");
                    driver = new ChromeDriver(options);
                    //WebDriver driver = new HtmlUnitDriver();
                    driver.get(url);
                    driver.manage().window().maximize();
                    driver.manage().deleteAllCookies();
                    driver.navigate().refresh();
                    //driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
                    //driver.manage().timeouts().pageLoadTimeout(2, TimeUnit.SECONDS);
                    actualurl = driver.getCurrentUrl();
                    if (!(driver instanceof WebStorage)) {
                        throw new IllegalArgumentException("This test expects the driver to implement WebStorage");
                    }
                    WebStorage webStorage = (WebStorage) driver;
                    webStorage.getSessionStorage().clear();
                    webStorage.getLocalStorage().clear();
                    break;

            }

            if (url.equals(url)) {
                // //ReportFunctions.LogRepoter("pass", "Entered URL to Launch Applicatioin", "Application launched succesfully");
                return true;
            } else {
                //System.out.println(driver.getCurrentUrl());
                //ReportFunctions.LogRepoter("Fail", "Entered URL to Launch Applicatioin", "Failed to launch application");
                // WAITTIME("waittime->2");
                // CLOSEALLBROWSERS(driver);
                return false;

            }
        } catch (Exception e) {;
            // System.out.println(e.getMessage());
            return false;
        }

    }

    public static String[] splitfunction(String keyparameters, String symbol) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String[] parameters = null;
        try {

            if (symbol == "+") {
                symbol = "\\+";
            } else if (symbol == "|") {
                symbol = "\\|";
            } else if (symbol == "*") {
                symbol = "\\*";
            }
            parameters = keyparameters.split(symbol);
            return parameters;

        } catch (Exception e) {;
            //  System.out.println(e.getMessage());

        }
        return parameters;
    }

    public static WebElement Getlocator(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        // RecoveryScenarios();
        WebElement locpath = null;
        try {

            String[] arguments = null;
            boolean b;
            b = parameters.matches(".*:.*");

            if (b) {
                arguments = splitfunction(parameters, ":=");
            } else {
                arguments = splitfunction(parameters, "\\|");
            }

            String mode = arguments[0];
            arguments[0].trim();
            locator = arguments[1];
            arguments[1].trim();

            switch (mode) {

                case "id":
                    locpath = driver.findElement(By.id(locator));
                    break;
                case "name":
                    locpath = driver.findElement(By.name(locator));
                    break;
                case "linkText":
                    locpath = driver.findElement(By.linkText(locator));
                    break;
                case "xpath":
                    locpath = driver.findElement(By.xpath(locator));
                    break;
                case "cssSelector":
                    locpath = driver.findElement(By.cssSelector(locator));
                    break;
                case "partialLinkText":
                    locpath = driver.findElement(By.partialLinkText(locator));
                    break;
                case "className":
                    locpath = driver.findElement(By.className(locator));
                    break;
                case "tagName":
                    locpath = driver.findElement(By.tagName(locator));
                    break;

            }

        } catch (Exception e) {

            //e.printStackTrace();
            // System.out.println("unable to find the locator" + " " + locator);
        }

        return locpath;

    }

    public static boolean ENTERVALUE(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String[] arguments = null;
        Boolean Status = true;
        RecoveryScenarios();
        arguments = splitfunction(parameters, "\\->");
        WAITTIME("WAITTIME->3");
        try {
            if (arguments[3].contains("+")) {
                String[] arg = splitfunction(arguments[3], "+");
                String newv = arg[1].trim();
                if (hmap.containsKey(newv)) {
                    String revalue = hmap.get(newv).trim();
                    arguments[3] = arguments[3].replace("+" + newv + "+", revalue).trim();
                }
            }

            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0].trim();
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval).trim();
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue).trim();
                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval).trim();
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                            System.out.println("Succesfully clicked on" + " " + arguments[1]);
                            if (arguments[1].contains("+")) {
                                arguments1 = splitfunction(arguments[1], "+");
                                arguments2 = splitfunction(arguments1[1], "+");
                                newval = arguments2[0];
                                if (hmap.containsKey(newval)) {
                                    revalue = hmap.get(newval);
                                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "wait for the element","key not found in hashmap");

                                    Status = false;
                                }
                            }

                        }
                    }
                }
            }

            WebElement locator = Getlocator(driver, arguments[1].trim());
            if (locator.isEnabled()) {
                if (arguments[3].toUpperCase().contains("SYSDATE")) {
                    String sysdat = Sysdate(arguments[3].trim());
                    locator.clear();
                    locator.sendKeys(sysdat);
                    System.out.println("Succesfully entered the Date" + " " + sysdat);
                    //ReportFunctions.LogRepoter("pass", "Entere the date in the feild","Succesfully entered the Date" + sysdat);
                    return true;
                } else if (hmap.containsKey(arguments[3].trim())) {
                    String value = hmap.get(arguments[3].trim());
                    locator.clear();
                    locator.sendKeys(value);
                    System.out.println("Succesfully entered the value" + " " + value);
                    // //ReportFunctions.LogRepoter("pass", "Entere the value in the feild","Succesfully entered the value" + arguments[2] + " " + value);
                    return true;
                } else {
                    locator.clear();
                    locator.sendKeys(arguments[3].trim());
                    System.out.println("Succesfully entered the value" + " " + arguments[3]);
                    //  ReportFunctions.LogRepoter("pass", "Entere the value in the feild", "Succesfully entered the value" + arguments[2] + " " + " " + arguments[3]);
                    return true;
                }
            } else {
                // System.out.println("not able to find" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "Entere the value in the feild","not able to find text feild" + " " + arguments[2]);

                // CLOSEALLBROWSERS(driver);
                return false;
            }
        } catch (Exception e) {

            // e.printStackTrace();
            //   System.out.println("unable to find the locator" + " " + locator);
            ////ReportFunctions.LogRepoter("Fail", "Entere the value in the feild","unable to find the locator" + " " + arguments[1]);
            //CLOSEALLBROWSERS(driver);
            return false;
        }
    }

    public static boolean CLEARTEXTBOX(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "\\->");
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0].trim();
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue).trim();
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval).trim();
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue).trim();

                        } else {
                            //ReportFunctions.LogRepoter("Fail", "wait for the element", "key not found in hashmap");
                            return false;
                        }
                    }

                }
            }

            WebElement locator = Getlocator(driver, arguments[1].trim());
            if (locator.isEnabled()) {
                locator.clear();
                System.out.println("Succesfully cleared the text box");
                // //ReportFunctions.LogRepoter("pass", "clear the text box", "Succesfully cleared the text box");
                return true;
            } else {
                System.out.println("Text box was disabled");
                //ReportFunctions.LogRepoter("Fail", "clear the  text box", "Text box was disabled");
                // CLOSEALLBROWSERS(driver);
                return false;
            }
        } catch (Exception e) {
            //e.printStackTrace();
            // System.out.println("unable to find the locator" + " " + locator);
            //ReportFunctions.LogRepoter("Fail", "clear the  text box", "unable to find the locator" + " " + arguments[1]);
            //CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean CLICK(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        String click_wait = wait;
        WAITTIME("WAITTIME>" + click_wait);
        Boolean Status = true;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            if (arguments[1].contains("+")) {

                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0];
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval).trim();
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue).trim();
                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval).trim();
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue).trim();
                            System.out.println("Succesfully clicked on" + " " + arguments[1]);
                            if (arguments[1].contains("+")) {
                                arguments1 = splitfunction(arguments[1], "+");
                                arguments2 = splitfunction(arguments1[1], "+");
                                newval = arguments2[0];
                                if (hmap.containsKey(newval)) {
                                    revalue = hmap.get(newval).trim();
                                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue).trim();
                                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "wait for the element","key not found in hashmap");

                                    Status = false;
                                }
                            }

                        }
                    }
                }
            }
            WebElement locator = Getlocator(driver, arguments[1].trim());
            if (locator.isEnabled()) {
                String[] args = splitfunction(arguments[1], ":=");
                //  clickElementUsingJavascriptExecutor(args[1]);
                WAITTIME("WAITTIME>" + click_wait);
                // locator.click();
                clickElementUsingJavascriptExecutor(args[1].trim());
                System.out.println("Succesfully clicked on" + " " + arguments[2]);
                ////ReportFunctions.LogRepoter("pass", "click on the object","Succesfully clicked on" + " " + arguments[2]);
            } else {
                System.out.println("unable to find" + " " + arguments[2]);
                //  //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + arguments[2]);
                //CLOSEALLBROWSERS(driver);
                Status = false;
            }
        } catch (Exception e) {

            // System.out.println("unable to find the locator" + " " + e.getMessage());
            // //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find the locator" + " " + arguments[2]);
            // CLOSEALLBROWSERS(driver);
            Status = false;

        }
        return Status;

    }

    public static boolean JAVA_CLICK(WebDriver WebDriver, String parameters) throws InterruptedException, StaleElementReferenceException, IOException, ClassNotFoundException, InstantiationException, SQLException, IllegalAccessException, Exception {
     String  javaClick_wait = "5";
        WAITTIME("WAITTIME>" + javaClick_wait);
        //Thread.sleep(1000);
        Boolean Status = true;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        try {
            if (arguments[1].contains("+")) {

                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0].trim();
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                            System.out.println("Succesfully clicked on" + " " + arguments[1]);
                            if (arguments[1].contains("+")) {
                                arguments1 = splitfunction(arguments[1], "+");
                                arguments2 = splitfunction(arguments1[1], "+");
                                newval = arguments2[0].trim();
                                if (hmap.containsKey(newval)) {
                                    revalue = hmap.get(newval);
                                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                                } else {
                                    Status = false;
                                }
                            }

                        }
                    }
                }
            }
            WebElement locator = Getlocator(driver, arguments[1]);
            if (locator.isEnabled()) {
                String[] args = splitfunction(arguments[1], ":=");
                WAITTIME("WAITTIME>" + javaClick_wait);
                locator.click();
                WAITTIME("WAITTIME>" + javaClick_wait);
                System.out.println("Succesfully clicked on" + " " + arguments[2]);
            } else {
                System.out.println("unable to find" + " " + arguments[2]);
                Status = false;
            }
        } catch (Exception e) {

            // System.out.println("unable to find the locator" + " " + e.getMessage());
            Status = false;

        }
        return Status;

    }

    public static boolean DOUBLECLICK(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        String doubleClick_wait = wait;
        WAITTIME("WAITTIME>" + String.valueOf((Integer.parseInt(doubleClick_wait) * 3)));
//        Thread.sleep(3000);
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            Actions act = new Actions(WebDriver);
            if (locator.isEnabled()) {
                act.doubleClick(locator);
                System.out.println("Succesfully clicked on" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("pass", "double click on object", "Succesfully clicked on" + " " + arguments[2]);
                return true;
            } else {
                System.out.println("unable to find" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "double click on object", "Application launched succesfully");
                // CLOSEALLBROWSERS(driver);
                return false;
            }

        } catch (Exception e) {

            //System.out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "double click on object", "unable to find the locator" + " " + arguments[2]);
            //CLOSEALLBROWSERS(driver);
            return false;

        }

    }

    public static boolean ALERTACTION(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            Alert alert = WebDriver.switchTo().alert();
            if (arguments[1].trim().equalsIgnoreCase("CANCEL")) {
                alert.dismiss();
                System.out.println("Clicked on cancel");
                //ReportFunctions.LogRepoter("pass", "click on Alert", "succesfully clicked on cancel");
                return true;
            } else {
                alert.accept();
            }
            System.out.println("Alert Accepted");
            return true;
        } catch (Exception e) {

            // System.out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "click on Alert", "succesfully clicked on Accept");
            //CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean CLOSEALLBROWSERS(WebDriver WebDriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {
            //   CLICK(WebDriver, "click->xpath:=//div[@id=\"newSettingsID\"]/a/i->logout");
            //WAITTIME("WAITTIME->2");
            //   CLICK(WebDriver, "click->xpath:=//a[@onclick=\"logout()\"]->logout");
            //WAITTIME("WAITTIME->2");
            WAITTIME("WAITTIME->" + wait);
            WebDriver.quit();
            System.out.println("successfully closed all browsers");
// ReportFunctions.LogRepoter("pass", "close all browsers", "successfully closed all browsers");
            return true;

        } catch (Exception e) {

            System.out.println("unable to find the browser" + " " + e.getMessage());
//ReportFunctions.LogRepoter("Fail", "close all browsers", "unable to close all browsers");
            return false;
        }

    }

    public static boolean CLOSECURRENTBROWSER(WebDriver WebDriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {

            WebDriver.close();
            System.out.println("successfully closed current window");
            //ReportFunctions.LogRepoter("pass", "close current window", "successfully closed current window");
            return true;

        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "close current window", "unable to close current window");
            //  CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean CLOSEPOPUP(WebDriver WebDriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {
            WebDriverWait wait = new WebDriverWait(WebDriver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("close"))).click();
            System.out.println("Successfully closed the start Popup");
            //ReportFunctions.LogRepoter("pass", "close pop up", "Successfully closed the start Popup");
            return true;
        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "close pop up", "unable to close pop up");
            //  CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean CLICKTAB(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            WebElement locator = Getlocator(driver, arguments[1].trim());
            WebElement tab = locator;
            tab.click();
            //ReportFunctions.LogRepoter("pass", "click on the tab", "succesfully clicked on the tab");
            return true;
        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "click on the tab", "unable to click on the tab");
            // CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    // * Function to Select frame by index. (Frame1: index=0 ;; Frame2: index=1)
    public static boolean SELECTIFRAMEBYINDEX(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean status = false;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            webdriver.switchTo().frame(Integer.parseInt(arguments[1].trim()));
            System.out.println("moved to Iframe with index:  " + arguments[1]);
            //ReportFunctions.LogRepoter("Pass", "switch to frame by index", "successfully switched to window  " + arguments[1]);
            status = true;
        } catch (Exception e) {
            //out.println("Iframe with index:" + arguments[1] + "  not found");
            //ReportFunctions.LogRepoter("fail", "switch to frame by index", "failed switched to window  " + arguments[1]);
        }
        return status;

    }

    public static boolean SELECTFRAME(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean flag = false;
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            WebElement locpath = null;
            int size = driver.findElements(By.tagName("iframe")).size();
            for (int i = 0; i <= size; i++) {
                driver.switchTo().defaultContent();
                driver.switchTo().frame(i);
                locpath = Getlocator(driver, arguments[1].trim());

                if (locpath != null) {
                    flag = true;
                    System.out.println("Found the element in the frame  " + i);
                    //ReportFunctions.LogRepoter("pass", "Select Frame", "Object found in frame  " + i);
                    flag = true;
                    WAITTIME("WAITTIME->" + String.valueOf((Integer.parseInt(wait) * 2)));
                    break;
                }

            }

            if (flag == false) {
                System.out.println("unable to find the locator");
                //ReportFunctions.LogRepoter("fail", "Select Frame", "unable to find the locator");
                // CLOSEALLBROWSERS(driver);
            }
        } catch (Exception e) {
            //out.println("unable to switch to new frame");
        }
        return flag;
    }

    public static boolean WAITTIME(String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String[] arguments = null;
        //RecoveryScenarios();
        arguments = splitfunction(parameters, "->");
        try {
            int sleepTime = Integer.valueOf(arguments[1].trim()) * 500;
            // System.out.println("sleepTime: " + sleepTime);
            Thread.sleep(sleepTime);
            ////ReportFunctions.LogRepoter("pass", "wait time", "waited for" + sleepTime);
            return true;
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("pass", "wait time", "wait tme failed");
            return false;
        }

    }

    //Checking  the check box
    public static boolean CHECKINGCHKBOX(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean checkstatus;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            checkstatus = locator.isSelected();
            if (checkstatus == true) {
                System.out.println("Checkbox is already checked" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Pass", "check the box", "Checkbox is already checked" + " " + arguments[2]);
                //  CLOSEALLBROWSERS(driver);
                return true;
            } else {
                locator.click();
                System.out.println("Checked the checkbox" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("pass", "check the box", "Checked the checkbox" + " " + arguments[2]);
                return true;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "check the box", "unable to find check box");
            // CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    //Uncheck check box
    public static boolean UNCHECKINGCHKBOX(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean checkstatus;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            checkstatus = locator.isSelected();
            if (checkstatus == true) {
                locator.click();
                System.out.println("Checkbox is unchecked" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("pass", "uncheck the box", "Checkbox is unchecked" + " " + arguments[2]);
                return true;
            } else {
                System.out.println("Checkbox is already unchecked" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "uncheck the box", "Checkbox is already unchecked" + " " + arguments[2]);
                // CLOSEALLBROWSERS(driver);
                return false;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "check the box", "unable to find check box");
            // CLOSEALLBROWSERS(driver);
            return false;
        }

    }
    //Check Radio button

    public static boolean CHECKRADIOBTN(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean checkstatus;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            checkstatus = locator.isSelected();
            if (checkstatus == true) {
                System.out.println("Radio button is already checked" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Pass", "check the radio button", "Radio button is already checked" + " " + arguments[2]);
                //CLOSEALLBROWSERS(driver);
                return false;
            } else {
                locator.click();
                System.out.println("Checked the Radio button" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Pass", "check the radio button", "Checked the Radio button" + " " + arguments[2]);
                return true;
            }
        } catch (Exception e) {
            //  System.out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "check the radio button", "unable to find radio button");
            //CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    //Uncheck Radio button
    public static boolean UNCHECKRADIOBTN(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean checkstatus;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            checkstatus = locator.isSelected();
            if (checkstatus == true) {
                locator.click();
                System.out.println("Checked the Radio button " + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Pass", "Uncheck the radio button", "Unchecked the Radio button" + " " + arguments[2]);
                return true;
            } else {
                System.out.println("Radio button is already unchecked" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Pass", "Uncheck the radio button", "Radio button is already unchecked" + " " + arguments[2]);
                //  CLOSEALLBROWSERS(driver);
                return false;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "check the radio button", "unable to find radio button");
            //CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean SELECTVALUEDROPDOWN(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + String.valueOf((Integer.parseInt(wait) * 3)));
        String[] arguments = null;
        boolean checkstatus = false;
        String sValue = null;
        int index = 1;
        // RecoveryScenarios();
        try {
            arguments = splitfunction(parameters, "->");
            if ((hmap.containsKey(arguments[2].trim()) == true)) {
                arguments[2] = hmap.get(arguments[2]);
            }
            if (arguments[1].contains(",")) {
                String ind[] = splitfunction(arguments[1], ",");
                arguments[1] = ind[0];
                index = Integer.parseInt(ind[1]);
            }
            String xpath = "xpath:=(//select[@title=\"" + arguments[1] + "\" or @titile=\"" + arguments[1] + "\"])[" + index + "]";
            String xpath2 = "xpath:=//select[@ng-model=\"shift.workType\"]";
            WebElement locator = Getlocator(driver, xpath);
            if (locator != null) {
            } else {
                locator = Getlocator(driver, xpath2);
            }
            Select oSelect = new Select(locator);
            List<WebElement> elementCount = oSelect.getOptions();
            int iSize = elementCount.size();
            for (int i = 0; i < iSize; i++) {
                sValue = elementCount.get(i).getText();
                System.out.println(sValue);
                if (sValue.equalsIgnoreCase(arguments[2])) {
                    checkstatus = true;
                    if (ISNUMERIC(arguments[2])) {
                        if (arguments[2].length() == 1) {
                            int oindex = Integer.parseInt(arguments[2]);
                            oSelect.selectByIndex(oindex);
                            System.out.println("Selected the element with index " + " " + arguments[2]);
                            // //ReportFunctions.LogRepoter("pass", "select value from drop down with index", "Selected the element with index " + " " + arguments[3]);
                        } else {
                            oSelect.selectByValue(arguments[2]);
                            System.out.println("Selected the value " + " " + arguments[2]);
                            // //ReportFunctions.LogRepoter("pass", "select value from drop down with value", "Selected the element with index " + " " + arguments[3]);
                        }

                    } else {
                        oSelect.selectByVisibleText(arguments[2]);
                        System.out.println("Selected the text" + " " + arguments[2]);
                        ////ReportFunctions.LogRepoter("pass", "select value from drop down with visibletext", "Selected the element with index " + " " + arguments[3]);
                    }
                    break;
                }
            }
            if (checkstatus != true) {
                System.out.println("unable to find the element" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "select value from drop down", "unable to find the element" + " " + arguments[3]);
                // CLOSEALLBROWSERS(driver);
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "select value from drop down", "unable to find the element" + " " + arguments[3]);
            // CLOSEALLBROWSERS(driver);
        }
        return checkstatus;

    }

    public static boolean SELECTVALUEDROPDOWN1(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + String.valueOf((Integer.parseInt(wait) * 3)));
        String[] arguments = null;
        boolean checkstatus = false;
        String sValue = null;
        int index = 1;
        arguments = splitfunction(parameters, "->");
        if ((hmap.containsKey(arguments[3].trim()))) {
            arguments[3] = hmap.get(arguments[3].trim());
        }
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            Select oSelect = new Select(locator);
            List<WebElement> elementCount = oSelect.getOptions();
            int iSize = elementCount.size();
            for (int i = 0; i < iSize; i++) {
                sValue = elementCount.get(i).getText();
                System.out.println(sValue);
                if (sValue.equalsIgnoreCase(arguments[3])) {
                    checkstatus = true;
                    if (ISNUMERIC(arguments[3])) {
                        if (arguments[3].length() == 1) {
                            int oindex = Integer.parseInt(arguments[3]);
                            oSelect.selectByIndex(oindex);
                            System.out.println("Selected the element with index " + " " + arguments[3]);
                        } else {
                            oSelect.selectByValue(arguments[3]);
                            System.out.println("Selected the value " + " " + arguments[3]);
                        }
                    } else {
                        oSelect.selectByVisibleText(arguments[3]);
                        System.out.println("Selected the text" + " " + arguments[3]);
                    }
                    break;
                }
            }
            if (checkstatus != true) {
                System.out.println("unable to find the element" + " " + arguments[3]);
                ReportFunctions.LogRepoter("Fail", "select value from drop down", "unable to find the element" + " " + arguments[3]);
                CLOSEALLBROWSERS(driver);
            }
        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            ReportFunctions.LogRepoter("Fail", "select value from drop down", "unable to find the element" + " " + arguments[3]);
            CLOSEALLBROWSERS(driver);
        }
        return checkstatus;
    }

    public static boolean SelectvalueByIndex(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + String.valueOf((Integer.parseInt(wait) * 3)));
        String[] arguments = null;
        boolean checkstatus = false;
        String sValue = null;
        RecoveryScenarios();
        arguments = splitfunction(parameters, "->");
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            Select oSelect = new Select(locator);

            if (locator != null) {
                int oindex = Integer.parseInt(arguments[3]);
                oSelect.selectByIndex(oindex);
                System.out.println("Selected the element with index " + " " + arguments[3]);
                //ReportFunctions.LogRepoter("pass", "select value from drop down with index", "Selected the element with index " + " " + arguments[3]);
                checkstatus = true;
            }
        } catch (Exception e) {
            // System.out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "select value from drop down", "unable to find the element" + " " + arguments[3]);
            // CLOSEALLBROWSERS(driver);
        }
        return checkstatus;

    }

    public static boolean ISNUMERIC(String str) {
        try {
            double d = Double.parseDouble(str);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public static boolean ISDISPLAYED(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {

        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            boolean status = locator.isDisplayed();
            if (status == true) {
                System.out.println("Object displayed on web page" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("pass", "object display", "Object displayed on web page" + " " + arguments[2]);
                return true;
            } else {
                System.out.println("Object was not displayed on web page" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "object display", "Object was not displayed on web page" + " " + arguments[2]);
                // CLOSEALLBROWSERS(driver);
                return false;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "object display", "Object was not displayed on web page" + " " + e.getMessage());
            // CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean ISENABLED(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            boolean status = locator.isEnabled();
            if (status == true) {
                System.out.println("Object is enabled" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("pass", "object enable", "Object is enabled" + " " + arguments[2]);
                return true;
            } else {
                System.out.println("Object was not enabled" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "object enable", "Object was not  enabled" + " " + arguments[2]);
                // CLOSEALLBROWSERS(driver);
                return false;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "object enable", "unable to find the element");
            //CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean ISDISABLED(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            WebElement locator = Getlocator(driver, arguments[1].trim());
            boolean status = locator.isEnabled();
            if (status == false) {
                System.out.println("Object is disabled" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("pass", "object disable", "Object is disabled" + " " + arguments[2]);
                return true;
            } else {
                System.out.println("Object was not disabled" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "object disable", "Object is disabled" + " " + arguments[2]);
                // CLOSEALLBROWSERS(driver);
                return false;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "object disable", "unable to find the element");
            // CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean ISSELECTED(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        boolean Status = false;
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            WebElement locator = Getlocator(driver, arguments[1].trim());
            Status = locator.isSelected();
            if (Status == true) {
                Status = true;
                System.out.println("current object is selected" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("pass", "select the object", "current object is selected" + " " + arguments[2]);

            } else {
                System.out.println("current object was not selected" + " " + arguments[2]);
                //ReportFunctions.LogRepoter("Fail", "select the object", "current object was not selected" + " " + arguments[2]);
                //CLOSEALLBROWSERS(driver);
                Status = false;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "select the object", "unable to find the object");
            // CLOSEALLBROWSERS(driver);
            Status = false;
        }
        return Status;
    }

    public static String GETTEXTo(WebDriver webdriver, String parameters) {
        String ovalue = null;
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            WebElement locator = Getlocator(driver, arguments[1].trim());
            ovalue = locator.getText();
            //System.out.println("Retrived the value" +" "+ovalue);
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
        }

        return ovalue;
    }

    public static boolean GETTEXT(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String ovalue = null;
        String key;
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            key = arguments[3];
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0];
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].trim().replace("+" + newval + "+", revalue);
                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                            System.out.println("Succesfully clicked on" + " " + arguments[1]);
                            if (arguments[1].contains("+")) {
                                arguments1 = splitfunction(arguments[1], "+");
                                arguments2 = splitfunction(arguments1[1], "+");
                                newval = arguments2[0].trim();
                                if (hmap.containsKey(newval)) {
                                    revalue = hmap.get(newval);
                                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "wait for the element", "key not found in hashmap");
                                    return false;
                                }
                            }

                        }
                    }
                }
            }

            WebElement locator = Getlocator(driver, arguments[1].trim());
            ovalue = locator.getAttribute("value");
            if (ovalue == null) {
                ovalue = locator.getText();
                if (ovalue.contains("#")) {
                    String[] arg = ovalue.split("#");
                    ovalue = arg[1];
                }
            }
            if (ovalue != null) {
                hmap.put(key, ovalue);
                System.out.println("captured the value" + "  " + arguments[2] + "   " + ovalue);
                // //ReportFunctions.LogRepoter("pass", "capture the text", "captured the value" + "  " + arguments[2] + "   " + ovalue);
                return true;
            } else {
                System.out.println("value is null" + " " + ovalue);
                //ReportFunctions.LogRepoter("Fail", "capture the text", " unable to capture the value" + "  " + arguments[2]);
                // CLOSEALLBROWSERS(driver);
                return false;
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "capture the text", " unable to locate the element");
            // CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean GETATTRIBUTE(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String ovalue = null;
        String key;
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            key = arguments[3];
            WebElement locator = Getlocator(driver, arguments[1].trim());
            ovalue = locator.getAttribute(arguments[2]);
            if (ovalue != null) {
                hmap.put(key, ovalue);
                System.out.println("captured the value" + "  " + arguments[2] + "   " + ovalue);
                //ReportFunctions.LogRepoter("pass", "capture the text","captured the value" + "  " + arguments[2] + "   " + ovalue);

                return true;
            } else {
                System.out.println("value is null" + " " + ovalue);
                //ReportFunctions.LogRepoter("Fail", "capture the text"," unable to capture the value" + "  " + arguments[2]);

                //  CLOSEALLBROWSERS(driver);
                return false;
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "capture the text", " unable to locate the element");
            // CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean VERIFYVALUE(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        flag = 1;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        String value = null;
        RecoveryScenarios();
        try {
            if (hmap.containsKey(arguments[2])) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2];
            }
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0].trim();
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);

                        } else {
                            //ReportFunctions.LogRepoter("Fail", "wait for the element", "key not found in hashmap");
                            return false;
                        }
                    }

                }
            }
            WebElement locator = Getlocator(driver, arguments[1].trim());
            String ovalue = locator.getAttribute("value");
            if (ovalue == null) {
                ovalue = locator.getText();
            }
            if (hmap.containsKey(arguments[3])) {
                value = hmap.get(arguments[3]);
            } else if (arguments[3].toUpperCase().contains("SYSDATE")) {
                String sysdat = Sysdate(arguments[3].trim());
                value = sysdat;
            } else if ((arguments[3].contains("+"))) {

                String[] values = splitfunction(arguments[3], "+");
                if (values.length > 1) {
                    if ((hmap.containsKey(values[0]))
                            && (hmap.containsKey(values[1]) && (hmap.containsKey(values[2])))) {
                        Float firstval = Float.parseFloat(hmap.get(values[0]));
                        Float Secval = Float.parseFloat(hmap.get(values[1]));
                        Float thirdval = Float.parseFloat(hmap.get(values[2]));
                        value = String.valueOf(firstval + Secval + thirdval);
                        hmap.put(arguments[2], value);
                    } else {
                        if ((hmap.containsKey(values[0])) && (hmap.containsKey(values[1]))) {
                            Float firstval = Float.parseFloat(hmap.get(values[0]));
                            Float Secval = Float.parseFloat(hmap.get(values[1]));
                            value = String.valueOf(firstval + Secval);
                            hmap.put(arguments[2], value);
                        }
                    }
                } else {
                    //ReportFunctions.LogRepoter("Fail", "verify Value", "Failed to find values in ");
                }
            } else if ((arguments[3].contains("*"))) {

                String[] values = splitfunction(arguments[3], "*");
                if ((hmap.containsKey(values[0])) && (hmap.containsKey(values[1]))) {
                    Float firstval = Float.parseFloat(hmap.get(values[0]));
                    Float Secval = Float.parseFloat(hmap.get(values[1]));
                    value = String.valueOf(firstval * Secval);
                } else {
                    //ReportFunctions.LogRepoter("Fail", "verify Value", "Failed to find values in ");
                }
            } else {
                value = arguments[3];
            }
            if (value.equalsIgnoreCase("IS NOT NULL")) {
                int len = ovalue.length();
                if (len > 0) {
                    // //ReportFunctions.LogRepoter("pass", "verify Value_Notnull","captured the value:  " + ovalue + " and its not null");

                } else {
                    //ReportFunctions.LogRepoter("Fail", "verify Value_Notnull", "captured value is null");
                    flag = 0;

                }
            } else {
                if (ovalue.equalsIgnoreCase(value)) {
                    System.out.println("Both values mathes");
                    // //ReportFunctions.LogRepoter("pass", "verified  " + arguments[2] + "  value","Both values matches " + ovalue + " and " + value);

                } else {
                    //out.println("Values did not match");
                    //ReportFunctions.LogRepoter("Fail", "verified  " + arguments[2] + "  value","Both values did not match " + ovalue + " and " + value);

                    // CLOSEALLBROWSERS(driver);
                    flag = 0;
                }
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "verify both values", "unable to find the locator");
            // CLOSEALLBROWSERS(driver);
            flag = 0;
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean SELECTPARENTWINDOW(WebDriver webdriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        try {
            String parentWindowHandle = driver.getWindowHandle();
            driver.switchTo().window(parentWindowHandle);
            System.out.println("moved to parent window " + parentWindowHandle);
            //ReportFunctions.LogRepoter("pass", "switch the parent window", "moved to parent window " + parentWindowHandle);
            return true;
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "switch the window", "unable to find parent window");
            //CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static boolean SWITCHWINDOW(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String exptitle = null;
        WebElement locpath = null;
        boolean status = true;
        Thread.sleep(4000);
        flag = 0;
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            exptitle = arguments[1];

            Set<String> allWindowHandles = driver.getWindowHandles();

            for (String handle : allWindowHandles) {
                driver.switchTo().window(handle);
                locpath = Getlocator(driver, arguments[1].trim());
                if (locpath != null) {
                    driver.switchTo().window(handle);
                    System.out.println("moved to child window");
                    //ReportFunctions.LogRepoter("pass", "switch to child window", "moved to child  window ");
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                status = true;
            } else {
                System.out.println("unable to find window" + " " + exptitle);
                //ReportFunctions.LogRepoter("Fail", "switch to child window", "unable to find  child  window " + exptitle);
                // CLOSEALLBROWSERS(driver);
                status = false;
            }

        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "switch to child window", "unable to find  child  window ");
            // CLOSEALLBROWSERS(driver);
        }
        return status;

    }

    public static void funchashmap(String args[]) {

        //HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        hmap.put("key1", "murali");
        hmap.put("key2", "krishna");
        hmap.put("key3", "pentakota");

        System.out.println("Retrieving values from HashMap");
        System.out.println("**********************\n\n");
        //Set keys = hmap.keySet();
        //Iterator itr = keys.iterator();
        String value;
        value = hmap.get("key1");
        System.out.println(value);
        /* while(itr.hasNext())
         {
         key = (String)itr.next();
         value = (String)hmap.get(key);
         System.out.println(key + " - "+ value);
         }*/

    }

    public static void Readenvironmentalfile(String path) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {

        try {
            Sheet envsheet;
            String FilePath = path;
            FileInputStream envfs = new FileInputStream(FilePath);
            Workbook envwb = new XSSFWorkbook(envfs);
            envsheet = envwb.getSheetAt(0);
            //envwb.setMissingCellPolicy(Row.CREATE_NULL_AS_BLANK);
            int envrowcount = envsheet.getLastRowNum();
            int envcolcount = envsheet.getRow(envrowcount).getLastCellNum();
            int Rowval = 1;
            int colval = 1;

            String strenvname = "";
            String strenvvalue = "";

            for (Rowval = 1; Rowval <= envrowcount; Rowval++) {
                Row ro = envsheet.getRow(Rowval);

                if ((ro != null)) {
                    Cell cell1 = envsheet.getRow(Rowval).getCell(0);
                    Cell cell2 = envsheet.getRow(Rowval).getCell(1);
                    strenvname = cell1.getStringCellValue();
                    strenvname.trim();
                    strenvvalue = cell2.getStringCellValue();
                    strenvvalue.trim();
                    if (strenvname.contains("#")) {
                        Rowval++;
                    } else if (strenvname != null && strenvvalue != null) {
                        hmap.put(strenvname, strenvvalue);
                    }
                } else {
                    System.out.println("value is null" + " " + strenvname);
                    System.out.println("value is null" + " " + strenvvalue);
                }
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            // CLOSEALLBROWSERS(driver);
        }

    }

    public static void Readtestsuitefile(String path) throws IOException, Exception {
        try {
            String Filepath = path;
            Sheet suiteheet;
            String CellData = null;
            FileInputStream fs = new FileInputStream(Filepath);
            Workbook wb = new XSSFWorkbook(fs);
            suiteheet = wb.getSheetAt(0);
            int rowcount = suiteheet.getLastRowNum();
            int colcount = suiteheet.getRow(rowcount).getLastCellNum();
            int Rowval = 0;
            int colval = 1;
            int finalvalue = 0;
            Boolean temp = false;
            for (int i = 0; i <= rowcount; i++) {
                if (temp == true) {
                    Cell cell = suiteheet.getRow(finalvalue).getCell(1);
                    String spath[] = path.split("\\\\TestSuite");
                    Cell status = suiteheet.getRow(finalvalue).getCell(2);
                    Cell casename = suiteheet.getRow(finalvalue).getCell(0);
                    Cell muldata = suiteheet.getRow(finalvalue).getCell(3);
                    muldatastatus = muldata.getStringCellValue();
                    if (Tcase == null) {
                        Tcase = "Tcase";
                    }
                    Tcasename = casename.getStringCellValue();
                    hmap.put(Tcase, Tcasename);
                    SCellData = cell.getStringCellValue();
                    String casepath = spath[0] + "\\TestCases\\" + cell.getStringCellValue();
                    String cellstatus = status.getStringCellValue();
                    int j = 1;
                    if (cellstatus.equalsIgnoreCase("Yes")) {
                        Tcasecount = Tcasecount + 1;
                        TChmap.put(Tcasename, j);
                        j = j + 1;
                        DriverScript.Initializationscript(casepath);
                        if (i == rowcount - 1) {
                            break;
                        } else {
                            finalvalue = finalvalue + 1;
                        }
                    } else {
                        if (i == rowcount - 1) {
                            break;
                        } else {
                            finalvalue = finalvalue + 1;
                        }
                    }
                } else {
                    Row ro = suiteheet.getRow(i);
                    if (ro != null) {
                        Cell cell = suiteheet.getRow(i).getCell(0);
                        if (cell == null) {
                            // System.out.println("found blank cell");
                        } else {
                            int cel_Type = cell.getCellType();
                            if (cell.getCellType() == Cell.CELL_TYPE_BLANK) {
                                // System.out.println("found blank cell");
                            } else if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                                CellData = cell.getStringCellValue();
                                CellData.trim();
                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("Send Mail")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("YES")) {
                                        sendmail = true;
                                    }
                                }
                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("USER")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    runsuser = cell.getRichStringCellValue().toString();
                                }

                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("Tenant")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    suitetenant = cell.getRichStringCellValue().toString();
                                }

                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("Release Name")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    releasename = cell.getStringCellValue();
                                }

                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("MailGroup")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    mailgroup = cell.getStringCellValue();
                                }

                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("EnvironmentURL")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    environmentname = cell.getStringCellValue();
                                }
                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("Environment")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    sheetenvironment = cell.getStringCellValue();
                                }

                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("SuiteName")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    sheetsuitename = cell.getStringCellValue();
                                }

                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("Customer")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    Customername = cell.getStringCellValue();
                                }
                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("Tyoe of Run")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    Typeofrun = cell.getStringCellValue();
                                }
                                if (cell.getRichStringCellValue().getString().trim().equalsIgnoreCase("Write data to GoogleSheet")) {
                                    cell = suiteheet.getRow(i).getCell(1);
                                    writedatatoexcel = cell.getStringCellValue();
                                }
                                if (cell.getRichStringCellValue().getString().trim().equals("Test Case Name")) {
                                    Row r1 = suiteheet.getRow(i + 1);
                                    if (r1 != null) {
                                        cell = suiteheet.getRow(i + 1).getCell(1);
                                        String spath[] = path.split("\\\\TestSuite");
                                        String testdata = spath[0] + "\\TestData" + cell.getStringCellValue();
                                        Cell status = suiteheet.getRow(i + 1).getCell(2);
                                        Cell casename = suiteheet.getRow(i + 1).getCell(0);
                                        Cell muldata = suiteheet.getRow(i + 1).getCell(3);
                                        Tcasename = casename.getStringCellValue();
                                        if (Tcasename.equalsIgnoreCase("ReadTestData")) {
                                            Readenvironmentalfile(testdata);
                                            temp = true;
                                            storedataflag = false;
                                            finalvalue = i + 2;
                                        } else if (Tcasename.equalsIgnoreCase("CreateTestData")) {
                                            storedataflag = true;
                                            temp = true;
                                            finalvalue = i + 2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
            if (sendmail == true) {
                Automation_Summary();
                StoreResults();
            }

            if (storedataflag == true) {
                Store_data();
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }


    public static String selectfile() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {

        String filePath = null;
        java.io.File newfile = null;
        JFileChooser chooser = new JFileChooser();
        //chooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        File chooserFile = new File((new File(".").getCanonicalPath()));
        newfile = chooserFile.getAbsoluteFile();
        String name = newfile + "\\TestSuites";
        File finalfile = new File(name);
        chooser.setCurrentDirectory(finalfile);
        try {
            int returnValue = chooser.showOpenDialog(null);
            java.io.File file = null;
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                file = chooser.getSelectedFile();
            }
            if (file != null) {
                filePath = file.getPath();
                Tsuitename = file.getName();
                Tsuitename = Tsuitename.replace(".xlsx", "");
                if (suitename == null) {
                    suitename = "suitename";
                }
                hmap.put(suitename, Tsuitename);
                FOLDERSTRUCTURE(Tsuitename);

            } else {
                System.out.println("File not selected");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            // CLOSEALLBROWSERS(driver);
        }
        return filePath;
    }

    public static boolean WAITFORELEMENT(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean status = true;
        //RecoveryScenarios();
        try {
            int flag = 1;
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0].trim();
                if (hmap.containsKey(arguments2[0])) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);

                        } else {
                            //ReportFunctions.LogRepoter("Fail", "wait for the element", "key not found in hashmap");
                            return false;
                        }
                    }

                }
            }
            timer = 1000;
            do {
                WebElement locator = Getlocator(driver, arguments[1].trim());
                if (locator == null) {
                    timer = timer - 1;
                    if (timer == 0) {
                        timer = 1001;
                    }
                } else {
                    if (locator.isDisplayed()) {
                        timer = 1001;
                        flag = 0;
                        System.out.println("Element found" + " " + arguments[2]);
                        //JavascriptExecutor js = (JavascriptExecutor) driver;
                        //js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", locator);
                        // //ReportFunctions.LogRepoter("pass", "wait for the element", "element found " + arguments[2]);
                    } else {
                        timer = timer - 1;
                        if (timer == 0) {
                            timer = 1001;
                        }
                    }
                }
            } while (timer < 1000);

            if (flag == 1) {
                status = false;
                //  //ReportFunctions.LogRepoter("Fail", "wait for the element", "element not found " + arguments[2]);
                //CLOSEALLBROWSERS(driver);
            }
        } catch (StaleElementReferenceException e) {
            //out.println(e.getMessage());
            status = false;
            //ReportFunctions.LogRepoter("Fail", "wait for the element", "did not found the element " + e);
            //CLOSEALLBROWSERS(driver);
        }
        return status;

    }

    public static void FOLDERSTRUCTURE(String suitename) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        try {
            final long MSEC_SINCE_EPOCH = System.currentTimeMillis();
            String workingDirectory = new java.io.File(".").getCanonicalPath();
            String opath = workingDirectory;
            opath = opath.replace("IRScripts", "");
            opath = opath.replace('\\', '/');
            //System.out.println(opath);
//		opath = opath.replace("IRScripts","");

            //envfilepath =  dname+"TestFlowBot-Selenium/Environmental files/EnvironmentVariables.xlsx";
            envfilepath = opath + "/EnvironmentalFiles/EnvironmentVariables.xlsx";
            File srcDir = new File(opath + "/HTMLTemplates/");
            File destDir = new File(opath + "/Reports/");
            //Calendar calendar = Calendar.getInstance();
            //Date  now = calendar.getTime();
            Date instant = new Date(MSEC_SINCE_EPOCH);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
            String time = sdf.format(instant);
            time = time.replace(':', '-');
            suitename = suitename + "_" + time;
            mailsuite = suitename;
            File dir = new File(opath + "/Reports/" + suitename);
            dir.mkdir();
            FileUtils.copyDirectory(srcDir, dir);
            savedlocation = opath + "/Reports/" + suitename;
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            // CLOSEALLBROWSERS(driver);
        }
    }

    public static boolean SENDKEYS(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {

        boolean status = true;
        RecoveryScenarios();
        try {
            Robot robot = new Robot();
            Actions action = new Actions(driver);
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");

            ActionTypes actTypes = ActionTypes.valueOf(arguments[1].trim());
            switch (actTypes) {

                case TAB:
                    robot.keyPress(KeyEvent.VK_TAB);
                    robot.keyRelease(KeyEvent.VK_TAB);
                    // //ReportFunctions.LogRepoter("Pass", "send keys", "Successfully clicked on TAB");
                    status = true;
                    break;
                case ENTER:
                    robot.keyPress(KeyEvent.VK_ENTER);
                    robot.keyRelease(KeyEvent.VK_ENTER);
                    //ReportFunctions.LogRepoter("Pass", "send keys", "Successfully clicked on ENTER");
                    status = true;
                    break;
                case F12:
                    robot.keyPress(KeyEvent.VK_F12);
                    robot.keyRelease(KeyEvent.VK_F12);
                    //ReportFunctions.LogRepoter("Pass", "send keys", "Successfully clicked on F12");
                    status = true;
                    break;
                case ESCAPE:
                    robot.keyPress(KeyEvent.VK_ESCAPE);
                    robot.keyRelease(KeyEvent.VK_ESCAPE);
                    //ReportFunctions.LogRepoter("Pass", "send keys", "Successfully clicked on F12");
                    status = true;
                    break;
                case DOWN:
                    robot.keyPress(KeyEvent.VK_DOWN);
                    robot.keyRelease(KeyEvent.VK_DOWN);
                    //ReportFunctions.LogRepoter("Pass", "send keys", "Successfully clicked on F12");
                    status = true;
                    break;
            }
        } catch (NumberFormatException e) {
            //out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "send keys", "Unable to find send keys");
        }
        return status;
    }

    public static Boolean GENERATE_UNIQVALUE(String Parameters) throws InterruptedException, IOException {
        Boolean Status = true;
        String strPrefix = null; //Variable to store prefix value
        String storevalue = null; //Variable to store output
        int strLength = 0;// Variable to store length value
        String strType = null;//Variable to store type(string/int)
        String strStringCase = null; //Variable to case(lower/upper)
        String strvalue1 = null; // Variable to store array after spliting first time
        String strvalue = null;//Variable to store array after spliting second time
        String strrndCode = null;  // Variable to store uniq value
        String strcasetype = null; // lower or upper
        int intI;      //variable to loop str length
        String Numc = null;
        int targetStringLength = 0;
        int Strprifixlength = 0;
        int uniqlength = 0;
        try {
            String[] arguments1 = splitfunction(Parameters, "->");
            if (arguments1.length == 2) {
                strType = "Alphanumeric";
                strPrefix = "KG_";
                strLength = 10;
                targetStringLength = 10;
                strcasetype = "Lowercase";
                storevalue = arguments1[1];
            } else {
                if (arguments1.length == 3) {
                    if (arguments1[1].length() == 1) {
                        targetStringLength = Integer.valueOf(arguments1[1]);
                        strType = "Alphanumeric";
                        strPrefix = "KG_";
                        strcasetype = "Lowercase";
                        storevalue = arguments1[2];
                    } else if (arguments1[1].length() > 1) {
                        String[] arguments = splitfunction(arguments1[1], ",");
                        if (arguments.length == 2) {
                            targetStringLength = Integer.valueOf(arguments[0]);
                            strType = arguments[1];
                            strPrefix = "KG_";
                            strcasetype = "Lowercase";
                            storevalue = arguments1[2];
                        }
                        if (arguments.length == 3) {
                            targetStringLength = Integer.valueOf(arguments[0]);
                            strType = arguments[1];
                            strPrefix = arguments[2];
                            strcasetype = "Lowercase";
                            storevalue = arguments1[2];
                        }
                        if (arguments.length == 4) {
                            targetStringLength = Integer.valueOf(arguments[0]);
                            strType = arguments[1];
                            strPrefix = arguments[2];
                            strcasetype = arguments[3];
                            storevalue = arguments1[2];
                        }

                    }

                }
            }
            if (targetStringLength != 0 && strType != null && strPrefix != null && strcasetype != null && storevalue != null) {
                int leftLimit = 97; // letter 'a'
                int rightLimit = 122; // letter 'z'

                int n = 9;
                int num = 0;
                String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
                StringBuilder salt = new StringBuilder();
                Random random = new Random();
                StringBuilder buffer = new StringBuilder(targetStringLength);
                if (strType.toUpperCase().equalsIgnoreCase("STRING")) {
                    for (int i = 0; i < targetStringLength; i++) {
                        int randomLimitedInt = leftLimit + (int) (random.nextFloat() * (rightLimit - leftLimit + 1));
                        buffer.append((char) randomLimitedInt);
                    }
                    String generatedString = buffer.toString();
                    generatedString = strPrefix + generatedString;

                    if (strcasetype.equalsIgnoreCase("uppercase")) {
                        System.out.println(generatedString.toUpperCase());
                        // hmap.put(storevalue, generatedString);
                        //ReportFunctions.LogRepoter("Pass", "Generated Uniq Value String  ", generatedString);
                    } else {
                        System.out.println(generatedString.toLowerCase());
                        hmap.put(storevalue, generatedString);
                        // //ReportFunctions.LogRepoter("Pass", "Generated Uniq Value String  ", generatedString);
                    }

                } else if (strType.toUpperCase().equalsIgnoreCase("number")) {
                    for (int i = 0; i < targetStringLength; i++) {
                        num = Integer.valueOf(String.valueOf(num) + String.valueOf(n));
                    }
                    int b = random.nextInt(num) + 1;
                    Numc = strPrefix + String.valueOf(b);
                    System.out.println(Numc);
                    hmap.put(storevalue, Numc);
                    // //ReportFunctions.LogRepoter("Pass", "Generated Uniq Value Number  ", Numc);
                } else if (strType.toUpperCase().equalsIgnoreCase("Alphanumeric")) {
                    while (salt.length() < targetStringLength) { // length of the random string.
                        int index = (int) (random.nextFloat() * SALTCHARS.length());
                        salt.append(SALTCHARS.charAt(index));
                    }
                    String saltStr = salt.toString();
                    saltStr = strPrefix + saltStr;
                    if (strcasetype.equalsIgnoreCase("uppercase")) {
                        System.out.println(saltStr.toUpperCase());
                        hmap.put(storevalue, saltStr);
                        // //ReportFunctions.LogRepoter("Pass", "Generated Uniq Value Alphanumeric  ", saltStr);
                    } else {
                        System.out.println(saltStr.toLowerCase());
                        hmap.put(storevalue, saltStr);
                        // //ReportFunctions.LogRepoter("Pass", "Generated Uniq Value Alphanumeric  ", saltStr);
                    }
                } else {
                    //ReportFunctions.LogRepoter("Fail", "Generated Uniq Value   ", "Please select String or Number or Alphanumeric");
                    System.out.println("Please select String or Number or Alphanumeric");
                }

            } else {
                //ReportFunctions.LogRepoter("Fail", "Generated Uniq Value   ", "one of the input feild is null");
                System.out.println("one of the input feild is null");
                Status = false;
            }

        } catch (Exception e) {
            // System.out.println("exception value : " + e.getMessage());
            //out.println("Missing one of the input");
            //ReportFunctions.LogRepoter("Fail", "Generated Uniq Value   ", e.getMessage());
            Status = false;
        }
        return Status;
    }

    public static Boolean Connect_MySQL(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String[] arguments1 = splitfunction(Parameters, "->");
        String[] arguments = splitfunction(arguments1[1], ",");
        String url = hmap.get(arguments[0]);
        String user = hmap.get(arguments[1]);
        String password = hmap.get(arguments[2]);
        Boolean Status = true;
        try {
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                //ReportFunctions.LogRepoter("Pass", "Successfully Connected to the database   ", "Database name: escloud_metadata_gbqa");
                System.out.println("Connected to the database escloud_metadata_gbqa");
            } else {
                //ReportFunctions.LogRepoter("Fail", "Failed to connect to database  ", "Database name: escloud_metadata_gbqa");
                System.out.println("Failed to login to database escloud_metadata_gbqa");
                Status = false;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            Status = false;
        }
        return Status;
    }

    public static Boolean Close_MySQL() throws ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException {
        Boolean Status = true;
        try {
            if (conn != null) {
                conn.close();
                //ReportFunctions.LogRepoter("Pass", "Successfully closed database connection   ", "Database name: escloud_metadata_gbqa");
                System.out.println("Successfully closed  the database escloud_metadata_gbqa");
            } else {
                //ReportFunctions.LogRepoter("Fail", "Failed to close database connection   ", "Database name: escloud_metadata_gbqa");
                System.out.println("Failed to close database escloud_metadata_gbqa");
                Status = false;
            }
        } catch (Exception e) {
            //out.println("unable to find the locator" + " " + e.getMessage());
        }
        return Status;
    }

    public static Boolean Query_MySQL(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        int count = 0;
        String output = null;
        List<Object> ValObject = new ArrayList<Object>();
        String[] arguments1 = splitfunction(Parameters, "->");
        String Verifycase = arguments1[1];
        String query = arguments1[2];
        String data;
        Boolean Status = true;
        try {
            if (conn != null) {
                Statement Sourcestmt = conn.createStatement();
                ResultSet Sourceresult = Sourcestmt.executeQuery(query);
                Object o;
                switch (Verifycase) {
                    case "Execution":
                        conn.getAutoCommit();
                        System.out.println("Successfully executed and committed the query");
                        //ReportFunctions.LogRepoter("Pass", "Execution", "Successfully executed and committed the query");
                        break;
                    case "VerifyCount":
                        data = arguments1[3];
                        while (Sourceresult.next()) {;
                            count = count + 1;
                        }
                        System.out.println("Total Count:= " + count);
                        if (Integer.valueOf(data) == count) {
                            //ReportFunctions.LogRepoter("Pass", "VerifyCount", "Both values  matched  Expected count:=" + data + " Actual count:=" + count);
                            System.out.println("Both values  matched  Expected count:=" + data + " Actual count:=" + count);
                        } else {
                            System.out.println("Both values did not match Expected count:=" + data + " Actual count:=" + count);
                            //ReportFunctions.LogRepoter("Fail", "VerifyCount", "Both values did not match Expected count:=" + data + " Actual count:=" + count);
                            Status = false;
                        }
                        break;
                    case "VerifyValue":
                        data = arguments1[3];
                        while (Sourceresult.next()) {;
                            ValObject.add(Sourceresult.getString(1));
                        }
                        o = ValObject.get(0);
                        output = o.toString();
                        System.out.println("Sourceresult.getString(1)Databse value:= " + output);

                        if (data.equalsIgnoreCase(output)) {
                            //ReportFunctions.LogRepoter("Pass", "VerifyValue", "Both values  matched  Expected Value:=" + data + " Actual Value:=" + count);
                            System.out.println("Both values  matched  Expected Value:=" + data + " Actual Value:=" + output);
                        } else {
                            System.out.println("Both values did not match Expected Value:=" + data + " Actual Value:=" + output);
                            //ReportFunctions.LogRepoter("Fail", "VerifyValue", "Both values  did not match  Expected Value:=" + data + " Actual Value:=" + count);
                            Status = false;
                        }
                        break;
                    case "VerifyMutlipleColValue":
                        String[] arguments = splitfunction(arguments1[3], ",");
                        int ubound = arguments.length;
                        while (Sourceresult.next()) {;
                            for (int i = 0; i < ubound; i++) {
                                ValObject.add(Sourceresult.getString(i + 1));
                            }
                            for (int j = 0; j < ValObject.size(); j++) {
                                if (arguments[j].equalsIgnoreCase(ValObject.get(j).toString())) {
                                    System.out.println(+count + 1 + "  value: Both values  matched  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                                    //ReportFunctions.LogRepoter("Pass", "VerifyMutlipleColValue", +count + 1 + "  value:Both values matched  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                                } else {
                                    System.out.println(+count + 1 + "  value:Both values  did not match  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                                    //ReportFunctions.LogRepoter("Fail", "VerifyMutlipleColValue", +count + 1 + "  value:Both values  did not match  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                                    Status = false;
                                }
                                count = count + 1;
                            }
                        }
                        break;
                    case "VerifyMutlipleRowValue":
                        arguments = splitfunction(arguments1[3], ",");
                        ubound = arguments.length;
                        while (Sourceresult.next()) {;
                            ValObject.add(Sourceresult.getString(1));
                        }
                        for (int j = 0; j < ubound; j++) {
                            if (arguments[j].equalsIgnoreCase(ValObject.get(j).toString())) {
                                System.out.println(+count + 1 + "  value: Both values  matched  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                                //ReportFunctions.LogRepoter("Pass", "VerifyMutlipleRowValue", +count + 1 + "  value:Both values matched  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                            } else {
                                System.out.println(+count + 1 + "  value:Both values  did not match  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                                //ReportFunctions.LogRepoter("Fail", "VerifyMutlipleRowValue", +count + 1 + "  value:Both values  did not match  Expected value:=" + arguments[j] + " Actual value:=" + ValObject.get(j));
                                Status = false;
                            }
                            count = count + 1;
                        }
                        break;
                    case "GetValue":
                        data = arguments1[3];
                        while (Sourceresult.next()) {;
                            ValObject.add(Sourceresult.getString(1));
                        }
                        o = ValObject.get(0);
                        if (o != null) {
                            output = o.toString();
                            hmap.put(data, output);
                            System.out.println("database value captured and stored in the variable:  " + data + " and value is" + output);
                            //ReportFunctions.LogRepoter("Pass", "GetValue", "database value captured and stored in the variable:  " + data + " and value is" + output);

                        } else {
                            System.out.println("database value captured is null");
                            //ReportFunctions.LogRepoter("Fail", "GetValue", "database value captured is null");
                            Status = false;
                        }
                        break;
                    case "GetMutlipleRowValue":
                        arguments = splitfunction(arguments1[3], ",");
                        ubound = arguments.length;
                        int val = 0;
                        while (Sourceresult.next()) {;
                            ValObject.add(Sourceresult.getString(1));
                            hmap.put(arguments[val], ValObject.get(val).toString());
                            //ReportFunctions.LogRepoter("Pass", "GetMutlipleRowValue", +count + 1 + "Captured the value :=" + ValObject.get(val).toString() + " and Stored in:=" + arguments[val]);
                            val = val + 1;
                            count = count + 1;
                            if (count == ubound) {
                                break;
                            }
                        }
                        break;
                    case "GetMutlipleColValue":
                        arguments = splitfunction(arguments1[3], ",");
                        ubound = arguments.length;
                        while (Sourceresult.next()) {;
                            for (int i = 0; i < ubound; i++) {
                                ValObject.add(Sourceresult.getString(i + 1));
                                hmap.put(arguments[i], ValObject.get(i).toString());
                                //ReportFunctions.LogRepoter("Pass", "GetMutlipleColValue", +i + 1 + "Captured the value :=" + ValObject.get(i).toString() + " and Stored in:=" + arguments[i]);
                            }
                            break;
                        }
                        break;
                }

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
            //ReportFunctions.LogRepoter("Fail", "Query_Mysql", "Failed to connect to database or nullpoint exception from database");
            Status = false;
        }
        return Status;

    }

    public static boolean INVISIBLEOFLOAD(WebDriver WebDriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean flag = false;
        // RecoveryScenarios();
        try {
            WebDriverWait wait = new WebDriverWait(WebDriver, 100);
            boolean status = driver.findElements(By.xpath("//img[contains(@src,'loader_circlespikes')]")).size() > 0;
            boolean status1 = driver.findElements(By.xpath("//img[contains(@src,'dropdownloader')]")).size() > 0;
            if (status || status1) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[contains(@src,'loader_circlespikes')]")));
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//img[contains(@src,'dropdownloader')]")));
                // System.out.println("Successfully waited till loader image is disappeared");
                // //ReportFunctions.LogRepoter("pass", "close pop up", "Successfully waited till loader image is disappeared");
                flag = true;
            }
            if (flag == false) {
                wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("loading-image")));
                //System.out.println("Successfully waited till loader image is disappeared");
                // //ReportFunctions.LogRepoter("pass", "close pop up", "Successfully waited till loader image is disappeared");
            }
            return true;
        } catch (Exception e) {
            //out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "close pop up", "Loader image is still present");
            return false;
        }

    }

    public static Boolean encrypt(String Parameters) throws Exception {

        try {
            String[] arguments = splitfunction(Parameters, "->");
            String valueToEnc = arguments[1];
            if (valueToEnc != null && valueToEnc.length() > 0) {
                Key key = generateKey();
                Cipher c = Cipher.getInstance(ALGORITHM);
                c.init(Cipher.ENCRYPT_MODE, key);
                byte[] encValue = c.doFinal(valueToEnc.getBytes());
                String encryptedValue = Base64.encodeBytes(encValue);
                hmap.put(arguments[2], encryptedValue);
                //ReportFunctions.LogRepoter("Pass", "Successfully encripted the value", "encripted value " + encryptedValue);
            } else {
                //ReportFunctions.LogRepoter("Fail", "Encript the value", "encripted value is null");
                return false;
            }
        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
        }
        return true;
    }

    public static Boolean decrypt(String Parameters) throws Exception {
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String encryptedValue = arguments[1];
            if (encryptedValue != null && encryptedValue.length() > 0) {
                Key key = generateKey();
                Cipher c = Cipher.getInstance(ALGORITHM);
                c.init(Cipher.DECRYPT_MODE, key);
                byte[] decordedValue = Base64.decode(encryptedValue);
                byte[] decValue = c.doFinal(decordedValue);
                String decryptedValue = new String(decValue);
                hmap.put(arguments[2], decryptedValue);
                //ReportFunctions.LogRepoter("Pass", "Successfully Decripted the value", "deripted value " + decryptedValue);
            } else {
                //ReportFunctions.LogRepoter("Fail", "Decript the value", "decipted value is null");
                return false;
            }
        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
        }
        return true;
    }

    public static String decryptMultipleValues(String[] encryptedValues) throws Exception {
        try {
            for (String encryptedValue : encryptedValues) {
                if (encryptedValue != null && encryptedValue.length() > 0) {
                    Key key = generateKey();
                    Cipher c = Cipher.getInstance(ALGORITHM);
                    c.init(Cipher.DECRYPT_MODE, key);
                    byte[] decordedValue = Base64.decode(encryptedValue);
                    byte[] decValue = c.doFinal(decordedValue);
                    String decryptedValue = new String(decValue);
                    System.out.println(encryptedValue + "     " + decryptedValue);
                }
            }
        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
        }
        return null;
    }

    public static String encryptMultipleValues(String[] decryptedValues) throws Exception {
        try {
            for (String decryptedValue : decryptedValues) {
                if (decryptedValue != null && decryptedValue.length() > 0) {
                    Key key = generateKey();
                    Cipher c = Cipher.getInstance(ALGORITHM);
                    c.init(Cipher.ENCRYPT_MODE, key);
                    byte[] encValue = c.doFinal(decryptedValue.getBytes());
                    String encryptedValue = Base64.encodeBytes(encValue);
                    System.out.println(decryptedValue + "     " + encryptedValue);
                }
            }
        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
        }
        return null;
    }

    private static Key generateKey() throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        // SecretKeyFactory keyFactory = SecretKeyFactory.getInstance(ALGORITHM);
        // key = keyFactory.generateSecret(new DESKeySpec(keyValue));
        //System.out.println("Passion12@3 -> Encrypted : " +DBUtil.decrypt("f44SO21vyB0hjiTI3/3Nfw=="));
        // String[] encryptedValues = {"T83trsyPtFNK/xRNP5DQAQ=="};
        // decryptMultipleValues(encryptedValues);
        //String[] decryptedValues = {"@Q6Qqe}AmH"};
        //encryptMultipleValues(decryptedValues);
        return key;
    }

    public static String Sysdate(String parameters) throws Exception {
        boolean flag = false;
        if (parameters.contains("sysdate,")) {
            dateformat = split(parameters, ",");
        } else {
            dateformat = split(parameters, ",");
            flag = true;
        }
        switch (dateformat[1].toUpperCase()) {
            case "DD-MM-YYYY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("dd-MM-YYYY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd-MM-YYYY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "-");
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "-");
                    }
                    today = dat;
                }
                break;
            case "MM-DD-YYYY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("MM-dd-YYYY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd-MM-YYYY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "-");
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "-");
                    }
                    String[] odat = split(dat, "-");
                    String len = odat[1];
                    int oval = Integer.parseInt(odat[1]);
                    if ((oval <= 9) && (len.length() == 1)) {
                        odat[1] = "0" + odat[1];
                    }

                    today = odat[1] + "-" + odat[0] + "-" + odat[2];
                }
                break;
            case "DD/MM/YYYY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("dd/MM/YYYY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd/MM/YYYY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "/");
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "/");
                    }
                    today = dat;
                }
                break;
            case "MM/DD/YYYY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("MM/dd/YYYY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd-MM-YYYY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "-");
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "-");
                    }
                    String[] odat = split(dat, "-");
                    String len = odat[1];
                    int oval = Integer.parseInt(odat[1]);

                    if ((oval <= 9) && (len.length() == 1)) {
                        odat[1] = "0" + odat[1];
                    }
                    today = odat[1] + "/" + odat[0] + "/" + odat[2];
                }
                break;
            case "DD-MM-YY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("dd-MM-YY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd-MM-YY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "-");
                        today = dat;
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "-");
                        String[] odat = split(dat, "-");
                        odat[2] = String.valueOf(odat[2]).substring(2);
                        today = odat[0] + "-" + odat[1] + "-" + odat[2];
                    }

                }
                break;
            case "MM-DD-YY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("MM-dd-YY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd-MM-YY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "-");
                        String[] odat = split(dat, "-");
                        today = odat[1] + "-" + odat[0] + "-" + odat[2];
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "-");
                        String[] odat = split(dat, "-");
                        odat[2] = String.valueOf(odat[2]).substring(2);
                        today = odat[1] + "-" + odat[0] + "-" + odat[2];
                    }

                }
                break;
            case "DD/MM/YY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("dd/MM/YY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd/MM/YY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "/");
                        today = dat;
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "/");
                        String[] odat = split(dat, "/");
                        odat[2] = String.valueOf(odat[2]).substring(2);
                        today = odat[0] + "/" + odat[1] + "/" + odat[2];

                    }

                }
                break;
            case "MM/DD/YY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("MM/dd/YY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd/MM/YY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "/");
                        String[] odat = split(dat, "/");
                        today = odat[1] + "/" + odat[0] + "/" + odat[2];
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "/");
                        String[] odat = split(dat, "/");
                        odat[2] = String.valueOf(odat[2]).substring(2);
                        today = odat[1] + "/" + odat[0] + "/" + odat[2];
                    }

                }
                break;
            case "DD-MMM-YYYY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("dd-MMM-YYYY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd-MMM-YYYY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "-");
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "-");
                    }
                    today = dat;
                }
                break;
            case "DD/MMM/YYYY":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("dd/MMM/YYYY");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd/MMM/YYYY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "/");
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "/");
                    }
                    today = dat;
                }
                break;
            case "YYYY-MM-DD":
                date = Calendar.getInstance().getTime();
                formatter = new SimpleDateFormat("YYYY-MM-dd");
                today = formatter.format(date);
                if (flag == true) {
                    date = Calendar.getInstance().getTime();
                    formatter = new SimpleDateFormat("dd-MM-YYYY");
                    today = formatter.format(date);
                    String[] odate = split(parameters, ",");
                    if (parameters.contains("+")) {
                        String[] addnum = split(odate[0], "+");
                        dat = returndate(addnum[1], today, "-");
                        String[] odat = split(dat, "-");
                        dat = odat[2] + "-" + odat[1] + "-" + odat[0];
                    } else if (parameters.contains("-")) {
                        String[] addnum = split(odate[0], "-");
                        dat = returnbackdate(addnum[1], today, "-");
                        String[] odat = split(dat, "-");
                        dat = odat[2] + "-" + odat[1] + "-" + odat[0];
                    }
                    today = dat;
                }
                break;
        }
        System.out.println(today);
        return today;

    }

    public static String returndate(String num, String date, String s) throws Exception {
        int oyear = 0;
        int month = 0;
        String temp = null;
        Boolean flag = true;
        try {
            String[] formats = splitfunction(date, s);
            temp = formats[1];
            switch (formats[1].toUpperCase()) {
                case "JAN":
                    formats[1] = "01";
                    flag = false;
                    break;
                case "FEB":
                    formats[1] = "02";
                    flag = false;
                    break;
                case "MAR":
                    formats[1] = "03";
                    flag = false;
                    break;
                case "APR":
                    formats[1] = "04";
                    flag = false;
                    break;
                case "MAY":
                    formats[1] = "05";
                    flag = false;
                    break;
                case "JUN":
                    formats[1] = "06";
                    flag = false;
                    break;
                case "JUL":
                    formats[1] = "07";
                    flag = false;
                    break;
                case "AUG":
                    formats[1] = "08";
                    flag = false;
                    break;
                case "SEP":
                    formats[1] = "09";
                    flag = false;
                    break;
                case "OCT":
                    formats[1] = "10";
                    flag = false;
                    break;
                case "NOV":
                    formats[1] = "11";
                    flag = false;
                    break;
                case "DEC":
                    formats[1] = "12";
                    flag = false;
                    break;
            }
            int currdate = Integer.parseInt(num) + Integer.parseInt(formats[0]);
            if (currdate >= 31) {
                while (currdate >= 31) {
                    if (formats[1].equalsIgnoreCase("08") || (Integer.parseInt(formats[1]) % 2 != 0) || formats[1].equalsIgnoreCase("02") || formats[1].equalsIgnoreCase("12")) {
                        if (formats[1].equalsIgnoreCase("02")) {
                            currdate = currdate - 28;
                            month = Integer.parseInt(formats[1]) + 1;
                            if (month < 10) {
                                formats[1] = 0 + String.valueOf(month);
                            } else if ((month > 12)) {
                                month = month % 12;
                                oyear = oyear + 1;
                                formats[1] = String.valueOf(month);
                            } else if ((month >= 10) && (month <= 12)) {
                                formats[1] = String.valueOf(month);
                            }
                        } else if (currdate == 31) {
                            currdate = 31;
                            month = Integer.parseInt(formats[1]);
                            break;

                        } else {
                            currdate = currdate - 31;
                            month = Integer.parseInt(formats[1]) + 1;
                        }
                        if (month < 10) {
                            formats[1] = 0 + String.valueOf(month);
                            if (formats[1].equalsIgnoreCase("02")) {
                                if (currdate > 28) {
                                    currdate = currdate - 28;
                                    month = Integer.parseInt(formats[1]) + 1;
                                    formats[1] = String.valueOf(month);
                                }
                            }
                        } else if ((month > 12)) {
                            month = month % 12;
                            formats[1] = String.valueOf(month);
                            oyear = oyear + 1;
                        } else if ((month >= 10) && (month <= 12)) {
                            formats[1] = String.valueOf(month);
                        }
                    } else {
                        currdate = currdate - 30;
                        month = Integer.parseInt(formats[1]) + 1;
                        if (month < 10) {
                            formats[1] = 0 + String.valueOf(month);
                        } else if ((month > 12)) {
                            month = month % 12;
                            formats[1] = String.valueOf(month);
                            oyear = oyear + 1;
                        } else if ((month >= 10) && (month <= 12)) {
                            formats[1] = String.valueOf(month);
                        }
                    }
                }
                if (flag == false) {
                    switch (formats[1]) {
                        case "1":
                            formats[1] = "JAN";
                            break;
                        case "2":
                            formats[1] = "FEB";
                            flag = false;
                            break;
                        case "3":
                            formats[1] = "MAR";
                            flag = false;
                            break;
                        case "4":
                            formats[1] = "APR";
                            flag = false;
                            break;
                        case "5":
                            formats[1] = "MAY";
                            flag = false;
                            break;
                        case "6":
                            formats[1] = "JUN";
                            flag = false;
                            break;
                        case "7":
                            formats[1] = "JUL";
                            flag = false;
                            break;
                        case "8":
                            formats[1] = "AUG";
                            flag = false;
                            break;
                        case "9":
                            formats[1] = "SEP";
                            flag = false;
                            break;
                        case "10":
                            formats[1] = "OCT";
                            flag = false;
                            break;
                        case "11":
                            formats[1] = "NOV";
                            flag = false;
                            break;
                        case "12":
                            formats[1] = "DEC";
                            flag = false;
                            break;
                    }
                }
                if (oyear == 0) {
                    today = "0" + currdate + s + formats[1] + s + formats[2];
                } else if (oyear > 0) {
                    int year = Integer.parseInt(formats[2]) + oyear;
                    formats[2] = String.valueOf(year);
                    today = "0" + currdate + s + formats[1] + s + formats[2];
                }
                if (currdate < 10) {
                    today = "0" + currdate + s + formats[1] + s + formats[2];
                } else {
                    today = currdate + s + formats[1] + s + formats[2];
                }
            } else {
                if (flag == false) {
                    formats[1] = temp;
                }
                if (currdate < 10) {
                    today = "0" + currdate + s + formats[1] + s + formats[2];
                } else {
                    today = currdate + s + formats[1] + s + formats[2];
                }
                // today = currdate + s + formats[1] + s + formats[2];

            }
        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
        }
        return today;
    }

    public static String returnbackdate(String num, String date, String s) throws Exception {
        int oyear = 0;
        int month;
        Boolean flag = true;
        String temp;
        String[] formats = split(date, s);
        temp = formats[1];
        switch (formats[1].toUpperCase()) {
            case "JAN":
                formats[1] = "01";
                flag = false;
                break;
            case "FEB":
                formats[1] = "02";
                flag = false;
                break;
            case "MAR":
                formats[1] = "03";
                flag = false;
                break;
            case "APR":
                formats[1] = "04";
                flag = false;
                break;
            case "MAY":
                formats[1] = "05";
                flag = false;
                break;
            case "JUN":
                formats[1] = "06";
                flag = false;
                break;
            case "JUL":
                formats[1] = "07";
                flag = false;
                break;
            case "AUG":
                formats[1] = "08";
                flag = false;
                break;
            case "SEP":
                formats[1] = "09";
                flag = false;
                break;
            case "OCT":
                formats[1] = "10";
                flag = false;
                break;
            case "NOV":
                formats[1] = "11";
                flag = false;
                break;
            case "DEC":
                formats[1] = "12";
                flag = false;
                break;
        }
        int currdate = Integer.parseInt(formats[0]) - Integer.parseInt(num);
        if (currdate >= 1) {
            today = currdate + s + formats[1] + s + formats[2];
        } else if (currdate <= 0) {
            while (currdate <= 0) {
                month = Integer.parseInt(formats[1]) - 1;
                if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12)) {
                    currdate = 31 - Math.abs(currdate);
                } else if (month == 2) {
                    if (Integer.parseInt(formats[2]) / 4 == 0) {
                        currdate = 29 - Math.abs(currdate);
                    } else {
                        currdate = 28 - Math.abs(currdate);
                    }
                } else {
                    currdate = 30 - Math.abs(currdate);
                }

                if (month == 0) {
                    month = 12;
                    oyear = oyear + 1;
                }
                if (month < 10) {
                    formats[1] = 0 + String.valueOf(month);
                } else {
                    formats[1] = String.valueOf(month);
                }

            }
        }
        if (flag == false) {
            switch (formats[1]) {
                case "1":
                    formats[1] = "JAN";
                    break;
                case "2":
                    formats[1] = "FEB";
                    flag = false;
                    break;
                case "3":
                    formats[1] = "MAR";
                    flag = false;
                    break;
                case "4":
                    formats[1] = "APR";
                    flag = false;
                    break;
                case "5":
                    formats[1] = "MAY";
                    flag = false;
                    break;
                case "6":
                    formats[1] = "JUN";
                    flag = false;
                    break;
                case "7":
                    formats[1] = "JUL";
                    flag = false;
                    break;
                case "8":
                    formats[1] = "AUG";
                    flag = false;
                    break;
                case "9":
                    formats[1] = "SEP";
                    flag = false;
                    break;
                case "10":
                    formats[1] = "OCT";
                    flag = false;
                    break;
                case "11":
                    formats[1] = "NOV";
                    flag = false;
                    break;
                case "12":
                    formats[1] = "DEC";
                    flag = false;
                    break;
            }
        }

        int year = Calendar.getInstance().get(Calendar.YEAR) - oyear;
        formats[2] = String.valueOf(year);
        if (Math.abs(currdate) < 10) {
            today = "0" + currdate + s + formats[1] + s + formats[2];
        } else {
            today = currdate + s + formats[1] + s + formats[2];
        }
        //System.out.println(today);
        return today;
    }

    public static Boolean Click_Enter1(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        //WAITTIME("WAITTIME->4");
        INVISIBLEOFLOAD(driver);
        //WAITTIME("waittime->2");
        String click_enter_wait = wait;
        Boolean Status = false;
        String value;
        String[] arguments = splitfunction(Parameters, "->");
        if (arguments.length >= 4) {
            click_enter_wait = arguments[3];
        }
        String label = arguments[1];
        try {
            if (hmap.containsKey(arguments[2])) {
                value = hmap.get(arguments[2]);
            } else {
                value = arguments[2];
            }

            String xpath5 = "xpath:=//a[text()=\"" + value + "\"]";
            String xpath = "xpath:=//div/label[text()=\"" + label + "\"]/preceding-sibling::input";
            String xpath2 = "xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]";
            String xpath3 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";
            String xpath4 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[text()=\"" + value + "\"]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath + "->" + label + "");
            WebElement locator1 = Getlocator(driver, xpath);
            WebElement locator2 = Getlocator(driver, xpath3);
            WebElement locator;
            if (locator1 != null) {
                locator = locator1;
            } else {
                locator = locator2;
            }
            locator.click();
            locator.clear();
//            WAITTIME("waittime->"+click_enter_wait);
            locator.sendKeys(value);
            WAITTIME("waittime->click_enter_wait");
            SENDKEYS(driver, "SENDKEYS->ENTER");
            SENDKEYS(driver, "SENDKEYS->ENTER");
            WAITTIME("waittime->click_enter_wait");
            INVISIBLEOFLOAD(driver);
            try {
                WebElement downval = Getlocator(driver, "xpath:=//a[text()=\"" + value + "\"]");
                if (downval != null) {
                    StaleElementClick(driver, "StaleElementClick->xpath:=//a[text()=\"" + value + "\"]->" + value);
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            // locator.click();
            WAITTIME("waittime->click_enter_wait");
            Status = true;
            //ReportFunctions.LogRepoter("pass", "Enter value ", "Succesfully entered value " + " " + arguments[2]);
            INVISIBLEOFLOAD(driver);
        } catch (Exception e) {
            //ReportFunctions.LogRepoter("Fail", "Click_Enter", "Failed to enter value " + e);
            //  CLOSEALLBROWSERS(driver);
            Status = false;
        }
        return Status;

    }

    public static Boolean Click_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        INVISIBLEOFLOAD(driver);

        Boolean Status = false;
        String value;
        String[] arguments = splitfunction(Parameters, "->");

        String local_wait = wait;
        try {
            if (arguments != null && arguments.length >= 4) {
                local_wait = arguments[3];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WAITTIME("waittime->" + local_wait);
        String label = arguments[1].trim();
        try {
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }

            //  String xpath2 = "xpath:=//a[text()=\"" + value + "\"]";
            String xpath = "xpath:=//div/label[text()=\"" + label + "\"]/preceding-sibling::input";
            String xpath2 = "xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]";
            String xpath3 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";
            String xpath4 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[text()=\"" + value + "\"]";
            String xpath5 = "xpath:=//div/label[text()=\"" + label + "\"]/following-sibling::span//button";

            // WAITFORELEMENT(driver, "waitforelement->" + xpath + "->" + label + "");
            WebElement locator = Getlocator(driver, xpath);
            WebElement locator3 = Getlocator(driver, xpath3);
            WebElement locator5 = Getlocator(driver, xpath5);
            if (locator != null) {
                locator.click();
                locator.clear();
                locator.sendKeys(value);
                WAITTIME("waittime->7");
                //ReportFunctions.LogRepoter("pass", "Enter value ", "Succesfully entered value " + " " + arguments[2]);
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                WAITTIME("waittime->" + local_wait);
                ElementClickable("//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]");
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    //locator2.click();
                    StaleElementClick(driver, "StaleElementClick->xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]->" + value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                    System.out.println("Succesfully entered value" + " " + arguments[2]);
                    Status = true;
                    //ReportFunctions.LogRepoter("pass", "click on the object","Succesfully clicked on" + " " + arguments[2]);

                } else {
                    //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + value);
                    Status = false;
                    //  CLOSEALLBROWSERS(driver);
                }

            } else if (locator3 != null) {
                locator3.click();
                locator3.clear();
                locator3.sendKeys(value);
                WAITTIME("waittime->" + local_wait);
                //ReportFunctions.LogRepoter("pass", "Enter value ", "Succesfully entered value " + " " + arguments[2]);
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                ElementClickable("//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[text()=\"" + value + "\"]");
                WebElement locator4 = Getlocator(driver, xpath4);
                if (locator4 != null) {
                    // locator4.click();
                    StaleElementClick(driver, "StaleElementClick->xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[text()=\"" + value + "\"]->" + value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                    System.out.println("Succesfully entered value" + " " + arguments[2]);
                    Status = true;
                    //ReportFunctions.LogRepoter("pass", "click on the object","Succesfully clicked on" + " " + arguments[2]);

                } else {
                    //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + value);
                    Status = false;
                    //  CLOSEALLBROWSERS(driver);
                }

            } else {
                System.out.println("unable to find" + " " + arguments[2]);
                // //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + arguments[2]);
                //CLOSEALLBROWSERS(driver);
                Status = false;
            }
        } catch (Exception e) {
            //ReportFunctions.LogRepoter("Fail", "Click_Enter", "Failed to enter value " + e);
            // CLOSEALLBROWSERS(driver);
            Status = false;
        }
        return Status;

    }

    public static Boolean Click_Select(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        INVISIBLEOFLOAD(driver);

        Boolean Status = false;
        String value;
        String[] arguments = splitfunction(Parameters, "->");
        String label = arguments[1].trim();

        String local_wait = wait;
        try {
            if (arguments != null && arguments.length >= 4) {
                local_wait = arguments[3];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WAITTIME("waittime->" + local_wait);
        try {
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }

            //  String xpath2 = "xpath:=//a[text()=\"" + value + "\"]";
            String xpath = "xpath:=//div/label[text()=\"" + label + "\"]/preceding-sibling::input";
            String xpath2 = "xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]";
            String xpath3 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";
            String xpath4 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[text()=\"" + value + "\"]";
            String xpath5 = "xpath:=//div/label[text()=\"" + label + "\"]/following-sibling::span//button";
            String[] args = splitfunction(xpath2, "xpath:=");
            // WAITFORELEMENT(driver, "waitforelement->" + xpath + "->" + label + "");
            WebElement locator = Getlocator(driver, xpath);
            WebElement locator3 = Getlocator(driver, xpath3);
            WebElement locator5 = Getlocator(driver, xpath5);
            if (locator != null) {
                locator.click();
                locator.clear();
                locator.sendKeys(value);
                WAITTIME("waittime->" + local_wait);
                //ReportFunctions.LogRepoter("pass", "Enter value ", "Succesfully entered value " + " " + arguments[2]);
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                ElementClickable("//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]");
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                     WAITTIME("waittime->" + local_wait);
                    //locator2.click();
                    StaleElementClick(driver, "StaleElementClick->xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]->" + value);
                    //clickElementUsingJavascriptExecutor(args[1]);
                    INVISIBLEOFLOAD(driver);
                    System.out.println("Succesfully entered value" + " " + arguments[2]);
                    Status = true;
                    //ReportFunctions.LogRepoter("pass", "click on the object","Succesfully clicked on" + " " + arguments[2]);

                } else {
                    //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + value);
                    Status = false;
                    //  CLOSEALLBROWSERS(driver);
                }

            } else if (locator3 != null) {
                locator3.click();
                locator3.clear();
                locator3.sendKeys(value);
                WAITTIME("waittime->" + local_wait);
                //ReportFunctions.LogRepoter("pass", "Enter value ", "Succesfully entered value " + " " + arguments[2]);
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                ElementClickable("//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[text()=\"" + value + "\"]");
                WebElement locator4 = Getlocator(driver, xpath4);
                if (locator4 != null) {
                    // locator4.click();
                    StaleElementClick(driver, "StaleElementClick->xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[text()=\"" + value + "\"]->" + value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                    System.out.println("Succesfully entered value" + " " + arguments[2]);
                    Status = true;
                    //ReportFunctions.LogRepoter("pass", "click on the object","Succesfully clicked on" + " " + arguments[2]);

                } else {
                    //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + value);
                    Status = false;
                    //  CLOSEALLBROWSERS(driver);
                }

            } else {
                System.out.println("unable to find" + " " + arguments[2]);
                // //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + arguments[2]);
                //CLOSEALLBROWSERS(driver);
                Status = false;
            }
        } catch (Exception e) {
            //ReportFunctions.LogRepoter("Fail", "Click_Enter", "Failed to enter value " + e);
            // CLOSEALLBROWSERS(driver);
            Status = false;
        }
        return Status;

    }

    public static Boolean Search_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        int wait = 2;
        Boolean Status = true;
        RecoveryScenarios();
        String value;
        INVISIBLEOFLOAD(driver);
        try {
            String[] arguments = splitfunction(Parameters, "->");

            String local_wait = "1";
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            String label = arguments[1].trim();
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }
            try {
                ActionTypes actTypes = ActionTypes.valueOf(arguments[1].toUpperCase());
                switch (actTypes) {
                    case ORGANIZATION:
                        wait = 5;
                        break;
                }
            } catch (Exception e) {
                //e.printStackTrace();	
                System.out.println(e.getMessage());
            }
//String xpath = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";	
            // String xpath1 = "xpath:=//label[text()=\"" + label + "\"]/preceding-sibling::input";	
            String xpath1 = "xpath:=//div/input[@placeholder=\"" + label + "\"]";
            // String xpath1 = "xpath:=//div[contains(text(),\"" + label + "\")]/ancestor::div/following-sibling::div//td[4]";	
            String xpath2 = "xpath:=//td[starts-with(text(),\"" + value + "\")]";
            String xpath3 = "xpath:=//input[@id='searchString']";
            String xpath4 = "xpath:=//div[@class=\"WBTableRender\"]//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
            String xpath5 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[32]//input";
            String xpath6 = "xpath:=//div/input[@placeholder=\"" + label + "\"]/following-sibling::span//button[@title=\"Reset\"]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            String[] args1 = splitfunction(xpath3, ":=");
            WebElement locator = null;
            WebElement locator1 = Getlocator(driver, xpath1);
            WebElement locator4 = Getlocator(driver, xpath4);
            WebElement locator5 = Getlocator(driver, xpath5);
            WebElement locator6 = Getlocator(driver, xpath6);
            WAITTIME("WAITTIME->" + local_wait);
            // if (locator6 != null) {
            //  locator6.click();
            // }
            if (locator1 != null) {
                locator = locator1;
            } else if (locator4 != null) {
                locator = locator4;
            } else {
                locator = locator5;
            }

            if (locator != null) {
                INVISIBLEOFLOAD(driver);
                clickElementUsingJavascriptExecutor(args[1]);
                INVISIBLEOFLOAD(driver);
                ElementClickable("//button[@id=\"done\" or @id=\"save\"]");
                WAITTIME("waittime->" + local_wait);
                WebElement search1 = Getlocator(driver, xpath3);
                if (search1 != null) {
                    //search1.click();	
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->" + local_wait);
                    ElementClickable("//input[@id='searchString']");
                    search1.clear();
                    // WAITTIME("WAITTIME->3");
                    try {
                        typeValueUsingJavaScriptExecutor(args1[1], value);
                    } catch (Exception e) {
                        search1 = Getlocator(driver, xpath3);
                        search1.sendKeys(value);
                        INVISIBLEOFLOAD(driver);
                    }
                }
                ElementClickable("(//button[@id=\"search\"])[1]");
                WebElement search2 = Getlocator(driver, "xpath:=(//button[@id=\"search\"])[1]");
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->" + local_wait);
                search2.click();
                INVISIBLEOFLOAD(driver);

                try {
                    ElementVisible("//td[starts-with(text(),\"" + value + "\")]");
                } catch (Exception e) {
                    System.out.println("element not clickable");
                }
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                // WAITTIME("WAITTIME->" + wait);
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    WAITTIME("waittime->" + local_wait);
                    locator2.click();
                    INVISIBLEOFLOAD(driver);
                    //SENDKEYS(driver, "sendkeys->TAB");	
                } else {
                    System.out.println("unable to find search item");
                }
                ElementClickable("//button[@id=\"done\" or @id=\"save\"]");
                boolean status = driver.findElements(By.xpath("//button[@id=\"done\" or @id=\"save\"]")).size() > 0;
                WebElement Dones = Getlocator(driver, "xpath:=//button[@id=\"done\" or @id=\"save\"]");
                if (Dones != null) {
                    Dones.click();
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    Dones = Getlocator(driver, "xpath:=//button[@id=\"done\" or @id=\"save\"]");
                    if (Dones != null) {
                        StaleElementClick(driver, "StaleElementClick->xpath:=//button[@id=\"done\" or @id=\"save\"]-> done");
                    }
                } else {
                    // ReportFunctions.LogRepoter("Fail", "Click on Done", "Verify the Prompt: Unable to find Done Button");
                }
            }
        } catch (Exception e) {
            Status = false;
        }
        return Status;
    }

    public static Boolean Row_Search_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        INVISIBLEOFLOAD(driver);

        Boolean Status = false;
        String value = null;
        try {
            String[] arguments = null;
            String[] argu1 = null;
            String[] argu2 = null;
            arguments = splitfunction(Parameters, "->");
            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("WAITTIME->" + local_wait);
            String label = arguments[0].trim();
            argu1 = splitfunction(arguments[1], "|");
            argu2 = splitfunction(arguments[2], "|");
            if (hmap.containsKey(argu1[0].trim())) {
                argu1[0] = hmap.get(argu1[0].trim());
            }

            if (hmap.containsKey(argu2[0])) {
                argu2[0] = hmap.get(argu2[0].trim());
            }
            if (hmap.containsKey(argu1[1])) {
                argu2[1] = hmap.get(argu2[1].trim());
            } else {
                value = argu2[0].trim();
            }
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + argu1[0] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + argu1[0] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }

            String xpath1 = "xpath:=(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "]//input)[" + argu1[1] + "]";
            String xpath2 = "xpath:=//td[starts-with(text(),\"" + value + "\")]";
            String xpath3 = "xpath:=(//input[@id='searchString'])[1]";
            String xpath4 = "xpath:=(//button[@id=\"search\"])[1]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            String[] args1 = splitfunction(xpath3, ":=");
            WebElement locator = Getlocator(driver, xpath1);

            if (locator != null) {
                locator.click();
                Status = true;

//WAITTIME("waittime->3");
                WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + label + "");
                WebElement search1 = Getlocator(driver, xpath3);
                if (search1 != null) {
                    search1.click();
                    search1.clear();
                    typeValueUsingJavaScriptExecutor(args1[1], value);
// search1.sendKeys(value);
                    INVISIBLEOFLOAD(driver);
                }
                WebElement search2 = Getlocator(driver, xpath4);
                String[] args2 = splitfunction(xpath4, ":=");
                clickElementUsingJavascriptExecutor(args2[1]);
                INVISIBLEOFLOAD(driver);
// search2.click();
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                WAITTIME("waittime->" + local_wait);
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    locator2.click();
                    INVISIBLEOFLOAD(driver);
                    SENDKEYS(driver, "sendkeys->TAB");
                } else {
                    System.out.println("unable to find search item");
                }
                boolean status = driver.findElements(By.xpath("//button[@id=\"save\"]")).size() > 0;
                if (status) {
                    WebElement done = Getlocator(driver, "xpath:=//button[@id=\"save\"]");
                    clickElementUsingJavascriptExecutor("//button[@id=\"save\"]");
//done.click();
                    INVISIBLEOFLOAD(driver);
                }

            }
        } catch (Exception e) {
            Status = false;
        }
        return Status;
    }

    public static Boolean AutoSearch_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        String value;
        INVISIBLEOFLOAD(driver);

        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("waittime->" + local_wait);
            String label = arguments[1].trim();
            if (hmap.containsKey(arguments[2])) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }
//String xpath = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";
            // String xpath1 = "xpath:=//label[text()=\"" + label + "\"]/preceding-sibling::input";
            String xpath1 = "xpath:=//div/label[text()=\"" + label + "\"]/preceding-sibling::input";
            // String xpath1 = "xpath:=//div[contains(text(),\"" + label + "\")]/ancestor::div/following-sibling::div//td[4]";
            String xpath2 = "xpath:=//td[starts-with(text(),\"" + value + "\")]";
            //*[@class=\"modal-body\"]/div[@class=\"panel-body\"]/table/tr[1]"
            String xpath3 = "xpath:=//input[@id=\"listTable_search\"]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            String[] args1 = splitfunction(xpath3, ":=");
            WebElement locator = Getlocator(driver, xpath1);
            if (locator.isEnabled()) {
                clickElementUsingJavascriptExecutor(args[1]);

                INVISIBLEOFLOAD(driver);
                //WAITTIME("waittime->3");
                WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + label + "");
                WebElement search1 = Getlocator(driver, xpath3);
                if (search1 != null) {
                    search1.click();
                    search1.clear();
                    //typeValueUsingJavaScriptExecutor(args1[1], value);
                    search1.sendKeys(value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                }
                //WebElement search2 = Getlocator(driver, "xpath:=(//button[@id=\"search\"])[1]");
                //search2.click();
                //INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                WAITTIME("waittime->" + local_wait);
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    locator2.click();
                    INVISIBLEOFLOAD(driver);
                    //SENDKEYS(driver, "sendkeys->TAB");
                } else {
                    System.out.println("unable to find search item");
                }
                boolean status = driver.findElements(By.xpath("//button[@id=\"save\"]")).size() > 0;
                if (status) {
                    WebElement done = Getlocator(driver,
                            "xpath:=//button[@id=\"save\"]");
                    done.click();
                    INVISIBLEOFLOAD(driver);
                }
            }
        } catch (Exception e) {

            Status = false;

        }
        return Status;

    }

    public static Boolean Upload_File(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        RecoveryScenarios();
        String workingDirectory = new java.io.File(".").getCanonicalPath();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String path = workingDirectory + "/" + arguments[1].trim();
            Thread.sleep(3000);
            Runtime.getRuntime().exec("wscript " + path + ".vbs");
            System.out.println("wscript " + path + ".vbs");
            //ReportFunctions.LogRepoter("pass", "Upload_File  ", "Succesfully uploaded file " + " " + arguments[1]);
        } catch (Exception e) {
            //ReportFunctions.LogRepoter("Fail", "Upload_File  ", "Failed to uploaded file " + e);
            Status = false;
            // CLOSEALLBROWSERS(driver);
        }
        return Status;
    }

    public static void Store_data() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        String datasheet = Tsuitename;
        RecoveryScenarios();
        try {
            String workingDirectory = new java.io.File(".").getCanonicalPath();
            System.out.println(workingDirectory);
            String path = workingDirectory + "/TestData";
            File Sfolder = new File(path);
            File[] listofsfiles = Sfolder.listFiles();
            String[] myFiles;
            if (Sfolder.isDirectory()) {
                myFiles = Sfolder.list();
                for (int k = 0; k < myFiles.length; k++) {
                    File myFile = new File(Sfolder, myFiles[k]);
                    String fname = myFile.getName().trim();
                    fname = fname.replace(".xlsx", "");
                    if (fname.equalsIgnoreCase(datasheet)) {
                        myFile.delete();
                        break;
                    }
                }
            }
            File file1 = new File(path + "/" + datasheet + ".xlsx");
            File file = new File(path);
            file1.createNewFile();
            FileOutputStream fileOut = new FileOutputStream(file1);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet1;
            spreadsheet1 = workbook.createSheet(datasheet);
            XSSFRow Srow;
            Srow = spreadsheet1.createRow(0);
            XSSFCell Scell;
            Scell = Srow.createCell(0);
            Scell.setCellValue("Environment Variables");
            Scell = Srow.createCell(1);
            Scell.setCellValue("Variable Values");
            int i = 1;
            for (Map.Entry<String, String> entry : hmap.entrySet()) {
                Srow = spreadsheet1.createRow(i);
                Scell = Srow.createCell(0);
                Scell.setCellValue(entry.getKey());
                Scell = Srow.createCell(1);
                Scell.setCellValue(hmap.get(entry.getKey()));
                i++;
            }
            XSSFCellStyle style1 = workbook.createCellStyle();
            style1 = workbook.createCellStyle();
            spreadsheet1.setColumnWidth(0, 6000);

            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
            System.out.println("Succesfully stored data in" + path);
            // //ReportFunctions.LogRepoter("pass", "Store_data  ", "Succesfully stored data in" + path);

        } catch (Exception e) {
            // System.out.println("Store data, Failed to store data" + e);
            // System.out.println("failed to stored data");
            ////ReportFunctions.LogRepoter("Fail", "Store_data  ", "Failed to store data");
        }

    }

    public static void Automation_Summary_old() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        final long MSEC_SINCE_EPOCH = System.currentTimeMillis();
        try {
            String datasheet = hmap.get(suitename);
            Date instant = new Date(MSEC_SINCE_EPOCH);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
            String time = sdf.format(instant);
            time = time.replace(':', '-');
            datasheet = datasheet + "_" + time;
            ArrayList<String> br = ReadXMLFile();
            String workingDirectory = new java.io.File(".").getCanonicalPath();
            System.out.println(workingDirectory);
            String path = workingDirectory + "/Automation_Summary";
            File file1 = new File(path + "/" + datasheet + ".xlsx");
            File file = new File(path);
            file1.createNewFile();
            FileOutputStream fileOut = new FileOutputStream(file1);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet1;
            XSSFSheet spreadsheet2;
            spreadsheet1 = workbook.createSheet(datasheet);
            //spreadsheet2 = workbook.createSheet("Runtime Captured Values");
            XSSFRow Srow;
            XSSFCellStyle style = workbook.createCellStyle();
            style.setBorderTop(BorderStyle.DOUBLE);
            style.setBorderBottom(BorderStyle.DOUBLE);
            style.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
            XSSFFont font = workbook.createFont();
            font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
            font.setFontHeightInPoints((short) 10);
            font.setBold(true);
            font.setColor(HSSFColor.BLUE.index);
            style.setFont(font);
            Srow = spreadsheet1.createRow(0);
            XSSFCell Scell;
            Scell = Srow.createCell(0);
            Scell.setCellValue("Automation Summary");
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(1);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Suite Name");
            Scell = Srow.createCell(1);
            Scell.setCellValue(hmap.get(suitename));
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(2);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Suite Final Status ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(hmap.get(ESuitestatus));
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(3);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Test Cases Executed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(casecount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(4);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Suite Execution Time");
            Scell = Srow.createCell(1);
            Scell.setCellValue(display);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(5);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Cases Passed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(TCpasscount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(6);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Cases Failed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(TCfailcount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(7);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Release Name");
            Scell = Srow.createCell(1);
            Scell.setCellValue(releasename);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(8);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Environment");
            Scell = Srow.createCell(1);
            Scell.setCellValue(environmentname);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(10);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Test Case Name");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(1);
            Scell.setCellValue("Execution Time ");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(2);
            Scell.setCellValue("Status ");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(3);
            Scell.setCellValue("Steps ");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Iterator<String> itr = br.iterator();
            int i = 11;
            int b = 0;
            XSSFRow Srow1;
            XSSFCell Scell1;
            XSSFCell Scell2;
            XSSFCell Scell3;
            XSSFFont whitefont = workbook.createFont();
            whitefont.setColor(HSSFColor.WHITE.index);
            XSSFFont blackfont = workbook.createFont();
            blackfont.setColor(HSSFColor.BLACK.index);
            XSSFCellStyle style1 = workbook.createCellStyle();
            XSSFCellStyle style2 = workbook.createCellStyle();
            XSSFCellStyle style3 = workbook.createCellStyle();
            style1.setFont(font);
            style1.setFont(whitefont);
            style1.setBorderBottom(BorderStyle.THIN);
            style2.setFont(font);
            style2.setFont(whitefont);
            style2.setBorderBottom(BorderStyle.THIN);
            style3.setFont(font);
            style3.setFont(blackfont);
            style3.setBorderBottom(BorderStyle.THIN);
            while (itr.hasNext()) {
                Srow1 = spreadsheet1.createRow(i);
                Scell1 = Srow1.createCell(0);
                Scell1.setCellValue(itr.next());
                Scell1 = Srow1.createCell(1);
                Scell1.setCellValue(itr.next());
                Scell1 = Srow1.createCell(2);
                Scell1.setCellValue(itr.next());
                Scell2 = workbook.getSheetAt(0).getRow(i).getCell(2);
                if (Scell2.toString().equalsIgnoreCase("PASS")) {
                    Scell2 = Srow1.createCell(2);
                    Scell2.setCellValue("PASS");
                    style1.setAlignment(HorizontalAlignment.CENTER);
                    style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                    Scell2.setCellStyle(style1);
                }
                if (Scell2.toString().equalsIgnoreCase("FAIL")) {
                    if (Stpname != null) {
                        Stpname = Stpname.replace(Stpname, "Stpname");
                    }
                    Stpname = Stpname + b;
                    Scell2 = Srow1.createCell(2);
                    Scell2.setCellValue("FAIL");
                    style2.setAlignment(HorizontalAlignment.CENTER);
                    style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                    Scell2.setCellStyle(style2);
                    Scell3 = Srow1.createCell(3);
                    Scell3.setCellValue(hmap.get(Stpname));
                    Scell3.setCellStyle(style3);
                    b++;
                }

                i++;
            }

//          spreadsheet1.setColumnWidth(2, 2000);
            for (int m = 0; m < 200; m++) {
                spreadsheet1.autoSizeColumn(m);
            }
            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
        } catch (Exception e) {

            // System.out.println("Automation Summary" + e);
        }

    }

//    public static ArrayList<String> ReadXMLFile() throws ParserConfigurationException, SAXException, InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
//        ArrayList<String> ar = new ArrayList<String>();
//        String res;
//        try {
//            //File file = new File("C:/Users/mpentakota/Documents/NetBeansProjects/MultipledataSetup/Reports/SMB_Suite_2018-08-20-03-39-09/XmlReport.xml");
//            File file = new File(xmlSavedLocation);
//
//            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
//            Document doc = dBuilder.parse(file);
//            doc.getDocumentElement().normalize();
//            //  System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
//            NodeList nList = doc.getElementsByTagName("TestSuite");
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//                // System.out.println("\nCurrent Element :" + nNode.getNodeName());
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
//                    ESuiteDuration = eElement.getAttribute("Duration");
//                    hmap.put(Esuitename, eElement.getAttribute("Name"));
//                    hmap.put(ESuitestatus, eElement.getAttribute("FinalStatus"));
//                    mailstarttime = eElement.getAttribute("StartTime");
//                    mailendtime = eElement.getAttribute("EndTime");
//                }
//            }
//            nList = doc.getElementsByTagName("TestCase");
//            casecount = nList.getLength();
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//
//                // System.out.println("\nCurrent Element :" + nNode.getNodeName());
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
//                    sanitymap.put(sanitycnt, eElement.getAttribute("Name"));
//                    ar.add(eElement.getAttribute("Name"));
//                    ar.add(eElement.getAttribute("Duration"));
//                    ar.add(eElement.getAttribute("FinalStatus"));
//                    sanitycnt = sanitycnt + 1;
//                    if (eElement.getAttribute("FinalStatus").equalsIgnoreCase("PASS")) {
//                        TCpasscount = TCpasscount + 1;
//                    } else {
//                        TCfailcount = TCfailcount + 1;
//                    }
//                }
//            }
//
//            nList = doc.getElementsByTagName("Log");
//            int j = 0;
//            int pass = 0;
//            for (int temp = 0; temp < nList.getLength(); temp++) {
//                Node nNode = nList.item(temp);
//                teststeps = new ArrayList<>();
//                // System.out.println("\nCurrent Element :" + nNode.getNodeName());
//                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
//                    Element eElement = (Element) nNode;
//                    res = eElement.getAttribute("Status");
//                    if (res.equalsIgnoreCase("FAIL")) {
//                        Stpname = "Stpname" + j;
//                        String nam[] = split(eElement.getAttribute("Name"), "ELSE");
//                        nam[1] = nam[1] + " " + "-" + "unable to find " + failvalue;
//                        hmap.put(Stpname, nam[1]);
//                        teststeps.add(nam[1]);
//                        j++;
//                    } else {
//                        stppass = "Stpname" + pass;
//                        String nam[] = split(eElement.getAttribute("Name"), "ELSE");
//                        hpass.put(stppass, nam[0]);
//                        teststeps.add(nam[0]);
//                        pass++;
//                    }
//                }
//
//            }
//
//            nList = doc.getElementsByTagName("Log");
//        } catch (Exception e) {
//            // System.out.println(e.getMessage());
//        }
//        return ar;
//    }
//   
//    public static void sendAttachmentEmail(String toEmail, String subject, String body) throws IOException, SAXException, InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {
//        String ipaddress = "http://";
//        String ip = null;
//        InetAddress myIP = InetAddress.getLocalHost();
//        ip = myIP.getHostAddress();
//        ipaddress = ipaddress + ip + "/";
//         try {
//        ArrayList<String> br = ReadXMLFile();
//        int passperc = (TCpasscount * 100) / casecount;
//        LocalDate today = LocalDate.now();
//        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
//       
//            final String fromEmail = "kg.automation.rundetails@gmail.com";
//            final String password = "Welcome@135";
//            //System.out.println("SSLEmail Start");
//            Properties props = new Properties();
//            props.put("mail.smtp.host", "smtp.gmail.com");
//            props.put("mail.smtp.socketFactory.port", "465");
//            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
//            props.put("mail.smtp.auth", "true");
//            props.put("mail.smtp.port", "465");
//
//            Authenticator auth = new Authenticator() {
//                protected PasswordAuthentication getPasswordAuthentication() {
//                    return new PasswordAuthentication(fromEmail, password);
//                }
//            };
//
//            Session session = Session.getDefaultInstance(props, auth);
//            MimeMessage msg = new MimeMessage(session);
//            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
//            msg.addHeader("format", "flowed");
//            msg.addHeader("Content-Transfer-Encoding", "8bit");
//            msg.setFrom(new InternetAddress("kg.automation.rundetails@gmail.com", "KG_Automation_Run_Details"));
//            msg.setReplyTo(InternetAddress.parse("kg.automation.rundetails@gmail.com", false));
//            msg.setSubject(subject, "UTF-8");
//            msg.setSentDate(new Date());
//            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
//            BodyPart messageBodyPart = new MimeBodyPart();
//            String file1 = "Report link:     " + ipaddress + mailsuite + "/Main_Page.html";
//            String file2 = "Executed By:   " + runsuser;
//            String file3 = "Tenant Name:  " + suitetenant;
//            String file4 = "Release:   " + releasename;
//            String file5 = "Evironment and URL:   " + environmentname;
//            messageBodyPart.setText(body + "\n\n" + file2 + "\n\n" + file3 + "\n\n" + file4 + "\n\n" + file5 + "\n\n" + file1 + "\n\n" + "Thanks and Regards, \n\n Automation Team");
//            messageBodyPart.setContent(
//                    body + "\n\n"
//                    + "<br>"
//                    + "<br>"
//                    + "<p style='color:grey'" + "\n\n" + "/p>"
//                    + file2 + "\n\n" + "\n\n"
//                    + "<br>"
//                    + file3 + "\n\n" + "\n\n"
//                    + "<br>"
//                    + file4 + "\n\n" + "\n\n"
//                    + "<br>"
//                    + file5 + "\n\n" + "\n\n"
//                    + "<br>"
//                    + "<br>"
//                    + file1 + "\n\n" + "\n\n"
//                    + "<br>"
//                    + "<br>"
//                    + "<br>"
//                    + "<table width='100%' border='0' align='center'  style='border:2px solid black;background-color:lightblue'>"
//                    + "<tr align='center'>"
//                    + "<td style='background-color:midnightblue;color:white' width='48%'><b>Test Results <b></td>"
//                    + "<td style='background-color:blue;color:white' width='58%'><b>Schedule<b></td>"
//                    + "</tr>"
//                    + "<table width='210%' border='1' align='center' background-color='blue'>"
//                    + "<tr align='center'>"
//                    + "<td><b># Flows <b></td>"
//                    + "<td width='10%'><b>Pass<b></td>"
//                    + "<td width='12%'><b>Fail<b></td>"
//                    + "<td><b>% Pass<b></td>"
//                    + "<td><b>Date of Run<b></td>"
//                    + "<td><b>Start Time<b></td>"
//                    + "<td><b>End Time<b></td>"
//                    + "<td><b>Duration <b></td>"
//                    + "</tr>"
//                    + "<tr align='center'>"
//                    + "<td style='background-color:white'><b>" + casecount + "<b></td>"
//                    + "<td style='background-color:white'><b>" + TCpasscount + "<b></td>"
//                    + "<td style='background-color:white'><b>" + TCfailcount + "<b></td>"
//                    + "<td style='background-color:white'><b>" + passperc + "<b></td>"
//                    + "<td style='background-color:white'><b>" + formattedDate + "<b></td>"
//                    + "<td style='background-color:white'><b><b>" + mailstarttime + "</td>"
//                    + "<td style='background-color:white'><b>" + mailendtime + "<b></td>"
//                    + "<td style='background-color:white'><b>" + ESuiteDuration + "<b></td>"
//                    + "</tr>"
//                    + " </table>"
//                    + " </table>"
//                    + "<br>"
//                    + "\n\n" + "Thanks and Regards,"
//                    + "<br>"
//                    + "<br>"
//                    + "\n\n Automation Team",
//                    "text/html");
//
//            Multipart multipart = new MimeMultipart();
//            multipart.addBodyPart(messageBodyPart);
//            messageBodyPart = new MimeBodyPart();
//            msg.setText(file1, StandardCharsets.UTF_8.name());
//            msg.setContent(multipart);
//            Transport.send(msg);
//            System.out.println("EMail Sent Successfully with attachment!!");
//            casecount = 0;
//            TCpasscount = 0;
//            TCfailcount = 0;
//        } catch (MessagingException e) {
//            System.out.println(e.getMessage());
//        } catch (UnsupportedEncodingException e) {
//            e.printStackTrace();
//            System.out.println(e.getMessage());
//        }
//    }
    public static Boolean StaleElementClick(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        int attempts = 0;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        WebElement locator = Getlocator(driver, arguments[1].trim());
        while (attempts < 10) {
            try {
                locator = Getlocator(driver, arguments[1].trim());
                if (locator != null) {
                    locator.click();
                    Status = true;
                    break;
                }
            } catch (StaleElementReferenceException e) {
                if (e.getMessage().contains("element is not attached")) {
                    Status = false;
                }
                attempts++;
            }
        }
        if (arguments[2].contains(",")) {
            arguments[2].replace(",", "");
        }
        if (arguments[2].contains("'")) {
            arguments[2].replace("'", "");
        }

        if (Status) {
            //ReportFunctions.LogRepoter("Pass", "StaleElementClick", "Sucessfully clicked on" + arguments[2]);
        } else {
            ReportFunctions.LogRepoter("Fail", "StaleElementClick", "Failed to click on" + arguments[2]);
        }

        return Status;
    }

    public static boolean COMPAREVALUE(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        flag = 1;
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        String value = null;
        String ovalue = null;
        try {

            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0].trim();
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval).trim();
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0];
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);

                        } else {
                            //ReportFunctions.LogRepoter("Fail", "wait for the element", "key not found in hashmap");
                            return false;
                        }
                    }

                }
            }
            if (hmap.containsKey(arguments[1])) {
                ovalue = hmap.get(arguments[1]);
                float test = Float.valueOf(ovalue);
                ovalue = String.valueOf(test);
            }
            if (hmap.containsKey(arguments[2])) {
                value = hmap.get(arguments[2]);
            }

            if (value.equalsIgnoreCase("IS NOT NULL")) {
                int len = ovalue.length();
                if (len > 0) {
                    //ReportFunctions.LogRepoter("pass", "verify Value_Notnull","captured the value:  " + ovalue + " and its not null");

                } else {
                    //ReportFunctions.LogRepoter("Fail", "verify Value_Notnull", "captured value is null");
                    flag = 0;

                }
            } else {
                if (ovalue.equalsIgnoreCase(value)) {
                    System.out.println("Both values mathes");
                    //ReportFunctions.LogRepoter("pass", "verified  " + arguments[2] + "  value","Both values matches " + ovalue + " and " + value);

                } else {
                    System.out.println("Values did not match");
                    //ReportFunctions.LogRepoter("Fail", "verified  " + arguments[2] + "  value", "Both values did not match " + ovalue + " and " + value);

                    // CLOSEALLBROWSERS(driver);
                    flag = 0;
                }
            }
        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "verify both values", "unable to find the locator");
            // CLOSEALLBROWSERS(driver);
            flag = 0;
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean SwitchDefault(WebDriver WebDriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        driver.switchTo().defaultContent();
        //ReportFunctions.LogRepoter("Pass", "move to default content", "Successfully moved to default content");
        return true;
    }

    public static boolean ValidateFilter(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String Doness = "xpath:=//button[@id=\"done\" or @id=\"save\"]";
        RecoveryScenarios();
        WebElement Doness1 = Getlocator(driver, Doness);
        if (Doness1 != null) {
            Doness1.click();
            WAITTIME("WAITTIME->2");
            INVISIBLEOFLOAD(driver);
        }
        Boolean status = true;
        String[] args;
        String[] args1;
        int ubound;
        int ubound1;
        Boolean flag = false;
        String filter = "xpath:=//i[@id=\"prompts-button-bottom\"]";
        String Apply = "xpath:=//div[@id='prompts']//button[contains(text(),'Apply')]";
        String Reset = "xpath:=//div[@id='prompts']//button[@name='reset']";
        String Cdate = "xpath:=//td[text()=\"Start Date\"]";
        String Edate = "xpath:=//input[@class=\"promptDatePicker\"]";
        String search = "xpath:=//input[@id=\"prompt_search\"]";
        try {
            String[] arguments = splitfunction(parameters, "->");
            if (hmap.containsKey(arguments[2])) {
                arguments[2] = hmap.get(arguments[2]);
            }
            if (hmap.containsKey(arguments[3])) {
                arguments[3] = hmap.get(arguments[3]);
            }

            args = splitfunction(arguments[2], "&");
            args1 = splitfunction(arguments[3], "&");
            String allchoices = "xpath:=//input[@value=\"All Choices\"]";
            ubound = args.length;
            ubound1 = args1.length;
            WebElement Filters = Getlocator(driver, filter);
            if (Filters != null) {
                Filters.click();
                WAITFORELEMENT(driver, "waitforelement->xpath:=//div[@id='prompts']//button[@name='reset']->Reset");
                WebElement Resets = Getlocator(driver, Reset);
                if (Resets != null) {
                    WAITTIME("WAITTIME->2");
                    Resets.click();
                    WAITTIME("WAITTIME->2");
                    if (ubound == ubound1) {
                        for (int i = 0; i <= ubound - 1; i++) {
                            String xpath = "xpath:=//td[text()=\"" + args[i] + "\"]";
                            WebElement filtername = Getlocator(driver, xpath);
                            if (filtername != null) {
                                WAITTIME("WAITTIME->2");
                                filtername.click();
                                //Validate_Alphabetic_Order("FILTER->" + args[i]);
                                WAITTIME("WAITTIME->4");
                                WAITTIME("WAITTIME->7");
                                // Validate_Duplicates("VALIDATE_DUPLICATES->FILTER");
                                if (args1[i].toUpperCase().contains("SYSDATE")) {
                                } else {
                                    //WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@value=\"All Choices\"]->search");
                                }
                                // ReportFunctions.LogRepoter("Pass", "Click on filter name", "Successfully clicked on filter name " + args[i]);
                                WebElement Searchs = Getlocator(driver, "xpath:=//input[@id=\"prompt_search\"]");
                                WebElement allchoice = Getlocator(driver, allchoices);
                                if (args1[i].toUpperCase().contains("SYSDATE")) {
                                    WebElement datepicker = Getlocator(driver, "xpath:=//input[@class=\"promptDatePicker\"]");
                                    WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"promptDatePicker\"]->datepicker");
                                    String sysdat = Sysdate(args1[i]);
                                    datepicker.clear();
                                    WAITTIME("WAITTIME->2");
                                    datepicker.sendKeys(sysdat);
                                    WAITTIME("WAITTIME->2");
                                    SENDKEYS(driver, "SENDKEYS->TAB");
                                } else {

                                    WAITTIME("WAITTIME->2");
                                    WAITFORELEMENT(driver, "waitforelement->" + search + "->Searchbox");
// WAITFORELEMENT(driver, "waitforelement->" + allchoices + "->All choices");
                                    if (allchoice != null) {
                                        allchoice.click();
                                        WAITTIME("WAITTIME->4");
                                        allchoice.click();
                                        WebElement Filtervalue = Getlocator(driver, "xpath:=//div[contains(text(),'" + args1[i] + "')]");
//ReportFunctions.LogRepoter("Pass", "Click on All choices check box 2 times", "Successfully clicked on All choices check box 2 times");
                                        if (Searchs != null) {
                                            if (args1[i].contains("and")) {
                                                String[] mulargs = splitfunction(args1[i], "and");
                                                int len = mulargs.length;
                                                for (int k = 0; k <= len - 1; k++) {
                                                    Searchs.clear();
                                                    WAITTIME("WAITTIME->2");
                                                    Searchs.sendKeys(mulargs[k]);
                                                    WAITTIME("WAITTIME->5");
//ReportFunctions.LogRepoter("Pass", "enter value in search box", "Successfully entered value in search box " + mulargs[k]);
// WAITFORELEMENT(driver, "waitforelement->xpath:=//div[contains(text(),'" + mulargs[k] + "')]->" + mulargs[k] + "");
                                                    flag = StaleElementClick(driver, "StaleElementClick->xpath:=//div[@class='tool-items']//div[contains(text(),'" + mulargs[k] + "')]->" + mulargs[k] + "");
                                                    WAITTIME("WAITTIME->2");
                                                }
                                            } else {
                                                WAITTIME("WAITTIME->3");
                                                Searchs.sendKeys(args1[i]);
//ReportFunctions.LogRepoter("Pass", "enter value in search box", "Successfully entered value in search box " + args1[i]);
                                                WAITFORELEMENT(driver, "waitforelement->xpath:=//div[@class='tool-items']//div[contains(text(),'" + args1[i] + "')]->" + args1[i] + "");
                                                flag = StaleElementClick(driver, "StaleElementClick->xpath:=//div[@class='tool-items']//div[contains(text(),'" + args1[i] + "')]->" + args1[i] + "");
                                            }
                                            if (flag == true) {
//ReportFunctions.LogRepoter("Pass", "Select filter value", "Successfully selected filter value " + args1[i]);
                                                WAITTIME("WAITTIME->2");
                                            } else {
                                                ReportFunctions.LogRepoter("Fail", "Select filter value", " Verify the Filter:  Filter LOV unable to find filter value");
                                                status = false;
                                            }
                                        } else {
                                            ReportFunctions.LogRepoter("Fail", "Enter value in search Prompt", " Verify the Filter:  Filter LOV unable to find search text box");
                                            status = false;
                                        }

                                    } else {
                                        ReportFunctions.LogRepoter("Fail", "Click on All Choices", " Verify the Filter:  Filter LOV Unable to find All Choices check box");
                                        status = false;
                                    }
                                }
                            } else {
                                // ReportFunctions.LogRepoter("Fail", "Click on filter name", " Verify the Filter:  Filter LOV Unable to find filter name " + args[i]);
                                ReportFunctions.LogRepoter("Fail", "Click on filter name", " Verify the Filter:  Filter LOV Unable to find filter name ");
                                status = false;
                            }
                        }
                        WebElement goes = Getlocator(driver, Apply);
                        if (goes != null) {
                            goes.click();
                            INVISIBLEOFLOAD(driver);
                            WAITTIME("WAITTIME->2");
//ReportFunctions.LogRepoter("Pass", "Click on GO", "Successfully clicked on GO button");
                            WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"searchTableX\"]->Search");
                        } else {
                            ReportFunctions.LogRepoter("Fail", "Click on GO", "Verify the Filter:  Unable to find GO button");
                            status = false;
                        }

                    } else {
                        ReportFunctions.LogRepoter("Fail", "Select filers", "Verify the Filter: Filter names and values are not equal");
                        status = false;
                    }
                } else {
                    ReportFunctions.LogRepoter("Fail", "Click on Resut button", "Verify the Filter: unable to find Reset button");
                    status = false;
                }

            } else {
                ReportFunctions.LogRepoter("Fail", "Click on filter icon", "Verify the Filter: unable to find filter icon");
                status = false;
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "Verify the Filter", "unable to find the Filter name");
            status = false;
        }

        return status;
    }

    public static boolean Validatedate(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean status = true;
        String arguments[] = splitfunction(parameters, "->");
        String args1[] = splitfunction(arguments[3], ",");
        String format = args1[1];
        String d1 = Sysdate(arguments[3]);
        RecoveryScenarios();
        WebElement locator = Getlocator(driver, arguments[1]);
        if (locator != null) {
            String d2 = locator.getText();
            SimpleDateFormat formatter = new SimpleDateFormat(format);
            try {
                Date date1 = formatter.parse(d1);
                Date date2 = formatter.parse(d2);
                String x = formatter.format(date1);
                String y = formatter.format(date2);
                if (arguments[2].toUpperCase().equalsIgnoreCase("LESSER")) {
                    boolean a = (date2.before(date1) || date2.equals(date1));
                    if (a == true) {
                        //ReportFunctions.LogRepoter("pass", "veify dates after applying filters", "UI date is less than or equal to " + d1 + "and UI date is" + d2);
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "veify dates after applying filters", "UI date is not less than or equal to " + d1 + "and UI date is" + d2);
                        status = false;
                    }
                } else if (arguments[2].toUpperCase().equalsIgnoreCase("GREATER")) {
                    boolean b = (date2.after(date1) || date2.equals(date1));
                    if (b == true) {
                        //ReportFunctions.LogRepoter("pass", "veify dates after applying filters", "UI date is greater than or equal to " + d1 + "and UI date is" + d2);
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "veify dates after applying filters", "UI date is not greater than or equal to " + d1 + "and UI date is" + d2);
                        status = false;
                    }
                } else {
                    //ReportFunctions.LogRepoter("Fail", "veify dates after applying filters", "Please specify lesser or greater");
                    status = false;
                }
            } catch (Exception e) {
                //ReportFunctions.LogRepoter("Fail", "veify dates after applying filters", "different date format:: date is not in " + format + "\"   format");
                status = false;
            }
        } else {
            //ReportFunctions.LogRepoter("Fail", "Get date from UI", "unable to find date xpath");
            status = false;
        }
        return status;
    }

    public static boolean ValidatePrompt(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String Reset = "xpath:=//button[@name=\"reset\"]";
        ElementVisible(Reset);
        ElementClickable("//button[@name=\"reset\"]");
        WebElement Resets = Getlocator(driver, Reset);
        int index = 1;
        Boolean flag = null;
        if (Resets != null) {
            //  Resets.click();
        }
        String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']";
        String Apply1 = "xpath:=//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
        WebElement Applies = Getlocator(driver, Apply);
        WebElement Applies1 = Getlocator(driver, Apply1);
        if (Applies != null) {
            // Applies.click();
            INVISIBLEOFLOAD(driver);
        } else if (Applies1 != null) {
            Applies1.click();
        }
        String more = "xpath:=//div[@style=\"float: right; display: block;\"]";
        ElementClickable("//div[@style=\"float: right; display: block;\"]");
        WebElement morebutton = Getlocator(driver, more);
        if (morebutton != null) {
            morebutton.click();
            ElementVisible("//div[@style=\"float: right; display: block;\"]");
            ElementClickable("//div[@style=\"float: right; display: block;\"]");
            INVISIBLEOFLOAD(driver);
        }
        Boolean status = true;
        int ubound;
        int ubound1;
        String[] arguments = splitfunction(parameters, "->");

        if (hmap.containsKey(arguments[2])) {
            arguments[2] = hmap.get(arguments[2]);
        }
        if (arguments[3].contains(",")) {
            String[] indx = splitfunction(arguments[3], ",");
            arguments[3] = indx[0];
            index = Integer.parseInt(indx[1]);
        }
        if (hmap.containsKey(arguments[3])) {
            arguments[3] = hmap.get(arguments[3]);
        }
        String[] args = splitfunction(arguments[2], "&");
        String allchoices = "xpath:=//input[@value=\"Select All\" or @value =\"All Choices\" ]";
        ubound = args.length;
        String[] args1 = splitfunction(arguments[3], "&");
        ubound1 = args1.length;
        Reset = "xpath:=//button[@name=\"reset\"]";
        //String Reset = "xpath:=//i[@title=\"Reset\"]";
        String search = "xpath:=//input[@id=\"prompt_search\"]";
        //String Apply = "xpath:=//button[contains(text(),'Reset')]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
        // String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']";
        String Done = "xpath:=//button[@id=\"done\" or @id=\"save\"]";
        try {
            Resets = Getlocator(driver, Reset);
            if (Resets != null) {
                //Resets.click();
                if (ubound == ubound1) {
                    for (int i = 0; i <= ubound - 1; i++) {
                        if (hmap.containsKey(args[i])) {
                            args[i] = hmap.get(args[i]);
                        }
                        WebElement Promtnames;
                        String Promtname = "xpath:=//input[@placeholder=\"" + args[i] + "\"]/following-sibling::label";
                        String Promtname1 = "xpath:=//input[@placeholder=\"" + args[i] + "\"]/following-sibling::img";
                        ElementClickable("//input[@placeholder=\"" + args[i] + "\"]/following-sibling::label");
                        WebElement Promt1 = Getlocator(driver, Promtname);
                        WebElement Promt2 = Getlocator(driver, Promtname1);
                        if (Promt1 != null) {
                            Promtnames = Promt1;
                        } else {
                            Promtnames = Promt2;
                        }
                        if (Promtnames != null) {
                            WAITTIME("WAITTIME->2");
                            INVISIBLEOFLOAD(driver);
                            Promtnames.click();
                            // WAITTIME("WAITTIME->8");
                            if (args[i].equalsIgnoreCase("Customer Name")) {
                            } else {
                                //Validate_Alphabetic_Order("PROMPT->" + args[i]);
                            }

                            ElementClickable("//input[@value=\"Select All\" or @value =\"All Choices\"]");
                            WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Search");
                            WebElement allchoice = Getlocator(driver, allchoices);
                            if (allchoice != null) {
                                WAITTIME("WAITTIME->2");
                                allchoice = Getlocator(driver, allchoices);
                                StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                // clickElementUsingJavascriptExecutor("//input[@value=\"Select All\"]");
                                WAITTIME("WAITTIME->2");
                                flag = ISSELECTED(driver, "ISSELECTED->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                if (flag == false) {
                                    StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                    //allchoice.click();  
                                }
                                StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                // clickElementUsingJavascriptExecutor("//input[@value=\"Select All\"]");
                                flag = ISSELECTED(driver, "ISSELECTED->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                if (flag == true) {
                                    StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                    // clickElementUsingJavascriptExecutor("//input[@value=\"Select All\"]");   
                                }
                                flag = ISSELECTED(driver, "ISSELECTED->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                if (flag == true) {
                                    StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                                    // allchoice.click();  
                                }

                            }
                            WAITTIME("WAITTIME->4");
                            WebElement searchs = Getlocator(driver, search);
// if (searchs != null) {
                            if (args1[i].contains("and")) {
                                String[] mulargs = splitfunction(args1[i], "and");
                                int len = mulargs.length;
                                for (int k = 0; k <= len - 1; k++) {
                                    if (hmap.containsKey(mulargs[k])) {
                                        mulargs[k] = hmap.get(mulargs[k]);
                                    }
                                    searchs.clear();
                                    searchs.sendKeys(mulargs[k]);
                                    WAITTIME("WAITTIME->4");
//ReportFunctions.LogRepoter("Pass", "enter value in search box", "Successfully entered value in search box " + mulargs[k]);
                                    String Promptvalue = "xpath:=(//input[contains(@value,\"" + mulargs[k] + "\")])[\"" + index + "\"]";
                                    ElementClickable(Promptvalue);
                                    WebElement Promptvalues = Getlocator(driver, Promptvalue);
                                    if (Promptvalues != null) {
                                        Promptvalues.click();
//ReportFunctions.LogRepoter("Pass", "Select Prompt value", "Sucessfully selected prompt value " + mulargs[k]);
                                        WAITTIME("WAITTIME->2");

                                    } else {
                                        if (mulargs[k].contains("'")) {
                                            mulargs[k].replace("'", "");
                                        }
                                        ReportFunctions.LogRepoter("Fail", "Select Prompt value", "Verify the Prompt: Unable to find prompt value " + mulargs[k]);
                                        status = false;
                                    }
                                }
                                WebElement Dones = Getlocator(driver, Done);
                                if (Dones != null) {
                                    Dones.click();
//ReportFunctions.LogRepoter("Pass", "Click on Done", "Sucessfully clicked on Done");
                                    WAITTIME("WAITTIME->2");
                                    INVISIBLEOFLOAD(driver);
                                } else {
                                    ReportFunctions.LogRepoter("Fail", "Click on Done", "Verify the Prompt: Unable to find Done Button");
                                }
                            } else {
                                if (hmap.containsKey(args1[i])) {
                                    args1[i] = hmap.get(args1[i]);
                                }
                                //WAITTIME("WAITTIME->2");
                                searchs.sendKeys(args1[i]);
                                if (args1[i] != null) {
//ReportFunctions.LogRepoter("Pass", "Enter Prompt value in search feild", "Sucessfully entered value in Search Feild " + args1[i]);
                                    WAITTIME("WAITTIME->2");
                                    String Promptvalue = "xpath:=(//input[contains(@value,\"" + args1[i] + "\")])[" + index + "]";
                                    String pvalue[] = splitfunction(Promptvalue, "=");
                                    WebElement Promptvalues = Getlocator(driver, Promptvalue);
                                    if (Promptvalues != null) {
                                        WAITTIME("WAITTIME->4");
                                        // clickElementUsingJavascriptExecutor(pvalue[1]);

                                        try {
                                            Promptvalues.click();
                                        } catch (Exception e) {
                                            StaleElementClick(driver, "StaleElementClick->xpath:=(//input[contains(@value,\"" + args1[i] + "\")])[" + index + "]->" + args1[i]);
                                        }
//ReportFunctions.LogRepoter("Pass", "Select Prompt value", "Sucessfully selected prompt value " + args1[i]);
                                        WAITTIME("WAITTIME->2");
                                        WebElement Dones = Getlocator(driver, Done);
                                        if (Dones != null) {
                                            Dones.click();
//ReportFunctions.LogRepoter("Pass", "Click on Done", "Sucessfully clicked on Done");
                                            WAITTIME("WAITTIME->3");
                                            INVISIBLEOFLOAD(driver);
                                        } else {
                                            ReportFunctions.LogRepoter("Fail", "Click on Done", "Verify the Prompt: Unable to find the Done button");
                                        }
                                    }
                                } else {
                                    if (args1[i].contains("\'")) {
                                        args1[i] = args1[i].replace("\'", "");
                                    }
// ReportFunctions.LogRepoter("Fail", "Select Prompt value", "Verify the Prompt:Unable to find prompt value " + args1[i]);
                                    ReportFunctions.LogRepoter("Fail", "Select Prompt value", "Verify the Prompt:Unable to find prompt value ");
                                    status = false;
                                }
                            }
// } else {
// ReportFunctions.LogRepoter("Fail", "Enter value in Serach", "Unable to find Search feild");
// status = false;
// }
                        } else {
//ReportFunctions.LogRepoter("Fail", "Click on Promt name", "Verify the Prompt:Unable to find Prompt name " + args[i]);
                            ReportFunctions.LogRepoter("Fail", "Click on Promt name", "Verify the Prompt:Unable to find Prompt name ");
                            status = false;
                        }
                    }
                    Applies = Getlocator(driver, Apply);
                    if (Applies != null) {
                        Applies.click();
//ReportFunctions.LogRepoter("Pass", "Click on Apply", "Sucessfully clicked on Apply");
                        WAITTIME("WAITTIME->3");
                        INVISIBLEOFLOAD(driver);
                    } else if (Applies1 != null) {
                        //  Applies1.click();
                        clickElementUsingJavascriptExecutor("//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]");
                    } else {
                        ReportFunctions.LogRepoter("Fail", "Click on Apply", "Verify the Prompt: unable to find Apply button");
                    }
                } else {
                    ReportFunctions.LogRepoter("Fail", "validate Prompts", "Verify the Prompt:Prompt names and values are not equal");
                    status = false;
                }

            } else {
                ReportFunctions.LogRepoter("Fail", "Click on Resut button", "Verify the Prompt:unable to find Reset button");
                status = false;
            }

        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            ReportFunctions.LogRepoter("Fail", "validate Prompt LOV", "validate Prompt LOV failed for " + arguments[2]);
            status = false;
        }

        return status;
    }

    public static Boolean Angularjs_Selectdropdown(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        INVISIBLEOFLOAD(driver);
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        int j = 0;
        Boolean Status = false;
        String[] arguments = splitfunction(parameters, "->");
        String value;
        // String[] arg;	
        String xpath1;
        String xpath2;
        String xpath3;
        String xpath4;
        try {
            String Reset = "xpath:=//label[contains(text(),\"" + arguments[1] + "\")]/following-sibling::span//button[contains(text(),\"Reset\")]";
            WAITTIME("WAITTIME->1");
            WebElement Resets = Getlocator(driver, Reset);
            if (hmap.containsKey(arguments[2])) {
                arguments[2] = hmap.get(arguments[2]);
            }
            String label = arguments[2];
            String label1 = label.toUpperCase();
            String entry = "Select All";
            String entry1 = entry.toUpperCase();
            xpath1 = "xpath:=//label[contains(text(),\"" + arguments[1] + "\")]/following-sibling::span/button";
            xpath2 = "xpath:=(//label[contains(text(),\"" + arguments[1] + "\")]/following-sibling::span//div)//input[@placeholder=\"Search...\"]";
            xpath3 = "xpath:=//label[contains(text(),\"" + arguments[1] + "\")]/following-sibling::span//button[contains(text(),\"Select All\")]";
            // xpath4 = "xpath:=(//strong[.=\"All Reports\"]/following::span[contains(text(),\"" + arguments[2] + "\")])[1]";	
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1]);
            WebElement Locator1 = Getlocator(driver, xpath1);
            if (Locator1 != null) {
                Locator1.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->2");
                if (Resets != null) {
                    Resets.click();
                }
            }
            if (arguments[2].contains("&")) {
                String arg[] = splitfunction(arguments[2], "&");
                for (int i = 0; i < arg.length; i++) {
                    for (j = 0; j < i; j++) {
                        arg[j] = arg[i];
                    }
                    WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + arguments[1]);
                    WebElement search1 = Getlocator(driver, xpath2);
                    search1.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->1");
                    search1.clear();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->1");
                    value = arg[j];
                    search1.sendKeys(value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->1");
                    xpath4 = "xpath:=(//input[@class=\"checkbox focusable\"]/following-sibling::span[contains(text(),\"" + value + "\")])[1]";
                    //   WAITFORELEMENT(driver, "waitforelement->" + xpath4 + "->" + value + "");	
                    WebElement select1 = Getlocator(driver, xpath4);
                    INVISIBLEOFLOAD(driver);
                    select1.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->1");
                }
            } else if (label1.equalsIgnoreCase(entry1)) {
                WebElement selectall = Getlocator(driver, xpath3);
                selectall.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->2");
                Status = true;
            } else {
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + arguments[1]);
                WebElement search1 = Getlocator(driver, xpath2);
                search1.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                search1.clear();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                value = arguments[2];
                search1.sendKeys(value);
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                xpath4 = "xpath:=(//input[@class=\"checkbox focusable\"]/following-sibling::span[contains(text(),\"" + value + "\")])[1]";
                WAITFORELEMENT(driver, "waitforelement->" + xpath4 + "->" + arguments[2]);
                WebElement select1 = Getlocator(driver, xpath4);
                INVISIBLEOFLOAD(driver);
                select1.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                Status = true;
            }
            Locator1.click();
            INVISIBLEOFLOAD(driver);
            WAITTIME("WAITTIME->2");
            Status = true;
        } catch (Exception e) {
            //  CLOSEALLBROWSERS(driver);	
            Status = false;
        }
        return Status;
    }

    public static Boolean verifydashboard(WebDriver WebDriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        Boolean newstatus = true;
        int temp1 = 0;
        int sanitycntname = 1;
        RecoveryScenarios();
        String[] arguments = splitfunction(Parameters, "->");
        String xpath = "xpath:=(//div[text()=\"" + arguments[1].trim() + "\"])[2]";
        String xpath1 = "xpath:=//b[text()=\"No Data Available\"]";
        WebElement message = Getlocator(driver, xpath1);
        WebElement dashboard = Getlocator(driver, xpath);
        try {

            if (message != null) {
                //ReportFunctions.LogRepoter("Fail", "verify NO DATA AVAILABLE message",  ""+arguments[1]+": Launch:  Dashboard launched successfully, but could not see the data in it, \"No Data Available\" found");
                Status = false;
                // CLOSEALLBROWSERS(driver);
            } else if (dashboard == null) {
                //ReportFunctions.LogRepoter("Fail", "verify dash board name", ""+arguments[1]+": Launch: unable to find dash board name  " + arguments[1]);
                Status = false;
                // CLOSEALLBROWSERS(driver);
            } else {
                //ReportFunctions.LogRepoter("Pass", "verify dash board", ""+arguments[1]+": Launch: Dashboard launched successfully and could see the data in it");
            }

            String TCname = hmap.get(Tcase);

            if ((sanitycntname == 1) && (TCname != sanitymap.get(temp1))) {
                sanitymap.put(temp1, TCname);
                int x = TChmap.get(TCname);
                if (Status) {
                    sanitydash = 999 + x;
                    sanitymap.put(sanitydash, "Pass");
                } else {
                    sanitydash = 999 + x;
                    sanitymap.put(sanitydash, "Fail");
                }
                sanitycntname = sanitycntname + 1;
                tempnum = sanitydash;
                newstatus = Status;
            } else {
                if ((sanitymap.get(temp1).equalsIgnoreCase(TCname)) && (newstatus != Status)) {
                    sanitymap.put(tempnum, "Fail");
                }
            }

        } catch (Exception e) {
            //out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "Verify dashBoard", "exception" + e);
            Status = false;
        }

        return Status;

    }

    public static Boolean ExportExcel(WebDriver WebDriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        Boolean flag = true;
        String tcasename = null;
        Boolean excelverification = true;
        Boolean mfiltval = false;
        Boolean finalflag = true;
        Boolean colnam = false;
        String[] myFiles = null;
        File myFile = null;
        File Sfolder;
        File[] listofsfiles;
        String fname;
        String colname = null;
        String cellvalue = null;
        int colnum = 0;
        int count = 0;
        int bound1 = 0;
        int bound2 = 0;
        RecoveryScenarios();
        String[] arguments = splitfunction(Parameters, "->");
        String[] argexcel = splitfunction(arguments[1], ",");
        String Vnames = argexcel[0];
        switch (Vnames.toUpperCase()) {
            case "VALIDATEPROMPTTEXT":
                argexcel[0] = "PROMPT TEXT";
                break;
            case "VALIDATETEXTFILTER":
                argexcel[0] = "Filter TEXT";
                break;
            case "VALIDATEPROMPT":
                argexcel[0] = "PROMPT LOV";
                break;
            case "VALIDATEFILTER":
                argexcel[0] = "Filter LOV";
                break;
            case "VALIDATEDATETYPE":
                argexcel[0] = "Date";
                break;
            default:
                break;
        }
        if (hmap.containsKey(arguments[2])) {
            arguments[2] = hmap.get(arguments[2]);
        }
        if (hmap.containsKey(arguments[3])) {
            arguments[3] = hmap.get(arguments[3]);
        }
        try {

            String xpath = "xpath:=//img[@title=\"Export to Excel\"]";
            String username = System.getProperty("user.name");
            String filepath = "C:/Users/" + username + "/Downloads";
            Sheet exportsheet;
            int envrowcount;
            int envcolcount;
            WAITFORELEMENT(driver, "waitforelement->xpath:=//img[@title='Export to Excel']->Export to excel");
            WebElement excellink = Getlocator(driver, xpath);
            Sfolder = new File(filepath);
            listofsfiles = Sfolder.listFiles();
            if (Sfolder.isDirectory()) {
                try {
                    myFiles = Sfolder.list();
                    for (int k = 0; k < myFiles.length; k++) {
                        myFile = new File(Sfolder, myFiles[k]);
                        myFile.delete();
                    }
                } catch (Exception e) {
                    System.out.println("ExportExcel()......file not found exception");
                }
            }
            String nodata = "xpath:=//td[contains(text(),\"We could not find any details\")]";
            String Resetxpath = "xpath:=//button[@name=\"reset\"]";
            WebElement ndata = Getlocator(driver, nodata);
            WebElement reset = Getlocator(driver, Resetxpath);
            if (ndata != null) {
                reset.click();
                INVISIBLEOFLOAD(driver);
            }
            if (excellink != null) {
                excellink.click();
                WAITTIME("WAITTIME->5");
                Sfolder = new File(filepath);
                listofsfiles = Sfolder.listFiles();
                myFiles = Sfolder.list();
                // if (myFiles.length == 1) {
                // //ReportFunctions.LogRepoter("Pass", "Download excel", "Excel downloaded successfully");
                myFile = new File(Sfolder, myFiles[0]);
                fname = myFile.getName();
                filepath = filepath + "/" + fname;
                FileInputStream envfs = new FileInputStream(filepath);
                ZipSecureFile.setMinInflateRatio(-1.0d);
                Workbook envwb = new XSSFWorkbook(envfs);
                exportsheet = envwb.getSheetAt(0);
                envrowcount = exportsheet.getLastRowNum();
                envcolcount = exportsheet.getRow(envrowcount).getLastCellNum();
                if (arguments[2].contains("&")) {
                    String[] args1 = splitfunction(arguments[2], "&");
                    bound1 = args1.length;
                    String[] args2 = splitfunction(arguments[3], "&");
                    bound2 = args2.length;
                    if (bound1 == bound2) {
                        for (int i = 0; i <= bound1 - 1; i++) {
                            colnam = false;
                            for (int colval = 0; colval <= envcolcount - 1; colval++) {
                                Row ro = exportsheet.getRow(0);
                                if ((ro != null)) {
                                    Cell cell1 = exportsheet.getRow(0).getCell(colval);
                                    colname = cell1.getStringCellValue();
                                    if (colname.equalsIgnoreCase(args1[i])) {
                                        colnum = colval;
                                        colnam = true;
                                        break;
                                    }
                                }
                            }
                            if (colnam == false) {
                                //   //ReportFunctions.LogRepoter("Fail", "Get Column Name", ""+argexcel[1]+" "  +argexcel[0]+" : Successfully applied values to the Filter and verified the output values, and Unable to find Column name  "  + args1[i]);
                                finalflag = false;
                                Status = false;
                            } else {
                                finalflag = true;
                                for (int Rowval = 1; Rowval <= envrowcount; Rowval++) {
                                    Row ro = exportsheet.getRow(Rowval);
                                    if ((ro != null)) {
                                        Cell cell1 = exportsheet.getRow(Rowval).getCell(colnum);
                                        cellvalue = cell1.getStringCellValue();
                                        if (args2[i].toUpperCase().contains("SYSDATE")) {
                                            String[] dates = splitfunction(args2[i], "and");
                                            String[] format = splitfunction(dates[0], ",");
                                            SimpleDateFormat formatter = new SimpleDateFormat(format[1]);
                                            String sysdat1 = Sysdate(dates[0]);
                                            Date date1 = formatter.parse(sysdat1);
                                            String sysdat2 = Sysdate(dates[1]);
                                            Date date2 = formatter.parse(sysdat2);
                                            cellvalue = cell1.getStringCellValue();
                                            Date odate = formatter.parse(cellvalue);
                                            boolean a = odate.before(date2) && odate.after(date1);
                                            boolean b = odate.equals(date2) || odate.equals(date1);
                                            if (a || b) {
                                            } else {
                                                // //ReportFunctions.LogRepoter("Fail", "Verify Date Range", "Date mismatched: date range =   " + sysdat1 + " and " + sysdat2 + "  actual date = " + cellvalue + "  found in row = " + Rowval);
                                                count = count + 1;
                                                flag = false;
                                                finalflag = false;
                                                Status = false;
                                            }
                                        } else if (args2[i].contains("and")) {
                                            String[] FilVals = splitfunction(args2[i], "and");
                                            int fbound = FilVals.length;
                                            for (int f = 0; f <= fbound - 1; f++) {
                                                if (cellvalue.equalsIgnoreCase(FilVals[f])) {
                                                    mfiltval = true;
                                                    break;
                                                }
                                            }
                                            if (mfiltval == false) {
                                                // //ReportFunctions.LogRepoter("Fail", "Verify value", "value mismatched: actual value =   " + cellvalue + "  and expected value = " + FilVals[0] + " or" + FilVals[1]);
                                                count = count + 1;
                                                finalflag = false;
                                                Status = false;
                                            }
                                        } else {
                                            if (cellvalue.equalsIgnoreCase(args2[i])) {
                                            } else {
                                                // //ReportFunctions.LogRepoter("Fail", "Verify value", "value mismatched: actual value =   " + cellvalue + "  and expected value = " + args2[i]);
                                                count = count + 1;
                                                flag = false;
                                                finalflag = false;
                                                Status = false;
                                            }
                                        }
                                    }
                                }
                            }
                            if (finalflag == true) {
                                // //ReportFunctions.LogRepoter("Pass", "Verify value", "All values matched for column name " + colname);
                            } else {
                                // //ReportFunctions.LogRepoter("Fail", "Values mismatched for column name ",""+argexcel[1]+" "  +argexcel[0]+" : Successfully applied values to the Filter and verified the output values, found not to be working: Toatal mismatched values:  " + count + " and column name:= " + colname);
                                Status = false;
                            }
                        }
                    } else {
                        //  //ReportFunctions.LogRepoter("Fail", "Veify column name and values", ""+argexcel[1]+" "  +argexcel[0]+" :Column names and values did not match");
                        Status = false;
                    }
                } else {
                    colnam = false;
                    for (int colval = 0; colval <= envcolcount - 1; colval++) {
                        Row ro = exportsheet.getRow(0);
                        if ((ro != null)) {
                            Cell cell1 = exportsheet.getRow(0).getCell(colval);
                            colname = cell1.getStringCellValue();
                            if (colname.equalsIgnoreCase(arguments[2])) {
                                colnum = colval;
                                colnam = true;
                                break;
                            }
                        }
                    }
                    if (colnam == false) {
                        // //ReportFunctions.LogRepoter("Fail", "Get Column Name", ""+argexcel[1]+" "  +argexcel[0]+" : Successfully applied values to the Filter and verified the output values, and Unable to find Column name  " + arguments[2]);
                        finalflag = false;
                        Status = false;
                    } else {
                        finalflag = true;
                        for (int Rowval = 1; Rowval <= envrowcount; Rowval++) {
                            mfiltval = false;
                            Row ro = exportsheet.getRow(Rowval);
                            if ((ro != null)) {
                                Cell cell1 = exportsheet.getRow(Rowval).getCell(colnum);
                                cellvalue = cell1.getStringCellValue();
                                if (arguments[3].toUpperCase().contains("SYSDATE")) {
                                    String[] dates = splitfunction(arguments[3], "and");
                                    String[] format = splitfunction(dates[0], ",");
                                    SimpleDateFormat formatter = new SimpleDateFormat(format[1]);
                                    String sysdat1 = Sysdate(dates[0]);
                                    Date date1 = formatter.parse(sysdat1);
                                    String sysdat2 = Sysdate(dates[1]);
                                    Date date2 = formatter.parse(sysdat2);
                                    cellvalue = cell1.getStringCellValue();
                                    Date odate = formatter.parse(cellvalue);
                                    boolean a = odate.before(date2) && odate.after(date1);
                                    boolean b = odate.equals(date2) || odate.equals(date1);
                                    if (a || b) {
                                    } else {
                                        // //ReportFunctions.LogRepoter("Fail", "Verify Date Range", "Date mismatched: date range =   " + sysdat1 + " and " + sysdat2 + "  actual date = " + cellvalue + "  found in row = " + Rowval);
                                        count = count + 1;
                                        flag = false;
                                        finalflag = false;
                                    }
                                } else {
                                    if (arguments[3].contains("and")) {
                                        String[] FilVals = splitfunction(arguments[3], "and");
                                        int fbound = FilVals.length;
                                        for (int f = 0; f <= fbound - 1; f++) {
                                            if (cellvalue.equalsIgnoreCase(FilVals[f])) {
                                                mfiltval = true;
                                                break;
                                            }
                                        }
                                        if (mfiltval == false) {
                                            //  //ReportFunctions.LogRepoter("Fail", "Verify value", "value mismatched: actual value =   " + cellvalue + "  and expected value = " + FilVals[0] + " or" + FilVals[1]);
                                            count = count + 1;
                                            finalflag = false;
                                        }

                                    } else if (cellvalue.equalsIgnoreCase(arguments[3])) {
                                    } else {
                                        // //ReportFunctions.LogRepoter("Fail", "Verify value", "value mismatched: actual value =   " + cellvalue + "  and expected value = " + arguments[3]);
                                        count = count + 1;
                                        flag = false;
                                        finalflag = false;
                                    }
                                }
                            }
                        }
                        if (finalflag == true) {
                            // //ReportFunctions.LogRepoter("Pass", "Verify value", "All values matched for column name " + colname);
                        } else {
                            // //ReportFunctions.LogRepoter("fail", "Values mismatched for column name ", ""+argexcel[1]+" "  +argexcel[0]+" : Successfully applied values to the Filter and verified the output values, found not to be working: Toatal mismatched values:  " + count + " and column name:= " + colname);
                            Status = false;
                        }
                    }
                }
//                } else {
//                    //ReportFunctions.LogRepoter("Fail", "Download excel", ""+argexcel[1]+"  Excel :Failed to download excel");
//                    Status = false;
//                }
            } else {
                //  //ReportFunctions.LogRepoter("Fail", "Click Excel Export link", ""+argexcel[1]+" "  +argexcel[0]+" : Successfully applied values to the Filter and verified the output values, and no records found for column "+arguments[2]);
                Status = false;
            }
            if (Status == true) {
                myFile.delete();
            }
            Vnames = argexcel[0];
            switch (Vnames.toUpperCase()) {
                case "VALIDATEPROMPTTEXT":
                    argexcel[0] = "PROMPT TEXT";
                    break;
                case "VALIDATETEXTFILTER":
                    argexcel[0] = "Filter TEXT";
                    break;
                case "VALIDATEPROMPT":
                    argexcel[0] = "PROMPT LOV";
                    break;
                case "VALIDATEFILTER":
                    argexcel[0] = "Filter LOV";
                    break;
                case "VALIDATEDATETYPE":
                    argexcel[0] = "Date";
                    break;
                default:
                    break;
            }

            String Vname = argexcel[0];
            switch (Vname.toUpperCase()) {
                case "PROMPT TEXT":

                    if (Status) {
                        //ReportFunctions.LogRepoter("Pass", "VALIDATEPROMPTTEXT", ""+argexcel[1]+":  Prompt Text : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified the output values, found to be working");
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "VALIDATEPROMPTTEXT", ""+argexcel[1]+":  Prompt Text : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and  verified the output values, found not to be working");
                    }
                    break;
                case "FILTER TEXT":

                    if (Status) {
                        //ReportFunctions.LogRepoter("Pass", "VALIDATETEXTFILTER", ""+argexcel[1]+":  Filter Text : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified the output values, found to be working");
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "VALIDATETEXTFILTER", ""+argexcel[1]+":  Filter Text : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified the output values, found not to be working");
                    }
                    break;
                case "PROMPT LOV":
                    if (Status) {
                        //ReportFunctions.LogRepoter("Pass", "VALIDATEPROMPT", ""+argexcel[1]+":  Prompt LOV : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified the output values, found to be working");
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "VALIDATEPROMPT", ""+argexcel[1]+":  Prompt LOV : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified the output values, found not to be working");
                    }
                    break;
                case "FILTER LOV":
                    if (Status) {
                        //ReportFunctions.LogRepoter("Pass", "VALIDATEFILTER", ""+argexcel[1]+":  Filter LOV : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified the output values, found to be working");
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "VALIDATEFILTER", ""+argexcel[1]+":  Filter LOV : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified  the output values, found not  to be working");
                    }
                    break;
                case "DATE":
                    if (Status) {
                        //ReportFunctions.LogRepoter("Pass", "VALIDATEDATETYPE", ""+argexcel[1]+":  Date : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified  the output values, found to be working");
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "VALIDATEDATETYPE", ""+argexcel[1]+": Date : Successfully applied values ("+arguments[3] +"} to the prompts ("+arguments[2] +"} and verified  the output values, found not to be working");
                    }
                    break;
                default:
                    break;
            }
        } catch (Exception e) {
            //out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "verify records", "exception" + e);
            Status = false;
        }

        return Status;
    }

    public static Boolean Storesinglevalue(String Parameters) throws Exception {
        Boolean Status = true;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            hmap.put(arguments[1], arguments[2]);
            // //ReportFunctions.LogRepoter("Pass", "Storevalue", "Successfully stored the value " + arguments[2] + " in " + " " + arguments[1]);
        } catch (Exception e) {
            System.out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "excel verification", "exception" + e);
            Status = false;
        }
        return Status;
    }

    public static boolean VerifyNew(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String Doness = "xpath:=//button[@id=\"done\" or @id=\"save\"]";
        WebElement Doness1 = Getlocator(driver, Doness);
        if (Doness1 != null) {
            Doness1.click();
            WAITTIME("WAITTIME->2");
            INVISIBLEOFLOAD(driver);

        }
        Boolean Status = false;
        Boolean newstatus = true;
        Boolean flag = false;
        String[] arguments = splitfunction(parameters, "->");
        int arglen = arguments.length;
        if (arglen > 2) {
            flag = true;
        }
        String news = "New" + " " + arguments[1].trim();
        String adds = "Add" + " " + arguments[1].trim();
        String button1 = "xpath:=//i[@title=\"" + news + "\"]";
        String button2 = "xpath:=//i[@title=\"" + arguments[1].trim() + "\"]";
        String button3 = "xpath:=//i[contains(@title, 'New')]";
        String button4 = "xpath:=//i[@title=\"" + adds + "\"]";

        WebElement newbutton = null;
        WebElement newbutton1 = Getlocator(driver, button1);
        WebElement newbutton2 = Getlocator(driver, button2);
        WebElement newbutton3 = Getlocator(driver, button3);
        WebElement newbutton4 = Getlocator(driver, button4);

        if (newbutton1 != null) {
            newbutton = newbutton1;
        } else if (newbutton2 != null) {
            newbutton = newbutton2;
        } else if (newbutton3 != null) {
            newbutton = newbutton3;
        } else if (newbutton4 != null) {
            newbutton = newbutton4;
        } else {
            ReportFunctions.LogRepoter("Fail", "Verify new", "unable to find New");
        }

        String xx = "Verify the New Action: Add & Cancel actions found to be working successfully on " + arguments[1] + " Page";
        String y = "Verify the New Action:  Clicking of Add is failed because unable to navigate to  " + arguments[1] + " Page";
        String z = "Verify the New Action: Clicking of Add is failed because unable to find new button";
        try {
            if (newbutton != null) {
                newbutton.click();
                // ReportFunctions.LogRepoter("Pass", "Click on New", "Clicked on new Button");
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->5");
                if (flag == true) {
                    Verify_Sequence(driver, arguments[2]);
                }
                WebElement cancel = Getlocator(driver, "xpath:=//button[contains(@id,'cancel')]");
                WebElement cancel2 = Getlocator(driver, "xpath:=(//button[@aria-label=\\\"Close\\\"])[4]");
                if (cancel != null) {
                    cancel.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->3");
                    WebElement popup = Getlocator(driver, "xpath:=//input[@id=\"popup_ok\"]");
                    if (popup != null) {
                        popup.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("WAITTIME->3");
                    }
                    ReportFunctions.LogRepoter("Pass", "Verify New", xx);
                    Status = true;
                } else if (cancel2 != null) {
                    cancel2.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->3");
                    WebElement popup = Getlocator(driver, "xpath:=//input[@id=\"popup_ok\"]");
                    if (popup != null) {
                        popup.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("WAITTIME->3");
                    }
                    ReportFunctions.LogRepoter("Pass", "Verify New", xx);
                    Status = true;

                } else {
                    ReportFunctions.LogRepoter("Fail", "Verify New", y);
                    Status = false;
                }
            } else {
                ReportFunctions.LogRepoter("Fail", "Verify New", z);
            }

        } catch (Exception e) {
            System.out.println("exception" + e);
            ReportFunctions.LogRepoter("Fail", "Verify new", "Verify new failed for dashboard " + arguments[1]);
            Status = false;
        }
        return Status;

    }

    public static boolean VerifySavedFilters(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean newstatus = true;
        int temp4 = 30;
        int sanitycntname = 1;
        boolean status = true;
        RecoveryScenarios();
        String filter = "xpath:=//img[@id=\"prompts-button-bottom\"]";
        String Cdate = "xpath:=//td[text()=\"Transaction Start Date\"]";
        String Edate = "xpath:=//input[@class=\"promptDatePicker\"]";
        String search = "xpath:=//input[@id=\"prompt_search\"]";
        try {
            String[] arguments = splitfunction(parameters, "->");
            String[] args = splitfunction(arguments[2], "&");
            String[] args1 = splitfunction(arguments[3], "&");
            String allchoices = "xpath:=//input[@value=\"All Choices\"]";
            int ubound = args.length;
            int ubound1 = args1.length;
            WebElement Filters = Getlocator(driver, filter);
            if (Filters != null) {
                Filters.click();
                if (ubound == ubound1) {
                    for (int i = 0; i <= ubound - 1; i++) {
                        String xpath = "xpath:=//td[text()=\"" + args[i] + "\"]";
                        WebElement filtername = Getlocator(driver, xpath);
                        if (filtername != null) {
                            WAITTIME("WAITTIME->2");
                            filtername.click();
                            WAITTIME("WAITTIME->2");
                            WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@value=\"All Choices\"]->search");
                            // //ReportFunctions.LogRepoter("Pass", "Click on filter name", "Successfully clicked on filter name  " + args[i]);
                            WebElement Searchs = Getlocator(driver, "xpath:=//input[@id=\"prompt_search\"]");
                            WebElement allchoice = Getlocator(driver, allchoices);
                            WebElement Filtervalue = Getlocator(driver, "xpath:=//div[contains(text(),'" + args1[i] + "')]");
                            if (args1[i].toUpperCase().contains("SYSDATE")) {
                                WebElement datepicker = Getlocator(driver, "xpath:=//input[@class=\"promptDatePicker\"]");
                                WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"promptDatePicker\"]->datepicker");
                                String sysdat = Sysdate(args1[i]);
                                datepicker.clear();
                                WAITTIME("WAITTIME->2");
                                datepicker.sendKeys(sysdat);
                            } else {
                                WAITTIME("WAITTIME->2");
                                WAITFORELEMENT(driver, "waitforelement->" + search + "->Searchbox");
                                WAITFORELEMENT(driver, "waitforelement->" + allchoices + "->All choices");
                                // if (allchoice != null) {
                                // allchoice.click();
                                //allchoice.click();
                                // //ReportFunctions.LogRepoter("Pass", "Click on All choices check box 2 times", "Successfully clicked on All choices check box 2 times");
                                if (Searchs != null) {
                                    Searchs.sendKeys(args1[i]);
                                    //  //ReportFunctions.LogRepoter("Pass", "enter value in search box", "Successfully entered value in search box   " + args1[i]);
                                    Boolean flag = WAITFORELEMENT(driver, "WAITFORELEMENT->xpath:=//input[@type=\"checkbox\"and@checked=\"checked\"and @value=\"" + args1[i] + "::``::" + args1[i] + "\"]->" + args1[i]);
                                    if (flag == true) {
                                        //ReportFunctions.LogRepoter("Pass", "Verify saved filter", ""+arguments[1]+" :Saved Filter: Successfully able to see the saved values in the filter  " + args1[i]);
                                        WAITTIME("WAITTIME->2");
                                    } else {
                                        //ReportFunctions.LogRepoter("Fail", "Verify saved filter", ""+arguments[1]+" :Saved Filter: Unable to save the values to the filter  " + args1[i]);
                                        status = false;
                                    }
                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "Enter value in search Prompt",""+arguments[1]+" :Saved Filter: unable to find search text box");
                                    status = false;
                                }

//                                } else {
//                                    //ReportFunctions.LogRepoter("Fail", "Click on All Choices", "Unable to find All Choices check box");
//                                    status = false;
//                                }
                            }
                        } else {
                            //ReportFunctions.LogRepoter("Fail", "Click on filter name", ""+arguments[1]+" :Saved Filter: Unable to find filter name  " + args[i]);
                            status = false;
                        }
                    }
                    String go = "xpath:=//input[@class=\"btn btn-primary promptsGoBtn\"]";
                    WebElement goes = Getlocator(driver, go);
                    if (goes != null) {
                        goes.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("WAITTIME->2");
                        // //ReportFunctions.LogRepoter("Pass", "Click on GO", "Successfully clicked on  GO button");
                        WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"searchTableX\"]->Search");
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "Click on GO", ""+arguments[1]+" : Saved Filter: Unable to find GO button");
                        status = false;
                    }

                } else {
                    //ReportFunctions.LogRepoter("Fail", "Select filers", ""+arguments[1]+" : Saved Filter: Filter names and values are not equal");
                    status = false;
                }

            } else {
                //ReportFunctions.LogRepoter("Fail", "Click on filter icon", ""+arguments[1]+" :Saved Filter: unable to find filter icon");
                status = false;
            }
            String TCname = hmap.get(Tcase);

            if ((sanitycntname == 1) && (TCname != sanitymap.get(temp4))) {
                sanitymap.put(temp4, TCname);
                int x = TChmap.get(TCname);
                if (status) {
                    sanityVerifysavedFilterswithLOV = 6999 + x;
                    sanitymap.put(sanityVerifysavedFilterswithLOV, "Pass");
                } else {
                    sanityVerifysavedFilterswithLOV = 6999 + x;
                    sanitymap.put(sanityVerifysavedFilterswithLOV, "Fail");
                }
                sanitycntname = sanitycntname + 1;
                tempnum = sanityVerifysavedFilterswithLOV;
                newstatus = status;
            } else {
                if ((sanitymap.get(temp4).equalsIgnoreCase(TCname)) && (newstatus != status)) {
                    sanitymap.put(tempnum, "Fail");
                }
            }

        } catch (Exception e) {
            //out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "Verify saved filters", "exception" + e);
            status = false;
        }

        return status;
    }

    public static void Automation_Sanity_Summary() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        String datasheet = hmap.get(suitename);
        RecoveryScenarios();
        try {
            String workingDirectory = new java.io.File(".").getCanonicalPath();
            System.out.println(workingDirectory);
            String path = workingDirectory + "/Automation_Sanity_Summary";
            File file1 = new File(path + "/" + datasheet + ".xlsx");
            File file = new File(path);
            file1.createNewFile();
            FileOutputStream fileOut = new FileOutputStream(file1);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet1;
            spreadsheet1 = workbook.createSheet(datasheet);
            XSSFRow Srow;
            XSSFCellStyle style = workbook.createCellStyle();
            style.setBorderTop(BorderStyle.DOUBLE);
            style.setBorderBottom(BorderStyle.DOUBLE);
            style.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
            XSSFFont font = workbook.createFont();
            font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
            font.setFontHeightInPoints((short) 10);
            font.setBold(true);
            font.setColor(HSSFColor.BLUE.index);
            style.setFont(font);
            Srow = spreadsheet1.createRow(0);
            XSSFCell Scell;
            Scell = Srow.createCell(0);
            Scell.setCellValue("Automation_Sanity_Summary");
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(1);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Suite Name");
            Scell = Srow.createCell(1);
            Scell.setCellValue(hmap.get(suitename));
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(2);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Suite Final Status ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(hmap.get(ESuitestatus));
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(3);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Dashboards Executed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(casecount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(4);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Suite Execution Time");
            Scell = Srow.createCell(1);
            Scell.setCellValue(display);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(5);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Dashboards Passed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(TCpasscount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(6);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Dashboards Failed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(TCfailcount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(7);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Release Name");
            Scell = Srow.createCell(1);
            Scell.setCellValue(releasename);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(8);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Environment");
            Scell = Srow.createCell(1);
            Scell.setCellValue(environmentname);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(10);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Dashboard Name");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(1);
            Scell.setCellValue("Verify Dashboard is Loading Successfully");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(2);
            Scell.setCellValue("Verify Filters with LOV");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(3);
            Scell.setCellValue("Verify Filters with Text");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(4);
            Scell.setCellValue("Verify On Page Prompts with LOV");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(5);
            Scell.setCellValue("Verify On Page Prompts with Text");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(6);
            Scell.setCellValue("Verify Filters with a date range");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(7);
            Scell.setCellValue("Verify saved Filters with LOV");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(8);
            Scell.setCellValue("Verify saved Filters with Text");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(9);
            Scell.setCellValue("Verify New form is loading");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(10);
            Scell.setCellValue("Verify Search");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(11);
            Scell.setCellValue("Verify FWD Actions");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(12);
            Scell.setCellValue("Verify Drills");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(13);
            Scell.setCellValue("Verify Sorting functionality");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(14);
            Scell.setCellValue("Verify AngularJsPages");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);

            int i = 11;
            int b = 0;
            XSSFRow Srow1;
            XSSFCell Scell1;
            XSSFCell Scell2;
            XSSFCell Scell3;
            XSSFFont whitefont = workbook.createFont();
            whitefont.setColor(HSSFColor.WHITE.index);
            XSSFFont blackfont = workbook.createFont();
            blackfont.setColor(HSSFColor.BLACK.index);
            XSSFCellStyle style1 = workbook.createCellStyle();
            XSSFCellStyle style2 = workbook.createCellStyle();
            XSSFCellStyle style3 = workbook.createCellStyle();
            XSSFCellStyle style4 = workbook.createCellStyle();
            style1.setFont(font);
            style1.setFont(whitefont);
            style1.setBorderBottom(BorderStyle.THIN);
            style2.setFont(font);
            style2.setFont(whitefont);
            style2.setBorderBottom(BorderStyle.THIN);
            style3.setFont(font);
            style3.setFont(blackfont);
            style3.setBorderBottom(BorderStyle.THIN);
            style4.setFont(font);
            style4.setFont(blackfont);
            style4.setBorderBottom(BorderStyle.THIN);
            //int size =sanitymap.size();
            int size = casecount;
            int a = 1000;
            int c = 2000;
            int d = 3000;
            int e = 4000;
            int f = 5000;
            int g = 6000;
            int h = 7000;
            int j = 8000;
            int k = 9000;
            int l = 10000;
            int m = 11000;
            int n = 12000;
            int o = 13000;
            int p = 14000;
            for (int w = 0; w < size; w++) {
                Srow1 = spreadsheet1.createRow(i);
                Scell1 = Srow1.createCell(0);
                Scell1.setCellValue(sanitymap.get(w + 1));
                Scell1 = Srow1.createCell(1);
                Scell1.setCellStyle(style4);
                if (sanitymap.get(a) != null) {
                    if (sanitymap.get(a).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(2);
                if (sanitymap.get(c) != null) {
                    if (sanitymap.get(c).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(3);
                if (sanitymap.get(d) != null) {
                    if (sanitymap.get(d).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(4);
                if (sanitymap.get(e) != null) {
                    if (sanitymap.get(e).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(5);
                if (sanitymap.get(f) != null) {
                    if (sanitymap.get(f).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(6);
                if (sanitymap.get(g) != null) {
                    if (sanitymap.get(g).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(7);
                if (sanitymap.get(h) != null) {
                    if (sanitymap.get(h).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(8);
                if (sanitymap.get(j) != null) {
                    if (sanitymap.get(j).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(9);
                if (sanitymap.get(k) != null) {
                    if (sanitymap.get(k).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);

                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(10);
                if (sanitymap.get(l) != null) {
                    if (sanitymap.get(l).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(11);
                if (sanitymap.get(m) != null) {
                    if (sanitymap.get(m).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(12);
                if (sanitymap.get(n) != null) {
                    if (sanitymap.get(n).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(13);
                if (sanitymap.get(o) != null) {
                    if (sanitymap.get(o).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }
                Scell1 = Srow1.createCell(14);
                if (sanitymap.get(p) != null) {
                    if (sanitymap.get(p).toString().equalsIgnoreCase("PASS")) {
                        Scell1.setCellValue("PASS");
                        style1.setAlignment(HorizontalAlignment.CENTER);
                        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                        Scell1.setCellStyle(style1);
                    } else {
                        Scell1.setCellValue("FAIL");
                        style2.setAlignment(HorizontalAlignment.CENTER);
                        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                        style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                        Scell1.setCellStyle(style2);
                    }
                } else {
                    Scell1.setCellValue("N/A");
                    style4.setAlignment(HorizontalAlignment.CENTER);
                    Scell1.setCellStyle(style4);
                }

                i++;
                a = a + 1;
                c = c + 1;
                d = d + 1;
                e = e + 1;
                f = f + 1;
                g = g + 1;
                h = h + 1;
                j = j + 1;
                k = k + 1;
                l = l + 1;
                m = m + 1;
                n = n + 1;
                o = o + 1;
                p = p + 1;
            }
            for (int z = 0; z < 200; z++) {
                spreadsheet1.autoSizeColumn(z);
            }
            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();

        } catch (Exception e) {
            //out.println("Automation Summary" + e);
        }

    }

    public static Boolean verifySearch(WebDriver WebDriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        Boolean newstatus = true;
        int temp3 = 20;
        int sanitycntname = 1;
        RecoveryScenarios();
        String[] arguments = splitfunction(Parameters, "->");
        String[] args = splitfunction(arguments[2], ",");
        String xpath = "xpath:=//input[@class='searchTableX']";
        try {
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0];
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval).trim();
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    System.out.println("Succesfully clicked on" + " " + arguments[1].trim());
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0];
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval).trim();
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                            System.out.println("Succesfully clicked on" + " " + arguments[1]);
                            if (arguments[1].contains("+")) {
                                arguments1 = splitfunction(arguments[1], "+");
                                arguments2 = splitfunction(arguments1[1], "+");
                                newval = arguments2[0];
                                if (hmap.containsKey(newval)) {
                                    revalue = hmap.get(newval);
                                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "search element", "key not found in hashmap");
                                    Status = false;
                                }
                            }

                        }
                    }
                }
            }
            String xpath1 = arguments[1];
            if (hmap.containsKey(args[1])) {
                args[1] = hmap.get(args[1]);
            }
            if (hmap.containsKey(arguments[3])) {
                arguments[3] = hmap.get(arguments[3]);
            }

            WebElement serach = Getlocator(driver, xpath);
            if (serach != null) {
                serach.click();
                serach.clear();
                serach.sendKeys(args[1]);
                //  //ReportFunctions.LogRepoter("Pass", "Enter value in Search", "Enter the value in search " + arguments[2]);
                WAITTIME("waittime->5");
                WebElement verify = Getlocator(driver, xpath1);
                if (verify != null) {
                    String verifyvalue = verify.getText();
                    if (verifyvalue.equalsIgnoreCase(arguments[3])) {
                        // //ReportFunctions.LogRepoter("Pass", "Verify Both Values", "Both Values matches  " + arguments[3] + "  and" + verifyvalue);
                        //ReportFunctions.LogRepoter("Pass", "Verify Both Values", ""+args[0]+": Search: Successfully able to search a value and get the correct ouput");
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "Verify Both Values", ""+args[0]+": Search: Successfully able to search a value and  Search functionality faileld:  Both Values did not match  " + arguments[3] + "  and" + verifyvalue);
                        Status = false;
                    }
                } else {
                    //ReportFunctions.LogRepoter("Fail", "Verify Both Values",""+args[0]+": Search: unable to find search value  " + args[1]);
                    Status = false;
                }
            } else {
                //ReportFunctions.LogRepoter("Fail", "Enter value in Search",""+args[0]+": Search:  Unable to find search  " + args[1]);
                Status = false;
            }

            String TCname = hmap.get(Tcase);

            if ((sanitycntname == 1) && (TCname != sanitymap.get(temp3))) {
                sanitymap.put(temp3, TCname);
                int x = TChmap.get(TCname);
                if (Status) {
                    sanityVerifySearch = 9999 + x;
                    sanitymap.put(sanityVerifySearch, "Pass");
                } else {
                    sanityVerifySearch = 9999 + x;
                    sanitymap.put(sanityVerifySearch, "Fail");
                }
                sanitycntname = sanitycntname + 1;
                tempnum = sanityVerifySearch;
                newstatus = Status;
            } else {
                if ((sanitymap.get(temp3).equalsIgnoreCase(TCname)) && (newstatus != Status)) {
                    sanitymap.put(tempnum, "Fail");
                }
            }

        } catch (Exception e) {
            //out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "verify search", "exception" + e);
            Status = false;
        }
        return Status;
    }

    public static boolean ValidatePromptText(WebDriver WebDriver, String parameters) throws InterruptedException, Exception {
        String Doness = "xpath:=//button[@id=\"done\" or @id=\"save\"]";
        WebElement Doness1 = Getlocator(driver, Doness);
        if (Doness1 != null) {
            Doness1.click();
            WAITTIME("WAITTIME->2");
            INVISIBLEOFLOAD(driver);
        }
        String Reset = "xpath:=//button[@name=\"reset\"]";
        WAITTIME("WAITTIME->6");
        WebElement Resets = Getlocator(driver, Reset);
        if (Resets != null) {
            // Resets.click();
        }
        String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']";
        String Apply1 = "xpath:=//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
        WebElement Applies = Getlocator(driver, Apply);
        WebElement Applies1 = Getlocator(driver, Apply1);
        if (Applies != null) {
            // Applies.click();
//ReportFunctions.LogRepoter("Pass", "Click on Apply", "Sucessfully clicked on Apply");
            //WAITTIME("WAITTIME->4");
            INVISIBLEOFLOAD(driver);
        }
        String more = "xpath:=//div[@style=\"float: right; display: block;\"]";
        WAITTIME("WAITTIME->4");
        WebElement morebutton = Getlocator(driver, more);
        if (morebutton != null) {
            morebutton.click();
            WAITTIME("WAITTIME->7");
            INVISIBLEOFLOAD(driver);
        }

        Boolean Status = true;
        String[] arguments = splitfunction(parameters, "->");

        try {
            if (hmap.containsKey(arguments[2])) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
            if (hmap.containsKey(arguments[3])) {
                arguments[3] = hmap.get(arguments[3].trim());
            }
            //   String Applyxpath = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply' or @name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
            //   String Resetxpath = "xpath:=//button[@name=\"reset\"]";
            WAITTIME("waittime->3");
            // WebElement Reset = Getlocator(driver, Resetxpath);
            // WebElement Apply = Getlocator(driver, Applyxpath);
            String[] args = splitfunction(arguments[2], "&");
            String[] args1 = splitfunction(arguments[3], "&");
            int ubound = args.length;
            int ubound1 = args1.length;
            if (Resets != null) {
                //Resets.click();
                //  ReportFunctions.LogRepoter("Pass", "Click on reset", "Successfully clicked on Reset");
                for (int i = 0; i <= ubound - 1; i++) {
                    String prompttextname = "xpath:=//input[@placeholder=\"" + args[i] + "\"]";
                    WebElement prompttext = Getlocator(driver, prompttextname);
                    if (prompttext != null) {
                        //prompttext.click();
                        if (hmap.containsKey(args1[i])) {
                            String value = hmap.get(args1[i]);
                            prompttext.clear();
                            prompttext.sendKeys(value);
                        } else if (args1[i].toUpperCase().contains("SYSDATE")) {
                            prompttext.clear();
                            String sysdat = Sysdate(args1[i]);
                            prompttext.sendKeys(sysdat);
                            // Upload_File("upload_file->ENTER");
                            SENDKEYS(driver, "SENDKEYS->ENTER");
                            WAITTIME("waittime->2");
                            // Upload_File("upload_file->ESCAPE");
                            SENDKEYS(driver, "SENDKEYS->ESCAPE");
                            // prompttext.click();
                            //Upload_File("upload_file->ESCAPE");
                            SENDKEYS(driver, "SENDKEYS->ESCAPE");
                            INVISIBLEOFLOAD(driver);
                        } else {
                            prompttext.clear();
                            prompttext.sendKeys(args1[i]);
                            // Upload_File("upload_file->ENTER");
                            SENDKEYS(driver, "SENDKEYS->ENTER");
                            // SENDKEYS(driver, "SENDKEYS->ESCAPE");
                            INVISIBLEOFLOAD(driver);
                        }
                        // ReportFunctions.LogRepoter("Pass", "Enter PromptText value", "Successfully enterd the prompttext  " + args1[i]);
                        WAITTIME("waittime->2");
                    } else {
                        if (args[i].contains("'")) {
                            args[i].replace("'", "");
                        }
                        ReportFunctions.LogRepoter("Fail", "Click on PromptText", "Prompt Text: Unable to find Prompt text locator for  " + args[i]);
                        Status = false;
                    }
                }
                //WAITTIME("waittime->5");
                Applies = Getlocator(driver, Apply);
                if (Applies != null) {
                    // Applies.click();

                    clickElementUsingJavascriptExecutor("//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']");
                    INVISIBLEOFLOAD(driver);
                    // ReportFunctions.LogRepoter("Pass", "Click on Apply", "Successfully clicked on Apply");
                } else if (Applies1 != null) {
                    //  Applies1.click();
                    clickElementUsingJavascriptExecutor("//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]");
                } else {
                    ReportFunctions.LogRepoter("Fail", "Click on Apply", "Prompt Text: Unable to find Apply Button");
                    Status = false;
                }
            } else {
                ReportFunctions.LogRepoter("Fail", "Click on reset", "Prompt Text: unable to find Reset Button");
                Status = false;
            }
            String TCname = hmap.get(Tcase);
        } catch (Exception e) {
            System.out.println("exception" + e);
            ReportFunctions.LogRepoter("Fail", "Validate Prompt Text", "exception");
            Status = false;
        }
        return Status;
    }

    public static boolean ValidateTextFilter(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String[] arguments = splitfunction(parameters, "->");
        RecoveryScenarios();
        try {
            if (hmap.containsKey(arguments[2])) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
            if (hmap.containsKey(arguments[3])) {
                arguments[3] = hmap.get(arguments[3].trim());
            }
            String filter = "xpath:=//img[@id=\"prompts-button-bottom\"]";
            String enter = " Enter ";
            String datepicker = "promptDatePicker";
            String xpath = "xpath:=//input[@placeholder=\"" + enter + "\"]";
            String xpath1 = "xpath:=//input[@class=\"promptDatePicker\"]";
            String go = "xpath:=//input[@class=\"btn btn-primary promptsGoBtn\"]";
            String Resets = "xpath:=//input[@class=\"btn btn-primary promptsResetBtn\"]";
            WAITTIME("waittime->3");
            WebElement Filtertext = null;
            String[] args = splitfunction(arguments[2], "&");
            String[] args1 = splitfunction(arguments[3], "&");
            int ubound = args.length;
            int ubound1 = args1.length;
            WebElement Filters = Getlocator(driver, filter);
            if (ubound == ubound1) {
                if (Filters != null) {
                    Filters.click();
                    WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"btn btn-primary promptsResetBtn\"]->Reset");
                    WebElement Reset = Getlocator(driver, Resets);
                    if (Reset != null) {
                        Reset.click();
                        // //ReportFunctions.LogRepoter("Pass", "Enter on reset button", "Successfully clicked on reset button");
                        for (int i = 0; i <= ubound - 1; i++) {
                            String Filtername = "xpath:=//td[text()=\"" + args[i] + "\"]";
                            WebElement filtername = Getlocator(driver, Filtername);
                            if (filtername != null) {
                                filtername.click();
                                WAITTIME("waittime->2");
                                if (arguments[3].toUpperCase().contains("SYSDATE")) {
                                    Filtertext = Getlocator(driver, xpath1);
                                } else {
                                    Filtertext = Getlocator(driver, xpath);
                                }
                                if (Filtertext != null) {
                                    Filtertext.click();
                                    Filtertext.clear();
                                    if (hmap.containsKey(args1[i])) {
                                        String value = hmap.get(args1[i]);
                                        Filtertext.sendKeys(value);
                                    } else if (args1[i].toUpperCase().contains("SYSDATE")) {
                                        String sysdat = Sysdate(args1[i]);
                                        Filtertext.sendKeys(sysdat);
                                    } else {
                                        Filtertext.sendKeys(args1[i]);
                                    }
                                    WAITTIME("waittime->2");
                                    // //ReportFunctions.LogRepoter("Pass", "Enter FilterText value", "Successfully enterd the Filtertext  " + args1[i]);
                                    Status = true;
                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "Enter FilterText value", ""+arguments[1]+": Filter Text: Unable to find Filter text locator  " + args1[i]);
                                    Status = false;
                                }
                            } else {
                                //ReportFunctions.LogRepoter("Fail", "Click on filter name", ""+arguments[1]+": Filter Text: Unable to find Filter name  " + args[i]);
                            }
                        }

                    } else {
                        //ReportFunctions.LogRepoter("Fail", "Enter on reset button", ""+arguments[1]+": Filter Text: Unable to find reset button");
                        Status = false;
                    }
                } else {
                    //ReportFunctions.LogRepoter("Fail", "Click on filter icon", ""+arguments[1]+": Filter Text: unable to find filter icon");
                    Status = false;
                }
                WebElement goes = Getlocator(driver, go);
                if (goes != null) {
                    goes.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->3");
                    // //ReportFunctions.LogRepoter("Pass", "Click on GO", "Successfully clicked on  GO button");
                    WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"searchTableX\"]->Search");
                } else {
                    //ReportFunctions.LogRepoter("Fail", "Click on GO", ""+arguments[1]+": Filter Text: Unable to find GO button");
                    Status = false;
                }
            } else {
                //ReportFunctions.LogRepoter("Fail", "Select filers", ""+arguments[1]+": Filter Text: Filter names and values are not equal");
                Status = false;
            }
        } catch (Exception e) {
            //out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "Validate Text Filter", "exception" + e);
            Status = false;
        }

        return Status;
    }

    public static boolean VerifyDrill(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        Boolean Status = true;
        String workoredernum = null;
        Boolean newstatus = true;
        int temp2 = 10;
        int sanitycntname = 1;
        String[] arguments = splitfunction(parameters, "->");

        String args[] = splitfunction(arguments[3], ",");
        WebElement locator = Getlocator(driver, arguments[1].trim());
        try {
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0];
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0];
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                            System.out.println("Succesfully clicked on" + " " + arguments[1]);
                            if (arguments[1].contains("+")) {
                                arguments1 = splitfunction(arguments[1], "+");
                                arguments2 = splitfunction(arguments1[1], "+");
                                newval = arguments2[0];
                                if (hmap.containsKey(newval)) {
                                    revalue = hmap.get(newval);
                                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "search element",  ""+args[0]+": Drill: failed to navigate to child page");
                                    Status = false;
                                }
                            }

                        }
                    }
                }
            }
            String xpath = arguments[1].trim();
            String Action = arguments[2].trim();

            try {
                if (locator != null) {
                    //StaleElementClick(driver, "StaleElementClick->arguments[1]->drill");
                    locator.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->3");
                    WebElement Actions = Getlocator(driver, "xpath:=//div[@title=\"" + args[1] + "\"]");
                    if (Actions != null) {
                        String value = Actions.getText();
                        if (value.equalsIgnoreCase(args[1])) {
                            //ReportFunctions.LogRepoter("Pass", "Verify Drill", ""+args[0]+": Drill: Clicking of "+arguments[2]+"," +"navigating to child page, and navigating back to parent page found to be working ");
                            WebElement dashboard = Getlocator(driver, "xpath:=//div[@title=\"" + args[0] + "\"]");
                            if (dashboard != null) {
                                dashboard.click();
                                INVISIBLEOFLOAD(driver);
                                WAITTIME("WAITTIME->3");
                                WebElement popup = Getlocator(driver, "xpath:=//input[@id=\"popup_ok\"]");
                                if (popup != null) {
                                    popup.click();
                                    INVISIBLEOFLOAD(driver);
                                    WAITTIME("WAITTIME->3");

                                }
                                ////ReportFunctions.LogRepoter("Pass", "Click on dashboard", "Successfully clicked on dashboard  " + args[0]);
                            } else {
                                //ReportFunctions.LogRepoter("Fail", "Click on dashboard", ""+args[0]+": Drill: Clicking of "+arguments[2]+"," +" Clicking of breadcrumb is failed because unable to navigate back to home Page");
                                Status = false;
                            }
                        } else {
                            //ReportFunctions.LogRepoter("Fail", "Verify dashboard name", ""+args[0]+": Drill: Clicking of "+arguments[2]+"," +" page name mismatched  " + args[1] + "  and " + value);
                            Status = false;
                            WebElement dashboard = Getlocator(driver, "xpath:=//div[@title=\"" + args[0] + "\"]");
                            if (dashboard != null) {
                                dashboard.click();
                                INVISIBLEOFLOAD(driver);
                                WAITTIME("WAITTIME->3");
                                WebElement popup = Getlocator(driver, "xpath:=//input[@id=\"popup_ok\"]");
                                if (popup != null) {
                                    popup.click();
                                    INVISIBLEOFLOAD(driver);
                                    WAITTIME("WAITTIME->3");
                                }
                            }
                        }
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "verify dashboard name", ""+args[0]+" Drill: Clicking of "+arguments[2]+"," +"Unable to find dash board name  " + args[1]);
                        Status = false;
                        WebElement dashboard = Getlocator(driver, "xpath:=//div[@title=\"" + args[0] + "\"]");
                        if (dashboard != null) {
                            dashboard.click();
                            INVISIBLEOFLOAD(driver);
                            WAITTIME("WAITTIME->3");
                            WebElement popup = Getlocator(driver, "xpath:=//input[@id=\"popup_ok\"]");
                            if (popup != null) {
                                popup.click();
                                INVISIBLEOFLOAD(driver);
                                WAITTIME("WAITTIME->3");
                            }
                        }

                    }
                    //}
                } else {
                    //ReportFunctions.LogRepoter("Fail", "Click on Drill", ""+args[0]+": Drill: Clicking of "+arguments[2]+"," +"Unable to locate  drill  ");
                    Status = false;
                }
                String TCname = hmap.get(Tcase);

                if ((sanitycntname == 1) && (TCname != sanitymap.get(temp2))) {
                    sanitymap.put(temp2, TCname);
                    int x = TChmap.get(TCname);
                    if (Status) {
                        sanityVerifyDrills = 11999 + x;
                        sanitymap.put(sanityVerifyDrills, "Pass");
                    } else {
                        sanityVerifyDrills = 11999 + x;
                        sanitymap.put(sanityVerifyDrills, "Fail");
                    }
                    sanitycntname = sanitycntname + 1;
                    tempnum = sanityVerifyDrills;
                    newstatus = Status;
                } else {
                    if ((sanitymap.get(temp2).equalsIgnoreCase(TCname)) && (newstatus != Status)) {
                        sanitymap.put(tempnum, "Fail");
                    }
                }

            } catch (Exception e) {
                //out.println("unable to find the locator" + arguments[1]);
                //ReportFunctions.LogRepoter("Fail", "Click on Drill", ""+args[0]+": Drill: Clicking of "+arguments[2]+"," +"Unable to locate  drill  ");
                Status = false;
            }

        } catch (Exception e) {
            //out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "verify drill", "exception" + e);
            Status = false;
        }
        return Status;

    }

    public static boolean VerifyFwdAction(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        Boolean newstatus = true;
        int temp20 = 300;
        int sanitycntname = 1;
        RecoveryScenarios();
        String[] arguments = splitfunction(parameters, "->");
        try {
            String[] args = splitfunction(arguments[2], ",");
            INVISIBLEOFLOAD(driver);
            WAITTIME("WAITTIME->4");
            WebElement Fwdaction = Getlocator(driver, "xpath:=//img[@title=\"" + arguments[1].trim() + "\"]");
            if (Fwdaction != null) {
                Fwdaction.click();
                WAITTIME("WAITTIME->4");
                // //ReportFunctions.LogRepoter("Pass", "Click on Fwd Action", "Clicked on Fwd Action  " + arguments[1]);
                INVISIBLEOFLOAD(driver);
                Boolean verifydashboard = WAITFORELEMENT(driver, "waitforelement->xpath:=//div[@title=\"" + args[1].trim() + "\"]->" + args[1]);
                if (verifydashboard) {
                    WebElement backdashboard = Getlocator(driver, "xpath:=//div[@title=\"" + args[0].trim() + "\"]");
                    backdashboard.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->4");
                    //ReportFunctions.LogRepoter("Pass", "Verify Fwd Action", ""+args[0]+": FWD Action: Successfully able to navigate to  " +args[1]+" page and also could navigate back to "+args[0]+" page");
                    Status = true;
                } else {
                    //ReportFunctions.LogRepoter("Fail", "Verify Fwd Action", ""+args[0]+": FWD Action: Successfully unable to navigate to  " +args[1]+" page");
                    WebElement backdashboard = Getlocator(driver, "xpath:=//div[@title=\"" + args[0].trim() + "\"]");
                    backdashboard.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->4");
                    Status = false;
                }
            } else {
                //ReportFunctions.LogRepoter("Fail", "Verify Fwd Action", ""+args[0]+": FWD Action: Successfully unable to navigate to " +args[0]+" page");
                Status = false;
            }
            String TCname = hmap.get(Tcase);

            if ((sanitycntname == 1) && (TCname != sanitymap.get(temp20))) {
                sanitymap.put(temp20, TCname);
                int x = TChmap.get(TCname);
                if (Status) {
                    sanityVerifyFWDActions = 10999 + x;
                    sanitymap.put(sanityVerifyFWDActions, "Pass");
                } else {
                    sanityVerifyFWDActions = 10999 + x;
                    sanitymap.put(sanityVerifyFWDActions, "Fail");
                }
                sanitycntname = sanitycntname + 1;
                tempnum = sanityVerifyFWDActions;
                newstatus = Status;
            } else {
                if ((sanitymap.get(temp20).equalsIgnoreCase(TCname)) && (newstatus != Status)) {
                    sanitymap.put(tempnum, "Fail");
                }
            }
        } catch (Exception e) {
            //out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "Verify Fwd Action", "exception" + e);
            Status = false;
        }
        return Status;
    }

//    public static boolean ValidateDateType(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
//        Boolean status = true;
//        int ubound;
//        int ubound1;
//        Boolean flag = false;
//        Boolean newstatus = true;
//        int temp54 = 546;
//        int sanitycntname = 1;
//      //  RecoveryScenarios();
//        String filter = "xpath:=//img[@id=\"prompts-button-bottom\"]";
//        String go = "xpath:=//input[@class=\"btn btn-primary promptsGoBtn\"]";
//        String Reset = "xpath:=//input[@class=\"btn btn-primary promptsResetBtn\"]";
//        String Cdate = "xpath:=//td[text()=\"Transaction Start Date\"]";
//        String Edate = "xpath:=(//input[@class=\"promptDatePicker\"])[1]";
//        String Sdate = "xpath:=(//input[@class=\"promptDatePicker\"])[2]";
//        String search = "xpath:=//input[@id=\"prompt_search\"]";
//        String[] arguments = splitfunction(parameters, "->");
//        String allchoices = "xpath:=//input[@value=\"All Choices\"]";
//        WebElement Filters = Getlocator(driver, filter);
//        try {
//            if (Filters != null) {
//                Filters.click();
//                WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"btn btn-primary promptsResetBtn\"]->Reset");
//                WebElement Resets = Getlocator(driver, Reset);
//                if (Resets != null) {
//                    Resets.click();
//                    String xpath = "xpath:=//td[text()=\"" + arguments[2] + "\"]";
//                    WebElement filtername = Getlocator(driver, xpath);
//                    if (filtername != null) {
//                        WAITTIME("WAITTIME->2");
//                        filtername.click();
//                        WAITTIME("WAITTIME->2");
//                        String args[] = splitfunction(arguments[3], "&");
//                        Boolean selectq = SELECTVALUEDROPDOWN(driver, "SELECTVALUEDROPDOWN->xpath:=//select[@id=\"operatorsList\"]->Condition->" + args[0]);
//                        if (selectq) {
//                            WebElement date1 = Getlocator(driver, Edate);
//                            if (date1 != null) {
//                                if (args[0].equalsIgnoreCase("Between")) {
//                                    WebElement date2 = Getlocator(driver, Sdate);
//                                    String args1[] = splitfunction(args[1], "and");
//                                    if (args1[1].toUpperCase().contains("SYSDATE")) {
//                                        String sysdat = Sysdate(args1[0]);
//                                        date1.sendKeys(sysdat);
//                                        //  //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + sysdat);
//                                        String sysdat1 = Sysdate(args1[1]);
//                                        SENDKEYS(driver, "SENDKEYS->TAB");
//                                        WAITTIME("WAITTIME->3");
//                                        date2.sendKeys(sysdat1);
//                                        SENDKEYS(driver, "SENDKEYS->TAB");
//                                        WAITTIME("WAITTIME->3");
//                                        // //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + sysdat1);
//                                    } else {
//                                        date1.sendKeys(args1[0]);
//                                        date2.sendKeys(args1[1]);
//                                        // //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + args1[0]);
//                                        ////ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + args1[1]);
//                                    }
//                                } else {
//                                    if (args[1].toUpperCase().contains("SYSDATE")) {
//                                        String sysdat = Sysdate(args[1]);
//                                        date1.sendKeys(sysdat);
//                                        SENDKEYS(driver, "SENDKEYS->TAB");
//                                        WAITTIME("WAITTIME->3");
//                                        //  //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered date  " + args[0] + "  " + sysdat);
//                                    } else {
//                                        date1.sendKeys(args[1]);
//                                        // //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered date  " + args[0] + "" + args[1]);
//                                    }
//                                }
//                            } else {
//                                //ReportFunctions.LogRepoter("Fail", "Enter date condition", ""+ arguments[1]+": Date: failed to enter  entered date in   " + arguments[2]);
//                                status = false;
//                            }
//                        } else {
//                            //ReportFunctions.LogRepoter("Fail", "Select condition", ""+ arguments[1]+": Date: Unable to find condition value from dropdown");
//                            status = false;
//                        }
//                    } else {
//                        //ReportFunctions.LogRepoter("Fail", "Click on filter name", ""+ arguments[1]+": Date: Unable to find filter name  " + arguments[2]);
//                        status = false;
//                    }
//                    WebElement goes = Getlocator(driver, go);
//                    if (goes != null) {
//                        goes.click();
//                        INVISIBLEOFLOAD(driver);
//                        WAITTIME("WAITTIME->2");
//                        // //ReportFunctions.LogRepoter("Pass", "Click on GO", "Successfully clicked on  GO button");
//                        WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"searchTableX\"]->Search");
//                    } else {
//                        //ReportFunctions.LogRepoter("Fail", "Click on GO", ""+ arguments[1]+": Date: Unable to find GO button");
//                        status = false;
//                    }
//                } else {
//                    //ReportFunctions.LogRepoter("Fail", "Click on Reset button", ""+ arguments[1]+": Date: unable to find Reset button");
//                    status = false;
//                }
//
//            } else {
//                //ReportFunctions.LogRepoter("Fail", "Click on filter icon",""+ arguments[1]+" Date: unable to find filter icon");
//                status = false;
//            }
//            String TCname = hmap.get(Tcase);
//
//            if ((sanitycntname == 1) && (TCname != sanitymap.get(temp54))) {
//                sanitymap.put(temp54, TCname);
//                int x = TChmap.get(TCname);
//                if (status) {
//                    sanityVerifyFilterswithadaterange = 5999 + x;
//                    sanitymap.put(sanityVerifyFilterswithadaterange, "Pass");
//                } else {
//                    sanityVerifyFilterswithadaterange = 5999 + x;
//                    sanitymap.put(sanityVerifyFilterswithadaterange, "Fail");
//                }
//                sanitycntname = sanitycntname + 1;
//                tempnum = sanityVerifyFilterswithadaterange;
//                newstatus = status;
//            } else {
//                if ((sanitymap.get(temp54).equalsIgnoreCase(TCname)) && (newstatus != status)) {
//                    sanitymap.put(tempnum, "Fail");
//                }
//            }
//        } catch (Exception e) {
//            //out.println("exception" + e);
//            //ReportFunctions.LogRepoter("Fail", "Validate date type", "exception" + e);
//            status = false;
//        }
//        return status;
//    }
    public static boolean ValidateDateType(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean status = true;
        int ubound;
        int ubound1;
        int sanityVerifyFilterswithadaterange;
        Boolean flag = false;
        Boolean newstatus = true;
        int temp54 = 546;
        int sanitycntname = 1;
        //   RecoveryScenarios();	
        String[] arguments = splitfunction(parameters, "->");
        String prompt = "xpath:=//input[@placeholder=\"" + arguments[2] + "\"]/following-sibling::label";
        String Cdate = "xpath:=//td[text()=\"Transaction Start Date\"]";
        String Edate = "xpath:=(//input[@class=\"promptDatePicker\"])[1]";
        String Sdate = "xpath:=(//input[@class=\"promptDatePicker\"])[2]";
        String search = "xpath:=//input[@id=\"prompt_search\"]";
        String done = "xpath:=//button[text()=\"Done & Apply\"]";

        try {
            String more = "xpath:=//div[@style=\"float: right; display: block;\"]";
            WAITTIME("WAITTIME->4");
            WebElement morebutton = Getlocator(driver, more);
            if (morebutton != null) {
                morebutton.click();
                WAITTIME("WAITTIME->7");
                INVISIBLEOFLOAD(driver);
            }
            WebElement Prompt = Getlocator(driver, prompt);
            if (Prompt != null) {
                WAITTIME("WAITTIME->2");
                Prompt.click();
                WAITTIME("WAITTIME->2");
                String args[] = splitfunction(arguments[3], "&");
                Boolean selectq = SELECTVALUEDROPDOWN1(driver, "SELECTVALUEDROPDOWN1->xpath:=//select[@id=\"operatorsList\"]->Condition->" + args[0]);
                if (selectq) {
                    WebElement date1 = Getlocator(driver, Edate);
                    if (date1 != null) {
                        if (args[0].equalsIgnoreCase("Between")) {
                            WebElement date2 = Getlocator(driver, Sdate);
                            String args1[] = splitfunction(args[1], "and");
                            if (args1[1].toUpperCase().contains("SYSDATE")) {
                                String sysdat = Sysdate(args1[0]);
                                date1.sendKeys(sysdat);
                                //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + sysdat);	
                                String sysdat1 = Sysdate(args1[1]);
                                SENDKEYS(driver, "SENDKEYS->TAB");
                                WAITTIME("WAITTIME->3");
                                date2.sendKeys(sysdat1);
                                SENDKEYS(driver, "SENDKEYS->TAB");
                                WAITTIME("WAITTIME->3");
                                //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + sysdat1);	
                            } else {
                                date1.sendKeys(args1[0]);
                                date2.sendKeys(args1[1]);
                                //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + args1[0]);	
                                //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered first date  " + args1[1]);	
                            }
                        } else {
                            if (args[1].toUpperCase().contains("SYSDATE")) {
                                String sysdat = Sysdate(args[1]);
                                WAITTIME("WAITTIME->2");
                                date1.clear();
                                WAITTIME("WAITTIME->2");
                                date1.sendKeys(sysdat);
                                SENDKEYS(driver, "SENDKEYS->TAB");
                                WAITTIME("WAITTIME->3");
                                //  //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered date  " + args[0] + "  " + sysdat);	
                            } else {
                                date1.sendKeys(args[1]);
                                // //ReportFunctions.LogRepoter("Pass", "Enter date condition", "successfully entered date  " + args[0] + "" + args[1]);	
                            }
                        }
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "Enter date condition", ""+ arguments[1]+": Date: failed to enter  entered date in   " + arguments[2]);	
                        status = false;
                    }
                } else {
                    //ReportFunctions.LogRepoter("Fail", "Select condition", ""+ arguments[1]+": Date: Unable to find condition value from dropdown");	
                    status = false;
                }
            } else {
                //ReportFunctions.LogRepoter("Fail", "Click on prompt name", ""+ arguments[1]+": Date: Unable to find prompt name  " + arguments[2]);	
                status = false;
            }
            WebElement Done1 = Getlocator(driver, done);
            if (Done1 != null) {
                Done1.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->2");
                ReportFunctions.LogRepoter("Pass", "Click on Done&Apply", "Successfully clicked on  GO button");
                // WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@class=\"searchTableX\"]->Search");	
            } else {
                //ReportFunctions.LogRepoter("Fail", "Click on prompt icon",""+ arguments[1]+" Date: unable to find prompt icon");	
                status = false;
            }
            String TCname = hmap.get(Tcase);
            if ((sanitycntname == 1) && (TCname != sanitymap.get(temp54))) {
                sanitymap.put(temp54, TCname);
                int x = TChmap.get(TCname);
                if (status) {
                    sanityVerifyFilterswithadaterange = 5999 + x;
                    sanitymap.put(sanityVerifyFilterswithadaterange, "Pass");
                } else {
                    sanityVerifyFilterswithadaterange = 5999 + x;
                    sanitymap.put(sanityVerifyFilterswithadaterange, "Fail");
                }
                sanitycntname = sanitycntname + 1;
                tempnum = sanityVerifyFilterswithadaterange;
                newstatus = status;
            } else {
                if ((sanitymap.get(temp54).equalsIgnoreCase(TCname)) && (newstatus != status)) {
                    sanitymap.put(tempnum, "Fail");
                }

            }

        } catch (Exception e) {
            System.out.println("exception" + e);
            //ReportFunctions.LogRepoter("Fail", "Validate date type", "exception" + e);	
            status = false;
        }
        return status;
    }

    public static boolean sanity_OpenAngularpage(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean status = true;
        int count = 0;
        boolean flag = false;
        Boolean newstatus = true;
        int temp44 = 456;
        int sanitycntname = 1;
        RecoveryScenarios();
        String[] arguments = splitfunction(parameters, "->");
        String directsearch = "xpath:=//div[@id=\"activity-table_filter\"]/label/input";
        String clicksearch = "xpath:=//i[@class=\"fa fa-search\"]";
        String entersearch = "xpath:=//input[@ng-model=\"searchVal\"]";
        String othersearch = "xpath:=//input[@class=\"form-control input-sm\"]";
        try {
            do {
                WAITTIME("waittime->25");
                driver.switchTo().defaultContent();
                driver.switchTo().frame(0);
// WebElement locator = Getlocator(driver, "xpath:=//input[@type=\"search\"]");
                WebElement locator = Getlocator(driver, "xpath:=//input [(@id=\"searchtext\") or (@type=\"search\")]");
                if (locator != null) {
                    WebElement New = Getlocator(driver, "xpath:=//*[@id=\"btn-new\"]");
                    // //ReportFunctions.LogRepoter("Pass", "Wait for angular js page", " FSM: Dashboard launched successfully and could see the data in it and also able to perform Search");
                    WAITTIME("waittime->2");
                    flag = true;
                    count = 5001;
                    WebElement DS = Getlocator(driver, directsearch);
                    WebElement CS = Getlocator(driver, clicksearch);
                    WebElement ES = Getlocator(driver, entersearch);
                    WebElement OS = Getlocator(driver, othersearch);
                    if ((DS != null) || (OS != null)) {
                        if (OS != null) {
                            OS.click();
                            OS.sendKeys(arguments[3]);
                        } else {
                            DS.click();
                            DS.sendKeys(arguments[3]);
                        }
                        WAITTIME("waittime->4");
                        WebElement Verify = Getlocator(driver, arguments[1]);
                        String vvalue = Verify.getText();
                        if (vvalue.equalsIgnoreCase(arguments[3])) {
                            //ReportFunctions.LogRepoter("Pass", "Wait for angular js page", ""+arguments[3]+": FSM: Dashboard launched successfully and could see the data in it and also able to perform Search");
                        } else {
                            //ReportFunctions.LogRepoter("Fail", "Verify A.Js pase search", ""+arguments[3]+": FSM: Dashboard launched successfully but search failed Both values did not match " + vvalue + "and " + arguments[3]);
                            status = false;
                        }
                    } else if (ES != null) {
                        ES.click();
                        ES.sendKeys(arguments[3]);
                        WAITTIME("waittime->2");
                        CS.click();
                        WAITTIME("waittime->4");
                        WebElement Verify = Getlocator(driver, arguments[1]);
                        String vvalue = Verify.getText();
                        if (vvalue.equalsIgnoreCase(arguments[3])) {
                            //ReportFunctions.LogRepoter("Pass", "Wait for angular js page", ""+arguments[3]+": FSM: Dashboard launched successfully and could see the data in it and also able to perform Search");
                        } else {
                            //ReportFunctions.LogRepoter("Fail", "Verify A.Js pase search", ""+arguments[3]+": FSM: Dashboard launched successfully but search failed Both values did not match " + vvalue + "and " + arguments[3]);
                            status = false;
                        }
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "Verify A.Js pase search", ""+arguments[3]+": FSM: unable to find search");
                        status = false;
                    }
                } else {
                    count = count + 1;
                }
            } while (count < 5000);
            if (flag == false) {
                //ReportFunctions.LogRepoter("Fail", "Wait for angular js page", ""+arguments[3]+": FSM: Dashboard failed to launch successfully");
            }
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {
            driver.switchTo().defaultContent();
            if (flag == false) {
                WAITTIME("waittime->10");
                count = count + 1;
                sanity_OpenAngularpage(driver, parameters);
            }
        }
        String TCname = hmap.get(Tcase);
        if ((sanitycntname == 1) && (TCname != sanitymap.get(temp44))) {
            sanitymap.put(temp44, TCname);
            int x = TChmap.get(TCname);
            if (status) {
                sanityVerifyangularpage = 13999 + x;
                sanitymap.put(sanityVerifyangularpage, "Pass");
            } else {
                sanityVerifyangularpage = 13999 + x;
                sanitymap.put(sanityVerifyangularpage, "Fail");
            }
            sanitycntname = sanitycntname + 1;
            tempnum = sanityVerifyangularpage;
            newstatus = status;
        } else {
            if ((sanitymap.get(temp44).equalsIgnoreCase(TCname)) && (newstatus != status)) {
                sanitymap.put(tempnum, "Fail");
            }
        }
        return status;
    }

    public static boolean LaunchDashboard(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean status = true;
        String[] arguments = splitfunction(parameters, "->");
        String[] args = splitfunction(arguments[1], ",");
        String Url = null;
        String usernam = null;
        String Passwor = null;
        String Tenana = null;
        RecoveryScenarios();
        try {
            if (hmap.containsKey(args[0])) {
                Url = hmap.get(args[0].trim());
            } else {
                Url = args[0].trim();
            }
            if (hmap.containsKey(args[1])) {
                usernam = hmap.get(args[1].trim());
            } else {
                usernam = args[1].trim();
            }
            if (hmap.containsKey(args[2].trim())) {
                Tenana = hmap.get(args[2].trim());
            } else {
                Tenana = args[2].trim();
            }
            if (hmap.containsKey(args[3].trim())) {
                Passwor = hmap.get(args[3].trim());
            } else {
                Passwor = args[3].trim();
            }

            Boolean launch = LAUNCHBROWSER(WebDriver, "launchbrowser->Chrome->" + Url);
            if (launch) {
                WAITFORELEMENT(WebDriver, "waitforelement->xpath:=//button[@id=\"loginBtn\"]->login]->args[1]");
                Boolean user = ENTERVALUE(WebDriver, "Entervalue->xpath:=//input[@placeholder=\"Username\"]->username->" + usernam);
               // WAITTIME("waittime->9");
                //CLEARTEXTBOX(WebDriver, "Cleartextbox->xpath:=//input[@id=\"tenant\"]->Tenant");
                if (user) {
                    WAITTIME("waittime->3");
                    Boolean tenen = ENTERVALUE(WebDriver, "Entervalue->xpath:=//input[@id=\"tenant\"]->Tenant->" + Tenana);
                    CLICK(WebDriver, "click->xpath:=//button[@id=\"loginBtn\"]->login");
                   // WAITTIME("waittime->3");
                    if (tenen) {
                        //WAITFORELEMENT(WebDriver, "waitforelement->id:=password->Password");
                        Boolean pass = ENTERVALUE(WebDriver, "Entervalue->id:=password->Password->" + Passwor);
                        if (pass) {
                            CLICK(WebDriver, "click->xpath:=//button[@id=\"loginBtn\"]->login");
                            INVISIBLEOFLOAD(driver);
                            RecoveryScenarios();
                            // WAITFORELEMENT(WebDriver, "waitforelement->xpath:=//*[@id=\"dash_more\"]/button->Dashboard Button");
                            WAITFORELEMENT(WebDriver, "waitforelement->xpath:=//i[contains(@class,'fa-bars')]->Dashboard Button");
                            Boolean DButton = CLICK(WebDriver, "click->xpath:=//i[contains(@class,'fa-bars')]->Dashboard Button");
                            if (DButton) {
                                Boolean CT = CLEARTEXTBOX(WebDriver, "Cleartextbox->xpath:=//input[@id=\"tile_search_input\"]->Search");
                                if (CT) {
                                    ENTERVALUE(WebDriver, "entervalue->xpath:=//input[@id=\"tile_search_input\"]->Search->" + args[4]);
                                    STOREVALUE("storevalue->Dashboard->" + args[4]);
                                    Boolean DL = WAITFORELEMENT(WebDriver, "waitforelement->xpath:=//ul[@class='dropdown-menu']//a[text()='+Dashboard+']->Dashboard link");
                                    if (DL) {
                                        CLICK(WebDriver, "click->xpath:=//ul[@class='dropdown-menu']//a[text()='+Dashboard+']->Dropdown Link");
                                        captureTime(driver);
                                        //ReportFunctions.LogRepoter("Pass", "Launch Dashboard", "Successfully able to Login and able to launch the Dashboard");
                                    } else {
                                        //ReportFunctions.LogRepoter("Fail", "Launch Dashboard", "Successfully able to Login and unable to launch the Dashboard" + args[4]);
                                        status = false;
                                    }

                                } else {
                                    //ReportFunctions.LogRepoter("Fail", "Launch Dashboard", "Successfully able to Login and unable to launch the Dashboard" + args[4]);
                                    status = false;
                                }
                            } else {
                                //ReportFunctions.LogRepoter("Fail", "Launch Dashboard", "Successfully able to Login and unable to launch the Dashboard" + args[4]);
                                status = false;
                            }
                        } else {
                            //ReportFunctions.LogRepoter("Fail", "Launch Dashboard", "Failed to login");
                            status = false;
                        }
                    } else {
                        //ReportFunctions.LogRepoter("Fail", "Launch Dashboard", "Failed to login");
                        status = false;
                    }

                } else {
                    //ReportFunctions.LogRepoter("Fail", "Launch Dashboard", "Failed to login");
                    status = false;
                }
            }
            String Reset = "xpath:=//button[@name=\"reset\"]";
            //String Apply = "xpath:=//button[contains(text(),'reset')]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
            // String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply'or @name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
            String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']";
            WebElement rest = Getlocator(driver, Reset);
            if (rest != null && rest.isDisplayed()) {
                rest.click();
                INVISIBLEOFLOAD(driver);
                WebElement app = Getlocator(driver, Apply);
                if (app != null) {
                    app.click();
                }
                INVISIBLEOFLOAD(driver);
                //WAITTIME("WAITTIME->2");
            }

        } catch (Exception e) {
            //out.println("unable to open browser");
        }
        //RecoveryScenarios();
        return status;

    }

    public static Boolean writeDataToExcel(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        String value;
        String[] arguments = splitfunction(Parameters, "->");
        String path = arguments[1];
        String label = arguments[2];
        RecoveryScenarios();
        try {
            if (hmap.containsKey(arguments[3])) {
                value = hmap.get(arguments[3]);
            } else {
                value = arguments[3];
            }
            FileInputStream fis = new FileInputStream(path);
            XSSFWorkbook wbook = new XSSFWorkbook(fis);
            XSSFSheet wsheet = wbook.getSheet("BOM Header");
            Row row = wsheet.getRow(1);
            Cell cell = row.createCell(1);
            cell.setCellValue(value);
            XSSFFormulaEvaluator.evaluateAllFormulaCells(wbook);
            FileOutputStream fout = new FileOutputStream(path);
            wbook.write(fout);
            fout.flush();
            fout.close();
            //ReportFunctions.LogRepoter("pass", "Sucessfully entered Project ID in BOM excel Template ", "Sucessfully entered Project ID in BOM excel Template ");
        } catch (Exception e) {
            //ReportFunctions.LogRepoter("Fail", "Failed to enter Project ID in BOM excel Template ", "Failed to enter Project ID in BOM excel Template " + e);
            CLOSEALLBROWSERS(driver);
            Status = false;

        }
        return Status;

    }

    public static Boolean Validate_Duplicates(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->5");
        Boolean Status = false;
        RecoveryScenarios();
        try {
            String a[] = new String[8];
            Boolean flag = false;
            ArrayList list = new ArrayList();
            ArrayList ilist = new ArrayList();
            String promptxpath = "(//div[@class='modal-body'])[2]//table[1]//td//input";
            String filterxpqth = "//div[@id='promptsColsValuesDiv']//table//td//input";
            String[] arguments = splitfunction(Parameters, "->");

            if (arguments[1].equalsIgnoreCase("PROMPT")) {
                WAITFORELEMENT(driver, "WAITFORELEMENT->xpath:=(//div[@class='modal-body'])[2]//table->Table");
                List<WebElement> prows = driver.findElements(By.xpath("(//div[@class='modal-body'])[2]//table"));
                int psize = prows.size();
                for (int i = 1; i <= psize; i++) {
                    WebElement locator = Getlocator(driver, "xpath:=(//div[@class='modal-body'])[2]//table[" + i + "]//td//input");
                    if (locator != null) {
                        String ovalue = locator.getAttribute("value");
                        ilist.add(ovalue);
                        System.out.println(ovalue);
                    } else {
                    }
                    if (ilist.isEmpty()) {
                        ReportFunctions.LogRepoter("Fail", "Verify duplicates in Prompt", "No Records found to verify duplicates");
                    } else {
                        Collections.sort(ilist);
                        for (int j = 0; j <= ilist.size() - 1; j++) {
                            if (j != ilist.size() - 1) {
                                if (ilist.get(j) == ilist.get(j + 1)) {
                                    if (list.contains(ilist.get(j))) {
                                    } else {
                                        list.add(ilist.get(j));
                                    }

                                }
                            }
                        }
                    }
                }
                if (list.isEmpty()) {
                    System.out.println("N0 Duplicates Found");
                    ReportFunctions.LogRepoter("pass", "Verify duplicates in Prompt", "No Duplicates Found");
                    Status = true;
                } else {
                    System.out.println(list);
                    ReportFunctions.LogRepoter("Fail", "Verify duplicates in Prompt", "Found Duplicates" + list);
                    list.clear();
                }
            } else {
                List<WebElement> frows = driver.findElements(By.xpath("//div[@id='promptsColsValuesDiv']//table"));
                int fsize = frows.size();
                for (int i = 1; i <= fsize; i++) {
                    WebElement locator = Getlocator(driver, "xpath:=//div[@id='promptsColsValuesDiv']//table[" + i + "]//td//input");
                    if (locator != null) {
                        String ovalue = locator.getAttribute("value");
                        ilist.add(ovalue);
                        System.out.println(ovalue);
                    } else {
                    }
                    if (ilist.isEmpty()) {
                        ReportFunctions.LogRepoter("Fail", "Verify duplicates in Filter", "No Records found to verify duplicates");
                    } else {
                        Collections.sort(ilist);
                        for (int j = 0; j <= ilist.size() - 1; j++) {
                            if (j != ilist.size() - 1) {
                                if (ilist.get(j) == ilist.get(j + 1)) {
                                    if (list.contains(ilist.get(j))) {
                                    } else {
                                        list.add(ilist.get(j));
                                    }

                                }
                            }
                        }
                    }
                }
                if (list.isEmpty()) {
                    System.out.println("N0 Duplicates Found");
                    ReportFunctions.LogRepoter("pass", "Verify duplicates in Filter", "No Duplicates Found");
                    Status = true;
                } else {
                    System.out.println(list);
                    ReportFunctions.LogRepoter("Fail", "Verify duplicates in Filter", "Found Duplicates" + list);
                    list.clear();
                }
            }
        } catch (Exception e) {
            //out.println(e.getMessage());
        }

        return Status;
    }

    public static boolean MouseOver(WebDriver WebDriver, String parameters)
            throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Thread.sleep(3000);
        RecoveryScenarios();
        String[] arguments = null;
        arguments = splitfunction(parameters, "->");
        try {
            WebElement locator = Getlocator(driver, arguments[1].trim());
            Actions act = new Actions(WebDriver);
            if (locator.isEnabled()) {
                act.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Agreements')]"))).build().perform();
                CLICK(driver, parameters);
                INVISIBLEOFLOAD(driver);
                System.out.println("Succesfully clicked on" + " " + arguments[2]);
// ReportFunctions.LogRepoter("pass", "double click on
// object","Succesfully clicked on" + " " + arguments[2]);
                return true;
            } else {
                System.out.println("unable to find" + " " + arguments[2]);
// ReportFunctions.LogRepoter("Fail", "double click on object",
// "Application launched succesfully");
// CLOSEALLBROWSERS(driver);
                return false;
            }

        } catch (Exception e) {

            //out.println("unable to find the locator" + " " + e.getMessage());
// ReportFunctions.LogRepoter("Fail", "double click on
// object","unable to find the locator" + " " + arguments[2]);
// CLOSEALLBROWSERS(driver);
            return false;

        }

    }

    public static Boolean StorePositionNumber(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        String value;
        String[] values = null;
        String[] arg = null;
        String[] arguments = splitfunction(Parameters, "\\->");
        WebElement locpath = null;
        RecoveryScenarios();
        try {
            boolean b;
            b = arguments[1].matches(".*:.*");
            if (b) {
                arg = splitfunction(arguments[1], ":=");
            } else {
                arg = splitfunction(arguments[1], "\\|");
            }
            String mode = arg[0].trim();
            arg[0].trim();
            locator = arg[1].trim();

            int num = driver.findElements(By.xpath(arg[1])).size();
            num = num + 1;
            String val = String.valueOf(num);
            hmap.put(arguments[3], val);

        } catch (Exception e) {
            // ReportFunctions.LogRepoter("Fail", "Storevalue", "Failed stored
            // the value as input is wrong " + e);
            // CLOSEALLBROWSERS(driver);
            Status = false;
        }
        return Status;
    }

    public static Boolean Storedynamiclabelvalue(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        String value;
        String[] values = null;
        String[] argum = null;
        String revalue = null;
        Boolean flag = true;
        String[] arguments = splitfunction(Parameters, "->");
        RecoveryScenarios();
        if ((arguments[2].contains("+"))) {
            argum = splitfunction(arguments[2], "+");
            if ((hmap.containsKey(argum[0]) == false)) {
                String[] arg = splitfunction(arguments[2], "+");
                String newv = arg[1];
                if (hmap.containsKey(newv)) {
                    revalue = hmap.get(newv);
                    arguments[2] = arguments[2].replace("+" + newv, revalue);
                }
            } else if (((hmap.containsKey(argum[0]) == true))) {
                revalue = hmap.get(argum[0]);
                if (((hmap.containsKey(argum[1]) == true))) {
                    String revalue1 = hmap.get(argum[1]);
                    arguments[2] = revalue + revalue1;
                } else {
                    try {
                        Float.parseFloat(argum[1]);
                    } catch (NumberFormatException e) {
                        flag = false;
                    }
                    if (flag == true) {
                        float firstval = Float.parseFloat(revalue) + Float.parseFloat(argum[1]);
                        arguments[2] = String.valueOf(firstval);
                    } else {
                        arguments[2] = revalue + argum[1];
                    }
                }
            }
        }
        try {
            if (arguments[1] != null && arguments[2] != null) {

                if (hmap.containsKey(arguments[2])) {
                    if ((hmap.containsKey(arguments[1]))) {
                        String newvar = hmap.get(arguments[1]);
                        arguments[1] = newvar;
                    }
                    String oval = hmap.get(arguments[2]);
                    hmap.put(arguments[1], oval);
                    // ReportFunctions.LogRepoter("Pass",
                    // "Storevalue","Successfully stored the value " + oval + "
                    // in " + " " + arguments[1]);
                } else if ((arguments[2].contains("+"))) {

                    values = splitfunction(arguments[2], "+");
                    if (values.length > 2) {
                        if ((hmap.containsKey(values[0]))
                                && (hmap.containsKey(values[1]) && (hmap.containsKey(values[2])))) {
                            Float firstval = Float.parseFloat(hmap.get(values[0]));
                            Float Secval = Float.parseFloat(hmap.get(values[1]));
                            Float thirdval = Float.parseFloat(hmap.get(values[2]));
                            value = String.valueOf(firstval + Secval + thirdval);
                            hmap.put(arguments[1], value);
                            // ReportFunctions.LogRepoter("Pass",
                            // "Storevalue","Successfully stored the value " +
                            // value + " in " + " " + arguments[1]);
                        } else {
                            // ReportFunctions.LogRepoter("Fail", "verify
                            // Value", "Failed to find values in hash map ");
                        }
                    } else if (values.length == 2) {
                        if ((hmap.containsKey(values[0])) && (hmap.containsKey(values[1]))) {
                            Float firstval = Float.parseFloat(hmap.get(values[0]));
                            Float Secval = Float.parseFloat(hmap.get(values[1]));
                            value = String.valueOf(firstval + Secval);
                            hmap.put(arguments[1], value);
                            // ReportFunctions.LogRepoter("Pass",
                            // "Storevalue","Successfully stored the value " +
                            // value + " in " + " " + arguments[1]);
                        } else {
                            // ReportFunctions.LogRepoter("Fail", "verify
                            // Value", "Failed to find values in hash map ");
                        }
                    }
                } else if ((arguments[2].contains("*"))) {

                    values = splitfunction(arguments[2], "*");
                    if ((hmap.containsKey(values[0])) && (hmap.containsKey(values[1]))) {
                        Float firstval = Float.parseFloat(hmap.get(values[0]));
                        Float Secval = Float.parseFloat(hmap.get(values[1]));
                        value = String.valueOf(firstval * Secval);
                        hmap.put(arguments[1], value);
                        // ReportFunctions.LogRepoter("Pass",
                        // "Storevalue","Successfully stored the value " + value
                        // + " in " + " " + arguments[1]);
                    } else {
                        // ReportFunctions.LogRepoter("Fail", "verify Value",
                        // "Failed to find values in ");
                    }

                } else if ((arguments[2].contains("minus"))) {
                    values = splitfunction(arguments[2], "minus");
                    if ((hmap.containsKey(values[0])) && (hmap.containsKey(values[1]))) {
                        Float firstval = Float.parseFloat(hmap.get(values[0]));
                        Float Secval = Float.parseFloat(hmap.get(values[1]));
                        value = String.valueOf(firstval - Secval);
                        hmap.put(arguments[1], value);
                        // ReportFunctions.LogRepoter("Pass",
                        // "Storevalue","Successfully stored the value " + value
                        // + " in " + " " + arguments[1]);
                    } else {
                        // ReportFunctions.LogRepoter("Fail", "verify Value",
                        // "Failed to find values in ");
                    }

                } else {
                    hmap.put(arguments[1], arguments[2]);
                    // ReportFunctions.LogRepoter("Pass",
                    // "Storevalue","Successfully stored the value " +
                    // arguments[2] + " in " + " " + arguments[1]);
                }

            } else {
                // ReportFunctions.LogRepoter("Fail", "Storevalue", "Failed
                // stored the value as one of input is empty");
                // CLOSEALLBROWSERS(driver);
                Status = false;
            }

        } catch (Exception e) {
            // ReportFunctions.LogRepoter("Fail", "Storevalue", "Failed stored
            // the value as input is wrong " + e);
            // CLOSEALLBROWSERS(driver);
            Status = false;

        }
        return Status;
    }

    public static boolean GettextandIncrement(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String ovalue = null;
        String key;
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            key = arguments[3];
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0];
                if (hmap.containsKey(newval)) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0];
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                            System.out.println("Succesfully clicked on" + " " + arguments[1]);
                            if (arguments[1].contains("+")) {
                                arguments1 = splitfunction(arguments[1], "+");
                                arguments2 = splitfunction(arguments1[1], "+");
                                newval = arguments2[0];
                                if (hmap.containsKey(newval)) {
                                    revalue = hmap.get(newval);
                                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                                    System.out.println("Succesfully clicked on" + " " + arguments[1]);
                                } else {
                                    ReportFunctions.LogRepoter("Fail", "wait for the element", "key not found in hashmap");
                                    return false;
                                }
                            }

                        }
                    }
                }
            }

            WebElement locator = Getlocator(driver, arguments[1]);
            ovalue = locator.getAttribute("value");
            if (ovalue == null) {
                ovalue = locator.getText();
            }
            if (ovalue != null) {
//ovalue = GettextandIncrementvalue(ovalue);
                hmap.put(key, ovalue);
                System.out.println("captured the value" + " " + arguments[2] + " " + ovalue);
// ReportFunctions.LogRepoter("pass", "capture the text", "captured the value" + " " + arguments[2] + " " + ovalue);
                return true;
            } else {
                System.out.println("value is null" + " " + ovalue);
                ReportFunctions.LogRepoter("Fail", "capture the text", " unable to capture the value" + " " + arguments[2]);
                CLOSEALLBROWSERS(driver);
                return false;
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            ReportFunctions.LogRepoter("Fail", "capture the text", " unable to locate the element");
            CLOSEALLBROWSERS(driver);
            return false;
        }

    }

    public static Boolean Multi_Select(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        INVISIBLEOFLOAD(driver);
        String[] arguments = splitfunction(Parameters, "->");
        String local_wait = wait;
        try {
            if (arguments != null && arguments.length >= 4) {
                local_wait = arguments[3];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WAITTIME("waittime->" + local_wait);
        int j = 0;
        Boolean Status = true;
        RecoveryScenarios();
        String value;
        String[] arg;

        String label = arguments[1].trim();
        // String xpath1 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//button";
        String xpath2 = "xpath:=//label[contains(text(),\"" + label + "\")]/ancestor::td//input[@type='text']";
        String xpath1 = "xpath:=//label[contains(text(),\"" + label + "\")]/ancestor::td//button";
        try {
            WAITTIME("waittime->" + local_wait);
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            WebElement locator = Getlocator(driver, xpath1);
            locator.click();
            INVISIBLEOFLOAD(driver);
            WAITTIME("waittime->" + local_wait);
            if (arguments[2].contains("&")) {
                arg = arguments[2].split("&");

                for (int i = 0; i < arg.length; i++) {

                    for (j = 0; j < i; j++) {
                        arg[j] = arg[i];
                    }
                    if (hmap.containsKey(arg[j])) {
                        value = hmap.get(arg[j]);
                    } else {
                        value = arg[j];
                    }

                    WebElement search1 = Getlocator(driver, xpath2);
                    search1.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                    search1.clear();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                    search1.sendKeys(value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                    //String xpath3 = "xpath:=//td[text()=\"" + label
                    //      + "\"]/following-sibling::td//label[contains(text(),\"" + arg[j] + "\")]/input";
                    String xpath3 = "xpath:=(//label[contains(text(),\"" + label + "\")]/preceding-sibling::div//input[contains(@value,\"" + value + "\")])";
                    WebElement select1 = Getlocator(driver, xpath3);
                    INVISIBLEOFLOAD(driver);
                    select1.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                }

            } else {
// locator.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->" + local_wait);
                WebElement search1 = Getlocator(driver, xpath2);
                search1.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->" + local_wait);
                search1.clear();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->" + local_wait);
                search1.sendKeys(arguments[2]);
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->" + local_wait);
                String xpath3 = "xpath:=//label//input[@value=\"" + arguments[2] + "\"]";
                INVISIBLEOFLOAD(driver);
                WebElement select1 = Getlocator(driver, xpath3);
                if (select1 != null) {
                    select1.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->" + local_wait);
                }
            }
            locator.click();
            INVISIBLEOFLOAD(driver);
        } catch (Exception e) {
// ReportFunctions.LogRepoter("Fail", "Search_Enter", "Failed to
// enter value " + e);
// CLOSEALLBROWSERS(driver);
            Status = false;

        }
        return Status;

    }

    public static boolean GettextandIncrementvalue(String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String[] arguments = null;
        String revalue = null;
        Boolean flag = false;
        Boolean status = true;
        int go = 0;
        RecoveryScenarios();
        try {
            arguments = splitfunction(parameters, "->");
            if (hmap.containsKey(arguments[2])) {
                revalue = hmap.get(arguments[2]);
            } else {
                revalue = arguments[2];
            }
            String number = "";
            String letter = "";
            String zeros = "";
            String ovalue = null;
            String key = null;
            int count = 0;
            for (int i = 0; i < revalue.length(); i++) {
                char a = revalue.charAt(i);
                if (Character.isDigit(a)) {
                    String c = String.valueOf(a);
                    if (c.equals("0") && (flag == false)) {
                        count = count + 1;
                    }
                    if (go == 1) {
                        number = number + a;
                    } else {
                        if (!"0".equalsIgnoreCase(c)) {
                            number = number + a;
                            flag = true;
                            go = 1;
                        }
                    }
                } else {
                    letter = letter + a;

                }
            }
            for (int i = 1; i <= count; i++) {
                zeros = zeros + 0;
            }
            int numbers = Integer.parseInt(String.valueOf(number));
            numbers = numbers + 1;
            String fvalue = letter + zeros + numbers;
            System.out.println("Numbers in String:" + letter + zeros + numbers);
            hmap.put(arguments[1], fvalue);
            // ReportFunctions.LogRepoter("Pass", "Increment the value", "Sucessfully incremented the value" + " " + fvalue);
            System.out.println(fvalue);
        } catch (Exception e) {
            status = false;

        }
        return status;

    }

    public static Boolean Verify_NotNull(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String ovalue = null;
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(Parameters, "->");
            WebElement locator = Getlocator(driver, arguments[1]);
            ovalue = locator.getAttribute("value");
            if (ovalue == null) {
                ovalue = locator.getText();
            }
            if (ovalue != null) {
                System.out.println("captured the value" + "  " + arguments[2] + "   " + ovalue);
                // //ReportFunctions.LogRepoter("pass", "capture the text", "captured the value" + "  " + arguments[2] + "   " + ovalue);
                return true;
            } else {
                System.out.println("value is null" + " " + ovalue);
                //ReportFunctions.LogRepoter("Fail", "capture the text", " unable to capture the value" + "  " + arguments[2]);
                CLOSEALLBROWSERS(driver);
                return false;
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "capture the text", " unable to locate the element");
            CLOSEALLBROWSERS(driver);
            return false;
        }
    }

    public static boolean New_Click(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        INVISIBLEOFLOAD(driver);
        RecoveryScenarios();
        WAITTIME("WAITTIME->5");
        Boolean Status = false;
        String[] arguments = null;
        String val1 = null;
        String val2 = null;
        int index = 1;
        Boolean flag = true;
        String local_wait = wait;
        arguments = splitfunction(parameters, "->");
        try {
            if (arguments != null && arguments.length >= 3) {
                local_wait = arguments[2];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        WAITTIME("WAITTIME->" + local_wait);

        try {
            String case1;
            String case2;
            String case3;
            String case4;
            String case5;
            String case6;
            String case7;
            String case8;
            String case9;
            String case10;
            String case11;
            String case12;
            String case13;
            String case14;
            String case15;
            String case16;
            String case17;
            String case18;
            String case19;
            String case20;
            String case21;
            String case22;
            String case23;
            String case24;
            String case25;
            String case26;
            String case27;
            String case28;
            String case29;
            String case30;
            String case31;
            String case32;
            String case33;
            String case34;
            String case35;
            WebElement one = null;
            WebElement two = null;
            WebElement three = null;
            WebElement four = null;
            WebElement five = null;
            WebElement six = null;
            WebElement seven = null;
            WebElement eight = null;
            WebElement nine = null;
            WebElement ten = null;
            WebElement eleven = null;
            WebElement twelve = null;
            WebElement thirteen = null;
            WebElement fourteen = null;
            WebElement fifteen = null;
            WebElement sixten = null;
            WebElement seventeen = null;
            WebElement eighteen = null;
            WebElement nineteen = null;
            WebElement twenty = null;
            WebElement twentyone = null;
            WebElement twentytwo = null;
            WebElement twentythree = null;
            WebElement twentyfour = null;
            WebElement twentyfive = null;
            WebElement twentysix = null;
            WebElement twentyseven = null;
            WebElement twentyeight = null;
            WebElement twentynine = null;
            WebElement thirty = null;
            WebElement thirtyone = null;
            WebElement thirtytwo = null;
            WebElement thirtythree = null;
            WebElement thirtyfour = null;
            WebElement thirtyfive = null;
            WAITTIME("WAITTIME->" + local_wait);
            if (arguments[1].contains(",")) {
                String[] args = splitfunction(arguments[1], ",");
                flag = false;
                if (args[0].contains("+")) {
                    args[0] = args[0].replace("+", "");
                    if (hmap.containsKey(args[0].trim())) {
                        val1 = hmap.get(args[0].trim());
                    } else {
                        System.out.println(args[0] + " value missing in Haspmap or incorrect label name");
                    }
                } else {
                    val1 = args[0].trim();
                }
                if (args[1].contains("+")) {
                    args[1] = args[1].replace("+", "");
                    if (hmap.containsKey(args[1].trim())) {
                        val2 = hmap.get(args[1].trim());
                    } else {
                        System.out.println(args[0] + " value missing in Haspmap or incorrect label name");
                    }
                } else {
                    val2 = args[1].trim();
                }
                if (val2.contains("index")) {
                    String ind[] = splitfunction(val2, "[");
                    index = Integer.parseInt(ind[1].replace("]", ""));
                    val2 = "";
                    flag = true;
                } else if (val2.contains("keyindex")) {
                    String ind[] = splitfunction(val2, "[");
                    ind[1] = ind[1].replace("]", "");
                    if (hmap.containsKey(ind[1])) {
                        index = Integer.parseInt((hmap.get(ind[1])));
                    }
                    val2 = "";
                    flag = true;
                }
            } else {
                if (hmap.containsKey(arguments[1])) {
                    val1 = hmap.get(arguments[1]);
                } else {
                    val1 = arguments[1];
                }
            }
            WAITTIME("WAITTIME->" + local_wait);
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + val1 + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + val1 + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            if (flag == true) {
                case1 = "xpath:=(//i[@title=\"" + val1 + "\"])[\"" + index + "\"]";
                case2 = "xpath:=(//button[(text()=\"" + val1 + "\")])[\"" + index + "\"]";
                case3 = "xpath:=(//button[(@id=\"" + val1 + "\")])[\"" + index + "\"]";
                case4 = "xpath:=(//div[(text()=\"" + val1 + "\")]/ancestor::div/following-sibling::div//td[" + pos + "])[1]//a[\"" + index + "\"]";
                case6 = "xpath:=(//a[@title=\"" + val1 + "\"])[\"" + index + "\"]";
                case7 = "xpath:=(//button[text()=\"" + val1 + "\"])[\"" + index + "\"]";
                case8 = "xpath:=(//input[@id=\"" + val1 + "\"])[\"" + index + "\"]";
                case9 = "xpath:=(//button[@name=\"" + val1 + "\"])[\"" + index + "\"]";
                case10 = "xpath:=(//button[@name=\"" + val1 + "\"]/parent::div/preceding-sibling::div//button[contains(text(),\"" + val1 + "\"))])[\"" + index + "\"]";
                case11 = "xpath:=(//a[text()=\"" + val1 + "\"]/parent::td/preceding-sibling::td//label)[\"" + index + "\"]";
                case12 = "id:=(\"" + val1 + "\")[\"" + index + "\"]";
                case13 = "xpath:=//w[contains(@class,'fa-bars')]";
                case14 = "xpath:=(//ul[@class='dropdown-menu']//a[text()=\"" + val1 + "\"])[\"" + index + "\"]";
                case15 = "xpath:=//th[contains(text(),\"" + val1 + "\")]/ancestor::div/following-sibling::div//td[\"" + index + "\"]//a";
                case16 = "xpath:=(//img[@title=\"" + val1 + "\"])[\"" + index + "\"]";
                case17 = "xpath:=(//img[starts-with(@id,\"" + val1 + "\")])[\"" + index + "\"]";
                case18 = "xpath:=(//span[text()=\"" + val1 + "\"])[\"" + index + "\"]";
                case19 = "xpath:=(//td[starts-with(text(),\"" + val1 + "\")]/following-sibling::td//input)[\"" + index + "\"]";
                case20 = "xpath:=(//td[(text()=\"" + val1 + "\")])[\"" + index + "\"]";
                case22 = "xpath:=(//label[contains(text(),\"" + val1 + "\")])[\"" + index + "\"]";
                case23 = "xpath:=(//td[starts-with(text(),\"" + val1 + "\")]/following-sibling::td//input)[\"" + index + "\"]";
                case24 = "xpath:=(//a[text()=\"" + val1 + "\"])[\"" + index + "\"]";
                case26 = "xpath:=(//div[@title=\"" + val1 + "\"][\"" + index + "\"])";
                case30 = "xpath:=(//div[text()=\"" + val1 + "\"])[\"" + index + "\"]";
                case33 = "xpath:=//input[@placeholder=\"" + val1 + "\"]";
                case34 = "xpath:=//label[text()=\"" + val1 + "\"]/preceding-sibling::input[\"" + index + "\"]";
                case35 = "xpath:=(//button[(@id=\"" + val1 + "\")])[\"" + index + "\"]";

                one = Getlocator(driver, case1);
                two = Getlocator(driver, case2);
                three = Getlocator(driver, case3);
                four = Getlocator(driver, case4);
                six = Getlocator(driver, case6);
                seven = Getlocator(driver, case7);
                eight = Getlocator(driver, case8);
                nine = Getlocator(driver, case9);
                ten = Getlocator(driver, case10);
                eleven = Getlocator(driver, case11);
                twelve = Getlocator(driver, case12);
                thirteen = Getlocator(driver, case13);
                fourteen = Getlocator(driver, case14);
                fifteen = Getlocator(driver, case15);
                sixten = Getlocator(driver, case16);
                seventeen = Getlocator(driver, case17);
                eighteen = Getlocator(driver, case18);
                nineteen = Getlocator(driver, case19);
                twenty = Getlocator(driver, case20);
                twentytwo = Getlocator(driver, case22);
                twentythree = Getlocator(driver, case23);
                twentyfour = Getlocator(driver, case24);
                twentysix = Getlocator(driver, case26);
                thirty = Getlocator(driver, case30);
                thirtythree = Getlocator(driver, case33);
                thirtyfour = Getlocator(driver, case34);
                thirtyfive = Getlocator(driver, case35);
            } else {
                case5 = "xpath:=(//label[contains(text(),\"" + val1 + "\")]/preceding-sibling::div//input[@value=\"" + val2 + "\"])[\"" + index + "\"]";
                case21 = "xpath:=(//td[contains(text(),\"" + val1 + "\")]/preceding-sibling::td//input[@value=\"" + val2 + "\"])[\"" + index + "\"]";
                case25 = "xpath:=(//label[contains(text(),\"" + val1 + "\")]/following-sibling::div//input[@value=\"" + val2 + "\"])[\"" + index + "\"]";
                case27 = "xpath:=//tr[contains(text(),\"" + val1 + "\")]/following-sibling::tr//label[text()=\"" + val2 + "\"][\"" + index + "\"]";
                case28 = "xpath:=//label[contains(text(),\"" + val1 + "\")]/following-sibling::div//button[@title=\"" + val2 + "\"][\"" + index + "\"]";
                case29 = "xpath:=//td[contains(text(),\"" + val1 + "\")]/following-sibling::td//option[text()=\"" + val2 + "\"][\"" + index + "\"]";
                case31 = "xpath:=//strong[text()=\"" + val1 + "\"]/parent::div/following-sibling::div//button[@title=\"" + val2 + "\"]";
                case32 = "xpath:= (//label[text()=\"" + val1 + "\"]/ancestor::div//following-sibling::div//button[@title=\"" + val2 + "\"])[\"" + index + "\"]";
                five = Getlocator(driver, case5);
                twentyone = Getlocator(driver, case21);
                twentyfive = Getlocator(driver, case25);
                twentyseven = Getlocator(driver, case27);
                twentyeight = Getlocator(driver, case28);
                twentynine = Getlocator(driver, case29);
                thirtyone = Getlocator(driver, case31);
                thirtytwo = Getlocator(driver, case32);
            }

            if (one != null) {
                one.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (two != null) {
                two.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (three != null) {
                three.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (four != null) {
                four.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (five != null) {
                five.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (six != null) {
                six.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (seven != null) {
                seven.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (eight != null) {
                eight.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (nine != null) {
                nine.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (ten != null) {
                ten.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (eleven != null) {
                eleven.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twelve != null) {
                twelve.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (thirteen != null) {
                thirteen.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (thirty != null) {
                thirty.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (fourteen != null) {
                fourteen.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (fifteen != null) {
                fifteen.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (sixten != null) {
                sixten.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (seventeen != null) {
                seventeen.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (eighteen != null) {
                eighteen.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (nineteen != null) {
                nineteen.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twenty != null) {
                twenty.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentyone != null) {
                twentyone.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (thirtyfour != null) {
                thirtyfour.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentytwo != null) {
                twentytwo.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentythree != null) {
                twentythree.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentyfour != null) {
                twentyfour.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentyfive != null) {
                twentyfive.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentysix != null) {
                twentysix.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentyseven != null) {
                twentyseven.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentyeight != null) {
                twentyeight.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (twentynine != null) {
                twentynine.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (thirtyone != null) {
                thirtyone.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (thirtytwo != null) {
                thirtytwo.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (thirtythree != null) {
                thirtythree.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else if (thirtyfive != null) {
                thirtyfive.click();
                INVISIBLEOFLOAD(driver);
                Status = true;
            } else {
                System.out.println("unable to identify xpath for " + arguments[1]);
                Status = false;
            }
            WAITTIME("WAITTIME->" + local_wait);
        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Dropdownchkbox(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean Status = false;
        //WAITTIME("WAITTIME->4");
        INVISIBLEOFLOAD(driver);
        RecoveryScenarios();
        String label;
        String data;
        try {
            String[] arguments = null;
            arguments = splitfunction(Parameters, "->");

            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("WAITTIME->" + local_wait);
            if (hmap.containsKey(arguments[2])) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
//            label = "xpath:= (//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input/parent::div//button)[1]";
//            data = "xpath:=//li[@class=\"ui-menu-item\"]//a[text()=\"" + arguments[2] + "\"]";
//            String data1 = "xpath:=(//label[contains(text(),\"" + arguments[1] + "\")]/preceding-sibling::input/parent::div//label[text()=\"" + arguments[2] + "\"])[1]";
            label = "xpath:= //label[text()=\"" + arguments[1] + "\"]/preceding-sibling::div//button";
            data = "xpath:=(//label[contains(text(),\"" + arguments[1] + "\")]/preceding-sibling::div//input[@value=\"" + arguments[2] + "\"])[1]";
            String data1 = "xpath:=(//label[contains(text(),\"" + arguments[1] + "\")]/preceding-sibling::div//label[text()=\"" + arguments[2] + "\"])[1]";
            WAITFORELEMENT(driver, "waitforelement->" + label + "->" + arguments[1] + "");
            WebElement labelname = Getlocator(driver, label);

            if (labelname != null) {
                // labelname.click();
                String[] args = splitfunction(label, ":=");
                clickElementUsingJavascriptExecutor(args[1]);
                WAITTIME("WAITTIME->" + local_wait);
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + data + "->" + arguments[2] + "");
                WebElement rdata;
                WebElement udata = Getlocator(driver, data);
                WebElement vdata = Getlocator(driver, data1);
                if (udata != null) {
                    rdata = udata;
                } else {
                    rdata = vdata;
                }
                if (rdata != null) {
                    WAITTIME("WAITTIME->" + local_wait);
                    rdata.click();
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    // labelname.click();
                    clickElementUsingJavascriptExecutor(args[1]);
                    WAITTIME("WAITTIME->" + local_wait);
                    Status = true;
                } else {
                    ReportFunctions.LogRepoter("Fail", "Dropdownchkbox", "Unable to find label name" + arguments[1]);
                }
            } else {
                ReportFunctions.LogRepoter("Fail", "Dropdownchkbox", "Unable to find data" + arguments[2]);
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            Status = false;
        }

        return Status;
    }

    public static boolean Set_Value(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String[] arguments = null;
        boolean Status = false;
        arguments = splitfunction(Parameters, "->");
        String local_wait = wait;
        try {
            if (arguments != null && arguments.length >= 4) {
                local_wait = arguments[3];
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if ((arguments[2].toUpperCase().contains("SYSDATE")) || (arguments[2].toUpperCase().contains("SYSDATE,"))) {
            Status = selectDate(Parameters);
        } else {
            WAITTIME("WAITTIME->" + local_wait);
            String xpath1;
            String xpath2;
            String xpath3 = null;
            String xpath4 = null;
            String xpath5 = null;
            String xpath6 = null;
            String xpath7 = null;
            String xpath8 = null;
            String xpath9 = null;
            String xpath10 = null;
            String xpath11 = null;
            String xpath12 = null;
            String xpath13 = null;
            WAITTIME("WAITTIME->" + local_wait);
            INVISIBLEOFLOAD(driver);
            RecoveryScenarios();
            try {
                if ((arguments[2].toUpperCase().contains("SYSDATE"))) {
                    day = getDate(arguments[2]);
                    if (Integer.parseInt(day) < 10) {
                        day = day.substring(1, 2);
                    }
                }
                arguments = splitfunction(Parameters, "->");
                if (arguments[1].contains(",")) {
                    String args[] = splitfunction(arguments[1], ",");
                    xpath3 = "xpath:= //th[contains(text(),\"" + args[0] + "\")]/ancestor::thead/following-sibling::tbody//td[" + args[1] + "]//input";
                }
                if (hmap.containsKey(arguments[2])) {
                    arguments[2] = hmap.get(arguments[2].trim());
                }
                xpath1 = "xpath:= //label[text()=\"" + arguments[1] + "\"]/preceding-sibling::textarea";
                xpath11 = "xpath:= //th[text()=\"" + arguments[1] + "\"]/following::textarea";
                xpath13 = "xpath:= //label[text()=\"" + arguments[1] + "\"]/following::textarea";
                xpath8 = "xpath:= //div[@class=\"WBTableRender\"]//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
                xpath2 = "xpath:= //label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
                xpath4 = "xpath:= //label[text()=\"" + arguments[1] + "\"]/following-sibling::div//input";
                xpath5 = "xpath:= //input[@placeholder=\"" + arguments[1] + "\"]";
                xpath6 = "xpath:= //div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[4]";
                xpath7 = "xpath:= //td[text()=\"" + arguments[1] + "\"]/following-sibling::td/input";
                xpath9 = "xpath:= //div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//tbody//tr/td/following-sibling::td[15]/input";
                xpath10 = "xpath:= (//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[5]//input)[1]";
                xpath12 = "xpath:= //td[text()=\"" + arguments[1] + "\"]/following-sibling::td/textarea";
                WebElement labelname1 = Getlocator(driver, xpath1);
                WebElement labelname8 = Getlocator(driver, xpath8);
                WebElement labelname2 = Getlocator(driver, xpath2);
                WebElement labelname3 = Getlocator(driver, xpath3);
                WebElement labelname4 = Getlocator(driver, xpath4);
                WebElement labelname5 = Getlocator(driver, xpath5);
                WebElement labelname6 = Getlocator(driver, xpath6);
                WebElement labelname7 = Getlocator(driver, xpath7);
                WebElement labelname9 = Getlocator(driver, xpath9);
                WebElement labelname10 = Getlocator(driver, xpath10);
                WebElement labelname11 = Getlocator(driver, xpath11);
                WebElement labelname12 = Getlocator(driver, xpath12);
                WebElement labelname13 = Getlocator(driver, xpath13);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + arguments[1] + "");
                arguments[2]=arguments[2].trim();
                if (labelname1 != null) {
                    labelname1.clear();
                    labelname1.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (labelname8 != null) {
                    labelname8.clear();
                    // typeValueUsingJavaScriptExecutor("//div[@class=\"WBTableRender\"]//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input", value);	
                    //  SENDKEYS(webdriver, "SENDKEYS->TAB");	
                    labelname8.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (labelname9 != null) {
                    labelname9.clear();
                    labelname9.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    Status = true;

                } else if (labelname7 != null) {
                    labelname7.clear();
                    labelname7.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (labelname2 != null) {
                    labelname2.clear();
                    labelname2.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    Status = true;

                } else if (labelname3 != null) {
                    labelname3.clear();
                    labelname3.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    Status = true;

                } else if (labelname4 != null) {
                    labelname4.clear();
                    labelname4.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->" + local_wait);
                    Status = true;

                } else if (labelname5 != null) {
                    labelname5.clear();
                    labelname5.sendKeys(arguments[2]);
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (labelname11 != null) {
                    labelname11.sendKeys(arguments[2]);
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (labelname6 != null) {
                    labelname6.sendKeys(arguments[2]);
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (labelname10 != null) {
                    labelname10.sendKeys(arguments[2]);
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (labelname12 != null) {
                    labelname12.sendKeys(arguments[2]);
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;

                } else if (labelname13 != null) {
                    labelname13.sendKeys(arguments[2]);
                    WAITTIME("WAITTIME->" + local_wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;

                } else {
                    ReportFunctions.LogRepoter("Fail", "Dropdownchkbox", "Unable to find data" + arguments[2]);
                }

            } catch (Exception e) {
                System.out.println("exception value : " + e.getMessage());
                return false;
            }
        }
        return Status;
    }

    public static boolean SelectLine(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, Exception {
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        String search;
        String search2;

        INVISIBLEOFLOAD(driver);
        try {
            String[] arguments = null;
            String[] argu1 = null;
            String[] argu2 = null;
            arguments = splitfunction(Parameters, "->");
            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("WAITTIME->" + local_wait);
            argu1 = splitfunction(arguments[1], "|");
            argu2 = splitfunction(arguments[2], "|");
            if (hmap.containsKey(argu1[0].trim())) {
                argu1[0] = hmap.get(argu1[0].trim());
            }
            if (hmap.containsKey(argu2[0].trim())) {
                argu2[0] = hmap.get(argu2[0].trim());
            }
            if (hmap.containsKey(argu1[1].trim())) {
                argu2[1] = hmap.get(argu2[1].trim());
            }
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + argu1[0] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + argu1[0] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            xpath1 = "xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "]//input)[" + argu1[1] + "]";
            xpath2 = "xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(text()=\"" + argu2[0] + "\")])[" + argu2[1] + "]";
            xpath3 = "xpath:=(//textarea09)";
            String xpath4 = "xpath:=//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::table//tr[" + argu1[1] + "]//td[" + pos + "]//input";
            String xpath5 = "xpath:=(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "])[" + argu1[1] + "]" + "//i[@class=\"fa fa-calendar fa-1x\"]";
            //  if ((argu1[0].toUpperCase().contains("DATE")) || (argu1[0].toUpperCase().contains("HOURS")) || (argu1[0].toUpperCase().contains("ORGANIZATION")) || (argu1[0].toUpperCase().contains("UNIT PRICE")) || (argu1[0].toUpperCase().contains("Est. Schedule Hour"))) {
            if ((argu1[0].toUpperCase().contains("DATE")) || (argu1[0].toUpperCase().contains("HOURS")) || (argu1[0].toUpperCase().contains("UNIT PRICE")) || (argu1[0].toUpperCase().contains("Est. Schedule Hour"))) {
                WAITFORELEMENT(driver, "waitforelement->" + xpath4 + "->" + argu1[0] + "");
                WebElement date = Getlocator(driver, xpath4);
                if (argu2[0].toUpperCase().contains("SYSDATE")) {
                    String sysdat = Sysdate(argu2[0]);
                    WAITTIME("WAITTIME->" + local_wait);
                    WebElement datepicker = Getlocator(driver, xpath5);
                    if (datepicker != null) {
                        Status = selectDate_Line("selectDate_Line->" + xpath5 + "->" + argu2[0]);
                    } else {
                        System.out.println("unable to select date");
                    }
//                    date.click();
//                    date.sendKeys(sysdat);
//                    WAITTIME("WAITTIME->3");
//                    INVISIBLEOFLOAD(driver);
//                    SENDKEYS(webdriver, "SENDKEYS->TAB");
                    Status = true;
                } else {
                    String args1[] = xpath1.split("xpath:=");
                    String args2[] = xpath2.split("xpath:=");
                    date.clear();
                    date.sendKeys(argu2[0]);
                    // typeValueUsingJavaScriptExecutor(args1[1], argu2[0]);                            
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->" + local_wait);
                    WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + argu2[0] + "");
                    clickElementUsingJavascriptExecutor(args2[1]);
                    WAITTIME("WAITTIME->" + local_wait);
                    //SENDKEYS(driver, "SENDKEYS->ENTER");
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                    search = "xpath:=//input[@id='searchString']";
                    String Search2 = "xpath:=//button[@id=\"save\"]/ancestor::div//following-sibling::div//input[@id=\"listTable_search\"]";
                    WAITTIME("WAITTIME->" + local_wait);

                    WebElement Searc1 = Getlocator(driver, search);
                    WebElement Searc2 = Getlocator(driver, Search2);
                    WebElement Searc = null;
                    if (Searc2 != null) {
                        Searc = Searc2;
                    } else {
                        Searc = Searc1;
                    }
                    if (Searc != null) {
                        Searc.clear();
                        Searc.sendKeys(argu2[0]);
                        New_Click(driver, "New_Click->search");
                        WAITFORELEMENT(driver, "WAITFORELEMENT->xpath:=//td[starts-with(text(),\"" + argu2[0] + "\")]->search value");
                        CLICK(driver, "CLICK->xpath:=//td[starts-with(text(),\"" + argu2[0] + "\")]->searchName");
                        New_Click(driver, "New_Click->save");
                        Status = true;
                    } else {
                        //WAITTIME("WAITTIME->3");
                        // Upload_File("upload_file->ENTER");
                        SENDKEYS(webdriver, "SENDKEYS->ENTER");
                        //SENDKEYS(driver, "SENDKEYS->ENTER");
                        INVISIBLEOFLOAD(driver);
                    }
                }
            } else {
                if (argu2[0].toUpperCase().contains("SYSDATE")) {
                    String sysdat = Sysdate(argu2[0]);
                    WAITTIME("WAITTIME->" + local_wait);
                    WebElement datepicker = Getlocator(driver, xpath5);
                    if (datepicker != null) {
                        Status = selectDate_Line("selectDate_Line->" + xpath5 + "->" + argu2[0]);
                    } else {
                        System.out.println("unable to select date");
                    }
                } else {

                    search = "xpath:=//input[@id='searchString']";
                    search2 = "xpath:=//input[@id='listTable_search']";
                    WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + argu1[0] + "");
                    WebElement label = Getlocator(driver, xpath1);
                    if (label != null) {
                        label.click();
                        WAITTIME("WAITTIME->" + local_wait);
                        WebElement textarea = Getlocator(driver, xpath3);
                        if (textarea != null) {
                            textarea.clear();
                            textarea.sendKeys(argu2[0]);
                            New_Click(driver, "New_Click->Done");
                            WAITTIME("WAITTIME->" + local_wait);
                            Status = true;
                        } else {
                            WAITTIME("WAITTIME->" + local_wait);
                            WebElement Searc1 = Getlocator(driver, search);
                            WebElement Searc2 = Getlocator(driver, search2);
                            WebElement Searc = null;
                            if (Searc2 != null) {
                                Searc = Searc2;
                            } else {
                                Searc = Searc1;
                            }
                            if (Searc != null) {
                                Searc.clear();
                                Searc.sendKeys(argu2[0]);
                                New_Click(driver, "New_Click->search");
                                WAITFORELEMENT(driver, "WAITFORELEMENT->xpath:=//td[starts-with(text(),\"" + argu2[0] + "\")]->search value");
                                CLICK(driver, "CLICK->xpath:=//td[starts-with(text(),\"" + argu2[0] + "\")]->searchName");
                                New_Click(driver, "New_Click->save");
                                Status = true;

                            } else {

                                label = Getlocator(driver, xpath1);
                                label.clear();
                                if (argu1[0].equalsIgnoreCase("Assigned To")) {
                                    WAITTIME("WAITTIME->10");
                                }
                                label.sendKeys(argu2[0]);
//                            String args1[] = xpath1.split("xpath:=");
                                String args2[] = xpath2.split("xpath:=");
//                            typeValueUsingJavaScriptExecutor(args1[1], argu2[0]);                            
                                INVISIBLEOFLOAD(driver);
                                if (argu1[0].equalsIgnoreCase("Assigned To")) {
                                    WAITTIME("WAITTIME->10");
                                }
                                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + argu2[0] + "");
                                clickElementUsingJavascriptExecutor(args2[1]);
                                WAITTIME("WAITTIME->" + local_wait);
                                // SENDKEYS(driver, "SENDKEYS->ENTER");
                                INVISIBLEOFLOAD(driver);
                                try {
                                    WebElement dropval = Getlocator(webdriver, "xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(text()=\"" + argu2[0] + "\")])[" + argu2[1] + "]");
                                    if (dropval != null) {
                                        StaleElementClick(driver, "StaleElementClick->xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(text()=\"" + argu2[0] + "\")])[" + argu2[1] + "]->" + argu1[0]);
                                    }
                                } catch (Exception e) {
                                    System.out.println(e.getMessage());
                                }
                                Status = true;
                            }
                        }
                    } else {
                        ReportFunctions.LogRepoter("Fail", "SelectLine", "Unable to find Label" + argu1[0]);
                    }
                }

            }
            return Status;

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }

    }

    public static boolean SelectLineChkbox(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        String xpath4;

        INVISIBLEOFLOAD(driver);
        RecoveryScenarios();
        try {
            String[] arguments = null;
            String[] argu1 = null;
            String[] argu2 = null;
            arguments = splitfunction(Parameters, "->");
            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("WAITTIME->" + local_wait);
            argu1 = splitfunction(arguments[1], "|");
            argu2 = splitfunction(arguments[2], "|");
            if (hmap.containsKey(argu1[0].trim())) {
                argu1[0] = hmap.get(argu1[0].trim());
            }
            if (hmap.containsKey(argu2[0].trim())) {
                argu2[0] = hmap.get(argu2[0].trim());
            }
            if (hmap.containsKey(argu1[1].trim())) {
                argu2[1] = hmap.get(argu2[1].trim());
            }
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + argu1[0] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + argu1[0] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }

            xpath1 = "xpath:=(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "])[" + argu1[1] + "]";
            xpath2 = "xpath:=(//div[text()=\"" + argu1[0] + "\"]/ancestor::table//tr[" + argu1[1] + "]//div[@class='ms-search']//input[@type='text'])[" + argu2[1] + "]";
            xpath3 = "xpath:=(//div[text()=\"" + argu1[0] + "\"]/ancestor::table//tr[" + argu1[1] + "]//div[@class='ms-search']//input[@type='text'])[" + argu2[1] + "]/ancestor::div/following-sibling::ul//input[@value=\"" + argu2[0] + "\"]";

            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + argu1[0] + "");
            WebElement label = Getlocator(driver, xpath1);
            String[] args1;
            if (label != null) {
                args1 = splitfunction(xpath1, ":=");
                label.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->" + local_wait);
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + argu2[0] + "");
                WebElement data = Getlocator(driver, xpath2);
                if (data != null) {
                    //data.clear();
                    // data.sendKeys(argu2[0]);
                    args1 = splitfunction(xpath2, ":=");
                    typeValueUsingJavaScriptExecutor(args1[1], argu2[0]);
                    INVISIBLEOFLOAD(driver);
                    WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + argu2[0] + "");
                    WAITTIME("WAITTIME->" + local_wait);
                    WebElement value = Getlocator(driver, xpath3);
                    if (value != null) {
                        //value.click();
                        args1 = splitfunction(xpath3, ":=");
                        //label.click();
                        clickElementUsingJavascriptExecutor(args1[1]);
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("WAITTIME->" + local_wait);
                        args1 = splitfunction(xpath1, ":=");
                        //label.click();
                        clickElementUsingJavascriptExecutor(args1[1]);
                        INVISIBLEOFLOAD(driver);
                        Status = true;
                    } else {
                        ReportFunctions.LogRepoter("Fail", "SelectLine", "Unable to find value" + argu2[0]);
                    }

                } else {
                    ReportFunctions.LogRepoter("Fail", "SelectLine", "Unable to find Label" + argu2[0]);
                }
            } else {
                ReportFunctions.LogRepoter("Fail", "SelectLine", "Unable to find Label" + argu1[0]);
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }

        return Status;
    }

    public static boolean SelectAction(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        String xpath4;
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[1].trim())) {
                arguments[1] = hmap.get(arguments[1].trim());
            }
            xpath1 = "xpath:=//a[text()=\"" + arguments[1] + "\"]/parent::td/preceding-sibling::td//label";
            xpath2 = "xpath:=//button[contains(text(),'Actions')]";
            xpath3 = "xpath:=//a[@title=\"" + arguments[2] + "\"]";
            xpath4 = "xpath:=//input[@id='popup_ok']";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
            WebElement Label = Getlocator(driver, xpath1);
            if (Label != null) {
                Label.click();
                WAITTIME("WAITTIME->2");
                INVISIBLEOFLOAD(driver);
                WebElement actionbut = Getlocator(driver, xpath2);
                if (actionbut != null) {
                    actionbut.click();
                    WAITTIME("WAITTIME->2");
                    INVISIBLEOFLOAD(driver);
                    WebElement action = Getlocator(driver, xpath3);
                    if (action != null) {
                        action.click();
                        WAITTIME("WAITTIME->2");
                        INVISIBLEOFLOAD(driver);
                        WebElement ok = Getlocator(driver, xpath4);
                        if (ok != null) {
                            ok.click();
                            WAITTIME("WAITTIME->2");
                            INVISIBLEOFLOAD(driver);
                            Status = true;
                        }
                    } else {
                        ReportFunctions.LogRepoter("Fail", "SelectAction", "Unable to find Label" + arguments[2]);
                    }
                } else {
                    ReportFunctions.LogRepoter("Fail", "SelectAction", "Unable to find Action Button");
                }
            } else {
                ReportFunctions.LogRepoter("Fail", "SelectAction", "Unable to find Label" + arguments[1]);
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }

        return Status;
    }

    public static boolean NavigateNew(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {

        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        RecoveryScenarios();
        Boolean newstatus = true;
        try {
            String[] arguments = splitfunction(Parameters, "->");

            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 3) {
                    local_wait = arguments[2];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            arguments[1]=arguments[1].trim();
            WAITTIME("WAITTIME->" + local_wait);
            String news = "New" + " " + arguments[1];
            String adds = "Add" + " " + arguments[1];
            String button1 = "xpath:=//i[@title=\"" + news + "\"]";
            String button2 = "xpath:=//i[@title=\"" + arguments[1] + "\"]";
            String button3 = "xpath:=//i[contains(@title, 'New')]";
            String button4 = "xpath:=//i[@title=\"" + adds + "\"]";
            String button5 = "xpath:=//img[contains(@title, 'New')]";

            WebElement newbutton = null;
            WebElement newbutton1 = Getlocator(driver, button1);
            WebElement newbutton2 = Getlocator(driver, button2);
            WebElement newbutton3 = Getlocator(driver, button3);
            WebElement newbutton4 = Getlocator(driver, button4);
            WebElement newbutton5 = Getlocator(driver, button5);
            if (newbutton1 != null) {
                newbutton = newbutton1;
            } else if (newbutton2 != null) {
                newbutton = newbutton2;
            } else if (newbutton3 != null) {
                newbutton = newbutton3;
            } else if (newbutton4 != null) {
                newbutton = newbutton4;
            } else if (newbutton5 != null) {
                newbutton = newbutton5;
            } else {
                System.out.println("Unable to find new");
                //  ReportFunctions.LogRepoter("Fail", "Verify new", "unable to find New");
            }
            if (newbutton != null) {
                newbutton.click();
                // ReportFunctions.LogRepoter("Pass", "Click on New", "Clicked on new Button");
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->" + local_wait);
                Status = true;
            } else {
                System.out.println("Unable to find new");
                //ReportFunctions.LogRepoter("Fail", "Verify New", "Verify the New Action: Clicking of Add is failed because unable to find new button");
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }

        return Status;
    }

    public static boolean Search(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        //WAITTIME("WAITTIME->6");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");

            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 3) {
                    local_wait = arguments[2];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            if (hmap.containsKey(arguments[1].trim())) {
                arguments[1] = hmap.get(arguments[1].trim());
            }
            WAITTIME("WAITTIME->" + local_wait);
            INVISIBLEOFLOAD(driver);
            xpath1 = "xpath:=//input[@class='searchTableX']";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
            WebElement Sea = Getlocator(driver, xpath1);
            if (Sea != null) {
                Sea.clear();
                Sea.click();
                Sea.sendKeys(arguments[1]);
                Status = true;
            } else {
                //ReportFunctions.LogRepoter("Fail", "Search", "Unable to find search");
                System.out.println("Unable to find search");
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }

        return Status;
    }

    public static boolean VerifyRecords(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String name;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String xpath2 = "Showing x Records";
            xpath1 = "xpath:=//div[@class='dataTables_info']|//div[@class=\"infoDivLazy\"]";
            if (hmap.containsKey(arguments[1])) {
                int num = Integer.parseInt(hmap.get(arguments[1]));
                arguments[1] = xpath2.replace("x", String.valueOf(num));
            } else if (arguments[1].toUpperCase().contains("SHOWING")) {
                arguments[1] = arguments[1];
            } else {
                arguments[1] = xpath2.replace("x", arguments[1]);
            }
           arguments[1]=arguments[1].trim();
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
            WebElement record = Getlocator(driver, xpath1);
            if (record != null) {
                name = record.getText();
                if (name.equalsIgnoreCase(arguments[1])) {
                    System.out.println("No of records matched");
                    Status = true;
                } else {
                    System.out.println("No of records did not match");
                }
            } else {
                System.out.println("object was not found");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean VerifyValue_Row(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath2;
        String xpath3;
        String name;
        String name1;
        RecoveryScenarios();

        INVISIBLEOFLOAD(driver);
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("WAITTIME->" + local_wait);
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
            }

            if (arguments[2].toUpperCase().contains("SYSDATE")) {
                arguments[2] = Sysdate(arguments[2].trim());
            }
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            xpath2 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "]/input";
            xpath3 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "]";
            if (arguments[1].equalsIgnoreCase("Contact Name")) {
                xpath3 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[2]";
            }

            //  WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + arguments[1] + "");
            WebElement record = Getlocator(driver, xpath2);
            // WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + arguments[1] + "");
            WebElement record1 = Getlocator(driver, xpath3);
            if (record != null) {
                name = record.getAttribute("value");
                if (name == null) {
                    name = record.getText();
                }
                if (name.contentEquals(".")) {
                    String[] arg = splitfunction(name, ".");
                    name = arg[0];
                }
                if (arguments[2].contentEquals(".")) {
                    String[] arg1 = splitfunction(arguments[2], ".");
                    arguments[2] = arg1[0];
                }
                if (name.equalsIgnoreCase(arguments[2])) {
                    Status = true;
                    System.out.println("Both values matched");
                } else {
                    System.out.println("Both values did not match");
                }
            } else if (record1 != null) {
                name1 = record1.getAttribute("value");
                if (name1 == null) {
                    name1 = record1.getText();
                }
                arguments[2] = arguments[2].trim();
                if (name1.equalsIgnoreCase(arguments[2])) {
                    Status = true;
                    System.out.println("Both values matched");
                } else {
                    System.out.println("Both values did not match");
                }
            } else {
                System.out.println("object was not found");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean VerifyValue_Leftpane(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String name;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
            if (arguments[2].toUpperCase().contains("SYSDATE")) {
                arguments[2] = Sysdate(arguments[2].trim());
            }
            arguments[1]=arguments[1].trim();
            xpath1 = "xpath:=//td[starts-with(text(),\"" + arguments[1] + "\")]/following-sibling::td[@class='valueInMasterReport']//b";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
            WebElement record = Getlocator(driver, xpath1);
            if (record != null) {
                name = record.getText();
                if (name.equalsIgnoreCase(arguments[2])) {
                    Status = true;
                    System.out.println("Both values matched");
                } else {
                    System.out.println("Both values did not match");
                }
            } else {
                System.out.println("object was not found");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Gettext_Leftpane(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String name;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[1].trim())) {
                arguments[1] = hmap.get(arguments[1].trim());
            }
            xpath1 = "xpath:=//td[starts-with(text(),\"" + arguments[1] + "\")]/following-sibling::td[@class='valueInMasterReport']//b";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
            WebElement record = Getlocator(driver, xpath1);
            if (record != null) {
                name = record.getText();
                if (name == null) {
                    name = record.getAttribute("value");
                }
                hmap.put(arguments[2], name);
                Status = true;
            } else {
                System.out.println("object was not found");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Gettext_MultipleRow(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        int i = 0;
        String name;
        String temp = null;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            List<WebElement> rowCount = driver.findElements(By.xpath("//div[contains(@class,\"dataTables_scrollBody\")]//tbody/tr"));
            int size = rowCount.size();
            int j = 0;
            for (i = 1; i <= size; i++) {
                j = i;

                xpath1 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//tr[" + i + "]//td[" + pos + "]";
                //WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
                WebElement record = Getlocator(driver, xpath1);
                temp = arguments[2];
                if (record != null) {
                    name = record.getText();
                    if (name == null) {
                        name = record.getAttribute("value");
                    }
                    System.out.println(name);
                    arguments[2] = arguments[2] + j;
                    hmap.put(arguments[2], name);
                    arguments[2] = temp;
                    Status = true;
                } else {
                    System.out.println("object was not found");
                }
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Gettext_Row(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath2;
        String name;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
//             if (hmap.containsKey(arguments[1])) {
//                arguments[1] = hmap.get(arguments[1]);
//            }
            String pos = null;
            arguments[1]=arguments[1].trim();
            String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            xpath2 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + arguments[1] + "");
            WebElement record = Getlocator(driver, xpath2);
            if (record != null) {
                name = record.getText();
                if (name == null) {
                    name = record.getAttribute("value");
                }
                System.out.println(name);
                hmap.put(arguments[2], name);
                Status = true;
            } else {
                System.out.println("object was not found");
            }
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Gettext_Label(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        String xpath4;
        String name;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            xpath3 = "xpath:=//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
            xpath1 = "xpath:=//td/div/span/label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
            xpath2 = "xpath:=//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::textarea";
            xpath4 = "xpath:=//div[@class=\"WBTableRender\"]//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
            // WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
            //WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + arguments[1] + "");
            WebElement record = Getlocator(driver, xpath1);
            WebElement record1 = Getlocator(driver, xpath2);
            WebElement record2 = Getlocator(driver, xpath3);
            WebElement record3 = Getlocator(driver, xpath4);
            if (record3 != null) {
                name = record3.getAttribute("value");
                if (name == null) {
                    name = record3.getText();
                }
                System.out.println(name);
                hmap.put(arguments[2], name);
                Status = true;
                arguments[2]=arguments[2].trim();
            } else if (record != null) {
                name = record.getAttribute("value");
                if (name == null) {
                    name = record.getText();
                }
                System.out.println(name);
                hmap.put(arguments[2], name);
                Status = true;
            } else if (record1 != null) {
                name = record1.getAttribute("value");
                if (name == null) {
                    name = record1.getText();
                }
                System.out.println(name);
                hmap.put(arguments[2], name);
                Status = true;
            } else if (record2 != null) {
                name = record2.getAttribute("value");
                if (name == null) {
                    name = record2.getText();
                }
                System.out.println(name);
                hmap.put(arguments[2], name);
                Status = true;
            } else {
                System.out.println("object was not found");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Copy(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        String xpath4;
        String xpath5;
        String xpath6;
        String xpath7;
        String name;
        String salesordercopy;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
            xpath1 = "xpath:=//a[@class=\"drillDown\"]/img";
            xpath2 = "xpath:= (//input[@id=\"popup_ok\"])";
            xpath6 = "xpath:= (//input[@id=\"popup_ok\"])[1]";
            xpath3 = "xpath:=(//img[@title=\"" + arguments[2] + "\"])";
            xpath4 = "xpath:=(//td//a)[2]//img";
            xpath5 = "xpath:=(//img[@title=\"" + arguments[2] + "\"])";
            xpath7 = "xpath:=//td[contains(text(),\"Done!\")]";
            // WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
            WebElement Copy1 = Getlocator(driver, xpath1);
            WebElement Copy2 = Getlocator(driver, xpath2);
            WebElement Copy3 = Getlocator(driver, xpath3);
            WebElement Copy4 = Getlocator(driver, xpath4);
            WebElement Copy5 = Getlocator(driver, xpath5);

            WebElement Copy = null;
            if (Copy1 != null) {
                Copy = Copy1;
            } else if (Copy2 != null) {
                Copy = Copy2;
            } else if (Copy3 != null) {
                Copy = Copy3;
            } else if (Copy4 != null) {
                Copy = Copy4;
            } else {
                Copy = Copy5;
            }
            if (Copy != null) {
                Copy.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + arguments[2] + "");
                WebElement Ok = Getlocator(driver, xpath2);
                if (Ok != null) {
                    WebElement so = Getlocator(driver, xpath7);
                    if (so != null) {
                        salesordercopy = so.getAttribute("value");
                        if (salesordercopy != null) {

                        } else {
                            salesordercopy = so.getText();
                        }
                        String args[] = splitfunction(salesordercopy, ":");
                        String args1[] = splitfunction(args[1], "successfully");
                        hmap.put(arguments[1], args1[0].trim());
                    }
                    Ok.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->2");
                    Status = true;
                    //WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + arguments[1] + "");
                    WebElement Ok1 = Getlocator(driver, xpath6);
                    if (Ok1 != null) {
                        WebElement so1 = Getlocator(driver, xpath7);
                        if (so1 != null) {
                            salesordercopy = so1.getAttribute("value");
                            if (salesordercopy != null) {

                            } else {
                                salesordercopy = so1.getText();
                            }
                            String args[] = splitfunction(salesordercopy, ":");
                            String args1[] = splitfunction(args[1], "successfully");
                            hmap.put(arguments[1], args1[0].trim());
                        }
                        Ok1.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("waittime->2");
                        Status = true;
                    } else {
                        System.out.println("Unable to find Ok1");
                    }

                } else {
                    System.out.println("Unable to find Ok");
                }
            } else {
                System.out.println("Unable to find Copy SO");
            }

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Navigate_Dashboard(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();

        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String name;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 3) {
                    local_wait = arguments[2];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("WAITTIME->" + local_wait);
            arguments[1]=arguments[1].trim();
            WAITFORELEMENT(driver, "waitforelement->xpath:=//i[contains(@class,'fa-bars')]->Dashboard Button");
            Boolean DButton = CLICK(driver, "click->xpath:=//i[contains(@class,'fa-bars')]->Dashboard Button");
            if (DButton) {
                Boolean CT = CLEARTEXTBOX(driver, "Cleartextbox->xpath:=//input[@id=\"tile_search_input\"]->Search");
                WebElement EV = Getlocator(driver, "xpath:=//input[@id=\"tile_search_input\"]");
                if (EV != null) {
                    EV.sendKeys(arguments[1]);
                    Boolean DL = WAITFORELEMENT(driver, "waitforelement->xpath:=//ul[@class='dropdown-menu']//a[text()=\"" + arguments[1] + "\"]->Dashboard link");
                    if (DL) {
                        CLICK(driver, "click->xpath:=//ul[@class='dropdown-menu']//a[text()=\"" + arguments[1] + "\"]->Dropdown Link");
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("WAITTIME->" + local_wait);
                        WebElement okb = Getlocator(driver, "xpath:=//input[@value=\"OK\"]");
                        if (okb != null) {
                            okb.click();
                        }
                        WAITTIME("WAITTIME->" + local_wait);
                        INVISIBLEOFLOAD(driver);

                        Status = true;
                    } else {
                        System.out.println("unable to find dashboard link");
                    }
                } else {
                    System.out.println("unable to find search to enter dashboard name");
                }
            } else {
                System.out.println("unable to find dashboard button");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Group_Action(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            xpath1 = "xpath:=(//td[text()=\"" + arguments[1] + "\"][1])[2]";
            WAITFORELEMENT(driver, "waitforelement->xpath:=(//img[contains(@src,'actions')])[1]->Group Action Icon");
            WebElement image = Getlocator(driver, "xpath:=(//img[contains(@src,'actions')])[1]");
            if (image != null) {
                image.click();
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->Action");
                WebElement action = Getlocator(driver, xpath1);
                if (action != null) {
                    action.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->" + wait);
                    Status = true;
                }
            } else {
                //out.println("unable to find Action Image");
            }
        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Angularjs_ClickEnter(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        RecoveryScenarios();
        String sel = "select2-chosen ng-binding";
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
            xpath1 = "xpath:=(//span[@class=\"" + sel + "\"])[1]";
            xpath2 = "xpath:=//div[@class=\"select2-result-label ui-select-choices-row-inner\"]";
            xpath3 = "xpath:=//label[contains(text(),\"" + arguments[1] + "\")]/following-sibling::div//div//ul[@class=\"select2-result-single\"]/li/div/div[text()=\"" + arguments[2] + "\"]";
            //  WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1]);
            WebElement Locator1 = Getlocator(driver, xpath1);

            if (Locator1 != null) {
                Locator1.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->1");
                WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1]);
                WebElement Locator2 = Getlocator(driver, xpath2);
                WebElement Locator3 = Getlocator(driver, xpath3);
                if (Locator3 != null) {
                    Locator3.click();
                    Status = true;
                } else if (Locator2 != null) {
                    Locator2.click();
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else {
                    System.out.println("unable to find " + arguments[1]);
                }

            } else {
                System.out.println("unable to find " + arguments[1]);
            }
        } catch (Exception e) {
            // System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Angularjs_SearchEnter(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String xpath2;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[1].trim())) {
                arguments[1] = hmap.get(arguments[1].trim());
            }

            xpath1 = "xpath:=//span[text()=\"Select or search a shift calendar template in the list...\"]";
            xpath2 = "xpath:=//div[text()=\"" + arguments[1] + "\"]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1]);
            WebElement Locator1 = Getlocator(driver, xpath1);
            if (Locator1 != null) {
                Locator1.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->1");
                WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1]);
                String[] args = splitfunction(xpath2, ":=");
                WebElement Locator2 = Getlocator(driver, xpath2);
                if (Locator2 != null) {
                    //Locator2.click();
                    clickElementUsingJavascriptExecutor(args[1]);
                    Status = true;
                } else {
                    System.out.println("unable to find" + arguments[1]);
                }
            } else {
                System.out.println("unable to find" + arguments[1]);
            }
        } catch (Exception e) {
            //  System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Angularjs_Set_value(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        RecoveryScenarios();
        boolean Status = false;
        String xpath1;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
            xpath1 = "xpath:= //label[text()=\"" + arguments[1] + "\"]/following-sibling::div//input";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1]);
            WebElement locator = Getlocator(driver, xpath1);
            if (locator != null) {
                locator.clear();
                WAITTIME("WAITTIME->3");
                locator.sendKeys(arguments[2]);
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->6");
                //  Upload_File("upload_file->ENTER");
                SENDKEYS(webdriver, "SENDKEYS->ENTER");
                //   StaleElementClick(driver, "StaleElementClick->xpath:=//label[text()=\"" + arguments[1] + "\"]/following-sibling::div//input]->" + arguments[2]);
                WAITTIME("WAITTIME->4");
                locator.click();
                Status = true;
            }
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            return false;
        }

        return Status;
    }

    public static boolean Angularjs_Search(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->5");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if (hmap.containsKey(arguments[1].trim())) {
                arguments[1] = hmap.get(arguments[1].trim());
            }
            xpath1 = "xpath:=//input[@id=\"searchtext\" or @type =\"search\"]";
            xpath2 = "xpath:=//i[@class=\"fa fa-search\"]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->search");
            WebElement locator1 = Getlocator(driver, xpath1);
            if (locator1 != null) {
                locator1.clear();
                locator1.sendKeys(arguments[1]);
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    locator2.click();
                    Status = true;
                } else {
                    Status = true;
                }
            } else {
                System.out.println("unable to find search");
            }
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Actions_Leftpane(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            arguments[2]=arguments[2].trim();
            xpath1 = "xpath:=//td/span/button[text()=\"Actions \" or text()=\"Actions\"]";
            String xpath3 = "xpath:=//div/button[text()=\"Actions \" or text()=\"Actions\"] ";
            //WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->Actions");
            String xpath2 = "xpath:=//a[text()=\"" + arguments[2] + "\"]";
            String xpath4 = "xpath:=(//a[text()=\"" + arguments[2] + "\"])[2]";
            WebElement Action1 = Getlocator(driver, xpath1);
            WebElement Action2 = Getlocator(driver, xpath3);
            WebElement Action = null;
            if (Action1 != null) {
                Action = Action1;
            } else {
                Action = Action2;
            }
            if (Action != null) {
                Action.click();
                WAITTIME("WAITTIME->" + wait);
                INVISIBLEOFLOAD(driver);
                //  WAITFORELEMENT(driver, "waitforelement->" + xpath4 + "->Action Item");
                WebElement ActionItem = Getlocator(driver, xpath4);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->Action Item");
                WebElement ActionItem1 = Getlocator(driver, xpath2);
                if (ActionItem != null) {
                    ActionItem.click();
                    WAITTIME("WAITTIME->" + wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else if (ActionItem1 != null) {
                    ActionItem1.click();
                    WAITTIME("WAITTIME->" + wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else {
                    System.out.println("Unable to find left pane action items");
                }
            } else {
                System.out.println("Unable to find left pane action button");
            }
        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean Actions_LineLevel(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            arguments[2]=arguments[2].trim();
            xpath1 = "xpath:=//button[text()=\"Actions\"]";
            // WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->Actions");
            String xpath2 = "xpath:=//a[text()=\"" + arguments[2] + "\"]";
            WebElement Action = Getlocator(driver, xpath1);
            if (Action != null) {
                Action.click();
                WAITTIME("WAITTIME->" + wait);
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->Action Item");
                WebElement ActionItem = Getlocator(driver, xpath2);
                if (ActionItem != null) {
                    ActionItem.click();
                    WAITTIME("WAITTIME->" + wait);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else {
                    //System.out.println("Unable to find left pane action items");
                }
            } else {
                //System.out.println("Unable to find left pane action button");
            }

            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->Actions");
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean clickElementUsingJavascriptExecutor(String xpathValue) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        boolean Status = true;
        try {
            WebElement element = driver.findElement(By.xpath(xpathValue.trim()));
            WAITTIME("waittime->" + wait);
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", new Object[]{element});
            // WAITTIME("waittime->3");
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            Status = false;
        }
        return Status;
    }

    public static void typeValueUsingJavaScriptExecutor(String xpathValue, String value) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("waittime->2");
        WebElement element = driver.findElement(By.xpath(xpathValue.trim()));
        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("arguments[0].value='" + value + "'", new Object[]{element});
        WAITTIME("waittime->2");
    }

    public static boolean ElementClickable(String xpathValue) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        boolean Status = true;
        try {
            WebElement element = driver.findElement(By.xpath(xpathValue.trim()));
            new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            System.out.println("exception value :ElementClickable " + e.getMessage());
            Status = false;
        }
        return Status;
    }

    public static boolean ElementVisible(String xpathValue) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        boolean Status = true;
        try {
            WebElement element = driver.findElement(By.xpath(xpathValue.trim()));
            new WebDriverWait(driver, 30).ignoring(StaleElementReferenceException.class)
                    .until(ExpectedConditions.visibilityOfElementLocated((By) element));
        } catch (Exception e) {
            System.out.println("exception value :ElementVisible " + e.getMessage());
            Status = false;
        }
        return Status;
    }

    public static boolean Submit(WebDriver webdriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        //RecoveryScenarios();
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        try {
            xpath1 = "xpath:=//button[contains(@id,\"submit\") or contains(@id,\" Submit\") ] ";
            WAITFORELEMENT(webdriver, "WAITFORELEMENT->" + xpath1 + "->Submit");
            WebElement Submit = Getlocator(driver, xpath1);
            if (Submit != null) {
                String[] args = splitfunction(xpath1, ":=");
                clickElementUsingJavascriptExecutor(args[1]);
                INVISIBLEOFLOAD(driver);
                Status = true;
                closePopUp();
            }
        } catch (Exception e) {
            //System.out.println("ubable to click on submit");
            Status = false;
        }
        return Status;
    }

    public static boolean SCROLLDOWN(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean flag = false;
        String[] arguments = null;
        Boolean Status = true;
        RecoveryScenarios();
        arguments = splitfunction(parameters, "\\->");
        String xpath = arguments[1].trim();
        try {
            WebElement DIVelement = driver.findElement(By.xpath(xpath));
            JavascriptExecutor jse = (JavascriptExecutor) driver;
            jse.executeScript("arguments[0].scrollIntoView(true)", DIVelement);

            flag = true;
            return true;
        } catch (Exception e) {
            //System.out.println("unable to find the locator" + " " + e.getMessage());
            //ReportFunctions.LogRepoter("Fail", "close pop up", "Loader image is still present");
            return false;
        }
    }

    public static boolean Verify_Line(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        boolean flag = false;
        String[] arguments = null;
        Boolean Status = true;
        String uivalue;
        arguments = splitfunction(parameters, "->");
        String[] args = splitfunction(arguments[2], "|");
        String pos = null;
        arguments[1]=arguments[1].trim();
        String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
        StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
        if (hmap.containsKey("pos")) {
            pos = hmap.get("pos");
        }
        String xpath = "xpath:=(//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div//td[" + pos + "]//input)[" + args[1] + "]";
        WebElement line = Getlocator(driver, xpath);
        if (line != null) {
            uivalue = line.getAttribute("value");
            if (uivalue == null) {
                uivalue = line.getText();
            }
            if (uivalue.equalsIgnoreCase(args[0])) {
                System.out.println("Both values matched");
            } else {
                System.out.println("Both values did not match");
                Status = false;
            }
        } else {
            //System.out.println("unable to find selected line");
        }
        try {
            return Status;
        } catch (Exception e) {
            //System.out.println("unable to find the locator" + " " + e.getMessage());
            ReportFunctions.LogRepoter("Fail", "close pop up", "Loader image is still present");
            return false;
        }
    }

    public static boolean Allchoices(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->5");
        INVISIBLEOFLOAD(driver);
        Boolean status = false;
        String filter = "xpath:=//i[@id=\"prompts-button-bottom\"]";
        String Apply = "xpath:=//div[@id='prompts']//button[contains(text(),'Apply')]";
        String Reset = "xpath:=//div[@id='prompts']//button[@name='reset']";
        WebElement Filters = Getlocator(driver, filter);
        RecoveryScenarios();
        try {
            if (Filters != null) {
                Filters.click();
                WAITFORELEMENT(driver, "waitforelement->xpath:=//div[@id='prompts']//button[@name='reset']->Reset");
                WebElement Resets = Getlocator(driver, Reset);
                if (Resets != null) {
                    INVISIBLEOFLOAD(driver);
                    Resets.click();
                    WebElement goes = Getlocator(driver, Apply);
                    if (goes != null) {
                        goes.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("WAITTIME->2");
                        status = true;
                    }
                }
            }
        } catch (Exception e) {
            //  System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return status;
    }

    public static boolean Org_Name(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean Status = false;
        String xpath1;
        String xpath2;
        String xpath3 = null;
        String xpath4 = null;
        String xpath5 = null;
        String xpath6 = null;
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        int index = 1;
        RecoveryScenarios();
        try {
            String[] arguments = null;
            arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
                xpath1 = "xpath:= (//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input)[2]";
                WebElement labelname1 = Getlocator(driver, xpath1);
                if (labelname1 != null) {
                    labelname1.clear();
                    labelname1.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                }

            } else {
                ReportFunctions.LogRepoter("Fail", "Dropdownchkbox", "Unable to find data" + arguments[2]);
            }
        } catch (Exception e) {
            //  System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static Boolean Org_Level(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->4");
        Boolean Status = true;
        String value;
        String[] arguments = splitfunction(Parameters, "->");
        String label = arguments[1].trim();
        RecoveryScenarios();
        try {
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2];
            }

            String xpath = "xpath:=(//label[text()=\"" + label + "\"]/preceding-sibling::input)[2]";
            String xpath2 = "xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[text()=\"" + value + "\"]";

            WAITFORELEMENT(driver, "waitforelement->" + xpath + "->" + label + "");
            WebElement locator = Getlocator(driver, xpath);
            if (locator.isEnabled()) {
                locator.click();
                // locator.clear();
                locator.sendKeys(value);
                WAITTIME("waittime->4");
                //ReportFunctions.LogRepoter("pass", "Enter value ", "Succesfully entered value " + " " + arguments[2]);
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                //  Upload_File("upload_file->ENTER");
                SENDKEYS(driver, "sendkeys->ENTER");
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");

            } else {
                System.out.println("unable to find" + " " + arguments[2]);
                // //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + arguments[2]);
                CLOSEALLBROWSERS(driver);
                Status = false;
            }
        } catch (Exception e) {
            //ReportFunctions.LogRepoter("Fail", "Click_Enter", "Failed to enter value " + e);
            CLOSEALLBROWSERS(driver);
            Status = false;
        }
        return Status;

    }

    public static boolean Click_Checkbox(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        int index = 1;
        String arg = null;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            xpath1 = "xpath:=(//td//label[@class=\"labelET\"])[" + arguments[1] + "]";
            String xpath2 = "xpath:=(//div[@class=\"DTFC_LeftBodyLiner\"]//table//tr[" + arguments[1] + "])[1]";
            String xpath3 = "xpath:=(//div[@class=\"DTFC_LeftBodyLiner\"]//table//td//label[" + arguments[1] + "])[1]";
            WebElement locator1 = Getlocator(driver, xpath1);
            WebElement locator2 = Getlocator(driver, xpath2);
            WebElement locator3 = Getlocator(driver, xpath3);
            WebElement locator = null;
            arguments[1]=arguments[1].trim();
            if (locator1 != null) {
                locator = locator1;
                arg = "(//td//label[@class=\"labelET\"])[" + arguments[1] + "]";
            } else if (locator2 != null) {
                locator = locator2;
                arg = "(//div[@class=\"DTFC_LeftBodyLiner\"]//table//tr[" + arguments[1] + "])[1]";
            } else {
                locator = locator3;
                arg = "(//div[@class=\"DTFC_LeftBodyLiner\"]//table//td//label[" + arguments[1] + "])[1]";
            }
            if (locator != null) {
                // locator.click();
                clickElementUsingJavascriptExecutor(arg);
                Status = true;
            } else {
                System.out.println("unable to find check box");
            }

        } catch (Exception e) {
            //ReportFunctions.LogRepoter("Fail", "Click_Enter", "Failed to enter value " + e);
            //CLOSEALLBROWSERS(driver);
            Status = false;
        }
        return Status;

    }

    public static Boolean FrameSearch_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String value;
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->2");
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String label = arguments[1].trim();
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }
//String xpath = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";
            // String xpath1 = "xpath:=//label[text()=\"" + label + "\"]/preceding-sibling::input";
            String xpath1 = "xpath:=//div[@class=\"input-group\"]//input[@placeholder=\"" + label + "\"]";
            // String xpath1 = "xpath:=//div[contains(text(),\"" + label + "\")]/ancestor::div/following-sibling::div//td[4]";
            String xpath2 = "xpath:=//*[@class=\"modal-body\"]/div[@class=\"panel-body\"]/table/tr[1]";
            String xpath3 = "xpath:=//input[@id='searchString']";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            String[] args1 = splitfunction(xpath3, ":=");
            WebElement locator = Getlocator(driver, xpath1);
            if (locator.isEnabled()) {
                clickElementUsingJavascriptExecutor(args[1]);
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + label + "");
                WebElement search1 = Getlocator(driver, xpath3);
                if (search1 != null) {
                    search1.click();
                    search1.clear();
                    typeValueUsingJavaScriptExecutor(args1[1], value);
                    // search1.sendKeys(value);
                    INVISIBLEOFLOAD(driver);
                }
                WAITTIME("waittime->5");
                WebElement search2 = Getlocator(driver, "xpath:=(//button[@id=\"search\"])[1]");
                search2.click();
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                WAITTIME("waittime->5");
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    locator2.click();
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                    //SENDKEYS(driver, "sendkeys->TAB");
                } else {
                    System.out.println("unable to find search item");
                }
                boolean status = driver.findElements(By.xpath("//button[@id=\"save\"]")).size() > 0;
                if (status) {
                    WebElement done = Getlocator(driver,
                            "xpath:=//button[@id=\"save\"]");
                    done.click();
                    INVISIBLEOFLOAD(driver);
                }
            }
        } catch (Exception e) {

            Status = false;

        }
        return Status;

    }

    public static Boolean ClickTab_Line(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean status = false;
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->2");
        Boolean Status = true;
        String xpath;
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            xpath = "xpath:=(//div[text()=\"" + arguments[1].trim() + "\"])[1]";
            WebElement Locator = Getlocator(driver, xpath);
            if (Locator != null) {
                Locator.click();
                WAITTIME("waittime->2");
                INVISIBLEOFLOAD(driver);
                status = true;
            } else {
                System.out.println("Unable to find  " + arguments[1]);
            }

        } catch (Exception e) {;
            CLOSEALLBROWSERS(driver);
        }
        return status;
    }

    public static boolean Reset_Apply(WebDriver WebDriver) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        Boolean status = false;
        // RecoveryScenarios();
        String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']";
        String Apply1 = "xpath:=//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
        String Reset = "xpath:=//button[@name=\"reset\"]";
        WebElement Resets = Getlocator(driver, Reset);
        try {
            {
                if (Resets != null) {
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->11");
                    Resets.click();
                    WebElement Applys = Getlocator(driver, Apply);
                    WebElement Applies1 = Getlocator(driver, Apply1);
                    if (Applys != null) {
                        Applys.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("WAITTIME->" + wait);
                        status = true;
                    }
                    if (Applies1 != null) {
                        //  Applies1.click();
                        clickElementUsingJavascriptExecutor("//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]");
                    }
                }
            }
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return status;
    }

    public static Boolean Line_Click_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String value;
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->2");
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String[] argslabel = splitfunction(arguments[1], ",");
            String label = argslabel[0];
            arguments[1]=arguments[1].trim();
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }
            String xpath1 = "xpath:=//th[contains(text(),\"" + argslabel[0] + "\")]/ancestor::thead/following-sibling::tbody//td[" + argslabel[1] + " ]//input";
            //String xpath2 = "xpath:=//td[starts-with(text(),\"" + value + "\")]";
            String xpath2 = "xpath:=//li//a[text()=\"" + value + "\"]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            WebElement locator = Getlocator(driver, xpath1);
            if (locator.isEnabled()) {
                clickElementUsingJavascriptExecutor(args[1]);
                //typeValueUsingJavaScriptExecutor(args[1], value);
                locator.sendKeys(value);
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + label + "");
                WebElement value1 = Getlocator(driver, xpath2);
                if (value1 != null) {
                    value1.click();
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                    WAITTIME("waittime->2");
                }
            }
        } catch (Exception e) {;
            //CLOSEALLBROWSERS(driver);
        }
        return Status;
    }

    public static Boolean Comments(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String xpath = null;
        String xpath2;
        String xpath3;
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->2");
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            xpath = "xpath:=//div/ancestor::div/following-sibling::div//td[" + pos + "]";
            xpath2 = "xpath:=//form[@role =\"form\"]//fieldset//textarea";
            xpath3 = "xpath:=//button[text()=\"Done\"]";
            WebElement comments = Getlocator(driver, xpath);
            if (comments != null) {
                comments.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                WebElement area = Getlocator(driver, xpath2);
                if (area != null) {
                    area.clear();
                    area.sendKeys(arguments[2]);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->2");
                    WebElement done = Getlocator(driver, xpath3);
                    if (done != null) {
                        done.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("waittime->2");
                        Status = true;
                        System.out.println("Sucessfully entered comments and clicked on done");
                    } else {
                        System.out.println("unable to find Done");
                    }
                } else {
                    System.out.println("unable to find comments text area");
                }
            } else {
                System.out.println("unable to find Comments");
            }
        } catch (Exception e) {;
            // CLOSEALLBROWSERS(driver);
        }
        return Status;
    }

    public static Boolean Link_Navigation(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String value;
        String xpath = null;
        String xpath2;
        String xpath3 = null;
        Boolean flag = false;
        int i = 0;
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->2");
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String[] argslabel = splitfunction(arguments[1], "|");
            int len = argslabel.length;
            for (i = 0; i <= len - 1; i++) {
                if (hmap.containsKey(argslabel[i].trim())) {
                    argslabel[i] = hmap.get(argslabel[i].trim());
                }
                xpath = "xpath:=//span[text()=\"" + argslabel[i] + "\"]/preceding-sibling::img[2]";
                WebElement locator = Getlocator(driver, xpath);
                if (locator != null) {
                    locator.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->2");
                    if (i == (len - 2)) {
                        i = len - 1;
                        break;
                    }
                } else {
                    System.out.println("unable to find element " + argslabel[i]);
                }
            }
            if (hmap.containsKey(argslabel[i])) {
                argslabel[i] = hmap.get(argslabel[i]);
            }
            xpath = "xpath:= //span[text()=\"" + argslabel[i] + "\"]/ancestor::tr/td/img";
            WebElement locator = Getlocator(driver, xpath);
            if (locator != null) {
                locator.click();
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->2");
                flag = true;
            } else {
                System.out.println("unable to find element " + argslabel[i]);
            }
            if (flag == true) {
                xpath2 = "xpath:=//button[contains(text(),'Actions')]";
                if (arguments[2].equalsIgnoreCase("Create WO")) {
                    xpath3 = "xpath:=//a[@title=\"" + arguments[2] + "\"]";
                    WebElement action = Getlocator(driver, xpath2);
                    if (action != null) {
                        action.click();
                        INVISIBLEOFLOAD(driver);
                        WAITTIME("waittime->2");
                        WebElement CWO = Getlocator(driver, xpath3);
                        if (CWO != null) {
                            CWO.click();
                            INVISIBLEOFLOAD(driver);
                            WAITTIME("waittime->2");
                            Status = true;
                            System.out.println("Sucessfully clicked on  Create WO");
                        } else {
                            System.out.println("unable to find Create WO");
                        }
                    } else {
                        System.out.println("unable to find actions");
                    }
                } else {
                    xpath3 = "xpath:=(//span[text()=\"" + argslabel[i] + "\"]/ancestor::tr/td//div)[3]";
                    String xpath4 = "xpath:=//div[text() =\"Asset 360\"]";
                    WebElement Asset = Getlocator(driver, xpath3);
                    if (Asset != null) {
                        Asset.click();
                        WAITTIME("waittime->2");
                        WebElement Asset360 = Getlocator(driver, xpath4);
                        if (Asset360 != null) {
                            Asset360.click();
                            WAITTIME("waittime->2");
                            Status = true;
                            System.out.println("Sucessfully clicked on  Asset 360");
                        } else {
                            System.out.println("unable to find Asset 360");
                        }
                    } else {
                        System.out.println("unable to find Asset 360");
                    }

                }
            }
        } catch (Exception e) {;
            //CLOSEALLBROWSERS(driver);
        }
        return Status;
    }

    public static Boolean Line_Search_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String value;
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->3");
        RecoveryScenarios();
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String[] argslabel = splitfunction(arguments[1], ",");
            String label = argslabel[0].trim();
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }
            String xpath1 = "xpath:=//th[contains(text(),\"" + argslabel[0] + "\")]/ancestor::thead/following-sibling::tbody//td[" + argslabel[1] + " ]//input";
            String xpath2 = "xpath:=//td[starts-with(text(),\"" + value + "\")]";
            String xpath3 = "xpath:=(//input[@id='searchString'])[1]";
            String xpath4 = "xpath:=(//button[@id=\"search\"])[1]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            String[] args1 = splitfunction(xpath3, ":=");
            WebElement locator = Getlocator(driver, xpath1);
            if (locator.isEnabled()) {
                clickElementUsingJavascriptExecutor(args[1]);
                WAITTIME("waittime->3");
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + label + "");
                WebElement search1 = Getlocator(driver, xpath3);
                if (search1 != null) {
                    search1.click();
                    search1.clear();
                    typeValueUsingJavaScriptExecutor(args1[1], value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->2");
                    Status = true;
                }
                WebElement search2 = Getlocator(driver, xpath4);
                String[] args2 = splitfunction(xpath4, ":=");
                clickElementUsingJavascriptExecutor(args2[1]);
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                WAITTIME("waittime->5");
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    locator2.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->2");
                        SENDKEYS(driver, "sendkeys->TAB");
                } else {
                    System.out.println("unable to find search item");
                }
                boolean status = driver.findElements(By.xpath("//button[@id=\"save\"]")).size() > 0;
                if (status) {
                    WebElement done = Getlocator(driver, "xpath:=//button[@id=\"save\"]");
                    clickElementUsingJavascriptExecutor("//button[@id=\"save\"]");
                    INVISIBLEOFLOAD(driver);
                }
            }
        } catch (Exception e) {;
            // CLOSEALLBROWSERS(driver);
        }
        return Status;
    }

    public static Boolean RecoveryScenarios() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
//        Boolean Status = true;
        try {
            //  WAITTIME("WAITTIME->2");
            // SENDKEYS(driver,"SENDKEYS->ESCAPE");
            String Doness = "xpath:=//button[@id=\"done\" or @id=\"save\"]";
            String OkButton = "xpath:=//button[@id=\"OK\"]";
            String cancel = "xpath:=//button[@id=\"Cancel\"]";
            String Refresh = "xpath:=//button[text()=\"Refresh\"]";
            String Cookie = "xpath:=//a[@aria-label=\"dismiss cookie message\"]";
            WebElement Doness1 = Getlocator(driver, Doness);
            if (Doness1 != null) {
                Doness1.click();
                WAITTIME("WAITTIME->2");
                INVISIBLEOFLOAD(driver);
                System.out.println("Sucessfully clicked on Done");
            }
            WebElement cancel1 = Getlocator(driver, cancel);
            if (cancel1 != null) {
                cancel1.click();
                WAITTIME("WAITTIME->2");
                INVISIBLEOFLOAD(driver);
                System.out.println("Sucessfully clicked on Cancel");
            }
             WebElement ok = Getlocator(driver, cancel);
            if (ok != null) {
                ok.click();
                WAITTIME("WAITTIME->2");
                INVISIBLEOFLOAD(driver);
                System.out.println("Sucessfully clicked on OK");
            }
            WebElement cookie1 = Getlocator(driver, Cookie);
            if (cookie1 != null) {
                cookie1.click();
                WAITTIME("WAITTIME->2");
                INVISIBLEOFLOAD(driver);
                System.out.println("Sucessfully clicked on Cancel");
            }
            WebElement Refresh1 = Getlocator(driver, Refresh);
            if (Refresh1 != null) {
                Refresh1.click();
                WAITTIME("WAITTIME->2");
                INVISIBLEOFLOAD(driver);
                System.out.println("Sucessfully clicked on Refresh");
            }

        } catch (Exception e) {;
            //System.out.println(e);
        }
        return true;

    }

    public static Boolean STOREVALUE(String Parameters) throws Exception {
        Boolean Status = false;
        String value;
        String[] values = null;
        String[] argum = null;
        String revalue = null;
        String revalue1 = null;
        Boolean flag = true;
        String newoval = null;
        Double num1;
        Double num2;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            if ((arguments[2].contains("+"))) {
                argum = splitfunction(arguments[2], "+");
                if (((hmap.containsKey(argum[0]) == true))) {
                    revalue = hmap.get(argum[0]);
                    num1 = Double.parseDouble(String.valueOf(revalue));
                } else {
                    num1 = Double.parseDouble(String.valueOf(argum[0]));
                }
                if (((hmap.containsKey(argum[1]) == true))) {
                    revalue1 = hmap.get(argum[1]);
                    num2 = Double.parseDouble(String.valueOf(revalue1));
                } else {
                    num2 = Double.parseDouble(String.valueOf(argum[1]));
                }
                arguments[2] = String.valueOf(num1 + num2);
                hmap.put(arguments[1], arguments[2]);
                Status = true;
            } else if (arguments[2].contains("*")) {
                argum = splitfunction(arguments[2], "*");
                if (((hmap.containsKey(argum[0]) == true))) {
                    revalue = hmap.get(argum[0]);
                    num1 = Double.parseDouble(String.valueOf(revalue));
                } else {
                    num1 = Double.parseDouble(String.valueOf(argum[0]));
                }
                if (((hmap.containsKey(argum[1]) == true))) {
                    revalue1 = hmap.get(argum[1]);
                    num2 = Double.parseDouble(String.valueOf(revalue1));
                } else {
                    num2 = Double.parseDouble(String.valueOf(argum[1]));
                }
                arguments[2] = String.valueOf(num1 * num2);
                hmap.put(arguments[1], arguments[2]);
                Status = true;
            } else if ((arguments[2].contains("minus"))) {
                argum = splitfunction(arguments[2], "minus");
                if (((hmap.containsKey(argum[0]) == true))) {
                    revalue = hmap.get(argum[0]);
                    num1 = Double.parseDouble(String.valueOf(revalue));
                } else {
                    num1 = Double.parseDouble(String.valueOf(argum[0]));
                }
                if (((hmap.containsKey(argum[1]) == true))) {
                    revalue1 = hmap.get(argum[1]);
                    num2 = Double.parseDouble(String.valueOf(revalue1));
                } else {
                    num2 = Double.parseDouble(String.valueOf(argum[1]));
                }
                arguments[2] = String.valueOf(num1 - num2);
                hmap.put(arguments[1], arguments[2]);
                Status = true;
            } else {
                if (hmap.containsKey(arguments[2])) {
                    arguments[2] = hmap.get(arguments[2]);
                }
                hmap.put(arguments[1], arguments[2]);
                Status = true;
            }
        } catch (Exception e) {
            Status = false;
        }
        return Status;
    }

    public static Boolean Multiple_Storevalue(String Parameters) throws Exception {
        Boolean Status = false;
        String value;
        String[] arguments = splitfunction(Parameters, "->");
        try {
            if (hmap.containsKey(arguments[1])) {
                arguments[1] = hmap.get(arguments[1]);
            }
            if (hmap.containsKey(arguments[2])) {
                arguments[2] = hmap.get(arguments[2]);
            }
            hmap.put(arguments[1], arguments[2]);
            Status = true;

        } catch (Exception e) {
            Status = false;
        }
        return Status;
    }

    public static boolean Angularjs_Verify(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->5");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        String xpath2;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
            }
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            xpath2 = "xpath:= //th[text()=\"" + arguments[1] + "\"]/ancestor::div//following-sibling::div//table//td[ " + pos + " ]";
            xpath1 = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/ancestor::div//td[" + pos + " ]";
            // WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->search");
            WebElement locator1 = Getlocator(driver, xpath2);
            WebElement locator2 = Getlocator(driver, xpath1);
            WebElement locator;
            if (locator1 != null) {
                locator = locator1;
            } else {
                locator = locator2;
            }

            if (locator != null) {
                String value = locator.getText();
                if (value != null) {
                } else {
                    value = locator.getAttribute("value");
                }
                if (value.equalsIgnoreCase(arguments[2])) {
                    System.out.println("Both values matched");
                    Status = true;
                } else {
                    System.out.println("Both values did not  matched");
                }
            } else {
                //System.out.println("unable to find search");
            }
        } catch (Exception e) {
            //      System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static Boolean Java_Search_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        WAITTIME("WAITTIME->2");
        Boolean Status = true;
        //RecoveryScenarios();	
        String value;
        INVISIBLEOFLOAD(driver);
        //WAITTIME("waittime->2");	
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String label = arguments[1].trim();
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2];
            }
            String xpath1 = "xpath:=//div/input[@placeholder=\"" + label + "\"]";
            String xpath2 = "xpath:=//td[starts-with(text(),\"" + value + "\")]";
            String xpath3 = "xpath:=//input[@id=\'searchString\']";
            String xpath4 = "xpath:=//div[@class=\"WBTableRender\"]//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
            String xpath5 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[32]//input";
            String xpath6 = "xpath:=(//td[starts-with(text(),\"" + value + "\")])[2]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            String[] args1 = splitfunction(xpath3, ":=");
            WebElement locator = null;
            WebElement locator1 = Getlocator(driver, xpath1);
            WebElement locator4 = Getlocator(driver, xpath4);
            WebElement locator5 = Getlocator(driver, xpath5);
            if (locator1 != null) {
                locator = locator1;
            } else if (locator4 != null) {
                locator = locator4;
            } else {
                locator = locator5;
            }
            if (locator != null) {
                INVISIBLEOFLOAD(driver);
                WAITTIME("waittime->4");
                locator.clear();
                // locator.click();	
                clickElementUsingJavascriptExecutor(args[1]);
                WAITTIME("waittime->2");
                INVISIBLEOFLOAD(driver);
                WAITFORELEMENT(driver, "waitforelement->" + xpath3 + "->" + label + "");
                WebElement search1 = Getlocator(driver, xpath3);
                if (search1 != null) {
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->2");
                    search1.clear();
                    search1.sendKeys(value);
                    WAITTIME("waittime->9");
                    INVISIBLEOFLOAD(driver);
                }
                WebElement search2 = Getlocator(driver, "xpath:=(//button[@id=\"search\"])[1]");
                WAITTIME("waittime->6");
                INVISIBLEOFLOAD(driver);
                search2.click();
                WAITTIME("waittime->6");
                INVISIBLEOFLOAD(driver);
                WebElement locator2 = Getlocator(driver, xpath2);
                WebElement locator6 = Getlocator(driver, xpath6);
                if (locator6 != null) {
                    locator2 = locator6;
                }
                if (locator2 != null) {
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->3");
                    locator2.click();
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->3");
                } else {
                    System.out.println("unable to find search item");
                }
                ElementClickable("//button[@id=\"save\"]");
                boolean status = driver.findElements(By.xpath("//button[@id=\"save\"]")).size() > 0;
                if (status) {
                    WebElement done = Getlocator(driver, "xpath:=//button[@id=\"save\"]");
                    ElementClickable("//button[@id=\"save\"]");
                    done.click();
                    WAITTIME("waittime->3");
                    INVISIBLEOFLOAD(driver);
                }
            }
        } catch (Exception e) {
            Status = false;
        }
        return Status;
    }

    public static Boolean Get_Service_History(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        int i = 0;
        String name;
        String temp = null;
        String[] serviveH;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String pos = null;
            arguments[1]=arguments[1].trim();
            String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            List<WebElement> rowCount = driver.findElements(By.xpath("//div[contains(@class,\"dataTables_scrollBody\")]//tbody/tr"));
            int size = rowCount.size();
            if (size == 0) {
                New_Click(driver, "New_Click->Mandatory Asset Service History");
                WAITTIME("WAITTIME->2");
                New_Click(driver, "New_Click->Work Activity Completion");
                WAITTIME("WAITTIME->2");
                Set_Value(driver, "Set_Value->Remarks/Notes->Completed Remarks");
                WAITTIME("WAITTIME->2");
                New_Click(driver, "New_Click->Save");
                WAITTIME("WAITTIME->2");
            } else {
                for (i = 1; i <= size; i++) {
                    xpath1 = "xpath:=(//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//tr[" + i + "]//td[" + pos + "])[1]";
                    //WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + arguments[1] + "");
                    WebElement record = Getlocator(driver, xpath1);
                    if (record != null) {
                        name = record.getText();
                        if (name == null) {
                            name = record.getAttribute("value");
                        }
                        System.out.println(name);
                        serviveH = splitfunction(name, ":`:");
                        for (int sh = 0; sh <= serviveH.length - 1; sh++) {
                            servicehistory.add(serviveH[sh]);
                        }
                        Status = true;
                    } else {
                        System.out.println("object was not found");
                    }
                }
            }
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            return false;
        }
        Iterator<String> itr = servicehistory.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }

        return Status;
    }

    public static Boolean Get_Questions(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        boolean Status = true;
        String xpath1 = "xpath:=(//div[contains(text(),\"Details\")]/ancestor::div/following-sibling::div//td[2])[1]//a//img->Details";
        int i = 0;
        String name = null;
        String temp = null;
        String[] serviveH;
        String xpath2;
        String xpath3;
        String questiontype = null;
        String objname;
        try {
            if (servicehistory.isEmpty()) {
                System.out.print("No Service History name found ");
            } else {
                Iterator<String> itr = servicehistory.iterator();
                while (itr.hasNext()) {
                    objname = itr.next();
                    Questions = new ArrayList<>();
                    Questionstype = new ArrayList<>();
                    Search(driver, "SEARCH->" + objname);
                    WAITTIME("WAITTIME->4");
                    WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + "Details");
                    CLICK(driver, "click->" + xpath1 + "->" + "Details");
                    WAITTIME("WAITTIME->4");
                    List<WebElement> rowCount = driver.findElements(By.xpath("//div[contains(@class,\"dataTables_scrollBody\")]//tbody/tr"));
                    int size = rowCount.size();
                    for (i = 1; i <= size; i++) {
                        xpath2 = "xpath:=(//div[text()=\"Question\"]/ancestor::div/following-sibling::div//tr[" + i + "]//td[4])[1]";
                        xpath3 = "xpath:=(//div[text()=\"Question\"]/ancestor::div/following-sibling::div//tr[" + i + "]//td[2])[1]";
                        WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + "question");
                        WebElement record = Getlocator(driver, xpath2);
                        WebElement type = Getlocator(driver, xpath3);
                        if (record != null) {
                            name = record.getText();
                            if (name == null) {
                                name = record.getAttribute("value");
                            }
                        }
                        Questions.add(name);
                        System.out.println(name);
                        if (type != null) {
                            questiontype = type.getText();
                            if (questiontype == null) {
                                questiontype = type.getAttribute("value");
                            }
                        }
                        Questionstype.add(questiontype);
                        System.out.println(questiontype);
                    }
                    Questionsmap.put(objname, Questions);
                    Typemap.put(objname, Questionstype);
                    //Questions.clear();
                    //Questionstype.clear();
                    Navigate_Dashboard(driver, "Naviagate_Dashboard->Service History");

                }
            }

        } catch (Exception e) {
            // System.out.println("exception value : " + e.getMessage());
            Status = false;
        }
        return Status;
    }

    public static Boolean Submit_Answers(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        boolean Status = true;
        String xpath1 = null;
        int i = 0;
        String name = null;
        String temp = null;
        String[] serviveH;
        String xpath2;
        String qtype = null;
        String questiontype = null;
        List<String> types = null;
        List<String> ques = null;
        String objname = null;
        String qname = null;
        try {
            Iterator<String> aitr = servicehistory.iterator();
            while (aitr.hasNext()) {
                objname = aitr.next();
                ValidatePrompt(driver, "ValidatePrompt->Work Activities->Service History->" + objname);
                WAITTIME("WAITTIME->3");

                if (Questionsmap != null) {
                    ques = Questionsmap.get(objname);
                    if (Typemap != null) {
                        types = Typemap.get(objname);
                    }
                    Iterator<String> Qitr = ques.iterator();
                    while (Qitr.hasNext()) {
                        qname = Qitr.next();
                        qtype = types.get(i);
                        i = i + 1;
                        if ((qtype.toUpperCase().equalsIgnoreCase("TEXTBOX")) || (qtype.toUpperCase().equalsIgnoreCase("LIST OF VALUES"))) {
                            xpath1 = "xpath:=//td[text()=\"" + qname + "\"]/following-sibling::td//input";
                            WebElement locator = Getlocator(driver, xpath1);
                            if (locator != null) {
                                locator.sendKeys("yes");
                            }
                        } else if (qtype.toUpperCase().equalsIgnoreCase("RADIO")) {
                            xpath2 = "xpath:=(//td[text()=\"" + qname + "\"]/following-sibling::td//input)[1]";
                            WebElement locator = Getlocator(driver, xpath2);
                            if (locator != null) {
                                locator.click();
                            }

                        } else {
                            System.out.println("unable to find any of the types");
                        }

                    }
                    New_Click(driver, "New_Click->Save");
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->2");
                    NavigateNew(driver, "NavigateNew->New");
                    WAITTIME("WAITTIME->4");
                }
                i = 0;

            }

        } catch (Exception e) {
            // System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static void StoreResults() throws IOException {
        try {
            String opath = savedlocation;
            File srcDir = new File(opath);
            File destDir = new File("C:\\xampp\\htdocs\\");
            destDir = new File(destDir.getAbsolutePath() + "\\" + mailsuite);
            destDir.mkdirs();
            FileUtils.copyDirectory(srcDir, destDir);
            LocalDate today = LocalDate.now();
            String formattedDate = today.format(DateTimeFormatter.ofPattern("dd/MMM/yy"));
            // sendAttachmentEmail("ashokb@kloudgin.com,muralip@kloudgin.com,venkat@kloudgin.com,pvenkateswaran@kloudgin.com,sindhub@kloudgin.com,divyad@kloudgin.com,madhud@kloudgin.com,ssadiq@kloudgin.com,bvuppala@kloudgin.com,pdgrow@kloudgin.com,pdrun@kloudgin.com","Automation Run:"+hmap.get(suitename) + "_" + formattedDate,  "Hi Team please find the below  automation status report for "+ hmap.get(suitename));
            sendAttachmentEmail("" + mailgroup + "", "Automation Run:" + hmap.get(suitename) + "_" + formattedDate, "Hi Team please find the below  automation status report for " + hmap.get(suitename));
        } catch (Exception e) {
            //  System.out.println("exception value : " + e.getMessage());
        }
    }

    public static Boolean getContactDetails(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        try {
            String finval = "";
            String argument[] = split(Parameters, "->");
            String arg[] = split(argument[2], ",");
            for (int i = 1; i <= arg.length - 1; i++) {
                if (hmap.containsKey(arg[i].trim())) {
                    arg[i] = hmap.get(arg[i].trim());
                }
                finval = finval + arg[i] + " ";
            }
            if (hmap.containsKey(arg[0].trim())) {
                arg[0] = hmap.get(arg[0].trim());
            }
            finval = arg[0] + " " + finval;
            hmap.put(argument[1], finval);
            Status = true;
            //System.out.println(finval);

        } catch (Exception e) {
            //System.println("Exception");
        }
        return Status;
    }

    public static Boolean VerifyEditValue(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String Uivalue = null;
        try {
            String arguments[] = split(Parameters, "->");
            arguments[1]=arguments[1].trim();
            String xpath1 = "xpath:=//input[@placeholder=\"" + arguments[1] + "\"]";
            WebElement value = Getlocator(driver, xpath1);

            if (value != null) {
                Uivalue = value.getAttribute("value");
                if (Uivalue != null) {
                } else {
                    Uivalue = value.getText();
                }
            }
            if (hmap.containsKey(arguments[2].trim())) {
                arguments[2] = hmap.get(arguments[2].trim());
            } else {
                arguments[2] = arguments[2].trim();
            }
            arguments[2] = arguments[2].trim();
            if (Uivalue.equalsIgnoreCase(arguments[2])) {
                System.out.println("Both values matched");
                Status = true;
            } else {
                System.out.println("Both values did not matched");
            }
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return Status;
    }

    public static boolean Capture_mSequence(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        String xpath2 = null;
        String xpath1 = null;
        int i = 1;
        String[] arguments = null;
        String entityname = null;
        String prefixname = null;
        try {
            List<WebElement> rowCount = driver.findElements(By.xpath("//div[contains(@class,\"dataTables_scrollBody\")]//tbody/tr"));
            int size = rowCount.size();
            for (i = 1; i <= size; i++) {
                xpath1 = "xpath:=(//div[(text()=\"Entity Name\")]/ancestor::table//tr[" + i + "]//td)[3]";
                xpath2 = "xpath:=(//div[(text()=\"Prefix\")]/ancestor::table//tr[" + i + "]//td)[5]";
                WebElement entity = Getlocator(driver, xpath1);
                WebElement prefix = Getlocator(driver, xpath2);
                if (entity != null) {
                    entityname = entity.getText();
                    if (entityname == null) {
                        entityname = entity.getAttribute("value");
                    }
                }
                if (prefix != null) {
                    prefixname = prefix.getText();
                    if (prefixname == null) {
                        prefixname = prefix.getAttribute("value");
                    }
                }
                hmap.put(entityname, prefixname);
                System.out.println("Sucessfully captured the value " + entityname + " and placed in " + prefixname);
                ReportFunctions.LogRepoter("Pass", "Capture_mSequence", "succesfully captured all entity and prefix vales");
            }
        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            ReportFunctions.LogRepoter("Fail", "Capture_mSequence", "Failed to captured all entity and prefix vales");
            Status = false;
        }
        return Status;
    }

    public static boolean Verify_Sequence(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        String prefix = null;
        String[] arg = splitfunction(Parameters, ",");
        String label = arg[1];
        String prefval = arg[1] + "-var";
        String storeval = null;
        try {
            Gettext_Label(driver, "Gettext_Label->" + label + "->" + prefval);
            prefval = hmap.get(prefval);
            int len = prefval.length();
            for (int i = 0; i <= len - 1; i++) {
                char a = prefval.charAt(i);
                if (Character.isDigit(a)) {
                    break;
                } else {
                    prefix = prefix + String.valueOf(a);
                }
            }
            storeval = hmap.get(arg[0]);
            if (storeval != null) {
                prefix = prefix.replace("null", "");
                if (storeval.equalsIgnoreCase(prefix)) {
                    ReportFunctions.LogRepoter("Pass", "Verify Sequence", "Sequnce value matched with " + storeval);
                } else {
                    ReportFunctions.LogRepoter("Fail", "Verify Sequence", "Sequnce value does not matched with " + storeval);
                    Status = false;
                }

            } else {
                ReportFunctions.LogRepoter("Fail", "Verify Sequence", "Unable to capture value " + label + " " + "in Managge Sequence Dashboard");
                Status = false;
            }
        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            Status = false;
        }
        return Status;
    }

    public static Boolean Change_Case(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = false;
        String value = null;
        try {
            String arguments[] = split(Parameters, "->");

            if (hmap.containsKey(arguments[1])) {
                arguments[1] = hmap.get(arguments[1]);
            }
            if (arguments[2].equalsIgnoreCase("TOUPPER")) {
                value = arguments[1].toUpperCase();
            } else {
                value = arguments[1].toLowerCase();
            }
            hmap.put(arguments[2], value);
            Status = true;
        } catch (Exception e) {
            System.out.println("Exception");
        }
        return Status;
    }

    public static boolean SELECTVALUEDROPDOWN_xpath(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {

        boolean Status = false;
        try {
            Thread.sleep(3000);
            String[] arguments = null;
            String sValue = null;
            arguments = splitfunction(parameters, "->");
            if ((hmap.containsKey(arguments[3].trim()) == true)) {
                arguments[3] = hmap.get(arguments[3].trim());
            }
            String xpath = arguments[1].trim();
            String option = "xpath:=//Select[@title=\"Profile Role\"]/option[text()=\"" + arguments[3] + "\"]";
            WebElement locator = Getlocator(driver, xpath);
            WebElement opt = Getlocator(driver, option);
            locator.click();
            WAITTIME("WAITTIME->5");
            if (opt != null) {
                opt.click();
                WAITTIME("WAITTIME->2");
                Status = true;
            }

        } catch (Exception e) {
            System.out.println(e);
            WebDriverWait wait = new WebDriverWait(driver, 10);
            WebElement selectElement = driver.findElement(By.xpath("//select[@id=\"profile_responsibility\"]"));
            ((JavascriptExecutor) driver).executeScript("var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } } ", selectElement, "Operations Supervisor");
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id=\"profile_responsibility\"]")));
            WAITTIME("WAITTIME->5");
            selectElement.click();
            SENDKEYS(driver, "SENDKEYS->ENTER");
            SENDKEYS(driver, "SENDKEYS->ENTER");
            selectElement.click();
            WAITTIME("WAITTIME->2");
        }

        return Status;

    }

    public static boolean EditAngularpage(String name) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean status = true;
        int count = 0;
        boolean flag = false;
        try {
            do {
                WAITTIME("waittime->25");
                driver.switchTo().defaultContent();
                driver.switchTo().frame(0);
                Angularjs_Search(driver, name);
                WAITTIME("waittime->5");
                // WebElement locator = Getlocator(driver, "xpath:=//input[@type=\"search\"]");
                WebElement locator = Getlocator(driver, "xpath:=//input [(@id=\"searchtext\") or (@type=\"search\")]");
                if (locator != null) {
                    WebElement Edit = Getlocator(driver, "xpath:=//*[@id=\"btn-edit\"]");
                    Edit.click();
                    //ReportFunctions.LogRepoter("Pass", "Wait for angular js page", "Sucessfully angular js page loaded");
                    WAITTIME("waittime->4");
                    flag = true;
                    count = 5001;
                    status = true;
                    return status;
                } else {
                    count = count + 1;
                }
            } while (count < 5000);
            if (flag == false) {
                ReportFunctions.LogRepoter("Fail", "Wait for angular js page", "Failed to load angular js page");
            }
        } catch (org.openqa.selenium.StaleElementReferenceException ex) {

        }
        return status;
    }

    public static boolean Refresh() {
        boolean status = true;
        try {
            driver.navigate().refresh();
        } catch (Exception e) {
            System.out.println("Exception in Refresh");
        }
        return status;
    }

    public static String getDate(String date) throws Exception {
        String format = null;

        String date1[] = date.split(",");
        format = date1[1].toUpperCase();

        if (format.charAt(0) == 'M') {
            format = "MM/DD/YY";
            day = Sysdate(date);
            day = day.substring(3, 5);
        } else if (format.charAt(0) == 'D') {
            format = "DD/MM/YY";
            day = Sysdate(date);
            day = day.substring(0, 2);
        } else if ((format.charAt(0) == 'Y') && (format.charAt(2) == 'Y') && (format.charAt(5) == 'M')) {
            format = "YYYY/MM/DD";
            day = Sysdate(date);
            day = day.substring(8, 10);
        } else if ((format.charAt(0) == 'Y') && (format.charAt(2) == 'Y') && (format.charAt(5) == 'D')) {
            day = Sysdate(date);
            format = "YYYY/DD/MM";
            day = day.substring(5, 7);
        } else if ((format.charAt(0) == 'Y') && (format.charAt(2) != 'Y') && (format.charAt(3) == 'D')) {
            day = Sysdate(date);
            format = "YY/DD/MM";
            day = day.substring(3, 5);
        } else if ((format.charAt(0) == 'Y') && (format.charAt(2) != 'Y') && (format.charAt(3) == 'M')) {
            day = Sysdate(date);
            format = "YY/MM/DD";
            day = day.substring(6, 8);
        }

        // System.out.println(format);
        //  System.out.println(day);
        return day;
    }

    public static boolean addStrings(String parameters) {
        boolean Status = false;
        String finalval = "";
        try {
            String arguments[] = split(parameters, "->");
            String args[] = split(arguments[2], "+");
            int size = args.length;
            for (int i = 0; i <= size - 1; i++) {
                if (hmap.containsKey(args[i])) {
                    args[i] = hmap.get(args[i]);
                    args[i] = args[i].trim();
                }
                finalval = finalval + args[i];
            }
            hmap.put(arguments[1], finalval);
            Status = true;
        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        System.out.println("Succesfully joined two strings:  " + finalval);
        return Status;
    }

    public static void closeDatePicker() throws FileNotFoundException, ScriptException, NoSuchMethodException, IOException {
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("JavaScript");
        // String script = "C:\\Users\\mpentakota\\Documents\\NetBeansProjects\\AutomationRegression\\hideDataPicker.js";
        File file = new File("C:\\Users\\mpentakota\\Documents\\NetBeansProjects\\AutomationRegression\\hideDataPicker.js");
        Reader reader = new FileReader(file);
        engine.eval(reader);
        Invocable inv = (Invocable) engine;
        inv.invokeFunction("display");
    }

    public static boolean promptLongList(String Parameters) {
        Boolean status = true;
        try {
            String args[] = splitfunction(Parameters, "->");
            String xpath1 = "xpath:=//label[text()=\"" + args[1] + "\"]";
            String xpath2 = "xpath:=(//input[@placeholder=\"" + args[1] + "\"])[2]";
            String xpath3 = "xpath:=//button[@id = \"search\"]";
            String xpath4 = "xpath:=(//td[text()=\"" + args[2] + "\"])[1]";
            String xpath5 = "xpath:=//button[@id=\"done\" or @id=\"save\"]";
            String xpath6 = "xpath:=//span[contains(text(),\"" + args[1] + "\"]";
            String more = "xpath:=//div[@style=\"float: right; display: block;\"]";
            String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']";
            ElementClickable("//div[@style=\"float: right; display: block;\"]");
            if (hmap.containsKey(args[2])) {
                args[2] = hmap.get(args[2]);
            }
            WebElement morebutton = Getlocator(driver, more);
            if (morebutton != null) {
                morebutton.click();
                ElementVisible("//div[@style=\"float: right; display: block;\"]");
                ElementClickable("//div[@style=\"float: right; display: block;\"]");
                INVISIBLEOFLOAD(driver);
            }
            WAITTIME("WAITTIME->3");
            // ElementClickable("//label[text()=\"" + args[1] + "\"]");
            WebElement promtclick = Getlocator(driver, xpath1);
            WebElement promtclick1 = Getlocator(driver, xpath6);
            WebElement loactor = null;
            if (promtclick != null) {
                loactor = promtclick;
            } else {
                loactor = promtclick1;
            }

            if (loactor != null) {
                loactor.click();
                ElementClickable("(//input[@placeholder=\"" + args[1] + "\"])[2]");
                WAITTIME("WAITTIME->3");
                WebElement Psearch = Getlocator(driver, "xpath:=(//input[@placeholder=\"" + args[1] + "\"])[2]");
                if (Psearch != null) {
                    Psearch.sendKeys(args[2]);
                    // typeValueUsingJavaScriptExecutor("(//input[@placeholder=\"" + args[1] + "\"])[2]", args[2]);
                    WAITTIME("WAITTIME->3");
                    WebElement searchclick = Getlocator(driver, "xpath:=//button[@id = \"search\"]");
                    searchclick.click();
                    WAITTIME("WAITTIME->3");
                    ElementClickable("(//td[text()=\"" + args[2] + "\"])[1]");
                    WebElement promptvalue = Getlocator(driver, "xpath:=(//td[@class=\"promptValue\"and text()=\"" + args[2] + "\"])[1]");
                    if (promptvalue != null) {
                        StaleElementClick(driver, "StaleElementClick->xpath:=(//td[@class=\"promptValue\" and text()=\"" + args[2] + "\"])[1]->" + args[2]);
                        //promptvalue.click();
                        WAITTIME("WAITTIME->3");
                        WebElement Dones = Getlocator(driver, "xpath:=//button[@id=\"done\" or @id=\"save\"]");
                        if (Dones != null) {
                            Dones.click();
                            WAITTIME("WAITTIME->3");
                            INVISIBLEOFLOAD(driver);
                            Dones = Getlocator(driver, "xpath:=//button[@id=\"done\" or @id=\"save\"]");
                            if (Dones != null) {
                                StaleElementClick(driver, "StaleElementClick->xpath:=//button[@id=\"done\" or @id=\"save\"]-> done");
                            }
                            WebElement Applies = Getlocator(driver, Apply);
                            if (Applies != null) {
                                Applies.click();
                                WAITTIME("WAITTIME->3");
                                INVISIBLEOFLOAD(driver);
                            }
                        } else {
                            ReportFunctions.LogRepoter("Fail", "Click on Done", "Verify the Prompt: Unable to find the Done button");
                        }
                    } else {
                        System.out.println("unable to find prompt value" + args[2]);
                        status = false;
                    }

                } else {
                    System.out.println("unable to find prompt name" + args[1]);
                    status = false;
                }
            } else {
                System.out.println("unable to find prompt name" + args[1]);
                status = false;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return status;
    }

    public static boolean Click_Line(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, Exception {
        boolean status = false;
        String xpath1;
        String xpath2;
        String xpath3;
        String search;
        String search2;
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        try {
            String[] arguments = null;
            String[] argu1 = null;
            String[] argu2 = null;
            arguments = splitfunction(Parameters, "->");
            argu1 = splitfunction(arguments[1], "|");
            argu2 = splitfunction(arguments[2], "|");
            if (hmap.containsKey(argu1[0].trim())) {
                argu1[0] = hmap.get(argu1[0].trim());
            }
            if (hmap.containsKey(argu2[0].trim())) {
                argu2[0] = hmap.get(argu2[0].trim());
            }
            if (hmap.containsKey(argu1[1].trim())) {
                argu2[1] = hmap.get(argu2[1].trim());
            }
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + argu1[0] + "\")]/parent::th/preceding-sibling::th";
            WAITFORELEMENT(driver, "WAITFORELEMENT->" + posnum + "->" + argu2[0]);
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + argu1[0] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            xpath1 = "xpath:=(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "]//input)[" + argu1[1] + "]";
            xpath2 = "xpath:=(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(text()=\"" + argu2[0] + "\")])[" + argu2[1] + "]";
            WebElement line = Getlocator(driver, xpath1);
            if (line != null) {
                line.click();
                INVISIBLEOFLOAD(driver);
                line.sendKeys(argu2[0]);
                // WAITFORELEMENT(driver, "WAITFORELEMENT->xpath:=(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(text()=\"" + argu2[0] + "\")])[" + argu2[1] + "]->Item");
                WAITTIME("WAITTIME->4");
                WebElement downitem = Getlocator(driver, xpath2);
                if (downitem != null) {
                    // StaleElementClick(driver, "StaleElementClick->xpath:=(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(text()=\"" + argu2[0] + "\")])[" + argu2[1] + "]->"+argu1[0]);
                    // downitem.click();
                    clickElementUsingJavascriptExecutor("(//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(text()=\"" + argu2[0] + "\")])[" + argu2[1] + "]");
                    WAITTIME("WAITTIME->3");
                    status = true;
                } else {
                    System.out.println("unable to find " + argu2[0]);
                }
            } else {
                System.out.println("unable to find " + argu1[0]);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return status;
    }

    public static boolean closePopUp() throws AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {

        boolean Status = true;
        String xpath1 = "xpath:=//td[text() = \"New Inventory Transaction\" or text() = \"New Organization\" or text() = \"Choose Action\"]";
        try {
            WebElement locator = Getlocator(driver, xpath1);
            if (locator != null) {
            } else {
                SENDKEYS(driver, "SENDKEYS->ESCAPE");
                SENDKEYS(driver, "SENDKEYS->ESCAPE");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Status = false;
        }
        return Status;

    }

    public static boolean selectDate(String parameters) throws Exception {
        Boolean status = true;
        boolean flag = false;
        try {
            String[] arguments = splitfunction(parameters, "->");
            String[] odate = splitfunction(arguments[2], ",");
            arguments[2] = arguments[2].replace(odate[1], "DD/MM/YYYY");
            if (arguments[2].contains("-")) {
                flag = true;
            }
            String dateTime = Sysdate(arguments[2]);
            WebElement selectDate = driver.findElement(By.xpath("//label[text()=\"" + arguments[1] + "\"]//parent::div//i[@class=\"fa fa-lg-1x fa-calendar\"]"));
            if (selectDate != null) {
                clickElementUsingJavascriptExecutor("//label[text()=\"" + arguments[1] + "\"]//parent::div//i[@class=\"fa fa-lg-1x fa-calendar\"]");
                WAITTIME("WAITTIME->2");
                //button to move next in calendar
                WebElement nextLink = driver.findElement(By.xpath("(//th[@class=\"next\"])[1]"));
                //button to click in center of calendar header
                WebElement midLink = driver.findElement(By.xpath("(//th[@class=\"datepickerMulti-switch\"])[1]"));
                //button to move previous month in calendar
                WebElement previousLink = driver.findElement(By.xpath("(//th[@class=\"prev\"])[1]"));
                //Split the date time to get only the date part
                String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
                if (date_dd_MM_yyyy[1].equalsIgnoreCase("08")) {
                    date_dd_MM_yyyy[1] = "8";
                }
                if (date_dd_MM_yyyy[1].equalsIgnoreCase("09")) {
                    date_dd_MM_yyyy[1] = "9";
                }
                Thread.sleep(1000);
                //get the year difference between current year and year to set in calander
                int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
                midLink.click();
                Thread.sleep(1000);
                if (yearDiff != 0) {
                    //if you have to move next year
                    if (yearDiff > 0) {
                        for (int i = 0; i < yearDiff; i++) {
                            System.out.println("Year Diff->" + i);
                            // nextLink.click();
                            clickElementUsingJavascriptExecutor("(//th[@class=\"next\"])[1]");
                        }
                    } //if you have to move previous year
                    else if (yearDiff < 0) {
                        for (int i = 0; i < (yearDiff * (-1)); i++) {
                            System.out.println("Year Diff->" + i);
                            // previousLink.click();
                            clickElementUsingJavascriptExecutor("(//th[@class=\"prev\"])[1]");
                        }
                    }
                }
                //Get all months from calendar to select correct one
                List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath(" //span[contains(@class,\"month\")]"));
                Thread.sleep(1000);
                list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();
                int nowdays = 0;
                int omonth = Integer.parseInt(date_dd_MM_yyyy[1]);
                if (omonth == 06) {
                    nowdays = 0;
                } else if (omonth == 01 || omonth == 04 || omonth == 07) {
                    nowdays = 2;
                } else if (omonth == 05) {
                    nowdays = 4;
                } else if (omonth == 12 || omonth == 9) {
                    nowdays = 1;
                } else if (omonth == 03 || omonth == 11) {
                    nowdays = 6;
                } else if (omonth == 8 || omonth == 02) {
                    nowdays = 5;
                } else if (omonth == 10) {
                    nowdays = 3;
                }
                Thread.sleep(1000);
                //get all dates from calendar to select correct one
                List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//td[contains(@class,\"day\")]"));
                if (flag == true) {
                    list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) + nowdays).click();
                } else {
                    list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) + nowdays).click();
                }
            } else {
                System.out.println("unable to find calander button");
                status = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        return status;
    }

    public static boolean selectDate_Line(String parameters) throws Exception {
        Boolean status = true;
        boolean flag = false;
        try {
            String[] arguments = splitfunction(parameters, "->");
            String[] picker = splitfunction(arguments[1], "xpath:=");
            String[] odate = splitfunction(arguments[2], ",");
            arguments[2] = arguments[2].replace(odate[1], "DD/MM/YYYY");
            if (arguments[2].contains("-")) {
                flag = true;
            }
            String dateTime = Sysdate(arguments[2]);
            WebElement selectDate = driver.findElement(By.xpath(picker[1]));
            if (selectDate != null) {
                clickElementUsingJavascriptExecutor(picker[1]);
                WAITTIME("WAITTIME->2");
                //button to move next in calendar
                WebElement nextLink = driver.findElement(By.xpath("(//th[@class=\"next\"])[1]"));
                //button to click in center of calendar header
                WebElement midLink = driver.findElement(By.xpath("(//th[@class=\"datepickerWB-switch\"])[1]"));
                //button to move previous month in calendar
                WebElement previousLink = driver.findElement(By.xpath("(//th[@class=\"prev\"])[1]"));
                //Split the date time to get only the date part
                String date_dd_MM_yyyy[] = (dateTime.split(" ")[0]).split("/");
                if (date_dd_MM_yyyy[1].equalsIgnoreCase("08")) {
                    date_dd_MM_yyyy[1] = "8";
                }
                if (date_dd_MM_yyyy[1].equalsIgnoreCase("09")) {
                    date_dd_MM_yyyy[1] = "9";
                }
                Thread.sleep(1000);
                //get the year difference between current year and year to set in calander
                int yearDiff = Integer.parseInt(date_dd_MM_yyyy[2]) - Calendar.getInstance().get(Calendar.YEAR);
                midLink.click();
                Thread.sleep(1000);
                if (yearDiff != 0) {
                    //if you have to move next year
                    if (yearDiff > 0) {
                        for (int i = 0; i < yearDiff; i++) {
                            System.out.println("Year Diff->" + i);
                            // nextLink.click();
                            clickElementUsingJavascriptExecutor("(//th[@class=\"next\"])[1]");
                        }
                    } //if you have to move previous year
                    else if (yearDiff < 0) {
                        for (int i = 0; i < (yearDiff * (-1)); i++) {
                            System.out.println("Year Diff->" + i);
                            // previousLink.click();
                            clickElementUsingJavascriptExecutor("(//th[@class=\"prev\"])[1]");
                        }
                    }
                }
                //Get all months from calendar to select correct one
                List<WebElement> list_AllMonthToBook = driver.findElements(By.xpath(" //span[contains(@class,\"month\")]"));
                Thread.sleep(1000);
                int nowdays = 0;
                int omonth = Integer.parseInt(date_dd_MM_yyyy[1]);
                if (omonth == 06) {
                    nowdays = 0;
                } else if (omonth == 01 || omonth == 04 || omonth == 07) {
                    nowdays = 2;
                } else if (omonth == 05) {
                    nowdays = 4;
                } else if (omonth == 12 || omonth == 9) {
                    nowdays = 1;
                } else if (omonth == 03 || omonth == 11) {
                    nowdays = 6;
                } else if (omonth == 8 || omonth == 02) {
                    nowdays = 5;
                } else if (omonth == 10) {
                    nowdays = 3;
                }
                list_AllMonthToBook.get(Integer.parseInt(date_dd_MM_yyyy[1]) - 1).click();
                Thread.sleep(1000);
                //get all dates from calendar to select correct one
                List<WebElement> list_AllDateToBook = driver.findElements(By.xpath("//td[contains(@class,\"day\")]"));
                if (flag == true) {
                    list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) + nowdays).click();
                } else {
                    list_AllDateToBook.get(Integer.parseInt(date_dd_MM_yyyy[0]) + nowdays).click();
                }
            } else {
                System.out.println("unable to find calander button");
                status = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        return status;
    }

    public static Boolean Search_Enter_Contains(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        int wait = 2;
        Boolean Status = true;
        RecoveryScenarios();
        String value;
        String searchvalue;
        INVISIBLEOFLOAD(driver);
        try {
            String[] arguments = splitfunction(Parameters, "->");
            String label = arguments[1];
            String[] searchargs = splitfunction(arguments[2], ",");
            if (hmap.containsKey(searchargs[0].trim())) {
                value = hmap.get(searchargs[0].trim());
            } else {
                value = searchargs[0];
            }
            if (hmap.containsKey(searchargs[1].trim())) {
                searchvalue = hmap.get(searchargs[1].trim());
            } else {
                searchvalue = searchargs[1].trim();
            }

            try {
                ActionTypes actTypes = ActionTypes.valueOf(arguments[1].toUpperCase());
                switch (actTypes) {
                    case ORGANIZATION:
                        wait = 3;
                        break;
                }
            } catch (Exception e) {
                //e.printStackTrace();	
                System.out.println(e.getMessage());
            }
//String xpath = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";	
            // String xpath1 = "xpath:=//label[text()=\"" + label + "\"]/preceding-sibling::input";	
            String xpath1 = "xpath:=//div/input[@placeholder=\"" + label + "\"]";
            // String xpath1 = "xpath:=//div[contains(text(),\"" + label + "\")]/ancestor::div/following-sibling::div//td[4]";	
            String xpath2 = "xpath:=//td[text()=\"" + searchvalue + "\"]";
            String xpath3 = "xpath:=//input[@id='searchString']";
            String xpath4 = "xpath:=//div[@class=\"WBTableRender\"]//label[text()=\"" + arguments[1] + "\"]/preceding-sibling::input";
            String xpath5 = "xpath:=//div[contains(text(),\"" + arguments[1] + "\")]/ancestor::div/following-sibling::div//td[32]//input";
            String xpath6 = "xpath:=//div/input[@placeholder=\"" + label + "\"]/following-sibling::span//button[@title=\"Reset\"]";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->" + label + "");
            String[] args = splitfunction(xpath1, ":=");
            String[] args1 = splitfunction(xpath3, ":=");
            WebElement locator = null;
            WebElement locator1 = Getlocator(driver, xpath1);
            WebElement locator4 = Getlocator(driver, xpath4);
            WebElement locator5 = Getlocator(driver, xpath5);
            WebElement locator6 = Getlocator(driver, xpath6);
            WAITTIME("waittime->4");
            if ((label.toUpperCase().equalsIgnoreCase("SERVICE ORGANIZATION")) || (label.toUpperCase().equalsIgnoreCase("SHIP TO ORGANIZATION"))) {
                if (locator6 != null) {
                    locator6.click();
                }
            }

            if (locator1 != null) {
                locator = locator1;
            } else if (locator4 != null) {
                locator = locator4;
            } else {
                locator = locator5;
            }

            if (locator != null) {
                INVISIBLEOFLOAD(driver);
                clickElementUsingJavascriptExecutor(args[1]);
                INVISIBLEOFLOAD(driver);
                ElementClickable("//button[@id=\"done\" or @id=\"save\"]");
                WAITTIME("waittime->2");
                WebElement search1 = Getlocator(driver, xpath3);
                if (search1 != null) {
                    //search1.click();	
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("WAITTIME->" + wait);
                    ElementClickable("//input[@id='searchString']");
                    search1.clear();
                    // WAITTIME("WAITTIME->3");
                    try {
                        typeValueUsingJavaScriptExecutor(args1[1], value);
                    } catch (Exception e) {
                        search1 = Getlocator(driver, xpath3);
                        search1.sendKeys(value);
                        INVISIBLEOFLOAD(driver);
                    }
                }
                ElementClickable("(//button[@id=\"search\"])[1]");
                WebElement search2 = Getlocator(driver, "xpath:=(//button[@id=\"search\"])[1]");
                INVISIBLEOFLOAD(driver);
                // WAITTIME("WAITTIME->3");
                search2.click();
                INVISIBLEOFLOAD(driver);

                try {
                    ElementVisible("//td(text()=\"" + searchvalue + "\")");
                } catch (Exception e) {
                    System.out.println("element not clickable");
                }
                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                // WAITTIME("WAITTIME->" + wait);
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    locator2.click();
                    INVISIBLEOFLOAD(driver);
                    //SENDKEYS(driver, "sendkeys->TAB");	
                } else {
                    System.out.println("unable to find search item");
                }
                ElementClickable("//button[@id=\"done\" or @id=\"save\"]");
                boolean status = driver.findElements(By.xpath("//button[@id=\"done\" or @id=\"save\"]")).size() > 0;
                WebElement Dones = Getlocator(driver, "xpath:=//button[@id=\"done\" or @id=\"save\"]");
                if (Dones != null) {
                    Dones.click();
                    WAITTIME("WAITTIME->2");
                    INVISIBLEOFLOAD(driver);
                    Dones = Getlocator(driver, "xpath:=//button[@id=\"done\" or @id=\"save\"]");
                    if (Dones != null) {
                        StaleElementClick(driver, "StaleElementClick->xpath:=//button[@id=\"done\" or @id=\"save\"]-> done");
                    }
                } else {
                    // ReportFunctions.LogRepoter("Fail", "Click on Done", "Verify the Prompt: Unable to find Done Button");
                }
            }
        } catch (Exception e) {
            Status = false;
        }
        return Status;
    }

    public static void Automation_Summary() throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        Boolean Status = true;
        final long MSEC_SINCE_EPOCH = System.currentTimeMillis();
        try {
            String datasheet = hmap.get(suitename);
            Date instant = new Date(MSEC_SINCE_EPOCH);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
            String time = sdf.format(instant);
            time = time.replace(':', '-');
            datasheet = datasheet + "_" + time;
            ArrayList<String> br = ReadXMLFile();
            String workingDirectory = new java.io.File(".").getCanonicalPath();
            //  System.out.println(workingDirectory);
            String path = workingDirectory + "/Automation_Summary";
            File file1 = new File(path + "/" + datasheet + ".xlsx");
            summarypath = file1.getName();
            File file = new File(path);
            file1.createNewFile();
            FileOutputStream fileOut = new FileOutputStream(file1);
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet spreadsheet1;
            XSSFSheet spreadsheet2;
            spreadsheet1 = workbook.createSheet(datasheet);
            XSSFRow Srow;
            XSSFCellStyle style = workbook.createCellStyle();
            style.setBorderTop(BorderStyle.DOUBLE);
            style.setBorderBottom(BorderStyle.DOUBLE);
            style.setFillBackgroundColor(HSSFColor.GREY_25_PERCENT.index);
            XSSFFont font = workbook.createFont();
            font.setFontName(XSSFFont.DEFAULT_FONT_NAME);
            font.setFontHeightInPoints((short) 10);
            font.setBold(true);
            font.setColor(HSSFColor.BLUE.index);
            style.setFont(font);
            Srow = spreadsheet1.createRow(0);
            XSSFCell Scell;
            Scell = Srow.createCell(0);
            Scell.setCellValue("Automation Summary");
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(1);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Suite Name");
            Scell = Srow.createCell(1);
            Scell.setCellValue(hmap.get(suitename));
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(2);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Suite Final Status ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(hmap.get(ESuitestatus));
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(3);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Test Cases Executed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(casecount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(4);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Suite Execution Time");
            Scell = Srow.createCell(1);
            Scell.setCellValue(ESuiteDuration);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(5);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Cases Passed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(TCpasscount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(6);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Total Cases Failed ");
            Scell = Srow.createCell(1);
            Scell.setCellValue(TCfailcount);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(7);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Release Name");
            Scell = Srow.createCell(1);
            Scell.setCellValue(releasename);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(8);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Environment and URL");
            Scell = Srow.createCell(1);
            Scell.setCellValue(environmentname);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(9);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Tenant");
            Scell = Srow.createCell(1);
            Scell.setCellValue(suitetenant);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(10);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Executed By");
            Scell = Srow.createCell(1);
            Scell.setCellValue(runsuser);
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Srow = spreadsheet1.createRow(12);
            Scell = Srow.createCell(0);
            Scell.setCellValue("Test Case Name");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(1);
            Scell.setCellValue("Execution Time ");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(2);
            Scell.setCellValue("Status ");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Scell = Srow.createCell(3);
            Scell.setCellValue("Steps ");
            style.setAlignment(HorizontalAlignment.CENTER);
            Scell.setCellStyle(style);
            Iterator<String> itr = br.iterator();
            Iterator<String> itr1 = br.iterator();
            int i = 13;
            XSSFRow Srow1;
            XSSFCell Scell1;
            XSSFCell Scell2;
            XSSFCell Scell3;
            XSSFFont whitefont = workbook.createFont();
            whitefont.setColor(HSSFColor.WHITE.index);
            XSSFFont blackfont = workbook.createFont();
            blackfont.setColor(HSSFColor.BLACK.index);
            XSSFCellStyle style1 = workbook.createCellStyle();
            XSSFCellStyle style2 = workbook.createCellStyle();
            XSSFCellStyle style3 = workbook.createCellStyle();
            XSSFCellStyle style4 = workbook.createCellStyle();
            XSSFCellStyle style5 = workbook.createCellStyle();
            XSSFCellStyle style6 = workbook.createCellStyle();
            XSSFCellStyle style7 = workbook.createCellStyle();
            XSSFFont font3 = workbook.createFont();
            font3.setFontName(XSSFFont.DEFAULT_FONT_NAME);
            font3.setFontHeightInPoints((short) 10);
            font3.setBold(true);
            style7.setFont(font3);
            XSSFFont font2 = workbook.createFont();
            font2.setFontName(XSSFFont.DEFAULT_FONT_NAME);
            font2.setFontHeightInPoints((short) 10);
            font2.setBold(true);
            font2.setColor(HSSFColor.RED.index);
            style6.setFont(font2);
            XSSFFont font1 = workbook.createFont();
            font1.setFontName(XSSFFont.DEFAULT_FONT_NAME);
            font1.setFontHeightInPoints((short) 10);
            font1.setBold(true);
            font1.setColor(HSSFColor.BLUE.index);
            style5.setFont(font1);
            style1.setFont(font);
            style1.setFont(whitefont);
            style1.setBorderBottom(BorderStyle.THIN);
            style2.setFont(font);
            style2.setFont(whitefont);
            style2.setBorderBottom(BorderStyle.THIN);
            style3.setFont(font);
            style3.setFont(blackfont);
            style3.setBorderBottom(BorderStyle.THIN);
            // style4.setBorderBottom(BorderStyle.THIN);
            style4.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            style4.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
            while (itr.hasNext()) {
                List ls = xmlcases.get((itr1.next()));
                int size = ls.size();
                Srow1 = spreadsheet1.createRow(i);
                Scell1 = Srow1.createCell(0);
                Scell1.setCellStyle(style7);
                Scell1.setCellValue(itr.next());
                Scell1 = Srow1.createCell(1);
                Scell1.setCellStyle(style7);
                Scell1.setCellValue(itr.next());
                Scell1 = Srow1.createCell(2);
                Scell1.setCellValue(itr.next());
                Scell1.setCellStyle(style7);
                Scell2 = workbook.getSheetAt(0).getRow(i).getCell(2);
                if (Scell2.toString().equalsIgnoreCase("PASS")) {
                    style1.setAlignment(HorizontalAlignment.CENTER);
                    style1.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    style1.setFillForegroundColor(IndexedColors.GREEN.getIndex());
                    Scell2.setCellStyle(style1);
                } else {
                    style2.setAlignment(HorizontalAlignment.CENTER);
                    style2.setFillPattern(FillPatternType.SOLID_FOREGROUND);
                    style2.setFillForegroundColor(IndexedColors.RED.getIndex());
                    Scell2.setCellStyle(style2);
                }
                Scell3 = Srow1.createCell(3);
                for (int q = 0; q <= ls.size() - 1; q++) {
                    if (((String) ls.get(q)).toUpperCase().contains("FAILED TO") || ((String) ls.get(q)).toUpperCase().contains("UNABLE TO")) {
                        Scell3.setCellValue((String) ls.get(q));
                        Scell3.setCellStyle(style6);
                    } else {
                        Scell3.setCellValue((String) ls.get(q));
                        Scell3.setCellStyle(style5);
                    }

                    i = i + 1;
                    Srow1 = spreadsheet1.createRow(i);
                    Scell1 = Srow1.createCell(0);
                    Scell3 = Srow1.createCell(3);
                    Scell1.setCellStyle(style4);
                }

                i++;
                itr1.next();
                itr1.next();
            }

//          spreadsheet1.setColumnWidth(2, 2000);
            for (int m = 0; m < 200; m++) {
                spreadsheet1.autoSizeColumn(m);
            }
            workbook.write(fileOut);
            fileOut.flush();
            fileOut.close();
            TCpasscount = 0;
            TCfailcount = 0;
            casecount = 0;
        } catch (Exception e) {

            System.out.println("Automation Summary" + e);
        }

    }

    public static void sendAttachmentEmail(String toEmail, String subject, String body) throws IOException, SAXException, InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {
        String ipaddress = "http://";
        String ip = null;
        InetAddress myIP = InetAddress.getLocalHost();
        ip = myIP.getHostAddress();
        ipaddress = ipaddress + ip + "/";
        ArrayList<String> br = ReadmailFile();
        int passperc = (TCpasscount * 100) / casecount;
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        try {
            final String fromEmail = "kg.automation.rundetails@gmail.com";
            final String password = "Welcome@135";
            //System.out.println("SSLEmail Start");
            Properties props = new Properties();
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.socketFactory.port", "465");
            props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.port", "465");

            Authenticator auth = new Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(fromEmail, password);
                }
            };

            Session session = Session.getDefaultInstance(props, auth);
            MimeMessage msg = new MimeMessage(session);
            msg.addHeader("Content-type", "text/HTML; charset=UTF-8");
            msg.addHeader("format", "flowed");
            msg.addHeader("Content-Transfer-Encoding", "8bit");
            msg.setFrom(new InternetAddress("kg.automation.rundetails@gmail.com", "KG_Automation_Run_Details"));
            msg.setReplyTo(InternetAddress.parse("kg.automation.rundetails@gmail.com", false));
            msg.setSubject(subject, "UTF-8");
            msg.setSentDate(new Date());
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail, false));
            BodyPart messageBodyPart = new MimeBodyPart();
            BodyPart messageBodyPart1 = new MimeBodyPart();
            String file1 = ipaddress + mailsuite + "/Main_Page.html";
            String file2 = "Executed By:   " + runsuser;
            String file3 = "Tenant Name:  " + suitetenant;
            String file4 = "Release:   " + releasename;
            String file5 = "Evironment and URL:   " + environmentname;
            messageBodyPart.setText(body + "\n\n" + file2 + "\n\n" + file3 + "\n\n" + file4 + "\n\n" + file5 + "\n\n" + file1 + "\n\n" + "Thanks and Regards, \n\n Automation Team");
            String bodycontent;
            if (TCfailcount != 0) {
                bodycontent = mailBodyContent_fail();
            } else {
                bodycontent = mailBodyContent_pass();
            }
            messageBodyPart.setContent(
                    body + "\n\n"
                    + "<br>"
                    + "<br>"
                    + "<p style='color:grey'" + "\n\n" + "/p>"
                    + file2 + "\n\n" + "\n\n"
                    + "<br>"
                    + file3 + "\n\n" + "\n\n"
                    + "<br>"
                    + file4 + "\n\n" + "\n\n"
                    + "<br>"
                    + file5 + "\n\n" + "\n\n"
                    + "<br>"
                    + "<br>"
                    + file1 + "\n\n" + "\n\n"
                    + bodycontent
                    + "\n\n Automation Team",
                    "text/html");
            String workingDirectory = new java.io.File(".").getCanonicalPath();
            String dir = workingDirectory;
            String filename = dir + "\\Automation_Summary\\" + summarypath;
            DataSource source = new FileDataSource(filename);
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);
            multipart.addBodyPart(messageBodyPart1);
            messageBodyPart = new MimeBodyPart();
            msg.setText(file1, StandardCharsets.UTF_8.name());
            messageBodyPart1.setDataHandler(new DataHandler(source));
            String AutomationSummary = new File(filename).getName();
            messageBodyPart1.setFileName(AutomationSummary);
            msg.setContent(multipart);
            Transport.send(msg);
            System.out.println("EMail Sent Successfully with attachment!!");
        } catch (MessagingException e) {
            System.out.println(e.getMessage());
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }

    public static String mailBodyContent_fail() throws IOException, SAXException, InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {
        TCpasscount = 0;
        TCfailcount = 0;
        ArrayList<String> br = ReadmailFile();
        int passperc = (TCpasscount * 100) / casecount;
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        String text
                = "<br>"
                + "<br>"
                + "<br>"
                + "<br>"
                + "<table width='100%' border='0' align='center'  style='border:2px solid black;background-color:lightblue'>"
                + "<tr align='center'>"
                + "<td style='background-color:midnightblue;color:white' width='48%'><b>Test Results <b></td>"
                + "<td style='background-color:blue;color:white' width='58%'><b>Schedule<b></td>"
                + "</tr>"
                + "<table width='210%' border='1' align='center' background-color='blue'>"
                + "<tr align='center'>"
                + "<td><b># Flows <b></td>"
                + "<td width='10%'><b>Pass<b></td>"
                + "<td width='12%'><b>Fail<b></td>"
                + "<td><b>% Pass<b></td>"
                + "<td><b>Date of Run<b></td>"
                + "<td><b>Start Time<b></td>"
                + "<td><b>End Time<b></td>"
                + "<td><b>Duration <b></td>"
                + "</tr>"
                + "<tr align='center'>"
                + "<td style='background-color:white'><b>" + casecount + "<b></td>"
                + "<td style='background-color:white'><b>" + TCpasscount + "<b></td>"
                + "<td style='background-color:white'><b>" + TCfailcount + "<b></td>"
                + "<td style='background-color:white'><b>" + passperc + "<b></td>"
                + "<td style='background-color:white'><b>" + formattedDate + "<b></td>"
                + "<td style='background-color:white'><b><b>" + mailstarttime + "</td>"
                + "<td style='background-color:white'><b>" + mailendtime + "<b></td>"
                + "<td style='background-color:white'><b>" + ESuiteDuration + "<b></td>"
                + "</tr>"
                + " </table>"
                + " </table>"
                + "<br>"
                + "<br>"
                + "<table width='100%' border='0' align='center'  style='border:2px solid black;background-color:lightblue'>"
                + "<tr align='center'>"
                + "<td style='background-color:blue;color:white' width='50%'><b>Test Case Name<b></td>"
                + "<td style='background-color:blue;color:white' width='50%'><b>Failed Comments<b></td>"
                + "</tr>"
                + "<table width='201%' border='0' align='center' background-color:'white'>";

        for (Map.Entry<String, String> mailvalue : mailcontent.entrySet()) {
            text = text + "<tr style='color:white align='left'>";
            text = text + "<td  style='background-color:white'width='49.95%'><b>" + mailvalue.getKey() + "<b></td>";
            text = text + "<td  style='background-color:white'width='105.95%'><b>" + mailvalue.getValue() + "<b></td>";
            text = text + "</tr>";
            text = text + "<td>";
            text = text + "</td>";

        }
        String text2
                = " </table>"
                + " </table>"
                + "<br>"
                + "\n\n" + "Thanks and Regards,"
                + "<br>"
                + "<br>";
        String text5 = text + text2;

        String stime[] = split(mailstarttime, " ");
        String Etime[] = split(mailendtime, " ");
        Writedata.add(Customername);
        Writedata.add(sheetsuitename);
        Writedata.add(Typeofrun);
        Writedata.add(sheetenvironment);
        Writedata.add(casecount);
        Writedata.add(TCpasscount);
        Writedata.add(TCfailcount);
        Writedata.add(passperc);
        Writedata.add(formattedDate);
        Writedata.add(stime[1]);
        Writedata.add(Etime[1]);
        Writedata.add(ESuiteDuration);
        Writedata.add(releasename);

        mailcontent.clear();

        return text5;
    }

    public static String mailBodyContent_pass() throws IOException, SAXException, InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {
        TCpasscount = 0;
        TCfailcount = 0;
        ArrayList<String> br = ReadmailFile();
        int passperc = (TCpasscount * 100) / casecount;
        LocalDate today = LocalDate.now();
        String formattedDate = today.format(DateTimeFormatter.ofPattern("dd-MMM-yy"));
        String text
                = "<br>"
                + "<br>"
                + "<br>"
                + "<br>"
                + "<table width='100%' border='0' align='center'  style='border:2px solid black;background-color:lightblue'>"
                + "<tr align='center'>"
                + "<td style='background-color:midnightblue;color:white' width='48%'><b>Test Results <b></td>"
                + "<td style='background-color:blue;color:white' width='58%'><b>Schedule<b></td>"
                + "</tr>"
                + "<table width='210%' border='1' align='center' background-color='blue'>"
                + "<tr align='center'>"
                + "<td><b># Flows <b></td>"
                + "<td width='10%'><b>Pass<b></td>"
                + "<td width='12%'><b>Fail<b></td>"
                + "<td><b>% Pass<b></td>"
                + "<td><b>Date of Run<b></td>"
                + "<td><b>Start Time<b></td>"
                + "<td><b>End Time<b></td>"
                + "<td><b>Duration <b></td>"
                + "</tr>"
                + "<tr align='center'>"
                + "<td style='background-color:white'><b>" + casecount + "<b></td>"
                + "<td style='background-color:white'><b>" + TCpasscount + "<b></td>"
                + "<td style='background-color:white'><b>" + TCfailcount + "<b></td>"
                + "<td style='background-color:white'><b>" + passperc + "<b></td>"
                + "<td style='background-color:white'><b>" + formattedDate + "<b></td>"
                + "<td style='background-color:white'><b><b>" + mailstarttime + "</td>"
                + "<td style='background-color:white'><b>" + mailendtime + "<b></td>"
                + "<td style='background-color:white'><b>" + ESuiteDuration + "<b></td>"
                + "</tr>"
                + " </table>"
                + " </table>"
                + "<br>"
                + "<br>"
                + " </table>"
                + "<br>"
                + "\n\n" + "Thanks and Regards,"
                + "<br>"
                + "<br>";
        String stime[] = split(mailstarttime, " ");
        String Etime[] = split(mailendtime, " ");
        Writedata.add(Customername);
        Writedata.add(sheetsuitename);
        Writedata.add(Typeofrun);
        Writedata.add(sheetenvironment);
        Writedata.add(casecount);
        Writedata.add(TCpasscount);
        Writedata.add(TCfailcount);
        Writedata.add(passperc);
        Writedata.add(formattedDate);
        Writedata.add(stime[1]);
        Writedata.add(Etime[1]);
        Writedata.add(ESuiteDuration);
        Writedata.add(releasename);

        mailcontent.clear();
        return text;

    }

    public static ArrayList<String> ReadXMLFile() throws ParserConfigurationException, SAXException, InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        ArrayList<String> ar = new ArrayList<String>();
        String res;
        try {
            // File file = new File("C:\\Users\\mpentakota\\Documents\\NetBeansProjects\\AutomationRegression\\Reports\\SCM_2020-07-05-09-09-01/XmlReport.xml");
            File file = new File(xmlSavedLocation);
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("TestSuite");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    ESuiteDuration = eElement.getAttribute("Duration");
                    hmap.put(Esuitename, eElement.getAttribute("Name"));
                    hmap.put(ESuitestatus, eElement.getAttribute("FinalStatus"));
                    mailstarttime = eElement.getAttribute("StartTime");
                    mailendtime = eElement.getAttribute("EndTime");
                }
            }
            nList = doc.getElementsByTagName("TestCase");
            casecount = nList.getLength();
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                xmlsteps = new ArrayList<>();
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    for (int step = 0; step <= nNode.getChildNodes().getLength() - 1; step++) {
                        xmlsteps.add((eElement.getElementsByTagName("TestStep").item(step).getAttributes().item(6).getNodeValue()));
                    }
                    xmlcases.put(eElement.getAttribute("Name"), xmlsteps);
                    sanitymap.put(sanitycnt, eElement.getAttribute("Name"));
                    ar.add(eElement.getAttribute("Name"));
                    ar.add(eElement.getAttribute("Duration"));
                    ar.add(eElement.getAttribute("FinalStatus"));
                    if (eElement.getAttribute("FinalStatus").equalsIgnoreCase("PASS")) {
                        TCpasscount = TCpasscount + 1;
                    } else {
                        TCfailcount = TCfailcount + 1;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ar;
    }

    public static ArrayList<String> ReadmailFile() throws ParserConfigurationException, SAXException, InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        ArrayList<String> ar = new ArrayList<String>();
        String res;
        try {
            // File file = new File("C:\\Users\\mpentakota\\Documents\\NetBeansProjects\\AutomationRegression\\Reports\\SCM_2020-07-05-09-09-01/XmlReport.xml");
            File file = new File(xmlSavedLocation);
            DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            Document doc = dBuilder.parse(file);
            doc.getDocumentElement().normalize();
            NodeList nList = doc.getElementsByTagName("TestSuite");
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    ESuiteDuration = eElement.getAttribute("Duration");
                    hmap.put(Esuitename, eElement.getAttribute("Name"));
                    hmap.put(ESuitestatus, eElement.getAttribute("FinalStatus"));
                    mailstarttime = eElement.getAttribute("StartTime");
                    mailendtime = eElement.getAttribute("EndTime");
                }
            }
            nList = doc.getElementsByTagName("TestCase");
            casecount = nList.getLength();
            for (int temp = 0; temp < nList.getLength(); temp++) {
                Node nNode = nList.item(temp);
                xmlsteps = new ArrayList<>();
                if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                    Element eElement = (Element) nNode;
                    xmlcases.put(eElement.getAttribute("Name"), xmlsteps);
                    sanitymap.put(sanitycnt, eElement.getAttribute("Name"));

                    // ar.add(eElement.getAttribute("Duration"));
                    //ar.add(eElement.getAttribute("FinalStatus"));
                    if (eElement.getAttribute("FinalStatus").equalsIgnoreCase("PASS")) {
                        TCpasscount = TCpasscount + 1;
                    } else {
                        TCfailcount = TCfailcount + 1;
                        for (int step = 0; step <= nNode.getChildNodes().getLength() - 1; step++) {
                            if (eElement.getElementsByTagName("TestStep").item(step).getAttributes().item(4).getNodeValue().equalsIgnoreCase("FAIL")) {
                                String mailstep = (eElement.getElementsByTagName("TestStep").item(step).getAttributes().item(6).getNodeValue());
                                String mailcase = eElement.getAttribute("Name");
                                if (mailcontent.containsValue(mailstep)) {
                                } else {
                                    mailcontent.put(mailcase, mailstep);
                                }
                            }
                        }
                    }

                }
            }
//            for (Entry<String, String> mailvalue : mailcontent.entrySet()) {
//                System.out.println(mailvalue.getKey());
//                System.out.println(mailvalue.getValue());
//            }
//            Iterator<String> itr = mailcontent.keySet().iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return ar;
    }

    public static Boolean FrameClick_Enter(String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        INVISIBLEOFLOAD(driver);
        WAITTIME("waittime->2");
        Boolean Status = false;
        String value;
        String[] arguments = splitfunction(Parameters, "->");
        String label = arguments[1];
        try {
            if (hmap.containsKey(arguments[2].trim())) {
                value = hmap.get(arguments[2].trim());
            } else {
                value = arguments[2].trim();
            }
            //  String xpath2 = "xpath:=//a[text()=\"" + value + "\"]";
            String xpath = "xpath:=//div/label[text()=\"" + label + "\"]/preceding-sibling::input";
            String xpath2 = "xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[contains(text(),\"" + value + "\")]";
            String xpath3 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//input";
            String xpath4 = "xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[contains(text(),\"" + value + "\")]";
            String xpath5 = "xpath:=//div/label[text()=\"" + label + "\"]/following-sibling::span//button";

            // WAITFORELEMENT(driver, "waitforelement->" + xpath + "->" + label + "");
            WebElement locator = Getlocator(driver, xpath);
            WebElement locator3 = Getlocator(driver, xpath3);
            WebElement locator5 = Getlocator(driver, xpath5);
            if (locator != null) {
                locator.click();
                locator.clear();
                locator.sendKeys(value);
                WAITTIME("waittime->7");
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                ElementClickable("//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[contains(text(),\"" + value + "\")]");
                WebElement locator2 = Getlocator(driver, xpath2);
                if (locator2 != null) {
                    WAITTIME("waittime->5");
                    //locator2.click();
                    StaleElementClick(driver, "StaleElementClick->xpath:=//label[text()=\"" + label + "\"]/ancestor::div/following-sibling::ul//a[contains(text(),\"" + value + "\")]->" + value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->3");
                    System.out.println("Succesfully entered value" + " " + arguments[2]);
                    Status = true;
                } else {
                    Status = false;
                }

            } else if (locator3 != null) {
                locator3.click();
                locator3.clear();
                locator3.sendKeys(value);
                WAITTIME("waittime->5");
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + value + "");
                ElementClickable("//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[contains(text(),\"" + value + "\")]");
                WebElement locator4 = Getlocator(driver, xpath4);
                if (locator4 != null) {
                    // locator4.click();
                    StaleElementClick(driver, "StaleElementClick->xpath:=//td[text()=\"" + label + "\"]/following-sibling::td//following-sibling::ul//a[contains(text(),\"" + value + "\")]->" + value);
                    INVISIBLEOFLOAD(driver);
                    WAITTIME("waittime->5");
                    System.out.println("Succesfully entered value" + " " + arguments[2]);
                    Status = true;
                } else {
                    //ReportFunctions.LogRepoter("Fail", "click on the object", "unable to find" + " " + value);
                    Status = false;
                }

            } else {
                System.out.println("unable to find" + " " + arguments[2]);
                Status = false;
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            Status = false;
        }
        return Status;

    }

    public static Boolean ReadTestData(String path) throws IOException {
        Sheet envsheet;
        String workingDirectory = new java.io.File(".").getCanonicalPath();
        String FilePath = workingDirectory + "\\TestData" + path;
        FileInputStream envfs = new FileInputStream(FilePath);
        Workbook envwb = new XSSFWorkbook(envfs);
        envsheet = envwb.getSheetAt(0);
        //envwb.setMissingCellPolicy(Row.CREATE_NULL_AS_BLANK);
        int envrowcount = envsheet.getLastRowNum();
        int envcolcount = envsheet.getRow(envrowcount).getLastCellNum();
        int Rowval = 1;
        int colval = 1;

        String strenvname = "";
        String strenvvalue = "";

        for (Rowval = 1; Rowval <= envrowcount; Rowval++) {
            Row ro = envsheet.getRow(Rowval);

            if ((ro != null)) {
                Cell cell1 = envsheet.getRow(Rowval).getCell(0);
                Cell cell2 = envsheet.getRow(Rowval).getCell(1);
                strenvname = cell1.getStringCellValue();
                strenvname.trim();
                strenvvalue = cell2.getStringCellValue();
                strenvvalue.trim();
                if (strenvname.contains("#")) {
                    Rowval++;
                } else if (strenvname != null && strenvvalue != null) {
                    hmap.put(strenvname, strenvvalue);
                }
            } else {
                System.out.println("value is null" + " " + strenvname);
                System.out.println("value is null" + " " + strenvvalue);
            }
        }
        return true;

    }

    public static boolean Unselect_All(WebDriver WebDriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        String Reset = "xpath:=//button[@name=\"reset\"]";
        ElementVisible(Reset);
        ElementClickable("//button[@name=\"reset\"]");
        int index = 1;
        Boolean flag = null;
        String Apply = "xpath:=//button[@name=\"reset\"]/ancestor::div/following-sibling::div//button[@title='Apply']";
        String Apply1 = "xpath:=//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]";
        WebElement Applies = Getlocator(driver, Apply);
        WebElement Applies1 = Getlocator(driver, Apply1);
        if (Applies1 != null) {
            Applies1.click();
        }
        String more = "xpath:=//div[@style=\"float: right; display: block;\"]";
        ElementClickable("//div[@style=\"float: right; display: block;\"]");
        WebElement morebutton = Getlocator(driver, more);
        if (morebutton != null) {
            morebutton.click();
            ElementVisible("//div[@style=\"float: right; display: block;\"]");
            ElementClickable("//div[@style=\"float: right; display: block;\"]");
            INVISIBLEOFLOAD(driver);
        }
        Boolean status = true;
        String[] arguments = splitfunction(parameters, "->");
        String allchoices = "xpath:=//input[@value=\"Select All\" or @value =\"All Choices\" ]";
        String search = "xpath:=//input[@id=\"prompt_search\"]";
        String Done = "xpath:=//button[@id=\"done\" or @id=\"save\"]";
        WebElement Promtnames;
        arguments[1]=arguments[1].trim();
        String Promtname = "xpath:=//input[@placeholder=\"" + arguments[1] + "\"]/following-sibling::label";
        String Promtname1 = "xpath:=//input[@placeholder=\"" + arguments[1] + "\"]/following-sibling::img";
        ElementClickable("//input[@placeholder=\"" + arguments[1] + "\"]/following-sibling::label");
        WebElement Promt1 = Getlocator(driver, Promtname);
        WebElement Promt2 = Getlocator(driver, Promtname1);
        if (Promt1 != null) {
            Promtnames = Promt1;
        } else {
            Promtnames = Promt2;
        }
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        if (Promtnames != null) {
            Promtnames.click();
            ElementClickable("//input[@value=\"Select All\" or @value =\"All Choices\"]");
            WAITFORELEMENT(driver, "waitforelement->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Search");
            WebElement allchoice = Getlocator(driver, allchoices);
            if (allchoice != null) {
                WAITTIME("WAITTIME->4");
                INVISIBLEOFLOAD(driver);
                allchoice = Getlocator(driver, allchoices);
                StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                WAITTIME("WAITTIME->4");
                INVISIBLEOFLOAD(driver);
                flag = ISSELECTED(driver, "ISSELECTED->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                if (flag == false) {
                    StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                }
                WAITTIME("WAITTIME->4");
                INVISIBLEOFLOAD(driver);
                StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                WAITTIME("WAITTIME->4");
                flag = ISSELECTED(driver, "ISSELECTED->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                if (flag == true) {
                    WAITTIME("WAITTIME->3");
                    INVISIBLEOFLOAD(driver);
                    StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                }
                flag = ISSELECTED(driver, "ISSELECTED->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                if (flag == true) {
                    WAITTIME("WAITTIME->3");
                    INVISIBLEOFLOAD(driver);
                    StaleElementClick(driver, "StaleElementClick->xpath:=//input[@value=\"Select All\" or @value =\"All Choices\"]->Select All");
                }
            }
            WebElement Dones = Getlocator(driver, Done);
            if (Dones != null) {
                Dones.click();
                WAITTIME("WAITTIME->5");
                INVISIBLEOFLOAD(driver);
            } else {
                ReportFunctions.LogRepoter("Fail", "Click on Done", "Verify the Prompt: Unable to find Done Button");
            }
            Applies = Getlocator(driver, Apply);
            if (Applies != null) {
                Applies.click();
                WAITTIME("WAITTIME->3");
                INVISIBLEOFLOAD(driver);
            } else if (Applies1 != null) {
                clickElementUsingJavascriptExecutor("//button[@name=\"reset\"]/parent::div/preceding-sibling::div//button[contains(text(),'Apply')]");
            } else {
                ReportFunctions.LogRepoter("Fail", "Click on Apply", "Verify the Prompt: unable to find Apply button");
            }
        } else {
            System.out.println("unable to find prompt name");
            status = false;
        }
        return status;
    }

    public static long captureTime(WebDriver driver) throws AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {
        Long startTime = System.currentTimeMillis();
        INVISIBLEOFLOAD(driver);
        Long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        //  System.out.println("Total Time taken: "+totalTime);
        return totalTime;
    }

    public static boolean scrollHorizontal(String xpath) {
        boolean status = true;
        try {
            WebElement problematicElement = driver.findElement(By.xpath(xpath.trim()));
            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView()", problematicElement);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        return status;
    }

    public static boolean rightclick_select(WebDriver driver, String parametrers) {
        boolean status = true;
        try {
            String[] arguments = splitfunction(parametrers, "->");
            WebElement locator = Getlocator(driver, arguments[1].trim());
            Actions act = new Actions(driver);
            act.contextClick(locator).build().perform();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        return status;
    }

    public static boolean mouseover_click(WebDriver driver, String parametrers) {
        boolean status = true;
        try {
            String[] arguments = splitfunction(parametrers, "->");
            String xpath1 = "xpath:=/div[@class=\"dropdown\"]//button[text()=\"" + arguments[1].trim() + "\"]";
            String xpath2 = "xpath:=//div[@class=\"dropdown-content\"]//a[text()=\"" + arguments[2].trim() + "\"]";
            WebElement locator = Getlocator(driver, xpath1);
            if (locator != null) {
                locator.click();
                WAITTIME("WAITTIME->3");
                WebElement locator1 = Getlocator(driver, xpath2);
                if (locator1 != null) {
                    locator1.click();
                } else {
                    System.out.println("unable to find locator after mouse over");
                }
            } else {
                System.out.println("unable to find locator");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            status = false;
        }
        return status;
    }

    public static boolean Actions(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        RecoveryScenarios();
        WAITTIME("WAITTIME->2");
        INVISIBLEOFLOAD(driver);
        boolean Status = false;
        String xpath1;
        try {
            String[] arguments = splitfunction(Parameters, "->");
            xpath1 = "xpath:=//button[text()=\"Actions \" or text()=\"Actions\"] ";
            WAITFORELEMENT(driver, "waitforelement->" + xpath1 + "->Actions");
            String xpath2 = "xpath:=//a[text()=\"" + arguments[2].trim() + "\"]";
            WAITTIME("WAITTIME->2");
            WebElement Action = Getlocator(driver, xpath1);
            if (Action != null) {
                Action.click();
                WAITTIME("WAITTIME->2");
                INVISIBLEOFLOAD(driver);
                // WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->Action Item");
                WebElement ActionItem = Getlocator(driver, xpath2);
                if (ActionItem != null) {
                    ActionItem.click();
                    WAITTIME("WAITTIME->2"
                            + ""
                            + "");
                    INVISIBLEOFLOAD(driver);
                    Status = true;
                } else {
                    //System.out.println("Unable to find left pane action items");
                }
            } else {
                //System.out.println("Unable to find left pane action button");
            }
        } catch (Exception e) {
            //System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }

    public static boolean SelectLine_Contains(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, Exception {
        boolean Status = false;
        String xpath1;
        String xpath2;
        WAITTIME("WAITTIME->" + wait);
        INVISIBLEOFLOAD(driver);
        try {
            String[] arguments = null;
            String[] argu1 = null;
            String[] argu2 = null;
            arguments = splitfunction(Parameters, "->");
            String local_wait = wait;
            try {
                if (arguments != null && arguments.length >= 4) {
                    local_wait = arguments[3];
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            WAITTIME("waittime->" + local_wait);
            argu1 = splitfunction(arguments[1], "|");
            argu2 = splitfunction(arguments[2], "|");
            if (hmap.containsKey(argu1[0].trim())) {
                argu1[0] = hmap.get(argu1[0].trim());
            }
            if (hmap.containsKey(argu2[0].trim())) {
                argu2[0] = hmap.get(argu2[0].trim());
            }
            if (hmap.containsKey(argu1[1].trim())) {
                argu2[1] = hmap.get(argu2[1].trim());
            }
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + argu1[0] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + argu1[0] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }
            xpath1 = "xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::div//td[" + pos + "]//input)[" + argu1[1] + "]";
            xpath2 = "xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(contains(text(),\"" + argu2[0] + "\"))])[" + argu2[1] + "]";
            String args1[] = xpath1.split("xpath:=");
            String args2[] = xpath2.split("xpath:=");
            WebElement label = Getlocator(driver, xpath1);
            if (label != null) {
                label.click();
                WAITTIME("waittime->" + local_wait);

                label.clear();

                label.sendKeys(argu2[0]);
//                            String args1[] = xpath1.split("xpath:=");	
                WebElement locator2 = Getlocator(driver, xpath2);

                WAITFORELEMENT(driver, "waitforelement->" + xpath2 + "->" + argu2[0] + "");
                //    WAITTIME("WAITTIME->4");	
                //  locator2.click();	
                if (locator2 != null) {
                    WAITTIME("waittime->" + local_wait);
                    clickElementUsingJavascriptExecutor(args2[0]);
                    WAITTIME("waittime->" + local_wait);

                    // SENDKEYS(driver, "SENDKEYS->ENTER");	
                    INVISIBLEOFLOAD(driver);
                    try {
                        WebElement dropval = Getlocator(webdriver, "xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(contains(text(),\"" + argu2[0] + "\"))])[" + argu2[1] + "]");
                        if (dropval != null) {
                            StaleElementClick(driver, "StaleElementClick->xpath:= (//div[contains(text(),\"" + argu1[0] + "\")]/ancestor::div/following-sibling::ul//a[(contains(text(),\"" + argu2[0] + "\"))])[" + argu2[1] + "]->" + argu1[0]);
                            WAITTIME("WAITTIME->5");
                        }
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    Status = true;
                }
            } else {
                ReportFunctions.LogRepoter("Fail", "SelectLine", "Unable to find Label" + argu1[0]);
            }

            return Status;

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());	
            return false;
        }

    }

    public static boolean Verify_Massuploadstatus(WebDriver webdriver, String Parameters) throws InterruptedException, AWTException, Exception {
        boolean Status = false;
        WAITTIME("WAITTIME->2");
        String Loadstatus = "";
        INVISIBLEOFLOAD(driver);
        int timers = 0;
        try {
            do {
                Reset_Apply(webdriver);
                Search(webdriver, Parameters);
                INVISIBLEOFLOAD(driver);
                WAITTIME("WAITTIME->2");
                Gettext_Row(webdriver, "GetRowText->Status->Loadstatus1");
                if(hmap.containsKey("Loadstatus1")){
                   Loadstatus = hmap.get("Loadstatus1");
                }
                if (Loadstatus.equalsIgnoreCase("PENDING")) {
                    timers = timers + 1;
                } else if ((Loadstatus.toUpperCase().contains("STAGING"))&&!(Loadstatus.toUpperCase().contains("FAILED"))) {
                    timers = timers + 1;
                } else if (Loadstatus.equalsIgnoreCase("SUCCESS")) {
                    ReportFunctions.LogRepoter("Pass", "Mass_Upload", "Sucessfully uploaded the data");
                    timers = 501;
                    Status = true;
                } else {
                    timers = 501;
                }
            } while (timers < 500);

        } catch (Exception e) {
            //out.println("exception value : " + e.getMessage());	
            Status = false;
        }
        if (Status == false) {
            ReportFunctions.LogRepoter("Fail", "Mass_Upload", "Fail to upload data");
        }
        return Status;
    }

    public static boolean GetRowText(String Parameters) throws InterruptedException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {
        boolean Status = false;
        WAITTIME("WAITTIME->3");
        INVISIBLEOFLOAD(driver);
        String xpath = null;
        String xpath1 = null;
        int i = 1;
        String[] arguments = null;
        String ovalue = null;
        try {
            arguments = splitfunction(Parameters, "->");
            arguments[1]=arguments[1].trim();
            String pos = null;
            String posnum = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/parent::th/preceding-sibling::th";
            StorePositionNumber("StorePositionNumber->" + posnum + "->" + arguments[1] + "->pos");
            if (hmap.containsKey("pos")) {
                pos = hmap.get("pos");
            }

            for (i = 1; i <= 100; i++) {
                xpath1 = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/ancestor::table//tr[" + i + "]//td[" + pos + "]//input";
                xpath = "xpath:=//div[(text()=\"" + arguments[1] + "\")]/ancestor::table//tr[" + i + "]//td[" + pos + "]";
                WebElement locator1 = Getlocator(driver, xpath);
                WebElement locator2 = Getlocator(driver, xpath1);
                WebElement locator = null;
                if (locator1 != null) {
                    locator = locator1;
                } else {
                    locator = locator2;
                }
                ovalue = locator.getAttribute("value");

                if (ovalue == null) {
                    ovalue = locator.getText();
                }

                if ((ovalue.toLowerCase().contains("and")) || (ovalue.toLowerCase().contains("&"))) {
                } else if (ovalue == null) {
                    Status = true;
                    break;
                } else if (ovalue.length() == 0) {
                } else {
                    Status = true;
                    break;
                }

            }
            if (ovalue != null) {
                hmap.put(arguments[2], ovalue);
                System.out.println("Sucessfully captured the value " + ovalue);
            }
        } catch (Exception e) {
            System.out.println("exception value : " + e.getMessage());
            return false;
        }
        return Status;
    }
    public static boolean WAITFORELEMENT(WebDriver webdriver, String parameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        boolean status = true;
        //RecoveryScenarios();
        try {
            int flag = 1;
            String[] arguments = null;
            arguments = splitfunction(parameters, "->");
            if (arguments[1].contains("+")) {
                String[] arguments1 = splitfunction(arguments[1], "+");
                String[] arguments2 = splitfunction(arguments1[1], "+");
                String newval = arguments2[0].trim();
                if (hmap.containsKey(arguments2[0])) {
                    String revalue = hmap.get(newval);
                    arguments[1] = arguments[1].replace("+" + newval + "+", revalue);
                    if (arguments[1].contains("+")) {
                        arguments1 = splitfunction(arguments[1], "+");
                        arguments2 = splitfunction(arguments1[1], "+");
                        newval = arguments2[0].trim();
                        if (hmap.containsKey(newval)) {
                            revalue = hmap.get(newval);
                            arguments[1] = arguments[1].replace("+" + newval + "+", revalue);

                        } else {
                            //ReportFunctions.LogRepoter("Fail", "wait for the element", "key not found in hashmap");
                            return false;
                        }
                    }

                }
            }
            timer = 1000;
            do {
                WebElement locator = Getlocator(driver, arguments[1].trim());
                if (locator == null) {
                    timer = timer - 1;
                    if (timer == 0) {
                        timer = 1001;
                    }
                } else {
                    if (locator.isDisplayed()) {
                        timer = 1001;
                        flag = 0;
                        System.out.println("Element found" + " " + arguments[2]);
                        //JavascriptExecutor js = (JavascriptExecutor) driver;
                        //js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", locator);
                        // //ReportFunctions.LogRepoter("pass", "wait for the element", "element found " + arguments[2]);
                    } else {
                        timer = timer - 1;
                        if (timer == 0) {
                            timer = 1001;
                        }
                    }
                }
            } while (timer < 1000);

            if (flag == 1) {
                status = false;
                //  //ReportFunctions.LogRepoter("Fail", "wait for the element", "element not found " + arguments[2]);
                //CLOSEALLBROWSERS(driver);
            }
        } catch (StaleElementReferenceException e) {
            //out.println(e.getMessage());
            status = false;
            //ReportFunctions.LogRepoter("Fail", "wait for the element", "did not found the element " + e);
            //CLOSEALLBROWSERS(driver);
        }
        return status;

    }

}
