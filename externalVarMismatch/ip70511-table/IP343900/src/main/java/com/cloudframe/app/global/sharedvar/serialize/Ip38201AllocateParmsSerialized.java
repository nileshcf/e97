package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip38201AllocateParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip38201AllocateParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip38201AllocateParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_38201_ALLOCATE_PARMS_LENGTH = 79;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp38201InputOutputFileInd;
            protected  int beginIp38201StorageMedia;
            protected  int beginIp38201TapeLabelType;
            protected  int beginIp38201TapeSequenceNumber;
            protected  int beginIp38201DiskVolSer;
            protected  int beginIp38201EnvironmentIndicator;
            protected  int beginIp38201BulkType;
            protected  int beginIp38201ClearingIdentifier;
            protected  int beginIp38201DsnThirdQualifier;
	
	/**
	* Constructor for Ip38201AllocateParmsSerialized
	**/
    public Ip38201AllocateParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip38201AllocateParmsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip38201AllocateParmsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip38201AllocateParmsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,56); // serialize this field at offset 56 by default 
    }
    
	/**
	* sets parent for this Ip38201AllocateParmsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 56 by default
    }    
	/**
	* initializes the field in Ip38201AllocateParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_38201_ALLOCATE_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp38201InputOutputFileInd = getStartOffset() + 0;	// set offset for serialization
  
             beginIp38201StorageMedia = getStartOffset() + 1;	// set offset for serialization
  
             beginIp38201TapeLabelType = getStartOffset() + 2;	// set offset for serialization
  
             beginIp38201TapeSequenceNumber = getStartOffset() + 5;	// set offset for serialization
  
             beginIp38201DiskVolSer = getStartOffset() + 5;	// set offset for serialization
  
  
  
             beginIp38201EnvironmentIndicator = getStartOffset() + 62;	// set offset for serialization
  
             beginIp38201BulkType = getStartOffset() + 66;	// set offset for serialization
  
             beginIp38201ClearingIdentifier = getStartOffset() + 70;	// set offset for serialization
  
             beginIp38201DsnThirdQualifier = getStartOffset() + 75;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp38201InputOutputFileIndCounter = -1;
     public boolean isIp38201InputOutputFileIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201InputOutputFileIndCounter != sharedCounter;
         localIp38201InputOutputFileIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_INPUT_OUTPUT_FILE_IND_LEN = 1;
	/**
	 * 	serialize this Ip38201InputOutputFileInd
	 */
   protected void serializeIp38201InputOutputFileInd(char[] ip38201InputOutputFileInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201InputOutputFileInd,0,getStringValue(),beginIp38201InputOutputFileInd,IP_38201_INPUT_OUTPUT_FILE_IND_LEN);
       localIp38201InputOutputFileIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201InputOutputFileIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201InputOutputFileInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201InputOutputFileInd() {	 
   		return (substring(getStringValue(),beginIp38201InputOutputFileInd,beginIp38201InputOutputFileInd + IP_38201_INPUT_OUTPUT_FILE_IND_LEN));
   	}
     int localIp38201StorageMediaCounter = -1;
     public boolean isIp38201StorageMediaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201StorageMediaCounter != sharedCounter;
         localIp38201StorageMediaCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_STORAGE_MEDIA_LEN = 1;
	/**
	 * 	serialize this Ip38201StorageMedia
	 */
   protected void serializeIp38201StorageMedia(char[] ip38201StorageMedia) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201StorageMedia,0,getStringValue(),beginIp38201StorageMedia,IP_38201_STORAGE_MEDIA_LEN);
       localIp38201StorageMediaCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201StorageMediaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp38201StorageMedia is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201StorageMedia() {	 
   		return (substring(getStringValue(),beginIp38201StorageMedia,beginIp38201StorageMedia + IP_38201_STORAGE_MEDIA_LEN));
   	}
     int localIp38201TapeLabelTypeCounter = -1;
     public boolean isIp38201TapeLabelTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201TapeLabelTypeCounter != sharedCounter;
         localIp38201TapeLabelTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_TAPE_LABEL_TYPE_LEN = 3;
	/**
	 * 	serialize this Ip38201TapeLabelType
	 */
   protected void serializeIp38201TapeLabelType(char[] ip38201TapeLabelType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201TapeLabelType,0,getStringValue(),beginIp38201TapeLabelType,IP_38201_TAPE_LABEL_TYPE_LEN);
       localIp38201TapeLabelTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201TapeLabelTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp38201TapeLabelType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201TapeLabelType() {	 
   		return (substring(getStringValue(),beginIp38201TapeLabelType,beginIp38201TapeLabelType + IP_38201_TAPE_LABEL_TYPE_LEN));
   	}
     int localIp38201TapeSequenceNumberCounter = -1;
     public boolean isIp38201TapeSequenceNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201TapeSequenceNumberCounter != sharedCounter;
         localIp38201TapeSequenceNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip38201TapeSequenceNumber
	 *	@return ip38201TapeSequenceNumber
	 */
	public char[]  getIp38201TapeSequenceNumberString() {
	     return getCharArray(beginIp38201TapeSequenceNumber,IP_38201_TAPE_SEQUENCE_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip38201TapeSequenceNumberIsNumeric() {
	    return isNumeric(beginIp38201TapeSequenceNumber
	                    ,beginIp38201TapeSequenceNumber + IP_38201_TAPE_SEQUENCE_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_38201_TAPE_SEQUENCE_NUMBER_LEN = 6;
  	/**
	 * serializeIp38201TapeSequenceNumber
	 */
	protected void serializeIp38201TapeSequenceNumber(long ip38201TapeSequenceNumber) {
		 putNumber(beginIp38201TapeSequenceNumber,ip38201TapeSequenceNumber,IP_38201_TAPE_SEQUENCE_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp38201TapeSequenceNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp38201TapeSequenceNumber
	 */
   	protected  long serializeIp38201TapeSequenceNumber(char[] value) {
	    long  ip38201TapeSequenceNumber;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip38201TapeSequenceNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginIp38201TapeSequenceNumber
		       ,6
		      );
		 localIp38201TapeSequenceNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip38201TapeSequenceNumber;
    }

   protected long checkIp38201TapeSequenceNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp38201TapeSequenceNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp38201TapeSequenceNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp38201TapeSequenceNumber
			                 ,IP_38201_TAPE_SEQUENCE_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip38201TapeSequenceNumber", beginIp38201TapeSequenceNumber,IP_38201_TAPE_SEQUENCE_NUMBER_LEN);
    }
   	}
     int localIp38201DiskVolSerCounter = -1;
     public boolean isIp38201DiskVolSerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201DiskVolSerCounter != sharedCounter;
         localIp38201DiskVolSerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_DISK_VOL_SER_LEN = 6;
	/**
	 * 	serialize this Ip38201DiskVolSer
	 */
   protected void serializeIp38201DiskVolSer(char[] ip38201DiskVolSer) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201DiskVolSer,0,getStringValue(),beginIp38201DiskVolSer,IP_38201_DISK_VOL_SER_LEN);
       localIp38201DiskVolSerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201DiskVolSerConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshIp38201DiskVolSer is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201DiskVolSer() {	 
   		return (substring(getStringValue(),beginIp38201DiskVolSer,beginIp38201DiskVolSer + IP_38201_DISK_VOL_SER_LEN));
   	}
     int localIp38201EnvironmentIndicatorCounter = -1;
     public boolean isIp38201EnvironmentIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201EnvironmentIndicatorCounter != sharedCounter;
         localIp38201EnvironmentIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_ENVIRONMENT_INDICATOR_LEN = 4;
	/**
	 * 	serialize this Ip38201EnvironmentIndicator
	 */
   protected void serializeIp38201EnvironmentIndicator(char[] ip38201EnvironmentIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201EnvironmentIndicator,0,getStringValue(),beginIp38201EnvironmentIndicator,IP_38201_ENVIRONMENT_INDICATOR_LEN);
       localIp38201EnvironmentIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201EnvironmentIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp38201EnvironmentIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201EnvironmentIndicator() {	 
   		return (substring(getStringValue(),beginIp38201EnvironmentIndicator,beginIp38201EnvironmentIndicator + IP_38201_ENVIRONMENT_INDICATOR_LEN));
   	}
     int localIp38201BulkTypeCounter = -1;
     public boolean isIp38201BulkTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201BulkTypeCounter != sharedCounter;
         localIp38201BulkTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_BULK_TYPE_LEN = 4;
	/**
	 * 	serialize this Ip38201BulkType
	 */
   protected void serializeIp38201BulkType(char[] ip38201BulkType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201BulkType,0,getStringValue(),beginIp38201BulkType,IP_38201_BULK_TYPE_LEN);
       localIp38201BulkTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201BulkTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp38201BulkType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201BulkType() {	 
   		return (substring(getStringValue(),beginIp38201BulkType,beginIp38201BulkType + IP_38201_BULK_TYPE_LEN));
   	}
     int localIp38201ClearingIdentifierCounter = -1;
     public boolean isIp38201ClearingIdentifierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201ClearingIdentifierCounter != sharedCounter;
         localIp38201ClearingIdentifierCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_CLEARING_IDENTIFIER_LEN = 5;
	/**
	 * 	serialize this Ip38201ClearingIdentifier
	 */
   protected void serializeIp38201ClearingIdentifier(char[] ip38201ClearingIdentifier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201ClearingIdentifier,0,getStringValue(),beginIp38201ClearingIdentifier,IP_38201_CLEARING_IDENTIFIER_LEN);
       localIp38201ClearingIdentifierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201ClearingIdentifierConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshIp38201ClearingIdentifier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201ClearingIdentifier() {	 
   		return (substring(getStringValue(),beginIp38201ClearingIdentifier,beginIp38201ClearingIdentifier + IP_38201_CLEARING_IDENTIFIER_LEN));
   	}
     int localIp38201DsnThirdQualifierCounter = -1;
     public boolean isIp38201DsnThirdQualifierModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp38201DsnThirdQualifierCounter != sharedCounter;
         localIp38201DsnThirdQualifierCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_38201_DSN_THIRD_QUALIFIER_LEN = 4;
	/**
	 * 	serialize this Ip38201DsnThirdQualifier
	 */
   protected void serializeIp38201DsnThirdQualifier(char[] ip38201DsnThirdQualifier) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip38201DsnThirdQualifier,0,getStringValue(),beginIp38201DsnThirdQualifier,IP_38201_DSN_THIRD_QUALIFIER_LEN);
       localIp38201DsnThirdQualifierCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp38201DsnThirdQualifierConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp38201DsnThirdQualifier is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp38201DsnThirdQualifier() {	 
   		return (substring(getStringValue(),beginIp38201DsnThirdQualifier,beginIp38201DsnThirdQualifier + IP_38201_DSN_THIRD_QUALIFIER_LEN));
   	}




}
  
