package com.cloudframe.app.edjaddrs.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNumericZs;
            protected  int beginCce;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNumericZs = getStartOffset() + 0;	// set offset for serialization
  
             beginCce = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localNumericZsCounter = -1;
     public boolean isNumericZsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNumericZsCounter != sharedCounter;
         localNumericZsCounter = sharedCounter; return hasModified;
     }
	protected static final int NUMERIC_ZS_LEN = 18;
	/**
	 * 	serialize this NumericZs
	 */
   protected void serializeNumericZs(char[] numericZs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(numericZs,0,getStringValue(),beginNumericZs,NUMERIC_ZS_LEN);
       localNumericZsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNumericZsConstraints(char[] value) {
   			return super.checkConstraints(value , 18 ,false, false);
   }
    /**
	 *	refreshNumericZs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNumericZs() {	 
   		return (substring(getStringValue(),beginNumericZs,beginNumericZs + NUMERIC_ZS_LEN));
   	}
     int localCceCounter = -1;
     public boolean isCceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCceCounter != sharedCounter;
         localCceCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of cce
	 *	@return cce
	 */
	public char[]  getCceString() {
	     return getCharArray(beginCce,CCE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean cceIsNumeric() {
	    return isNumeric(beginCce
	                    ,beginCce + CCE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int CCE_LEN = 4;
  	/**
	 * serializeCce
	 */
	protected void serializeCce(int cce) {
		 putNumber(beginCce,cce,CCE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localCceCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeCce
	 */
   	protected  int serializeCce(char[] value) {
	    int  cce;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    cce = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginCce
		       ,4
		      );
		 localCceCounter = shareString.getSerializedField().getModifiedCounter();
		return  cce;
    }

   protected int checkCceMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshCce is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshCce() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginCce
			                 ,CCE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("cce", beginCce,CCE_LEN);
    }
   	}




}
  
