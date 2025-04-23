package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpC7Heading3Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:12. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpC7Heading3Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpC7Heading3Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_C_7_HEADING_3_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpC7H3Pagenumber;
	
	/**
	* Constructor for RpC7Heading3Serialized
	**/
    public RpC7Heading3Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpC7Heading3Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_C_7_HEADING_3_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginRpC7H3Pagenumber = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpC7H3PagenumberCounter = -1;
     public boolean isRpC7H3PagenumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpC7H3PagenumberCounter != sharedCounter;
         localRpC7H3PagenumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_C_7_H_3_PAGENUMBER_LEN = 4;
	/**
	 * 	serialize this RpC7H3Pagenumber
	 */
   protected void serializeRpC7H3Pagenumber(char[] rpC7H3Pagenumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpC7H3Pagenumber,0,getStringValue(),beginRpC7H3Pagenumber,RP_C_7_H_3_PAGENUMBER_LEN);
       localRpC7H3PagenumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpC7H3PagenumberConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpC7H3Pagenumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpC7H3Pagenumber() {	 
   		return (substring(getStringValue(),beginRpC7H3Pagenumber,beginRpC7H3Pagenumber + RP_C_7_H_3_PAGENUMBER_LEN));
   	}




}
  
