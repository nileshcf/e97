package com.cloudframe.app.dbissues.dto.serialize;

/**
*  The class Cizf01oSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cizf01oSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cizf01oSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CIZF_01O_LENGTH = 1600;
   /*  offset of each of Child Fields when serialized as a String */
	
	/**
	* Constructor for Cizf01oSerialized
	**/
    public Cizf01oSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Cizf01oSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CIZF_01O_LENGTH);
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
  
