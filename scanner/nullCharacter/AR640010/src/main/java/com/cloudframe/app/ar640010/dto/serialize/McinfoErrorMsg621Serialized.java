package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class McinfoErrorMsg621Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:49. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class McinfoErrorMsg621Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(McinfoErrorMsg621Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCINFO_ERROR_MSG_621_LENGTH = 48;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMcinfoReturnCode621;
	
	/**
	* Constructor for McinfoErrorMsg621Serialized
	**/
    public McinfoErrorMsg621Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in McinfoErrorMsg621Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCINFO_ERROR_MSG_621_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMcinfoReturnCode621 = getStartOffset() + 44;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMcinfoReturnCode621Counter = -1;
     public boolean isMcinfoReturnCode621Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcinfoReturnCode621Counter != sharedCounter;
         localMcinfoReturnCode621Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mcinfoReturnCode621
	 *	@return mcinfoReturnCode621
	 */
	public char[]  getMcinfoReturnCode621String() {
	     return getCharArray(beginMcinfoReturnCode621,MCINFO_RETURN_CODE_621_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mcinfoReturnCode621IsNumeric() {
	    return isNumeric(beginMcinfoReturnCode621
	                    ,beginMcinfoReturnCode621 + MCINFO_RETURN_CODE_621_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MCINFO_RETURN_CODE_621_LEN = 4;
  	/**
	 * serializeMcinfoReturnCode621
	 */
	protected void serializeMcinfoReturnCode621(int mcinfoReturnCode621) {
		 putNumber(beginMcinfoReturnCode621,mcinfoReturnCode621,MCINFO_RETURN_CODE_621_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMcinfoReturnCode621Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMcinfoReturnCode621
	 */
   	protected  int serializeMcinfoReturnCode621(char[] value) {
	    int  mcinfoReturnCode621;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mcinfoReturnCode621 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginMcinfoReturnCode621
		       ,4
		      );
		 localMcinfoReturnCode621Counter = shareString.getSerializedField().getModifiedCounter();
		return  mcinfoReturnCode621;
    }

   protected int checkMcinfoReturnCode621MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMcinfoReturnCode621 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMcinfoReturnCode621() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMcinfoReturnCode621
			                 ,MCINFO_RETURN_CODE_621_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mcinfoReturnCode621", beginMcinfoReturnCode621,MCINFO_RETURN_CODE_621_LEN);
    }
   	}




}
  
