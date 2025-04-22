package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class ForwardIca800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ForwardIca800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ForwardIca800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FORWARD_ICA_800_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFwdFiller2800;
	
	/**
	* Constructor for ForwardIca800Serialized
	**/
    public ForwardIca800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ForwardIca800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FORWARD_ICA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFwdFiller2800 = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFwdFiller2800Counter = -1;
     public boolean isFwdFiller2800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFwdFiller2800Counter != sharedCounter;
         localFwdFiller2800Counter = sharedCounter; return hasModified;
     }
	protected static final int FWD_FILLER_2800_LEN = 1;
	/**
	 * 	serialize this FwdFiller2800
	 */
   protected void serializeFwdFiller2800(char[] fwdFiller2800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(fwdFiller2800,0,getStringValue(),beginFwdFiller2800,FWD_FILLER_2800_LEN);
       localFwdFiller2800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFwdFiller2800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshFwdFiller2800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFwdFiller2800() {	 
   		return (substring(getStringValue(),beginFwdFiller2800,beginFwdFiller2800 + FWD_FILLER_2800_LEN));
   	}




}
  
