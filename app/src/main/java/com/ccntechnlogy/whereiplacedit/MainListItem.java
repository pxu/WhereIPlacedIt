package com.ccntechnlogy.whereiplacedit;

import android.widget.ImageButton;

/**
 * Created by xupengfei on 15-01-24.
 */
public class MainListItem {

    private String id;
    private ImageButton imageButtonType; // pic, note, record
    private String note ="";
    private boolean isRecordIconVisible = true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ImageButton getImageButtonType() {
        return imageButtonType;
    }

    public void setImageButtonType(ImageButton imageButtonType) {
        this.imageButtonType = imageButtonType;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isRecordIconVisible() {
        return isRecordIconVisible;
    }

    public void setRecordIconVisible(boolean isRecordIconVisible) {
        this.isRecordIconVisible = isRecordIconVisible;
    }

}
