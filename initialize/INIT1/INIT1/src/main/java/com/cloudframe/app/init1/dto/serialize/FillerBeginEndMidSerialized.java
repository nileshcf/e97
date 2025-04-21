package com.cloudframe.app.init1.dto.serialize;

/**
*  The class FillerBeginEndMidSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:53. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FillerBeginEndMidSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FillerBeginEndMidSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILLER_BEGIN_END_MID_LENGTH = 115;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs8iypAddedSw;
            protected  int beginIypPriorCnt8;
	
	/**
	* Constructor for FillerBeginEndMidSerialized
	**/
    public FillerBeginEndMidSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FillerBeginEndMidSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILLER_BEGIN_END_MID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
             beginWs8iypAddedSw = getStartOffset() + 104;	// set offset for serialization
  
             beginIypPriorCnt8 = getStartOffset() + 105;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localWs8iypAddedSwCounter = -1;
     public boolean isWs8iypAddedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs8iypAddedSwCounter != sharedCounter;
         localWs8iypAddedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_8IYP_ADDED_SW_LEN = 1;
	/**
	 * 	serialize this Ws8iypAddedSw
	 */
   protected void serializeWs8iypAddedSw(char[] ws8iypAddedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws8iypAddedSw,0,getStringValue(),beginWs8iypAddedSw,WS_8IYP_ADDED_SW_LEN);
       localWs8iypAddedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs8iypAddedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWs8iypAddedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs8iypAddedSw() {	 
   		return (substring(getStringValue(),beginWs8iypAddedSw,beginWs8iypAddedSw + WS_8IYP_ADDED_SW_LEN));
   	}
     int localIypPriorCnt8Counter = -1;
     public boolean isIypPriorCnt8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIypPriorCnt8Counter != sharedCounter;
         localIypPriorCnt8Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iypPriorCnt8
	 *	@return iypPriorCnt8
	 */
	public char[]  getIypPriorCnt8String() {
	     return getCharArray(beginIypPriorCnt8,IYP_PRIOR_CNT_8_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iypPriorCnt8IsNumeric() {
	    return isNumeric(beginIypPriorCnt8
	                    ,beginIypPriorCnt8 + IYP_PRIOR_CNT_8_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IYP_PRIOR_CNT_8_LEN = 2;
  	/**
	 * serializeIypPriorCnt8
	 */
	protected void serializeIypPriorCnt8(int iypPriorCnt8) {
		 putNumber(beginIypPriorCnt8,iypPriorCnt8,IYP_PRIOR_CNT_8_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIypPriorCnt8Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIypPriorCnt8
	 */
   	protected  int serializeIypPriorCnt8(char[] value) {
	    int  iypPriorCnt8;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iypPriorCnt8 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIypPriorCnt8
		       ,2
		      );
		 localIypPriorCnt8Counter = shareString.getSerializedField().getModifiedCounter();
		return  iypPriorCnt8;
    }

   protected int checkIypPriorCnt8MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIypPriorCnt8 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIypPriorCnt8() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIypPriorCnt8
			                 ,IYP_PRIOR_CNT_8_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iypPriorCnt8", beginIypPriorCnt8,IYP_PRIOR_CNT_8_LEN);
    }
   	}




}
  
