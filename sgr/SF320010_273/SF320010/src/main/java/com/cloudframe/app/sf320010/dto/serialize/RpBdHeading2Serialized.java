package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpBdHeading2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:45. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpBdHeading2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpBdHeading2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_BD_HEADING_2_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpBdH2Pagenumber;
	
	/**
	* Constructor for RpBdHeading2Serialized
	**/
    public RpBdHeading2Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpBdHeading2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_BD_HEADING_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
             beginRpBdH2Pagenumber = getStartOffset() + 129;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpBdH2PagenumberCounter = -1;
     public boolean isRpBdH2PagenumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpBdH2PagenumberCounter != sharedCounter;
         localRpBdH2PagenumberCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_BD_H_2_PAGENUMBER_LEN = 4;
	/**
	 * 	serialize this RpBdH2Pagenumber
	 */
   protected void serializeRpBdH2Pagenumber(char[] rpBdH2Pagenumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpBdH2Pagenumber,0,getStringValue(),beginRpBdH2Pagenumber,RP_BD_H_2_PAGENUMBER_LEN);
       localRpBdH2PagenumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpBdH2PagenumberConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpBdH2Pagenumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpBdH2Pagenumber() {	 
   		return (substring(getStringValue(),beginRpBdH2Pagenumber,beginRpBdH2Pagenumber + RP_BD_H_2_PAGENUMBER_LEN));
   	}




}
  
