package controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

@Named(value = "inplaceView")
@SessionScoped
public class InplaceView implements Serializable {

    private String text = "PrimeFaces";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    
}
