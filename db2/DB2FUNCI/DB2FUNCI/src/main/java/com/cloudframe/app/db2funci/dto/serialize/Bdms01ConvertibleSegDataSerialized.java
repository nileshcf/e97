package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01ConvertibleSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:08. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01ConvertibleSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01ConvertibleSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_CONVERTIBLE_SEG_DATA_LENGTH = 69;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01ConvertibleSegSqlcd;
            protected  int beginMsdCnvrtbleConvtnRate;
            protected  int beginMsdCnvrtbleConvtnCode;
            protected  int beginMsdCnvrtbleConvtnExpDt;
            protected  int beginBdms01CvrsnExptnDt;
	
	/**
	* Constructor for Bdms01ConvertibleSegDataSerialized
	**/
    public Bdms01ConvertibleSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01ConvertibleSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01ConvertibleSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01ConvertibleSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1987); // serialize this field at offset 1987 by default 
    }
    
	/**
	* sets parent for this Bdms01ConvertibleSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1987 by default
    }    
	/**
	* initializes the field in Bdms01ConvertibleSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_CONVERTIBLE_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01ConvertibleSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdCnvrtbleConvtnRate = getStartOffset() + 4;	// set offset for serialization
  
             beginMsdCnvrtbleConvtnCode = getStartOffset() + 19;	// set offset for serialization
  
             beginMsdCnvrtbleConvtnExpDt = getStartOffset() + 21;	// set offset for serialization
  
             beginBdms01CvrsnExptnDt = getStartOffset() + 29;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01ConvertibleSegSqlcdCounter = -1;
     public boolean isBdms01ConvertibleSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01ConvertibleSegSqlcdCounter != sharedCounter;
         localBdms01ConvertibleSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01ConvertibleSegSqlcd
	 *	@return bdms01ConvertibleSegSqlcd
	 */
	public char[]  getBdms01ConvertibleSegSqlcdString() {
	     return getCharArray(beginBdms01ConvertibleSegSqlcd,BDMS_01_CONVERTIBLE_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01ConvertibleSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01ConvertibleSegSqlcd
	                    ,beginBdms01ConvertibleSegSqlcd + BDMS_01_CONVERTIBLE_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_CONVERTIBLE_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01ConvertibleSegSqlcd
	 */
	protected void serializeBdms01ConvertibleSegSqlcd(int bdms01ConvertibleSegSqlcd) {
		 putNumber(beginBdms01ConvertibleSegSqlcd,bdms01ConvertibleSegSqlcd,BDMS_01_CONVERTIBLE_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01ConvertibleSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01ConvertibleSegSqlcd
	 */
   	protected  int serializeBdms01ConvertibleSegSqlcd(char[] value) {
	    int  bdms01ConvertibleSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01ConvertibleSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01ConvertibleSegSqlcd
		       ,4
		      );
		 localBdms01ConvertibleSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01ConvertibleSegSqlcd;
    }

   protected int checkBdms01ConvertibleSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01ConvertibleSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01ConvertibleSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01ConvertibleSegSqlcd
			                 ,BDMS_01_CONVERTIBLE_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01ConvertibleSegSqlcd", beginBdms01ConvertibleSegSqlcd,BDMS_01_CONVERTIBLE_SEG_SQLCD_LEN);
    }
   	}
     int localMsdCnvrtbleConvtnRateCounter = -1;
     
     public boolean isMsdCnvrtbleConvtnRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCnvrtbleConvtnRateCounter != sharedCounter;
         localMsdCnvrtbleConvtnRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdCnvrtbleConvtnRate
	 *	@return msdCnvrtbleConvtnRate
	 */
	public char[]  getMsdCnvrtbleConvtnRateString() {
	    return getCharArray(beginMsdCnvrtbleConvtnRate,MSD_CNVRTBLE_CONVTN_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCnvrtbleConvtnRateIsNumeric() {
		    return isNumeric(beginMsdCnvrtbleConvtnRate
	                    ,beginMsdCnvrtbleConvtnRate + MSD_CNVRTBLE_CONVTN_RATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_CNVRTBLE_CONVTN_RATE_LEN = 15;
  protected  static final int MSD_CNVRTBLE_CONVTN_RATE_SCALE = 8;

   protected BigDecimal checkMsdCnvrtbleConvtnRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeMsdCnvrtbleConvtnRate
	 */
	protected void serializeMsdCnvrtbleConvtnRate(BigDecimal msdCnvrtbleConvtnRate) {
	       putNumber(beginMsdCnvrtbleConvtnRate,msdCnvrtbleConvtnRate,MSD_CNVRTBLE_CONVTN_RATE_LEN,MSD_CNVRTBLE_CONVTN_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCnvrtbleConvtnRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdCnvrtbleConvtnRate
	 */
   	protected  BigDecimal serializeMsdCnvrtbleConvtnRate(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginMsdCnvrtbleConvtnRate
		       ,15
		      );		 localMsdCnvrtbleConvtnRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_CNVRTBLE_CONVTN_RATE_LEN,MSD_CNVRTBLE_CONVTN_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdCnvrtbleConvtnRate", beginMsdCnvrtbleConvtnRate,MSD_CNVRTBLE_CONVTN_RATE_LEN);
    	}
    }
    /**
	 *	refreshMsdCnvrtbleConvtnRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdCnvrtbleConvtnRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdCnvrtbleConvtnRate
			            ,MSD_CNVRTBLE_CONVTN_RATE_LEN
			            ,MSD_CNVRTBLE_CONVTN_RATE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCnvrtbleConvtnRate", beginMsdCnvrtbleConvtnRate,MSD_CNVRTBLE_CONVTN_RATE_LEN);
    }
   	}
     int localMsdCnvrtbleConvtnCodeCounter = -1;
     public boolean isMsdCnvrtbleConvtnCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCnvrtbleConvtnCodeCounter != sharedCounter;
         localMsdCnvrtbleConvtnCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_CNVRTBLE_CONVTN_CODE_LEN = 2;
	/**
	 * 	serialize this MsdCnvrtbleConvtnCode
	 */
   protected void serializeMsdCnvrtbleConvtnCode(char[] msdCnvrtbleConvtnCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdCnvrtbleConvtnCode,0,getStringValue(),beginMsdCnvrtbleConvtnCode,MSD_CNVRTBLE_CONVTN_CODE_LEN);
       localMsdCnvrtbleConvtnCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdCnvrtbleConvtnCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshMsdCnvrtbleConvtnCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdCnvrtbleConvtnCode() {	 
   		return (substring(getStringValue(),beginMsdCnvrtbleConvtnCode,beginMsdCnvrtbleConvtnCode + MSD_CNVRTBLE_CONVTN_CODE_LEN));
   	}
     int localMsdCnvrtbleConvtnExpDtCounter = -1;
     public boolean isMsdCnvrtbleConvtnExpDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdCnvrtbleConvtnExpDtCounter != sharedCounter;
         localMsdCnvrtbleConvtnExpDtCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of msdCnvrtbleConvtnExpDt
	 *	@return msdCnvrtbleConvtnExpDt
	 */
	public char[]  getMsdCnvrtbleConvtnExpDtString() {
	     return getCharArray(beginMsdCnvrtbleConvtnExpDt,MSD_CNVRTBLE_CONVTN_EXP_DT_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdCnvrtbleConvtnExpDtIsNumeric() {
	    return isNumeric(beginMsdCnvrtbleConvtnExpDt
	                    ,beginMsdCnvrtbleConvtnExpDt + MSD_CNVRTBLE_CONVTN_EXP_DT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int MSD_CNVRTBLE_CONVTN_EXP_DT_LEN = 8;
  	/**
	 * serializeMsdCnvrtbleConvtnExpDt
	 */
	protected void serializeMsdCnvrtbleConvtnExpDt(long msdCnvrtbleConvtnExpDt) {
		 putNumber(beginMsdCnvrtbleConvtnExpDt,msdCnvrtbleConvtnExpDt,MSD_CNVRTBLE_CONVTN_EXP_DT_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdCnvrtbleConvtnExpDtCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeMsdCnvrtbleConvtnExpDt
	 */
   	protected  long serializeMsdCnvrtbleConvtnExpDt(char[] value) {
	    long  msdCnvrtbleConvtnExpDt;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    msdCnvrtbleConvtnExpDt = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginMsdCnvrtbleConvtnExpDt
		       ,8
		      );
		 localMsdCnvrtbleConvtnExpDtCounter = shareString.getSerializedField().getModifiedCounter();
		return  msdCnvrtbleConvtnExpDt;
    }

   protected long checkMsdCnvrtbleConvtnExpDtMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshMsdCnvrtbleConvtnExpDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshMsdCnvrtbleConvtnExpDt() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginMsdCnvrtbleConvtnExpDt
			                 ,MSD_CNVRTBLE_CONVTN_EXP_DT_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("msdCnvrtbleConvtnExpDt", beginMsdCnvrtbleConvtnExpDt,MSD_CNVRTBLE_CONVTN_EXP_DT_LEN);
    }
   	}
     int localBdms01CvrsnExptnDtCounter = -1;
     public boolean isBdms01CvrsnExptnDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExptnDtCounter != sharedCounter;
         localBdms01CvrsnExptnDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_EXPTN_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01CvrsnExptnDt
	 */
   protected void serializeBdms01CvrsnExptnDt(char[] bdms01CvrsnExptnDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnExptnDt,0,getStringValue(),beginBdms01CvrsnExptnDt,BDMS_01_CVRSN_EXPTN_DT_LEN);
       localBdms01CvrsnExptnDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnExptnDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnExptnDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnExptnDt() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnExptnDt,beginBdms01CvrsnExptnDt + BDMS_01_CVRSN_EXPTN_DT_LEN));
   	}




}
  
