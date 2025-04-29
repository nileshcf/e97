package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Sys002Table500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys002Table500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys002Table500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_002_TABLE_500_LENGTH = 2000000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginSys002Data500;
           protected static final int SYS_002_DATA_500_SIZE = 10000;
	
	/**
	* Constructor for Sys002Table500Serialized
	**/
    public Sys002Table500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys002Table500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_002_TABLE_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginSys002Data500 = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int sys002Data500Size() {
			return SYS_002_DATA_500_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  200);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  200);
     }
}
  
