package com.cloudframe.app.init1.dto.serialize;

/**
*  The class NoFillerSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NoFillerSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NoFillerSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NO_FILLER_LENGTH = 86;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerd;
            protected  int beginWsbiypAddedSw;
            protected  int beginBiypPriorCnt;
	
	/**
	* Constructor for NoFillerSerialized
	**/
    public NoFillerSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in NoFillerSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NO_FILLER_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginFillerd = getStartOffset() + 52;	// set offset for serialization
  
  
             beginWsbiypAddedSw = getStartOffset() + 83;	// set offset for serialization
  
             beginBiypPriorCnt = getStartOffset() + 84;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localFillerdCounter = -1;
         public boolean isFillerdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFillerdCounter != sharedCounter;
            localFillerdCounter = sharedCounter; return hasModified; 
         }
   protected static final int FILLERD_LEN = 4;
  	/**
	 * serializeFillerd
	 */
	protected void serializeFillerd(int fillerd) {
           replaceValue( //  save the value as string
                   getBinaryString( fillerd,FILLERD_LEN)
                  ,beginFillerd
                  ,FILLERD_LEN
                 );
            localFillerdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFillerdMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFillerd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFillerd() {	 
			return (getInt(beginFillerd));
   	}
     int localWsbiypAddedSwCounter = -1;
     public boolean isWsbiypAddedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsbiypAddedSwCounter != sharedCounter;
         localWsbiypAddedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int WSBIYP_ADDED_SW_LEN = 1;
	/**
	 * 	serialize this WsbiypAddedSw
	 */
   protected void serializeWsbiypAddedSw(char[] wsbiypAddedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsbiypAddedSw,0,getStringValue(),beginWsbiypAddedSw,WSBIYP_ADDED_SW_LEN);
       localWsbiypAddedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsbiypAddedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWsbiypAddedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsbiypAddedSw() {	 
   		return (substring(getStringValue(),beginWsbiypAddedSw,beginWsbiypAddedSw + WSBIYP_ADDED_SW_LEN));
   	}
     int localBiypPriorCntCounter = -1;
     public boolean isBiypPriorCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBiypPriorCntCounter != sharedCounter;
         localBiypPriorCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of biypPriorCnt
	 *	@return biypPriorCnt
	 */
	public char[]  getBiypPriorCntString() {
	     return getCharArray(beginBiypPriorCnt,BIYP_PRIOR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean biypPriorCntIsNumeric() {
	    return isNumeric(beginBiypPriorCnt
	                    ,beginBiypPriorCnt + BIYP_PRIOR_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BIYP_PRIOR_CNT_LEN = 2;
  	/**
	 * serializeBiypPriorCnt
	 */
	protected void serializeBiypPriorCnt(int biypPriorCnt) {
		 putNumber(beginBiypPriorCnt,biypPriorCnt,BIYP_PRIOR_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBiypPriorCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBiypPriorCnt
	 */
   	protected  int serializeBiypPriorCnt(char[] value) {
	    int  biypPriorCnt;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    biypPriorCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginBiypPriorCnt
		       ,2
		      );
		 localBiypPriorCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  biypPriorCnt;
    }

   protected int checkBiypPriorCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBiypPriorCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBiypPriorCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBiypPriorCnt
			                 ,BIYP_PRIOR_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("biypPriorCnt", beginBiypPriorCnt,BIYP_PRIOR_CNT_LEN);
    }
   	}




}
  
