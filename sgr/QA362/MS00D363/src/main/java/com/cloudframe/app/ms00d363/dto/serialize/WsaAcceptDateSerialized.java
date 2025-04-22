package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class WsaAcceptDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WsaAcceptDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WsaAcceptDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSA_ACCEPT_DATE_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWsaAcceptDateYy;
            protected  int beginWsaAcceptDateMm;
            protected  int beginWsaAcceptDateDd;
	
	/**
	* Constructor for WsaAcceptDateSerialized
	**/
    public WsaAcceptDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WsaAcceptDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSA_ACCEPT_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWsaAcceptDateYy = getStartOffset() + 0;	// set offset for serialization
  
             beginWsaAcceptDateMm = getStartOffset() + 2;	// set offset for serialization
  
             beginWsaAcceptDateDd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWsaAcceptDateYyCounter = -1;
     public boolean isWsaAcceptDateYyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaAcceptDateYyCounter != sharedCounter;
         localWsaAcceptDateYyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsaAcceptDateYy
	 *	@return wsaAcceptDateYy
	 */
	public char[]  getWsaAcceptDateYyString() {
	     return getCharArray(beginWsaAcceptDateYy,WSA_ACCEPT_DATE_YY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsaAcceptDateYyIsNumeric() {
	    return isNumeric(beginWsaAcceptDateYy
	                    ,beginWsaAcceptDateYy + WSA_ACCEPT_DATE_YY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSA_ACCEPT_DATE_YY_LEN = 2;
  	/**
	 * serializeWsaAcceptDateYy
	 */
	protected void serializeWsaAcceptDateYy(int wsaAcceptDateYy) {
		 putNumber(beginWsaAcceptDateYy,wsaAcceptDateYy,WSA_ACCEPT_DATE_YY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsaAcceptDateYyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsaAcceptDateYy
	 */
   	protected  int serializeWsaAcceptDateYy(char[] value) {
	    int  wsaAcceptDateYy;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsaAcceptDateYy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWsaAcceptDateYy
		       ,2
		      );
		 localWsaAcceptDateYyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsaAcceptDateYy;
    }

   protected int checkWsaAcceptDateYyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsaAcceptDateYy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaAcceptDateYy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsaAcceptDateYy
			                 ,WSA_ACCEPT_DATE_YY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsaAcceptDateYy", beginWsaAcceptDateYy,WSA_ACCEPT_DATE_YY_LEN);
    }
   	}
     int localWsaAcceptDateMmCounter = -1;
     public boolean isWsaAcceptDateMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaAcceptDateMmCounter != sharedCounter;
         localWsaAcceptDateMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsaAcceptDateMm
	 *	@return wsaAcceptDateMm
	 */
	public char[]  getWsaAcceptDateMmString() {
	     return getCharArray(beginWsaAcceptDateMm,WSA_ACCEPT_DATE_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsaAcceptDateMmIsNumeric() {
	    return isNumeric(beginWsaAcceptDateMm
	                    ,beginWsaAcceptDateMm + WSA_ACCEPT_DATE_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSA_ACCEPT_DATE_MM_LEN = 2;
  	/**
	 * serializeWsaAcceptDateMm
	 */
	protected void serializeWsaAcceptDateMm(int wsaAcceptDateMm) {
		 putNumber(beginWsaAcceptDateMm,wsaAcceptDateMm,WSA_ACCEPT_DATE_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsaAcceptDateMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsaAcceptDateMm
	 */
   	protected  int serializeWsaAcceptDateMm(char[] value) {
	    int  wsaAcceptDateMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsaAcceptDateMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWsaAcceptDateMm
		       ,2
		      );
		 localWsaAcceptDateMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsaAcceptDateMm;
    }

   protected int checkWsaAcceptDateMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsaAcceptDateMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaAcceptDateMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsaAcceptDateMm
			                 ,WSA_ACCEPT_DATE_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsaAcceptDateMm", beginWsaAcceptDateMm,WSA_ACCEPT_DATE_MM_LEN);
    }
   	}
     int localWsaAcceptDateDdCounter = -1;
     public boolean isWsaAcceptDateDdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaAcceptDateDdCounter != sharedCounter;
         localWsaAcceptDateDdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wsaAcceptDateDd
	 *	@return wsaAcceptDateDd
	 */
	public char[]  getWsaAcceptDateDdString() {
	     return getCharArray(beginWsaAcceptDateDd,WSA_ACCEPT_DATE_DD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wsaAcceptDateDdIsNumeric() {
	    return isNumeric(beginWsaAcceptDateDd
	                    ,beginWsaAcceptDateDd + WSA_ACCEPT_DATE_DD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WSA_ACCEPT_DATE_DD_LEN = 2;
  	/**
	 * serializeWsaAcceptDateDd
	 */
	protected void serializeWsaAcceptDateDd(int wsaAcceptDateDd) {
		 putNumber(beginWsaAcceptDateDd,wsaAcceptDateDd,WSA_ACCEPT_DATE_DD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWsaAcceptDateDdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWsaAcceptDateDd
	 */
   	protected  int serializeWsaAcceptDateDd(char[] value) {
	    int  wsaAcceptDateDd;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wsaAcceptDateDd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWsaAcceptDateDd
		       ,2
		      );
		 localWsaAcceptDateDdCounter = shareString.getSerializedField().getModifiedCounter();
		return  wsaAcceptDateDd;
    }

   protected int checkWsaAcceptDateDdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWsaAcceptDateDd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWsaAcceptDateDd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWsaAcceptDateDd
			                 ,WSA_ACCEPT_DATE_DD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wsaAcceptDateDd", beginWsaAcceptDateDd,WSA_ACCEPT_DATE_DD_LEN);
    }
   	}




}
  
