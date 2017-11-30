package android.zzwehther.com.zzweather.gson;

/**
 * Created by Administrator on 2017/11/30 0030.
 */

import com.google.gson.annotations.SerializedName;

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {

        @SerializedName("txt")
        public String info;

    }

}