package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar649ParametersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar649ParametersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar649ParametersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_649_PARAMETERS_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr649ProgramId;
            protected  int beginAr649ReturnCode;
            protected  int beginAr649ActionCode;
            protected  int beginAr649XferMthdCd;
            protected  int beginAr649CommitActionCd;
	
	/**
	* Constructor for Ar649ParametersSerialized
	**/
    public Ar649ParametersSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar649ParametersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_649_PARAMETERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr649ProgramId = getStartOffset() + 0;	// set offset for serialization
  
  
             beginAr649ReturnCode = getStartOffset() + 22;	// set offset for serialization
  
             beginAr649ActionCode = getStartOffset() + 24;	// set offset for serialization
  
             beginAr649XferMthdCd = getStartOffset() + 26;	// set offset for serialization
  
             beginAr649CommitActionCd = getStartOffset() + 27;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAr649ProgramIdCounter = -1;
     public boolean isAr649ProgramIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649ProgramIdCounter != sharedCounter;
         localAr649ProgramIdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_649_PROGRAM_ID_LEN = 8;
	/**
	 * 	serialize this Ar649ProgramId
	 */
   protected void serializeAr649ProgramId(char[] ar649ProgramId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar649ProgramId,0,getStringValue(),beginAr649ProgramId,AR_649_PROGRAM_ID_LEN);
       localAr649ProgramIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr649ProgramIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAr649ProgramId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr649ProgramId() {	 
   		return (substring(getStringValue(),beginAr649ProgramId,beginAr649ProgramId + AR_649_PROGRAM_ID_LEN));
   	}
         int localAr649ReturnCodeCounter = -1;
         public boolean isAr649ReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr649ReturnCodeCounter != sharedCounter;
            localAr649ReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_649_RETURN_CODE_LEN = 2;
  	/**
	 * serializeAr649ReturnCode
	 */
	protected void serializeAr649ReturnCode(short ar649ReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( ar649ReturnCode,AR_649_RETURN_CODE_LEN)
                  ,beginAr649ReturnCode
                  ,AR_649_RETURN_CODE_LEN
                 );
            localAr649ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAr649ReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAr649ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAr649ReturnCode() {	 
			return (getShort(beginAr649ReturnCode));
   	}
         int localAr649ActionCodeCounter = -1;
         public boolean isAr649ActionCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr649ActionCodeCounter != sharedCounter;
            localAr649ActionCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_649_ACTION_CODE_LEN = 2;
  	/**
	 * serializeAr649ActionCode
	 */
	protected void serializeAr649ActionCode(short ar649ActionCode) {
           replaceValue( //  save the value as string
                   getBinaryString( ar649ActionCode,AR_649_ACTION_CODE_LEN)
                  ,beginAr649ActionCode
                  ,AR_649_ACTION_CODE_LEN
                 );
            localAr649ActionCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAr649ActionCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAr649ActionCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAr649ActionCode() {	 
			return (getShort(beginAr649ActionCode));
   	}
     int localAr649XferMthdCdCounter = -1;
     public boolean isAr649XferMthdCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649XferMthdCdCounter != sharedCounter;
         localAr649XferMthdCdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_649_XFER_MTHD_CD_LEN = 1;
	/**
	 * 	serialize this Ar649XferMthdCd
	 */
   protected void serializeAr649XferMthdCd(char[] ar649XferMthdCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar649XferMthdCd,0,getStringValue(),beginAr649XferMthdCd,AR_649_XFER_MTHD_CD_LEN);
       localAr649XferMthdCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr649XferMthdCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAr649XferMthdCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr649XferMthdCd() {	 
   		return (substring(getStringValue(),beginAr649XferMthdCd,beginAr649XferMthdCd + AR_649_XFER_MTHD_CD_LEN));
   	}
     int localAr649CommitActionCdCounter = -1;
     public boolean isAr649CommitActionCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649CommitActionCdCounter != sharedCounter;
         localAr649CommitActionCdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_649_COMMIT_ACTION_CD_LEN = 1;
	/**
	 * 	serialize this Ar649CommitActionCd
	 */
   protected void serializeAr649CommitActionCd(char[] ar649CommitActionCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar649CommitActionCd,0,getStringValue(),beginAr649CommitActionCd,AR_649_COMMIT_ACTION_CD_LEN);
       localAr649CommitActionCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr649CommitActionCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAr649CommitActionCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr649CommitActionCd() {	 
   		return (substring(getStringValue(),beginAr649CommitActionCd,beginAr649CommitActionCd + AR_649_COMMIT_ACTION_CD_LEN));
   	}




}
  
