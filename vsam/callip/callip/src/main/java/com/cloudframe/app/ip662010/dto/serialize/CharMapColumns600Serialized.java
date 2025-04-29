package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class CharMapColumns600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:16. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CharMapColumns600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CharMapColumns600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CHAR_MAP_COLUMNS_600_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIpmErrorColumns600;
	
	/**
	* Constructor for CharMapColumns600Serialized
	**/
    public CharMapColumns600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CharMapColumns600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CHAR_MAP_COLUMNS_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIpmErrorColumns600 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localIpmErrorColumns600Counter = -1;
     public boolean isIpmErrorColumns600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIpmErrorColumns600Counter != sharedCounter;
         localIpmErrorColumns600Counter = sharedCounter; return hasModified;
     }
	protected static final int IPM_ERROR_COLUMNS_600_LEN = 100;
	/**
	 * 	serialize this IpmErrorColumns600
	 */
   protected void serializeIpmErrorColumns600(char[] ipmErrorColumns600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ipmErrorColumns600,0,getStringValue(),beginIpmErrorColumns600,IPM_ERROR_COLUMNS_600_LEN);
       localIpmErrorColumns600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIpmErrorColumns600Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshIpmErrorColumns600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIpmErrorColumns600() {	 
   		return (substring(getStringValue(),beginIpmErrorColumns600,beginIpmErrorColumns600 + IPM_ERROR_COLUMNS_600_LEN));
   	}




}
  
