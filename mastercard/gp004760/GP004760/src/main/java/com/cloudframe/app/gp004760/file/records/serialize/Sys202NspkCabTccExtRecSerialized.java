package com.cloudframe.app.gp004760.file.records.serialize;

/**
*  The class Sys202NspkCabTccExtRecSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:54. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sys202NspkCabTccExtRecSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sys202NspkCabTccExtRecSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SYS_202_NSPK_CAB_TCC_EXT_REC_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSys202NspkCabTccExtRecString;
	
	/**
	* Constructor for Sys202NspkCabTccExtRecSerialized
	**/
    public Sys202NspkCabTccExtRecSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sys202NspkCabTccExtRecSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SYS_202_NSPK_CAB_TCC_EXT_REC_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSys202NspkCabTccExtRecString = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSys202NspkCabTccExtRecStringCounter = -1;
     public boolean isSys202NspkCabTccExtRecStringModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSys202NspkCabTccExtRecStringCounter != sharedCounter;
         localSys202NspkCabTccExtRecStringCounter = sharedCounter; return hasModified;
     }
	protected static final int SYS_202_NSPK_CAB_TCC_EXT_REC_STRING_LEN = 10;
	/**
	 * 	serialize this Sys202NspkCabTccExtRecString
	 */
   protected void serializeSys202NspkCabTccExtRecString(char[] sys202NspkCabTccExtRecString) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sys202NspkCabTccExtRecString,0,getStringValue(),beginSys202NspkCabTccExtRecString,SYS_202_NSPK_CAB_TCC_EXT_REC_STRING_LEN);
       localSys202NspkCabTccExtRecStringCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSys202NspkCabTccExtRecStringConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshSys202NspkCabTccExtRecString is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSys202NspkCabTccExtRecString() {	 
   		return (substring(getStringValue(),beginSys202NspkCabTccExtRecString,beginSys202NspkCabTccExtRecString + SYS_202_NSPK_CAB_TCC_EXT_REC_STRING_LEN));
   	}




}
  
