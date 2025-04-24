package com.cloudframe.app.var88grp.dto.serialize;

/**
*  The class GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:47. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUP_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNumbers;
	
	/**
	* Constructor for GroupSerialized
	**/
    public GroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNumbers = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNumbersCounter = -1;
     public boolean isNumbersModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumbersCounter != sharedCounter;
         localNumbersCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of numbers
	 *	@return numbers
	 */
	public char[]  getNumbersString() {
	     return getCharArray(beginNumbers,NUMBERS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean numbersIsNumeric() {
	    return isNumeric(beginNumbers
	                    ,beginNumbers + NUMBERS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int NUMBERS_LEN = 1;
  	/**
	 * serializeNumbers
	 */
	protected void serializeNumbers(int numbers) {
		 putNumber(beginNumbers,numbers,NUMBERS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localNumbersCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeNumbers
	 */
   	protected  int serializeNumbers(char[] value) {
	    int  numbers;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    numbers = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginNumbers
		       ,1
		      );
		 localNumbersCounter = shareString.getSerializedField().getModifiedCounter();
		return  numbers;
    }

   protected int checkNumbersMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshNumbers is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshNumbers() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginNumbers
			                 ,NUMBERS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("numbers", beginNumbers,NUMBERS_LEN);
    }
   	}




}
  
