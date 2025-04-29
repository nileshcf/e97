package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip02014wTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip02014wTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip02014wTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_02014W_TABLE_LENGTH = 46600;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp02014wPrcsAgrmtTable;
           protected static final int IP_02014W_PRCS_AGRMT_TABLE_SIZE = 50;
	
	/**
	* Constructor for Ip02014wTableSerialized
	**/
    public Ip02014wTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip02014wTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_02014W_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp02014wPrcsAgrmtTable = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip02014wPrcsAgrmtTableSize() {
			return IP_02014W_PRCS_AGRMT_TABLE_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  932);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  932);
     }
}
  
