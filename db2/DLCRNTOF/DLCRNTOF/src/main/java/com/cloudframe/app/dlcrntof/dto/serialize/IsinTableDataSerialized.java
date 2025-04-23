package com.cloudframe.app.dlcrntof.dto.serialize;

/**
*  The class IsinTableDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IsinTableDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IsinTableDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ISIN_TABLE_DATA_LENGTH = 24000;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for IsinTableDataSerialized
	**/
    public IsinTableDataSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IsinTableDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ISIN_TABLE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  12);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  12);
     }
}
  
