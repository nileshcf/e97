package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpCoHeading2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpCoHeading2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpCoHeading2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_CO_HEADING_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpCoH2Pagenumber;
	
	/**
	* Constructor for RpCoHeading2Serialized
	**/
    public RpCoHeading2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpCoHeading2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_CO_HEADING_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginRpCoH2Pagenumber = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpCoH2PagenumberCounter = -1;
     public boolean isRpCoH2PagenumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpCoH2PagenumberCounter != sharedCounter;
         localRpCoH2PagenumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_CO_H_2_PAGENUMBER_LEN = 4;
	/**
	 * 	serialize this RpCoH2Pagenumber
	 */
   protected void serializeRpCoH2Pagenumber(char[] rpCoH2Pagenumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpCoH2Pagenumber,0,getStringValue(),beginRpCoH2Pagenumber,RP_CO_H_2_PAGENUMBER_LEN);
       localRpCoH2PagenumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpCoH2PagenumberConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpCoH2Pagenumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpCoH2Pagenumber() {	 
   		return (substring(getStringValue(),beginRpCoH2Pagenumber,beginRpCoH2Pagenumber + RP_CO_H_2_PAGENUMBER_LEN));
   	}




}
  
