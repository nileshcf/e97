package com.cloudframe.app.crntof.dto.serialize;

/**
*  The class CrntofTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:18. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CrntofTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CrntofTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CRNTOF_TABLE_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCrntofId;
            protected  int beginCrntofName01;
            protected  int beginCrntofNameN;
	
	/**
	* Constructor for CrntofTableSerialized
	**/
    public CrntofTableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CrntofTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CRNTOF_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCrntofId = getStartOffset() + 0;	// set offset for serialization
  
             beginCrntofName01 = getStartOffset() + 4;	// set offset for serialization
  
             beginCrntofNameN = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCrntofIdCounter = -1;
     public boolean isCrntofIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrntofIdCounter != sharedCounter;
         localCrntofIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CRNTOF_ID_LEN = 4;
	/**
	 * 	serialize this CrntofId
	 */
   protected void serializeCrntofId(char[] crntofId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(crntofId,0,getStringValue(),beginCrntofId,CRNTOF_ID_LEN);
       localCrntofIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCrntofIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCrntofId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCrntofId() {	 
   		return (substring(getStringValue(),beginCrntofId,beginCrntofId + CRNTOF_ID_LEN));
   	}
     int localCrntofName01Counter = -1;
     public boolean isCrntofName01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCrntofName01Counter != sharedCounter;
         localCrntofName01Counter = sharedCounter; return hasModified;
     }
	protected static final int CRNTOF_NAME_01_LEN = 6;
	/**
	 * 	serialize this CrntofName01
	 */
   protected void serializeCrntofName01(char[] crntofName01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(crntofName01,0,getStringValue(),beginCrntofName01,CRNTOF_NAME_01_LEN);
       localCrntofName01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCrntofName01Constraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCrntofName01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCrntofName01() {	 
   		return (substring(getStringValue(),beginCrntofName01,beginCrntofName01 + CRNTOF_NAME_01_LEN));
   	}
         int localCrntofNameNCounter = -1;
         public boolean isCrntofNameNModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCrntofNameNCounter != sharedCounter;
            localCrntofNameNCounter = sharedCounter; return hasModified; 
         }
   protected static final int CRNTOF_NAME_N_LEN = 2;
  	/**
	 * serializeCrntofNameN
	 */
	protected void serializeCrntofNameN(short crntofNameN) {
           replaceValue( //  save the value as string
                   getBinaryString( crntofNameN,CRNTOF_NAME_N_LEN)
                  ,beginCrntofNameN
                  ,CRNTOF_NAME_N_LEN
                 );
            localCrntofNameNCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCrntofNameNMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCrntofNameN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCrntofNameN() {	 
			return (getShort(beginCrntofNameN));
   	}




}
  
