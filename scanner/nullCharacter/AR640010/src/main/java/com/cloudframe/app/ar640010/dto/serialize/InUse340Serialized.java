package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class InUse340Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InUse340Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InUse340Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IN_USE_340_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCopyAttempts340;
            protected  int beginDeleteAttempts340;
            protected  int beginCopyAttemptsDft340;
            protected  int beginCopyIntervalDft340;
            protected  int beginDeleteAttemptsDft340;
            protected  int beginDeleteIntervalDft340;
	
	/**
	* Constructor for InUse340Serialized
	**/
    public InUse340Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InUse340Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IN_USE_340_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCopyAttempts340 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginDeleteAttempts340 = getStartOffset() + 10;	// set offset for serialization
  
  
             beginCopyAttemptsDft340 = getStartOffset() + 20;	// set offset for serialization
  
             beginCopyIntervalDft340 = getStartOffset() + 22;	// set offset for serialization
  
             beginDeleteAttemptsDft340 = getStartOffset() + 30;	// set offset for serialization
  
             beginDeleteIntervalDft340 = getStartOffset() + 32;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localCopyAttempts340Counter = -1;
         public boolean isCopyAttempts340Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCopyAttempts340Counter != sharedCounter;
            localCopyAttempts340Counter = sharedCounter; return hasModified; 
         }
   protected static final int COPY_ATTEMPTS_340_LEN = 2;
  	/**
	 * serializeCopyAttempts340
	 */
	protected void serializeCopyAttempts340(short copyAttempts340) {
           replaceValue( //  save the value as string
                   getBinaryString( copyAttempts340,COPY_ATTEMPTS_340_LEN)
                  ,beginCopyAttempts340
                  ,COPY_ATTEMPTS_340_LEN
                 );
            localCopyAttempts340Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCopyAttempts340MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCopyAttempts340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCopyAttempts340() {	 
			return (getShort(beginCopyAttempts340));
   	}
         int localDeleteAttempts340Counter = -1;
         public boolean isDeleteAttempts340Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDeleteAttempts340Counter != sharedCounter;
            localDeleteAttempts340Counter = sharedCounter; return hasModified; 
         }
   protected static final int DELETE_ATTEMPTS_340_LEN = 2;
  	/**
	 * serializeDeleteAttempts340
	 */
	protected void serializeDeleteAttempts340(short deleteAttempts340) {
           replaceValue( //  save the value as string
                   getBinaryString( deleteAttempts340,DELETE_ATTEMPTS_340_LEN)
                  ,beginDeleteAttempts340
                  ,DELETE_ATTEMPTS_340_LEN
                 );
            localDeleteAttempts340Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDeleteAttempts340MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDeleteAttempts340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDeleteAttempts340() {	 
			return (getShort(beginDeleteAttempts340));
   	}
         int localCopyAttemptsDft340Counter = -1;
         public boolean isCopyAttemptsDft340Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localCopyAttemptsDft340Counter != sharedCounter;
            localCopyAttemptsDft340Counter = sharedCounter; return hasModified; 
         }
   protected static final int COPY_ATTEMPTS_DFT_340_LEN = 2;
  	/**
	 * serializeCopyAttemptsDft340
	 */
	protected void serializeCopyAttemptsDft340(short copyAttemptsDft340) {
           replaceValue( //  save the value as string
                   getBinaryString( copyAttemptsDft340,COPY_ATTEMPTS_DFT_340_LEN)
                  ,beginCopyAttemptsDft340
                  ,COPY_ATTEMPTS_DFT_340_LEN
                 );
            localCopyAttemptsDft340Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkCopyAttemptsDft340MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshCopyAttemptsDft340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshCopyAttemptsDft340() {	 
			return (getShort(beginCopyAttemptsDft340));
   	}
     int localCopyIntervalDft340Counter = -1;
     public boolean isCopyIntervalDft340Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopyIntervalDft340Counter != sharedCounter;
         localCopyIntervalDft340Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of copyIntervalDft340
	 *	@return copyIntervalDft340
	 */
	public char[]  getCopyIntervalDft340String() {
	     return getCharArray(beginCopyIntervalDft340,COPY_INTERVAL_DFT_340_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean copyIntervalDft340IsNumeric() {
	    return isNumeric(beginCopyIntervalDft340
	                    ,beginCopyIntervalDft340 + COPY_INTERVAL_DFT_340_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int COPY_INTERVAL_DFT_340_LEN = 8;
  	/**
	 * serializeCopyIntervalDft340
	 */
	protected void serializeCopyIntervalDft340(long copyIntervalDft340) {
		 putNumber(beginCopyIntervalDft340,copyIntervalDft340,COPY_INTERVAL_DFT_340_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCopyIntervalDft340Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCopyIntervalDft340
	 */
   	protected  long serializeCopyIntervalDft340(char[] value) {
	    long  copyIntervalDft340;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    copyIntervalDft340 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginCopyIntervalDft340
		       ,8
		      );
		 localCopyIntervalDft340Counter = shareString.getSerializedField().getModifiedCounter();
		return  copyIntervalDft340;
    }

   protected long checkCopyIntervalDft340MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCopyIntervalDft340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshCopyIntervalDft340() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginCopyIntervalDft340
			                 ,COPY_INTERVAL_DFT_340_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("copyIntervalDft340", beginCopyIntervalDft340,COPY_INTERVAL_DFT_340_LEN);
    }
   	}
         int localDeleteAttemptsDft340Counter = -1;
         public boolean isDeleteAttemptsDft340Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDeleteAttemptsDft340Counter != sharedCounter;
            localDeleteAttemptsDft340Counter = sharedCounter; return hasModified; 
         }
   protected static final int DELETE_ATTEMPTS_DFT_340_LEN = 2;
  	/**
	 * serializeDeleteAttemptsDft340
	 */
	protected void serializeDeleteAttemptsDft340(short deleteAttemptsDft340) {
           replaceValue( //  save the value as string
                   getBinaryString( deleteAttemptsDft340,DELETE_ATTEMPTS_DFT_340_LEN)
                  ,beginDeleteAttemptsDft340
                  ,DELETE_ATTEMPTS_DFT_340_LEN
                 );
            localDeleteAttemptsDft340Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkDeleteAttemptsDft340MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshDeleteAttemptsDft340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshDeleteAttemptsDft340() {	 
			return (getShort(beginDeleteAttemptsDft340));
   	}
     int localDeleteIntervalDft340Counter = -1;
     public boolean isDeleteIntervalDft340Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDeleteIntervalDft340Counter != sharedCounter;
         localDeleteIntervalDft340Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of deleteIntervalDft340
	 *	@return deleteIntervalDft340
	 */
	public char[]  getDeleteIntervalDft340String() {
	     return getCharArray(beginDeleteIntervalDft340,DELETE_INTERVAL_DFT_340_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean deleteIntervalDft340IsNumeric() {
	    return isNumeric(beginDeleteIntervalDft340
	                    ,beginDeleteIntervalDft340 + DELETE_INTERVAL_DFT_340_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DELETE_INTERVAL_DFT_340_LEN = 8;
  	/**
	 * serializeDeleteIntervalDft340
	 */
	protected void serializeDeleteIntervalDft340(long deleteIntervalDft340) {
		 putNumber(beginDeleteIntervalDft340,deleteIntervalDft340,DELETE_INTERVAL_DFT_340_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDeleteIntervalDft340Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDeleteIntervalDft340
	 */
   	protected  long serializeDeleteIntervalDft340(char[] value) {
	    long  deleteIntervalDft340;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    deleteIntervalDft340 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginDeleteIntervalDft340
		       ,8
		      );
		 localDeleteIntervalDft340Counter = shareString.getSerializedField().getModifiedCounter();
		return  deleteIntervalDft340;
    }

   protected long checkDeleteIntervalDft340MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDeleteIntervalDft340 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshDeleteIntervalDft340() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginDeleteIntervalDft340
			                 ,DELETE_INTERVAL_DFT_340_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("deleteIntervalDft340", beginDeleteIntervalDft340,DELETE_INTERVAL_DFT_340_LEN);
    }
   	}




}
  
