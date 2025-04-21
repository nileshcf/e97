package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class De48Se24SfLenGroup500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class De48Se24SfLenGroup500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(De48Se24SfLenGroup500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_48_SE_24_SF_LEN_GROUP_500_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDe48Se24SfLen500;
            protected  int beginDe48Se24SfLen9500;
	
	/**
	* Constructor for De48Se24SfLenGroup500Serialized
	**/
    public De48Se24SfLenGroup500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in De48Se24SfLenGroup500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_48_SE_24_SF_LEN_GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDe48Se24SfLen500 = getStartOffset() + 0;	// set offset for serialization
  
             beginDe48Se24SfLen9500 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDe48Se24SfLen500Counter = -1;
     public boolean isDe48Se24SfLen500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se24SfLen500Counter != sharedCounter;
         localDe48Se24SfLen500Counter = sharedCounter; return hasModified;
     }
	protected static final int DE_48_SE_24_SF_LEN_500_LEN = 2;
	/**
	 * 	serialize this De48Se24SfLen500
	 */
   protected void serializeDe48Se24SfLen500(char[] de48Se24SfLen500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(de48Se24SfLen500,0,getStringValue(),beginDe48Se24SfLen500,DE_48_SE_24_SF_LEN_500_LEN);
       localDe48Se24SfLen500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDe48Se24SfLen500Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDe48Se24SfLen500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDe48Se24SfLen500() {	 
   		return (substring(getStringValue(),beginDe48Se24SfLen500,beginDe48Se24SfLen500 + DE_48_SE_24_SF_LEN_500_LEN));
   	}
     int localDe48Se24SfLen9500Counter = -1;
     public boolean isDe48Se24SfLen9500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDe48Se24SfLen9500Counter != sharedCounter;
         localDe48Se24SfLen9500Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of de48Se24SfLen9500
	 *	@return de48Se24SfLen9500
	 */
	public char[]  getDe48Se24SfLen9500String() {
	     return getCharArray(beginDe48Se24SfLen9500,DE_48_SE_24_SF_LEN_9500_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean de48Se24SfLen9500IsNumeric() {
	    return isNumeric(beginDe48Se24SfLen9500
	                    ,beginDe48Se24SfLen9500 + DE_48_SE_24_SF_LEN_9500_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_48_SE_24_SF_LEN_9500_LEN = 2;
  	/**
	 * serializeDe48Se24SfLen9500
	 */
	protected void serializeDe48Se24SfLen9500(int de48Se24SfLen9500) {
		 putNumber(beginDe48Se24SfLen9500,de48Se24SfLen9500,DE_48_SE_24_SF_LEN_9500_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDe48Se24SfLen9500Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDe48Se24SfLen9500
	 */
   	protected  int serializeDe48Se24SfLen9500(char[] value) {
	    int  de48Se24SfLen9500;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    de48Se24SfLen9500 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginDe48Se24SfLen9500
		       ,2
		      );
		 localDe48Se24SfLen9500Counter = shareString.getSerializedField().getModifiedCounter();
		return  de48Se24SfLen9500;
    }

   protected int checkDe48Se24SfLen9500MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDe48Se24SfLen9500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDe48Se24SfLen9500() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDe48Se24SfLen9500
			                 ,DE_48_SE_24_SF_LEN_9500_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("de48Se24SfLen9500", beginDe48Se24SfLen9500,DE_48_SE_24_SF_LEN_9500_LEN);
    }
   	}




}
  
