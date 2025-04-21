package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpPsHeading2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpPsHeading2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpPsHeading2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_PS_HEADING_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpPsH2Pagenumber;
	
	/**
	* Constructor for RpPsHeading2Serialized
	**/
    public RpPsHeading2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpPsHeading2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_PS_HEADING_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginRpPsH2Pagenumber = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpPsH2PagenumberCounter = -1;
     public boolean isRpPsH2PagenumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsH2PagenumberCounter != sharedCounter;
         localRpPsH2PagenumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_H_2_PAGENUMBER_LEN = 4;
	/**
	 * 	serialize this RpPsH2Pagenumber
	 */
   protected void serializeRpPsH2Pagenumber(char[] rpPsH2Pagenumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsH2Pagenumber,0,getStringValue(),beginRpPsH2Pagenumber,RP_PS_H_2_PAGENUMBER_LEN);
       localRpPsH2PagenumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsH2PagenumberConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpPsH2Pagenumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsH2Pagenumber() {	 
   		return (substring(getStringValue(),beginRpPsH2Pagenumber,beginRpPsH2Pagenumber + RP_PS_H_2_PAGENUMBER_LEN));
   	}




}
  
