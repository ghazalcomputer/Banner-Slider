package ss.com.bannerslider.banners;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.DrawableRes;

import java.io.File;

/**
 * @author M.Yordkhani
 * @since 12/11/17
 */

public class LocalFileBanner extends Banner implements Parcelable {
    private File file;

    public LocalFileBanner(File file) {
        this.file = file;
    }

    public File getPath() {
        return file;
    }

    protected LocalFileBanner(Parcel in) {
        file = (File) in.readValue(Drawable.class.getClassLoader());
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeValue(file);
    }

    @SuppressWarnings("unused")
    public static final Creator<LocalFileBanner> CREATOR = new Creator<LocalFileBanner>() {
        @Override
        public LocalFileBanner createFromParcel(Parcel in) {
            return new LocalFileBanner(in);
        }

        @Override
        public LocalFileBanner[] newArray(int size) {
            return new LocalFileBanner[size];
        }
    };


}