package com.cloudframe.app.ip088030.file.records.serialize;

/**
*  The class Ip98152RecordPart2Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ip98152RecordPart2Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip98152RecordPart2Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_98152_RECORD_PART_2_LENGTH = 495;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp98152ClrFxDate;
            protected  int beginIp98152ClrTxnAmt;
            protected  int beginIp98152ClrTxnCurrCd;
           protected int beginIp98152ClrSetlInfo;
           protected static final int IP_98152_CLR_SETL_INFO_SIZE = 2;
            protected  int beginIp98152FundProdId;
            protected  int beginIp98152FundAcctNum;
            protected  int beginIp98152ActualMcc;
            protected  int beginIp98152FundProdType;
	
	/**
	* Constructor for Ip98152RecordPart2Serialized
	**/
    public Ip98152RecordPart2Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip98152RecordPart2Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip98152RecordPart2Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip98152RecordPart2Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,255); // serialize this field at offset 255 by default 
    }
    
	/**
	* sets parent for this Ip98152RecordPart2Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 255 by default
    }    
	/**
	* initializes the field in Ip98152RecordPart2Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_98152_RECORD_PART_2_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp98152ClrFxDate = getStartOffset() + 38;	// set offset for serialization
  
             beginIp98152ClrTxnAmt = getStartOffset() + 123;	// set offset for serialization
  
             beginIp98152ClrTxnCurrCd = getStartOffset() + 130;	// set offset for serialization
  
	        beginIp98152ClrSetlInfo = getStartOffset() + 320; // set offset for serialization
  
             beginIp98152FundProdId = getStartOffset() + 462;	// set offset for serialization
  
             beginIp98152FundAcctNum = getStartOffset() + 465;	// set offset for serialization
  
             beginIp98152ActualMcc = getStartOffset() + 484;	// set offset for serialization
  
             beginIp98152FundProdType = getStartOffset() + 488;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp98152ClrFxDateCounter = -1;
     public boolean isIp98152ClrFxDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152ClrFxDateCounter != sharedCounter;
         localIp98152ClrFxDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of ip98152ClrFxDate
	 *	@return ip98152ClrFxDate
	 */
	public char[]  getIp98152ClrFxDateString() {
	     return getCharArray(beginIp98152ClrFxDate,IP_98152_CLR_FX_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ip98152ClrFxDateIsNumeric() {
	    return isNumeric(beginIp98152ClrFxDate
	                    ,beginIp98152ClrFxDate + IP_98152_CLR_FX_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int IP_98152_CLR_FX_DATE_LEN = 5;
  	/**
	 * serializeIp98152ClrFxDate
	 */
	protected void serializeIp98152ClrFxDate(long ip98152ClrFxDate) {
		 putNumber(beginIp98152ClrFxDate,ip98152ClrFxDate,IP_98152_CLR_FX_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localIp98152ClrFxDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeIp98152ClrFxDate
	 */
   	protected  long serializeIp98152ClrFxDate(char[] value) {
	    long  ip98152ClrFxDate;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    ip98152ClrFxDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginIp98152ClrFxDate
		       ,5
		      );
		 localIp98152ClrFxDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  ip98152ClrFxDate;
    }

   protected long checkIp98152ClrFxDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshIp98152ClrFxDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp98152ClrFxDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginIp98152ClrFxDate
			                 ,IP_98152_CLR_FX_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("ip98152ClrFxDate", beginIp98152ClrFxDate,IP_98152_CLR_FX_DATE_LEN);
    }
   	}
        int localIp98152ClrTxnAmtCounter = -1;
        public boolean isIp98152ClrTxnAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localIp98152ClrTxnAmtCounter != sharedCounter;
           localIp98152ClrTxnAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean ip98152ClrTxnAmtIsNumeric() {
	      return decimalIsNumeric(beginIp98152ClrTxnAmt,IP_98152_CLR_TXN_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int IP_98152_CLR_TXN_AMT_LEN = 7;
  	/**
	 * 	serializeIp98152ClrTxnAmt
	 */
	protected void serializeIp98152ClrTxnAmt(long ip98152ClrTxnAmt) {
		   putDecimal(beginIp98152ClrTxnAmt,ip98152ClrTxnAmt,IP_98152_CLR_TXN_AMT_LEN,false);
   }
   

   protected long checkIp98152ClrTxnAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1T /*limit*/ , false/*isSigned*/);
   }

     /**
	 *	refreshIp98152ClrTxnAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshIp98152ClrTxnAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginIp98152ClrTxnAmt,IP_98152_CLR_TXN_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ip98152ClrTxnAmt", beginIp98152ClrTxnAmt,IP_98152_CLR_TXN_AMT_LEN);
     }
   	}
     int localIp98152ClrTxnCurrCdCounter = -1;
     public boolean isIp98152ClrTxnCurrCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152ClrTxnCurrCdCounter != sharedCounter;
         localIp98152ClrTxnCurrCdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98152_CLR_TXN_CURR_CD_LEN = 3;
	/**
	 * 	serialize this Ip98152ClrTxnCurrCd
	 */
   protected void serializeIp98152ClrTxnCurrCd(char[] ip98152ClrTxnCurrCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98152ClrTxnCurrCd,0,getStringValue(),beginIp98152ClrTxnCurrCd,IP_98152_CLR_TXN_CURR_CD_LEN);
       localIp98152ClrTxnCurrCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98152ClrTxnCurrCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp98152ClrTxnCurrCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98152ClrTxnCurrCd() {	 
   		return (substring(getStringValue(),beginIp98152ClrTxnCurrCd,beginIp98152ClrTxnCurrCd + IP_98152_CLR_TXN_CURR_CD_LEN));
   	}
     int localIp98152FundProdIdCounter = -1;
     public boolean isIp98152FundProdIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152FundProdIdCounter != sharedCounter;
         localIp98152FundProdIdCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98152_FUND_PROD_ID_LEN = 3;
	/**
	 * 	serialize this Ip98152FundProdId
	 */
   protected void serializeIp98152FundProdId(char[] ip98152FundProdId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98152FundProdId,0,getStringValue(),beginIp98152FundProdId,IP_98152_FUND_PROD_ID_LEN);
       localIp98152FundProdIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98152FundProdIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshIp98152FundProdId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98152FundProdId() {	 
   		return (substring(getStringValue(),beginIp98152FundProdId,beginIp98152FundProdId + IP_98152_FUND_PROD_ID_LEN));
   	}
     int localIp98152FundAcctNumCounter = -1;
     public boolean isIp98152FundAcctNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152FundAcctNumCounter != sharedCounter;
         localIp98152FundAcctNumCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98152_FUND_ACCT_NUM_LEN = 19;
	/**
	 * 	serialize this Ip98152FundAcctNum
	 */
   protected void serializeIp98152FundAcctNum(char[] ip98152FundAcctNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98152FundAcctNum,0,getStringValue(),beginIp98152FundAcctNum,IP_98152_FUND_ACCT_NUM_LEN);
       localIp98152FundAcctNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98152FundAcctNumConstraints(char[] value) {
   			return super.checkConstraints(value , 19 ,false, false);
   }
    /**
	 *	refreshIp98152FundAcctNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98152FundAcctNum() {	 
   		return (substring(getStringValue(),beginIp98152FundAcctNum,beginIp98152FundAcctNum + IP_98152_FUND_ACCT_NUM_LEN));
   	}
     int localIp98152ActualMccCounter = -1;
     public boolean isIp98152ActualMccModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152ActualMccCounter != sharedCounter;
         localIp98152ActualMccCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98152_ACTUAL_MCC_LEN = 4;
	/**
	 * 	serialize this Ip98152ActualMcc
	 */
   protected void serializeIp98152ActualMcc(char[] ip98152ActualMcc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98152ActualMcc,0,getStringValue(),beginIp98152ActualMcc,IP_98152_ACTUAL_MCC_LEN);
       localIp98152ActualMccCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98152ActualMccConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp98152ActualMcc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98152ActualMcc() {	 
   		return (substring(getStringValue(),beginIp98152ActualMcc,beginIp98152ActualMcc + IP_98152_ACTUAL_MCC_LEN));
   	}
     int localIp98152FundProdTypeCounter = -1;
     public boolean isIp98152FundProdTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp98152FundProdTypeCounter != sharedCounter;
         localIp98152FundProdTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_98152_FUND_PROD_TYPE_LEN = 1;
	/**
	 * 	serialize this Ip98152FundProdType
	 */
   protected void serializeIp98152FundProdType(char[] ip98152FundProdType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip98152FundProdType,0,getStringValue(),beginIp98152FundProdType,IP_98152_FUND_PROD_TYPE_LEN);
       localIp98152FundProdTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp98152FundProdTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp98152FundProdType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp98152FundProdType() {	 
   		return (substring(getStringValue(),beginIp98152FundProdType,beginIp98152FundProdType + IP_98152_FUND_PROD_TYPE_LEN));
   	}

		public int ip98152ClrSetlInfoSize() {
			return IP_98152_CLR_SETL_INFO_SIZE;
		}



}
  
