package customer.dococean.com.patient.network.response.trackresponse;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OptedService implements Parcelable {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("cost")
    @Expose
    private Integer cost;

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The cost
     */
    public Integer getCost() {
        return cost;
    }

    /**
     * @param cost The cost
     */
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeValue(this.cost);
    }

    public OptedService() {
    }

    protected OptedService(Parcel in) {
        this.name = in.readString();
        this.cost = (Integer) in.readValue(Integer.class.getClassLoader());
    }

    public static final Parcelable.Creator<OptedService> CREATOR = new Parcelable.Creator<OptedService>() {
        @Override
        public OptedService createFromParcel(Parcel source) {
            return new OptedService(source);
        }

        @Override
        public OptedService[] newArray(int size) {
            return new OptedService[size];
        }
    };
}