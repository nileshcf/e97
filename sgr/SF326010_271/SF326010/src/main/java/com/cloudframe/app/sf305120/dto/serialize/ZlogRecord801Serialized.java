package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ZlogRecord801Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ZlogRecord801Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ZlogRecord801Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ZLOG_RECORD_801_LENGTH = 8197;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZlogVariableData801;
	
	/**
	* Constructor for ZlogRecord801Serialized
	**/
    public ZlogRecord801Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ZlogRecord801Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ZLOG_RECORD_801_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginZlogVariableData801 = getStartOffset() + 40;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localZlogVariableData801Counter = -1;
     public boolean isZlogVariableData801Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZlogVariableData801Counter != sharedCounter;
         localZlogVariableData801Counter = sharedCounter; return hasModified;
     }
	protected static final int ZLOG_VARIABLE_DATA_801_LEN = 8157;
	/**
	 * 	serialize this ZlogVariableData801
	 */
   protected void serializeZlogVariableData801(char[] zlogVariableData801) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(zlogVariableData801,0,getStringValue(),beginZlogVariableData801,ZLOG_VARIABLE_DATA_801_LEN);
       localZlogVariableData801Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZlogVariableData801Constraints(char[] value) {
   			return super.checkConstraints(value , 8157 ,false, false);
   }
    /**
	 *	refreshZlogVariableData801 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZlogVariableData801() {	 
   		return (substring(getStringValue(),beginZlogVariableData801,beginZlogVariableData801 + ZLOG_VARIABLE_DATA_801_LEN));
   	}




}
  
