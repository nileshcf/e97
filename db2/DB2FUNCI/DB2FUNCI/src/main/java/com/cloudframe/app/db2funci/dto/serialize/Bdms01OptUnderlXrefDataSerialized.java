package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01OptUnderlXrefDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01OptUnderlXrefDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01OptUnderlXrefDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_OPT_UNDERL_XREF_DATA_LENGTH = 128;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01UndlSecSegSqlcd;
            protected  int beginBdms01UndlSymblTrdsAsCd;
            protected  int beginBdms01UndlPrimeExchangeCd;
            protected  int beginBdms01UndlPrimeSymbolCd;
            protected  int beginBdms01UndlCanadaExchangeCd;
            protected  int beginBdms01UndlCanadaSymbolCd;
            protected  int beginBdms01UndlCusip;
            protected  int beginBdms01UndlIsin;
            protected  int beginBdms01UndlSedol;
            protected  int beginBdms01UndlCommonCode;
            protected  int beginBdms01UndlCins;
	
	/**
	* Constructor for Bdms01OptUnderlXrefDataSerialized
	**/
    public Bdms01OptUnderlXrefDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01OptUnderlXrefDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OptUnderlXrefDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01OptUnderlXrefDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5277); // serialize this field at offset 5277 by default 
    }
    
	/**
	* sets parent for this Bdms01OptUnderlXrefDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5277 by default
    }    
	/**
	* initializes the field in Bdms01OptUnderlXrefDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_OPT_UNDERL_XREF_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01UndlSecSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01UndlSymblTrdsAsCd = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01UndlPrimeExchangeCd = getStartOffset() + 24;	// set offset for serialization
  
             beginBdms01UndlPrimeSymbolCd = getStartOffset() + 34;	// set offset for serialization
  
             beginBdms01UndlCanadaExchangeCd = getStartOffset() + 46;	// set offset for serialization
  
             beginBdms01UndlCanadaSymbolCd = getStartOffset() + 56;	// set offset for serialization
  
             beginBdms01UndlCusip = getStartOffset() + 68;	// set offset for serialization
  
             beginBdms01UndlIsin = getStartOffset() + 80;	// set offset for serialization
  
             beginBdms01UndlSedol = getStartOffset() + 92;	// set offset for serialization
  
             beginBdms01UndlCommonCode = getStartOffset() + 104;	// set offset for serialization
  
             beginBdms01UndlCins = getStartOffset() + 116;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01UndlSecSegSqlcdCounter = -1;
     public boolean isBdms01UndlSecSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlSecSegSqlcdCounter != sharedCounter;
         localBdms01UndlSecSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01UndlSecSegSqlcd
	 *	@return bdms01UndlSecSegSqlcd
	 */
	public char[]  getBdms01UndlSecSegSqlcdString() {
	     return getCharArray(beginBdms01UndlSecSegSqlcd,BDMS_01_UNDL_SEC_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01UndlSecSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01UndlSecSegSqlcd
	                    ,beginBdms01UndlSecSegSqlcd + BDMS_01_UNDL_SEC_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_UNDL_SEC_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01UndlSecSegSqlcd
	 */
	protected void serializeBdms01UndlSecSegSqlcd(int bdms01UndlSecSegSqlcd) {
		 putNumber(beginBdms01UndlSecSegSqlcd,bdms01UndlSecSegSqlcd,BDMS_01_UNDL_SEC_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01UndlSecSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01UndlSecSegSqlcd
	 */
   	protected  int serializeBdms01UndlSecSegSqlcd(char[] value) {
	    int  bdms01UndlSecSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01UndlSecSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01UndlSecSegSqlcd
		       ,4
		      );
		 localBdms01UndlSecSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01UndlSecSegSqlcd;
    }

   protected int checkBdms01UndlSecSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01UndlSecSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01UndlSecSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01UndlSecSegSqlcd
			                 ,BDMS_01_UNDL_SEC_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01UndlSecSegSqlcd", beginBdms01UndlSecSegSqlcd,BDMS_01_UNDL_SEC_SEG_SQLCD_LEN);
    }
   	}
     int localBdms01UndlSymblTrdsAsCdCounter = -1;
     public boolean isBdms01UndlSymblTrdsAsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlSymblTrdsAsCdCounter != sharedCounter;
         localBdms01UndlSymblTrdsAsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_SYMBL_TRDS_AS_CD_LEN = 20;
	/**
	 * 	serialize this Bdms01UndlSymblTrdsAsCd
	 */
   protected void serializeBdms01UndlSymblTrdsAsCd(char[] bdms01UndlSymblTrdsAsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlSymblTrdsAsCd,0,getStringValue(),beginBdms01UndlSymblTrdsAsCd,BDMS_01_UNDL_SYMBL_TRDS_AS_CD_LEN);
       localBdms01UndlSymblTrdsAsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlSymblTrdsAsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshBdms01UndlSymblTrdsAsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlSymblTrdsAsCd() {	 
   		return (substring(getStringValue(),beginBdms01UndlSymblTrdsAsCd,beginBdms01UndlSymblTrdsAsCd + BDMS_01_UNDL_SYMBL_TRDS_AS_CD_LEN));
   	}
     int localBdms01UndlPrimeExchangeCdCounter = -1;
     public boolean isBdms01UndlPrimeExchangeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlPrimeExchangeCdCounter != sharedCounter;
         localBdms01UndlPrimeExchangeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_PRIME_EXCHANGE_CD_LEN = 10;
	/**
	 * 	serialize this Bdms01UndlPrimeExchangeCd
	 */
   protected void serializeBdms01UndlPrimeExchangeCd(char[] bdms01UndlPrimeExchangeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlPrimeExchangeCd,0,getStringValue(),beginBdms01UndlPrimeExchangeCd,BDMS_01_UNDL_PRIME_EXCHANGE_CD_LEN);
       localBdms01UndlPrimeExchangeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlPrimeExchangeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01UndlPrimeExchangeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlPrimeExchangeCd() {	 
   		return (substring(getStringValue(),beginBdms01UndlPrimeExchangeCd,beginBdms01UndlPrimeExchangeCd + BDMS_01_UNDL_PRIME_EXCHANGE_CD_LEN));
   	}
     int localBdms01UndlPrimeSymbolCdCounter = -1;
     public boolean isBdms01UndlPrimeSymbolCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlPrimeSymbolCdCounter != sharedCounter;
         localBdms01UndlPrimeSymbolCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_PRIME_SYMBOL_CD_LEN = 12;
	/**
	 * 	serialize this Bdms01UndlPrimeSymbolCd
	 */
   protected void serializeBdms01UndlPrimeSymbolCd(char[] bdms01UndlPrimeSymbolCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlPrimeSymbolCd,0,getStringValue(),beginBdms01UndlPrimeSymbolCd,BDMS_01_UNDL_PRIME_SYMBOL_CD_LEN);
       localBdms01UndlPrimeSymbolCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlPrimeSymbolCdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01UndlPrimeSymbolCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlPrimeSymbolCd() {	 
   		return (substring(getStringValue(),beginBdms01UndlPrimeSymbolCd,beginBdms01UndlPrimeSymbolCd + BDMS_01_UNDL_PRIME_SYMBOL_CD_LEN));
   	}
     int localBdms01UndlCanadaExchangeCdCounter = -1;
     public boolean isBdms01UndlCanadaExchangeCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlCanadaExchangeCdCounter != sharedCounter;
         localBdms01UndlCanadaExchangeCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_CANADA_EXCHANGE_CD_LEN = 10;
	/**
	 * 	serialize this Bdms01UndlCanadaExchangeCd
	 */
   protected void serializeBdms01UndlCanadaExchangeCd(char[] bdms01UndlCanadaExchangeCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlCanadaExchangeCd,0,getStringValue(),beginBdms01UndlCanadaExchangeCd,BDMS_01_UNDL_CANADA_EXCHANGE_CD_LEN);
       localBdms01UndlCanadaExchangeCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlCanadaExchangeCdConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01UndlCanadaExchangeCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlCanadaExchangeCd() {	 
   		return (substring(getStringValue(),beginBdms01UndlCanadaExchangeCd,beginBdms01UndlCanadaExchangeCd + BDMS_01_UNDL_CANADA_EXCHANGE_CD_LEN));
   	}
     int localBdms01UndlCanadaSymbolCdCounter = -1;
     public boolean isBdms01UndlCanadaSymbolCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlCanadaSymbolCdCounter != sharedCounter;
         localBdms01UndlCanadaSymbolCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_CANADA_SYMBOL_CD_LEN = 12;
	/**
	 * 	serialize this Bdms01UndlCanadaSymbolCd
	 */
   protected void serializeBdms01UndlCanadaSymbolCd(char[] bdms01UndlCanadaSymbolCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlCanadaSymbolCd,0,getStringValue(),beginBdms01UndlCanadaSymbolCd,BDMS_01_UNDL_CANADA_SYMBOL_CD_LEN);
       localBdms01UndlCanadaSymbolCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlCanadaSymbolCdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01UndlCanadaSymbolCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlCanadaSymbolCd() {	 
   		return (substring(getStringValue(),beginBdms01UndlCanadaSymbolCd,beginBdms01UndlCanadaSymbolCd + BDMS_01_UNDL_CANADA_SYMBOL_CD_LEN));
   	}
     int localBdms01UndlCusipCounter = -1;
     public boolean isBdms01UndlCusipModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlCusipCounter != sharedCounter;
         localBdms01UndlCusipCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_CUSIP_LEN = 12;
	/**
	 * 	serialize this Bdms01UndlCusip
	 */
   protected void serializeBdms01UndlCusip(char[] bdms01UndlCusip) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlCusip,0,getStringValue(),beginBdms01UndlCusip,BDMS_01_UNDL_CUSIP_LEN);
       localBdms01UndlCusipCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlCusipConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01UndlCusip is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlCusip() {	 
   		return (substring(getStringValue(),beginBdms01UndlCusip,beginBdms01UndlCusip + BDMS_01_UNDL_CUSIP_LEN));
   	}
     int localBdms01UndlIsinCounter = -1;
     public boolean isBdms01UndlIsinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlIsinCounter != sharedCounter;
         localBdms01UndlIsinCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_ISIN_LEN = 12;
	/**
	 * 	serialize this Bdms01UndlIsin
	 */
   protected void serializeBdms01UndlIsin(char[] bdms01UndlIsin) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlIsin,0,getStringValue(),beginBdms01UndlIsin,BDMS_01_UNDL_ISIN_LEN);
       localBdms01UndlIsinCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlIsinConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01UndlIsin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlIsin() {	 
   		return (substring(getStringValue(),beginBdms01UndlIsin,beginBdms01UndlIsin + BDMS_01_UNDL_ISIN_LEN));
   	}
     int localBdms01UndlSedolCounter = -1;
     public boolean isBdms01UndlSedolModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlSedolCounter != sharedCounter;
         localBdms01UndlSedolCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_SEDOL_LEN = 12;
	/**
	 * 	serialize this Bdms01UndlSedol
	 */
   protected void serializeBdms01UndlSedol(char[] bdms01UndlSedol) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlSedol,0,getStringValue(),beginBdms01UndlSedol,BDMS_01_UNDL_SEDOL_LEN);
       localBdms01UndlSedolCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlSedolConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01UndlSedol is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlSedol() {	 
   		return (substring(getStringValue(),beginBdms01UndlSedol,beginBdms01UndlSedol + BDMS_01_UNDL_SEDOL_LEN));
   	}
     int localBdms01UndlCommonCodeCounter = -1;
     public boolean isBdms01UndlCommonCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlCommonCodeCounter != sharedCounter;
         localBdms01UndlCommonCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_COMMON_CODE_LEN = 12;
	/**
	 * 	serialize this Bdms01UndlCommonCode
	 */
   protected void serializeBdms01UndlCommonCode(char[] bdms01UndlCommonCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlCommonCode,0,getStringValue(),beginBdms01UndlCommonCode,BDMS_01_UNDL_COMMON_CODE_LEN);
       localBdms01UndlCommonCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlCommonCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01UndlCommonCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlCommonCode() {	 
   		return (substring(getStringValue(),beginBdms01UndlCommonCode,beginBdms01UndlCommonCode + BDMS_01_UNDL_COMMON_CODE_LEN));
   	}
     int localBdms01UndlCinsCounter = -1;
     public boolean isBdms01UndlCinsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01UndlCinsCounter != sharedCounter;
         localBdms01UndlCinsCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_UNDL_CINS_LEN = 12;
	/**
	 * 	serialize this Bdms01UndlCins
	 */
   protected void serializeBdms01UndlCins(char[] bdms01UndlCins) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01UndlCins,0,getStringValue(),beginBdms01UndlCins,BDMS_01_UNDL_CINS_LEN);
       localBdms01UndlCinsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01UndlCinsConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01UndlCins is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01UndlCins() {	 
   		return (substring(getStringValue(),beginBdms01UndlCins,beginBdms01UndlCins + BDMS_01_UNDL_CINS_LEN));
   	}




}
  
