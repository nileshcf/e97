package com.cloudframe.app.init1.dto.serialize;

/**
*  The class FillerBeginEnd1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FillerBeginEnd1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FillerBeginEnd1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILLER_BEGIN_END_1_LENGTH = 91;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWs9iypAddedSw;
            protected  int beginIypPriorCnt9;
            protected  int beginFiller6;
            protected  int beginFiller7;
	
	/**
	* Constructor for FillerBeginEnd1Serialized
	**/
    public FillerBeginEnd1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FillerBeginEnd1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILLER_BEGIN_END_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginWs9iypAddedSw = getStartOffset() + 80;	// set offset for serialization
  
             beginIypPriorCnt9 = getStartOffset() + 81;	// set offset for serialization
  
             beginFiller6 = getStartOffset() + 83;	// set offset for serialization
  
             beginFiller7 = getStartOffset() + 87;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWs9iypAddedSwCounter = -1;
     public boolean isWs9iypAddedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWs9iypAddedSwCounter != sharedCounter;
         localWs9iypAddedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int WS_9IYP_ADDED_SW_LEN = 1;
	/**
	 * 	serialize this Ws9iypAddedSw
	 */
   protected void serializeWs9iypAddedSw(char[] ws9iypAddedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ws9iypAddedSw,0,getStringValue(),beginWs9iypAddedSw,WS_9IYP_ADDED_SW_LEN);
       localWs9iypAddedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWs9iypAddedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWs9iypAddedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWs9iypAddedSw() {	 
   		return (substring(getStringValue(),beginWs9iypAddedSw,beginWs9iypAddedSw + WS_9IYP_ADDED_SW_LEN));
   	}
     int localIypPriorCnt9Counter = -1;
     public boolean isIypPriorCnt9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIypPriorCnt9Counter != sharedCounter;
         localIypPriorCnt9Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of iypPriorCnt9
	 *	@return iypPriorCnt9
	 */
	public char[]  getIypPriorCnt9String() {
	     return getCharArray(beginIypPriorCnt9,IYP_PRIOR_CNT_9_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean iypPriorCnt9IsNumeric() {
	    return isNumeric(beginIypPriorCnt9
	                    ,beginIypPriorCnt9 + IYP_PRIOR_CNT_9_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IYP_PRIOR_CNT_9_LEN = 2;
  	/**
	 * serializeIypPriorCnt9
	 */
	protected void serializeIypPriorCnt9(int iypPriorCnt9) {
		 putNumber(beginIypPriorCnt9,iypPriorCnt9,IYP_PRIOR_CNT_9_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIypPriorCnt9Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIypPriorCnt9
	 */
   	protected  int serializeIypPriorCnt9(char[] value) {
	    int  iypPriorCnt9;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    iypPriorCnt9 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginIypPriorCnt9
		       ,2
		      );
		 localIypPriorCnt9Counter = shareString.getSerializedField().getModifiedCounter();
		return  iypPriorCnt9;
    }

   protected int checkIypPriorCnt9MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIypPriorCnt9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIypPriorCnt9() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginIypPriorCnt9
			                 ,IYP_PRIOR_CNT_9_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("iypPriorCnt9", beginIypPriorCnt9,IYP_PRIOR_CNT_9_LEN);
    }
   	}
     int localFiller6Counter = -1;
     public boolean isFiller6Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller6Counter != sharedCounter;
         localFiller6Counter = sharedCounter; return hasModified; 
     }
   protected static final int FILLER_6_LEN = 4;
  	/**
	 * serializeFiller6
	 */
	protected void serializeFiller6(int filler6) {
           replaceValue( //  save the value as string
                   getBinaryString( filler6,FILLER_6_LEN)
                  ,beginFiller6
                  ,FILLER_6_LEN
                 );
            localFiller6Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFiller6MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFiller6 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFiller6() {	 
			return (getInt(beginFiller6));
   	}
     int localFiller7Counter = -1;
     public boolean isFiller7Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller7Counter != sharedCounter;
         localFiller7Counter = sharedCounter; return hasModified; 
     }
   protected static final int FILLER_7_LEN = 4;
  	/**
	 * serializeFiller7
	 */
	protected void serializeFiller7(int filler7) {
           replaceValue( //  save the value as string
                   getBinaryString( filler7,FILLER_7_LEN)
                  ,beginFiller7
                  ,FILLER_7_LEN
                 );
            localFiller7Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFiller7MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFiller7 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFiller7() {	 
			return (getInt(beginFiller7));
   	}




}
  
