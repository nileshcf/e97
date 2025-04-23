package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01OidSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:26. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01OidSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01OidSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_OID_SEG_DATA_LENGTH = 88;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01OidSegSqlcd;
            protected  int beginMsdOidIssuePrc;
            protected  int beginMsdOidAccrtdValue;
            protected  int beginBdms01OidDt;
	
	/**
	* Constructor for Bdms01OidSegDataSerialized
	**/
    public Bdms01OidSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01OidSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01OidSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01OidSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3429); // serialize this field at offset 3429 by default 
    }
    
	/**
	* sets parent for this Bdms01OidSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3429 by default
    }    
	/**
	* initializes the field in Bdms01OidSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_OID_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01OidSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
  
             beginMsdOidIssuePrc = getStartOffset() + 12;	// set offset for serialization
  
             beginMsdOidAccrtdValue = getStartOffset() + 30;	// set offset for serialization
  
             beginBdms01OidDt = getStartOffset() + 48;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01OidSegSqlcdCounter = -1;
     public boolean isBdms01OidSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OidSegSqlcdCounter != sharedCounter;
         localBdms01OidSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01OidSegSqlcd
	 *	@return bdms01OidSegSqlcd
	 */
	public char[]  getBdms01OidSegSqlcdString() {
	     return getCharArray(beginBdms01OidSegSqlcd,BDMS_01_OID_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01OidSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01OidSegSqlcd
	                    ,beginBdms01OidSegSqlcd + BDMS_01_OID_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_OID_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01OidSegSqlcd
	 */
	protected void serializeBdms01OidSegSqlcd(int bdms01OidSegSqlcd) {
		 putNumber(beginBdms01OidSegSqlcd,bdms01OidSegSqlcd,BDMS_01_OID_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01OidSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01OidSegSqlcd
	 */
   	protected  int serializeBdms01OidSegSqlcd(char[] value) {
	    int  bdms01OidSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01OidSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01OidSegSqlcd
		       ,4
		      );
		 localBdms01OidSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01OidSegSqlcd;
    }

   protected int checkBdms01OidSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01OidSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01OidSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01OidSegSqlcd
			                 ,BDMS_01_OID_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01OidSegSqlcd", beginBdms01OidSegSqlcd,BDMS_01_OID_SEG_SQLCD_LEN);
    }
   	}
     int localMsdOidIssuePrcCounter = -1;
     
     public boolean isMsdOidIssuePrcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOidIssuePrcCounter != sharedCounter;
         localMsdOidIssuePrcCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOidIssuePrc
	 *	@return msdOidIssuePrc
	 */
	public char[]  getMsdOidIssuePrcString() {
	    return getCharArray(beginMsdOidIssuePrc,MSD_OID_ISSUE_PRC_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOidIssuePrcIsNumeric() {
		    return isNumeric(beginMsdOidIssuePrc
	                    ,beginMsdOidIssuePrc + MSD_OID_ISSUE_PRC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OID_ISSUE_PRC_LEN = 18;
  protected  static final int MSD_OID_ISSUE_PRC_SCALE = 8;

   protected BigDecimal checkMsdOidIssuePrcMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdOidIssuePrc
	 */
	protected void serializeMsdOidIssuePrc(BigDecimal msdOidIssuePrc) {
	       putNumber(beginMsdOidIssuePrc,msdOidIssuePrc,MSD_OID_ISSUE_PRC_LEN,MSD_OID_ISSUE_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOidIssuePrcCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOidIssuePrc
	 */
   	protected  BigDecimal serializeMsdOidIssuePrc(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdOidIssuePrc
		       ,18
		      );		 localMsdOidIssuePrcCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OID_ISSUE_PRC_LEN,MSD_OID_ISSUE_PRC_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOidIssuePrc", beginMsdOidIssuePrc,MSD_OID_ISSUE_PRC_LEN);
    	}
    }
    /**
	 *	refreshMsdOidIssuePrc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOidIssuePrc() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOidIssuePrc
			            ,MSD_OID_ISSUE_PRC_LEN
			            ,MSD_OID_ISSUE_PRC_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOidIssuePrc", beginMsdOidIssuePrc,MSD_OID_ISSUE_PRC_LEN);
    }
   	}
     int localMsdOidAccrtdValueCounter = -1;
     
     public boolean isMsdOidAccrtdValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdOidAccrtdValueCounter != sharedCounter;
         localMsdOidAccrtdValueCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of msdOidAccrtdValue
	 *	@return msdOidAccrtdValue
	 */
	public char[]  getMsdOidAccrtdValueString() {
	    return getCharArray(beginMsdOidAccrtdValue,MSD_OID_ACCRTD_VALUE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean msdOidAccrtdValueIsNumeric() {
		    return isNumeric(beginMsdOidAccrtdValue
	                    ,beginMsdOidAccrtdValue + MSD_OID_ACCRTD_VALUE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int MSD_OID_ACCRTD_VALUE_LEN = 18;
  protected  static final int MSD_OID_ACCRTD_VALUE_SCALE = 8;

   protected BigDecimal checkMsdOidAccrtdValueMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeMsdOidAccrtdValue
	 */
	protected void serializeMsdOidAccrtdValue(BigDecimal msdOidAccrtdValue) {
	       putNumber(beginMsdOidAccrtdValue,msdOidAccrtdValue,MSD_OID_ACCRTD_VALUE_LEN,MSD_OID_ACCRTD_VALUE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localMsdOidAccrtdValueCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeMsdOidAccrtdValue
	 */
   	protected  BigDecimal serializeMsdOidAccrtdValue(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginMsdOidAccrtdValue
		       ,18
		      );		 localMsdOidAccrtdValueCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,MSD_OID_ACCRTD_VALUE_LEN,MSD_OID_ACCRTD_VALUE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("msdOidAccrtdValue", beginMsdOidAccrtdValue,MSD_OID_ACCRTD_VALUE_LEN);
    	}
    }
    /**
	 *	refreshMsdOidAccrtdValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshMsdOidAccrtdValue() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginMsdOidAccrtdValue
			            ,MSD_OID_ACCRTD_VALUE_LEN
			            ,MSD_OID_ACCRTD_VALUE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("msdOidAccrtdValue", beginMsdOidAccrtdValue,MSD_OID_ACCRTD_VALUE_LEN);
    }
   	}
     int localBdms01OidDtCounter = -1;
     public boolean isBdms01OidDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01OidDtCounter != sharedCounter;
         localBdms01OidDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_OID_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01OidDt
	 */
   protected void serializeBdms01OidDt(char[] bdms01OidDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01OidDt,0,getStringValue(),beginBdms01OidDt,BDMS_01_OID_DT_LEN);
       localBdms01OidDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01OidDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01OidDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01OidDt() {	 
   		return (substring(getStringValue(),beginBdms01OidDt,beginBdms01OidDt + BDMS_01_OID_DT_LEN));
   	}




}
  
