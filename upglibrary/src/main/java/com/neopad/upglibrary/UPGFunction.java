package com.neopad.upglibrary;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.widget.Button;

import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.digest.DigestUtils;

/**
 * Created by JINSOOKIM on 2017-06-28.
 */

public class UPGFunction {
    public String doEncoding(UPGContainer container){
        //x+y+r+g+b+alpha (문자열로 append)
        StringBuilder pwBuilder = new StringBuilder();

        //step1 x,y값
        pwBuilder.append(getColorArray(container.getX(), container.getY(), container.getBackgroundBitmap()));

        //step2 아이디의 키보드 기준 x,y값 각 한글자씩(메일 도메인 제외)
        for (Button btn:container.getBtnArray()){
            pwBuilder.append(getColorArray((int)btn.getX(), (int)btn.getY(), container.getBackgroundBitmap()));
        }

        //step3 4자리 비밀번호
        for (Button numberBtn:container.getNumberPasswordArray()){
            pwBuilder.append(getColorArray((int)numberBtn.getX(), (int)numberBtn.getY(), container.getBackgroundBitmap()));
        }

        byte[] result = DigestUtils.md5(pwBuilder.toString());
        String mEncodeResult = new String(Hex.encodeHex(result));

        return mEncodeResult;
    }

    private String getColorArray(int x, int y, Bitmap background){
        StringBuilder colorBuilder = new StringBuilder();
        int pixel = background.getPixel(x, y);
        int redValue = Color.red(pixel);
        int blueValue = Color.blue(pixel);
        int greenValue = Color.green(pixel);
        int alphaValue = Color.alpha(pixel);

        colorBuilder.append(x);
        colorBuilder.append(y);
        colorBuilder.append(redValue);
        colorBuilder.append(greenValue);
        colorBuilder.append(blueValue);
        colorBuilder.append(alphaValue);

        return colorBuilder.toString();
    }
}
