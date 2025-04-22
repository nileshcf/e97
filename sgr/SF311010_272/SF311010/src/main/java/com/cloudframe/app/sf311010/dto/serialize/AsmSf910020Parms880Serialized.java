package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class AsmSf910020Parms880Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:14. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AsmSf910020Parms880Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AsmSf910020Parms880Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ASM_SF_910020_PARMS_880_LENGTH = 9;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAsmTranByte880;
	
	/**
	* Constructor for AsmSf910020Parms880Serialized
	**/
    public AsmSf910020Parms880Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AsmSf910020Parms880Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ASM_SF_910020_PARMS_880_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAsmTranByte880 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAsmTranByte880Counter = -1;
     public boolean isAsmTranByte880Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAsmTranByte880Counter != sharedCounter;
         localAsmTranByte880Counter = sharedCounter; return hasModified;
     }
	protected static final int ASM_TRAN_BYTE_880_LEN = 1;
	/**
	 * 	serialize this AsmTranByte880
	 */
   protected void serializeAsmTranByte880(char[] asmTranByte880) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(asmTranByte880,0,getStringValue(),beginAsmTranByte880,ASM_TRAN_BYTE_880_LEN);
       localAsmTranByte880Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAsmTranByte880Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAsmTranByte880 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAsmTranByte880() {	 
   		return (substring(getStringValue(),beginAsmTranByte880,beginAsmTranByte880 + ASM_TRAN_BYTE_880_LEN));
   	}




}
  
