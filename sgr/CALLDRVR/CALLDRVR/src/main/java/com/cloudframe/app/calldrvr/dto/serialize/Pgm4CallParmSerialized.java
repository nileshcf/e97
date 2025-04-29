package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Pgm4CallParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:31. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pgm4CallParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pgm4CallParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_4_CALL_PARM_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgm4Parm1;
	
	/**
	* Constructor for Pgm4CallParmSerialized
	**/
    public Pgm4CallParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Pgm4CallParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_4_CALL_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgm4Parm1 = getStartOffset() + 0;	// set offset for serialization
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localPgm4Parm1Counter = -1;
     public boolean isPgm4Parm1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPgm4Parm1Counter != sharedCounter;
         localPgm4Parm1Counter = sharedCounter; return hasModified;
     }
	protected static final int PGM_4_PARM_1_LEN = 8;
	/**
	 * 	serialize this Pgm4Parm1
	 */
   protected void serializePgm4Parm1(char[] pgm4Parm1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(pgm4Parm1,0,getStringValue(),beginPgm4Parm1,PGM_4_PARM_1_LEN);
       localPgm4Parm1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPgm4Parm1Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshPgm4Parm1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPgm4Parm1() {	 
   		return (substring(getStringValue(),beginPgm4Parm1,beginPgm4Parm1 + PGM_4_PARM_1_LEN));
   	}




}
  
