package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class SvHeaderData282Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SvHeaderData282Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SvHeaderData282Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SV_HEADER_DATA_282_LENGTH = 215;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSvHeaderId282;
            protected  int beginSvVersion282;
            protected  int beginSvHdrLength282;
            protected  int beginSvTlvLength282;
           protected int beginSvServiceTable282;
           protected static final int SV_SERVICE_TABLE_282_SIZE = 8;
            protected  int beginSvFiller282;
	
	/**
	* Constructor for SvHeaderData282Serialized
	**/
    public SvHeaderData282Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SvHeaderData282Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SV_HEADER_DATA_282_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSvHeaderId282 = getStartOffset() + 0;	// set offset for serialization
  
             beginSvVersion282 = getStartOffset() + 2;	// set offset for serialization
  
             beginSvHdrLength282 = getStartOffset() + 4;	// set offset for serialization
  
             beginSvTlvLength282 = getStartOffset() + 10;	// set offset for serialization
  
	        beginSvServiceTable282 = getStartOffset() + 11; // set offset for serialization
  
             beginSvFiller282 = getStartOffset() + 115;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSvHeaderId282Counter = -1;
     public boolean isSvHeaderId282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvHeaderId282Counter != sharedCounter;
         localSvHeaderId282Counter = sharedCounter; return hasModified;
     }
	protected static final int SV_HEADER_ID_282_LEN = 2;
	/**
	 * 	serialize this SvHeaderId282
	 */
   protected void serializeSvHeaderId282(char[] svHeaderId282) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svHeaderId282,0,getStringValue(),beginSvHeaderId282,SV_HEADER_ID_282_LEN);
       localSvHeaderId282Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvHeaderId282Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshSvHeaderId282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvHeaderId282() {	 
   		return (substring(getStringValue(),beginSvHeaderId282,beginSvHeaderId282 + SV_HEADER_ID_282_LEN));
   	}
     int localSvVersion282Counter = -1;
     public boolean isSvVersion282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvVersion282Counter != sharedCounter;
         localSvVersion282Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of svVersion282
	 *	@return svVersion282
	 */
	public char[]  getSvVersion282String() {
	     return getCharArray(beginSvVersion282,SV_VERSION_282_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean svVersion282IsNumeric() {
	    return isNumeric(beginSvVersion282
	                    ,beginSvVersion282 + SV_VERSION_282_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SV_VERSION_282_LEN = 2;
  	/**
	 * serializeSvVersion282
	 */
	protected void serializeSvVersion282(int svVersion282) {
		 putNumber(beginSvVersion282,svVersion282,SV_VERSION_282_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSvVersion282Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSvVersion282
	 */
   	protected  int serializeSvVersion282(char[] value) {
	    int  svVersion282;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    svVersion282 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginSvVersion282
		       ,2
		      );
		 localSvVersion282Counter = shareString.getSerializedField().getModifiedCounter();
		return  svVersion282;
    }

   protected int checkSvVersion282MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSvVersion282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSvVersion282() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSvVersion282
			                 ,SV_VERSION_282_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("svVersion282", beginSvVersion282,SV_VERSION_282_LEN);
    }
   	}
     int localSvHdrLength282Counter = -1;
     public boolean isSvHdrLength282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvHdrLength282Counter != sharedCounter;
         localSvHdrLength282Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of svHdrLength282
	 *	@return svHdrLength282
	 */
	public char[]  getSvHdrLength282String() {
	     return getCharArray(beginSvHdrLength282,SV_HDR_LENGTH_282_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean svHdrLength282IsNumeric() {
	    return isNumeric(beginSvHdrLength282
	                    ,beginSvHdrLength282 + SV_HDR_LENGTH_282_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SV_HDR_LENGTH_282_LEN = 6;
  	/**
	 * serializeSvHdrLength282
	 */
	protected void serializeSvHdrLength282(long svHdrLength282) {
		 putNumber(beginSvHdrLength282,svHdrLength282,SV_HDR_LENGTH_282_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSvHdrLength282Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSvHdrLength282
	 */
   	protected  long serializeSvHdrLength282(char[] value) {
	    long  svHdrLength282;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    svHdrLength282 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginSvHdrLength282
		       ,6
		      );
		 localSvHdrLength282Counter = shareString.getSerializedField().getModifiedCounter();
		return  svHdrLength282;
    }

   protected long checkSvHdrLength282MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSvHdrLength282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSvHdrLength282() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSvHdrLength282
			                 ,SV_HDR_LENGTH_282_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("svHdrLength282", beginSvHdrLength282,SV_HDR_LENGTH_282_LEN);
    }
   	}
     int localSvTlvLength282Counter = -1;
     public boolean isSvTlvLength282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvTlvLength282Counter != sharedCounter;
         localSvTlvLength282Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of svTlvLength282
	 *	@return svTlvLength282
	 */
	public char[]  getSvTlvLength282String() {
	     return getCharArray(beginSvTlvLength282,SV_TLV_LENGTH_282_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean svTlvLength282IsNumeric() {
	    return isNumeric(beginSvTlvLength282
	                    ,beginSvTlvLength282 + SV_TLV_LENGTH_282_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SV_TLV_LENGTH_282_LEN = 1;
  	/**
	 * serializeSvTlvLength282
	 */
	protected void serializeSvTlvLength282(int svTlvLength282) {
		 putNumber(beginSvTlvLength282,svTlvLength282,SV_TLV_LENGTH_282_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSvTlvLength282Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSvTlvLength282
	 */
   	protected  int serializeSvTlvLength282(char[] value) {
	    int  svTlvLength282;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    svTlvLength282 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginSvTlvLength282
		       ,1
		      );
		 localSvTlvLength282Counter = shareString.getSerializedField().getModifiedCounter();
		return  svTlvLength282;
    }

   protected int checkSvTlvLength282MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSvTlvLength282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshSvTlvLength282() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginSvTlvLength282
			                 ,SV_TLV_LENGTH_282_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("svTlvLength282", beginSvTlvLength282,SV_TLV_LENGTH_282_LEN);
    }
   	}
     int localSvFiller282Counter = -1;
     public boolean isSvFiller282Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSvFiller282Counter != sharedCounter;
         localSvFiller282Counter = sharedCounter; return hasModified;
     }
	protected static final int SV_FILLER_282_LEN = 100;
	/**
	 * 	serialize this SvFiller282
	 */
   protected void serializeSvFiller282(char[] svFiller282) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(svFiller282,0,getStringValue(),beginSvFiller282,SV_FILLER_282_LEN);
       localSvFiller282Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSvFiller282Constraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshSvFiller282 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSvFiller282() {	 
   		return (substring(getStringValue(),beginSvFiller282,beginSvFiller282 + SV_FILLER_282_LEN));
   	}

		public int svServiceTable282Size() {
			return SV_SERVICE_TABLE_282_SIZE;
		}



}
  
