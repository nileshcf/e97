package com.cloudframe.app.ip989010.dto.serialize;

/**
*  The class DeStrTag300Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DeStrTag300Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DeStrTag300Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DE_STR_TAG_300_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDeStrCd300;
	
	/**
	* Constructor for DeStrTag300Serialized
	**/
    public DeStrTag300Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DeStrTag300Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DE_STR_TAG_300_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDeStrCd300 = getStartOffset() + 10;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localDeStrCd300Counter = -1;
     public boolean isDeStrCd300Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDeStrCd300Counter != sharedCounter;
         localDeStrCd300Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of deStrCd300
	 *	@return deStrCd300
	 */
	public char[]  getDeStrCd300String() {
	     return getCharArray(beginDeStrCd300,DE_STR_CD_300_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean deStrCd300IsNumeric() {
	    return isNumeric(beginDeStrCd300
	                    ,beginDeStrCd300 + DE_STR_CD_300_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int DE_STR_CD_300_LEN = 3;
  	/**
	 * serializeDeStrCd300
	 */
	protected void serializeDeStrCd300(int deStrCd300) {
		 putNumber(beginDeStrCd300,deStrCd300,DE_STR_CD_300_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDeStrCd300Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeDeStrCd300
	 */
   	protected  int serializeDeStrCd300(char[] value) {
	    int  deStrCd300;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    deStrCd300 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginDeStrCd300
		       ,3
		      );
		 localDeStrCd300Counter = shareString.getSerializedField().getModifiedCounter();
		return  deStrCd300;
    }

   protected int checkDeStrCd300MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshDeStrCd300 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshDeStrCd300() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginDeStrCd300
			                 ,DE_STR_CD_300_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("deStrCd300", beginDeStrCd300,DE_STR_CD_300_LEN);
    }
   	}




}
  
