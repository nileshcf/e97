package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ClogRecord801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ClogRecord801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ClogRecord801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CLOG_RECORD_801_LENGTH = 8238;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginClogVariableData801;
	
	/**
	* Constructor for ClogRecord801Serialized
	**/
    public ClogRecord801Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ClogRecord801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CLOG_RECORD_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginClogVariableData801 = getStartOffset() + 81;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localClogVariableData801Counter = -1;
     public boolean isClogVariableData801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localClogVariableData801Counter != sharedCounter;
         localClogVariableData801Counter = sharedCounter; return hasModified;
     }
	protected static final int CLOG_VARIABLE_DATA_801_LEN = 8157;
	/**
	 * 	serialize this ClogVariableData801
	 */
   protected void serializeClogVariableData801(char[] clogVariableData801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(clogVariableData801,0,getStringValue(),beginClogVariableData801,CLOG_VARIABLE_DATA_801_LEN);
       localClogVariableData801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkClogVariableData801Constraints(char[] value) {
   			return super.checkConstraints(value , 8157 ,false, false);
   }
    /**
	 *	refreshClogVariableData801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshClogVariableData801() {	 
   		return (substring(getStringValue(),beginClogVariableData801,beginClogVariableData801 + CLOG_VARIABLE_DATA_801_LEN));
   	}




}
  
