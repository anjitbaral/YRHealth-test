package appconfig;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.json.JSONObject;

public class ConstValue {
/* Change 1 : CHange site_url and replace with your url where you hosting server side code.
 * Change 2 : GCM_SENDER_ID  replace with your gcm sender id. you can get this id from https://console.developers.google.com/
*/	
	public static String site_url = "http://www.bridgetechnosoft.com/hospital/ServerSite/Source/";
	public static String JSON_REGISTER= site_url+"/index.php?component=json&action=register";
	public static String JSON_LOGIN=site_url+"/index.php?component=json&action=login";
	public static String JSON_SEND_PASSWORD=site_url+"/index.php?component=json&action=send_password";
	public static String JSON_MAINCAT=site_url+"/index.php?component=json&action=maincategory";
	public static String JSON_MY_APPOINTMENT=site_url+"/index.php?component=json&action=getmyappointment";
	public static String JSON_GETCITY=site_url+"/index.php?component=json&action=getcity";
	public static String JSON_DR_LIST = site_url+"/index.php?component=json&action=getdoctorlist";
	public static String JSON_ADD_APPOINTMENT=site_url+"/index.php?component=json&action=addappointment";
	public static String JSON_CANCLE_APPOINTMENT=site_url+"/index.php?component=json&action=cancleappointment";
	public static String JSON_CONFIRM_APPOINTMENT=site_url+"/index.php?component=json&action=confirmappointment";
	public static String JSON_ADD_REVIEW=site_url+"/index.php?component=json&action=addreview";
	public static String JSON_PAGE=site_url+"/index.php?component=json&action=page";
	public static String JSON_GET_REVIEW=site_url+"/index.php?component=json&action=getreviews";
	public static String JSON_GET_SERVICE_CHARGES=site_url+"/index.php?component=json&action=get_service_charges";
	public static String JSON_UPDATE_SETTING=site_url+"/index.php?component=json&action=savesetting";
	public static String JSON_UPDATE_PROFILE=site_url+"/index.php?component=json&action=saveprofile";
	public static String SIGNUP_SERVICE = site_url+"/index.php?component=json&action=register_gcm";
	
	public static String GCM_SENDER_ID = "";
	
	public static String CURRANCY = "Rs.";
	public static String MAIN_PREF = "drappprefs";
	public static String PREFS_MAIN_CAT = "prefs_main_category";
	public static String PREFS_MAIN_APPO = "myappointment";
	public static String PREF_SERV_CHARGE = "myservicecharges";
	public static HashMap<String, String> selected_category; 
	public static HashMap<String, String> selected_city;
	public static HashMap<String, String> selected_doctor;
	public static JSONObject selected_clinic;
 }
