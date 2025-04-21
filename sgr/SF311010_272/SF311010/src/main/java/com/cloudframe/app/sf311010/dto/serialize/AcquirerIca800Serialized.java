package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class AcquirerIca800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AcquirerIca800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AcquirerIca800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ACQUIRER_ICA_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAcqFiller2800;
	
	/**
	* Constructor for AcquirerIca800Serialized
	**/
    public AcquirerIca800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AcquirerIca800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ACQUIRER_ICA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAcqFiller2800 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAcqFiller2800Counter = -1;
     public boolean isAcqFiller2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAcqFiller2800Counter != sharedCounter;
         localAcqFiller2800Counter = sharedCounter; return hasModified;
     }
	protected static final int ACQ_FILLER_2800_LEN = 1;
	/**
	 * 	serialize this AcqFiller2800
	 */
   protected void serializeAcqFiller2800(char[] acqFiller2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(acqFiller2800,0,getStringValue(),beginAcqFiller2800,ACQ_FILLER_2800_LEN);
       localAcqFiller2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAcqFiller2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAcqFiller2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAcqFiller2800() {	 
   		return (substring(getStringValue(),beginAcqFiller2800,beginAcqFiller2800 + ACQ_FILLER_2800_LEN));
   	}




}
  
