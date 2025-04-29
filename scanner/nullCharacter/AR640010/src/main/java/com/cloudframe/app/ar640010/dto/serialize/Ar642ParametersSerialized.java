package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar642ParametersSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar642ParametersSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar642ParametersSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_642_PARAMETERS_LENGTH = 144;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr642ProgramId;
            protected  int beginAr642DatasetId;
            protected  int beginAr642ReturnCode;
            protected  int beginAr642AllocUnit;
            protected  int beginAr642RecordFormat;
            protected  int beginAr642UnitsUsed;
            protected  int beginAr642RecordLength;
            protected  int beginAr642BlockSize;
            protected  int beginAr642ReturnDsn;
            protected  int beginAr642PrimarySpace;
            protected  int beginAr642SecondarySpace;
	
	/**
	* Constructor for Ar642ParametersSerialized
	**/
    public Ar642ParametersSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ar642ParametersSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_642_PARAMETERS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr642ProgramId = getStartOffset() + 0;	// set offset for serialization
  
             beginAr642DatasetId = getStartOffset() + 8;	// set offset for serialization
  
             beginAr642ReturnCode = getStartOffset() + 62;	// set offset for serialization
  
             beginAr642AllocUnit = getStartOffset() + 64;	// set offset for serialization
  
             beginAr642RecordFormat = getStartOffset() + 65;	// set offset for serialization
  
             beginAr642UnitsUsed = getStartOffset() + 68;	// set offset for serialization
  
             beginAr642RecordLength = getStartOffset() + 72;	// set offset for serialization
  
             beginAr642BlockSize = getStartOffset() + 76;	// set offset for serialization
  
             beginAr642ReturnDsn = getStartOffset() + 80;	// set offset for serialization
  
             beginAr642PrimarySpace = getStartOffset() + 124;	// set offset for serialization
  
             beginAr642SecondarySpace = getStartOffset() + 128;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localAr642ProgramIdCounter = -1;
     public boolean isAr642ProgramIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642ProgramIdCounter != sharedCounter;
         localAr642ProgramIdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_642_PROGRAM_ID_LEN = 8;
	/**
	 * 	serialize this Ar642ProgramId
	 */
   protected void serializeAr642ProgramId(char[] ar642ProgramId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar642ProgramId,0,getStringValue(),beginAr642ProgramId,AR_642_PROGRAM_ID_LEN);
       localAr642ProgramIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr642ProgramIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshAr642ProgramId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr642ProgramId() {	 
   		return (substring(getStringValue(),beginAr642ProgramId,beginAr642ProgramId + AR_642_PROGRAM_ID_LEN));
   	}
     int localAr642DatasetIdCounter = -1;
     public boolean isAr642DatasetIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642DatasetIdCounter != sharedCounter;
         localAr642DatasetIdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_642_DATASET_ID_LEN = 54;
	/**
	 * 	serialize this Ar642DatasetId
	 */
   protected void serializeAr642DatasetId(char[] ar642DatasetId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar642DatasetId,0,getStringValue(),beginAr642DatasetId,AR_642_DATASET_ID_LEN);
       localAr642DatasetIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr642DatasetIdConstraints(char[] value) {
   			return super.checkConstraints(value , 54 ,false, false);
   }
    /**
	 *	refreshAr642DatasetId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr642DatasetId() {	 
   		return (substring(getStringValue(),beginAr642DatasetId,beginAr642DatasetId + AR_642_DATASET_ID_LEN));
   	}
         int localAr642ReturnCodeCounter = -1;
         public boolean isAr642ReturnCodeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642ReturnCodeCounter != sharedCounter;
            localAr642ReturnCodeCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_RETURN_CODE_LEN = 2;
  	/**
	 * serializeAr642ReturnCode
	 */
	protected void serializeAr642ReturnCode(short ar642ReturnCode) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642ReturnCode,AR_642_RETURN_CODE_LEN)
                  ,beginAr642ReturnCode
                  ,AR_642_RETURN_CODE_LEN
                 );
            localAr642ReturnCodeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAr642ReturnCodeMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAr642ReturnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAr642ReturnCode() {	 
			return (getShort(beginAr642ReturnCode));
   	}
     int localAr642AllocUnitCounter = -1;
     public boolean isAr642AllocUnitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642AllocUnitCounter != sharedCounter;
         localAr642AllocUnitCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_642_ALLOC_UNIT_LEN = 1;
	/**
	 * 	serialize this Ar642AllocUnit
	 */
   protected void serializeAr642AllocUnit(char[] ar642AllocUnit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar642AllocUnit,0,getStringValue(),beginAr642AllocUnit,AR_642_ALLOC_UNIT_LEN);
       localAr642AllocUnitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr642AllocUnitConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshAr642AllocUnit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr642AllocUnit() {	 
   		return (substring(getStringValue(),beginAr642AllocUnit,beginAr642AllocUnit + AR_642_ALLOC_UNIT_LEN));
   	}
     int localAr642RecordFormatCounter = -1;
     public boolean isAr642RecordFormatModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642RecordFormatCounter != sharedCounter;
         localAr642RecordFormatCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_642_RECORD_FORMAT_LEN = 3;
	/**
	 * 	serialize this Ar642RecordFormat
	 */
   protected void serializeAr642RecordFormat(char[] ar642RecordFormat) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar642RecordFormat,0,getStringValue(),beginAr642RecordFormat,AR_642_RECORD_FORMAT_LEN);
       localAr642RecordFormatCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr642RecordFormatConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAr642RecordFormat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr642RecordFormat() {	 
   		return (substring(getStringValue(),beginAr642RecordFormat,beginAr642RecordFormat + AR_642_RECORD_FORMAT_LEN));
   	}
         int localAr642UnitsUsedCounter = -1;
         public boolean isAr642UnitsUsedModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642UnitsUsedCounter != sharedCounter;
            localAr642UnitsUsedCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_UNITS_USED_LEN = 4;
  	/**
	 * serializeAr642UnitsUsed
	 */
	protected void serializeAr642UnitsUsed(long ar642UnitsUsed) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642UnitsUsed,AR_642_UNITS_USED_LEN)
                  ,beginAr642UnitsUsed
                  ,AR_642_UNITS_USED_LEN
                 );
            localAr642UnitsUsedCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkAr642UnitsUsedMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642UnitsUsed is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642UnitsUsed() {	 
			return (getUnsignedInt(beginAr642UnitsUsed));
   	}
         int localAr642RecordLengthCounter = -1;
         public boolean isAr642RecordLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642RecordLengthCounter != sharedCounter;
            localAr642RecordLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_RECORD_LENGTH_LEN = 4;
  	/**
	 * serializeAr642RecordLength
	 */
	protected void serializeAr642RecordLength(long ar642RecordLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642RecordLength,AR_642_RECORD_LENGTH_LEN)
                  ,beginAr642RecordLength
                  ,AR_642_RECORD_LENGTH_LEN
                 );
            localAr642RecordLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkAr642RecordLengthMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642RecordLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642RecordLength() {	 
			return (getUnsignedInt(beginAr642RecordLength));
   	}
         int localAr642BlockSizeCounter = -1;
         public boolean isAr642BlockSizeModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642BlockSizeCounter != sharedCounter;
            localAr642BlockSizeCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_BLOCK_SIZE_LEN = 4;
  	/**
	 * serializeAr642BlockSize
	 */
	protected void serializeAr642BlockSize(long ar642BlockSize) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642BlockSize,AR_642_BLOCK_SIZE_LEN)
                  ,beginAr642BlockSize
                  ,AR_642_BLOCK_SIZE_LEN
                 );
            localAr642BlockSizeCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkAr642BlockSizeMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642BlockSize is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642BlockSize() {	 
			return (getUnsignedInt(beginAr642BlockSize));
   	}
     int localAr642ReturnDsnCounter = -1;
     public boolean isAr642ReturnDsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr642ReturnDsnCounter != sharedCounter;
         localAr642ReturnDsnCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_642_RETURN_DSN_LEN = 44;
	/**
	 * 	serialize this Ar642ReturnDsn
	 */
   protected void serializeAr642ReturnDsn(char[] ar642ReturnDsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar642ReturnDsn,0,getStringValue(),beginAr642ReturnDsn,AR_642_RETURN_DSN_LEN);
       localAr642ReturnDsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr642ReturnDsnConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshAr642ReturnDsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr642ReturnDsn() {	 
   		return (substring(getStringValue(),beginAr642ReturnDsn,beginAr642ReturnDsn + AR_642_RETURN_DSN_LEN));
   	}
         int localAr642PrimarySpaceCounter = -1;
         public boolean isAr642PrimarySpaceModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642PrimarySpaceCounter != sharedCounter;
            localAr642PrimarySpaceCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_PRIMARY_SPACE_LEN = 4;
  	/**
	 * serializeAr642PrimarySpace
	 */
	protected void serializeAr642PrimarySpace(long ar642PrimarySpace) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642PrimarySpace,AR_642_PRIMARY_SPACE_LEN)
                  ,beginAr642PrimarySpace
                  ,AR_642_PRIMARY_SPACE_LEN
                 );
            localAr642PrimarySpaceCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkAr642PrimarySpaceMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642PrimarySpace is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642PrimarySpace() {	 
			return (getUnsignedInt(beginAr642PrimarySpace));
   	}
         int localAr642SecondarySpaceCounter = -1;
         public boolean isAr642SecondarySpaceModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAr642SecondarySpaceCounter != sharedCounter;
            localAr642SecondarySpaceCounter = sharedCounter; return hasModified; 
         }
   protected static final int AR_642_SECONDARY_SPACE_LEN = 4;
  	/**
	 * serializeAr642SecondarySpace
	 */
	protected void serializeAr642SecondarySpace(long ar642SecondarySpace) {
           replaceValue( //  save the value as string
                   getBinaryString( ar642SecondarySpace,AR_642_SECONDARY_SPACE_LEN)
                  ,beginAr642SecondarySpace
                  ,AR_642_SECONDARY_SPACE_LEN
                 );
            localAr642SecondarySpaceCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected long checkAr642SecondarySpaceMaxLimit(long number) {
        return checkMaxLimit(number, false/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshAr642SecondarySpace is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAr642SecondarySpace() {	 
			return (getUnsignedInt(beginAr642SecondarySpace));
   	}




}
  
