package com.cloudframe.app.init1.dto.serialize;

/**
*  The class FillerBeginEndMid1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class FillerBeginEndMid1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(FillerBeginEndMid1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int FILLER_BEGIN_END_MID_1_LENGTH = 99;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFiller9;
            protected  int beginWsaiypAddedSw;
            protected  int beginAiypPriorCnt;
            protected  int beginFillera;
            protected  int beginFillerb;
	
	/**
	* Constructor for FillerBeginEndMid1Serialized
	**/
    public FillerBeginEndMid1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in FillerBeginEndMid1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(FILLER_BEGIN_END_MID_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginFiller9 = getStartOffset() + 60;	// set offset for serialization
  
  
             beginWsaiypAddedSw = getStartOffset() + 88;	// set offset for serialization
  
             beginAiypPriorCnt = getStartOffset() + 89;	// set offset for serialization
  
             beginFillera = getStartOffset() + 91;	// set offset for serialization
  
             beginFillerb = getStartOffset() + 95;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localFiller9Counter = -1;
     public boolean isFiller9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller9Counter != sharedCounter;
         localFiller9Counter = sharedCounter; return hasModified; 
     }
   protected static final int FILLER_9_LEN = 4;
  	/**
	 * serializeFiller9
	 */
	protected void serializeFiller9(int filler9) {
           replaceValue( //  save the value as string
                   getBinaryString( filler9,FILLER_9_LEN)
                  ,beginFiller9
                  ,FILLER_9_LEN
                 );
            localFiller9Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFiller9MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFiller9 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFiller9() {	 
			return (getInt(beginFiller9));
   	}
     int localWsaiypAddedSwCounter = -1;
     public boolean isWsaiypAddedSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWsaiypAddedSwCounter != sharedCounter;
         localWsaiypAddedSwCounter = sharedCounter; return hasModified;
     }
	protected static final int WSAIYP_ADDED_SW_LEN = 1;
	/**
	 * 	serialize this WsaiypAddedSw
	 */
   protected void serializeWsaiypAddedSw(char[] wsaiypAddedSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wsaiypAddedSw,0,getStringValue(),beginWsaiypAddedSw,WSAIYP_ADDED_SW_LEN);
       localWsaiypAddedSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWsaiypAddedSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWsaiypAddedSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWsaiypAddedSw() {	 
   		return (substring(getStringValue(),beginWsaiypAddedSw,beginWsaiypAddedSw + WSAIYP_ADDED_SW_LEN));
   	}
     int localAiypPriorCntCounter = -1;
     public boolean isAiypPriorCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAiypPriorCntCounter != sharedCounter;
         localAiypPriorCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of aiypPriorCnt
	 *	@return aiypPriorCnt
	 */
	public char[]  getAiypPriorCntString() {
	     return getCharArray(beginAiypPriorCnt,AIYP_PRIOR_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean aiypPriorCntIsNumeric() {
	    return isNumeric(beginAiypPriorCnt
	                    ,beginAiypPriorCnt + AIYP_PRIOR_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int AIYP_PRIOR_CNT_LEN = 2;
  	/**
	 * serializeAiypPriorCnt
	 */
	protected void serializeAiypPriorCnt(int aiypPriorCnt) {
		 putNumber(beginAiypPriorCnt,aiypPriorCnt,AIYP_PRIOR_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localAiypPriorCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeAiypPriorCnt
	 */
   	protected  int serializeAiypPriorCnt(char[] value) {
	    int  aiypPriorCnt;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    aiypPriorCnt = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginAiypPriorCnt
		       ,2
		      );
		 localAiypPriorCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  aiypPriorCnt;
    }

   protected int checkAiypPriorCntMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshAiypPriorCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshAiypPriorCnt() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginAiypPriorCnt
			                 ,AIYP_PRIOR_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("aiypPriorCnt", beginAiypPriorCnt,AIYP_PRIOR_CNT_LEN);
    }
   	}
     int localFilleraCounter = -1;
     public boolean isFilleraModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFilleraCounter != sharedCounter;
         localFilleraCounter = sharedCounter; return hasModified; 
     }
   protected static final int FILLERA_LEN = 4;
  	/**
	 * serializeFillera
	 */
	protected void serializeFillera(int fillera) {
           replaceValue( //  save the value as string
                   getBinaryString( fillera,FILLERA_LEN)
                  ,beginFillera
                  ,FILLERA_LEN
                 );
            localFilleraCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFilleraMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFillera is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFillera() {	 
			return (getInt(beginFillera));
   	}
     int localFillerbCounter = -1;
     public boolean isFillerbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFillerbCounter != sharedCounter;
         localFillerbCounter = sharedCounter; return hasModified; 
     }
   protected static final int FILLERB_LEN = 4;
  	/**
	 * serializeFillerb
	 */
	protected void serializeFillerb(int fillerb) {
           replaceValue( //  save the value as string
                   getBinaryString( fillerb,FILLERB_LEN)
                  ,beginFillerb
                  ,FILLERB_LEN
                 );
            localFillerbCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFillerbMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFillerb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFillerb() {	 
			return (getInt(beginFillerb));
   	}




}
  
