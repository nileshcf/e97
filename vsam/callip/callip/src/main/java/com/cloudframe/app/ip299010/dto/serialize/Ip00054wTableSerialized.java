package com.cloudframe.app.ip299010.dto.serialize;

/**
*  The class Ip00054wTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00054wTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00054wTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00054W_TABLE_LENGTH = 44000;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginIp00054wEntry;
           protected static final int IP_00054W_ENTRY_SIZE = 2000;
	
	/**
	* Constructor for Ip00054wTableSerialized
	**/
    public Ip00054wTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip00054wTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00054W_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginIp00054wEntry = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}

		public int ip00054wEntrySize() {
			return IP_00054W_ENTRY_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 0 + (dependValue *  22);
     }
     
     public int getVariableLength(int idx) {
     	return 0 + (idx *  22);
     }
}
  
