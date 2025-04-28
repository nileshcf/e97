package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class DtlLine2205Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DtlLine2205Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DtlLine2205Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DTL_LINE_2205_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginServiceName205;
	
	/**
	* Constructor for DtlLine2205Serialized
	**/
    public DtlLine2205Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DtlLine2205Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DTL_LINE_2205_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginServiceName205 = getStartOffset() + 9;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localServiceName205Counter = -1;
     public boolean isServiceName205Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localServiceName205Counter != sharedCounter;
         localServiceName205Counter = sharedCounter; return hasModified;
     }
	protected static final int SERVICE_NAME_205_LEN = 55;
	/**
	 * 	serialize this ServiceName205
	 */
   protected void serializeServiceName205(char[] serviceName205) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(serviceName205,0,getStringValue(),beginServiceName205,SERVICE_NAME_205_LEN);
       localServiceName205Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkServiceName205Constraints(char[] value) {
   			return super.checkConstraints(value , 55 ,false, false);
   }
    /**
	 *	refreshServiceName205 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshServiceName205() {	 
   		return (substring(getStringValue(),beginServiceName205,beginServiceName205 + SERVICE_NAME_205_LEN));
   	}




}
  
