package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01BondFactorSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01BondFactorSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01BondFactorSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_BOND_FACTOR_SEG_DATA_LENGTH = 164;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01BondFactorSegSqlcd;
            protected  int beginMsdGnmaCurrFactor;
            protected  int beginMsdCurrFactorUpdDate;
            protected  int beginBdms01CurrFacBondDt;
            protected  int beginBdms01GnmaCurrFactorPDt;
            protected  int beginMsdGnmaPrevFactor;
            protected  int beginMsdPrevFactorUpdDate;
            protected  int beginBdms01GnmaPrevFactorPDt;
            protected  int beginBdms01PrevFacBondDt;
            protected  int beginMsdGnmaPrevToPrevFac;
            protected  int beginMsdPrev2FactorUpdDate;
            protected  int beginBdms01GnmaPvToPvFacPDt;
            protected  int beginBdms01PvpvFacBondDt;
	
	/**
	* Constructor for Bdms01BondFactorSegDataSerialized
	**/
    public Bdms01BondFactorSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01BondFactorSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01BondFactorSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01BondFactorSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3181); // serialize this field at offset 3181 by default 
    }
    
	/**
	* sets parent for this Bdms01BondFactorSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3181 by default
    }    
	/**
	* initializes the field in Bdms01BondFactorSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_BOND_FACTOR_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01BondFactorSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdGnmaCurrFactor = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdCurrFactorUpdDate = getStartOffset() + 16;	// set offset for serialization
  
             beginBdms01CurrFacBondDt = getStartOffset() + 24;	// set offset for serialization
  
             beginBdms01GnmaCurrFactorPDt = getStartOffset() + 34;	// set offset for serialization
  
             beginMsdGnmaPrevFactor = getStartOffset() + 44;	// set offset for serialization
  
             beginMsdPrevFactorUpdDate = getStartOffset() + 56;	// set offset for serialization
  
             beginBdms01GnmaPrevFactorPDt = getStartOffset() + 64;	// set offset for serialization
  
             beginBdms01PrevFacBondDt = getStartOffset() + 74;	// set offset for serialization
  
             beginMsdGnmaPrevToPrevFac = getStartOffset() + 84;	// set offset for serialization
  
             beginMsdPrev2FactorUpdDate = getStartOffset() + 96;	// set offset for serialization
  
             beginBdms01GnmaPvToPvFacPDt = getStartOffset() + 104;	// set offset for serialization
  
             beginBdms01PvpvFacBondDt = getStartOffset() + 114;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01BondFactorSegSqlcdCounter = -1;
     public boolean isBdms01BondFactorSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01BondFactorSegSqlcdCounter != sharedCounter;
         localBdms01BondFactorSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01BondFactorSegSqlcd
	 *	@return bdms01BondFactorSegSqlcd
	 */
	public char[]  getBdms01BondFactorSegSqlcdString() {
	     return getCharArray(beginBdms01BondFactorSegSqlcd,BDMS_01_BOND_FACTOR_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01BondFactorSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01BondFactorSegSqlcd
	                    ,beginBdms01BondFactorSegSqlcd + BDMS_01_BOND_FACTOR_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_BOND_FACTOR_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01BondFactorSegSqlcd
	 */
	protected void serializeBdms01BondFactorSegSqlcd(int bdms01BondFactorSegSqlcd) {
		 putNumber(beginBdms01BondFactorSegSqlcd,bdms01BondFactorSegSqlcd,BDMS_01_BOND_FACTOR_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01BondFactorSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01BondFactorSegSqlcd
	 */
   	protected  int serializeBdms01BondFactorSegSqlcd(char[] value) {
	    int  bdms01BondFactorSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01BondFactorSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01BondFactorSegSqlcd
		       ,4
		      );
		 localBdms01BondFactorSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01BondFactorSegSqlcd;
    }

   protected int checkBdms01BondFactorSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01BondFactorSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01BondFactorSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01BondFactorSegSqlcd
			                 ,BDMS_01_BOND_FACTOR_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01BondFactorSegSqlcd", beginBdms01BondFactorSegSqlcd,BDMS_01_BOND_FACTOR_SEG_SQLCD_LEN);
    }
   	}
     int localMsdGnmaCurrFactorCounter = -1;
     
     public boolean isMsdGnmaCurrFactorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdGnmaCurrFactorCounter != sharedCounter;
         localMsdGnmaCurrFactorCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdGnmaCurrFactor
	 *	@return msdGnmaCurrFactor
	 */
	public char[]  getMsdGnmaCurrFactorString() {
	    return getCharArray(beginMsdGnmaCurrFactor,MSD_GNMA_CURR_FACTOR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdGnmaCurrFactorIsNumeric() {
		    return isNumeric(beginMsdGnmaCurrFactor
	                    ,beginMsdGnmaCurrFactor + MSD_GNMA_CURR_FACTOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_GNMA_CURR_FACTOR_LEN = 12;
  protected  static final int MSD_GNMA_CURR_FACTOR_SCALE = 10;

   protected BigDecimal checkMsdGnmaCurrFactorMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,10/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMsdGnmaCurrFactor
	 */
	protected void serializeMsdGnmaCurrFactor(BigDecimal msdGnmaCurrFactor) {
	       putNumber(beginMsdGnmaCurrFactor,msdGnmaCurrFactor,MSD_GNMA_CURR_FACTOR_LEN,MSD_GNMA_CURR_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdGnmaCurrFactorCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdGnmaCurrFactor
	 */
   	protected  BigDecimal serializeMsdGnmaCurrFactor(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMsdGnmaCurrFactor
		       ,12
		      );		 localMsdGnmaCurrFactorCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_GNMA_CURR_FACTOR_LEN,MSD_GNMA_CURR_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdGnmaCurrFactor", beginMsdGnmaCurrFactor,MSD_GNMA_CURR_FACTOR_LEN);
    	}
    }
    /**
	 *	refreshMsdGnmaCurrFactor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdGnmaCurrFactor() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdGnmaCurrFactor
			            ,MSD_GNMA_CURR_FACTOR_LEN
			            ,MSD_GNMA_CURR_FACTOR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdGnmaCurrFactor", beginMsdGnmaCurrFactor,MSD_GNMA_CURR_FACTOR_LEN);
    }
   	}
     int localMsdCurrFactorUpdDateCounter = -1;
     public boolean isMsdCurrFactorUpdDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCurrFactorUpdDateCounter != sharedCounter;
         localMsdCurrFactorUpdDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCurrFactorUpdDate
	 *	@return msdCurrFactorUpdDate
	 */
	public char[]  getMsdCurrFactorUpdDateString() {
	     return getCharArray(beginMsdCurrFactorUpdDate,MSD_CURR_FACTOR_UPD_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCurrFactorUpdDateIsNumeric() {
	    return isNumeric(beginMsdCurrFactorUpdDate
	                    ,beginMsdCurrFactorUpdDate + MSD_CURR_FACTOR_UPD_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CURR_FACTOR_UPD_DATE_LEN = 8;
  	/**
	 * serializeMsdCurrFactorUpdDate
	 */
	protected void serializeMsdCurrFactorUpdDate(long msdCurrFactorUpdDate) {
		 putNumber(beginMsdCurrFactorUpdDate,msdCurrFactorUpdDate,MSD_CURR_FACTOR_UPD_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCurrFactorUpdDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCurrFactorUpdDate
	 */
   	protected  long serializeMsdCurrFactorUpdDate(char[] value) {
	    long  msdCurrFactorUpdDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCurrFactorUpdDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdCurrFactorUpdDate
		       ,8
		      );
		 localMsdCurrFactorUpdDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCurrFactorUpdDate;
    }

   protected long checkMsdCurrFactorUpdDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCurrFactorUpdDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCurrFactorUpdDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCurrFactorUpdDate
			                 ,MSD_CURR_FACTOR_UPD_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCurrFactorUpdDate", beginMsdCurrFactorUpdDate,MSD_CURR_FACTOR_UPD_DATE_LEN);
    }
   	}
     int localBdms01CurrFacBondDtCounter = -1;
     public boolean isBdms01CurrFacBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CurrFacBondDtCounter != sharedCounter;
         localBdms01CurrFacBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CURR_FAC_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01CurrFacBondDt
	 */
   protected void serializeBdms01CurrFacBondDt(char[] bdms01CurrFacBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CurrFacBondDt,0,getStringValue(),beginBdms01CurrFacBondDt,BDMS_01_CURR_FAC_BOND_DT_LEN);
       localBdms01CurrFacBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CurrFacBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01CurrFacBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CurrFacBondDt() {	 
   		return (substring(getStringValue(),beginBdms01CurrFacBondDt,beginBdms01CurrFacBondDt + BDMS_01_CURR_FAC_BOND_DT_LEN));
   	}
     int localBdms01GnmaCurrFactorPDtCounter = -1;
     public boolean isBdms01GnmaCurrFactorPDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GnmaCurrFactorPDtCounter != sharedCounter;
         localBdms01GnmaCurrFactorPDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GNMA_CURR_FACTOR_PDT_LEN = 10;
	/**
	 * 	serialize this Bdms01GnmaCurrFactorPDt
	 */
   protected void serializeBdms01GnmaCurrFactorPDt(char[] bdms01GnmaCurrFactorPDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GnmaCurrFactorPDt,0,getStringValue(),beginBdms01GnmaCurrFactorPDt,BDMS_01_GNMA_CURR_FACTOR_PDT_LEN);
       localBdms01GnmaCurrFactorPDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GnmaCurrFactorPDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01GnmaCurrFactorPDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GnmaCurrFactorPDt() {	 
   		return (substring(getStringValue(),beginBdms01GnmaCurrFactorPDt,beginBdms01GnmaCurrFactorPDt + BDMS_01_GNMA_CURR_FACTOR_PDT_LEN));
   	}
     int localMsdGnmaPrevFactorCounter = -1;
     
     public boolean isMsdGnmaPrevFactorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdGnmaPrevFactorCounter != sharedCounter;
         localMsdGnmaPrevFactorCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdGnmaPrevFactor
	 *	@return msdGnmaPrevFactor
	 */
	public char[]  getMsdGnmaPrevFactorString() {
	    return getCharArray(beginMsdGnmaPrevFactor,MSD_GNMA_PREV_FACTOR_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdGnmaPrevFactorIsNumeric() {
		    return isNumeric(beginMsdGnmaPrevFactor
	                    ,beginMsdGnmaPrevFactor + MSD_GNMA_PREV_FACTOR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_GNMA_PREV_FACTOR_LEN = 12;
  protected  static final int MSD_GNMA_PREV_FACTOR_SCALE = 10;

   protected BigDecimal checkMsdGnmaPrevFactorMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,10/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMsdGnmaPrevFactor
	 */
	protected void serializeMsdGnmaPrevFactor(BigDecimal msdGnmaPrevFactor) {
	       putNumber(beginMsdGnmaPrevFactor,msdGnmaPrevFactor,MSD_GNMA_PREV_FACTOR_LEN,MSD_GNMA_PREV_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdGnmaPrevFactorCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdGnmaPrevFactor
	 */
   	protected  BigDecimal serializeMsdGnmaPrevFactor(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMsdGnmaPrevFactor
		       ,12
		      );		 localMsdGnmaPrevFactorCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_GNMA_PREV_FACTOR_LEN,MSD_GNMA_PREV_FACTOR_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdGnmaPrevFactor", beginMsdGnmaPrevFactor,MSD_GNMA_PREV_FACTOR_LEN);
    	}
    }
    /**
	 *	refreshMsdGnmaPrevFactor is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdGnmaPrevFactor() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdGnmaPrevFactor
			            ,MSD_GNMA_PREV_FACTOR_LEN
			            ,MSD_GNMA_PREV_FACTOR_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdGnmaPrevFactor", beginMsdGnmaPrevFactor,MSD_GNMA_PREV_FACTOR_LEN);
    }
   	}
     int localMsdPrevFactorUpdDateCounter = -1;
     public boolean isMsdPrevFactorUpdDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdPrevFactorUpdDateCounter != sharedCounter;
         localMsdPrevFactorUpdDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdPrevFactorUpdDate
	 *	@return msdPrevFactorUpdDate
	 */
	public char[]  getMsdPrevFactorUpdDateString() {
	     return getCharArray(beginMsdPrevFactorUpdDate,MSD_PREV_FACTOR_UPD_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdPrevFactorUpdDateIsNumeric() {
	    return isNumeric(beginMsdPrevFactorUpdDate
	                    ,beginMsdPrevFactorUpdDate + MSD_PREV_FACTOR_UPD_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_PREV_FACTOR_UPD_DATE_LEN = 8;
  	/**
	 * serializeMsdPrevFactorUpdDate
	 */
	protected void serializeMsdPrevFactorUpdDate(long msdPrevFactorUpdDate) {
		 putNumber(beginMsdPrevFactorUpdDate,msdPrevFactorUpdDate,MSD_PREV_FACTOR_UPD_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdPrevFactorUpdDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdPrevFactorUpdDate
	 */
   	protected  long serializeMsdPrevFactorUpdDate(char[] value) {
	    long  msdPrevFactorUpdDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdPrevFactorUpdDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdPrevFactorUpdDate
		       ,8
		      );
		 localMsdPrevFactorUpdDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdPrevFactorUpdDate;
    }

   protected long checkMsdPrevFactorUpdDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdPrevFactorUpdDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdPrevFactorUpdDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdPrevFactorUpdDate
			                 ,MSD_PREV_FACTOR_UPD_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdPrevFactorUpdDate", beginMsdPrevFactorUpdDate,MSD_PREV_FACTOR_UPD_DATE_LEN);
    }
   	}
     int localBdms01GnmaPrevFactorPDtCounter = -1;
     public boolean isBdms01GnmaPrevFactorPDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GnmaPrevFactorPDtCounter != sharedCounter;
         localBdms01GnmaPrevFactorPDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GNMA_PREV_FACTOR_PDT_LEN = 10;
	/**
	 * 	serialize this Bdms01GnmaPrevFactorPDt
	 */
   protected void serializeBdms01GnmaPrevFactorPDt(char[] bdms01GnmaPrevFactorPDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GnmaPrevFactorPDt,0,getStringValue(),beginBdms01GnmaPrevFactorPDt,BDMS_01_GNMA_PREV_FACTOR_PDT_LEN);
       localBdms01GnmaPrevFactorPDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GnmaPrevFactorPDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01GnmaPrevFactorPDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GnmaPrevFactorPDt() {	 
   		return (substring(getStringValue(),beginBdms01GnmaPrevFactorPDt,beginBdms01GnmaPrevFactorPDt + BDMS_01_GNMA_PREV_FACTOR_PDT_LEN));
   	}
     int localBdms01PrevFacBondDtCounter = -1;
     public boolean isBdms01PrevFacBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrevFacBondDtCounter != sharedCounter;
         localBdms01PrevFacBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PREV_FAC_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PrevFacBondDt
	 */
   protected void serializeBdms01PrevFacBondDt(char[] bdms01PrevFacBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrevFacBondDt,0,getStringValue(),beginBdms01PrevFacBondDt,BDMS_01_PREV_FAC_BOND_DT_LEN);
       localBdms01PrevFacBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrevFacBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PrevFacBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrevFacBondDt() {	 
   		return (substring(getStringValue(),beginBdms01PrevFacBondDt,beginBdms01PrevFacBondDt + BDMS_01_PREV_FAC_BOND_DT_LEN));
   	}
     int localMsdGnmaPrevToPrevFacCounter = -1;
     
     public boolean isMsdGnmaPrevToPrevFacModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdGnmaPrevToPrevFacCounter != sharedCounter;
         localMsdGnmaPrevToPrevFacCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdGnmaPrevToPrevFac
	 *	@return msdGnmaPrevToPrevFac
	 */
	public char[]  getMsdGnmaPrevToPrevFacString() {
	    return getCharArray(beginMsdGnmaPrevToPrevFac,MSD_GNMA_PREV_TO_PREV_FAC_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdGnmaPrevToPrevFacIsNumeric() {
		    return isNumeric(beginMsdGnmaPrevToPrevFac
	                    ,beginMsdGnmaPrevToPrevFac + MSD_GNMA_PREV_TO_PREV_FAC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_GNMA_PREV_TO_PREV_FAC_LEN = 12;
  protected  static final int MSD_GNMA_PREV_TO_PREV_FAC_SCALE = 10;

   protected BigDecimal checkMsdGnmaPrevToPrevFacMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,10/*scale*/,12/*precision*/);
   }

  	/**
	 * serializeMsdGnmaPrevToPrevFac
	 */
	protected void serializeMsdGnmaPrevToPrevFac(BigDecimal msdGnmaPrevToPrevFac) {
	       putNumber(beginMsdGnmaPrevToPrevFac,msdGnmaPrevToPrevFac,MSD_GNMA_PREV_TO_PREV_FAC_LEN,MSD_GNMA_PREV_TO_PREV_FAC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdGnmaPrevToPrevFacCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdGnmaPrevToPrevFac
	 */
   	protected  BigDecimal serializeMsdGnmaPrevToPrevFac(char[] value) throws CFException {
        if (value.length < 12) value = pad(12, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(12,value,false/*isSigned?*/)
		       ,beginMsdGnmaPrevToPrevFac
		       ,12
		      );		 localMsdGnmaPrevToPrevFacCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_GNMA_PREV_TO_PREV_FAC_LEN,MSD_GNMA_PREV_TO_PREV_FAC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdGnmaPrevToPrevFac", beginMsdGnmaPrevToPrevFac,MSD_GNMA_PREV_TO_PREV_FAC_LEN);
    	}
    }
    /**
	 *	refreshMsdGnmaPrevToPrevFac is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdGnmaPrevToPrevFac() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdGnmaPrevToPrevFac
			            ,MSD_GNMA_PREV_TO_PREV_FAC_LEN
			            ,MSD_GNMA_PREV_TO_PREV_FAC_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdGnmaPrevToPrevFac", beginMsdGnmaPrevToPrevFac,MSD_GNMA_PREV_TO_PREV_FAC_LEN);
    }
   	}
     int localMsdPrev2FactorUpdDateCounter = -1;
     public boolean isMsdPrev2FactorUpdDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdPrev2FactorUpdDateCounter != sharedCounter;
         localMsdPrev2FactorUpdDateCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdPrev2FactorUpdDate
	 *	@return msdPrev2FactorUpdDate
	 */
	public char[]  getMsdPrev2FactorUpdDateString() {
	     return getCharArray(beginMsdPrev2FactorUpdDate,MSD_PREV_2_FACTOR_UPD_DATE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdPrev2FactorUpdDateIsNumeric() {
	    return isNumeric(beginMsdPrev2FactorUpdDate
	                    ,beginMsdPrev2FactorUpdDate + MSD_PREV_2_FACTOR_UPD_DATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_PREV_2_FACTOR_UPD_DATE_LEN = 8;
  	/**
	 * serializeMsdPrev2FactorUpdDate
	 */
	protected void serializeMsdPrev2FactorUpdDate(long msdPrev2FactorUpdDate) {
		 putNumber(beginMsdPrev2FactorUpdDate,msdPrev2FactorUpdDate,MSD_PREV_2_FACTOR_UPD_DATE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdPrev2FactorUpdDateCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdPrev2FactorUpdDate
	 */
   	protected  long serializeMsdPrev2FactorUpdDate(char[] value) {
	    long  msdPrev2FactorUpdDate;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdPrev2FactorUpdDate = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdPrev2FactorUpdDate
		       ,8
		      );
		 localMsdPrev2FactorUpdDateCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdPrev2FactorUpdDate;
    }

   protected long checkMsdPrev2FactorUpdDateMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdPrev2FactorUpdDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdPrev2FactorUpdDate() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdPrev2FactorUpdDate
			                 ,MSD_PREV_2_FACTOR_UPD_DATE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdPrev2FactorUpdDate", beginMsdPrev2FactorUpdDate,MSD_PREV_2_FACTOR_UPD_DATE_LEN);
    }
   	}
     int localBdms01GnmaPvToPvFacPDtCounter = -1;
     public boolean isBdms01GnmaPvToPvFacPDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01GnmaPvToPvFacPDtCounter != sharedCounter;
         localBdms01GnmaPvToPvFacPDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_GNMA_PV_TO_PV_FAC_PDT_LEN = 10;
	/**
	 * 	serialize this Bdms01GnmaPvToPvFacPDt
	 */
   protected void serializeBdms01GnmaPvToPvFacPDt(char[] bdms01GnmaPvToPvFacPDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01GnmaPvToPvFacPDt,0,getStringValue(),beginBdms01GnmaPvToPvFacPDt,BDMS_01_GNMA_PV_TO_PV_FAC_PDT_LEN);
       localBdms01GnmaPvToPvFacPDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01GnmaPvToPvFacPDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01GnmaPvToPvFacPDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01GnmaPvToPvFacPDt() {	 
   		return (substring(getStringValue(),beginBdms01GnmaPvToPvFacPDt,beginBdms01GnmaPvToPvFacPDt + BDMS_01_GNMA_PV_TO_PV_FAC_PDT_LEN));
   	}
     int localBdms01PvpvFacBondDtCounter = -1;
     public boolean isBdms01PvpvFacBondDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PvpvFacBondDtCounter != sharedCounter;
         localBdms01PvpvFacBondDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PVPV_FAC_BOND_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01PvpvFacBondDt
	 */
   protected void serializeBdms01PvpvFacBondDt(char[] bdms01PvpvFacBondDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PvpvFacBondDt,0,getStringValue(),beginBdms01PvpvFacBondDt,BDMS_01_PVPV_FAC_BOND_DT_LEN);
       localBdms01PvpvFacBondDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PvpvFacBondDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01PvpvFacBondDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PvpvFacBondDt() {	 
   		return (substring(getStringValue(),beginBdms01PvpvFacBondDt,beginBdms01PvpvFacBondDt + BDMS_01_PVPV_FAC_BOND_DT_LEN));
   	}




}
  
