package com.depan.test.common;

import org.apache.hadoop.hive.ql.exec.UDF;
import org.apache.hadoop.io.Text;

/**
 * Created by xjcui on 15/8/2.
 */


public class hiveUpper extends UDF{
    public Text evaluate(final Text s){
        if (null == s){
            return null;
        }
        return new Text(s.toString().toUpperCase());
    }
}