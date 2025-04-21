package com.cloudframe.app.db2hst1.dto.serialize;

/**
*  The class Dcltemp06Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Dcltemp06Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Dcltemp06Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DCLTEMP_06_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHvEmpNo;
            protected  int beginHvEmpSal;
	
	/**
	* Constructor for Dcltemp06Serialized
	**/
    public Dcltemp06Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Dcltemp06Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DCLTEMP_06_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHvEmpNo = getStartOffset() + 0;	// set offset for serialization
  
             beginHvEmpSal = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localHvEmpNoCounter = -1;
     public boolean isHvEmpNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvEmpNoCounter != sharedCounter;
         localHvEmpNoCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_EMP_NO_LEN = 4;
	/**
	 * 	serialize this HvEmpNo
	 */
   protected void serializeHvEmpNo(char[] hvEmpNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvEmpNo,0,getStringValue(),beginHvEmpNo,HV_EMP_NO_LEN);
       localHvEmpNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvEmpNoConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshHvEmpNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvEmpNo() {	 
   		return (substring(getStringValue(),beginHvEmpNo,beginHvEmpNo + HV_EMP_NO_LEN));
   	}
     int localHvEmpSalCounter = -1;
     public boolean isHvEmpSalModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHvEmpSalCounter != sharedCounter;
         localHvEmpSalCounter = sharedCounter; return hasModified;
     }
	protected static final int HV_EMP_SAL_LEN = 5;
	/**
	 * 	serialize this HvEmpSal
	 */
   protected void serializeHvEmpSal(char[] hvEmpSal) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hvEmpSal,0,getStringValue(),beginHvEmpSal,HV_EMP_SAL_LEN);
       localHvEmpSalCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHvEmpSalConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshHvEmpSal is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHvEmpSal() {	 
   		return (substring(getStringValue(),beginHvEmpSal,beginHvEmpSal + HV_EMP_SAL_LEN));
   	}




}
  
