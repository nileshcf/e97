package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ZlogSr1Area802Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ZlogSr1Area802Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ZlogSr1Area802Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ZLOG_SR_1_AREA_802_LENGTH = 8175;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZlogVariableData802;
	
	/**
	* Constructor for ZlogSr1Area802Serialized
	**/
    public ZlogSr1Area802Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ZlogSr1Area802Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ZLOG_SR_1_AREA_802_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginZlogVariableData802 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localZlogVariableData802Counter = -1;
     public boolean isZlogVariableData802Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZlogVariableData802Counter != sharedCounter;
         localZlogVariableData802Counter = sharedCounter; return hasModified;
     }
	protected static final int ZLOG_VARIABLE_DATA_802_LEN = 8167;
	/**
	 * 	serialize this ZlogVariableData802
	 */
   protected void serializeZlogVariableData802(char[] zlogVariableData802) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(zlogVariableData802,0,getStringValue(),beginZlogVariableData802,ZLOG_VARIABLE_DATA_802_LEN);
       localZlogVariableData802Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZlogVariableData802Constraints(char[] value) {
   			return super.checkConstraints(value , 8167 ,false, false);
   }
    /**
	 *	refreshZlogVariableData802 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZlogVariableData802() {	 
   		return (substring(getStringValue(),beginZlogVariableData802,beginZlogVariableData802 + ZLOG_VARIABLE_DATA_802_LEN));
   	}




}
  
