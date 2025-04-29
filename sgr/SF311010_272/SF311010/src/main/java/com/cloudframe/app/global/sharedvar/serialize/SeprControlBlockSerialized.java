package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class SeprControlBlockSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeprControlBlockSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeprControlBlockSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEPR_CONTROL_BLOCK_LENGTH = 39;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeprReturnCode;
            protected  int beginSeprReturnDesc;
            protected  int beginSeprDe48Sw;
            protected  int beginSeprDataLength;
            protected  int beginSeprBadId;
            protected  int beginSeprBadLength;
            protected  int beginSeprTccCd;
            protected  int beginSeprDataAddr;
            protected  int beginSeprDataPtr;
	
	/**
	* Constructor for SeprControlBlockSerialized
	**/
    public SeprControlBlockSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in SeprControlBlockSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEPR_CONTROL_BLOCK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSeprReturnCode = getStartOffset() + 0;	// set offset for serialization
  
             beginSeprReturnDesc = getStartOffset() + 4;	// set offset for serialization
  
             beginSeprDe48Sw = getStartOffset() + 24;	// set offset for serialization
  
             beginSeprDataLength = getStartOffset() + 25;	// set offset for serialization
  
             beginSeprBadId = getStartOffset() + 28;	// set offset for serialization
  
             beginSeprBadLength = getStartOffset() + 31;	// set offset for serialization
  
             beginSeprTccCd = getStartOffset() + 34;	// set offset for serialization
  
             beginSeprDataAddr = getStartOffset() + 35;	// set offset for serialization
  
             beginSeprDataPtr = getStartOffset() + 35;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSeprReturnCodeCounter = -1;
     public boolean isSeprReturnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprReturnCodeCounter != sharedCounter;
         localSeprReturnCodeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seprReturnCode
	 *	@return seprReturnCode
	 */
	public char[]  getSeprReturnCodeString() {
	     return getCharArray(beginSeprReturnCode,SEPR_RETURN_CODE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seprReturnCodeIsNumeric() {
	    return isNumeric(beginSeprReturnCode
	                    ,beginSeprReturnCode + SEPR_RETURN_CODE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEPR_RETURN_CODE_LEN = 4;
  	/**
	 * serializeSeprReturnCode
	 */
	protected void serializeSeprReturnCode(int seprReturnCode) {
		 putNumber(beginSeprReturnCode,seprReturnCode,SEPR_RETURN_CODE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeprReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeprReturnCode
	 */
   	protected  int serializeSeprReturnCode(char[] value) {
	    int  seprReturnCode;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seprReturnCode = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginSeprReturnCode
		       ,4
		      );
		 localSeprReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
		return  seprReturnCode;
    }

   protected int checkSeprReturnCodeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeprReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSeprReturnCode() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSeprReturnCode
			                 ,SEPR_RETURN_CODE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seprReturnCode", beginSeprReturnCode,SEPR_RETURN_CODE_LEN);
    }
   	}
     int localSeprReturnDescCounter = -1;
     public boolean isSeprReturnDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprReturnDescCounter != sharedCounter;
         localSeprReturnDescCounter = sharedCounter; return hasModified;
     }
	protected static final int SEPR_RETURN_DESC_LEN = 20;
	/**
	 * 	serialize this SeprReturnDesc
	 */
   protected void serializeSeprReturnDesc(char[] seprReturnDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seprReturnDesc,0,getStringValue(),beginSeprReturnDesc,SEPR_RETURN_DESC_LEN);
       localSeprReturnDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeprReturnDescConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshSeprReturnDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeprReturnDesc() {	 
   		return (substring(getStringValue(),beginSeprReturnDesc,beginSeprReturnDesc + SEPR_RETURN_DESC_LEN));
   	}
     int localSeprDe48SwCounter = -1;
     public boolean isSeprDe48SwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprDe48SwCounter != sharedCounter;
         localSeprDe48SwCounter = sharedCounter; return hasModified;
     }
	protected static final int SEPR_DE_48_SW_LEN = 1;
	/**
	 * 	serialize this SeprDe48Sw
	 */
   protected void serializeSeprDe48Sw(char[] seprDe48Sw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seprDe48Sw,0,getStringValue(),beginSeprDe48Sw,SEPR_DE_48_SW_LEN);
       localSeprDe48SwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeprDe48SwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSeprDe48Sw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeprDe48Sw() {	 
   		return (substring(getStringValue(),beginSeprDe48Sw,beginSeprDe48Sw + SEPR_DE_48_SW_LEN));
   	}
     int localSeprDataLengthCounter = -1;
     public boolean isSeprDataLengthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprDataLengthCounter != sharedCounter;
         localSeprDataLengthCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of seprDataLength
	 *	@return seprDataLength
	 */
	public char[]  getSeprDataLengthString() {
	     return getCharArray(beginSeprDataLength,SEPR_DATA_LENGTH_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean seprDataLengthIsNumeric() {
	    return isNumeric(beginSeprDataLength
	                    ,beginSeprDataLength + SEPR_DATA_LENGTH_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SEPR_DATA_LENGTH_LEN = 3;
  	/**
	 * serializeSeprDataLength
	 */
	protected void serializeSeprDataLength(int seprDataLength) {
		 putNumber(beginSeprDataLength,seprDataLength,SEPR_DATA_LENGTH_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSeprDataLengthCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSeprDataLength
	 */
   	protected  int serializeSeprDataLength(char[] value) {
	    int  seprDataLength;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    seprDataLength = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginSeprDataLength
		       ,3
		      );
		 localSeprDataLengthCounter = shareString.getSerializedField().getModifiedCounter();
		return  seprDataLength;
    }

   protected int checkSeprDataLengthMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSeprDataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSeprDataLength() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSeprDataLength
			                 ,SEPR_DATA_LENGTH_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("seprDataLength", beginSeprDataLength,SEPR_DATA_LENGTH_LEN);
    }
   	}
     int localSeprBadIdCounter = -1;
     public boolean isSeprBadIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprBadIdCounter != sharedCounter;
         localSeprBadIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SEPR_BAD_ID_LEN = 3;
	/**
	 * 	serialize this SeprBadId
	 */
   protected void serializeSeprBadId(char[] seprBadId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seprBadId,0,getStringValue(),beginSeprBadId,SEPR_BAD_ID_LEN);
       localSeprBadIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeprBadIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSeprBadId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeprBadId() {	 
   		return (substring(getStringValue(),beginSeprBadId,beginSeprBadId + SEPR_BAD_ID_LEN));
   	}
     int localSeprBadLengthCounter = -1;
     public boolean isSeprBadLengthModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprBadLengthCounter != sharedCounter;
         localSeprBadLengthCounter = sharedCounter; return hasModified;
     }
	protected static final int SEPR_BAD_LENGTH_LEN = 3;
	/**
	 * 	serialize this SeprBadLength
	 */
   protected void serializeSeprBadLength(char[] seprBadLength) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seprBadLength,0,getStringValue(),beginSeprBadLength,SEPR_BAD_LENGTH_LEN);
       localSeprBadLengthCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeprBadLengthConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSeprBadLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeprBadLength() {	 
   		return (substring(getStringValue(),beginSeprBadLength,beginSeprBadLength + SEPR_BAD_LENGTH_LEN));
   	}
     int localSeprTccCdCounter = -1;
     public boolean isSeprTccCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprTccCdCounter != sharedCounter;
         localSeprTccCdCounter = sharedCounter; return hasModified;
     }
	protected static final int SEPR_TCC_CD_LEN = 1;
	/**
	 * 	serialize this SeprTccCd
	 */
   protected void serializeSeprTccCd(char[] seprTccCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(seprTccCd,0,getStringValue(),beginSeprTccCd,SEPR_TCC_CD_LEN);
       localSeprTccCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSeprTccCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSeprTccCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSeprTccCd() {	 
   		return (substring(getStringValue(),beginSeprTccCd,beginSeprTccCd + SEPR_TCC_CD_LEN));
   	}
         int localSeprDataAddrCounter = -1;
         public boolean isSeprDataAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSeprDataAddrCounter != sharedCounter;
            localSeprDataAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SEPR_DATA_ADDR_LEN = 4;
  	/**
	 * serializeSeprDataAddr
	 */
	protected void serializeSeprDataAddr(int seprDataAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( seprDataAddr,SEPR_DATA_ADDR_LEN)
                  ,beginSeprDataAddr
                  ,SEPR_DATA_ADDR_LEN
                 );
            localSeprDataAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSeprDataAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSeprDataAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSeprDataAddr() {	 
			return (getInt(beginSeprDataAddr));
   	}
     int localSeprDataPtrCounter = -1;
     public boolean isSeprDataPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSeprDataPtrCounter != sharedCounter;
         localSeprDataPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int SEPR_DATA_PTR_LEN = 4;
  	/**
	 * serializeSeprDataPtr
	 */
	protected void serializeSeprDataPtr(int seprDataPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( seprDataPtr,SEPR_DATA_PTR_LEN)
                  ,beginSeprDataPtr
                  ,SEPR_DATA_PTR_LEN
                 );
            localSeprDataPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSeprDataPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSeprDataPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSeprDataPtr() {	 
			return (getInt(beginSeprDataPtr));
   	}




}
  
