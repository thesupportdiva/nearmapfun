package donna.nearmap;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Nearmap {

    private String latitude;
    private String longitude;
    private String date;


    private String url;

    public Nearmap(String latitude, String longitude){
        this.latitude = latitude;
        this.longitude = longitude;

        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date = new Date();
        this.date = dateFormat.format(date);
        this.url = "http://au0.nearmap.com/staticmap?center="
                + getLatitude() + "," + getLongitude()
                + "&size=800x800&zoom=18&date="
                + getDate() + "&httpauth=false&apikey=YzkwMjkwNjEtMjA3OS00M2Y3LTk4NDYtNzhlNmRiMDQzY2I4";

    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



}


