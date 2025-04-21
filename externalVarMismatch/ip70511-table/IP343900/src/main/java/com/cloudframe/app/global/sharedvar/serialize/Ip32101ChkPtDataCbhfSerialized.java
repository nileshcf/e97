package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip32101ChkPtDataCbhfSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:04. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip32101ChkPtDataCbhfSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip32101ChkPtDataCbhfSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_32101_CHK_PT_DATA_CBHF_LENGTH = 125;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp32101CbhfDataLen;
            protected  int beginIp32101CbhfFreq;
            protected  int beginIp32101CbhfChkCnt;
            protected  int beginIp32101CbhfCycInd;
            protected  int beginIp32101CbhfCsIpmRecCnt;
            protected  int beginIp32101CbhfBulkId;
            protected  int beginIp32101CbhfEdcDasetNam;
	
	/**
	* Constructor for Ip32101ChkPtDataCbhfSerialized
	**/
    public Ip32101ChkPtDataCbhfSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip32101ChkPtDataCbhfSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip32101ChkPtDataCbhfSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip32101ChkPtDataCbhfSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,17); // serialize this field at offset 17 by default 
    }
    
	/**
	* sets parent for this Ip32101ChkPtDataCbhfSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 17 by default
    }    
	/**
	* initializes the field in Ip32101ChkPtDataCbhfSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_32101_CHK_PT_DATA_CBHF_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp32101CbhfDataLen = getStartOffset() + 0;	// set offset for serialization
  
             beginIp32101CbhfFreq = getStartOffset() + 2;	// set offset for serialization
  
  
             beginIp32101CbhfChkCnt = getStartOffset() + 61;	// set offset for serialization
  
             beginIp32101CbhfCycInd = getStartOffset() + 70;	// set offset for serialization
  
             beginIp32101CbhfCsIpmRecCnt = getStartOffset() + 72;	// set offset for serialization
  
             beginIp32101CbhfBulkId = getStartOffset() + 77;	// set offset for serialization
  
             beginIp32101CbhfEdcDasetNam = getStartOffset() + 81;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp32101CbhfDataLenCounter = -1;
         public boolean isIp32101CbhfDataLenModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp32101CbhfDataLenCounter != sharedCounter;
            localIp32101CbhfDataLenCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_32101_CBHF_DATA_LEN_LEN = 2;
  	/**
	 * serializeIp32101CbhfDataLen
	 */
	protected void serializeIp32101CbhfDataLen(short ip32101CbhfDataLen) {
           replaceValue( //  save the value as string
                   getBinaryString( ip32101CbhfDataLen,IP_32101_CBHF_DATA_LEN_LEN)
                  ,beginIp32101CbhfDataLen
                  ,IP_32101_CBHF_DATA_LEN_LEN
                 );
            localIp32101CbhfDataLenCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp32101CbhfDataLenMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp32101CbhfDataLen is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp32101CbhfDataLen() {	 
			return (getShort(beginIp32101CbhfDataLen));
   	}
     int localIp32101CbhfFreqCounter = -1;
     public boolean isIp32101CbhfFreqModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CbhfFreqCounter != sharedCounter;
         localIp32101CbhfFreqCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101CbhfFreq
	 *	@return ip32101CbhfFreq
	 */
	public char[]  getIp32101CbhfFreqString() {
	     return getCharArray(beginIp32101CbhfFreq,IP_32101_CBHF_FREQ_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101CbhfFreqIsNumeric() {
	    return isNumeric(beginIp32101CbhfFreq
	                    ,beginIp32101CbhfFreq + IP_32101_CBHF_FREQ_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_CBHF_FREQ_LEN = 9;
  	/**
	 * serializeIp32101CbhfFreq
	 */
	protected void serializeIp32101CbhfFreq(long ip32101CbhfFreq) {
		 putNumber(beginIp32101CbhfFreq,ip32101CbhfFreq,IP_32101_CBHF_FREQ_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101CbhfFreqCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101CbhfFreq
	 */
   	protected  long serializeIp32101CbhfFreq(char[] value) {
	    long  ip32101CbhfFreq;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101CbhfFreq = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101CbhfFreq
		       ,9
		      );
		 localIp32101CbhfFreqCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101CbhfFreq;
    }

   protected long checkIp32101CbhfFreqMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101CbhfFreq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101CbhfFreq() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101CbhfFreq
			                 ,IP_32101_CBHF_FREQ_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101CbhfFreq", beginIp32101CbhfFreq,IP_32101_CBHF_FREQ_LEN);
    }
   	}
     int localIp32101CbhfChkCntCounter = -1;
     public boolean isIp32101CbhfChkCntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CbhfChkCntCounter != sharedCounter;
         localIp32101CbhfChkCntCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip32101CbhfChkCnt
	 *	@return ip32101CbhfChkCnt
	 */
	public char[]  getIp32101CbhfChkCntString() {
	     return getCharArray(beginIp32101CbhfChkCnt,IP_32101_CBHF_CHK_CNT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip32101CbhfChkCntIsNumeric() {
	    return isNumeric(beginIp32101CbhfChkCnt
	                    ,beginIp32101CbhfChkCnt + IP_32101_CBHF_CHK_CNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_32101_CBHF_CHK_CNT_LEN = 9;
  	/**
	 * serializeIp32101CbhfChkCnt
	 */
	protected void serializeIp32101CbhfChkCnt(long ip32101CbhfChkCnt) {
		 putNumber(beginIp32101CbhfChkCnt,ip32101CbhfChkCnt,IP_32101_CBHF_CHK_CNT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp32101CbhfChkCntCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp32101CbhfChkCnt
	 */
   	protected  long serializeIp32101CbhfChkCnt(char[] value) {
	    long  ip32101CbhfChkCnt;
	    if(value.length >0 && value.length!= 9)
            value = new String(value).trim().toCharArray();
	    if (value.length < 9) value = pad(9, value, ' ', LEFT_PAD);
	    else if (value.length > 9) value = substring(value,0,9);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip32101CbhfChkCnt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(9,value,false/*isSigned?*/)
		       ,beginIp32101CbhfChkCnt
		       ,9
		      );
		 localIp32101CbhfChkCntCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip32101CbhfChkCnt;
    }

   protected long checkIp32101CbhfChkCntMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp32101CbhfChkCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp32101CbhfChkCnt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp32101CbhfChkCnt
			                 ,IP_32101_CBHF_CHK_CNT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip32101CbhfChkCnt", beginIp32101CbhfChkCnt,IP_32101_CBHF_CHK_CNT_LEN);
    }
   	}
        int localIp32101CbhfCycIndCounter = -1;
        public boolean isIp32101CbhfCycIndModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp32101CbhfCycIndCounter != sharedCounter;
           localIp32101CbhfCycIndCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip32101CbhfCycIndIsNumeric() {
	      return decimalIsNumeric(beginIp32101CbhfCycInd,IP_32101_CBHF_CYC_IND_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_32101_CBHF_CYC_IND_LEN = 2;
  	/**
	 * 	serializeIp32101CbhfCycInd
	 */
	protected void serializeIp32101CbhfCycInd(short ip32101CbhfCycInd) {
		   putDecimal(beginIp32101CbhfCycInd,ip32101CbhfCycInd,IP_32101_CBHF_CYC_IND_LEN,true);
   }
   

   protected short checkIp32101CbhfCycIndMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_1000 /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshIp32101CbhfCycInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp32101CbhfCycInd() throws CFException {	
   	try { 
		 return (getShortDecimal(beginIp32101CbhfCycInd,IP_32101_CBHF_CYC_IND_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip32101CbhfCycInd", beginIp32101CbhfCycInd,IP_32101_CBHF_CYC_IND_LEN);
     }
   	}
        int localIp32101CbhfCsIpmRecCntCounter = -1;
        public boolean isIp32101CbhfCsIpmRecCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp32101CbhfCsIpmRecCntCounter != sharedCounter;
           localIp32101CbhfCsIpmRecCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip32101CbhfCsIpmRecCntIsNumeric() {
	      return decimalIsNumeric(beginIp32101CbhfCsIpmRecCnt,IP_32101_CBHF_CS_IPM_REC_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_32101_CBHF_CS_IPM_REC_CNT_LEN = 5;
  	/**
	 * 	serializeIp32101CbhfCsIpmRecCnt
	 */
	protected void serializeIp32101CbhfCsIpmRecCnt(int ip32101CbhfCsIpmRecCnt) {
		   putDecimal(beginIp32101CbhfCsIpmRecCnt,ip32101CbhfCsIpmRecCnt,IP_32101_CBHF_CS_IPM_REC_CNT_LEN,true);
   }
   

   protected int checkIp32101CbhfCsIpmRecCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshIp32101CbhfCsIpmRecCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp32101CbhfCsIpmRecCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginIp32101CbhfCsIpmRecCnt,IP_32101_CBHF_CS_IPM_REC_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip32101CbhfCsIpmRecCnt", beginIp32101CbhfCsIpmRecCnt,IP_32101_CBHF_CS_IPM_REC_CNT_LEN);
     }
   	}
     int localIp32101CbhfBulkIdCounter = -1;
     public boolean isIp32101CbhfBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CbhfBulkIdCounter != sharedCounter;
         localIp32101CbhfBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CBHF_BULK_ID_LEN = 4;
	/**
	 * 	serialize this Ip32101CbhfBulkId
	 */
   protected void serializeIp32101CbhfBulkId(char[] ip32101CbhfBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101CbhfBulkId,0,getStringValue(),beginIp32101CbhfBulkId,IP_32101_CBHF_BULK_ID_LEN);
       localIp32101CbhfBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101CbhfBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp32101CbhfBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101CbhfBulkId() {	 
   		return (substring(getStringValue(),beginIp32101CbhfBulkId,beginIp32101CbhfBulkId + IP_32101_CBHF_BULK_ID_LEN));
   	}
     int localIp32101CbhfEdcDasetNamCounter = -1;
     public boolean isIp32101CbhfEdcDasetNamModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp32101CbhfEdcDasetNamCounter != sharedCounter;
         localIp32101CbhfEdcDasetNamCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_32101_CBHF_EDC_DASET_NAM_LEN = 44;
	/**
	 * 	serialize this Ip32101CbhfEdcDasetNam
	 */
   protected void serializeIp32101CbhfEdcDasetNam(char[] ip32101CbhfEdcDasetNam) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip32101CbhfEdcDasetNam,0,getStringValue(),beginIp32101CbhfEdcDasetNam,IP_32101_CBHF_EDC_DASET_NAM_LEN);
       localIp32101CbhfEdcDasetNamCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp32101CbhfEdcDasetNamConstraints(char[] value) {
   			return super.checkConstraints(value , 44 ,false, false);
   }
    /**
	 *	refreshIp32101CbhfEdcDasetNam is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp32101CbhfEdcDasetNam() {	 
   		return (substring(getStringValue(),beginIp32101CbhfEdcDasetNam,beginIp32101CbhfEdcDasetNam + IP_32101_CBHF_EDC_DASET_NAM_LEN));
   	}




}
  
