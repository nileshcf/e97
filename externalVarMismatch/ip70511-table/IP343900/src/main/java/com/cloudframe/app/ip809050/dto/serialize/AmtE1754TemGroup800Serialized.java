package com.cloudframe.app.ip809050.dto.serialize;

/**
*  The class AmtE1754TemGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:26. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AmtE1754TemGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AmtE1754TemGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AMT_E_1754_TEM_GROUP_800_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAmtE1754Tem800;
	
	/**
	* Constructor for AmtE1754TemGroup800Serialized
	**/
    public AmtE1754TemGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in AmtE1754TemGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AMT_E_1754_TEM_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAmtE1754Tem800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAmtE1754Tem800Counter = -1;
     public boolean isAmtE1754Tem800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAmtE1754Tem800Counter != sharedCounter;
         localAmtE1754Tem800Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of amtE1754Tem800
	 *	@return amtE1754Tem800
	 */
	public char[]  getAmtE1754Tem800String() {
	     return getCharArray(beginAmtE1754Tem800,AMT_E_1754_TEM_800_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean amtE1754Tem800IsNumeric() {
	    return isNumeric(beginAmtE1754Tem800
	                    ,beginAmtE1754Tem800 + AMT_E_1754_TEM_800_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AMT_E_1754_TEM_800_LEN = 12;
  	/**
	 * serializeAmtE1754Tem800
	 */
	protected void serializeAmtE1754Tem800(long amtE1754Tem800) {
		 putNumber(beginAmtE1754Tem800,amtE1754Tem800,AMT_E_1754_TEM_800_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAmtE1754Tem800Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAmtE1754Tem800
	 */
   	protected  long serializeAmtE1754Tem800(char[] value) {
	    long  amtE1754Tem800;
	    if(value.length >0 && value.length!= 12)
            value = new String(value).trim().toCharArray();
	    if (value.length < 12) value = pad(12, value, ' ', LEFT_PAD);
	    else if (value.length > 12) value = substring(value,0,12);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    amtE1754Tem800 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginAmtE1754Tem800
		       ,12
		      );
		 localAmtE1754Tem800Counter = shareString.getSerializedField().getModifiedCounter();
		return  amtE1754Tem800;
    }

   protected long checkAmtE1754Tem800MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1T/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAmtE1754Tem800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshAmtE1754Tem800() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginAmtE1754Tem800
			                 ,AMT_E_1754_TEM_800_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("amtE1754Tem800", beginAmtE1754Tem800,AMT_E_1754_TEM_800_LEN);
    }
   	}




}
  
