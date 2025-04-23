package com.cloudframe.app.init1.dto.serialize;

/**
*  The class IypData6Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IypData6Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IypData6Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IYP_DATA_6_LENGTH = 99;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs6iypAddedSw;
            protected  int beginIypPriorCnt6;
	
	/**
	* Constructor for IypData6Serialized
	**/
    public IypData6Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in IypData6Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IYP_DATA_6_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginWs6iypAddedSw = getStartOffset() + 96;	// set offset for serialization
  
             beginIypPriorCnt6 = getStartOffset() + 97;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs6iypAddedSwCounter = -1;
     public boolean isWs6iypAddedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs6iypAddedSwCounter != sharedCounter;
         localWs6iypAddedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_6IYP_ADDED_SW_LEN = 1;
	/**
	 * 	serialize this Ws6iypAddedSw
	 */
   protected void serializeWs6iypAddedSw(char[] ws6iypAddedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws6iypAddedSw,0,getStringValue(),beginWs6iypAddedSw,WS_6IYP_ADDED_SW_LEN);
       localWs6iypAddedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs6iypAddedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWs6iypAddedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs6iypAddedSw() {	 
   		return (substring(getStringValue(),beginWs6iypAddedSw,beginWs6iypAddedSw + WS_6IYP_ADDED_SW_LEN));
   	}
     int localIypPriorCnt6Counter = -1;
     public boolean isIypPriorCnt6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIypPriorCnt6Counter != sharedCounter;
         localIypPriorCnt6Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iypPriorCnt6
	 *	@return iypPriorCnt6
	 */
	public char[]  getIypPriorCnt6String() {
	     return getCharArray(beginIypPriorCnt6,IYP_PRIOR_CNT_6_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iypPriorCnt6IsNumeric() {
	    return isNumeric(beginIypPriorCnt6
	                    ,beginIypPriorCnt6 + IYP_PRIOR_CNT_6_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IYP_PRIOR_CNT_6_LEN = 2;
  	/**
	 * serializeIypPriorCnt6
	 */
	protected void serializeIypPriorCnt6(int iypPriorCnt6) {
		 putNumber(beginIypPriorCnt6,iypPriorCnt6,IYP_PRIOR_CNT_6_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIypPriorCnt6Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIypPriorCnt6
	 */
   	protected  int serializeIypPriorCnt6(char[] value) {
	    int  iypPriorCnt6;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iypPriorCnt6 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIypPriorCnt6
		       ,2
		      );
		 localIypPriorCnt6Counter = shareString.getSerializedField().getModifiedCounter();
		return  iypPriorCnt6;
    }

   protected int checkIypPriorCnt6MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIypPriorCnt6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIypPriorCnt6() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIypPriorCnt6
			                 ,IYP_PRIOR_CNT_6_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iypPriorCnt6", beginIypPriorCnt6,IYP_PRIOR_CNT_6_LEN);
    }
   	}




}
  
