package com.cloudframe.app.ip305710.dto.serialize;

/**
*  The class MaxRrnLimitErr620Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:10. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MaxRrnLimitErr620Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MaxRrnLimitErr620Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MAX_RRN_LIMIT_ERR_620_LENGTH = 79;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMaxRrnLimit620;
            protected  int beginPcCapGrpPtr620;
            protected  int beginActualRrnLimit620;
	
	/**
	* Constructor for MaxRrnLimitErr620Serialized
	**/
    public MaxRrnLimitErr620Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MaxRrnLimitErr620Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MAX_RRN_LIMIT_ERR_620_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginMaxRrnLimit620 = getStartOffset() + 24;	// set offset for serialization
  
  
             beginPcCapGrpPtr620 = getStartOffset() + 46;	// set offset for serialization
  
  
             beginActualRrnLimit620 = getStartOffset() + 75;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localMaxRrnLimit620Counter = -1;
     public boolean isMaxRrnLimit620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMaxRrnLimit620Counter != sharedCounter;
         localMaxRrnLimit620Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of maxRrnLimit620
	 *	@return maxRrnLimit620
	 */
	public char[]  getMaxRrnLimit620String() {
	     return getCharArray(beginMaxRrnLimit620,MAX_RRN_LIMIT_620_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean maxRrnLimit620IsNumeric() {
	    return isNumeric(beginMaxRrnLimit620
	                    ,beginMaxRrnLimit620 + MAX_RRN_LIMIT_620_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MAX_RRN_LIMIT_620_LEN = 2;
  	/**
	 * serializeMaxRrnLimit620
	 */
	protected void serializeMaxRrnLimit620(int maxRrnLimit620) {
		 putNumber(beginMaxRrnLimit620,maxRrnLimit620,MAX_RRN_LIMIT_620_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMaxRrnLimit620Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMaxRrnLimit620
	 */
   	protected  int serializeMaxRrnLimit620(char[] value) {
	    int  maxRrnLimit620;
	    if(value.length >0 && value.length!= 2)
            value = new String(value).trim().toCharArray();
	    if (value.length < 2) value = pad(2, value, ' ', LEFT_PAD);
	    else if (value.length > 2) value = substring(value,0,2);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    maxRrnLimit620 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(2,value,false/*isSigned?*/)
		       ,beginMaxRrnLimit620
		       ,2
		      );
		 localMaxRrnLimit620Counter = shareString.getSerializedField().getModifiedCounter();
		return  maxRrnLimit620;
    }

   protected int checkMaxRrnLimit620MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_100/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMaxRrnLimit620 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMaxRrnLimit620() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginMaxRrnLimit620
			                 ,MAX_RRN_LIMIT_620_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("maxRrnLimit620", beginMaxRrnLimit620,MAX_RRN_LIMIT_620_LEN);
    }
   	}
     int localPcCapGrpPtr620Counter = -1;
     public boolean isPcCapGrpPtr620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPcCapGrpPtr620Counter != sharedCounter;
         localPcCapGrpPtr620Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of pcCapGrpPtr620
	 *	@return pcCapGrpPtr620
	 */
	public char[]  getPcCapGrpPtr620String() {
	     return getCharArray(beginPcCapGrpPtr620,PC_CAP_GRP_PTR_620_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean pcCapGrpPtr620IsNumeric() {
	    return isNumeric(beginPcCapGrpPtr620
	                    ,beginPcCapGrpPtr620 + PC_CAP_GRP_PTR_620_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int PC_CAP_GRP_PTR_620_LEN = 11;
  	/**
	 * serializePcCapGrpPtr620
	 */
	protected void serializePcCapGrpPtr620(long pcCapGrpPtr620) {
		 putNumber(beginPcCapGrpPtr620,pcCapGrpPtr620,PC_CAP_GRP_PTR_620_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localPcCapGrpPtr620Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializePcCapGrpPtr620
	 */
   	protected  long serializePcCapGrpPtr620(char[] value) {
	    long  pcCapGrpPtr620;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    pcCapGrpPtr620 = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginPcCapGrpPtr620
		       ,11
		      );
		 localPcCapGrpPtr620Counter = shareString.getSerializedField().getModifiedCounter();
		return  pcCapGrpPtr620;
    }

   protected long checkPcCapGrpPtr620MaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshPcCapGrpPtr620 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshPcCapGrpPtr620() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginPcCapGrpPtr620
			                 ,PC_CAP_GRP_PTR_620_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("pcCapGrpPtr620", beginPcCapGrpPtr620,PC_CAP_GRP_PTR_620_LEN);
    }
   	}
     int localActualRrnLimit620Counter = -1;
     public boolean isActualRrnLimit620Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localActualRrnLimit620Counter != sharedCounter;
         localActualRrnLimit620Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of actualRrnLimit620
	 *	@return actualRrnLimit620
	 */
	public char[]  getActualRrnLimit620String() {
	     return getCharArray(beginActualRrnLimit620,ACTUAL_RRN_LIMIT_620_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean actualRrnLimit620IsNumeric() {
	    return isNumeric(beginActualRrnLimit620
	                    ,beginActualRrnLimit620 + ACTUAL_RRN_LIMIT_620_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int ACTUAL_RRN_LIMIT_620_LEN = 4;
  	/**
	 * serializeActualRrnLimit620
	 */
	protected void serializeActualRrnLimit620(int actualRrnLimit620) {
		 putNumber(beginActualRrnLimit620,actualRrnLimit620,ACTUAL_RRN_LIMIT_620_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localActualRrnLimit620Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeActualRrnLimit620
	 */
   	protected  int serializeActualRrnLimit620(char[] value) {
	    int  actualRrnLimit620;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    actualRrnLimit620 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginActualRrnLimit620
		       ,4
		      );
		 localActualRrnLimit620Counter = shareString.getSerializedField().getModifiedCounter();
		return  actualRrnLimit620;
    }

   protected int checkActualRrnLimit620MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshActualRrnLimit620 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshActualRrnLimit620() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginActualRrnLimit620
			                 ,ACTUAL_RRN_LIMIT_620_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("actualRrnLimit620", beginActualRrnLimit620,ACTUAL_RRN_LIMIT_620_LEN);
    }
   	}




}
  
