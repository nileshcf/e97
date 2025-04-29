package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpMpHeading2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpMpHeading2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpMpHeading2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_MP_HEADING_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpMpH2Pagenumber;
	
	/**
	* Constructor for RpMpHeading2Serialized
	**/
    public RpMpHeading2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpMpHeading2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_MP_HEADING_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginRpMpH2Pagenumber = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpMpH2PagenumberCounter = -1;
     public boolean isRpMpH2PagenumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpMpH2PagenumberCounter != sharedCounter;
         localRpMpH2PagenumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_MP_H_2_PAGENUMBER_LEN = 4;
	/**
	 * 	serialize this RpMpH2Pagenumber
	 */
   protected void serializeRpMpH2Pagenumber(char[] rpMpH2Pagenumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpMpH2Pagenumber,0,getStringValue(),beginRpMpH2Pagenumber,RP_MP_H_2_PAGENUMBER_LEN);
       localRpMpH2PagenumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpMpH2PagenumberConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpMpH2Pagenumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpMpH2Pagenumber() {	 
   		return (substring(getStringValue(),beginRpMpH2Pagenumber,beginRpMpH2Pagenumber + RP_MP_H_2_PAGENUMBER_LEN));
   	}




}
  
