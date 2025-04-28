package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101ChkPtDataCptSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 08:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip32101ChkPtDataCptSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101ChkPtDataCptSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_CHK_PT_DATA_CPT_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101CptDataLen;
            protected  int beginIp32101CptFreq;
            protected  int beginIp32101CptChkCnt;
	
	/**
	* Constructor for Ip32101ChkPtDataCptSerialized
	**/
    public Ip32101ChkPtDataCptSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101ChkPtDataCptSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataCptSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101ChkPtDataCptSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17); // serialize this field at offset 17 by default 
    }
    
	/**
	* sets parent for this Ip32101ChkPtDataCptSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17 by default
    }    
	/**
	* initializes the field in Ip32101ChkPtDataCptSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_CHK_PT_DATA_CPT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101CptDataLen = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101CptFreq = getStartOffset() + 2;	// set offset for serialization
  
  
             beginIp32101CptChkCnt = getStartOffset() + 61;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp32101CptDataLenCounter = -1;
         public boolean isIp32101CptDataLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp32101CptDataLenCounter != sharedCounter;
            localIp32101CptDataLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_32101_CPT_DATA_LEN_LEN = 2;
  	/**
	 * serializeIp32101CptDataLen
	 */
	protected void serializeIp32101CptDataLen(short ip32101CptDataLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip32101CptDataLen,IP_32101_CPT_DATA_LEN_LEN)
                  ,beginIp32101CptDataLen
                  ,IP_32101_CPT_DATA_LEN_LEN
                 );
            localIp32101CptDataLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp32101CptDataLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp32101CptDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp32101CptDataLen() {	 
			return (getShort(beginIp32101CptDataLen));
   	}
     int localIp32101CptFreqCounter = -1;
     public boolean isIp32101CptFreqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CptFreqCounter != sharedCounter;
         localIp32101CptFreqCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101CptFreq
	 *	@return ip32101CptFreq
	 */
	public char[]  getIp32101CptFreqString() {
	     return getCharArray(beginIp32101CptFreq,IP_32101_CPT_FREQ_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101CptFreqIsNumeric() {
	    return isNumeric(beginIp32101CptFreq
	                    ,beginIp32101CptFreq + IP_32101_CPT_FREQ_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_CPT_FREQ_LEN = 9;
  	/**
	 * serializeIp32101CptFreq
	 */
	protected void serializeIp32101CptFreq(long ip32101CptFreq) {
		 putNumber(beginIp32101CptFreq,ip32101CptFreq,IP_32101_CPT_FREQ_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101CptFreqCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101CptFreq
	 */
   	protected  long serializeIp32101CptFreq(char[] value) {
	    long  ip32101CptFreq;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101CptFreq = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101CptFreq
		       ,9
		      );
		 localIp32101CptFreqCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101CptFreq;
    }

   protected long checkIp32101CptFreqMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101CptFreq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101CptFreq() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101CptFreq
			                 ,IP_32101_CPT_FREQ_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101CptFreq", beginIp32101CptFreq,IP_32101_CPT_FREQ_LEN);
    }
   	}
     int localIp32101CptChkCntCounter = -1;
     public boolean isIp32101CptChkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CptChkCntCounter != sharedCounter;
         localIp32101CptChkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101CptChkCnt
	 *	@return ip32101CptChkCnt
	 */
	public char[]  getIp32101CptChkCntString() {
	     return getCharArray(beginIp32101CptChkCnt,IP_32101_CPT_CHK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101CptChkCntIsNumeric() {
	    return isNumeric(beginIp32101CptChkCnt
	                    ,beginIp32101CptChkCnt + IP_32101_CPT_CHK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_CPT_CHK_CNT_LEN = 9;
  	/**
	 * serializeIp32101CptChkCnt
	 */
	protected void serializeIp32101CptChkCnt(long ip32101CptChkCnt) {
		 putNumber(beginIp32101CptChkCnt,ip32101CptChkCnt,IP_32101_CPT_CHK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101CptChkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101CptChkCnt
	 */
   	protected  long serializeIp32101CptChkCnt(char[] value) {
	    long  ip32101CptChkCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101CptChkCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101CptChkCnt
		       ,9
		      );
		 localIp32101CptChkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101CptChkCnt;
    }

   protected long checkIp32101CptChkCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101CptChkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101CptChkCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101CptChkCnt
			                 ,IP_32101_CPT_CHK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101CptChkCnt", beginIp32101CptChkCnt,IP_32101_CPT_CHK_CNT_LEN);
    }
   	}




}
  
