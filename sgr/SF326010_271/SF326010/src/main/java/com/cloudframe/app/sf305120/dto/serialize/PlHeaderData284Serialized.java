package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class PlHeaderData284Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class PlHeaderData284Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(PlHeaderData284Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PL_HEADER_DATA_284_LENGTH = 2021;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPlHeaderId284;
            protected  int beginPlVersion284;
            protected  int beginPlHdrLength284;
            protected  int beginPlTlvLength284;
            protected  int beginPlPayloadType284;
            protected  int beginPlPayloadLnth284;
            protected  int beginPlPayloadData284;
	
	/**
	* Constructor for PlHeaderData284Serialized
	**/
    public PlHeaderData284Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in PlHeaderData284Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PL_HEADER_DATA_284_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPlHeaderId284 = getStartOffset() + 0;	// set offset for serialization
  
             beginPlVersion284 = getStartOffset() + 2;	// set offset for serialization
  
             beginPlHdrLength284 = getStartOffset() + 4;	// set offset for serialization
  
             beginPlTlvLength284 = getStartOffset() + 10;	// set offset for serialization
  
             beginPlPayloadType284 = getStartOffset() + 11;	// set offset for serialization
  
             beginPlPayloadLnth284 = getStartOffset() + 15;	// set offset for serialization
  
             beginPlPayloadData284 = getStartOffset() + 21;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPlHeaderId284Counter = -1;
     public boolean isPlHeaderId284Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlHeaderId284Counter != sharedCounter;
         localPlHeaderId284Counter = sharedCounter; return hasModified;
     }
	protected static final int PL_HEADER_ID_284_LEN = 2;
	/**
	 * 	serialize this PlHeaderId284
	 */
   protected void serializePlHeaderId284(char[] plHeaderId284) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plHeaderId284,0,getStringValue(),beginPlHeaderId284,PL_HEADER_ID_284_LEN);
       localPlHeaderId284Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlHeaderId284Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshPlHeaderId284 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlHeaderId284() {	 
   		return (substring(getStringValue(),beginPlHeaderId284,beginPlHeaderId284 + PL_HEADER_ID_284_LEN));
   	}
     int localPlVersion284Counter = -1;
     public boolean isPlVersion284Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlVersion284Counter != sharedCounter;
         localPlVersion284Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plVersion284
	 *	@return plVersion284
	 */
	public char[]  getPlVersion284String() {
	     return getCharArray(beginPlVersion284,PL_VERSION_284_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plVersion284IsNumeric() {
	    return isNumeric(beginPlVersion284
	                    ,beginPlVersion284 + PL_VERSION_284_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PL_VERSION_284_LEN = 2;
  	/**
	 * serializePlVersion284
	 */
	protected void serializePlVersion284(int plVersion284) {
		 putNumber(beginPlVersion284,plVersion284,PL_VERSION_284_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlVersion284Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlVersion284
	 */
   	protected  int serializePlVersion284(char[] value) {
	    int  plVersion284;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plVersion284 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginPlVersion284
		       ,2
		      );
		 localPlVersion284Counter = shareString.getSerializedField().getModifiedCounter();
		return  plVersion284;
    }

   protected int checkPlVersion284MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlVersion284 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlVersion284() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlVersion284
			                 ,PL_VERSION_284_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plVersion284", beginPlVersion284,PL_VERSION_284_LEN);
    }
   	}
     int localPlHdrLength284Counter = -1;
     public boolean isPlHdrLength284Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlHdrLength284Counter != sharedCounter;
         localPlHdrLength284Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plHdrLength284
	 *	@return plHdrLength284
	 */
	public char[]  getPlHdrLength284String() {
	     return getCharArray(beginPlHdrLength284,PL_HDR_LENGTH_284_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plHdrLength284IsNumeric() {
	    return isNumeric(beginPlHdrLength284
	                    ,beginPlHdrLength284 + PL_HDR_LENGTH_284_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PL_HDR_LENGTH_284_LEN = 6;
  	/**
	 * serializePlHdrLength284
	 */
	protected void serializePlHdrLength284(long plHdrLength284) {
		 putNumber(beginPlHdrLength284,plHdrLength284,PL_HDR_LENGTH_284_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlHdrLength284Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlHdrLength284
	 */
   	protected  long serializePlHdrLength284(char[] value) {
	    long  plHdrLength284;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plHdrLength284 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginPlHdrLength284
		       ,6
		      );
		 localPlHdrLength284Counter = shareString.getSerializedField().getModifiedCounter();
		return  plHdrLength284;
    }

   protected long checkPlHdrLength284MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlHdrLength284 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlHdrLength284() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlHdrLength284
			                 ,PL_HDR_LENGTH_284_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plHdrLength284", beginPlHdrLength284,PL_HDR_LENGTH_284_LEN);
    }
   	}
     int localPlTlvLength284Counter = -1;
     public boolean isPlTlvLength284Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlTlvLength284Counter != sharedCounter;
         localPlTlvLength284Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plTlvLength284
	 *	@return plTlvLength284
	 */
	public char[]  getPlTlvLength284String() {
	     return getCharArray(beginPlTlvLength284,PL_TLV_LENGTH_284_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plTlvLength284IsNumeric() {
	    return isNumeric(beginPlTlvLength284
	                    ,beginPlTlvLength284 + PL_TLV_LENGTH_284_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PL_TLV_LENGTH_284_LEN = 1;
  	/**
	 * serializePlTlvLength284
	 */
	protected void serializePlTlvLength284(int plTlvLength284) {
		 putNumber(beginPlTlvLength284,plTlvLength284,PL_TLV_LENGTH_284_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlTlvLength284Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlTlvLength284
	 */
   	protected  int serializePlTlvLength284(char[] value) {
	    int  plTlvLength284;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plTlvLength284 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginPlTlvLength284
		       ,1
		      );
		 localPlTlvLength284Counter = shareString.getSerializedField().getModifiedCounter();
		return  plTlvLength284;
    }

   protected int checkPlTlvLength284MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlTlvLength284 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPlTlvLength284() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginPlTlvLength284
			                 ,PL_TLV_LENGTH_284_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plTlvLength284", beginPlTlvLength284,PL_TLV_LENGTH_284_LEN);
    }
   	}
     int localPlPayloadType284Counter = -1;
     public boolean isPlPayloadType284Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlPayloadType284Counter != sharedCounter;
         localPlPayloadType284Counter = sharedCounter; return hasModified;
     }
	protected static final int PL_PAYLOAD_TYPE_284_LEN = 4;
	/**
	 * 	serialize this PlPayloadType284
	 */
   protected void serializePlPayloadType284(char[] plPayloadType284) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plPayloadType284,0,getStringValue(),beginPlPayloadType284,PL_PAYLOAD_TYPE_284_LEN);
       localPlPayloadType284Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlPayloadType284Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshPlPayloadType284 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlPayloadType284() {	 
   		return (substring(getStringValue(),beginPlPayloadType284,beginPlPayloadType284 + PL_PAYLOAD_TYPE_284_LEN));
   	}
     int localPlPayloadLnth284Counter = -1;
     public boolean isPlPayloadLnth284Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlPayloadLnth284Counter != sharedCounter;
         localPlPayloadLnth284Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of plPayloadLnth284
	 *	@return plPayloadLnth284
	 */
	public char[]  getPlPayloadLnth284String() {
	     return getCharArray(beginPlPayloadLnth284,PL_PAYLOAD_LNTH_284_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean plPayloadLnth284IsNumeric() {
	    return isNumeric(beginPlPayloadLnth284
	                    ,beginPlPayloadLnth284 + PL_PAYLOAD_LNTH_284_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PL_PAYLOAD_LNTH_284_LEN = 6;
  	/**
	 * serializePlPayloadLnth284
	 */
	protected void serializePlPayloadLnth284(long plPayloadLnth284) {
		 putNumber(beginPlPayloadLnth284,plPayloadLnth284,PL_PAYLOAD_LNTH_284_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPlPayloadLnth284Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePlPayloadLnth284
	 */
   	protected  long serializePlPayloadLnth284(char[] value) {
	    long  plPayloadLnth284;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    plPayloadLnth284 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginPlPayloadLnth284
		       ,6
		      );
		 localPlPayloadLnth284Counter = shareString.getSerializedField().getModifiedCounter();
		return  plPayloadLnth284;
    }

   protected long checkPlPayloadLnth284MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPlPayloadLnth284 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPlPayloadLnth284() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPlPayloadLnth284
			                 ,PL_PAYLOAD_LNTH_284_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("plPayloadLnth284", beginPlPayloadLnth284,PL_PAYLOAD_LNTH_284_LEN);
    }
   	}
     int localPlPayloadData284Counter = -1;
     public boolean isPlPayloadData284Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPlPayloadData284Counter != sharedCounter;
         localPlPayloadData284Counter = sharedCounter; return hasModified;
     }
	protected static final int PL_PAYLOAD_DATA_284_LEN = 2000;
	/**
	 * 	serialize this PlPayloadData284
	 */
   protected void serializePlPayloadData284(char[] plPayloadData284) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(plPayloadData284,0,getStringValue(),beginPlPayloadData284,PL_PAYLOAD_DATA_284_LEN);
       localPlPayloadData284Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkPlPayloadData284Constraints(char[] value) {
   			return super.checkConstraints(value , 2000 ,false, false);
   }
    /**
	 *	refreshPlPayloadData284 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshPlPayloadData284() {	 
   		return (substring(getStringValue(),beginPlPayloadData284,beginPlPayloadData284 + PL_PAYLOAD_DATA_284_LEN));
   	}




}
  
