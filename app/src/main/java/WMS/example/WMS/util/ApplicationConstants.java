package WMS.example.WMS.util;

public interface ApplicationConstants {

    String FCM_DEVICE_TOKEN = "FCMDEVICE_TOKEN";
    String SP_USER_NAME = "SP_USER_NAME";
    String SP_DOC_ID = "SP_DOC_ID";
    String SP_COMPANY_CODE = "SP_COMPANY_CODE";
    String SP_BASE_URL = "SP_BASE_URL";
    String SP_FS_ID = "SP_FS_ID";
    String SP_FIN_YEAR_ID = "SP_FIN_YEAR_ID";
    String USER_ID = "USER_ID";
    String SP_PERIOD_ID = "SP_PERIOD_ID";
    String SP_USER_ID = "SP_USER_ID";
    String SP_ACCESS_TOKEN = "SP_ACCESS_TOKEN";
    String SP_DIV_ID = "SP_DIV_ID";
    String SP_SBU = "SP_SBU";
    String SP_TOUR_PLAN_SELECTED_DATE = "SP_TOUR_PLAN_SELECTED_DATE";
    String SP_TOUR_PLAN_UTIL_DATE = "SP_TOUR_PLAN_UTIL_DATE";
    String SP_TOUR_PLAN_MONTH = "SP_TOUR_PLAN_MONTH";
    String SP_FS_NAME = "SP_FS_NAME";
    String SP_LEVEL_CODE = "LEVEL_CODE";
    String SP_FLAG = "SP_FLAG";
    String SP_TOUR_PLAN_DETAIL = "SP_TOUR_PLAN_DETAIL";
    String SP_USER_DIVISION = "SP_USER_DIVISION";
    String SP_IS_LOGIN = "SP_IS_LOGIN";
    String SP_TOUR_CONFLICT_DATES = "SP_TOUR_CONFLICT_DATES";
    String SP_HQ_NAME = "SP_HQ_NAME";
    String SP_LOGIN_FOR_PASSWORD_EXPIRY = "SP_LOGIN_FOR_PASSWORD_EXPIRY";
    String SP_EXPENSE_DATE = "SP_EXPENSE_DATE";
    String SP_CALENDAR_SELECTED_DATE = "SP_CALENDAR_SELECTED_DATE";
    String ACC_CO_CODE = "ACC_CO_CODE";
    String ACC_CO_NAME = "ACC_CO_NAME";

    String EMP_ID = "EMP_ID";
    String ACC_NAME = "ACC_CO_NAME";

    /*LOGIN URLs*/
    //String DATABASE_NAME = "medico.db";
//    String API_BASE_URL = "http://103.165.118.149:9001/ng-portal/";
//    String API_BASE_URL="http://192.168.1.24:9180/ng-portal/";
//    String API_BASE_URL="http://180.149.244.177:8280/ng-portal/";
    //String API_BASE_URL = "http://180.149.241.19:8112/medico-stockist/";
    //String IMAGE_BASE_URL = "http://180.149.241.19:8001/ng-sfa";
    //String LOGIN_URL = "http://180.149.241.19:5000/init-user-login/";
    //String BASE_URL_FOR_FORGOT_PASSWORD = "http://180.149.241.19:5000";
//     String API_BASE_URL= "https://180.149.244.177:9180/ng-portal/";
    String API_BASE_URL= "https://www.sampro-pfizerindia.com:9180/ng-portal/";
    //String API_BASE_URL= "http://103.172.151.205:8100/ng-portal/";
    //String API_BASE_URL= " http://103.165.118.149:9333/ng-portal/";

    String REFRESH_TOKEN="/mobile/refresh";
    String SIGN_IN = "/mobile/sign-in";
    String PARAMETER_URL = "/rest/get-all-parameters";
    String GET_TRANSACTION_DATA = "/mobile/getTransaction-data";
    String ERROR_MESSAGE = "Error Occurred.";
    String NO_DATA_FOUND = "Data Not Found!";
    String UUID_MESSAGE = "Your Device UUID No. is not present.";
    String DATA_SAVED ="DATA_SAVED";
    String ERROR_OCCURED ="Bin not Found";
    String SPINNER_FIRST_INDEX = "select";
    String PUTAWAY_SAVED ="putaway saved successfully";
    String NETWORK_CALL_ERROR = "Connection Problem. Please try again.";
    String PENDING_PUR_CNDN_MESSAGE = "Pending Purchase CN/DN are not available.";
    String PENDING_PUR_ORDER_MESSAGE = "Pending Purchase Order are not available.";
    String PENDING_SALES_ORDE_MESSAGE = "Pending Sales Order are not available.";
    String PENDING_GRN_MESSAGE = "Pending GRN are not available.";

// URL
    String GET_PROD_LIST = "mobile/get-prodlist";
    String GET_PROD_LIST_BY_PRICNICPAL = "mobile/get-prodlist-by-principal";
    String GET_BATCH_LIST = "mobile/grn-batchlist-by-prodid";
    String SET_PROD_LOCK = "mobile/set-prodlock";
    String SET_PROD_RELEASE = "mobile/release-prodlock";
    String SYNC_GRN = "mobile/save-grn";
    String GRN_VIEW_DETAIL  = "mobile/grn-view-detail";
    String DATA_GRN_MODIFY = "mobile/data-for-grn-modify";
    String OPEN_ATTACHMENT = "mobile/open-attachment?filename=";

//
    String ADD_MORE_DETAILS = "AMD";
    String ADD_CUSTOMER = "AC";
    String ADD_PRINCIPAL_COMPANY = "APC";
    //    String APP_UPDATE_MESSAGE = "This app is currently not supported. Please upgrade to enjoy our service.";
//    String SYNC_SUCCESSFULLY = "Data Synced Successfully.";
//    String SENT_EXPENSE = "Expense has been sent for approval";
//

    String SALEABLE_BATCH_01 = "01";
    String SALEABLE_BATCH = "Saleable Stock Type";
    String NON_SALEABLE_BATCH_02 = "02";
    //    String LEVEL_CODE_003 = "003";
//    String LEVEL_CODE_004 = "004";
//    String LEVEL_CODE_005 = "005";
//
    String AC = "AC";
    String PC = "PC";
    String A = "A";
    String D = "D";
    String M = "M";
    String V = "V";
    String Y = "Y";


    String RESPONSE_MESSAGE = "RESPONSE_MESSAGE";
    //    String LOADING_DATA = "Loading Data";
    String PLEASE_WAIT = "Please Wait...";

    String IST = "India Standard Time";
    String IST_MESSAGE = "Please Set your Device TimeZone in IST.";
}
