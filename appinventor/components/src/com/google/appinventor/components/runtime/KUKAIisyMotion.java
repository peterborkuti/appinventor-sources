package com.google.appinventor.components.runtime;

import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.Form;

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
    private String robotName;

    /*
    @SimpleProperty(
            description = "The name of the robot",
            userVisible = true)
    public String RobotName() {
        return robotName;
    }

    @SimpleProperty(
            userVisible = true)
    public void RobotName(String robotName) {
        this.robotName = robotName;
    }
    */

    public KUKAIisyMotion(Form form) {
        super(form);
    }
}
