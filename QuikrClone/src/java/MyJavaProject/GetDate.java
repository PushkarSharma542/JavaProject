/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyJavaProject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author PushkarSharma
 */
public class GetDate {
    private static final DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    static public String getDate()
    {
        Calendar cal = Calendar.getInstance();
        String d=sdf.format(cal.getTime());
        return d;
    }
}
