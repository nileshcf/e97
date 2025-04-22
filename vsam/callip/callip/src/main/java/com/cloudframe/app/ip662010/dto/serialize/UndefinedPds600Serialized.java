package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class UndefinedPds600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class UndefinedPds600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(UndefinedPds600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int UNDEFINED_PDS_600_LENGTH = 40;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginUndefinedPdsNo600;
	
	/**
	* Constructor for UndefinedPds600Serialized
	**/
    public UndefinedPds600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in UndefinedPds600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(UNDEFINED_PDS_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginUndefinedPdsNo600 = getStartOffset() + 36;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localUndefinedPdsNo600Counter = -1;
     public boolean isUndefinedPdsNo600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUndefinedPdsNo600Counter != sharedCounter;
         localUndefinedPdsNo600Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of undefinedPdsNo600
	 *	@return undefinedPdsNo600
	 */
	public char[]  getUndefinedPdsNo600String() {
	     return getCharArray(beginUndefinedPdsNo600,UNDEFINED_PDS_NO_600_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean undefinedPdsNo600IsNumeric() {
	    return isNumeric(beginUndefinedPdsNo600
	                    ,beginUndefinedPdsNo600 + UNDEFINED_PDS_NO_600_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int UNDEFINED_PDS_NO_600_LEN = 4;
  	/**
	 * serializeUndefinedPdsNo600
	 */
	protected void serializeUndefinedPdsNo600(int undefinedPdsNo600) {
		 putNumber(beginUndefinedPdsNo600,undefinedPdsNo600,UNDEFINED_PDS_NO_600_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localUndefinedPdsNo600Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeUndefinedPdsNo600
	 */
   	protected  int serializeUndefinedPdsNo600(char[] value) {
	    int  undefinedPdsNo600;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    undefinedPdsNo600 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginUndefinedPdsNo600
		       ,4
		      );
		 localUndefinedPdsNo600Counter = shareString.getSerializedField().getModifiedCounter();
		return  undefinedPdsNo600;
    }

   protected int checkUndefinedPdsNo600MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshUndefinedPdsNo600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshUndefinedPdsNo600() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginUndefinedPdsNo600
			                 ,UNDEFINED_PDS_NO_600_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("undefinedPdsNo600", beginUndefinedPdsNo600,UNDEFINED_PDS_NO_600_LEN);
    }
   	}




}
  
