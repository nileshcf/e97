package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpEmailOpHeading2200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:29. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpEmailOpHeading2200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpEmailOpHeading2200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_EMAIL_OP_HEADING_2200_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpOpPagenumber1200;
	
	/**
	* Constructor for RpEmailOpHeading2200Serialized
	**/
    public RpEmailOpHeading2200Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpEmailOpHeading2200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_EMAIL_OP_HEADING_2200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
             beginRpOpPagenumber1200 = getStartOffset() + 128;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpOpPagenumber1200Counter = -1;
     public boolean isRpOpPagenumber1200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpOpPagenumber1200Counter != sharedCounter;
         localRpOpPagenumber1200Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_OP_PAGENUMBER_1200_LEN = 4;
	/**
	 * 	serialize this RpOpPagenumber1200
	 */
   protected void serializeRpOpPagenumber1200(char[] rpOpPagenumber1200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpOpPagenumber1200,0,getStringValue(),beginRpOpPagenumber1200,RP_OP_PAGENUMBER_1200_LEN);
       localRpOpPagenumber1200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpOpPagenumber1200Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshRpOpPagenumber1200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpOpPagenumber1200() {	 
   		return (substring(getStringValue(),beginRpOpPagenumber1200,beginRpOpPagenumber1200 + RP_OP_PAGENUMBER_1200_LEN));
   	}




}
  
