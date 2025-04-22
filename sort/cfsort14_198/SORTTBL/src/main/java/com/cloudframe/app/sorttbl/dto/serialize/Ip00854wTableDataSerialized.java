package com.cloudframe.app.sorttbl.dto.serialize;

/**
*  The class Ip00854wTableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00854wTableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00854wTableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00854W_TABLE_DATA_LENGTH = 8500;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Ip00854wTableDataSerialized
	**/
    public Ip00854wTableDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00854wTableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00854W_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  17);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  17);
     }
}
  
