package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WsaCurrentDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WsaCurrentDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WsaCurrentDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSA_CURRENT_DATE_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsaCurrentDateMm;
            protected  int beginWsaCurrentDateDd;
            protected  int beginWsaCurrentDateYy;
	
	/**
	* Constructor for WsaCurrentDateSerialized
	**/
    public WsaCurrentDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WsaCurrentDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSA_CURRENT_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsaCurrentDateMm = getStartOffset() + 0;	// set offset for serialization
  
  
             beginWsaCurrentDateDd = getStartOffset() + 3;	// set offset for serialization
  
  
             beginWsaCurrentDateYy = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsaCurrentDateMmCounter = -1;
     public boolean isWsaCurrentDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaCurrentDateMmCounter != sharedCounter;
         localWsaCurrentDateMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsaCurrentDateMm
	 *	@return wsaCurrentDateMm
	 */
	public char[]  getWsaCurrentDateMmString() {
	     return getCharArray(beginWsaCurrentDateMm,WSA_CURRENT_DATE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsaCurrentDateMmIsNumeric() {
	    return isNumeric(beginWsaCurrentDateMm
	                    ,beginWsaCurrentDateMm + WSA_CURRENT_DATE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSA_CURRENT_DATE_MM_LEN = 2;
  	/**
	 * serializeWsaCurrentDateMm
	 */
	protected void serializeWsaCurrentDateMm(int wsaCurrentDateMm) {
		 putNumber(beginWsaCurrentDateMm,wsaCurrentDateMm,WSA_CURRENT_DATE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsaCurrentDateMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsaCurrentDateMm
	 */
   	protected  int serializeWsaCurrentDateMm(char[] value) {
	    int  wsaCurrentDateMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsaCurrentDateMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWsaCurrentDateMm
		       ,2
		      );
		 localWsaCurrentDateMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsaCurrentDateMm;
    }

   protected int checkWsaCurrentDateMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsaCurrentDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaCurrentDateMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsaCurrentDateMm
			                 ,WSA_CURRENT_DATE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsaCurrentDateMm", beginWsaCurrentDateMm,WSA_CURRENT_DATE_MM_LEN);
    }
   	}
     int localWsaCurrentDateDdCounter = -1;
     public boolean isWsaCurrentDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaCurrentDateDdCounter != sharedCounter;
         localWsaCurrentDateDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsaCurrentDateDd
	 *	@return wsaCurrentDateDd
	 */
	public char[]  getWsaCurrentDateDdString() {
	     return getCharArray(beginWsaCurrentDateDd,WSA_CURRENT_DATE_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsaCurrentDateDdIsNumeric() {
	    return isNumeric(beginWsaCurrentDateDd
	                    ,beginWsaCurrentDateDd + WSA_CURRENT_DATE_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSA_CURRENT_DATE_DD_LEN = 2;
  	/**
	 * serializeWsaCurrentDateDd
	 */
	protected void serializeWsaCurrentDateDd(int wsaCurrentDateDd) {
		 putNumber(beginWsaCurrentDateDd,wsaCurrentDateDd,WSA_CURRENT_DATE_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsaCurrentDateDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsaCurrentDateDd
	 */
   	protected  int serializeWsaCurrentDateDd(char[] value) {
	    int  wsaCurrentDateDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsaCurrentDateDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWsaCurrentDateDd
		       ,2
		      );
		 localWsaCurrentDateDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsaCurrentDateDd;
    }

   protected int checkWsaCurrentDateDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsaCurrentDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaCurrentDateDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsaCurrentDateDd
			                 ,WSA_CURRENT_DATE_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsaCurrentDateDd", beginWsaCurrentDateDd,WSA_CURRENT_DATE_DD_LEN);
    }
   	}
     int localWsaCurrentDateYyCounter = -1;
     public boolean isWsaCurrentDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaCurrentDateYyCounter != sharedCounter;
         localWsaCurrentDateYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsaCurrentDateYy
	 *	@return wsaCurrentDateYy
	 */
	public char[]  getWsaCurrentDateYyString() {
	     return getCharArray(beginWsaCurrentDateYy,WSA_CURRENT_DATE_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsaCurrentDateYyIsNumeric() {
	    return isNumeric(beginWsaCurrentDateYy
	                    ,beginWsaCurrentDateYy + WSA_CURRENT_DATE_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSA_CURRENT_DATE_YY_LEN = 2;
  	/**
	 * serializeWsaCurrentDateYy
	 */
	protected void serializeWsaCurrentDateYy(int wsaCurrentDateYy) {
		 putNumber(beginWsaCurrentDateYy,wsaCurrentDateYy,WSA_CURRENT_DATE_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsaCurrentDateYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsaCurrentDateYy
	 */
   	protected  int serializeWsaCurrentDateYy(char[] value) {
	    int  wsaCurrentDateYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsaCurrentDateYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWsaCurrentDateYy
		       ,2
		      );
		 localWsaCurrentDateYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsaCurrentDateYy;
    }

   protected int checkWsaCurrentDateYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsaCurrentDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaCurrentDateYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsaCurrentDateYy
			                 ,WSA_CURRENT_DATE_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsaCurrentDateYy", beginWsaCurrentDateYy,WSA_CURRENT_DATE_YY_LEN);
    }
   	}




}
  
