package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@Named(value = "colorView")
@SessionScoped
public class ColorView implements Serializable {

    private String colorInline;

    private String colorPopup;

    public String getColorInline() {
        return colorInline;
    }

    public void setColorInline(String colorInline) {
        this.colorInline = colorInline;
    }

    public String getColorPopup() {
        return colorPopup;
    }

    public void setColorPopup(String colorPopup) {
        this.colorPopup = colorPopup;
    }

}
