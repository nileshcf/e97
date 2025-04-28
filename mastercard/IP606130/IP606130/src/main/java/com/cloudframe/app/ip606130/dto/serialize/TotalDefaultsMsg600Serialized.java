package com.cloudframe.app.ip606130.dto.serialize;

/**
*  The class TotalDefaultsMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:57. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TotalDefaultsMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TotalDefaultsMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TOTAL_DEFAULTS_MSG_600_LENGTH = 55;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDefaultsBuild600;
	
	/**
	* Constructor for TotalDefaultsMsg600Serialized
	**/
    public TotalDefaultsMsg600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TotalDefaultsMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TOTAL_DEFAULTS_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDefaultsBuild600 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDefaultsBuild600Counter = -1;
     public boolean isDefaultsBuild600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDefaultsBuild600Counter != sharedCounter;
         localDefaultsBuild600Counter = sharedCounter; return hasModified;
     }
	protected static final int DEFAULTS_BUILD_600_LEN = 11;
	/**
	 * 	serialize this DefaultsBuild600
	 */
   protected void serializeDefaultsBuild600(char[] defaultsBuild600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(defaultsBuild600,0,getStringValue(),beginDefaultsBuild600,DEFAULTS_BUILD_600_LEN);
       localDefaultsBuild600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDefaultsBuild600Constraints(char[] value) {
   			return super.checkConstraints(value , 11 ,false, false);
   }
    /**
	 *	refreshDefaultsBuild600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDefaultsBuild600() {	 
   		return (substring(getStringValue(),beginDefaultsBuild600,beginDefaultsBuild600 + DEFAULTS_BUILD_600_LEN));
   	}




}
  
