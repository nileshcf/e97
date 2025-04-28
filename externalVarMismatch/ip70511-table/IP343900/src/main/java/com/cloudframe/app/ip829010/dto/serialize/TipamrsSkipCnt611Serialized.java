package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class TipamrsSkipCnt611Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TipamrsSkipCnt611Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TipamrsSkipCnt611Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TIPAMRS_SKIP_CNT_611_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMrsSkipCnt611;
	
	/**
	* Constructor for TipamrsSkipCnt611Serialized
	**/
    public TipamrsSkipCnt611Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TipamrsSkipCnt611Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TIPAMRS_SKIP_CNT_611_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginMrsSkipCnt611 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMrsSkipCnt611Counter = -1;
     public boolean isMrsSkipCnt611Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMrsSkipCnt611Counter != sharedCounter;
         localMrsSkipCnt611Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mrsSkipCnt611
	 *	@return mrsSkipCnt611
	 */
	public char[]  getMrsSkipCnt611String() {
	     return getCharArray(beginMrsSkipCnt611,MRS_SKIP_CNT_611_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mrsSkipCnt611IsNumeric() {
	    return isNumeric(beginMrsSkipCnt611
	                    ,beginMrsSkipCnt611 + MRS_SKIP_CNT_611_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MRS_SKIP_CNT_611_LEN = 9;
  	/**
	 * serializeMrsSkipCnt611
	 */
	protected void serializeMrsSkipCnt611(long mrsSkipCnt611) {
		 putNumber(beginMrsSkipCnt611,mrsSkipCnt611,MRS_SKIP_CNT_611_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMrsSkipCnt611Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMrsSkipCnt611
	 */
   	protected  long serializeMrsSkipCnt611(char[] value) {
	    long  mrsSkipCnt611;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mrsSkipCnt611 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginMrsSkipCnt611
		       ,9
		      );
		 localMrsSkipCnt611Counter = shareString.getSerializedField().getModifiedCounter();
		return  mrsSkipCnt611;
    }

   protected long checkMrsSkipCnt611MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMrsSkipCnt611 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMrsSkipCnt611() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMrsSkipCnt611
			                 ,MRS_SKIP_CNT_611_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mrsSkipCnt611", beginMrsSkipCnt611,MRS_SKIP_CNT_611_LEN);
    }
   	}




}
  
