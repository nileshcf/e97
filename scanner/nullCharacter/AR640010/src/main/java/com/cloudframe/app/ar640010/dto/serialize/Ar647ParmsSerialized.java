package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar647ParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar647ParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar647ParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_647_PARMS_LENGTH = 110;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr647ProgramId;
            protected  int beginAr647ReturnCode;
            protected  int beginAr647OldDsn;
            protected  int beginAr647NewDsn;
	
	/**
	* Constructor for Ar647ParmsSerialized
	**/
    public Ar647ParmsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar647ParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_647_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr647ProgramId = getStartOffset() + 0;	// set offset for serialization
  
             beginAr647ReturnCode = getStartOffset() + 8;	// set offset for serialization
  
             beginAr647OldDsn = getStartOffset() + 10;	// set offset for serialization
  
             beginAr647NewDsn = getStartOffset() + 54;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAr647ProgramIdCounter = -1;
     public boolean isAr647ProgramIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647ProgramIdCounter != sharedCounter;
         localAr647ProgramIdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_647_PROGRAM_ID_LEN = 8;
	/**
	 * 	serialize this Ar647ProgramId
	 */
   protected void serializeAr647ProgramId(char[] ar647ProgramId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar647ProgramId,0,getStringValue(),beginAr647ProgramId,AR_647_PROGRAM_ID_LEN);
       localAr647ProgramIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr647ProgramIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAr647ProgramId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr647ProgramId() {	 
   		return (substring(getStringValue(),beginAr647ProgramId,beginAr647ProgramId + AR_647_PROGRAM_ID_LEN));
   	}
         int localAr647ReturnCodeCounter = -1;
         public boolean isAr647ReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr647ReturnCodeCounter != sharedCounter;
            localAr647ReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_647_RETURN_CODE_LEN = 2;
  	/**
	 * serializeAr647ReturnCode
	 */
	protected void serializeAr647ReturnCode(short ar647ReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( ar647ReturnCode,AR_647_RETURN_CODE_LEN)
                  ,beginAr647ReturnCode
                  ,AR_647_RETURN_CODE_LEN
                 );
            localAr647ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAr647ReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAr647ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAr647ReturnCode() {	 
			return (getShort(beginAr647ReturnCode));
   	}
     int localAr647OldDsnCounter = -1;
     public boolean isAr647OldDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647OldDsnCounter != sharedCounter;
         localAr647OldDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_647_OLD_DSN_LEN = 44;
	/**
	 * 	serialize this Ar647OldDsn
	 */
   protected void serializeAr647OldDsn(char[] ar647OldDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar647OldDsn,0,getStringValue(),beginAr647OldDsn,AR_647_OLD_DSN_LEN);
       localAr647OldDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr647OldDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshAr647OldDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr647OldDsn() {	 
   		return (substring(getStringValue(),beginAr647OldDsn,beginAr647OldDsn + AR_647_OLD_DSN_LEN));
   	}
     int localAr647NewDsnCounter = -1;
     public boolean isAr647NewDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr647NewDsnCounter != sharedCounter;
         localAr647NewDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_647_NEW_DSN_LEN = 44;
	/**
	 * 	serialize this Ar647NewDsn
	 */
   protected void serializeAr647NewDsn(char[] ar647NewDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar647NewDsn,0,getStringValue(),beginAr647NewDsn,AR_647_NEW_DSN_LEN);
       localAr647NewDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr647NewDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshAr647NewDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr647NewDsn() {	 
   		return (substring(getStringValue(),beginAr647NewDsn,beginAr647NewDsn + AR_647_NEW_DSN_LEN));
   	}




}
  
