package android.zzwehther.com.zzweather.gson;

/**
 * Created by Administrator on 2017/11/30 0030.
 */

import com.google.gson.annotations.SerializedName;

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;

    }

}
