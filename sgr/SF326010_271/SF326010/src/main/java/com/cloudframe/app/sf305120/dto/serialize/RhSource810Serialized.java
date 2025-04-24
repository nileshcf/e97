package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class RhSource810Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RhSource810Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RhSource810Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RH_SOURCE_810_LENGTH = 256;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRhSourceLnth810;
            protected  int beginRhSourceData810;
	
	/**
	* Constructor for RhSource810Serialized
	**/
    public RhSource810Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RhSource810Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RH_SOURCE_810_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRhSourceLnth810 = getStartOffset() + 0;	// set offset for serialization
  
             beginRhSourceData810 = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRhSourceLnth810Counter = -1;
     public boolean isRhSourceLnth810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhSourceLnth810Counter != sharedCounter;
         localRhSourceLnth810Counter = sharedCounter; return hasModified;
     }
	protected static final int RH_SOURCE_LNTH_810_LEN = 1;
	/**
	 * 	serialize this RhSourceLnth810
	 */
   protected void serializeRhSourceLnth810(char[] rhSourceLnth810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rhSourceLnth810,0,getStringValue(),beginRhSourceLnth810,RH_SOURCE_LNTH_810_LEN);
       localRhSourceLnth810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRhSourceLnth810Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshRhSourceLnth810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRhSourceLnth810() {	 
   		return (substring(getStringValue(),beginRhSourceLnth810,beginRhSourceLnth810 + RH_SOURCE_LNTH_810_LEN));
   	}
     int localRhSourceData810Counter = -1;
     public boolean isRhSourceData810Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRhSourceData810Counter != sharedCounter;
         localRhSourceData810Counter = sharedCounter; return hasModified;
     }
	protected static final int RH_SOURCE_DATA_810_LEN = 255;
	/**
	 * 	serialize this RhSourceData810
	 */
   protected void serializeRhSourceData810(char[] rhSourceData810) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rhSourceData810,0,getStringValue(),beginRhSourceData810,RH_SOURCE_DATA_810_LEN);
       localRhSourceData810Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRhSourceData810Constraints(char[] value) {
   			return super.checkConstraints(value , 255 ,false, false);
   }
    /**
	 *	refreshRhSourceData810 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRhSourceData810() {	 
   		return (substring(getStringValue(),beginRhSourceData810,beginRhSourceData810 + RH_SOURCE_DATA_810_LEN));
   	}




}
  
