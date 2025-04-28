package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class UnknownHeader299Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UnknownHeader299Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UnknownHeader299Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int UNKNOWN_HEADER_299_LENGTH = 1010;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUuHeaderId299;
            protected  int beginUuVersion299;
            protected  int beginUuHdrLength299;
            protected  int beginUuTlvLength299;
            protected  int beginUuData299;
	
	/**
	* Constructor for UnknownHeader299Serialized
	**/
    public UnknownHeader299Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in UnknownHeader299Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(UNKNOWN_HEADER_299_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginUuHeaderId299 = getStartOffset() + 0;	// set offset for serialization
  
             beginUuVersion299 = getStartOffset() + 2;	// set offset for serialization
  
             beginUuHdrLength299 = getStartOffset() + 4;	// set offset for serialization
  
             beginUuTlvLength299 = getStartOffset() + 10;	// set offset for serialization
  
             beginUuData299 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUuHeaderId299Counter = -1;
     public boolean isUuHeaderId299Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUuHeaderId299Counter != sharedCounter;
         localUuHeaderId299Counter = sharedCounter; return hasModified;
     }
	protected static final int UU_HEADER_ID_299_LEN = 2;
	/**
	 * 	serialize this UuHeaderId299
	 */
   protected void serializeUuHeaderId299(char[] uuHeaderId299) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uuHeaderId299,0,getStringValue(),beginUuHeaderId299,UU_HEADER_ID_299_LEN);
       localUuHeaderId299Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUuHeaderId299Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshUuHeaderId299 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUuHeaderId299() {	 
   		return (substring(getStringValue(),beginUuHeaderId299,beginUuHeaderId299 + UU_HEADER_ID_299_LEN));
   	}
     int localUuVersion299Counter = -1;
     public boolean isUuVersion299Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUuVersion299Counter != sharedCounter;
         localUuVersion299Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of uuVersion299
	 *	@return uuVersion299
	 */
	public char[]  getUuVersion299String() {
	     return getCharArray(beginUuVersion299,UU_VERSION_299_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean uuVersion299IsNumeric() {
	    return isNumeric(beginUuVersion299
	                    ,beginUuVersion299 + UU_VERSION_299_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int UU_VERSION_299_LEN = 2;
  	/**
	 * serializeUuVersion299
	 */
	protected void serializeUuVersion299(int uuVersion299) {
		 putNumber(beginUuVersion299,uuVersion299,UU_VERSION_299_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localUuVersion299Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeUuVersion299
	 */
   	protected  int serializeUuVersion299(char[] value) {
	    int  uuVersion299;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    uuVersion299 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginUuVersion299
		       ,2
		      );
		 localUuVersion299Counter = shareString.getSerializedField().getModifiedCounter();
		return  uuVersion299;
    }

   protected int checkUuVersion299MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshUuVersion299 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUuVersion299() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginUuVersion299
			                 ,UU_VERSION_299_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("uuVersion299", beginUuVersion299,UU_VERSION_299_LEN);
    }
   	}
     int localUuHdrLength299Counter = -1;
     public boolean isUuHdrLength299Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUuHdrLength299Counter != sharedCounter;
         localUuHdrLength299Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of uuHdrLength299
	 *	@return uuHdrLength299
	 */
	public char[]  getUuHdrLength299String() {
	     return getCharArray(beginUuHdrLength299,UU_HDR_LENGTH_299_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean uuHdrLength299IsNumeric() {
	    return isNumeric(beginUuHdrLength299
	                    ,beginUuHdrLength299 + UU_HDR_LENGTH_299_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int UU_HDR_LENGTH_299_LEN = 6;
  	/**
	 * serializeUuHdrLength299
	 */
	protected void serializeUuHdrLength299(long uuHdrLength299) {
		 putNumber(beginUuHdrLength299,uuHdrLength299,UU_HDR_LENGTH_299_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localUuHdrLength299Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeUuHdrLength299
	 */
   	protected  long serializeUuHdrLength299(char[] value) {
	    long  uuHdrLength299;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    uuHdrLength299 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginUuHdrLength299
		       ,6
		      );
		 localUuHdrLength299Counter = shareString.getSerializedField().getModifiedCounter();
		return  uuHdrLength299;
    }

   protected long checkUuHdrLength299MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshUuHdrLength299 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshUuHdrLength299() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginUuHdrLength299
			                 ,UU_HDR_LENGTH_299_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("uuHdrLength299", beginUuHdrLength299,UU_HDR_LENGTH_299_LEN);
    }
   	}
     int localUuTlvLength299Counter = -1;
     public boolean isUuTlvLength299Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUuTlvLength299Counter != sharedCounter;
         localUuTlvLength299Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of uuTlvLength299
	 *	@return uuTlvLength299
	 */
	public char[]  getUuTlvLength299String() {
	     return getCharArray(beginUuTlvLength299,UU_TLV_LENGTH_299_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean uuTlvLength299IsNumeric() {
	    return isNumeric(beginUuTlvLength299
	                    ,beginUuTlvLength299 + UU_TLV_LENGTH_299_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int UU_TLV_LENGTH_299_LEN = 1;
  	/**
	 * serializeUuTlvLength299
	 */
	protected void serializeUuTlvLength299(int uuTlvLength299) {
		 putNumber(beginUuTlvLength299,uuTlvLength299,UU_TLV_LENGTH_299_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localUuTlvLength299Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeUuTlvLength299
	 */
   	protected  int serializeUuTlvLength299(char[] value) {
	    int  uuTlvLength299;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    uuTlvLength299 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginUuTlvLength299
		       ,1
		      );
		 localUuTlvLength299Counter = shareString.getSerializedField().getModifiedCounter();
		return  uuTlvLength299;
    }

   protected int checkUuTlvLength299MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshUuTlvLength299 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUuTlvLength299() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginUuTlvLength299
			                 ,UU_TLV_LENGTH_299_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("uuTlvLength299", beginUuTlvLength299,UU_TLV_LENGTH_299_LEN);
    }
   	}
     int localUuData299Counter = -1;
     public boolean isUuData299Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUuData299Counter != sharedCounter;
         localUuData299Counter = sharedCounter; return hasModified;
     }
	protected static final int UU_DATA_299_LEN = 999;
	/**
	 * 	serialize this UuData299
	 */
   protected void serializeUuData299(char[] uuData299) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(uuData299,0,getStringValue(),beginUuData299,UU_DATA_299_LEN);
       localUuData299Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUuData299Constraints(char[] value) {
   			return super.checkConstraints(value , 999 ,false, false);
   }
    /**
	 *	refreshUuData299 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUuData299() {	 
   		return (substring(getStringValue(),beginUuData299,beginUuData299 + UU_DATA_299_LEN));
   	}




}
  
