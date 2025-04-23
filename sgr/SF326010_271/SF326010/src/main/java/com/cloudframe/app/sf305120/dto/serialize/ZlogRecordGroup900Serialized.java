package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ZlogRecordGroup900Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ZlogRecordGroup900Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ZlogRecordGroup900Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ZLOG_RECORD_GROUP_900_LENGTH = 8197;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZlogRecord900;
	
	/**
	* Constructor for ZlogRecordGroup900Serialized
	**/
    public ZlogRecordGroup900Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ZlogRecordGroup900Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ZLOG_RECORD_GROUP_900_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginZlogRecord900 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localZlogRecord900Counter = -1;
     public boolean isZlogRecord900Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localZlogRecord900Counter != sharedCounter;
         localZlogRecord900Counter = sharedCounter; return hasModified;
     }
	protected static final int ZLOG_RECORD_900_LEN = 8197;
	/**
	 * 	serialize this ZlogRecord900
	 */
   protected void serializeZlogRecord900(char[] zlogRecord900) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(zlogRecord900,0,getStringValue(),beginZlogRecord900,ZLOG_RECORD_900_LEN);
       localZlogRecord900Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkZlogRecord900Constraints(char[] value) {
   			return super.checkConstraints(value , 8197 ,false, false);
   }
    /**
	 *	refreshZlogRecord900 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshZlogRecord900() {	 
   		return (substring(getStringValue(),beginZlogRecord900,beginZlogRecord900 + ZLOG_RECORD_900_LEN));
   	}




}
  
