package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Sdms01ParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sdms01ParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sdms01ParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SDMS_01_PARM_LENGTH = 7002;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSdms01ParmLen;
            protected  int beginSdms01ParmData;
	
	/**
	* Constructor for Sdms01ParmSerialized
	**/
    public Sdms01ParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Sdms01ParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SDMS_01_PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSdms01ParmLen = getStartOffset() + 0;	// set offset for serialization
  
             beginSdms01ParmData = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSdms01ParmLenCounter = -1;
         public boolean isSdms01ParmLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSdms01ParmLenCounter != sharedCounter;
            localSdms01ParmLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int SDMS_01_PARM_LEN_LEN = 2;
  	/**
	 * serializeSdms01ParmLen
	 */
	protected void serializeSdms01ParmLen(short sdms01ParmLen) {
           replaceValue( //  save the value as string
                   getBinaryString( sdms01ParmLen,SDMS_01_PARM_LEN_LEN)
                  ,beginSdms01ParmLen
                  ,SDMS_01_PARM_LEN_LEN
                 );
            localSdms01ParmLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSdms01ParmLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSdms01ParmLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSdms01ParmLen() {	 
			return (getShort(beginSdms01ParmLen));
   	}
     int localSdms01ParmDataCounter = -1;
     public boolean isSdms01ParmDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSdms01ParmDataCounter != sharedCounter;
         localSdms01ParmDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SDMS_01_PARM_DATA_LEN = 7000;
	/**
	 * 	serialize this Sdms01ParmData
	 */
   protected void serializeSdms01ParmData(char[] sdms01ParmData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sdms01ParmData,0,getStringValue(),beginSdms01ParmData,SDMS_01_PARM_DATA_LEN);
       localSdms01ParmDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSdms01ParmDataConstraints(char[] value) {
   			return super.checkConstraints(value , 7000 ,false, false);
   }
    /**
	 *	refreshSdms01ParmData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSdms01ParmData() {	 
   		return (substring(getStringValue(),beginSdms01ParmData,beginSdms01ParmData + SDMS_01_PARM_DATA_LEN));
   	}




}
  
