package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01OptionSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01OptionSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01OptionSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_OPTION_SEG_DATA_LENGTH = 189;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01OptionSegSqlcd;
            protected  int beginMsdUnderlyingSecNo;
            protected  int beginMsdOptStrikePrice;
            protected  int beginMsdOptExpndStrkPrc;
            protected  int beginMsdOptFactor;
            protected  int beginMsdOptExpndFactor;
            protected  int beginMsdOptCapPrice;
            protected  int beginBdms01OptExpirationDt;
            protected  int beginMsdUnderlyingSecPrice;
            protected  int beginMsdCurrencyCode01;
            protected  int beginMsdCurrencyCode2;
            protected  int beginBdms01OptTradeVolume;
            protected  int beginBdms01OptSecurityParsInd;
            protected  int beginBdms01TypeDebtOptCd;
            protected  int beginBdms01EscrowRcptInd;
            protected  int beginBdms01TypeOptionCd;
            protected  int beginBdms01TypeIndexOptCd;
            protected  int beginBdms01OptCurrencyCd;
            protected  int beginBdms01PutCallCd;
            protected  int beginBdms01LeapInd;
            protected  int beginBdms01FlexInd;
            protected  int beginBdms01EurExerciseInd;
            protected  int beginBdms01OptCurrencyLegacyCd;
            protected  int beginBdms01DlvrblFctrPct;
            protected  int beginBdms01DcmlFrctnCd;
            protected  int beginBdms01DlvrbOptnSymId;
            protected  int beginBdms01OptionMaturityDt;
            protected  int beginBdms01OccOptnSymId;
            protected  int beginBdms01FroInd;
            protected  int beginBdms01BrdBsdBnryInd;
            protected  int beginBdms01SecCusipBaseNbr;
	
	/**
	* Constructor for Bdms01OptionSegDataSerialized
	**/
    public Bdms01OptionSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01OptionSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OptionSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01OptionSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2349); // serialize this field at offset 2349 by default 
    }
    
	/**
	* sets parent for this Bdms01OptionSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2349 by default
    }    
	/**
	* initializes the field in Bdms01OptionSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_OPTION_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01OptionSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdUnderlyingSecNo = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdOptStrikePrice = getStartOffset() + 11;	// set offset for serialization
  
             beginMsdOptExpndStrkPrc = getStartOffset() + 11;	// set offset for serialization
  
             beginMsdOptFactor = getStartOffset() + 29;	// set offset for serialization
  
             beginMsdOptExpndFactor = getStartOffset() + 29;	// set offset for serialization
  
  
             beginMsdOptCapPrice = getStartOffset() + 52;	// set offset for serialization
  
             beginBdms01OptExpirationDt = getStartOffset() + 70;	// set offset for serialization
  
             beginMsdUnderlyingSecPrice = getStartOffset() + 80;	// set offset for serialization
  
             beginMsdCurrencyCode01 = getStartOffset() + 98;	// set offset for serialization
  
             beginMsdCurrencyCode2 = getStartOffset() + 98;	// set offset for serialization
  
             beginBdms01OptTradeVolume = getStartOffset() + 101;	// set offset for serialization
  
             beginBdms01OptSecurityParsInd = getStartOffset() + 112;	// set offset for serialization
  
             beginBdms01TypeDebtOptCd = getStartOffset() + 113;	// set offset for serialization
  
             beginBdms01EscrowRcptInd = getStartOffset() + 116;	// set offset for serialization
  
             beginBdms01TypeOptionCd = getStartOffset() + 117;	// set offset for serialization
  
             beginBdms01TypeIndexOptCd = getStartOffset() + 119;	// set offset for serialization
  
             beginBdms01OptCurrencyCd = getStartOffset() + 121;	// set offset for serialization
  
             beginBdms01PutCallCd = getStartOffset() + 123;	// set offset for serialization
  
             beginBdms01LeapInd = getStartOffset() + 124;	// set offset for serialization
  
             beginBdms01FlexInd = getStartOffset() + 125;	// set offset for serialization
  
             beginBdms01EurExerciseInd = getStartOffset() + 126;	// set offset for serialization
  
             beginBdms01OptCurrencyLegacyCd = getStartOffset() + 127;	// set offset for serialization
  
             beginBdms01DlvrblFctrPct = getStartOffset() + 129;	// set offset for serialization
  
             beginBdms01DcmlFrctnCd = getStartOffset() + 144;	// set offset for serialization
  
             beginBdms01DlvrbOptnSymId = getStartOffset() + 145;	// set offset for serialization
  
             beginBdms01OptionMaturityDt = getStartOffset() + 151;	// set offset for serialization
  
             beginBdms01OccOptnSymId = getStartOffset() + 161;	// set offset for serialization
  
             beginBdms01FroInd = getStartOffset() + 167;	// set offset for serialization
  
             beginBdms01BrdBsdBnryInd = getStartOffset() + 168;	// set offset for serialization
  
             beginBdms01SecCusipBaseNbr = getStartOffset() + 169;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01OptionSegSqlcdCounter = -1;
     public boolean isBdms01OptionSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptionSegSqlcdCounter != sharedCounter;
         localBdms01OptionSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01OptionSegSqlcd
	 *	@return bdms01OptionSegSqlcd
	 */
	public char[]  getBdms01OptionSegSqlcdString() {
	     return getCharArray(beginBdms01OptionSegSqlcd,BDMS_01_OPTION_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01OptionSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01OptionSegSqlcd
	                    ,beginBdms01OptionSegSqlcd + BDMS_01_OPTION_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_OPTION_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01OptionSegSqlcd
	 */
	protected void serializeBdms01OptionSegSqlcd(int bdms01OptionSegSqlcd) {
		 putNumber(beginBdms01OptionSegSqlcd,bdms01OptionSegSqlcd,BDMS_01_OPTION_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01OptionSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01OptionSegSqlcd
	 */
   	protected  int serializeBdms01OptionSegSqlcd(char[] value) {
	    int  bdms01OptionSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01OptionSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01OptionSegSqlcd
		       ,4
		      );
		 localBdms01OptionSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01OptionSegSqlcd;
    }

   protected int checkBdms01OptionSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01OptionSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01OptionSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01OptionSegSqlcd
			                 ,BDMS_01_OPTION_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01OptionSegSqlcd", beginBdms01OptionSegSqlcd,BDMS_01_OPTION_SEG_SQLCD_LEN);
    }
   	}
     int localMsdUnderlyingSecNoCounter = -1;
     public boolean isMsdUnderlyingSecNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdUnderlyingSecNoCounter != sharedCounter;
         localMsdUnderlyingSecNoCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_UNDERLYING_SEC_NO_LEN = 7;
	/**
	 * 	serialize this MsdUnderlyingSecNo
	 */
   protected void serializeMsdUnderlyingSecNo(char[] msdUnderlyingSecNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdUnderlyingSecNo,0,getStringValue(),beginMsdUnderlyingSecNo,MSD_UNDERLYING_SEC_NO_LEN);
       localMsdUnderlyingSecNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdUnderlyingSecNoConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshMsdUnderlyingSecNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdUnderlyingSecNo() {	 
   		return (substring(getStringValue(),beginMsdUnderlyingSecNo,beginMsdUnderlyingSecNo + MSD_UNDERLYING_SEC_NO_LEN));
   	}
     int localMsdOptStrikePriceCounter = -1;
     
     public boolean isMsdOptStrikePriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptStrikePriceCounter != sharedCounter;
         localMsdOptStrikePriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOptStrikePrice
	 *	@return msdOptStrikePrice
	 */
	public char[]  getMsdOptStrikePriceString() {
	    return getCharArray(beginMsdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOptStrikePriceIsNumeric() {
		    return isNumeric(beginMsdOptStrikePrice
	                    ,beginMsdOptStrikePrice + MSD_OPT_STRIKE_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OPT_STRIKE_PRICE_LEN = 18;
  protected  static final int MSD_OPT_STRIKE_PRICE_SCALE = 8;

   protected BigDecimal checkMsdOptStrikePriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdOptStrikePrice
	 */
	protected void serializeMsdOptStrikePrice(BigDecimal msdOptStrikePrice) {
	       putNumber(beginMsdOptStrikePrice,msdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN,MSD_OPT_STRIKE_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOptStrikePriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOptStrikePrice
	 */
   	protected  BigDecimal serializeMsdOptStrikePrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdOptStrikePrice
		       ,18
		      );		 localMsdOptStrikePriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OPT_STRIKE_PRICE_LEN,MSD_OPT_STRIKE_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOptStrikePrice", beginMsdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdOptStrikePrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOptStrikePrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOptStrikePrice
			            ,MSD_OPT_STRIKE_PRICE_LEN
			            ,MSD_OPT_STRIKE_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOptStrikePrice", beginMsdOptStrikePrice,MSD_OPT_STRIKE_PRICE_LEN);
    }
   	}
     int localMsdOptExpndStrkPrcCounter = -1;
     
     public boolean isMsdOptExpndStrkPrcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptExpndStrkPrcCounter != sharedCounter;
         localMsdOptExpndStrkPrcCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOptExpndStrkPrc
	 *	@return msdOptExpndStrkPrc
	 */
	public char[]  getMsdOptExpndStrkPrcString() {
	    return getCharArray(beginMsdOptExpndStrkPrc,MSD_OPT_EXPND_STRK_PRC_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOptExpndStrkPrcIsNumeric() {
		    return isNumeric(beginMsdOptExpndStrkPrc
	                    ,beginMsdOptExpndStrkPrc + MSD_OPT_EXPND_STRK_PRC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OPT_EXPND_STRK_PRC_LEN = 18;
  protected  static final int MSD_OPT_EXPND_STRK_PRC_SCALE = 8;

   protected BigDecimal checkMsdOptExpndStrkPrcMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdOptExpndStrkPrc
	 */
	protected void serializeMsdOptExpndStrkPrc(BigDecimal msdOptExpndStrkPrc) {
	       putNumber(beginMsdOptExpndStrkPrc,msdOptExpndStrkPrc,MSD_OPT_EXPND_STRK_PRC_LEN,MSD_OPT_EXPND_STRK_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOptExpndStrkPrcCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOptExpndStrkPrc
	 */
   	protected  BigDecimal serializeMsdOptExpndStrkPrc(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdOptExpndStrkPrc
		       ,18
		      );		 localMsdOptExpndStrkPrcCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OPT_EXPND_STRK_PRC_LEN,MSD_OPT_EXPND_STRK_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOptExpndStrkPrc", beginMsdOptExpndStrkPrc,MSD_OPT_EXPND_STRK_PRC_LEN);
    	}
    }
    /**
	 *	refreshMsdOptExpndStrkPrc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOptExpndStrkPrc() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOptExpndStrkPrc
			            ,MSD_OPT_EXPND_STRK_PRC_LEN
			            ,MSD_OPT_EXPND_STRK_PRC_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOptExpndStrkPrc", beginMsdOptExpndStrkPrc,MSD_OPT_EXPND_STRK_PRC_LEN);
    }
   	}
     int localMsdOptFactorCounter = -1;
     
     public boolean isMsdOptFactorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptFactorCounter != sharedCounter;
         localMsdOptFactorCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOptFactor
	 *	@return msdOptFactor
	 */
	public char[]  getMsdOptFactorString() {
	    return getCharArray(beginMsdOptFactor,MSD_OPT_FACTOR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOptFactorIsNumeric() {
		    return isNumeric(beginMsdOptFactor
	                    ,beginMsdOptFactor + MSD_OPT_FACTOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OPT_FACTOR_LEN = 15;
  protected  static final int MSD_OPT_FACTOR_SCALE = 8;

   protected BigDecimal checkMsdOptFactorMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdOptFactor
	 */
	protected void serializeMsdOptFactor(BigDecimal msdOptFactor) {
	       putNumber(beginMsdOptFactor,msdOptFactor,MSD_OPT_FACTOR_LEN,MSD_OPT_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOptFactorCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOptFactor
	 */
   	protected  BigDecimal serializeMsdOptFactor(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdOptFactor
		       ,15
		      );		 localMsdOptFactorCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OPT_FACTOR_LEN,MSD_OPT_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOptFactor", beginMsdOptFactor,MSD_OPT_FACTOR_LEN);
    	}
    }
    /**
	 *	refreshMsdOptFactor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOptFactor() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOptFactor
			            ,MSD_OPT_FACTOR_LEN
			            ,MSD_OPT_FACTOR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOptFactor", beginMsdOptFactor,MSD_OPT_FACTOR_LEN);
    }
   	}
     int localMsdOptExpndFactorCounter = -1;
     
     public boolean isMsdOptExpndFactorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptExpndFactorCounter != sharedCounter;
         localMsdOptExpndFactorCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOptExpndFactor
	 *	@return msdOptExpndFactor
	 */
	public char[]  getMsdOptExpndFactorString() {
	    return getCharArray(beginMsdOptExpndFactor,MSD_OPT_EXPND_FACTOR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOptExpndFactorIsNumeric() {
		    return isNumeric(beginMsdOptExpndFactor
	                    ,beginMsdOptExpndFactor + MSD_OPT_EXPND_FACTOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OPT_EXPND_FACTOR_LEN = 15;
  protected  static final int MSD_OPT_EXPND_FACTOR_SCALE = 8;

   protected BigDecimal checkMsdOptExpndFactorMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdOptExpndFactor
	 */
	protected void serializeMsdOptExpndFactor(BigDecimal msdOptExpndFactor) {
	       putNumber(beginMsdOptExpndFactor,msdOptExpndFactor,MSD_OPT_EXPND_FACTOR_LEN,MSD_OPT_EXPND_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOptExpndFactorCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOptExpndFactor
	 */
   	protected  BigDecimal serializeMsdOptExpndFactor(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdOptExpndFactor
		       ,15
		      );		 localMsdOptExpndFactorCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OPT_EXPND_FACTOR_LEN,MSD_OPT_EXPND_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOptExpndFactor", beginMsdOptExpndFactor,MSD_OPT_EXPND_FACTOR_LEN);
    	}
    }
    /**
	 *	refreshMsdOptExpndFactor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOptExpndFactor() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOptExpndFactor
			            ,MSD_OPT_EXPND_FACTOR_LEN
			            ,MSD_OPT_EXPND_FACTOR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOptExpndFactor", beginMsdOptExpndFactor,MSD_OPT_EXPND_FACTOR_LEN);
    }
   	}
     int localMsdOptCapPriceCounter = -1;
     
     public boolean isMsdOptCapPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOptCapPriceCounter != sharedCounter;
         localMsdOptCapPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOptCapPrice
	 *	@return msdOptCapPrice
	 */
	public char[]  getMsdOptCapPriceString() {
	    return getCharArray(beginMsdOptCapPrice,MSD_OPT_CAP_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOptCapPriceIsNumeric() {
		    return isNumeric(beginMsdOptCapPrice
	                    ,beginMsdOptCapPrice + MSD_OPT_CAP_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OPT_CAP_PRICE_LEN = 18;
  protected  static final int MSD_OPT_CAP_PRICE_SCALE = 8;

   protected BigDecimal checkMsdOptCapPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdOptCapPrice
	 */
	protected void serializeMsdOptCapPrice(BigDecimal msdOptCapPrice) {
	       putNumber(beginMsdOptCapPrice,msdOptCapPrice,MSD_OPT_CAP_PRICE_LEN,MSD_OPT_CAP_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOptCapPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOptCapPrice
	 */
   	protected  BigDecimal serializeMsdOptCapPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdOptCapPrice
		       ,18
		      );		 localMsdOptCapPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OPT_CAP_PRICE_LEN,MSD_OPT_CAP_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOptCapPrice", beginMsdOptCapPrice,MSD_OPT_CAP_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdOptCapPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOptCapPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOptCapPrice
			            ,MSD_OPT_CAP_PRICE_LEN
			            ,MSD_OPT_CAP_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOptCapPrice", beginMsdOptCapPrice,MSD_OPT_CAP_PRICE_LEN);
    }
   	}
     int localBdms01OptExpirationDtCounter = -1;
     public boolean isBdms01OptExpirationDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptExpirationDtCounter != sharedCounter;
         localBdms01OptExpirationDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPT_EXPIRATION_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01OptExpirationDt
	 */
   protected void serializeBdms01OptExpirationDt(char[] bdms01OptExpirationDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptExpirationDt,0,getStringValue(),beginBdms01OptExpirationDt,BDMS_01_OPT_EXPIRATION_DT_LEN);
       localBdms01OptExpirationDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptExpirationDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01OptExpirationDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptExpirationDt() {	 
   		return (substring(getStringValue(),beginBdms01OptExpirationDt,beginBdms01OptExpirationDt + BDMS_01_OPT_EXPIRATION_DT_LEN));
   	}
     int localMsdUnderlyingSecPriceCounter = -1;
     
     public boolean isMsdUnderlyingSecPriceModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdUnderlyingSecPriceCounter != sharedCounter;
         localMsdUnderlyingSecPriceCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdUnderlyingSecPrice
	 *	@return msdUnderlyingSecPrice
	 */
	public char[]  getMsdUnderlyingSecPriceString() {
	    return getCharArray(beginMsdUnderlyingSecPrice,MSD_UNDERLYING_SEC_PRICE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdUnderlyingSecPriceIsNumeric() {
		    return isNumeric(beginMsdUnderlyingSecPrice
	                    ,beginMsdUnderlyingSecPrice + MSD_UNDERLYING_SEC_PRICE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_UNDERLYING_SEC_PRICE_LEN = 18;
  protected  static final int MSD_UNDERLYING_SEC_PRICE_SCALE = 8;

   protected BigDecimal checkMsdUnderlyingSecPriceMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdUnderlyingSecPrice
	 */
	protected void serializeMsdUnderlyingSecPrice(BigDecimal msdUnderlyingSecPrice) {
	       putNumber(beginMsdUnderlyingSecPrice,msdUnderlyingSecPrice,MSD_UNDERLYING_SEC_PRICE_LEN,MSD_UNDERLYING_SEC_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdUnderlyingSecPriceCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdUnderlyingSecPrice
	 */
   	protected  BigDecimal serializeMsdUnderlyingSecPrice(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdUnderlyingSecPrice
		       ,18
		      );		 localMsdUnderlyingSecPriceCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_UNDERLYING_SEC_PRICE_LEN,MSD_UNDERLYING_SEC_PRICE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdUnderlyingSecPrice", beginMsdUnderlyingSecPrice,MSD_UNDERLYING_SEC_PRICE_LEN);
    	}
    }
    /**
	 *	refreshMsdUnderlyingSecPrice is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdUnderlyingSecPrice() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdUnderlyingSecPrice
			            ,MSD_UNDERLYING_SEC_PRICE_LEN
			            ,MSD_UNDERLYING_SEC_PRICE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdUnderlyingSecPrice", beginMsdUnderlyingSecPrice,MSD_UNDERLYING_SEC_PRICE_LEN);
    }
   	}
     int localMsdCurrencyCode01Counter = -1;
     public boolean isMsdCurrencyCode01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCurrencyCode01Counter != sharedCounter;
         localMsdCurrencyCode01Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CURRENCY_CODE_01_LEN = 3;
	/**
	 * 	serialize this MsdCurrencyCode01
	 */
   protected void serializeMsdCurrencyCode01(char[] msdCurrencyCode01) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCurrencyCode01,0,getStringValue(),beginMsdCurrencyCode01,MSD_CURRENCY_CODE_01_LEN);
       localMsdCurrencyCode01Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCurrencyCode01Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsdCurrencyCode01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCurrencyCode01() {	 
   		return (substring(getStringValue(),beginMsdCurrencyCode01,beginMsdCurrencyCode01 + MSD_CURRENCY_CODE_01_LEN));
   	}
     int localMsdCurrencyCode2Counter = -1;
     public boolean isMsdCurrencyCode2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCurrencyCode2Counter != sharedCounter;
         localMsdCurrencyCode2Counter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CURRENCY_CODE_2_LEN = 3;
	/**
	 * 	serialize this MsdCurrencyCode2
	 */
   protected void serializeMsdCurrencyCode2(char[] msdCurrencyCode2) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCurrencyCode2,0,getStringValue(),beginMsdCurrencyCode2,MSD_CURRENCY_CODE_2_LEN);
       localMsdCurrencyCode2Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCurrencyCode2Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshMsdCurrencyCode2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCurrencyCode2() {	 
   		return (substring(getStringValue(),beginMsdCurrencyCode2,beginMsdCurrencyCode2 + MSD_CURRENCY_CODE_2_LEN));
   	}
     int localBdms01OptTradeVolumeCounter = -1;
     public boolean isBdms01OptTradeVolumeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptTradeVolumeCounter != sharedCounter;
         localBdms01OptTradeVolumeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01OptTradeVolume
	 *	@return bdms01OptTradeVolume
	 */
	public char[]  getBdms01OptTradeVolumeString() {
	     return getCharArray(beginBdms01OptTradeVolume,BDMS_01_OPT_TRADE_VOLUME_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01OptTradeVolumeIsNumeric() {
	    return isNumeric(beginBdms01OptTradeVolume
	                    ,beginBdms01OptTradeVolume + BDMS_01_OPT_TRADE_VOLUME_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_OPT_TRADE_VOLUME_LEN = 11;
  	/**
	 * serializeBdms01OptTradeVolume
	 */
	protected void serializeBdms01OptTradeVolume(long bdms01OptTradeVolume) {
		 putNumber(beginBdms01OptTradeVolume,bdms01OptTradeVolume,BDMS_01_OPT_TRADE_VOLUME_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01OptTradeVolumeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01OptTradeVolume
	 */
   	protected  long serializeBdms01OptTradeVolume(char[] value) {
	    long  bdms01OptTradeVolume;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01OptTradeVolume = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,false/*isSigned?*/)
		       ,beginBdms01OptTradeVolume
		       ,11
		      );
		 localBdms01OptTradeVolumeCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01OptTradeVolume;
    }

   protected long checkBdms01OptTradeVolumeMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01OptTradeVolume is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshBdms01OptTradeVolume() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginBdms01OptTradeVolume
			                 ,BDMS_01_OPT_TRADE_VOLUME_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01OptTradeVolume", beginBdms01OptTradeVolume,BDMS_01_OPT_TRADE_VOLUME_LEN);
    }
   	}
     int localBdms01OptSecurityParsIndCounter = -1;
     public boolean isBdms01OptSecurityParsIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptSecurityParsIndCounter != sharedCounter;
         localBdms01OptSecurityParsIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPT_SECURITY_PARS_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01OptSecurityParsInd
	 */
   protected void serializeBdms01OptSecurityParsInd(char[] bdms01OptSecurityParsInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptSecurityParsInd,0,getStringValue(),beginBdms01OptSecurityParsInd,BDMS_01_OPT_SECURITY_PARS_IND_LEN);
       localBdms01OptSecurityParsIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptSecurityParsIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01OptSecurityParsInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptSecurityParsInd() {	 
   		return (substring(getStringValue(),beginBdms01OptSecurityParsInd,beginBdms01OptSecurityParsInd + BDMS_01_OPT_SECURITY_PARS_IND_LEN));
   	}
     int localBdms01TypeDebtOptCdCounter = -1;
     public boolean isBdms01TypeDebtOptCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeDebtOptCdCounter != sharedCounter;
         localBdms01TypeDebtOptCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_DEBT_OPT_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01TypeDebtOptCd
	 */
   protected void serializeBdms01TypeDebtOptCd(char[] bdms01TypeDebtOptCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeDebtOptCd,0,getStringValue(),beginBdms01TypeDebtOptCd,BDMS_01_TYPE_DEBT_OPT_CD_LEN);
       localBdms01TypeDebtOptCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeDebtOptCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01TypeDebtOptCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeDebtOptCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeDebtOptCd,beginBdms01TypeDebtOptCd + BDMS_01_TYPE_DEBT_OPT_CD_LEN));
   	}
     int localBdms01EscrowRcptIndCounter = -1;
     public boolean isBdms01EscrowRcptIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EscrowRcptIndCounter != sharedCounter;
         localBdms01EscrowRcptIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_ESCROW_RCPT_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01EscrowRcptInd
	 */
   protected void serializeBdms01EscrowRcptInd(char[] bdms01EscrowRcptInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EscrowRcptInd,0,getStringValue(),beginBdms01EscrowRcptInd,BDMS_01_ESCROW_RCPT_IND_LEN);
       localBdms01EscrowRcptIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EscrowRcptIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01EscrowRcptInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EscrowRcptInd() {	 
   		return (substring(getStringValue(),beginBdms01EscrowRcptInd,beginBdms01EscrowRcptInd + BDMS_01_ESCROW_RCPT_IND_LEN));
   	}
     int localBdms01TypeOptionCdCounter = -1;
     public boolean isBdms01TypeOptionCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeOptionCdCounter != sharedCounter;
         localBdms01TypeOptionCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_OPTION_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01TypeOptionCd
	 */
   protected void serializeBdms01TypeOptionCd(char[] bdms01TypeOptionCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeOptionCd,0,getStringValue(),beginBdms01TypeOptionCd,BDMS_01_TYPE_OPTION_CD_LEN);
       localBdms01TypeOptionCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeOptionCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01TypeOptionCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeOptionCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeOptionCd,beginBdms01TypeOptionCd + BDMS_01_TYPE_OPTION_CD_LEN));
   	}
     int localBdms01TypeIndexOptCdCounter = -1;
     public boolean isBdms01TypeIndexOptCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeIndexOptCdCounter != sharedCounter;
         localBdms01TypeIndexOptCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_INDEX_OPT_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01TypeIndexOptCd
	 */
   protected void serializeBdms01TypeIndexOptCd(char[] bdms01TypeIndexOptCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeIndexOptCd,0,getStringValue(),beginBdms01TypeIndexOptCd,BDMS_01_TYPE_INDEX_OPT_CD_LEN);
       localBdms01TypeIndexOptCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeIndexOptCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01TypeIndexOptCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeIndexOptCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeIndexOptCd,beginBdms01TypeIndexOptCd + BDMS_01_TYPE_INDEX_OPT_CD_LEN));
   	}
     int localBdms01OptCurrencyCdCounter = -1;
     public boolean isBdms01OptCurrencyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptCurrencyCdCounter != sharedCounter;
         localBdms01OptCurrencyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPT_CURRENCY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01OptCurrencyCd
	 */
   protected void serializeBdms01OptCurrencyCd(char[] bdms01OptCurrencyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptCurrencyCd,0,getStringValue(),beginBdms01OptCurrencyCd,BDMS_01_OPT_CURRENCY_CD_LEN);
       localBdms01OptCurrencyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptCurrencyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01OptCurrencyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptCurrencyCd() {	 
   		return (substring(getStringValue(),beginBdms01OptCurrencyCd,beginBdms01OptCurrencyCd + BDMS_01_OPT_CURRENCY_CD_LEN));
   	}
     int localBdms01PutCallCdCounter = -1;
     public boolean isBdms01PutCallCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PutCallCdCounter != sharedCounter;
         localBdms01PutCallCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PUT_CALL_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01PutCallCd
	 */
   protected void serializeBdms01PutCallCd(char[] bdms01PutCallCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PutCallCd,0,getStringValue(),beginBdms01PutCallCd,BDMS_01_PUT_CALL_CD_LEN);
       localBdms01PutCallCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PutCallCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PutCallCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PutCallCd() {	 
   		return (substring(getStringValue(),beginBdms01PutCallCd,beginBdms01PutCallCd + BDMS_01_PUT_CALL_CD_LEN));
   	}
     int localBdms01LeapIndCounter = -1;
     public boolean isBdms01LeapIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01LeapIndCounter != sharedCounter;
         localBdms01LeapIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_LEAP_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01LeapInd
	 */
   protected void serializeBdms01LeapInd(char[] bdms01LeapInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01LeapInd,0,getStringValue(),beginBdms01LeapInd,BDMS_01_LEAP_IND_LEN);
       localBdms01LeapIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01LeapIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01LeapInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01LeapInd() {	 
   		return (substring(getStringValue(),beginBdms01LeapInd,beginBdms01LeapInd + BDMS_01_LEAP_IND_LEN));
   	}
     int localBdms01FlexIndCounter = -1;
     public boolean isBdms01FlexIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FlexIndCounter != sharedCounter;
         localBdms01FlexIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FLEX_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01FlexInd
	 */
   protected void serializeBdms01FlexInd(char[] bdms01FlexInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FlexInd,0,getStringValue(),beginBdms01FlexInd,BDMS_01_FLEX_IND_LEN);
       localBdms01FlexIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FlexIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FlexInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FlexInd() {	 
   		return (substring(getStringValue(),beginBdms01FlexInd,beginBdms01FlexInd + BDMS_01_FLEX_IND_LEN));
   	}
     int localBdms01EurExerciseIndCounter = -1;
     public boolean isBdms01EurExerciseIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01EurExerciseIndCounter != sharedCounter;
         localBdms01EurExerciseIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_EUR_EXERCISE_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01EurExerciseInd
	 */
   protected void serializeBdms01EurExerciseInd(char[] bdms01EurExerciseInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01EurExerciseInd,0,getStringValue(),beginBdms01EurExerciseInd,BDMS_01_EUR_EXERCISE_IND_LEN);
       localBdms01EurExerciseIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01EurExerciseIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01EurExerciseInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01EurExerciseInd() {	 
   		return (substring(getStringValue(),beginBdms01EurExerciseInd,beginBdms01EurExerciseInd + BDMS_01_EUR_EXERCISE_IND_LEN));
   	}
     int localBdms01OptCurrencyLegacyCdCounter = -1;
     public boolean isBdms01OptCurrencyLegacyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptCurrencyLegacyCdCounter != sharedCounter;
         localBdms01OptCurrencyLegacyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPT_CURRENCY_LEGACY_CD_LEN = 2;
	/**
	 * 	serialize this Bdms01OptCurrencyLegacyCd
	 */
   protected void serializeBdms01OptCurrencyLegacyCd(char[] bdms01OptCurrencyLegacyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptCurrencyLegacyCd,0,getStringValue(),beginBdms01OptCurrencyLegacyCd,BDMS_01_OPT_CURRENCY_LEGACY_CD_LEN);
       localBdms01OptCurrencyLegacyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptCurrencyLegacyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBdms01OptCurrencyLegacyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptCurrencyLegacyCd() {	 
   		return (substring(getStringValue(),beginBdms01OptCurrencyLegacyCd,beginBdms01OptCurrencyLegacyCd + BDMS_01_OPT_CURRENCY_LEGACY_CD_LEN));
   	}
     int localBdms01DlvrblFctrPctCounter = -1;
     
     public boolean isBdms01DlvrblFctrPctModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DlvrblFctrPctCounter != sharedCounter;
         localBdms01DlvrblFctrPctCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01DlvrblFctrPct
	 *	@return bdms01DlvrblFctrPct
	 */
	public char[]  getBdms01DlvrblFctrPctString() {
	    return getCharArray(beginBdms01DlvrblFctrPct,BDMS_01_DLVRBL_FCTR_PCT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01DlvrblFctrPctIsNumeric() {
		    return isNumeric(beginBdms01DlvrblFctrPct
	                    ,beginBdms01DlvrblFctrPct + BDMS_01_DLVRBL_FCTR_PCT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_DLVRBL_FCTR_PCT_LEN = 15;
  protected  static final int BDMS_01_DLVRBL_FCTR_PCT_SCALE = 8;

   protected BigDecimal checkBdms01DlvrblFctrPctMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01DlvrblFctrPct
	 */
	protected void serializeBdms01DlvrblFctrPct(BigDecimal bdms01DlvrblFctrPct) {
	       putNumber(beginBdms01DlvrblFctrPct,bdms01DlvrblFctrPct,BDMS_01_DLVRBL_FCTR_PCT_LEN,BDMS_01_DLVRBL_FCTR_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01DlvrblFctrPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01DlvrblFctrPct
	 */
   	protected  BigDecimal serializeBdms01DlvrblFctrPct(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01DlvrblFctrPct
		       ,15
		      );		 localBdms01DlvrblFctrPctCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_DLVRBL_FCTR_PCT_LEN,BDMS_01_DLVRBL_FCTR_PCT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01DlvrblFctrPct", beginBdms01DlvrblFctrPct,BDMS_01_DLVRBL_FCTR_PCT_LEN);
    	}
    }
    /**
	 *	refreshBdms01DlvrblFctrPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01DlvrblFctrPct() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01DlvrblFctrPct
			            ,BDMS_01_DLVRBL_FCTR_PCT_LEN
			            ,BDMS_01_DLVRBL_FCTR_PCT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01DlvrblFctrPct", beginBdms01DlvrblFctrPct,BDMS_01_DLVRBL_FCTR_PCT_LEN);
    }
   	}
     int localBdms01DcmlFrctnCdCounter = -1;
     public boolean isBdms01DcmlFrctnCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DcmlFrctnCdCounter != sharedCounter;
         localBdms01DcmlFrctnCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DCML_FRCTN_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01DcmlFrctnCd
	 */
   protected void serializeBdms01DcmlFrctnCd(char[] bdms01DcmlFrctnCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DcmlFrctnCd,0,getStringValue(),beginBdms01DcmlFrctnCd,BDMS_01_DCML_FRCTN_CD_LEN);
       localBdms01DcmlFrctnCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DcmlFrctnCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01DcmlFrctnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DcmlFrctnCd() {	 
   		return (substring(getStringValue(),beginBdms01DcmlFrctnCd,beginBdms01DcmlFrctnCd + BDMS_01_DCML_FRCTN_CD_LEN));
   	}
     int localBdms01DlvrbOptnSymIdCounter = -1;
     public boolean isBdms01DlvrbOptnSymIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01DlvrbOptnSymIdCounter != sharedCounter;
         localBdms01DlvrbOptnSymIdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_DLVRB_OPTN_SYM_ID_LEN = 6;
	/**
	 * 	serialize this Bdms01DlvrbOptnSymId
	 */
   protected void serializeBdms01DlvrbOptnSymId(char[] bdms01DlvrbOptnSymId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01DlvrbOptnSymId,0,getStringValue(),beginBdms01DlvrbOptnSymId,BDMS_01_DLVRB_OPTN_SYM_ID_LEN);
       localBdms01DlvrbOptnSymIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01DlvrbOptnSymIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBdms01DlvrbOptnSymId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01DlvrbOptnSymId() {	 
   		return (substring(getStringValue(),beginBdms01DlvrbOptnSymId,beginBdms01DlvrbOptnSymId + BDMS_01_DLVRB_OPTN_SYM_ID_LEN));
   	}
     int localBdms01OptionMaturityDtCounter = -1;
     public boolean isBdms01OptionMaturityDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OptionMaturityDtCounter != sharedCounter;
         localBdms01OptionMaturityDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OPTION_MATURITY_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01OptionMaturityDt
	 */
   protected void serializeBdms01OptionMaturityDt(char[] bdms01OptionMaturityDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OptionMaturityDt,0,getStringValue(),beginBdms01OptionMaturityDt,BDMS_01_OPTION_MATURITY_DT_LEN);
       localBdms01OptionMaturityDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OptionMaturityDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01OptionMaturityDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OptionMaturityDt() {	 
   		return (substring(getStringValue(),beginBdms01OptionMaturityDt,beginBdms01OptionMaturityDt + BDMS_01_OPTION_MATURITY_DT_LEN));
   	}
     int localBdms01OccOptnSymIdCounter = -1;
     public boolean isBdms01OccOptnSymIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OccOptnSymIdCounter != sharedCounter;
         localBdms01OccOptnSymIdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OCC_OPTN_SYM_ID_LEN = 6;
	/**
	 * 	serialize this Bdms01OccOptnSymId
	 */
   protected void serializeBdms01OccOptnSymId(char[] bdms01OccOptnSymId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OccOptnSymId,0,getStringValue(),beginBdms01OccOptnSymId,BDMS_01_OCC_OPTN_SYM_ID_LEN);
       localBdms01OccOptnSymIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OccOptnSymIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshBdms01OccOptnSymId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OccOptnSymId() {	 
   		return (substring(getStringValue(),beginBdms01OccOptnSymId,beginBdms01OccOptnSymId + BDMS_01_OCC_OPTN_SYM_ID_LEN));
   	}
     int localBdms01FroIndCounter = -1;
     public boolean isBdms01FroIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01FroIndCounter != sharedCounter;
         localBdms01FroIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_FRO_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01FroInd
	 */
   protected void serializeBdms01FroInd(char[] bdms01FroInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01FroInd,0,getStringValue(),beginBdms01FroInd,BDMS_01_FRO_IND_LEN);
       localBdms01FroIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01FroIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01FroInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01FroInd() {	 
   		return (substring(getStringValue(),beginBdms01FroInd,beginBdms01FroInd + BDMS_01_FRO_IND_LEN));
   	}
     int localBdms01BrdBsdBnryIndCounter = -1;
     public boolean isBdms01BrdBsdBnryIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BrdBsdBnryIndCounter != sharedCounter;
         localBdms01BrdBsdBnryIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_BRD_BSD_BNRY_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01BrdBsdBnryInd
	 */
   protected void serializeBdms01BrdBsdBnryInd(char[] bdms01BrdBsdBnryInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01BrdBsdBnryInd,0,getStringValue(),beginBdms01BrdBsdBnryInd,BDMS_01_BRD_BSD_BNRY_IND_LEN);
       localBdms01BrdBsdBnryIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01BrdBsdBnryIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01BrdBsdBnryInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01BrdBsdBnryInd() {	 
   		return (substring(getStringValue(),beginBdms01BrdBsdBnryInd,beginBdms01BrdBsdBnryInd + BDMS_01_BRD_BSD_BNRY_IND_LEN));
   	}
     int localBdms01SecCusipBaseNbrCounter = -1;
     public boolean isBdms01SecCusipBaseNbrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01SecCusipBaseNbrCounter != sharedCounter;
         localBdms01SecCusipBaseNbrCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_SEC_CUSIP_BASE_NBR_LEN = 9;
	/**
	 * 	serialize this Bdms01SecCusipBaseNbr
	 */
   protected void serializeBdms01SecCusipBaseNbr(char[] bdms01SecCusipBaseNbr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01SecCusipBaseNbr,0,getStringValue(),beginBdms01SecCusipBaseNbr,BDMS_01_SEC_CUSIP_BASE_NBR_LEN);
       localBdms01SecCusipBaseNbrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01SecCusipBaseNbrConstraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshBdms01SecCusipBaseNbr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01SecCusipBaseNbr() {	 
   		return (substring(getStringValue(),beginBdms01SecCusipBaseNbr,beginBdms01SecCusipBaseNbr + BDMS_01_SEC_CUSIP_BASE_NBR_LEN));
   	}




}
  
