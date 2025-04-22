package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class WscdlCalDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WscdlCalDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WscdlCalDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WSCDL_CAL_DATE_LENGTH = 338;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWcdliBlCycNo;
            protected  int beginWcdliCurMm;
            protected  int beginWcdliCurYyyy;
            protected  int beginWcdliPrevCycDtInd;
            protected  int beginWcdliNextCycDtInd;
            protected  int beginWcdloHoldCurMm;
            protected  int beginWcdloHoldCurYyyy;
            protected  int beginWcdloHoldStartDt;
            protected  int beginWcdloHoldStartDtIso;
            protected  int beginWcdloHoldEndDt;
            protected  int beginWcdloHoldEndDtIso;
            protected  int beginWcdloLeapYear;
            protected  int beginWcdloLeapYearSw;
            protected  int beginWcdloValidationRsn;
            protected  int beginWcdloValidCycles;
            protected  int beginWcdloValidMonths;
            protected  int beginWcdloCurMm;
	
	/**
	* Constructor for WscdlCalDateSerialized
	**/
    public WscdlCalDateSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WscdlCalDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WSCDL_CAL_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWcdliBlCycNo = getStartOffset() + 0;	// set offset for serialization
  
             beginWcdliCurMm = getStartOffset() + 2;	// set offset for serialization
  
             beginWcdliCurYyyy = getStartOffset() + 4;	// set offset for serialization
  
             beginWcdliPrevCycDtInd = getStartOffset() + 8;	// set offset for serialization
  
             beginWcdliNextCycDtInd = getStartOffset() + 9;	// set offset for serialization
  
  
  
             beginWcdloHoldCurMm = getStartOffset() + 282;	// set offset for serialization
  
             beginWcdloHoldCurYyyy = getStartOffset() + 284;	// set offset for serialization
  
             beginWcdloHoldStartDt = getStartOffset() + 288;	// set offset for serialization
  
             beginWcdloHoldStartDtIso = getStartOffset() + 298;	// set offset for serialization
  
             beginWcdloHoldEndDt = getStartOffset() + 306;	// set offset for serialization
  
             beginWcdloHoldEndDtIso = getStartOffset() + 316;	// set offset for serialization
  
             beginWcdloLeapYear = getStartOffset() + 324;	// set offset for serialization
  
             beginWcdloLeapYearSw = getStartOffset() + 330;	// set offset for serialization
  
             beginWcdloValidationRsn = getStartOffset() + 331;	// set offset for serialization
  
             beginWcdloValidCycles = getStartOffset() + 332;	// set offset for serialization
  
             beginWcdloValidMonths = getStartOffset() + 334;	// set offset for serialization
  
             beginWcdloCurMm = getStartOffset() + 336;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWcdliBlCycNoCounter = -1;
     public boolean isWcdliBlCycNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdliBlCycNoCounter != sharedCounter;
         localWcdliBlCycNoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdliBlCycNo
	 *	@return wcdliBlCycNo
	 */
	public char[]  getWcdliBlCycNoString() {
	     return getCharArray(beginWcdliBlCycNo,WCDLI_BL_CYC_NO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdliBlCycNoIsNumeric() {
	    return isNumeric(beginWcdliBlCycNo
	                    ,beginWcdliBlCycNo + WCDLI_BL_CYC_NO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLI_BL_CYC_NO_LEN = 2;
  	/**
	 * serializeWcdliBlCycNo
	 */
	protected void serializeWcdliBlCycNo(int wcdliBlCycNo) {
		 putNumber(beginWcdliBlCycNo,wcdliBlCycNo,WCDLI_BL_CYC_NO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdliBlCycNoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdliBlCycNo
	 */
   	protected  int serializeWcdliBlCycNo(char[] value) {
	    int  wcdliBlCycNo;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdliBlCycNo = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdliBlCycNo
		       ,2
		      );
		 localWcdliBlCycNoCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdliBlCycNo;
    }

   protected int checkWcdliBlCycNoMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdliBlCycNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdliBlCycNo() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdliBlCycNo
			                 ,WCDLI_BL_CYC_NO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdliBlCycNo", beginWcdliBlCycNo,WCDLI_BL_CYC_NO_LEN);
    }
   	}
     int localWcdliCurMmCounter = -1;
     public boolean isWcdliCurMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdliCurMmCounter != sharedCounter;
         localWcdliCurMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdliCurMm
	 *	@return wcdliCurMm
	 */
	public char[]  getWcdliCurMmString() {
	     return getCharArray(beginWcdliCurMm,WCDLI_CUR_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdliCurMmIsNumeric() {
	    return isNumeric(beginWcdliCurMm
	                    ,beginWcdliCurMm + WCDLI_CUR_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLI_CUR_MM_LEN = 2;
  	/**
	 * serializeWcdliCurMm
	 */
	protected void serializeWcdliCurMm(int wcdliCurMm) {
		 putNumber(beginWcdliCurMm,wcdliCurMm,WCDLI_CUR_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdliCurMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdliCurMm
	 */
   	protected  int serializeWcdliCurMm(char[] value) {
	    int  wcdliCurMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdliCurMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdliCurMm
		       ,2
		      );
		 localWcdliCurMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdliCurMm;
    }

   protected int checkWcdliCurMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdliCurMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdliCurMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdliCurMm
			                 ,WCDLI_CUR_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdliCurMm", beginWcdliCurMm,WCDLI_CUR_MM_LEN);
    }
   	}
     int localWcdliCurYyyyCounter = -1;
     public boolean isWcdliCurYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdliCurYyyyCounter != sharedCounter;
         localWcdliCurYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdliCurYyyy
	 *	@return wcdliCurYyyy
	 */
	public char[]  getWcdliCurYyyyString() {
	     return getCharArray(beginWcdliCurYyyy,WCDLI_CUR_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdliCurYyyyIsNumeric() {
	    return isNumeric(beginWcdliCurYyyy
	                    ,beginWcdliCurYyyy + WCDLI_CUR_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLI_CUR_YYYY_LEN = 4;
  	/**
	 * serializeWcdliCurYyyy
	 */
	protected void serializeWcdliCurYyyy(int wcdliCurYyyy) {
		 putNumber(beginWcdliCurYyyy,wcdliCurYyyy,WCDLI_CUR_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdliCurYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdliCurYyyy
	 */
   	protected  int serializeWcdliCurYyyy(char[] value) {
	    int  wcdliCurYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdliCurYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWcdliCurYyyy
		       ,4
		      );
		 localWcdliCurYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdliCurYyyy;
    }

   protected int checkWcdliCurYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdliCurYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdliCurYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdliCurYyyy
			                 ,WCDLI_CUR_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdliCurYyyy", beginWcdliCurYyyy,WCDLI_CUR_YYYY_LEN);
    }
   	}
     int localWcdliPrevCycDtIndCounter = -1;
     public boolean isWcdliPrevCycDtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdliPrevCycDtIndCounter != sharedCounter;
         localWcdliPrevCycDtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int WCDLI_PREV_CYC_DT_IND_LEN = 1;
	/**
	 * 	serialize this WcdliPrevCycDtInd
	 */
   protected void serializeWcdliPrevCycDtInd(char[] wcdliPrevCycDtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wcdliPrevCycDtInd,0,getStringValue(),beginWcdliPrevCycDtInd,WCDLI_PREV_CYC_DT_IND_LEN);
       localWcdliPrevCycDtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWcdliPrevCycDtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWcdliPrevCycDtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWcdliPrevCycDtInd() {	 
   		return (substring(getStringValue(),beginWcdliPrevCycDtInd,beginWcdliPrevCycDtInd + WCDLI_PREV_CYC_DT_IND_LEN));
   	}
     int localWcdliNextCycDtIndCounter = -1;
     public boolean isWcdliNextCycDtIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdliNextCycDtIndCounter != sharedCounter;
         localWcdliNextCycDtIndCounter = sharedCounter; return hasModified;
     }
	protected static final int WCDLI_NEXT_CYC_DT_IND_LEN = 1;
	/**
	 * 	serialize this WcdliNextCycDtInd
	 */
   protected void serializeWcdliNextCycDtInd(char[] wcdliNextCycDtInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wcdliNextCycDtInd,0,getStringValue(),beginWcdliNextCycDtInd,WCDLI_NEXT_CYC_DT_IND_LEN);
       localWcdliNextCycDtIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWcdliNextCycDtIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWcdliNextCycDtInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWcdliNextCycDtInd() {	 
   		return (substring(getStringValue(),beginWcdliNextCycDtInd,beginWcdliNextCycDtInd + WCDLI_NEXT_CYC_DT_IND_LEN));
   	}
     int localWcdloHoldCurMmCounter = -1;
     public boolean isWcdloHoldCurMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloHoldCurMmCounter != sharedCounter;
         localWcdloHoldCurMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloHoldCurMm
	 *	@return wcdloHoldCurMm
	 */
	public char[]  getWcdloHoldCurMmString() {
	     return getCharArray(beginWcdloHoldCurMm,WCDLO_HOLD_CUR_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloHoldCurMmIsNumeric() {
	    return isNumeric(beginWcdloHoldCurMm
	                    ,beginWcdloHoldCurMm + WCDLO_HOLD_CUR_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_HOLD_CUR_MM_LEN = 2;
  	/**
	 * serializeWcdloHoldCurMm
	 */
	protected void serializeWcdloHoldCurMm(int wcdloHoldCurMm) {
		 putNumber(beginWcdloHoldCurMm,wcdloHoldCurMm,WCDLO_HOLD_CUR_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloHoldCurMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloHoldCurMm
	 */
   	protected  int serializeWcdloHoldCurMm(char[] value) {
	    int  wcdloHoldCurMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloHoldCurMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloHoldCurMm
		       ,2
		      );
		 localWcdloHoldCurMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloHoldCurMm;
    }

   protected int checkWcdloHoldCurMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloHoldCurMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloHoldCurMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloHoldCurMm
			                 ,WCDLO_HOLD_CUR_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloHoldCurMm", beginWcdloHoldCurMm,WCDLO_HOLD_CUR_MM_LEN);
    }
   	}
     int localWcdloHoldCurYyyyCounter = -1;
     public boolean isWcdloHoldCurYyyyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloHoldCurYyyyCounter != sharedCounter;
         localWcdloHoldCurYyyyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloHoldCurYyyy
	 *	@return wcdloHoldCurYyyy
	 */
	public char[]  getWcdloHoldCurYyyyString() {
	     return getCharArray(beginWcdloHoldCurYyyy,WCDLO_HOLD_CUR_YYYY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloHoldCurYyyyIsNumeric() {
	    return isNumeric(beginWcdloHoldCurYyyy
	                    ,beginWcdloHoldCurYyyy + WCDLO_HOLD_CUR_YYYY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_HOLD_CUR_YYYY_LEN = 4;
  	/**
	 * serializeWcdloHoldCurYyyy
	 */
	protected void serializeWcdloHoldCurYyyy(int wcdloHoldCurYyyy) {
		 putNumber(beginWcdloHoldCurYyyy,wcdloHoldCurYyyy,WCDLO_HOLD_CUR_YYYY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloHoldCurYyyyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloHoldCurYyyy
	 */
   	protected  int serializeWcdloHoldCurYyyy(char[] value) {
	    int  wcdloHoldCurYyyy;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloHoldCurYyyy = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginWcdloHoldCurYyyy
		       ,4
		      );
		 localWcdloHoldCurYyyyCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloHoldCurYyyy;
    }

   protected int checkWcdloHoldCurYyyyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloHoldCurYyyy is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloHoldCurYyyy() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloHoldCurYyyy
			                 ,WCDLO_HOLD_CUR_YYYY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloHoldCurYyyy", beginWcdloHoldCurYyyy,WCDLO_HOLD_CUR_YYYY_LEN);
    }
   	}
     int localWcdloHoldStartDtCounter = -1;
     public boolean isWcdloHoldStartDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloHoldStartDtCounter != sharedCounter;
         localWcdloHoldStartDtCounter = sharedCounter; return hasModified;
     }
	protected static final int WCDLO_HOLD_START_DT_LEN = 10;
	/**
	 * 	serialize this WcdloHoldStartDt
	 */
   protected void serializeWcdloHoldStartDt(char[] wcdloHoldStartDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wcdloHoldStartDt,0,getStringValue(),beginWcdloHoldStartDt,WCDLO_HOLD_START_DT_LEN);
       localWcdloHoldStartDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWcdloHoldStartDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWcdloHoldStartDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWcdloHoldStartDt() {	 
   		return (substring(getStringValue(),beginWcdloHoldStartDt,beginWcdloHoldStartDt + WCDLO_HOLD_START_DT_LEN));
   	}
     int localWcdloHoldStartDtIsoCounter = -1;
     public boolean isWcdloHoldStartDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloHoldStartDtIsoCounter != sharedCounter;
         localWcdloHoldStartDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloHoldStartDtIso
	 *	@return wcdloHoldStartDtIso
	 */
	public char[]  getWcdloHoldStartDtIsoString() {
	     return getCharArray(beginWcdloHoldStartDtIso,WCDLO_HOLD_START_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloHoldStartDtIsoIsNumeric() {
	    return isNumeric(beginWcdloHoldStartDtIso
	                    ,beginWcdloHoldStartDtIso + WCDLO_HOLD_START_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_HOLD_START_DT_ISO_LEN = 8;
  	/**
	 * serializeWcdloHoldStartDtIso
	 */
	protected void serializeWcdloHoldStartDtIso(long wcdloHoldStartDtIso) {
		 putNumber(beginWcdloHoldStartDtIso,wcdloHoldStartDtIso,WCDLO_HOLD_START_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloHoldStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloHoldStartDtIso
	 */
   	protected  long serializeWcdloHoldStartDtIso(char[] value) {
	    long  wcdloHoldStartDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloHoldStartDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginWcdloHoldStartDtIso
		       ,8
		      );
		 localWcdloHoldStartDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloHoldStartDtIso;
    }

   protected long checkWcdloHoldStartDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloHoldStartDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWcdloHoldStartDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWcdloHoldStartDtIso
			                 ,WCDLO_HOLD_START_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloHoldStartDtIso", beginWcdloHoldStartDtIso,WCDLO_HOLD_START_DT_ISO_LEN);
    }
   	}
     int localWcdloHoldEndDtCounter = -1;
     public boolean isWcdloHoldEndDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloHoldEndDtCounter != sharedCounter;
         localWcdloHoldEndDtCounter = sharedCounter; return hasModified;
     }
	protected static final int WCDLO_HOLD_END_DT_LEN = 10;
	/**
	 * 	serialize this WcdloHoldEndDt
	 */
   protected void serializeWcdloHoldEndDt(char[] wcdloHoldEndDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wcdloHoldEndDt,0,getStringValue(),beginWcdloHoldEndDt,WCDLO_HOLD_END_DT_LEN);
       localWcdloHoldEndDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWcdloHoldEndDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWcdloHoldEndDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWcdloHoldEndDt() {	 
   		return (substring(getStringValue(),beginWcdloHoldEndDt,beginWcdloHoldEndDt + WCDLO_HOLD_END_DT_LEN));
   	}
     int localWcdloHoldEndDtIsoCounter = -1;
     public boolean isWcdloHoldEndDtIsoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloHoldEndDtIsoCounter != sharedCounter;
         localWcdloHoldEndDtIsoCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloHoldEndDtIso
	 *	@return wcdloHoldEndDtIso
	 */
	public char[]  getWcdloHoldEndDtIsoString() {
	     return getCharArray(beginWcdloHoldEndDtIso,WCDLO_HOLD_END_DT_ISO_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloHoldEndDtIsoIsNumeric() {
	    return isNumeric(beginWcdloHoldEndDtIso
	                    ,beginWcdloHoldEndDtIso + WCDLO_HOLD_END_DT_ISO_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_HOLD_END_DT_ISO_LEN = 8;
  	/**
	 * serializeWcdloHoldEndDtIso
	 */
	protected void serializeWcdloHoldEndDtIso(long wcdloHoldEndDtIso) {
		 putNumber(beginWcdloHoldEndDtIso,wcdloHoldEndDtIso,WCDLO_HOLD_END_DT_ISO_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloHoldEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloHoldEndDtIso
	 */
   	protected  long serializeWcdloHoldEndDtIso(char[] value) {
	    long  wcdloHoldEndDtIso;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloHoldEndDtIso = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginWcdloHoldEndDtIso
		       ,8
		      );
		 localWcdloHoldEndDtIsoCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloHoldEndDtIso;
    }

   protected long checkWcdloHoldEndDtIsoMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloHoldEndDtIso is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshWcdloHoldEndDtIso() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginWcdloHoldEndDtIso
			                 ,WCDLO_HOLD_END_DT_ISO_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloHoldEndDtIso", beginWcdloHoldEndDtIso,WCDLO_HOLD_END_DT_ISO_LEN);
    }
   	}
     int localWcdloLeapYearCounter = -1;
     
     public boolean isWcdloLeapYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloLeapYearCounter != sharedCounter;
         localWcdloLeapYearCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of wcdloLeapYear
	 *	@return wcdloLeapYear
	 */
	public char[]  getWcdloLeapYearString() {
	    return getCharArray(beginWcdloLeapYear,WCDLO_LEAP_YEAR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloLeapYearIsNumeric() {
		    return isNumeric(beginWcdloLeapYear
	                    ,beginWcdloLeapYear + WCDLO_LEAP_YEAR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WCDLO_LEAP_YEAR_LEN = 6;
  protected  static final int WCDLO_LEAP_YEAR_SCALE = 2;

   protected BigDecimal checkWcdloLeapYearMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,6/*precision*/);
   }

  	/**
	 * serializeWcdloLeapYear
	 */
	protected void serializeWcdloLeapYear(BigDecimal wcdloLeapYear) {
	       putNumber(beginWcdloLeapYear,wcdloLeapYear,WCDLO_LEAP_YEAR_LEN,WCDLO_LEAP_YEAR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloLeapYearCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWcdloLeapYear
	 */
   	protected  BigDecimal serializeWcdloLeapYear(char[] value) throws CFException {
        if (value.length < 6) value = pad(6, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginWcdloLeapYear
		       ,6
		      );		 localWcdloLeapYearCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WCDLO_LEAP_YEAR_LEN,WCDLO_LEAP_YEAR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("wcdloLeapYear", beginWcdloLeapYear,WCDLO_LEAP_YEAR_LEN);
    	}
    }
    /**
	 *	refreshWcdloLeapYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWcdloLeapYear() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWcdloLeapYear
			            ,WCDLO_LEAP_YEAR_LEN
			            ,WCDLO_LEAP_YEAR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloLeapYear", beginWcdloLeapYear,WCDLO_LEAP_YEAR_LEN);
    }
   	}
     int localWcdloLeapYearSwCounter = -1;
     public boolean isWcdloLeapYearSwModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloLeapYearSwCounter != sharedCounter;
         localWcdloLeapYearSwCounter = sharedCounter; return hasModified;
     }
	protected static final int WCDLO_LEAP_YEAR_SW_LEN = 1;
	/**
	 * 	serialize this WcdloLeapYearSw
	 */
   protected void serializeWcdloLeapYearSw(char[] wcdloLeapYearSw) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wcdloLeapYearSw,0,getStringValue(),beginWcdloLeapYearSw,WCDLO_LEAP_YEAR_SW_LEN);
       localWcdloLeapYearSwCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWcdloLeapYearSwConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWcdloLeapYearSw is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWcdloLeapYearSw() {	 
   		return (substring(getStringValue(),beginWcdloLeapYearSw,beginWcdloLeapYearSw + WCDLO_LEAP_YEAR_SW_LEN));
   	}
     int localWcdloValidationRsnCounter = -1;
     public boolean isWcdloValidationRsnModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloValidationRsnCounter != sharedCounter;
         localWcdloValidationRsnCounter = sharedCounter; return hasModified;
     }
	protected static final int WCDLO_VALIDATION_RSN_LEN = 1;
	/**
	 * 	serialize this WcdloValidationRsn
	 */
   protected void serializeWcdloValidationRsn(char[] wcdloValidationRsn) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wcdloValidationRsn,0,getStringValue(),beginWcdloValidationRsn,WCDLO_VALIDATION_RSN_LEN);
       localWcdloValidationRsnCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWcdloValidationRsnConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWcdloValidationRsn is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWcdloValidationRsn() {	 
   		return (substring(getStringValue(),beginWcdloValidationRsn,beginWcdloValidationRsn + WCDLO_VALIDATION_RSN_LEN));
   	}
     int localWcdloValidCyclesCounter = -1;
     public boolean isWcdloValidCyclesModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloValidCyclesCounter != sharedCounter;
         localWcdloValidCyclesCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloValidCycles
	 *	@return wcdloValidCycles
	 */
	public char[]  getWcdloValidCyclesString() {
	     return getCharArray(beginWcdloValidCycles,WCDLO_VALID_CYCLES_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloValidCyclesIsNumeric() {
	    return isNumeric(beginWcdloValidCycles
	                    ,beginWcdloValidCycles + WCDLO_VALID_CYCLES_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_VALID_CYCLES_LEN = 2;
  	/**
	 * serializeWcdloValidCycles
	 */
	protected void serializeWcdloValidCycles(int wcdloValidCycles) {
		 putNumber(beginWcdloValidCycles,wcdloValidCycles,WCDLO_VALID_CYCLES_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloValidCyclesCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloValidCycles
	 */
   	protected  int serializeWcdloValidCycles(char[] value) {
	    int  wcdloValidCycles;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloValidCycles = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloValidCycles
		       ,2
		      );
		 localWcdloValidCyclesCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloValidCycles;
    }

   protected int checkWcdloValidCyclesMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloValidCycles is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloValidCycles() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloValidCycles
			                 ,WCDLO_VALID_CYCLES_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloValidCycles", beginWcdloValidCycles,WCDLO_VALID_CYCLES_LEN);
    }
   	}
     int localWcdloValidMonthsCounter = -1;
     public boolean isWcdloValidMonthsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloValidMonthsCounter != sharedCounter;
         localWcdloValidMonthsCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloValidMonths
	 *	@return wcdloValidMonths
	 */
	public char[]  getWcdloValidMonthsString() {
	     return getCharArray(beginWcdloValidMonths,WCDLO_VALID_MONTHS_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloValidMonthsIsNumeric() {
	    return isNumeric(beginWcdloValidMonths
	                    ,beginWcdloValidMonths + WCDLO_VALID_MONTHS_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_VALID_MONTHS_LEN = 2;
  	/**
	 * serializeWcdloValidMonths
	 */
	protected void serializeWcdloValidMonths(int wcdloValidMonths) {
		 putNumber(beginWcdloValidMonths,wcdloValidMonths,WCDLO_VALID_MONTHS_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloValidMonthsCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloValidMonths
	 */
   	protected  int serializeWcdloValidMonths(char[] value) {
	    int  wcdloValidMonths;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloValidMonths = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloValidMonths
		       ,2
		      );
		 localWcdloValidMonthsCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloValidMonths;
    }

   protected int checkWcdloValidMonthsMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloValidMonths is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloValidMonths() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloValidMonths
			                 ,WCDLO_VALID_MONTHS_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloValidMonths", beginWcdloValidMonths,WCDLO_VALID_MONTHS_LEN);
    }
   	}
     int localWcdloCurMmCounter = -1;
     public boolean isWcdloCurMmModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWcdloCurMmCounter != sharedCounter;
         localWcdloCurMmCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of wcdloCurMm
	 *	@return wcdloCurMm
	 */
	public char[]  getWcdloCurMmString() {
	     return getCharArray(beginWcdloCurMm,WCDLO_CUR_MM_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean wcdloCurMmIsNumeric() {
	    return isNumeric(beginWcdloCurMm
	                    ,beginWcdloCurMm + WCDLO_CUR_MM_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int WCDLO_CUR_MM_LEN = 2;
  	/**
	 * serializeWcdloCurMm
	 */
	protected void serializeWcdloCurMm(int wcdloCurMm) {
		 putNumber(beginWcdloCurMm,wcdloCurMm,WCDLO_CUR_MM_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWcdloCurMmCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeWcdloCurMm
	 */
   	protected  int serializeWcdloCurMm(char[] value) {
	    int  wcdloCurMm;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    wcdloCurMm = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginWcdloCurMm
		       ,2
		      );
		 localWcdloCurMmCounter = shareString.getSerializedField().getModifiedCounter();
		return  wcdloCurMm;
    }

   protected int checkWcdloCurMmMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshWcdloCurMm is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshWcdloCurMm() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginWcdloCurMm
			                 ,WCDLO_CUR_MM_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("wcdloCurMm", beginWcdloCurMm,WCDLO_CUR_MM_LEN);
    }
   	}




}
  
