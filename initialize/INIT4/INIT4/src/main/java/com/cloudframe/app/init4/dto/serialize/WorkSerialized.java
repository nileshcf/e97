package com.cloudframe.app.init4.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:56. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginI;
	
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
             beginI = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localICounter = -1;
     public boolean isIModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localICounter != sharedCounter;
         localICounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of i
	 *	@return i
	 */
	public char[]  getIString() {
	     return getCharArray(beginI,I_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iIsNumeric() {
	    return isNumeric(beginI
	                    ,beginI + I_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int I_LEN = 1;
  	/**
	 * serializeI
	 */
	protected void serializeI(int i) {
		 putNumber(beginI,i,I_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localICounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeI
	 */
   	protected  int serializeI(char[] value) {
	    int  i;
	    if(value.length >0 && value.length!= 1)
            value = new String(value).trim().toCharArray();
	    if (value.length < 1) value = pad(1, value, ' ', LEFT_PAD);
	    else if (value.length > 1) value = substring(value,0,1);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    i = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(1,value,false/*isSigned?*/)
		       ,beginI
		       ,1
		      );
		 localICounter = shareString.getSerializedField().getModifiedCounter();
		return  i;
    }

   protected int checkIMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshI() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginI
			                 ,I_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("i", beginI,I_LEN);
    }
   	}




}
  
