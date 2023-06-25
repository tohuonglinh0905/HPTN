package demo.nopcommerce.constants;

import demo.nopcommerce.helpers.PropertiesHelpers;
import demo.nopcommerce.utils.ReportUtils;
import lombok.Data;

import java.io.File;

/**
 * Purpose: Define some final values, ex: project part
 **/
@Data
public class FrameworkConst {

    // Don't allow creating a new constructor
    private FrameworkConst() {
    }


    //region TESTING DATA PATH
    public static String LOGIN_DATA_PATH = PropertiesHelpers.getValue("loginExcelDataPath");

    //endregion

    //region PROJECT CONFIG
    public static String SEPARATE_KEY = "%MS%";
    public static String SKIP_KEY = "^";
    public static String CONFIG_COL = "CONFIG";
    public static String DATA_ID_COL = "DATA_ID";
    public static String DETAIL_DATA_COL = "DETAIL_DATA";
    public static String IS_FILL = "fill";
    public static String IS_VERIFY = "verify";

    public static String SPECIFIC = "specific";

    public static String XPATH_CONTENT_OF_COMBOBOX = "//div[contains(@title,'%s') and (contains(@class, 'item-td--text')  or contains(@class, 'combobox-item--text'))]";
    public static String ELEMENT_NOT_FOUND = "ELEMENT %s - NOT FOUND";
    public static String ELEMENT_PROPERTY_TEXTCONTENT = "textContent";
    public static String ELEMENT_PROPERTY_VALUE = "value";

    public static final String PROJECT_PATH = System.getProperty("user.dir") + File.separator;
    public static final String CHROME_DRIVER = PROJECT_PATH + "src/test/resources/webDriver/chromedriver.exe";

    public static final String BROWSER = PropertiesHelpers.getValue("browser");
    public static final String BASE_URL = PropertiesHelpers.getValue("amis_url");

    public static final String APP_URL = PropertiesHelpers.getValue("app_url");
    public static final String REMOTE_URL = PropertiesHelpers.getValue("remote_url");
    public static final String REMOTE_PORT = PropertiesHelpers.getValue("remote_port");
    public static final String PROJECT_NAME = PropertiesHelpers.getValue("projectName");
    public static final String REPORT_TITLE = PropertiesHelpers.getValue("reportTitle");
    public static final String TESTING_VERSION = PropertiesHelpers.getValue("testing_version");
    public static final String EXTENT_REPORT_NAME = PropertiesHelpers.getValue("extentReportName");
    public static final String EXTENT_REPORT_FOLDER = PropertiesHelpers.getValue("extentReportFolder");
    public static final String ExportVideoPath = PropertiesHelpers.getValue("exportVideoPath");
    public static final String ExportCapturePath = PropertiesHelpers.getValue("exportCapturePath");
    public static final String AUTHOR = PropertiesHelpers.getValue("author");
    public static final String TARGET = PropertiesHelpers.getValue("target");
    public static final String HEADLESS = PropertiesHelpers.getValue("headless");
    public static final String MAINTAINDATA = PropertiesHelpers.getValue("maintainData");
    public static final String TFS_LINK = PropertiesHelpers.getValue("tfslink");
    public static final String override_reports = PropertiesHelpers.getValue("override_reports");
    public static final String open_reports_after_execution = PropertiesHelpers.getValue("open_reports_after_execution");

    public static final String send_email_to_users = PropertiesHelpers.getValue("send_email_to_users");
    public static final String screenshot_passed_steps = PropertiesHelpers.getValue("screenshot_passed_steps");
    public static final String screenshot_failed_steps = PropertiesHelpers.getValue("screenshot_failed_steps");
    public static final String screenshot_skipped_steps = PropertiesHelpers.getValue("screenshot_skipped_steps");
    public static final String screenshot_all_steps = PropertiesHelpers.getValue("screenshot_all_steps");
    public static final String draw_border_err_element = PropertiesHelpers.getValue("draw_border_err_element");
    public static final String zip_folder = PropertiesHelpers.getValue("zip_folder");
    public static final String video_record = PropertiesHelpers.getValue("video_record");
    public static final int WAIT_DEFAULT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_DEFAULT"));
    public static final int WAIT_IMPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_IMPLICIT"));
    public static final int WAIT_EXPLICIT = Integer.parseInt(PropertiesHelpers.getValue("WAIT_EXPLICIT"));
    public static final int WAIT_PAGE_LOADED = Integer.parseInt(PropertiesHelpers.getValue("WAIT_PAGE_LOADED"));
    public static final int WAIT_SLEEP_STEP = Integer.parseInt(PropertiesHelpers.getValue("WAIT_SLEEP_STEP"));
    public static final String ACTIVE_PAGE_LOADED = PropertiesHelpers.getValue("ACTIVE_PAGE_LOADED");
    public static final String EXTENT_REPORT_FOLDER_PATH = PROJECT_PATH + EXTENT_REPORT_FOLDER;
    public static final String EXTENT_REPORT_FILE_NAME = EXTENT_REPORT_NAME + ".html";
    public static String EXTENT_REPORT_FILE_PATH = EXTENT_REPORT_FOLDER_PATH + "/" + EXTENT_REPORT_FILE_NAME;
    public static final String Zipped_ExtentReports_Folder_Name = EXTENT_REPORT_FOLDER + ".zip";
    public static final String YES = "yes";
    public static final String NO = "no";
    public static final String BOLD_START = "<b>";
    public static final String BOLD_END = "</b>";


    public static final String FAIL = BOLD_START + "FAIL" + BOLD_END;
    public static final String PASS = BOLD_START + "PASS" + BOLD_END;
    //endregion

    // region ICONS
    public static final String ICON_SMILEY_PASS = "<i class='fa fa-smile-o' style='font-size:24px'></i>";
    public static final String ICON_SMILEY_SKIP = "<i class=\"fas fa-frown-open\"></i>";
    public static final String ICON_SMILEY_FAIL = "<i class='fa fa-frown-o' style='font-size:24px'></i>";
    public static final String ICON_OS_WINDOWS = "<i class='fa fa-windows' ></i>";
    public static final String ICON_OS_MAC = "<i class='fa fa-apple' ></i>";
    public static final String ICON_OS_LINUX = "<i class='fa fa-linux' ></i>";

    public static final String ICON_BROWSER_OPERA = "<i class=\"fa fa-opera\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_EDGE = "<i class=\"fa fa-edge\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_CHROME = "<i class=\"fa fa-chrome\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_FIREFOX = "<i class=\"fa fa-firefox\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_SAFARI = "<i class=\"fa fa-safari\" aria-hidden=\"true\"></i>";
    public static final String ICON_Navigate_Right = "<i class='fa fa-arrow-circle-right' ></i>";
    public static final String ICON_LAPTOP = "<i class='fa fa-laptop' style='font-size:18px'></i>";
    public static final String ICON_BUG = "<i class='fa fa-bug' ></i>";

    /* style="text-align:center;" */
    public static final String ICON_SOCIAL_GITHUB_PAGE_URL = "";
    public static final String ICON_SOCIAL_LINKEDIN_URL = "";
    public static final String ICON_SOCIAL_GITHUB_URL = "";
    public static final String ICON_SOCIAL_LINKEDIN = "<a href='" + ICON_SOCIAL_LINKEDIN_URL + "'><i class='fa fa-linkedin-square' style='font-size:24px'></i></a>";
    public static final String ICON_SOCIAL_GITHUB = "<a href='" + ICON_SOCIAL_GITHUB_URL + "'><i class='fa fa-github-square' style='font-size:24px'></i></a>";

    public static final String ICON_CAMERA = "<i class=\"fa fa-camera\" aria-hidden=\"true\"></i>";
    public static final String ICON_BROWSER_PREFIX = "<i class=\"fa fa-";
    public static final String ICON_BROWSER_SUFFIX = "\" aria-hidden=\"true\"></i>";

    //endregion

    public static String getExtentReportFilePath() {
        if (EXTENT_REPORT_FILE_PATH.isEmpty()) {
            EXTENT_REPORT_FILE_PATH = ReportUtils.createExtentReportPath();
        }
        return EXTENT_REPORT_FILE_PATH;
    }

}
