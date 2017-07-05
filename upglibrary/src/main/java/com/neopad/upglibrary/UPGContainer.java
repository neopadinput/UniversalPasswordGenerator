package com.neopad.upglibrary;

import android.graphics.Bitmap;
import android.widget.Button;

import java.util.ArrayList;

/**
 * Created by JINSOOKIM on 2017-06-27.
 */

public class UPGContainer {
    //step1 x,y값
    //step2 아이디의 키보드 기준 x,y,color 각 한글자씩(메일 도메인 제외)
    //step3 4자리 비밀번호 키보드 기준 x,y,color 각 한글자씩

    private int x, y;
    private ArrayList<Button> btnArray;
    private ArrayList<Button> numberPasswordArray;
    private Bitmap backgroundBitmap;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public ArrayList<Button> getBtnArray() {
        return btnArray;
    }

    public void setBtnArray(ArrayList<Button> btnArray) {
        this.btnArray = btnArray;
    }

    public ArrayList<Button> getNumberPasswordArray() {
        return numberPasswordArray;
    }

    public void setNumberPasswordArray(ArrayList<Button> numberPasswordArray) {
        this.numberPasswordArray = numberPasswordArray;
    }

    public Bitmap getBackgroundBitmap() {
        return backgroundBitmap;
    }

    public void setBackgroundBitmap(Bitmap backgroundBitmap) {
        this.backgroundBitmap = backgroundBitmap;
    }
}
