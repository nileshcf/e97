package com.cloudframe.app.search0.dto.serialize;

/**
*  The class SecondNumberGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SecondNumberGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SecondNumberGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SECOND_NUMBER_GROUP_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSecondNumber;
	
	/**
	* Constructor for SecondNumberGroupSerialized
	**/
    public SecondNumberGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in SecondNumberGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SECOND_NUMBER_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSecondNumber = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSecondNumberCounter = -1;
     public boolean isSecondNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSecondNumberCounter != sharedCounter;
         localSecondNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of secondNumber
	 *	@return secondNumber
	 */
	public char[]  getSecondNumberString() {
	     return getCharArray(beginSecondNumber,SECOND_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean secondNumberIsNumeric() {
	    return isNumeric(beginSecondNumber
	                    ,beginSecondNumber + SECOND_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int SECOND_NUMBER_LEN = 5;
  	/**
	 * serializeSecondNumber
	 */
	protected void serializeSecondNumber(long secondNumber) {
		 putNumber(beginSecondNumber,secondNumber,SECOND_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSecondNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeSecondNumber
	 */
   	protected  long serializeSecondNumber(char[] value) {
	    long  secondNumber;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    secondNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginSecondNumber
		       ,5
		      );
		 localSecondNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  secondNumber;
    }

   protected long checkSecondNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshSecondNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshSecondNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginSecondNumber
			                 ,SECOND_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("secondNumber", beginSecondNumber,SECOND_NUMBER_LEN);
    }
   	}




}
  
