package com.cloudframe.app.init1.dto.serialize;

/**
*  The class FillerBeginEndSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FillerBeginEndSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FillerBeginEndSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILLER_BEGIN_END_LENGTH = 106;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs7iypAddedSw;
            protected  int beginIypPriorCnt7;
	
	/**
	* Constructor for FillerBeginEndSerialized
	**/
    public FillerBeginEndSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FillerBeginEndSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILLER_BEGIN_END_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginWs7iypAddedSw = getStartOffset() + 96;	// set offset for serialization
  
             beginIypPriorCnt7 = getStartOffset() + 97;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localWs7iypAddedSwCounter = -1;
     public boolean isWs7iypAddedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs7iypAddedSwCounter != sharedCounter;
         localWs7iypAddedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_7IYP_ADDED_SW_LEN = 1;
	/**
	 * 	serialize this Ws7iypAddedSw
	 */
   protected void serializeWs7iypAddedSw(char[] ws7iypAddedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws7iypAddedSw,0,getStringValue(),beginWs7iypAddedSw,WS_7IYP_ADDED_SW_LEN);
       localWs7iypAddedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs7iypAddedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWs7iypAddedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs7iypAddedSw() {	 
   		return (substring(getStringValue(),beginWs7iypAddedSw,beginWs7iypAddedSw + WS_7IYP_ADDED_SW_LEN));
   	}
     int localIypPriorCnt7Counter = -1;
     public boolean isIypPriorCnt7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIypPriorCnt7Counter != sharedCounter;
         localIypPriorCnt7Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iypPriorCnt7
	 *	@return iypPriorCnt7
	 */
	public char[]  getIypPriorCnt7String() {
	     return getCharArray(beginIypPriorCnt7,IYP_PRIOR_CNT_7_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iypPriorCnt7IsNumeric() {
	    return isNumeric(beginIypPriorCnt7
	                    ,beginIypPriorCnt7 + IYP_PRIOR_CNT_7_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IYP_PRIOR_CNT_7_LEN = 2;
  	/**
	 * serializeIypPriorCnt7
	 */
	protected void serializeIypPriorCnt7(int iypPriorCnt7) {
		 putNumber(beginIypPriorCnt7,iypPriorCnt7,IYP_PRIOR_CNT_7_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIypPriorCnt7Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIypPriorCnt7
	 */
   	protected  int serializeIypPriorCnt7(char[] value) {
	    int  iypPriorCnt7;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iypPriorCnt7 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIypPriorCnt7
		       ,2
		      );
		 localIypPriorCnt7Counter = shareString.getSerializedField().getModifiedCounter();
		return  iypPriorCnt7;
    }

   protected int checkIypPriorCnt7MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIypPriorCnt7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIypPriorCnt7() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIypPriorCnt7
			                 ,IYP_PRIOR_CNT_7_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iypPriorCnt7", beginIypPriorCnt7,IYP_PRIOR_CNT_7_LEN);
    }
   	}




}
  
