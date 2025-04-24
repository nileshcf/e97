package com.cloudframe.app.search0.dto.serialize;

/**
*  The class ResultNumberGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:42. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ResultNumberGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultNumberGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_NUMBER_GROUP_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginResultNumber;
	
	/**
	* Constructor for ResultNumberGroupSerialized
	**/
    public ResultNumberGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ResultNumberGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_NUMBER_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginResultNumber = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localResultNumberCounter = -1;
     public boolean isResultNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localResultNumberCounter != sharedCounter;
         localResultNumberCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of resultNumber
	 *	@return resultNumber
	 */
	public char[]  getResultNumberString() {
	     return getCharArray(beginResultNumber,RESULT_NUMBER_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean resultNumberIsNumeric() {
	    return isNumeric(beginResultNumber
	                    ,beginResultNumber + RESULT_NUMBER_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int RESULT_NUMBER_LEN = 5;
  	/**
	 * serializeResultNumber
	 */
	protected void serializeResultNumber(long resultNumber) {
		 putNumber(beginResultNumber,resultNumber,RESULT_NUMBER_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localResultNumberCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeResultNumber
	 */
   	protected  long serializeResultNumber(char[] value) {
	    long  resultNumber;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    resultNumber = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginResultNumber
		       ,5
		      );
		 localResultNumberCounter = shareString.getSerializedField().getModifiedCounter();
		return  resultNumber;
    }

   protected long checkResultNumberMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshResultNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshResultNumber() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginResultNumber
			                 ,RESULT_NUMBER_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("resultNumber", beginResultNumber,RESULT_NUMBER_LEN);
    }
   	}




}
  
