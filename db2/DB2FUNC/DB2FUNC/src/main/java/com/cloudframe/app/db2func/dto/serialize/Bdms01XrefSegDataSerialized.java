package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01XrefSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01XrefSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01XrefSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_XREF_SEG_DATA_LENGTH = 320;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01XrefSegSqlcd;
            protected  int beginMsdCusipNo;
            protected  int beginMsdIsinNumber;
            protected  int beginMsdSecuritySymbol;
            protected  int beginMsdSedolNo;
            protected  int beginMsdEuroNo;
            protected  int beginMsdCinNumber;
            protected  int beginMsdCommonCode;
            protected  int beginMsdSedEuroInd;
            protected  int beginMsdExchangeCode;
            protected  int beginMsdOtcExchangeCode;
           protected int beginBdms01SecSymbol;
           protected static final int BDMS_01_SEC_SYMBOL_SIZE = 4;
            protected  int beginBdms01OptionCall;
            protected  int beginBdms01OptionPut;
            protected  int beginBdms01CbCusipNo;
            protected  int beginBdms01PrimaryExchangeCd;
           protected int beginBdms01OtherExchanges;
           protected static final int BDMS_01_OTHER_EXCHANGES_SIZE = 4;
            protected  int beginBdms01PostCd;
            protected  int beginMsdAlternateSymbol;
            protected  int beginBdms01DualAdpNo;
	
	/**
	* Constructor for Bdms01XrefSegDataSerialized
	**/
    public Bdms01XrefSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01XrefSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01XrefSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01XrefSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,662); // serialize this field at offset 662 by default 
    }
    
	/**
	* sets parent for this Bdms01XrefSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 662 by default
    }    
	/**
	* initializes the field in Bdms01XrefSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_XREF_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01XrefSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCusipNo = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdIsinNumber = getStartOffset() + 16;	// set offset for serialization
  
             beginMsdSecuritySymbol = getStartOffset() + 28;	// set offset for serialization
  
             beginMsdSedolNo = getStartOffset() + 40;	// set offset for serialization
  
             beginMsdEuroNo = getStartOffset() + 47;	// set offset for serialization
  
             beginMsdCinNumber = getStartOffset() + 53;	// set offset for serialization
  
             beginMsdCommonCode = getStartOffset() + 62;	// set offset for serialization
  
             beginMsdSedEuroInd = getStartOffset() + 71;	// set offset for serialization
  
             beginMsdExchangeCode = getStartOffset() + 72;	// set offset for serialization
  
             beginMsdOtcExchangeCode = getStartOffset() + 73;	// set offset for serialization
  
  
	        beginBdms01SecSymbol = getStartOffset() + 78; // set offset for serialization
  
             beginBdms01OptionCall = getStartOffset() + 126;	// set offset for serialization
  
             beginBdms01OptionPut = getStartOffset() + 138;	// set offset for serialization
  
             beginBdms01CbCusipNo = getStartOffset() + 150;	// set offset for serialization
  
             beginBdms01PrimaryExchangeCd = getStartOffset() + 162;	// set offset for serialization
  
	        beginBdms01OtherExchanges = getStartOffset() + 172; // set offset for serialization
  
             beginBdms01PostCd = getStartOffset() + 260;	// set offset for serialization
  
             beginMsdAlternateSymbol = getStartOffset() + 261;	// set offset for serialization
  
             beginBdms01DualAdpNo = getStartOffset() + 273;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01XrefSegSqlcdCounter = -1;
     public boolean isBdms01XrefSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01XrefSegSqlcdCounter != sharedCounter;
         localBdms01XrefSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01XrefSegSqlcd
	 *	@return bdms01XrefSegSqlcd
	 */
	public char[]  getBdms01XrefSegSqlcdString() {
	     return getCharArray(beginBdms01XrefSegSqlcd,BDMS_01_XREF_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01XrefSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01XrefSegSqlcd
	                    ,beginBdms01XrefSegSqlcd + BDMS_01_XREF_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_XREF_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01XrefSegSqlcd
	 */
	protected void serializeBdms01XrefSegSqlcd(int bdms01XrefSegSqlcd) {
		 putNumber(beginBdms01XrefSegSqlcd,bdms01XrefSegSqlcd,BDMS_01_XREF_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01XrefSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01XrefSegSqlcd
	 */
   	protected  int serializeBdms01XrefSegSqlcd(char[] value) {
	    int  bdms01XrefSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01XrefSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01XrefSegSqlcd
		       ,4
		      );
		 localBdms01XrefSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01XrefSegSqlcd;
    }

   protected int checkBdms01XrefSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01XrefSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01XrefSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01XrefSegSqlcd
			                 ,BDMS_01_XREF_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01XrefSegSqlcd", beginBdms01XrefSegSqlcd,BDMS_01_XREF_SEG_SQLCD_LEN);
    }
   	}
     int localMsdCusipNoCounter = -1;
     public boolean isMsdCusipNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCusipNoCounter != sharedCounter;
         localMsdCusipNoCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CUSIP_NO_LEN = 12;
	/**
	 * 	serialize this MsdCusipNo
	 */
   protected void serializeMsdCusipNo(char[] msdCusipNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCusipNo,0,getStringValue(),beginMsdCusipNo,MSD_CUSIP_NO_LEN);
       localMsdCusipNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCusipNoConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMsdCusipNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCusipNo() {	 
   		return (substring(getStringValue(),beginMsdCusipNo,beginMsdCusipNo + MSD_CUSIP_NO_LEN));
   	}
     int localMsdIsinNumberCounter = -1;
     public boolean isMsdIsinNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdIsinNumberCounter != sharedCounter;
         localMsdIsinNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_ISIN_NUMBER_LEN = 12;
	/**
	 * 	serialize this MsdIsinNumber
	 */
   protected void serializeMsdIsinNumber(char[] msdIsinNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdIsinNumber,0,getStringValue(),beginMsdIsinNumber,MSD_ISIN_NUMBER_LEN);
       localMsdIsinNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdIsinNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMsdIsinNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdIsinNumber() {	 
   		return (substring(getStringValue(),beginMsdIsinNumber,beginMsdIsinNumber + MSD_ISIN_NUMBER_LEN));
   	}
     int localMsdSecuritySymbolCounter = -1;
     public boolean isMsdSecuritySymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSecuritySymbolCounter != sharedCounter;
         localMsdSecuritySymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SECURITY_SYMBOL_LEN = 12;
	/**
	 * 	serialize this MsdSecuritySymbol
	 */
   protected void serializeMsdSecuritySymbol(char[] msdSecuritySymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSecuritySymbol,0,getStringValue(),beginMsdSecuritySymbol,MSD_SECURITY_SYMBOL_LEN);
       localMsdSecuritySymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSecuritySymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMsdSecuritySymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSecuritySymbol() {	 
   		return (substring(getStringValue(),beginMsdSecuritySymbol,beginMsdSecuritySymbol + MSD_SECURITY_SYMBOL_LEN));
   	}
     int localMsdSedolNoCounter = -1;
     public boolean isMsdSedolNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSedolNoCounter != sharedCounter;
         localMsdSedolNoCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SEDOL_NO_LEN = 7;
	/**
	 * 	serialize this MsdSedolNo
	 */
   protected void serializeMsdSedolNo(char[] msdSedolNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSedolNo,0,getStringValue(),beginMsdSedolNo,MSD_SEDOL_NO_LEN);
       localMsdSedolNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSedolNoConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshMsdSedolNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSedolNo() {	 
   		return (substring(getStringValue(),beginMsdSedolNo,beginMsdSedolNo + MSD_SEDOL_NO_LEN));
   	}
     int localMsdEuroNoCounter = -1;
     public boolean isMsdEuroNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdEuroNoCounter != sharedCounter;
         localMsdEuroNoCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_EURO_NO_LEN = 6;
	/**
	 * 	serialize this MsdEuroNo
	 */
   protected void serializeMsdEuroNo(char[] msdEuroNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdEuroNo,0,getStringValue(),beginMsdEuroNo,MSD_EURO_NO_LEN);
       localMsdEuroNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdEuroNoConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMsdEuroNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdEuroNo() {	 
   		return (substring(getStringValue(),beginMsdEuroNo,beginMsdEuroNo + MSD_EURO_NO_LEN));
   	}
     int localMsdCinNumberCounter = -1;
     public boolean isMsdCinNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCinNumberCounter != sharedCounter;
         localMsdCinNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CIN_NUMBER_LEN = 9;
	/**
	 * 	serialize this MsdCinNumber
	 */
   protected void serializeMsdCinNumber(char[] msdCinNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCinNumber,0,getStringValue(),beginMsdCinNumber,MSD_CIN_NUMBER_LEN);
       localMsdCinNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCinNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshMsdCinNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCinNumber() {	 
   		return (substring(getStringValue(),beginMsdCinNumber,beginMsdCinNumber + MSD_CIN_NUMBER_LEN));
   	}
     int localMsdCommonCodeCounter = -1;
     public boolean isMsdCommonCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCommonCodeCounter != sharedCounter;
         localMsdCommonCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_COMMON_CODE_LEN = 9;
	/**
	 * 	serialize this MsdCommonCode
	 */
   protected void serializeMsdCommonCode(char[] msdCommonCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCommonCode,0,getStringValue(),beginMsdCommonCode,MSD_COMMON_CODE_LEN);
       localMsdCommonCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCommonCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshMsdCommonCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCommonCode() {	 
   		return (substring(getStringValue(),beginMsdCommonCode,beginMsdCommonCode + MSD_COMMON_CODE_LEN));
   	}
     int localMsdSedEuroIndCounter = -1;
     public boolean isMsdSedEuroIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdSedEuroIndCounter != sharedCounter;
         localMsdSedEuroIndCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_SED_EURO_IND_LEN = 1;
	/**
	 * 	serialize this MsdSedEuroInd
	 */
   protected void serializeMsdSedEuroInd(char[] msdSedEuroInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdSedEuroInd,0,getStringValue(),beginMsdSedEuroInd,MSD_SED_EURO_IND_LEN);
       localMsdSedEuroIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdSedEuroIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdSedEuroInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdSedEuroInd() {	 
   		return (substring(getStringValue(),beginMsdSedEuroInd,beginMsdSedEuroInd + MSD_SED_EURO_IND_LEN));
   	}
     int localMsdExchangeCodeCounter = -1;
     public boolean isMsdExchangeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdExchangeCodeCounter != sharedCounter;
         localMsdExchangeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_EXCHANGE_CODE_LEN = 1;
	/**
	 * 	serialize this MsdExchangeCode
	 */
   protected void serializeMsdExchangeCode(char[] msdExchangeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdExchangeCode,0,getStringValue(),beginMsdExchangeCode,MSD_EXCHANGE_CODE_LEN);
       localMsdExchangeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdExchangeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdExchangeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdExchangeCode() {	 
   		return (substring(getStringValue(),beginMsdExchangeCode,beginMsdExchangeCode + MSD_EXCHANGE_CODE_LEN));
   	}
     int localMsdOtcExchangeCodeCounter = -1;
     public boolean isMsdOtcExchangeCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOtcExchangeCodeCounter != sharedCounter;
         localMsdOtcExchangeCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_OTC_EXCHANGE_CODE_LEN = 1;
	/**
	 * 	serialize this MsdOtcExchangeCode
	 */
   protected void serializeMsdOtcExchangeCode(char[] msdOtcExchangeCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdOtcExchangeCode,0,getStringValue(),beginMsdOtcExchangeCode,MSD_OTC_EXCHANGE_CODE_LEN);
       localMsdOtcExchangeCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdOtcExchangeCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshMsdOtcExchangeCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdOtcExchangeCode() {	 
   		return (substring(getStringValue(),beginMsdOtcExchangeCode,beginMsdOtcExchangeCode + MSD_OTC_EXCHANGE_CODE_LEN));
   	}
 
   
  protected  static final int BDMS_01_SEC_SYMBOL_LEN = 12;
   /**
	 *	serializeBdms01SecSymbol as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeBdms01SecSymbol(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginBdms01SecSymbol + index*BDMS_01_SEC_SYMBOL_LEN)
   	          , BDMS_01_SEC_SYMBOL_LEN 
   	          );
   }
     int localBdms01OptionCallCounter = -1;
     public boolean isBdms01OptionCallModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptionCallCounter != sharedCounter;
         localBdms01OptionCallCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPTION_CALL_LEN = 12;
	/**
	 * 	serialize this Bdms01OptionCall
	 */
   protected void serializeBdms01OptionCall(char[] bdms01OptionCall) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptionCall,0,getStringValue(),beginBdms01OptionCall,BDMS_01_OPTION_CALL_LEN);
       localBdms01OptionCallCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptionCallConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01OptionCall is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptionCall() {	 
   		return (substring(getStringValue(),beginBdms01OptionCall,beginBdms01OptionCall + BDMS_01_OPTION_CALL_LEN));
   	}
     int localBdms01OptionPutCounter = -1;
     public boolean isBdms01OptionPutModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptionPutCounter != sharedCounter;
         localBdms01OptionPutCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPTION_PUT_LEN = 12;
	/**
	 * 	serialize this Bdms01OptionPut
	 */
   protected void serializeBdms01OptionPut(char[] bdms01OptionPut) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptionPut,0,getStringValue(),beginBdms01OptionPut,BDMS_01_OPTION_PUT_LEN);
       localBdms01OptionPutCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptionPutConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01OptionPut is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptionPut() {	 
   		return (substring(getStringValue(),beginBdms01OptionPut,beginBdms01OptionPut + BDMS_01_OPTION_PUT_LEN));
   	}
     int localBdms01CbCusipNoCounter = -1;
     public boolean isBdms01CbCusipNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CbCusipNoCounter != sharedCounter;
         localBdms01CbCusipNoCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CB_CUSIP_NO_LEN = 12;
	/**
	 * 	serialize this Bdms01CbCusipNo
	 */
   protected void serializeBdms01CbCusipNo(char[] bdms01CbCusipNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CbCusipNo,0,getStringValue(),beginBdms01CbCusipNo,BDMS_01_CB_CUSIP_NO_LEN);
       localBdms01CbCusipNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CbCusipNoConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01CbCusipNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CbCusipNo() {	 
   		return (substring(getStringValue(),beginBdms01CbCusipNo,beginBdms01CbCusipNo + BDMS_01_CB_CUSIP_NO_LEN));
   	}
     int localBdms01PrimaryExchangeCdCounter = -1;
     public boolean isBdms01PrimaryExchangeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrimaryExchangeCdCounter != sharedCounter;
         localBdms01PrimaryExchangeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRIMARY_EXCHANGE_CD_LEN = 10;
	/**
	 * 	serialize this Bdms01PrimaryExchangeCd
	 */
   protected void serializeBdms01PrimaryExchangeCd(char[] bdms01PrimaryExchangeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrimaryExchangeCd,0,getStringValue(),beginBdms01PrimaryExchangeCd,BDMS_01_PRIMARY_EXCHANGE_CD_LEN);
       localBdms01PrimaryExchangeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrimaryExchangeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PrimaryExchangeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrimaryExchangeCd() {	 
   		return (substring(getStringValue(),beginBdms01PrimaryExchangeCd,beginBdms01PrimaryExchangeCd + BDMS_01_PRIMARY_EXCHANGE_CD_LEN));
   	}
     int localBdms01PostCdCounter = -1;
     public boolean isBdms01PostCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PostCdCounter != sharedCounter;
         localBdms01PostCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_POST_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PostCd
	 */
   protected void serializeBdms01PostCd(char[] bdms01PostCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PostCd,0,getStringValue(),beginBdms01PostCd,BDMS_01_POST_CD_LEN);
       localBdms01PostCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PostCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PostCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PostCd() {	 
   		return (substring(getStringValue(),beginBdms01PostCd,beginBdms01PostCd + BDMS_01_POST_CD_LEN));
   	}
     int localMsdAlternateSymbolCounter = -1;
     public boolean isMsdAlternateSymbolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdAlternateSymbolCounter != sharedCounter;
         localMsdAlternateSymbolCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_ALTERNATE_SYMBOL_LEN = 12;
	/**
	 * 	serialize this MsdAlternateSymbol
	 */
   protected void serializeMsdAlternateSymbol(char[] msdAlternateSymbol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdAlternateSymbol,0,getStringValue(),beginMsdAlternateSymbol,MSD_ALTERNATE_SYMBOL_LEN);
       localMsdAlternateSymbolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdAlternateSymbolConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshMsdAlternateSymbol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdAlternateSymbol() {	 
   		return (substring(getStringValue(),beginMsdAlternateSymbol,beginMsdAlternateSymbol + MSD_ALTERNATE_SYMBOL_LEN));
   	}
     int localBdms01DualAdpNoCounter = -1;
     public boolean isBdms01DualAdpNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DualAdpNoCounter != sharedCounter;
         localBdms01DualAdpNoCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DUAL_ADP_NO_LEN = 7;
	/**
	 * 	serialize this Bdms01DualAdpNo
	 */
   protected void serializeBdms01DualAdpNo(char[] bdms01DualAdpNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DualAdpNo,0,getStringValue(),beginBdms01DualAdpNo,BDMS_01_DUAL_ADP_NO_LEN);
       localBdms01DualAdpNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DualAdpNoConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshBdms01DualAdpNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DualAdpNo() {	 
   		return (substring(getStringValue(),beginBdms01DualAdpNo,beginBdms01DualAdpNo + BDMS_01_DUAL_ADP_NO_LEN));
   	}

		public int bdms01SecSymbolSize() {
			return BDMS_01_SEC_SYMBOL_SIZE;
		}
		public int bdms01OtherExchangesSize() {
			return BDMS_01_OTHER_EXCHANGES_SIZE;
		}



}
  
