package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class Parms1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parms1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parms1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARMS_1000_LENGTH = 102;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmLength1000;
	
	/**
	* Constructor for Parms1000Serialized
	**/
    public Parms1000Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Parms1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARMS_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParmLength1000 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localParmLength1000Counter = -1;
         public boolean isParmLength1000Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmLength1000Counter != sharedCounter;
            localParmLength1000Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_LENGTH_1000_LEN = 2;
  	/**
	 * serializeParmLength1000
	 */
	protected void serializeParmLength1000(short parmLength1000) {
           replaceValue( //  save the value as string
                   getBinaryString( parmLength1000,PARM_LENGTH_1000_LEN)
                  ,beginParmLength1000
                  ,PARM_LENGTH_1000_LEN
                 );
            localParmLength1000Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmLength1000MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmLength1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmLength1000() {	 
			return (getShort(beginParmLength1000));
   	}




}
  
