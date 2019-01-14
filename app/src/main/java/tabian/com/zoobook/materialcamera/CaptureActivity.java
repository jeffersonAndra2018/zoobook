package tabian.com.zoobook.materialcamera;

import android.app.Fragment;
import android.support.annotation.NonNull;

import tabian.com.zoobook.materialcamera.internal.BaseCaptureActivity;
import tabian.com.zoobook.materialcamera.internal.CameraFragment;

public class CaptureActivity extends BaseCaptureActivity {

  @Override
  @NonNull
  public Fragment getFragment() {
    return CameraFragment.newInstance();
  }
}
