package com.cloudframe.app.ip343900.dto.serialize;

/**
*  The class EnvrmentFileData800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EnvrmentFileData800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EnvrmentFileData800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ENVRMENT_FILE_DATA_800_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmEnvIdentifier800;
	
	/**
	* Constructor for EnvrmentFileData800Serialized
	**/
    public EnvrmentFileData800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EnvrmentFileData800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ENVRMENT_FILE_DATA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmEnvIdentifier800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localParmEnvIdentifier800Counter = -1;
     public boolean isParmEnvIdentifier800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmEnvIdentifier800Counter != sharedCounter;
         localParmEnvIdentifier800Counter = sharedCounter; return hasModified;
     }
	protected static final int PARM_ENV_IDENTIFIER_800_LEN = 3;
	/**
	 * 	serialize this ParmEnvIdentifier800
	 */
   protected void serializeParmEnvIdentifier800(char[] parmEnvIdentifier800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmEnvIdentifier800,0,getStringValue(),beginParmEnvIdentifier800,PARM_ENV_IDENTIFIER_800_LEN);
       localParmEnvIdentifier800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmEnvIdentifier800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshParmEnvIdentifier800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmEnvIdentifier800() {	 
   		return (substring(getStringValue(),beginParmEnvIdentifier800,beginParmEnvIdentifier800 + PARM_ENV_IDENTIFIER_800_LEN));
   	}




}
  
