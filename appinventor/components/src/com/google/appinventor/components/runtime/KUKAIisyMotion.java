package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.common.PropertyTypeConstants;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Form;
import android.util.Log;

@DesignerComponent(version = 1,
        description = "Non-visible component that provides functions KUKA Iisy robot.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "",
        showOnPalette = true)
@SimpleObject(external = true)
@UsesPermissions(permissionNames = "android.permission.INTERNET," +
        "android.permission.WRITE_EXTERNAL_STORAGE," +
        "android.permission.READ_EXTERNAL_STORAGE")
@UsesLibraries(libraries = "json.jar")
public class KUKAIisyMotion extends AndroidNonvisibleComponent {
    private static final String TAG = KUKAIisyMotion.class.getSimpleName();

    private String robotName;

    @SimpleProperty(
            category = PropertyCategory.BEHAVIOR,
            description ="The name of the robot")
    public String RobotName() {
        return robotName;
    }


    @DesignerProperty(
            editorType = PropertyTypeConstants.PROPERTY_TYPE_STRING,
            defaultValue = "LBR Iisy")
    @SimpleProperty
    public void RobotName(String robotName) {
        this.robotName = robotName;
    }

    @SimpleFunction(description = "Command the robot to move to the frame.")
    public void MoveToFrameAsync(String frameId) {
        Log.i(TAG, "Start moving to frame " + frameId);
    }

    @SimpleEvent(description = "It dispaches a 'Stopped' event when the robot stops.")
    public void Stopped() {
        EventDispatcher.dispatchEvent(this, "Stopped");
    }

    public KUKAIisyMotion(Form form) {
        super(form);
    }
}
