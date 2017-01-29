/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icbt.jspdemo2.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author icbt
 */
public class LecturerModel {
    
     
    
    Map<String,List<String>> studentMap=new HashMap<String,List<String>>();
    
    {
    studentMap.put("John",Arrays.asList(new String[]{"Jeff","Paul","Depak"}));
     studentMap.put("Eric",Arrays.asList(new String[]{"Bob","Megan"}));
     studentMap.put("Jim",Arrays.asList(new String[]{"Kevin"}));
    
    }
    public List<String> getStudentList(String lecturerName)
    {
        return studentMap.get(lecturerName);
    }
}
