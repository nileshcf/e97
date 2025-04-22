package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class Cizf01iSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cizf01iSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cizf01iSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CIZF_01I_LENGTH = 1600;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Cizf01iSerialized
	**/
    public Cizf01iSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Cizf01iSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CIZF_01I_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
	   /*  end of offset */
	}




     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  0);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  0);
     }
}
  
