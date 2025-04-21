package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4V4BaseInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ov4V4BaseInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4V4BaseInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_V_4_BASE_INFO_LENGTH = 58;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4ClerkId;
            protected  int beginOv4AcctCd;
            protected  int beginOv4SrcReceiptCd;
            protected  int beginOv4SrcErrorCd;
            protected  int beginOv4TypeCd;
            protected  int beginOv4GlAccountNumber;
            protected  int beginOv4CurrentDate;
	
	/**
	* Constructor for Ov4V4BaseInfoSerialized
	**/
    public Ov4V4BaseInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4V4BaseInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4V4BaseInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4V4BaseInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Ov4V4BaseInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Ov4V4BaseInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_V_4_BASE_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4ClerkId = getStartOffset() + 0;	// set offset for serialization
  
             beginOv4AcctCd = getStartOffset() + 8;	// set offset for serialization
  
             beginOv4SrcReceiptCd = getStartOffset() + 10;	// set offset for serialization
  
             beginOv4SrcErrorCd = getStartOffset() + 16;	// set offset for serialization
  
             beginOv4TypeCd = getStartOffset() + 22;	// set offset for serialization
  
             beginOv4GlAccountNumber = getStartOffset() + 24;	// set offset for serialization
  
             beginOv4CurrentDate = getStartOffset() + 42;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localOv4ClerkIdCounter = -1;
     public boolean isOv4ClerkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4ClerkIdCounter != sharedCounter;
         localOv4ClerkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_CLERK_ID_LEN = 8;
	/**
	 * 	serialize this Ov4ClerkId
	 */
   protected void serializeOv4ClerkId(char[] ov4ClerkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4ClerkId,0,getStringValue(),beginOv4ClerkId,OV_4_CLERK_ID_LEN);
       localOv4ClerkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4ClerkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshOv4ClerkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4ClerkId() {	 
   		return (substring(getStringValue(),beginOv4ClerkId,beginOv4ClerkId + OV_4_CLERK_ID_LEN));
   	}
     int localOv4AcctCdCounter = -1;
     public boolean isOv4AcctCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AcctCdCounter != sharedCounter;
         localOv4AcctCdCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_ACCT_CD_LEN = 2;
	/**
	 * 	serialize this Ov4AcctCd
	 */
   protected void serializeOv4AcctCd(char[] ov4AcctCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4AcctCd,0,getStringValue(),beginOv4AcctCd,OV_4_ACCT_CD_LEN);
       localOv4AcctCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4AcctCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshOv4AcctCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4AcctCd() {	 
   		return (substring(getStringValue(),beginOv4AcctCd,beginOv4AcctCd + OV_4_ACCT_CD_LEN));
   	}
     int localOv4SrcReceiptCdCounter = -1;
     public boolean isOv4SrcReceiptCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4SrcReceiptCdCounter != sharedCounter;
         localOv4SrcReceiptCdCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_SRC_RECEIPT_CD_LEN = 6;
	/**
	 * 	serialize this Ov4SrcReceiptCd
	 */
   protected void serializeOv4SrcReceiptCd(char[] ov4SrcReceiptCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4SrcReceiptCd,0,getStringValue(),beginOv4SrcReceiptCd,OV_4_SRC_RECEIPT_CD_LEN);
       localOv4SrcReceiptCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4SrcReceiptCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshOv4SrcReceiptCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4SrcReceiptCd() {	 
   		return (substring(getStringValue(),beginOv4SrcReceiptCd,beginOv4SrcReceiptCd + OV_4_SRC_RECEIPT_CD_LEN));
   	}
     int localOv4SrcErrorCdCounter = -1;
     public boolean isOv4SrcErrorCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4SrcErrorCdCounter != sharedCounter;
         localOv4SrcErrorCdCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_SRC_ERROR_CD_LEN = 6;
	/**
	 * 	serialize this Ov4SrcErrorCd
	 */
   protected void serializeOv4SrcErrorCd(char[] ov4SrcErrorCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4SrcErrorCd,0,getStringValue(),beginOv4SrcErrorCd,OV_4_SRC_ERROR_CD_LEN);
       localOv4SrcErrorCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4SrcErrorCdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshOv4SrcErrorCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4SrcErrorCd() {	 
   		return (substring(getStringValue(),beginOv4SrcErrorCd,beginOv4SrcErrorCd + OV_4_SRC_ERROR_CD_LEN));
   	}
     int localOv4TypeCdCounter = -1;
     public boolean isOv4TypeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4TypeCdCounter != sharedCounter;
         localOv4TypeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_TYPE_CD_LEN = 2;
	/**
	 * 	serialize this Ov4TypeCd
	 */
   protected void serializeOv4TypeCd(char[] ov4TypeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4TypeCd,0,getStringValue(),beginOv4TypeCd,OV_4_TYPE_CD_LEN);
       localOv4TypeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4TypeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshOv4TypeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4TypeCd() {	 
   		return (substring(getStringValue(),beginOv4TypeCd,beginOv4TypeCd + OV_4_TYPE_CD_LEN));
   	}
     int localOv4GlAccountNumberCounter = -1;
     public boolean isOv4GlAccountNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4GlAccountNumberCounter != sharedCounter;
         localOv4GlAccountNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ov4GlAccountNumber
	 *	@return ov4GlAccountNumber
	 */
	public char[]  getOv4GlAccountNumberString() {
	     return getCharArray(beginOv4GlAccountNumber,OV_4_GL_ACCOUNT_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4GlAccountNumberIsNumeric() {
	    return isNumeric(beginOv4GlAccountNumber
	                    ,beginOv4GlAccountNumber + OV_4_GL_ACCOUNT_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int OV_4_GL_ACCOUNT_NUMBER_LEN = 18;
  	/**
	 * serializeOv4GlAccountNumber
	 */
	protected void serializeOv4GlAccountNumber(long ov4GlAccountNumber) {
		 putNumber(beginOv4GlAccountNumber,ov4GlAccountNumber,OV_4_GL_ACCOUNT_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4GlAccountNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeOv4GlAccountNumber
	 */
   	protected  long serializeOv4GlAccountNumber(char[] value) {
	    long  ov4GlAccountNumber;
	    if(value.length >0 && value.length!= 18)
            value = new String(value).trim().toCharArray();
	    if (value.length < 18) value = pad(18, value, ' ', LEFT_PAD);
	    else if (value.length > 18) value = substring(value,0,18);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ov4GlAccountNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4GlAccountNumber
		       ,18
		      );
		 localOv4GlAccountNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  ov4GlAccountNumber;
    }

   protected long checkOv4GlAccountNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1E/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshOv4GlAccountNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshOv4GlAccountNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginOv4GlAccountNumber
			                 ,OV_4_GL_ACCOUNT_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4GlAccountNumber", beginOv4GlAccountNumber,OV_4_GL_ACCOUNT_NUMBER_LEN);
    }
   	}
     int localOv4CurrentDateCounter = -1;
     public boolean isOv4CurrentDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4CurrentDateCounter != sharedCounter;
         localOv4CurrentDateCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_CURRENT_DATE_LEN = 10;
	/**
	 * 	serialize this Ov4CurrentDate
	 */
   protected void serializeOv4CurrentDate(char[] ov4CurrentDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4CurrentDate,0,getStringValue(),beginOv4CurrentDate,OV_4_CURRENT_DATE_LEN);
       localOv4CurrentDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4CurrentDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshOv4CurrentDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4CurrentDate() {	 
   		return (substring(getStringValue(),beginOv4CurrentDate,beginOv4CurrentDate + OV_4_CURRENT_DATE_LEN));
   	}




}
  
