package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class RhErrorDestination810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RhErrorDestination810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RhErrorDestination810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RH_ERROR_DESTINATION_810_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRhErrDestLnth810;
            protected  int beginRhErrDestData810;
	
	/**
	* Constructor for RhErrorDestination810Serialized
	**/
    public RhErrorDestination810Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RhErrorDestination810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RH_ERROR_DESTINATION_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRhErrDestLnth810 = getStartOffset() + 0;	// set offset for serialization
  
             beginRhErrDestData810 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRhErrDestLnth810Counter = -1;
     public boolean isRhErrDestLnth810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhErrDestLnth810Counter != sharedCounter;
         localRhErrDestLnth810Counter = sharedCounter; return hasModified;
     }
	protected static final int RH_ERR_DEST_LNTH_810_LEN = 1;
	/**
	 * 	serialize this RhErrDestLnth810
	 */
   protected void serializeRhErrDestLnth810(char[] rhErrDestLnth810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rhErrDestLnth810,0,getStringValue(),beginRhErrDestLnth810,RH_ERR_DEST_LNTH_810_LEN);
       localRhErrDestLnth810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRhErrDestLnth810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRhErrDestLnth810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRhErrDestLnth810() {	 
   		return (substring(getStringValue(),beginRhErrDestLnth810,beginRhErrDestLnth810 + RH_ERR_DEST_LNTH_810_LEN));
   	}
     int localRhErrDestData810Counter = -1;
     public boolean isRhErrDestData810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhErrDestData810Counter != sharedCounter;
         localRhErrDestData810Counter = sharedCounter; return hasModified;
     }
	protected static final int RH_ERR_DEST_DATA_810_LEN = 255;
	/**
	 * 	serialize this RhErrDestData810
	 */
   protected void serializeRhErrDestData810(char[] rhErrDestData810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rhErrDestData810,0,getStringValue(),beginRhErrDestData810,RH_ERR_DEST_DATA_810_LEN);
       localRhErrDestData810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRhErrDestData810Constraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshRhErrDestData810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRhErrDestData810() {	 
   		return (substring(getStringValue(),beginRhErrDestData810,beginRhErrDestData810 + RH_ERR_DEST_DATA_810_LEN));
   	}




}
  
