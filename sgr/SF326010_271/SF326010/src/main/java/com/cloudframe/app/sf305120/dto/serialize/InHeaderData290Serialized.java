package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class InHeaderData290Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InHeaderData290Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InHeaderData290Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IN_HEADER_DATA_290_LENGTH = 1017;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginInHeaderId290;
            protected  int beginInVersion290;
            protected  int beginInHdrLength290;
            protected  int beginInTlvLength290;
            protected  int beginInServiceResults290;
	
	/**
	* Constructor for InHeaderData290Serialized
	**/
    public InHeaderData290Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InHeaderData290Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IN_HEADER_DATA_290_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginInHeaderId290 = getStartOffset() + 0;	// set offset for serialization
  
             beginInVersion290 = getStartOffset() + 2;	// set offset for serialization
  
             beginInHdrLength290 = getStartOffset() + 4;	// set offset for serialization
  
             beginInTlvLength290 = getStartOffset() + 10;	// set offset for serialization
  
             beginInServiceResults290 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localInHeaderId290Counter = -1;
     public boolean isInHeaderId290Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInHeaderId290Counter != sharedCounter;
         localInHeaderId290Counter = sharedCounter; return hasModified;
     }
	protected static final int IN_HEADER_ID_290_LEN = 2;
	/**
	 * 	serialize this InHeaderId290
	 */
   protected void serializeInHeaderId290(char[] inHeaderId290) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inHeaderId290,0,getStringValue(),beginInHeaderId290,IN_HEADER_ID_290_LEN);
       localInHeaderId290Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInHeaderId290Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshInHeaderId290 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInHeaderId290() {	 
   		return (substring(getStringValue(),beginInHeaderId290,beginInHeaderId290 + IN_HEADER_ID_290_LEN));
   	}
     int localInVersion290Counter = -1;
     public boolean isInVersion290Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInVersion290Counter != sharedCounter;
         localInVersion290Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inVersion290
	 *	@return inVersion290
	 */
	public char[]  getInVersion290String() {
	     return getCharArray(beginInVersion290,IN_VERSION_290_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inVersion290IsNumeric() {
	    return isNumeric(beginInVersion290
	                    ,beginInVersion290 + IN_VERSION_290_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IN_VERSION_290_LEN = 2;
  	/**
	 * serializeInVersion290
	 */
	protected void serializeInVersion290(int inVersion290) {
		 putNumber(beginInVersion290,inVersion290,IN_VERSION_290_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInVersion290Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInVersion290
	 */
   	protected  int serializeInVersion290(char[] value) {
	    int  inVersion290;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inVersion290 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginInVersion290
		       ,2
		      );
		 localInVersion290Counter = shareString.getSerializedField().getModifiedCounter();
		return  inVersion290;
    }

   protected int checkInVersion290MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInVersion290 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInVersion290() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInVersion290
			                 ,IN_VERSION_290_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inVersion290", beginInVersion290,IN_VERSION_290_LEN);
    }
   	}
     int localInHdrLength290Counter = -1;
     public boolean isInHdrLength290Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInHdrLength290Counter != sharedCounter;
         localInHdrLength290Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inHdrLength290
	 *	@return inHdrLength290
	 */
	public char[]  getInHdrLength290String() {
	     return getCharArray(beginInHdrLength290,IN_HDR_LENGTH_290_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inHdrLength290IsNumeric() {
	    return isNumeric(beginInHdrLength290
	                    ,beginInHdrLength290 + IN_HDR_LENGTH_290_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IN_HDR_LENGTH_290_LEN = 6;
  	/**
	 * serializeInHdrLength290
	 */
	protected void serializeInHdrLength290(long inHdrLength290) {
		 putNumber(beginInHdrLength290,inHdrLength290,IN_HDR_LENGTH_290_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInHdrLength290Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInHdrLength290
	 */
   	protected  long serializeInHdrLength290(char[] value) {
	    long  inHdrLength290;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inHdrLength290 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginInHdrLength290
		       ,6
		      );
		 localInHdrLength290Counter = shareString.getSerializedField().getModifiedCounter();
		return  inHdrLength290;
    }

   protected long checkInHdrLength290MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInHdrLength290 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshInHdrLength290() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginInHdrLength290
			                 ,IN_HDR_LENGTH_290_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inHdrLength290", beginInHdrLength290,IN_HDR_LENGTH_290_LEN);
    }
   	}
     int localInTlvLength290Counter = -1;
     public boolean isInTlvLength290Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInTlvLength290Counter != sharedCounter;
         localInTlvLength290Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of inTlvLength290
	 *	@return inTlvLength290
	 */
	public char[]  getInTlvLength290String() {
	     return getCharArray(beginInTlvLength290,IN_TLV_LENGTH_290_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean inTlvLength290IsNumeric() {
	    return isNumeric(beginInTlvLength290
	                    ,beginInTlvLength290 + IN_TLV_LENGTH_290_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IN_TLV_LENGTH_290_LEN = 1;
  	/**
	 * serializeInTlvLength290
	 */
	protected void serializeInTlvLength290(int inTlvLength290) {
		 putNumber(beginInTlvLength290,inTlvLength290,IN_TLV_LENGTH_290_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localInTlvLength290Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeInTlvLength290
	 */
   	protected  int serializeInTlvLength290(char[] value) {
	    int  inTlvLength290;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    inTlvLength290 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginInTlvLength290
		       ,1
		      );
		 localInTlvLength290Counter = shareString.getSerializedField().getModifiedCounter();
		return  inTlvLength290;
    }

   protected int checkInTlvLength290MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshInTlvLength290 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshInTlvLength290() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginInTlvLength290
			                 ,IN_TLV_LENGTH_290_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("inTlvLength290", beginInTlvLength290,IN_TLV_LENGTH_290_LEN);
    }
   	}
     int localInServiceResults290Counter = -1;
     public boolean isInServiceResults290Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localInServiceResults290Counter != sharedCounter;
         localInServiceResults290Counter = sharedCounter; return hasModified;
     }
	protected static final int IN_SERVICE_RESULTS_290_LEN = 1006;
	/**
	 * 	serialize this InServiceResults290
	 */
   protected void serializeInServiceResults290(char[] inServiceResults290) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(inServiceResults290,0,getStringValue(),beginInServiceResults290,IN_SERVICE_RESULTS_290_LEN);
       localInServiceResults290Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkInServiceResults290Constraints(char[] value) {
   			return super.checkConstraints(value , 1006 ,false, false);
   }
    /**
	 *	refreshInServiceResults290 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshInServiceResults290() {	 
   		return (substring(getStringValue(),beginInServiceResults290,beginInServiceResults290 + IN_SERVICE_RESULTS_290_LEN));
   	}




}
  
