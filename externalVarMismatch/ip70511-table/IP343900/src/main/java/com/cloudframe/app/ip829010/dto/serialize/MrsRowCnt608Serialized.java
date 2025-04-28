package com.cloudframe.app.ip829010.dto.serialize;

/**
*  The class MrsRowCnt608Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MrsRowCnt608Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MrsRowCnt608Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MRS_ROW_CNT_608_LENGTH = 61;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMrsIsrtCnt608;
	
	/**
	* Constructor for MrsRowCnt608Serialized
	**/
    public MrsRowCnt608Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MrsRowCnt608Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MRS_ROW_CNT_608_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginMrsIsrtCnt608 = getStartOffset() + 52;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMrsIsrtCnt608Counter = -1;
     public boolean isMrsIsrtCnt608Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMrsIsrtCnt608Counter != sharedCounter;
         localMrsIsrtCnt608Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of mrsIsrtCnt608
	 *	@return mrsIsrtCnt608
	 */
	public char[]  getMrsIsrtCnt608String() {
	     return getCharArray(beginMrsIsrtCnt608,MRS_ISRT_CNT_608_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean mrsIsrtCnt608IsNumeric() {
	    return isNumeric(beginMrsIsrtCnt608
	                    ,beginMrsIsrtCnt608 + MRS_ISRT_CNT_608_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MRS_ISRT_CNT_608_LEN = 9;
  	/**
	 * serializeMrsIsrtCnt608
	 */
	protected void serializeMrsIsrtCnt608(long mrsIsrtCnt608) {
		 putNumber(beginMrsIsrtCnt608,mrsIsrtCnt608,MRS_ISRT_CNT_608_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMrsIsrtCnt608Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMrsIsrtCnt608
	 */
   	protected  long serializeMrsIsrtCnt608(char[] value) {
	    long  mrsIsrtCnt608;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    mrsIsrtCnt608 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginMrsIsrtCnt608
		       ,9
		      );
		 localMrsIsrtCnt608Counter = shareString.getSerializedField().getModifiedCounter();
		return  mrsIsrtCnt608;
    }

   protected long checkMrsIsrtCnt608MaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMrsIsrtCnt608 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMrsIsrtCnt608() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMrsIsrtCnt608
			                 ,MRS_ISRT_CNT_608_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("mrsIsrtCnt608", beginMrsIsrtCnt608,MRS_ISRT_CNT_608_LEN);
    }
   	}




}
  
