package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Si583ParserAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:38. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Si583ParserAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Si583ParserAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SI_583_PARSER_AREA_LENGTH = 34156;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSi583DataAddr;
            protected  int beginSi583DataPtr;
            protected  int beginSi583FormatAddr;
            protected  int beginSi583FormatPtr;
            protected  int beginSi583ReturnCode;
            protected  int beginSi583DataElementInError;
            protected  int beginSi583ReturnMessage;
            protected  int beginSi583Mti1;
            protected  int beginSi583Mti2;
            protected  int beginSi583DataLength;
            protected  int beginSi583FormatLength;
            protected  int beginSi583ExtendData;
	
	/**
	* Constructor for Si583ParserAreaSerialized
	**/
    public Si583ParserAreaSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Si583ParserAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SI_583_PARSER_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSi583DataAddr = getStartOffset() + 0;	// set offset for serialization
  
             beginSi583DataPtr = getStartOffset() + 0;	// set offset for serialization
  
             beginSi583FormatAddr = getStartOffset() + 4;	// set offset for serialization
  
             beginSi583FormatPtr = getStartOffset() + 4;	// set offset for serialization
  
             beginSi583ReturnCode = getStartOffset() + 8;	// set offset for serialization
  
             beginSi583DataElementInError = getStartOffset() + 10;	// set offset for serialization
  
             beginSi583ReturnMessage = getStartOffset() + 12;	// set offset for serialization
  
             beginSi583Mti1 = getStartOffset() + 92;	// set offset for serialization
  
             beginSi583Mti2 = getStartOffset() + 96;	// set offset for serialization
  
             beginSi583DataLength = getStartOffset() + 100;	// set offset for serialization
  
             beginSi583FormatLength = getStartOffset() + 104;	// set offset for serialization
  
             beginSi583ExtendData = getStartOffset() + 108;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
         int localSi583DataAddrCounter = -1;
         public boolean isSi583DataAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583DataAddrCounter != sharedCounter;
            localSi583DataAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_DATA_ADDR_LEN = 4;
  	/**
	 * serializeSi583DataAddr
	 */
	protected void serializeSi583DataAddr(int si583DataAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DataAddr,SI_583_DATA_ADDR_LEN)
                  ,beginSi583DataAddr
                  ,SI_583_DATA_ADDR_LEN
                 );
            localSi583DataAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSi583DataAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSi583DataAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSi583DataAddr() {	 
			return (getInt(beginSi583DataAddr));
   	}
     int localSi583DataPtrCounter = -1;
     public boolean isSi583DataPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583DataPtrCounter != sharedCounter;
         localSi583DataPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int SI_583_DATA_PTR_LEN = 4;
  	/**
	 * serializeSi583DataPtr
	 */
	protected void serializeSi583DataPtr(int si583DataPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DataPtr,SI_583_DATA_PTR_LEN)
                  ,beginSi583DataPtr
                  ,SI_583_DATA_PTR_LEN
                 );
            localSi583DataPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSi583DataPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSi583DataPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSi583DataPtr() {	 
			return (getInt(beginSi583DataPtr));
   	}
         int localSi583FormatAddrCounter = -1;
         public boolean isSi583FormatAddrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583FormatAddrCounter != sharedCounter;
            localSi583FormatAddrCounter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_FORMAT_ADDR_LEN = 4;
  	/**
	 * serializeSi583FormatAddr
	 */
	protected void serializeSi583FormatAddr(int si583FormatAddr) {
           replaceValue( //  save the value as string
                   getBinaryString( si583FormatAddr,SI_583_FORMAT_ADDR_LEN)
                  ,beginSi583FormatAddr
                  ,SI_583_FORMAT_ADDR_LEN
                 );
            localSi583FormatAddrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSi583FormatAddrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSi583FormatAddr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSi583FormatAddr() {	 
			return (getInt(beginSi583FormatAddr));
   	}
     int localSi583FormatPtrCounter = -1;
     public boolean isSi583FormatPtrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583FormatPtrCounter != sharedCounter;
         localSi583FormatPtrCounter = sharedCounter; return hasModified; 
     }
   protected static final int SI_583_FORMAT_PTR_LEN = 4;
  	/**
	 * serializeSi583FormatPtr
	 */
	protected void serializeSi583FormatPtr(int si583FormatPtr) {
           replaceValue( //  save the value as string
                   getBinaryString( si583FormatPtr,SI_583_FORMAT_PTR_LEN)
                  ,beginSi583FormatPtr
                  ,SI_583_FORMAT_PTR_LEN
                 );
            localSi583FormatPtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSi583FormatPtrMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSi583FormatPtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSi583FormatPtr() {	 
			return (getInt(beginSi583FormatPtr));
   	}
         int localSi583ReturnCodeCounter = -1;
         public boolean isSi583ReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583ReturnCodeCounter != sharedCounter;
            localSi583ReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_RETURN_CODE_LEN = 2;
  	/**
	 * serializeSi583ReturnCode
	 */
	protected void serializeSi583ReturnCode(short si583ReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( si583ReturnCode,SI_583_RETURN_CODE_LEN)
                  ,beginSi583ReturnCode
                  ,SI_583_RETURN_CODE_LEN
                 );
            localSi583ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSi583ReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSi583ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSi583ReturnCode() {	 
			return (getShort(beginSi583ReturnCode));
   	}
         int localSi583DataElementInErrorCounter = -1;
         public boolean isSi583DataElementInErrorModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583DataElementInErrorCounter != sharedCounter;
            localSi583DataElementInErrorCounter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_DATA_ELEMENT_IN_ERROR_LEN = 2;
  	/**
	 * serializeSi583DataElementInError
	 */
	protected void serializeSi583DataElementInError(short si583DataElementInError) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DataElementInError,SI_583_DATA_ELEMENT_IN_ERROR_LEN)
                  ,beginSi583DataElementInError
                  ,SI_583_DATA_ELEMENT_IN_ERROR_LEN
                 );
            localSi583DataElementInErrorCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSi583DataElementInErrorMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSi583DataElementInError is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSi583DataElementInError() {	 
			return (getShort(beginSi583DataElementInError));
   	}
     int localSi583ReturnMessageCounter = -1;
     public boolean isSi583ReturnMessageModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583ReturnMessageCounter != sharedCounter;
         localSi583ReturnMessageCounter = sharedCounter; return hasModified;
     }
	protected static final int SI_583_RETURN_MESSAGE_LEN = 80;
	/**
	 * 	serialize this Si583ReturnMessage
	 */
   protected void serializeSi583ReturnMessage(char[] si583ReturnMessage) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(si583ReturnMessage,0,getStringValue(),beginSi583ReturnMessage,SI_583_RETURN_MESSAGE_LEN);
       localSi583ReturnMessageCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSi583ReturnMessageConstraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
    /**
	 *	refreshSi583ReturnMessage is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSi583ReturnMessage() {	 
   		return (substring(getStringValue(),beginSi583ReturnMessage,beginSi583ReturnMessage + SI_583_RETURN_MESSAGE_LEN));
   	}
     int localSi583Mti1Counter = -1;
     public boolean isSi583Mti1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583Mti1Counter != sharedCounter;
         localSi583Mti1Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_583_MTI_1_LEN = 4;
	/**
	 * 	serialize this Si583Mti1
	 */
   protected void serializeSi583Mti1(char[] si583Mti1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(si583Mti1,0,getStringValue(),beginSi583Mti1,SI_583_MTI_1_LEN);
       localSi583Mti1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSi583Mti1Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSi583Mti1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSi583Mti1() {	 
   		return (substring(getStringValue(),beginSi583Mti1,beginSi583Mti1 + SI_583_MTI_1_LEN));
   	}
     int localSi583Mti2Counter = -1;
     public boolean isSi583Mti2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583Mti2Counter != sharedCounter;
         localSi583Mti2Counter = sharedCounter; return hasModified;
     }
	protected static final int SI_583_MTI_2_LEN = 4;
	/**
	 * 	serialize this Si583Mti2
	 */
   protected void serializeSi583Mti2(char[] si583Mti2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(si583Mti2,0,getStringValue(),beginSi583Mti2,SI_583_MTI_2_LEN);
       localSi583Mti2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSi583Mti2Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshSi583Mti2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSi583Mti2() {	 
   		return (substring(getStringValue(),beginSi583Mti2,beginSi583Mti2 + SI_583_MTI_2_LEN));
   	}
         int localSi583DataLengthCounter = -1;
         public boolean isSi583DataLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583DataLengthCounter != sharedCounter;
            localSi583DataLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_DATA_LENGTH_LEN = 4;
  	/**
	 * serializeSi583DataLength
	 */
	protected void serializeSi583DataLength(int si583DataLength) {
           replaceValue( //  save the value as string
                   getBinaryString( si583DataLength,SI_583_DATA_LENGTH_LEN)
                  ,beginSi583DataLength
                  ,SI_583_DATA_LENGTH_LEN
                 );
            localSi583DataLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSi583DataLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSi583DataLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSi583DataLength() {	 
			return (getInt(beginSi583DataLength));
   	}
         int localSi583FormatLengthCounter = -1;
         public boolean isSi583FormatLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSi583FormatLengthCounter != sharedCounter;
            localSi583FormatLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int SI_583_FORMAT_LENGTH_LEN = 4;
  	/**
	 * serializeSi583FormatLength
	 */
	protected void serializeSi583FormatLength(int si583FormatLength) {
           replaceValue( //  save the value as string
                   getBinaryString( si583FormatLength,SI_583_FORMAT_LENGTH_LEN)
                  ,beginSi583FormatLength
                  ,SI_583_FORMAT_LENGTH_LEN
                 );
            localSi583FormatLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkSi583FormatLengthMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshSi583FormatLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSi583FormatLength() {	 
			return (getInt(beginSi583FormatLength));
   	}
     int localSi583ExtendDataCounter = -1;
     public boolean isSi583ExtendDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSi583ExtendDataCounter != sharedCounter;
         localSi583ExtendDataCounter = sharedCounter; return hasModified;
     }
	protected static final int SI_583_EXTEND_DATA_LEN = 32768;
	/**
	 * 	serialize this Si583ExtendData
	 */
   protected void serializeSi583ExtendData(char[] si583ExtendData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(si583ExtendData,0,getStringValue(),beginSi583ExtendData,SI_583_EXTEND_DATA_LEN);
       localSi583ExtendDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSi583ExtendDataConstraints(char[] value) {
   			return super.checkConstraints(value , 32768 ,false, false);
   }
    /**
	 *	refreshSi583ExtendData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSi583ExtendData() {	 
   		return (substring(getStringValue(),beginSi583ExtendData,beginSi583ExtendData + SI_583_EXTEND_DATA_LEN));
   	}




}
  
