package wxut.sss.mytestcast;

import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;

import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * Created by 87688 on 2018/8/22.
 */


@RunWith(AndroidJUnit4.class)
public class TestOne {
    private UiDevice mDevice;

    @Test
    public void demo() throws UiObjectNotFoundException {

        mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        mDevice.pressHome();
        mDevice.pressHome();
        UiObject x =mDevice.findObject(new UiSelector().text("联系人"));
        x.click();
    }


}
