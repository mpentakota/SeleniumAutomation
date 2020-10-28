package SeleniumAutomation;

import static SeleniumAutomation.BusinessFunctions.OPENCREW;
import static SeleniumAutomation.BusinessFunctions.OpenAngularpage;
import static SeleniumAutomation.CommonFunctions.Query_MySQL;
import static SeleniumAutomation.CommonFunctions.suitename;
import static SeleniumAutomation.ReportFunctions.iteratorCnt;
import java.awt.AWTException;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.StaleElementReferenceException;
import GoogleAPI.SheetsAutomation;
import static GoogleAPI.SheetsAutomation.writeDatatoSheet;
import java.util.ArrayList;
import java.util.List;

public class DriverScript extends CommonFunctions implements BusinessFunctions {

    public static int finval;
    public static int rowcount;
    public static int rowcount1;
    public static int colval;
    public static int colcount;
    public static int colcount1;
    public static int Rowval;
    public static String CellData;
    public static String CellData2;
    public static String NumVal;
    public static Sheet sheet;
    public static Sheet sheet1;
    public static int flag;
    public static String Strparameters;
    public static java.util.Date odate;
    public static String blankcell;
    public static int count;
    public static boolean CellValue;
    public static boolean blnResult = true;
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
    public static int x;
    public static int newcol = 0;
    public static boolean stop;
    public static String failvalue = null;
    public static int failcount = 0;
    public static String WDirectory = "key";

    public enum ActionTypes {

        LAUNCHBROWSER, LOGIN, ENTERVALUE, SELECTVALUEDROPDOWN, SELECTVALUEDROPDOWN1, ANGULARJS_SELECTDROPDOWN, CLICK, JAVA_CLICK, CLEARTEXTBOX, CLOSEPOPUP, CLOSECURRENTBROWSER, DOUBLECLICK, CLOSEALLBROWSERS,
        ALERTACTION, SELECTFRAME, CLICKTAB, SELECTIFRAMEBYINDEX, CHECKINGCHKBOX, UNCHECKINGCHKBOX, CHECKRADIOBTN, UNCHECKRADIOBTN, ISDISPLAYED, ISNUMERIC, ISENABLED,
        ISDISABLED, ISSELECTED, GETTEXT, GETATTRIBUTE, VERIFYVALUE, SELECTPARENTWINDOW, SWITCHWINDOW, WAITTIME, WAITFORELEMENT, SENDKEYS, DOWNLOADEXCEL, OPENCREW, GENERATE_UNIQVALUE, CONNECT_MYSQL, CLOSE_MYSQL, QUERY_MYSQL,
        INVISIBLEOFLOAD, ENCRYPT, DECRYPT, STOREVALUE, OPENRESOURCE, CLICK_ENTER, CLICK_ENTER1, SEARCH_ENTER, UPLOAD_FILE, STALEELEMENTCLICK, VERIFYDATA, SELECTVALUEBYINDEX, COMPAREVALUE, OPENANGULARPAGE, SWITCHDEFAULT, VALIDATEFILTER, VALIDATEDATE,
        VALIDATEPROMPT, STORESINGLEVALUE, VERIFYDASHBOARD, EXPORTEXCEL, VERIFYNEW, VERIFYSAVEDFILTERS, VERIFYSEARCH, VALIDATEPROMPTTEXT, VALIDATETEXTFILTER, VERIFYDRILL, VERIFYFWDACTION, VALIDATEDATETYPE, SANITY_OPENANGULARPAGE,
        LAUNCHDASHBOARD, SCROLLDOWN, WRITEDATATOEXCEL, VALIDATE_DUPLICATES, VERIFY_NOTNULL, STOREPOSITIONNUMBER, MOUSEOVER, GETTEXTANDINCREMENT, GETTEXTANDINCREMENTVALUE, MULTI_SELECT, NEW_CLICK, STOREDYNAMICLABELVALUE, DROPDOWNCHKBOX,
        SET_VALUE, SELECTLINE, SELECTLINECHKBOX, SELECTACTION, NAVIGATENEW, SEARCH, VERIFYRECORDS, GETTEXT_LABEL, GETTEXT_ROW, GETTEXT_LEFTPANE, VERIFYVALUE_LEFTPANE, VERIFYVALUE_ROW, COPY, NAVIGATE_DASHBOARD, LINE_SEARCH_ENTER,
        GROUP_ACTION, ANGULARJS_CLICKENTER, ANGULARJS_SEARCHENTER, ANGULARJS_SET_VALUE, ANGULARJS_SEARCH, SUBMIT, ANGULARJS_VERIFY, ACTIONS_LEFTPANE, ACTIONS_LINELEVEL, ALLCHOICES, VERIFY_LINE, ORG_NAME, ORG_LEVEL, CLICK_CHECKBOX, CLICKTAB_LINE,
        LINK_NAVIGATION, COMMENTS, LINE_CLICK_ENTER, FRAMESEARCH_ENTER, AUTOSEARCH_ENTER, GETTEXT_MULTIPLEROW, ROW_SEARCH_ENTER, RESET_APPLY, CLICK_SELECT, RECOVERYSCENARIOS, MULTIPLE_STOREVALUE, JAVA_SEARCH_ENTER, GET_SERVICE_HISTORY, GET_QUESTIONS,
        SUBMIT_ANSWERS, GETCONTACTDETAILS, VERIFYEDITVALUE, CAPTURE_MSEQUENCE, VERIFY_SEQUENCE, CHANGE_CASE, EDITANGULARPAGE, REFRESH, SELECTVALUEDROPDOWN_XPATH, ADDSTRINGS, PROMPTLONGLIST, CLICK_LINE, SELECTDATE, SEARCH_ENTER_CONTAINS, FRAMECLICK_ENTER,
        READTESTDATA, UNSELECT_ALL, SCROLLHORIZONTAL, RIGHTCLICK_SELECT, MOUSEOVER_CLICK, ACTIONS, SELECTLINE_CONTAINS, VERIFY_MASSUPLOADSTATUS
    }
    // public static void startexecution(String esuitename) throws IOException, Exception{

    public static void main(String[] args) throws IOException, Exception {
        final long MSEC_SINCE_EPOCH = System.currentTimeMillis();
        String workingDirectory = new java.io.File(".").getCanonicalPath();
        String dir = workingDirectory;
        String Estatus;
        String esuite;
        String suiteExecutionFile = dir + "\\SuiteFiles\\SuiteFile.xlsx";
        FileInputStream fs = new FileInputStream(suiteExecutionFile);
        Workbook wbs = new XSSFWorkbook(fs);
        Sheet ssheet = wbs.getSheetAt(0);
        int rc = ssheet.getLastRowNum();
        int valr;
        for (valr = 1; valr <= rc; valr++) {
            Row rs = ssheet.getRow(valr);
            if (rs != null) {
                Cell cell = ssheet.getRow(valr).getCell(1);
                if (cell != null) {
                    Estatus = cell.getStringCellValue();
                    if (Estatus != null && Estatus.trim().equalsIgnoreCase("YES")) {
                        cell = ssheet.getRow(valr).getCell(0);
                        esuite = cell.getStringCellValue();
                        getEnvironmentDetails(esuite, dir);
                    }
                }
            }
            ReportFunctions.tsID = 0;
            ReportFunctions.tcID = 0;
            ReportFunctions.tstpID = 0;
            iteratorCnt = 0;
            hmap.remove(updstpstatus);
            TCpasscount = 0;
            TCfailcount = 0;
            casecount = 0;
        }

        wbs.close();
    }

    public static void getEnvironmentDetails(String runsuitename, String dir) throws Exception {
        Tsuitename = runsuitename;
        String suitepath = dir + "\\TestSuites\\" + runsuitename + ".xlsx";
        if (suitename == null) {
            suitename = "suitename";
        }
        hmap.put(suitename, Tsuitename);
        FOLDERSTRUCTURE(runsuitename);
        Readenvironmentalfile(envfilepath);
        Readtestsuitefile(suitepath);

    }

    public static void Initializationscript(String testcasepath) throws IOException, InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception {
        try {
            Strparameters = "";
            count = 1;
            String FilePath = testcasepath;
            FileInputStream fs = new FileInputStream(FilePath);
            Workbook wb = new XSSFWorkbook(fs);
            sheet = wb.getSheetAt(0);
            // wb.setMissingCellPolicy(Row.CREATE_NULL_AS_BLANK);
            rowcount = sheet.getLastRowNum();
            colcount = sheet.getRow(rowcount).getLastCellNum();
            int Rowval = 0;
            int colval = 0;
            try {
                do {

                    for (colval = 0; colval <= colcount - 1; colval++) {
                        Row ro = sheet.getRow(Rowval);

                        if (ro != null) {
                            Cell cell = sheet.getRow(Rowval).getCell(colval);
                            //int cel_Type = cell.getCellType();
                            // if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                            CellData = cell.getStringCellValue();
                            CellData.trim();
                            //System.out.println(CellData);
                            if (cell.getRichStringCellValue().getString().trim().equals("Keyword")) {
                                finval = Rowval + 1;
                                Rowval = rowcount + 1;
                                //System.out.println(finval);
                                break;
                            }
                            //}
                        }
                    }
                    Rowval = Rowval + 1;
                } while (rowcount + 1 > Rowval);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            int currentrow = finval;
            while (rowcount + 1 > currentrow) {
                for (colval = 0; colval <= colcount - 1; colval++) {
                    try {
                        Row r1 = sheet.getRow(currentrow);
                        if (r1 != null) {
                            Cell cell = sheet.getRow(currentrow).getCell(colval);
                            int cel_Type = cell.getCellType();
                            switch (cell.getCellType()) {
                                case Cell.CELL_TYPE_NUMERIC:
                                    if (DateUtil.isCellDateFormatted(sheet.getRow(currentrow).getCell(colval))) {
                                        odate = cell.getDateCellValue();
                                        //  System.out.println(sdf.format(odate));
                                        flag = 1;

                                    } else {
                                        NumVal = String.valueOf((int) cell.getNumericCellValue()).trim();
                                        flag = 2;
                                    }
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    CellData = cell.getStringCellValue().trim();
                                    flag = 3;
                                    break;
                                case Cell.CELL_TYPE_BLANK:
                                    blankcell = "";
                                    flag = 4;
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:
                                    CellValue = cell.getBooleanCellValue();
                                    flag = 5;
                                    break;

                                default:
                                    break;
                            }

                        }
                        if (flag == 1) {
                            Strparameters = Strparameters + "->" + sdf.format(odate).trim();
                        } else if (flag == 2) {
                            Strparameters = Strparameters + "->" + NumVal.trim();
                        } else if (flag == 3) {

                            Strparameters = Strparameters + "->" + CellData.trim();
                            if (count == 1) {
                                Strparameters = Strparameters.replace("->", "");
                            }
                            count = count + 1;
                        } else if (flag == 4) {
                            Strparameters = Strparameters + blankcell;
                        } else if (flag == 5) {
                            Strparameters = Strparameters + "->" + CellValue;
                        }
                    } catch (Exception e) {
                       //  System.out.println(e.getMessage());
                    }
                }
                String[] parameters = Strparameters.split("->");

                if (Tstep == null) {
                    Tstep = "Tstep";
                }
                hmap.put(Tstep, parameters[0]);
                if (parameters[0].contains("#")) {
                    Strparameters = "";
                    count = 1;
                    currentrow = currentrow + 1;
                } else {
                    if (parameters[0].contains("$")) {
                        parameters[0] = parameters[0].replace("$", "").trim();
                        String args[] = parameters[0].split("ELSE");
                        if (blnResult == false) {
                            if (args[1].contains("&")) {
                                String finval1[] = args[1].split("&");
                                int ub = finval1.length;
                                for (int w = 1; w <= ub - 1; w++) {
                                    if (hmap.containsKey(finval1[w])) {
                                        String oval = hmap.get(finval1[w]);
                                        oval = " " + oval + " ";
                                        args[1] = args[1].replace(finval1[w], oval);
                                        args[1] = args[1].replace("&", "*");
                                    }
                                }
                            }
                            if (failvalue.contains("'")) {
                                failvalue = failvalue.replace("'", "");
                            }
                            if (failvalue.contains(",")) {
                                failvalue = failvalue.replace(",", "");
                            }
                            if (args[1].contains("'")) {
                                args[1] = args[1].replace("'", "");
                            }
                            if (args[1].contains(",")) {
                                args[1] = args[1].replace(",", "");
                            }
                            if (parameters[0].contains("'")) {
                                parameters[0] = parameters[0].replace("'", "");
                            }
                            if (parameters[0].contains(",")) {
                                parameters[0] = parameters[0].replace(",", "");
                            }
                            ReportFunctions.LogRepoter("Fail", parameters[0], args[1] + " " + "-" + " " + "Unable to find " + " " + failvalue);
                            failcount = 0;
                            //  ReportFunctions.LogRepoter("Fail", parameters[0], args[1]);
                            stop = false;
                            CLOSEALLBROWSERS(driver);
                            break;
                        } else {
                            if (args[0].contains("&")) {
                                String finval[] = args[0].split("&");
                                int ub = finval.length;
                                for (int w = 1; w <= ub - 1; w++) {
                                    if (hmap.containsKey(finval[w])) {
                                        String oval = hmap.get(finval[w]);
                                        oval = " " + oval + " ";
                                        args[0] = args[0].replace(finval[w], oval);
                                        args[0] = args[0].replace("&", "*");
                                    }
                                }
                            }
                            if (args[0].contains("'")) {
                                args[0] = args[0].replace("'", "");
                            }
                            if (args[0].contains(",")) {
                                args[0] = args[0].replace(",", "");
                            }
                            if (parameters[0].contains("'")) {
                                parameters[0] = parameters[0].replace("'", "");
                            }
                            if (parameters[0].contains(",")) {
                                parameters[0] = parameters[0].replace(",", "");
                            }
//                            
                            ReportFunctions.LogRepoter("Pass", parameters[0], args[0]);
                            failcount = 0;
                        }

                        Strparameters = "";
                        count = 1;
                        currentrow = currentrow + 1;

                    } else {
                        if (Strparameters.toUpperCase().contains("SKIP")) {
                            Strparameters = "";
                            count = 1;
                            currentrow = currentrow + 1;
                        } else {
                            if (stop == true) {

                            } else {
                                blnResult = Invokekeyword(parameters[0], Strparameters);
                            }
                            if (blnResult == false) {
                                // failvalue = parameters[2];
                                if (failcount == 0) {
                                    failvalue = parameters[1];
                                    //hmap.put(failvalue, parameters[2],);
                                    failcount = failcount + 1;
                                }
                                if (Tsuitename.toUpperCase().contains("SANITY")) {
                                } else {
                                    // Strparameters = "";
                                    //count = 1;
                                    // currentrow = currentrow + 1;
                                    stop = true;
                                    // break;
                                }
                            }
                            Strparameters = "";
                            count = 1;
                            currentrow = currentrow + 1;
                        }
                    }
                }
            }

        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
        // x = 2;
        if (muldatastatus.equals("Yes")) {
            String temp = null;
            //temp = Tcasename;
            //temp = temp + "_" + x;
            //hmap.put(Tcase, temp);
            MulInitializationscript(testcasepath);
        }

    }

    public static boolean Invokekeyword(String funcname, String funcparameters) throws InterruptedException, AWTException, IOException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        try {
            ActionTypes actTypes = ActionTypes.valueOf(funcname.toUpperCase().trim());

            switch (actTypes) {
                case LAUNCHBROWSER:
                    blnResult = LAUNCHBROWSER(driver, funcparameters);
                    break;
                case ENTERVALUE:
                    blnResult = ENTERVALUE(driver, funcparameters);
                    break;
                case SELECTVALUEDROPDOWN:
                    blnResult = SELECTVALUEDROPDOWN(driver, funcparameters);
                    break;
                case SELECTVALUEDROPDOWN1:
                    blnResult = SELECTVALUEDROPDOWN1(driver, funcparameters);
                    break;
                case ANGULARJS_SELECTDROPDOWN:
                    blnResult = Angularjs_Selectdropdown(driver, funcparameters);
                    break;
                case CLICK:
                    blnResult = CLICK(driver, funcparameters);
                    break;
                case CLEARTEXTBOX:
                    blnResult = CLEARTEXTBOX(driver, funcparameters);
                    break;
                case CLOSEPOPUP:
                    blnResult = CLOSEPOPUP(driver);
                    break;
                case CLOSECURRENTBROWSER:
                    blnResult = CLOSECURRENTBROWSER(driver);
                    break;
                case JAVA_CLICK:
                    blnResult = JAVA_CLICK(driver, funcparameters);
                    break;
                case DOUBLECLICK:
                    blnResult = DOUBLECLICK(driver, funcparameters);
                    break;
                case CLOSEALLBROWSERS:
                    blnResult = CLOSEALLBROWSERS(driver);
                    break;
                case ALERTACTION:
                    blnResult = ALERTACTION(driver, funcparameters);
                    break;
                case SUBMIT:
                    blnResult = Submit(driver);
                    break;
                case CLICKTAB:
                    blnResult = CLICKTAB(driver, funcparameters);
                    break;
                case SELECTIFRAMEBYINDEX:
                    blnResult = SELECTIFRAMEBYINDEX(driver, funcparameters);
                    break;
                case SELECTFRAME:
                    blnResult = SELECTFRAME(driver, funcparameters);
                    break;
                case UNCHECKINGCHKBOX:
                    blnResult = UNCHECKINGCHKBOX(driver, funcparameters);
                    break;
                case CHECKINGCHKBOX:
                    blnResult = CHECKINGCHKBOX(driver, funcparameters);
                    break;
                case CHECKRADIOBTN:
                    blnResult = CHECKRADIOBTN(driver, funcparameters);
                    break;
                case UNCHECKRADIOBTN:
                    blnResult = UNCHECKRADIOBTN(driver, funcparameters);
                    break;
                case ISDISPLAYED:
                    blnResult = ISDISPLAYED(driver, funcparameters);
                    break;
                case ISNUMERIC:
                    blnResult = ISNUMERIC(funcparameters);
                    break;
                case ISENABLED:
                    blnResult = ISENABLED(driver, funcparameters);
                    break;
                case ISDISABLED:
                    blnResult = ISDISABLED(driver, funcparameters);
                    break;
                case ISSELECTED:
                    blnResult = ISSELECTED(driver, funcparameters);
                    break;
                case GETTEXT:
                    blnResult = GETTEXT(driver, funcparameters);
                    break;
                case GETATTRIBUTE:
                    blnResult = GETATTRIBUTE(driver, funcparameters);
                    break;
                case VERIFYVALUE:
                    blnResult = VERIFYVALUE(driver, funcparameters);
                    break;
                case SELECTPARENTWINDOW:
                    blnResult = SELECTPARENTWINDOW(driver);
                    break;
                case SWITCHWINDOW:
                    blnResult = SWITCHWINDOW(driver, funcparameters);
                    break;
                case WAITTIME:
                    blnResult = WAITTIME(funcparameters);
                    break;
                case WAITFORELEMENT:
                    blnResult = WAITFORELEMENT(driver, funcparameters);
                    break;
                case SENDKEYS:
                    blnResult = SENDKEYS(driver, funcparameters);
                    break;
                case OPENCREW:
                    blnResult = OPENCREW();
                    break;
                case GENERATE_UNIQVALUE:
                    blnResult = GENERATE_UNIQVALUE(funcparameters);
                    break;
                case CONNECT_MYSQL:
                    blnResult = Connect_MySQL(funcparameters);
                    break;
                case CLOSE_MYSQL:
                    blnResult = Close_MySQL();
                case QUERY_MYSQL:
                    blnResult = Query_MySQL(funcparameters);
                    break;
                case INVISIBLEOFLOAD:
                    blnResult = INVISIBLEOFLOAD(driver);
                    break;
                case ENCRYPT:
                    blnResult = encrypt(funcparameters);
                    break;
                case DECRYPT:
                    blnResult = decrypt(funcparameters);
                    break;
                case STOREVALUE:
                    blnResult = STOREVALUE(funcparameters);
                    break;
                case OPENANGULARPAGE:
                    blnResult = OpenAngularpage();
                    break;
                case CLICK_ENTER:
                    blnResult = Click_Enter(funcparameters);
                    break;
                case CLICK_ENTER1:
                    blnResult = Click_Enter1(funcparameters);
                    break;
                case SEARCH_ENTER:
                    blnResult = Search_Enter(funcparameters);
                    break;
                case UPLOAD_FILE:
                    blnResult = Upload_File(funcparameters);
                    break;
                case STALEELEMENTCLICK:
                    blnResult = StaleElementClick(driver, funcparameters);
                    break;
                case SELECTVALUEBYINDEX:
                    blnResult = SelectvalueByIndex(driver, funcparameters);
                    break;
                case COMPAREVALUE:
                    blnResult = COMPAREVALUE(driver, funcparameters);
                    break;
                case SWITCHDEFAULT:
                    blnResult = SwitchDefault(driver);
                    break;
                case VALIDATEFILTER:
                    blnResult = ValidateFilter(driver, funcparameters);
                    break;
                case VALIDATEDATE:
                    blnResult = Validatedate(driver, funcparameters);
                    break;
                case VALIDATEPROMPT:
                    blnResult = ValidatePrompt(driver, funcparameters);
                    break;
                case STORESINGLEVALUE:
                    blnResult = Storesinglevalue(funcparameters);
                    break;
                case VERIFYDASHBOARD:
                    blnResult = verifydashboard(driver, funcparameters);
                    break;
                case EXPORTEXCEL:
                    blnResult = ExportExcel(driver, funcparameters);
                    break;
                case VERIFYNEW:
                    blnResult = VerifyNew(driver, funcparameters);
                    break;
                case VERIFYSAVEDFILTERS:
                    blnResult = VerifySavedFilters(driver, funcparameters);
                    break;
                case VERIFYSEARCH:
                    blnResult = verifySearch(driver, funcparameters);
                    break;
                case VALIDATEPROMPTTEXT:
                    blnResult = ValidatePromptText(driver, funcparameters);
                    break;
                case VALIDATETEXTFILTER:
                    blnResult = ValidateTextFilter(driver, funcparameters);
                    break;
                case VERIFYDRILL:
                    blnResult = VerifyDrill(driver, funcparameters);
                    break;
                case VERIFYFWDACTION:
                    blnResult = VerifyFwdAction(driver, funcparameters);
                    break;
                case VALIDATEDATETYPE:
                    blnResult = ValidateDateType(driver, funcparameters);
                    break;
                case SANITY_OPENANGULARPAGE:
                    blnResult = sanity_OpenAngularpage(driver, funcparameters);
                    break;
                case LAUNCHDASHBOARD:
                    blnResult = LaunchDashboard(driver, funcparameters);
                    break;
                case SCROLLDOWN:
                    blnResult = SCROLLDOWN(driver, funcparameters);
                    break;
                case WRITEDATATOEXCEL:
                    blnResult = writeDataToExcel(funcparameters);
                    break;
                case VALIDATE_DUPLICATES:
                    blnResult = Validate_Duplicates(funcparameters);
                    break;
                case VERIFY_NOTNULL:
                    blnResult = Verify_NotNull(funcparameters);
                    break;
                case STOREPOSITIONNUMBER:
                    blnResult = StorePositionNumber(funcparameters);
                    break;
                case MOUSEOVER:
                    blnResult = MouseOver(driver, funcparameters);
                    break;
                case GETTEXTANDINCREMENT:
                    blnResult = GettextandIncrement(driver, funcparameters);
                    break;
                case GETTEXTANDINCREMENTVALUE:
                    blnResult = GettextandIncrementvalue(funcparameters);
                    break;
                case MULTI_SELECT:
                    blnResult = Multi_Select(funcparameters);
                    break;
                case NEW_CLICK:
                    blnResult = New_Click(driver, funcparameters);
                    break;
                case STOREDYNAMICLABELVALUE:
                    blnResult = Storedynamiclabelvalue(funcparameters);
                    break;
                case DROPDOWNCHKBOX:
                    blnResult = Dropdownchkbox(driver, funcparameters);
                    break;
                case SET_VALUE:
                    blnResult = Set_Value(driver, funcparameters);
                    break;
                case SELECTLINE:
                    blnResult = SelectLine(driver, funcparameters);
                    break;
                case SELECTLINECHKBOX:
                    blnResult = SelectLineChkbox(driver, funcparameters);
                    break;
                case SELECTACTION:
                    blnResult = SelectAction(driver, funcparameters);
                    break;
                case NAVIGATENEW:
                    blnResult = NavigateNew(driver, funcparameters);
                    break;
                case SEARCH:
                    blnResult = Search(driver, funcparameters);
                    break;
                case VERIFYRECORDS:
                    blnResult = VerifyRecords(driver, funcparameters);
                    break;
                case VERIFYVALUE_ROW:
                    blnResult = VerifyValue_Row(driver, funcparameters);
                    break;
                case VERIFYVALUE_LEFTPANE:
                    blnResult = VerifyValue_Leftpane(driver, funcparameters);
                    break;
                case GETTEXT_LEFTPANE:
                    blnResult = Gettext_Leftpane(driver, funcparameters);
                    break;
                case GETTEXT_ROW:
                    blnResult = Gettext_Row(driver, funcparameters);
                    break;
                case GETTEXT_LABEL:
                    blnResult = Gettext_Label(driver, funcparameters);
                    break;
                case COPY:
                    blnResult = Copy(driver, funcparameters);
                    break;
                case NAVIGATE_DASHBOARD:
                    blnResult = Navigate_Dashboard(driver, funcparameters);
                    break;
                case GROUP_ACTION:
                    blnResult = Group_Action(driver, funcparameters);
                    break;
                case ANGULARJS_CLICKENTER:
                    blnResult = Angularjs_ClickEnter(driver, funcparameters);
                    break;
                case ANGULARJS_SEARCHENTER:
                    blnResult = Angularjs_SearchEnter(driver, funcparameters);
                    break;
                case ANGULARJS_SET_VALUE:
                    blnResult = Angularjs_Set_value(driver, funcparameters);
                    break;
                case ANGULARJS_SEARCH:
                    blnResult = Angularjs_Search(driver, funcparameters);
                    break;
                case ANGULARJS_VERIFY:
                    blnResult = Angularjs_Verify(driver, funcparameters);
                    break;
                case ACTIONS_LEFTPANE:
                    blnResult = Actions_Leftpane(driver, funcparameters);
                    break;
                case ACTIONS_LINELEVEL:
                    blnResult = Actions_LineLevel(driver, funcparameters);
                    break;
                case ALLCHOICES:
                    blnResult = Allchoices(driver, funcparameters);
                    break;
                case VERIFY_LINE:
                    blnResult = Verify_Line(driver, funcparameters);
                    break;
                case ORG_LEVEL:
                    blnResult = Org_Level(funcparameters);
                    break;
                case ORG_NAME:
                    blnResult = Org_Name(driver, funcparameters);
                    break;
                case CLICK_CHECKBOX:
                    blnResult = Click_Checkbox(driver, funcparameters);
                    break;
                case CLICKTAB_LINE:
                    blnResult = ClickTab_Line(funcparameters);
                    break;
                case LINE_SEARCH_ENTER:
                    blnResult = Line_Search_Enter(funcparameters);
                    break;
                case LINK_NAVIGATION:
                    blnResult = Link_Navigation(funcparameters);
                    break;
                case COMMENTS:
                    blnResult = Comments(funcparameters);
                    break;
                case LINE_CLICK_ENTER:
                    blnResult = Line_Click_Enter(funcparameters);
                    break;
                case FRAMESEARCH_ENTER:
                    blnResult = FrameSearch_Enter(funcparameters);
                    break;
                case AUTOSEARCH_ENTER:
                    blnResult = AutoSearch_Enter(funcparameters);
                    break;
                case GETTEXT_MULTIPLEROW:
                    blnResult = Gettext_MultipleRow(driver, funcparameters);
                    break;
                case ROW_SEARCH_ENTER:
                    blnResult = Row_Search_Enter(funcparameters);
                    break;
                case RESET_APPLY:
                    blnResult = Reset_Apply(driver);
                    break;
                case CLICK_SELECT:
                    blnResult = Click_Select(funcparameters);
                    break;
                case RECOVERYSCENARIOS:
                    blnResult = RecoveryScenarios();
                    break;
                case MULTIPLE_STOREVALUE:
                    blnResult = Multiple_Storevalue(funcparameters);
                    break;
                case JAVA_SEARCH_ENTER:
                    blnResult = Java_Search_Enter(funcparameters);
                    break;
                case GET_SERVICE_HISTORY:
                    blnResult = Get_Service_History(funcparameters);
                    break;
                case GET_QUESTIONS:
                    blnResult = Get_Questions(funcparameters);
                    break;
                case SUBMIT_ANSWERS:
                    blnResult = Submit_Answers(funcparameters);
                    break;
                case GETCONTACTDETAILS:
                    blnResult = getContactDetails(funcparameters);
                    break;
                case VERIFYEDITVALUE:
                    blnResult = VerifyEditValue(funcparameters);
                    break;
                case CAPTURE_MSEQUENCE:
                    blnResult = Capture_mSequence(driver, funcparameters);
                    break;
                case VERIFY_SEQUENCE:
                    blnResult = Verify_Sequence(driver, funcparameters);
                    break;
                case CHANGE_CASE:
                    blnResult = Change_Case(funcparameters);
                    break;
                case EDITANGULARPAGE:
                    blnResult = EditAngularpage(funcparameters);
                    break;
                case REFRESH:
                    blnResult = Refresh();
                    break;
                case SELECTVALUEDROPDOWN_XPATH:
                    blnResult = SELECTVALUEDROPDOWN_xpath(driver, funcparameters);
                    break;
                case ADDSTRINGS:
                    blnResult = addStrings(funcparameters);
                    break;
                case PROMPTLONGLIST:
                    blnResult = promptLongList(funcparameters);
                    break;
                case CLICK_LINE:
                    blnResult = Click_Line(driver, funcparameters);
                    break;
                case SELECTDATE:
                    blnResult = selectDate(funcparameters);
                    break;
                case SEARCH_ENTER_CONTAINS:
                    blnResult = Search_Enter_Contains(funcparameters);
                    break;
                case FRAMECLICK_ENTER:
                    blnResult = FrameClick_Enter(funcparameters);
                    break;
                case READTESTDATA:
                    blnResult = ReadTestData(funcparameters);
                    break;
                case UNSELECT_ALL:
                    blnResult = Unselect_All(driver, funcparameters);
                    break;
                case SCROLLHORIZONTAL:
                    blnResult = scrollHorizontal(funcparameters);
                    break;
                case RIGHTCLICK_SELECT:
                    blnResult = rightclick_select(driver, funcparameters);
                    break;
                case MOUSEOVER_CLICK:
                    blnResult = mouseover_click(driver, funcparameters);
                    break;
                case ACTIONS:
                    blnResult = Actions(driver, funcparameters);
                    break;
                case SELECTLINE_CONTAINS:
                    blnResult = SelectLine_Contains(driver, funcparameters);
                    break;
                case VERIFY_MASSUPLOADSTATUS:
                    blnResult = Verify_Massuploadstatus(driver, funcparameters);
                    break;

                default:
            }
        } catch (Exception e) {

            //e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return blnResult;
    }

    public static void MulInitializationscript(String testcasepath) throws IOException, InterruptedException, AWTException, ClassNotFoundException, SQLException, InstantiationException, IllegalAccessException, Exception, StaleElementReferenceException {
        try {

            Strparameters = "";
            count = 1;
            Boolean skipflag = false;
            String FilePath = testcasepath;
            FileInputStream fs = new FileInputStream(FilePath);
            Workbook wb = new XSSFWorkbook(fs);
            sheet = wb.getSheetAt(0);
            sheet1 = wb.getSheetAt(1);
            // wb.setMissingCellPolicy(Row.CREATE_NULL_AS_BLANK);
            // rowcount = sheet.getLastRowNum();
            rowcount = sheet.getPhysicalNumberOfRows();
            Row r = sheet.getRow(rowcount - 1);
            colcount = r.getLastCellNum();
            //  colcount = sheet.getRow(rowcount).getLastCellNum();
            // rowcount1 = sheet1.getLastRowNum();
            rowcount1 = sheet1.getPhysicalNumberOfRows();
            Row r5 = sheet1.getRow(rowcount1 - 1);
            colcount1 = r5.getLastCellNum();
            //colcount1 = sheet1.getRow(rowcount1).getLastCellNum();
            int Rowval = 0;
            int colval = 0;
            int Rowval1;
            for (Rowval1 = 1; Rowval1 <= rowcount1; Rowval1++) {
                do {
                    Cell cell1 = sheet1.getRow(Rowval1).getCell(0);
                    Tcasename = cell1.getStringCellValue();
                    hmap.put(Tcase, Tcasename);
                    for (colval = 0; colval <= colcount - 1; colval++) {
                        Row ro = sheet.getRow(Rowval);
                        if (ro != null) {
                            Cell cell = sheet.getRow(Rowval).getCell(colval);
                            //int cel_Type = cell.getCellType();
                            // if (cell.getCellType() == Cell.CELL_TYPE_STRING) {
                            CellData = cell.getStringCellValue();
                            CellData.trim();
                            //System.out.println(CellData);
                            if (cell.getRichStringCellValue().getString().trim().equals("Keyword")) {
                                finval = Rowval + 1;
                                Rowval = rowcount + 1;
                                //System.out.println(finval);
                                break;
                            }
                            //}
                        }
                    }
                    Rowval = Rowval + 1;
                } while (rowcount + 1 > Rowval);

                int currentrow = finval;

                while (rowcount + 1 > currentrow) {
                    for (colval = 0; colval <= colcount - 2; colval++) {
                        Row r1 = sheet.getRow(currentrow);
                        if (r1 != null) {
                            Cell cell = sheet.getRow(currentrow).getCell(colval);
                            int cel_Type = cell.getCellType();
                            switch (cell.getCellType()) {
                                case Cell.CELL_TYPE_NUMERIC:
                                    if (DateUtil.isCellDateFormatted(sheet.getRow(currentrow).getCell(colval))) {
                                        odate = cell.getDateCellValue();
                                        //  System.out.println(sdf.format(odate));
                                        flag = 1;

                                    } else {
                                        NumVal = String.valueOf((int) cell.getNumericCellValue());
                                        flag = 2;
                                    }
                                    break;
                                case Cell.CELL_TYPE_STRING:
                                    CellData = cell.getStringCellValue().trim();
                                    flag = 3;
                                    break;
                                case Cell.CELL_TYPE_BLANK:
                                    blankcell = "";
                                    flag = 4;
                                    break;
                                case Cell.CELL_TYPE_BOOLEAN:
                                    CellValue = cell.getBooleanCellValue();
                                    flag = 5;
                                    break;

                                default:
                                    break;
                            }

                        }
                        if (flag == 1) {
                            Strparameters = Strparameters + "->" + sdf.format(odate).trim();
                        } else if (flag == 2) {
                            Strparameters = Strparameters + "->" + NumVal.trim();
                        } else if (flag == 3) {

                            Strparameters = Strparameters + "->" + CellData.trim();
                            if (count == 1) {
                                Strparameters = Strparameters.replace("->", "");
                            }
                            count = count + 1;
                        } else if (flag == 4) {
                            Strparameters = Strparameters + blankcell;
                        } else if (flag == 5) {
                            Strparameters = Strparameters + "->" + CellValue;
                        }
                    }
                    try {
                        Cell cell2 = sheet.getRow(currentrow).getCell(3);
                        if (cell2.getCellType() == cell2.CELL_TYPE_BLANK) {
                        } else {
                            Cell cell1 = sheet1.getRow(Rowval1).getCell(newcol + 1);
                            if (cell1.getCellType() == cell2.CELL_TYPE_NUMERIC) {
                                CellData = String.valueOf((int) cell1.getNumericCellValue());
                                Strparameters = Strparameters.trim() + "->" + CellData.trim();
                                newcol = newcol + 1;
                            } else {
                                CellData = cell1.getStringCellValue();
                                Strparameters = Strparameters.trim() + "->" + CellData.trim();
                                newcol = newcol + 1;
                                if (CellData.toUpperCase().equalsIgnoreCase("SKIP")) {
                                    skipflag = true;
                                }
                            }
                        }
                    } catch (Exception e) {

                        //e.printStackTrace();
                        // System.out.println(e.getMessage());
                    }

                    String[] parameters = Strparameters.split("->");
                    if (Tstep == null) {
                        Tstep = "Tstep";
                    }
                    hmap.put(Tstep, parameters[0]);
                    if ((Tcasename.contains("#")) || (Strparameters.contains("#"))) {
                        Strparameters = "";
                        count = 1;
                        currentrow = currentrow + 1;
                    } else {
                        if (parameters[0].contains("$")) {
                            parameters[0] = parameters[0].replace("$", "").trim();
                            String args[] = parameters[0].split("ELSE");
                            if (blnResult == false) {
                                if (args[1].contains("&")) {
                                    String finval[] = args[1].split("&");
                                    int ub = finval.length;
                                    for (int w = 1; w <= ub - 1; w++) {
                                        if (hmap.containsKey(finval[w])) {
                                            String oval = hmap.get(finval[w]);
                                            oval = " " + oval + " ";
                                            args[1] = args[1].replace(finval[w], oval);
                                            args[1] = args[1].replace("&", "*");
                                        }
                                    }
                                }
                                if (failvalue.contains("'")) {
                                    failvalue = failvalue.replace("'", "");
                                }
                                if (failvalue.contains(",")) {
                                    failvalue = failvalue.replace(",", "");
                                }
                                if (parameters[0].contains("'")) {
                                    parameters[0] = parameters[0].replace("'", "");
                                }
                                if (parameters[0].contains(",")) {
                                    parameters[0] = parameters[0].replace(",", "");
                                }
                                if (args[1].contains("'")) {
                                    args[1] = args[1].replace("'", "");
                                }
                                if (args[1].contains(",")) {
                                    args[1] = args[1].replace(",", "");
                                }

                                ReportFunctions.LogRepoter("Fail", parameters[0], args[1] + " " + "-" + " " + "Unable to find " + " " + failvalue);
                                failcount = 0;
                                //  ReportFunctions.LogRepoter("Fail", parameters[0], args[1]);
                                stop = false;
                                CLOSEALLBROWSERS(driver);
                                break;
                            } else {
                                if (args[0].contains("&")) {
                                    String finval[] = args[0].split("&");
                                    int ub = finval.length;
                                    for (int w = 1; w <= ub - 1; w++) {
                                        if (hmap.containsKey(finval[w])) {
                                            String oval = hmap.get(finval[w]);
                                            oval = " " + oval + " ";
                                            args[0] = args[0].replace(finval[w], oval);
                                            args[0] = args[0].replace("&", "*");
                                        }
                                    }
                                }

                                if (args[0].contains("'")) {
                                    args[0] = args[0].replace("'", "");
                                }
                                if (args[0].contains(",")) {
                                    args[0] = args[0].replace(",", "");
                                }
                                if (parameters[0].contains("'")) {
                                    parameters[0] = parameters[0].replace("'", "");
                                }
                                if (parameters[0].contains(",")) {
                                    parameters[0] = parameters[0].replace(",", "");
                                }

                                ReportFunctions.LogRepoter("Pass", parameters[0], args[0]);
                                failcount = 0;
                            }

                            Strparameters = "";
                            count = 1;
                            currentrow = currentrow + 1;
                        } else {
                            if (skipflag == true) {
                                Strparameters = "";
                                count = 1;
                                skipflag = false;
                                currentrow = currentrow + 1;
                            } else {
                                if (stop == true) {

                                } else {

                                    blnResult = Invokekeyword(parameters[0], Strparameters);
                                }
                                if (blnResult == false) {
                                    stop = true;
//                            if (Tsuitename.toUpperCase().contains("SANITY")) {
//                            } else {
                                    if (failcount == 0) {
                                        failvalue = parameters[1];
                                        failcount = failcount + 1;
                                    }
                                    // break;
//                            }
                                }
                                Strparameters = "";
                                count = 1;

                                currentrow = currentrow + 1;
                            }
                        }
                    }
                }
                // x = x + 1;
                //Tcasename = Tcasename + "_" + x;
                //hmap.put(Tcase, Tcasename);
                // Tcasename = Tcasename.replace("_" + x, "");
                newcol = 0;
                Strparameters = "";
                count = 1;
            }
        } catch (Exception e) {
            //System.out.println(e.getMessage());
        }
    }

}
