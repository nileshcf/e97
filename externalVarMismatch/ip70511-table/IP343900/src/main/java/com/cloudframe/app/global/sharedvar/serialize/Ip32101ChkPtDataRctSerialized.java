package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101ChkPtDataRctSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:25. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101ChkPtDataRctSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101ChkPtDataRctSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_CHK_PT_DATA_RCT_LENGTH = 87;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101RctDataLen;
            protected  int beginIp32101RctFreq;
            protected  int beginIp32101RctSumChkCnt;
            protected  int beginIp32101RctDtlChkCnt;
            protected  int beginIp32101RctSetlChkCnt;
	
	/**
	* Constructor for Ip32101ChkPtDataRctSerialized
	**/
    public Ip32101ChkPtDataRctSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101ChkPtDataRctSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataRctSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101ChkPtDataRctSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17); // serialize this field at offset 17 by default 
    }
    
	/**
	* sets parent for this Ip32101ChkPtDataRctSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17 by default
    }    
	/**
	* initializes the field in Ip32101ChkPtDataRctSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_CHK_PT_DATA_RCT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101RctDataLen = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101RctFreq = getStartOffset() + 2;	// set offset for serialization
  
  
             beginIp32101RctSumChkCnt = getStartOffset() + 60;	// set offset for serialization
  
             beginIp32101RctDtlChkCnt = getStartOffset() + 69;	// set offset for serialization
  
             beginIp32101RctSetlChkCnt = getStartOffset() + 78;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp32101RctDataLenCounter = -1;
         public boolean isIp32101RctDataLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp32101RctDataLenCounter != sharedCounter;
            localIp32101RctDataLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_32101_RCT_DATA_LEN_LEN = 2;
  	/**
	 * serializeIp32101RctDataLen
	 */
	protected void serializeIp32101RctDataLen(short ip32101RctDataLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip32101RctDataLen,IP_32101_RCT_DATA_LEN_LEN)
                  ,beginIp32101RctDataLen
                  ,IP_32101_RCT_DATA_LEN_LEN
                 );
            localIp32101RctDataLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp32101RctDataLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp32101RctDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp32101RctDataLen() {	 
			return (getShort(beginIp32101RctDataLen));
   	}
     int localIp32101RctFreqCounter = -1;
     public boolean isIp32101RctFreqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101RctFreqCounter != sharedCounter;
         localIp32101RctFreqCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101RctFreq
	 *	@return ip32101RctFreq
	 */
	public char[]  getIp32101RctFreqString() {
	     return getCharArray(beginIp32101RctFreq,IP_32101_RCT_FREQ_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101RctFreqIsNumeric() {
	    return isNumeric(beginIp32101RctFreq
	                    ,beginIp32101RctFreq + IP_32101_RCT_FREQ_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_RCT_FREQ_LEN = 9;
  	/**
	 * serializeIp32101RctFreq
	 */
	protected void serializeIp32101RctFreq(long ip32101RctFreq) {
		 putNumber(beginIp32101RctFreq,ip32101RctFreq,IP_32101_RCT_FREQ_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101RctFreqCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101RctFreq
	 */
   	protected  long serializeIp32101RctFreq(char[] value) {
	    long  ip32101RctFreq;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101RctFreq = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101RctFreq
		       ,9
		      );
		 localIp32101RctFreqCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101RctFreq;
    }

   protected long checkIp32101RctFreqMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101RctFreq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101RctFreq() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101RctFreq
			                 ,IP_32101_RCT_FREQ_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101RctFreq", beginIp32101RctFreq,IP_32101_RCT_FREQ_LEN);
    }
   	}
     int localIp32101RctSumChkCntCounter = -1;
     public boolean isIp32101RctSumChkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101RctSumChkCntCounter != sharedCounter;
         localIp32101RctSumChkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101RctSumChkCnt
	 *	@return ip32101RctSumChkCnt
	 */
	public char[]  getIp32101RctSumChkCntString() {
	     return getCharArray(beginIp32101RctSumChkCnt,IP_32101_RCT_SUM_CHK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101RctSumChkCntIsNumeric() {
	    return isNumeric(beginIp32101RctSumChkCnt
	                    ,beginIp32101RctSumChkCnt + IP_32101_RCT_SUM_CHK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_RCT_SUM_CHK_CNT_LEN = 9;
  	/**
	 * serializeIp32101RctSumChkCnt
	 */
	protected void serializeIp32101RctSumChkCnt(long ip32101RctSumChkCnt) {
		 putNumber(beginIp32101RctSumChkCnt,ip32101RctSumChkCnt,IP_32101_RCT_SUM_CHK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101RctSumChkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101RctSumChkCnt
	 */
   	protected  long serializeIp32101RctSumChkCnt(char[] value) {
	    long  ip32101RctSumChkCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101RctSumChkCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101RctSumChkCnt
		       ,9
		      );
		 localIp32101RctSumChkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101RctSumChkCnt;
    }

   protected long checkIp32101RctSumChkCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101RctSumChkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101RctSumChkCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101RctSumChkCnt
			                 ,IP_32101_RCT_SUM_CHK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101RctSumChkCnt", beginIp32101RctSumChkCnt,IP_32101_RCT_SUM_CHK_CNT_LEN);
    }
   	}
     int localIp32101RctDtlChkCntCounter = -1;
     public boolean isIp32101RctDtlChkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101RctDtlChkCntCounter != sharedCounter;
         localIp32101RctDtlChkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101RctDtlChkCnt
	 *	@return ip32101RctDtlChkCnt
	 */
	public char[]  getIp32101RctDtlChkCntString() {
	     return getCharArray(beginIp32101RctDtlChkCnt,IP_32101_RCT_DTL_CHK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101RctDtlChkCntIsNumeric() {
	    return isNumeric(beginIp32101RctDtlChkCnt
	                    ,beginIp32101RctDtlChkCnt + IP_32101_RCT_DTL_CHK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_RCT_DTL_CHK_CNT_LEN = 9;
  	/**
	 * serializeIp32101RctDtlChkCnt
	 */
	protected void serializeIp32101RctDtlChkCnt(long ip32101RctDtlChkCnt) {
		 putNumber(beginIp32101RctDtlChkCnt,ip32101RctDtlChkCnt,IP_32101_RCT_DTL_CHK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101RctDtlChkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101RctDtlChkCnt
	 */
   	protected  long serializeIp32101RctDtlChkCnt(char[] value) {
	    long  ip32101RctDtlChkCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101RctDtlChkCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101RctDtlChkCnt
		       ,9
		      );
		 localIp32101RctDtlChkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101RctDtlChkCnt;
    }

   protected long checkIp32101RctDtlChkCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101RctDtlChkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101RctDtlChkCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101RctDtlChkCnt
			                 ,IP_32101_RCT_DTL_CHK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101RctDtlChkCnt", beginIp32101RctDtlChkCnt,IP_32101_RCT_DTL_CHK_CNT_LEN);
    }
   	}
     int localIp32101RctSetlChkCntCounter = -1;
     public boolean isIp32101RctSetlChkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101RctSetlChkCntCounter != sharedCounter;
         localIp32101RctSetlChkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101RctSetlChkCnt
	 *	@return ip32101RctSetlChkCnt
	 */
	public char[]  getIp32101RctSetlChkCntString() {
	     return getCharArray(beginIp32101RctSetlChkCnt,IP_32101_RCT_SETL_CHK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101RctSetlChkCntIsNumeric() {
	    return isNumeric(beginIp32101RctSetlChkCnt
	                    ,beginIp32101RctSetlChkCnt + IP_32101_RCT_SETL_CHK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_RCT_SETL_CHK_CNT_LEN = 9;
  	/**
	 * serializeIp32101RctSetlChkCnt
	 */
	protected void serializeIp32101RctSetlChkCnt(long ip32101RctSetlChkCnt) {
		 putNumber(beginIp32101RctSetlChkCnt,ip32101RctSetlChkCnt,IP_32101_RCT_SETL_CHK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101RctSetlChkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101RctSetlChkCnt
	 */
   	protected  long serializeIp32101RctSetlChkCnt(char[] value) {
	    long  ip32101RctSetlChkCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101RctSetlChkCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101RctSetlChkCnt
		       ,9
		      );
		 localIp32101RctSetlChkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101RctSetlChkCnt;
    }

   protected long checkIp32101RctSetlChkCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101RctSetlChkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101RctSetlChkCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101RctSetlChkCnt
			                 ,IP_32101_RCT_SETL_CHK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101RctSetlChkCnt", beginIp32101RctSetlChkCnt,IP_32101_RCT_SETL_CHK_CNT_LEN);
    }
   	}




}
  
