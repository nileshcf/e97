package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class ReHeaderData286Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ReHeaderData286Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ReHeaderData286Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RE_HEADER_DATA_286_LENGTH = 1017;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginReHeaderId286;
            protected  int beginReVersion286;
            protected  int beginReHdrLength286;
            protected  int beginReTlvLength286;
            protected  int beginReServiceResults286;
	
	/**
	* Constructor for ReHeaderData286Serialized
	**/
    public ReHeaderData286Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ReHeaderData286Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RE_HEADER_DATA_286_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginReHeaderId286 = getStartOffset() + 0;	// set offset for serialization
  
             beginReVersion286 = getStartOffset() + 2;	// set offset for serialization
  
             beginReHdrLength286 = getStartOffset() + 4;	// set offset for serialization
  
             beginReTlvLength286 = getStartOffset() + 10;	// set offset for serialization
  
             beginReServiceResults286 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localReHeaderId286Counter = -1;
     public boolean isReHeaderId286Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReHeaderId286Counter != sharedCounter;
         localReHeaderId286Counter = sharedCounter; return hasModified;
     }
	protected static final int RE_HEADER_ID_286_LEN = 2;
	/**
	 * 	serialize this ReHeaderId286
	 */
   protected void serializeReHeaderId286(char[] reHeaderId286) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reHeaderId286,0,getStringValue(),beginReHeaderId286,RE_HEADER_ID_286_LEN);
       localReHeaderId286Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReHeaderId286Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshReHeaderId286 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReHeaderId286() {	 
   		return (substring(getStringValue(),beginReHeaderId286,beginReHeaderId286 + RE_HEADER_ID_286_LEN));
   	}
     int localReVersion286Counter = -1;
     public boolean isReVersion286Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReVersion286Counter != sharedCounter;
         localReVersion286Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of reVersion286
	 *	@return reVersion286
	 */
	public char[]  getReVersion286String() {
	     return getCharArray(beginReVersion286,RE_VERSION_286_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reVersion286IsNumeric() {
	    return isNumeric(beginReVersion286
	                    ,beginReVersion286 + RE_VERSION_286_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RE_VERSION_286_LEN = 2;
  	/**
	 * serializeReVersion286
	 */
	protected void serializeReVersion286(int reVersion286) {
		 putNumber(beginReVersion286,reVersion286,RE_VERSION_286_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localReVersion286Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeReVersion286
	 */
   	protected  int serializeReVersion286(char[] value) {
	    int  reVersion286;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    reVersion286 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginReVersion286
		       ,2
		      );
		 localReVersion286Counter = shareString.getSerializedField().getModifiedCounter();
		return  reVersion286;
    }

   protected int checkReVersion286MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshReVersion286 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshReVersion286() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginReVersion286
			                 ,RE_VERSION_286_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("reVersion286", beginReVersion286,RE_VERSION_286_LEN);
    }
   	}
     int localReHdrLength286Counter = -1;
     public boolean isReHdrLength286Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReHdrLength286Counter != sharedCounter;
         localReHdrLength286Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of reHdrLength286
	 *	@return reHdrLength286
	 */
	public char[]  getReHdrLength286String() {
	     return getCharArray(beginReHdrLength286,RE_HDR_LENGTH_286_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reHdrLength286IsNumeric() {
	    return isNumeric(beginReHdrLength286
	                    ,beginReHdrLength286 + RE_HDR_LENGTH_286_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RE_HDR_LENGTH_286_LEN = 6;
  	/**
	 * serializeReHdrLength286
	 */
	protected void serializeReHdrLength286(long reHdrLength286) {
		 putNumber(beginReHdrLength286,reHdrLength286,RE_HDR_LENGTH_286_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localReHdrLength286Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeReHdrLength286
	 */
   	protected  long serializeReHdrLength286(char[] value) {
	    long  reHdrLength286;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    reHdrLength286 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginReHdrLength286
		       ,6
		      );
		 localReHdrLength286Counter = shareString.getSerializedField().getModifiedCounter();
		return  reHdrLength286;
    }

   protected long checkReHdrLength286MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshReHdrLength286 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshReHdrLength286() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginReHdrLength286
			                 ,RE_HDR_LENGTH_286_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("reHdrLength286", beginReHdrLength286,RE_HDR_LENGTH_286_LEN);
    }
   	}
     int localReTlvLength286Counter = -1;
     public boolean isReTlvLength286Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReTlvLength286Counter != sharedCounter;
         localReTlvLength286Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of reTlvLength286
	 *	@return reTlvLength286
	 */
	public char[]  getReTlvLength286String() {
	     return getCharArray(beginReTlvLength286,RE_TLV_LENGTH_286_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean reTlvLength286IsNumeric() {
	    return isNumeric(beginReTlvLength286
	                    ,beginReTlvLength286 + RE_TLV_LENGTH_286_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RE_TLV_LENGTH_286_LEN = 1;
  	/**
	 * serializeReTlvLength286
	 */
	protected void serializeReTlvLength286(int reTlvLength286) {
		 putNumber(beginReTlvLength286,reTlvLength286,RE_TLV_LENGTH_286_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localReTlvLength286Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeReTlvLength286
	 */
   	protected  int serializeReTlvLength286(char[] value) {
	    int  reTlvLength286;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    reTlvLength286 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginReTlvLength286
		       ,1
		      );
		 localReTlvLength286Counter = shareString.getSerializedField().getModifiedCounter();
		return  reTlvLength286;
    }

   protected int checkReTlvLength286MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshReTlvLength286 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshReTlvLength286() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginReTlvLength286
			                 ,RE_TLV_LENGTH_286_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("reTlvLength286", beginReTlvLength286,RE_TLV_LENGTH_286_LEN);
    }
   	}
     int localReServiceResults286Counter = -1;
     public boolean isReServiceResults286Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localReServiceResults286Counter != sharedCounter;
         localReServiceResults286Counter = sharedCounter; return hasModified;
     }
	protected static final int RE_SERVICE_RESULTS_286_LEN = 1006;
	/**
	 * 	serialize this ReServiceResults286
	 */
   protected void serializeReServiceResults286(char[] reServiceResults286) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(reServiceResults286,0,getStringValue(),beginReServiceResults286,RE_SERVICE_RESULTS_286_LEN);
       localReServiceResults286Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkReServiceResults286Constraints(char[] value) {
   			return super.checkConstraints(value , 1006 ,false, false);
   }
    /**
	 *	refreshReServiceResults286 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshReServiceResults286() {	 
   		return (substring(getStringValue(),beginReServiceResults286,beginReServiceResults286 + RE_SERVICE_RESULTS_286_LEN));
   	}




}
  
