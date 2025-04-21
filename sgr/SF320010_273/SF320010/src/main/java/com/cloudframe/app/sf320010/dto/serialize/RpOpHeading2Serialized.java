package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpOpHeading2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpOpHeading2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpOpHeading2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_OP_HEADING_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpOpH2Pagenumber;
	
	/**
	* Constructor for RpOpHeading2Serialized
	**/
    public RpOpHeading2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpOpHeading2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_OP_HEADING_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginRpOpH2Pagenumber = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpOpH2PagenumberCounter = -1;
     public boolean isRpOpH2PagenumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpH2PagenumberCounter != sharedCounter;
         localRpOpH2PagenumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_H_2_PAGENUMBER_LEN = 4;
	/**
	 * 	serialize this RpOpH2Pagenumber
	 */
   protected void serializeRpOpH2Pagenumber(char[] rpOpH2Pagenumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpH2Pagenumber,0,getStringValue(),beginRpOpH2Pagenumber,RP_OP_H_2_PAGENUMBER_LEN);
       localRpOpH2PagenumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpH2PagenumberConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpOpH2Pagenumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpH2Pagenumber() {	 
   		return (substring(getStringValue(),beginRpOpH2Pagenumber,beginRpOpH2Pagenumber + RP_OP_H_2_PAGENUMBER_LEN));
   	}




}
  
