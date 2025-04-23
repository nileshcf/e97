package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01MortBackedSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:00. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01MortBackedSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01MortBackedSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_MORT_BACKED_SEG_DATA_LENGTH = 89;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01MortBackedSegSqlcd;
            protected  int beginMsdGnmaPoolNumber;
            protected  int beginBdms01PayGrdtdInd;
            protected  int beginBdms01TypeMbsCd;
            protected  int beginBdms01AvgWghtCpnAmt;
            protected  int beginBdms01MbOrgnlAmt;
            protected  int beginBdms01AvgWghtMatAmt;
            protected  int beginBdms01MbDayDelayQty;
	
	/**
	* Constructor for Bdms01MortBackedSegDataSerialized
	**/
    public Bdms01MortBackedSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01MortBackedSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01MortBackedSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01MortBackedSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,3560); // serialize this field at offset 3560 by default 
    }
    
	/**
	* sets parent for this Bdms01MortBackedSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 3560 by default
    }    
	/**
	* initializes the field in Bdms01MortBackedSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_MORT_BACKED_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01MortBackedSegSqlcd = getStartOffset() + 0;	// set offset for serialization
  
             beginMsdGnmaPoolNumber = getStartOffset() + 4;	// set offset for serialization
  
             beginBdms01PayGrdtdInd = getStartOffset() + 10;	// set offset for serialization
  
             beginBdms01TypeMbsCd = getStartOffset() + 11;	// set offset for serialization
  
             beginBdms01AvgWghtCpnAmt = getStartOffset() + 15;	// set offset for serialization
  
             beginBdms01MbOrgnlAmt = getStartOffset() + 33;	// set offset for serialization
  
             beginBdms01AvgWghtMatAmt = getStartOffset() + 51;	// set offset for serialization
  
             beginBdms01MbDayDelayQty = getStartOffset() + 69;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localBdms01MortBackedSegSqlcdCounter = -1;
     public boolean isBdms01MortBackedSegSqlcdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MortBackedSegSqlcdCounter != sharedCounter;
         localBdms01MortBackedSegSqlcdCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01MortBackedSegSqlcd
	 *	@return bdms01MortBackedSegSqlcd
	 */
	public char[]  getBdms01MortBackedSegSqlcdString() {
	     return getCharArray(beginBdms01MortBackedSegSqlcd,BDMS_01_MORT_BACKED_SEG_SQLCD_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01MortBackedSegSqlcdIsNumeric() {
	    return isNumeric(beginBdms01MortBackedSegSqlcd
	                    ,beginBdms01MortBackedSegSqlcd + BDMS_01_MORT_BACKED_SEG_SQLCD_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_MORT_BACKED_SEG_SQLCD_LEN = 4;
  	/**
	 * serializeBdms01MortBackedSegSqlcd
	 */
	protected void serializeBdms01MortBackedSegSqlcd(int bdms01MortBackedSegSqlcd) {
		 putNumber(beginBdms01MortBackedSegSqlcd,bdms01MortBackedSegSqlcd,BDMS_01_MORT_BACKED_SEG_SQLCD_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01MortBackedSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01MortBackedSegSqlcd
	 */
   	protected  int serializeBdms01MortBackedSegSqlcd(char[] value) {
	    int  bdms01MortBackedSegSqlcd;
	    if(value.length >0 && value.length!= 4)
            value = new String(value).trim().toCharArray();
	    if (value.length < 4) value = pad(4, value, ' ', LEFT_PAD);
	    else if (value.length > 4) value = substring(value,0,4);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01MortBackedSegSqlcd = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(4,value,false/*isSigned?*/)
		       ,beginBdms01MortBackedSegSqlcd
		       ,4
		      );
		 localBdms01MortBackedSegSqlcdCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01MortBackedSegSqlcd;
    }

   protected int checkBdms01MortBackedSegSqlcdMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_10K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01MortBackedSegSqlcd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01MortBackedSegSqlcd() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01MortBackedSegSqlcd
			                 ,BDMS_01_MORT_BACKED_SEG_SQLCD_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01MortBackedSegSqlcd", beginBdms01MortBackedSegSqlcd,BDMS_01_MORT_BACKED_SEG_SQLCD_LEN);
    }
   	}
     int localMsdGnmaPoolNumberCounter = -1;
     public boolean isMsdGnmaPoolNumberModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMsdGnmaPoolNumberCounter != sharedCounter;
         localMsdGnmaPoolNumberCounter = sharedCounter; return hasModified;
     }
	protected static final int MSD_GNMA_POOL_NUMBER_LEN = 6;
	/**
	 * 	serialize this MsdGnmaPoolNumber
	 */
   protected void serializeMsdGnmaPoolNumber(char[] msdGnmaPoolNumber) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(msdGnmaPoolNumber,0,getStringValue(),beginMsdGnmaPoolNumber,MSD_GNMA_POOL_NUMBER_LEN);
       localMsdGnmaPoolNumberCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMsdGnmaPoolNumberConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshMsdGnmaPoolNumber is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMsdGnmaPoolNumber() {	 
   		return (substring(getStringValue(),beginMsdGnmaPoolNumber,beginMsdGnmaPoolNumber + MSD_GNMA_POOL_NUMBER_LEN));
   	}
     int localBdms01PayGrdtdIndCounter = -1;
     public boolean isBdms01PayGrdtdIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PayGrdtdIndCounter != sharedCounter;
         localBdms01PayGrdtdIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PAY_GRDTD_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PayGrdtdInd
	 */
   protected void serializeBdms01PayGrdtdInd(char[] bdms01PayGrdtdInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PayGrdtdInd,0,getStringValue(),beginBdms01PayGrdtdInd,BDMS_01_PAY_GRDTD_IND_LEN);
       localBdms01PayGrdtdIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PayGrdtdIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PayGrdtdInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PayGrdtdInd() {	 
   		return (substring(getStringValue(),beginBdms01PayGrdtdInd,beginBdms01PayGrdtdInd + BDMS_01_PAY_GRDTD_IND_LEN));
   	}
     int localBdms01TypeMbsCdCounter = -1;
     public boolean isBdms01TypeMbsCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01TypeMbsCdCounter != sharedCounter;
         localBdms01TypeMbsCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_TYPE_MBS_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01TypeMbsCd
	 */
   protected void serializeBdms01TypeMbsCd(char[] bdms01TypeMbsCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01TypeMbsCd,0,getStringValue(),beginBdms01TypeMbsCd,BDMS_01_TYPE_MBS_CD_LEN);
       localBdms01TypeMbsCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01TypeMbsCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01TypeMbsCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01TypeMbsCd() {	 
   		return (substring(getStringValue(),beginBdms01TypeMbsCd,beginBdms01TypeMbsCd + BDMS_01_TYPE_MBS_CD_LEN));
   	}
     int localBdms01AvgWghtCpnAmtCounter = -1;
     
     public boolean isBdms01AvgWghtCpnAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AvgWghtCpnAmtCounter != sharedCounter;
         localBdms01AvgWghtCpnAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01AvgWghtCpnAmt
	 *	@return bdms01AvgWghtCpnAmt
	 */
	public char[]  getBdms01AvgWghtCpnAmtString() {
	    return getCharArray(beginBdms01AvgWghtCpnAmt,BDMS_01_AVG_WGHT_CPN_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01AvgWghtCpnAmtIsNumeric() {
		    return isNumeric(beginBdms01AvgWghtCpnAmt
	                    ,beginBdms01AvgWghtCpnAmt + BDMS_01_AVG_WGHT_CPN_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_AVG_WGHT_CPN_AMT_LEN = 18;
  protected  static final int BDMS_01_AVG_WGHT_CPN_AMT_SCALE = 8;

   protected BigDecimal checkBdms01AvgWghtCpnAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01AvgWghtCpnAmt
	 */
	protected void serializeBdms01AvgWghtCpnAmt(BigDecimal bdms01AvgWghtCpnAmt) {
	       putNumber(beginBdms01AvgWghtCpnAmt,bdms01AvgWghtCpnAmt,BDMS_01_AVG_WGHT_CPN_AMT_LEN,BDMS_01_AVG_WGHT_CPN_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01AvgWghtCpnAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01AvgWghtCpnAmt
	 */
   	protected  BigDecimal serializeBdms01AvgWghtCpnAmt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01AvgWghtCpnAmt
		       ,18
		      );		 localBdms01AvgWghtCpnAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_AVG_WGHT_CPN_AMT_LEN,BDMS_01_AVG_WGHT_CPN_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01AvgWghtCpnAmt", beginBdms01AvgWghtCpnAmt,BDMS_01_AVG_WGHT_CPN_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01AvgWghtCpnAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01AvgWghtCpnAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01AvgWghtCpnAmt
			            ,BDMS_01_AVG_WGHT_CPN_AMT_LEN
			            ,BDMS_01_AVG_WGHT_CPN_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01AvgWghtCpnAmt", beginBdms01AvgWghtCpnAmt,BDMS_01_AVG_WGHT_CPN_AMT_LEN);
    }
   	}
     int localBdms01MbOrgnlAmtCounter = -1;
     
     public boolean isBdms01MbOrgnlAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MbOrgnlAmtCounter != sharedCounter;
         localBdms01MbOrgnlAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01MbOrgnlAmt
	 *	@return bdms01MbOrgnlAmt
	 */
	public char[]  getBdms01MbOrgnlAmtString() {
	    return getCharArray(beginBdms01MbOrgnlAmt,BDMS_01_MB_ORGNL_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01MbOrgnlAmtIsNumeric() {
		    return isNumeric(beginBdms01MbOrgnlAmt
	                    ,beginBdms01MbOrgnlAmt + BDMS_01_MB_ORGNL_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_MB_ORGNL_AMT_LEN = 18;
  protected  static final int BDMS_01_MB_ORGNL_AMT_SCALE = 8;

   protected BigDecimal checkBdms01MbOrgnlAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01MbOrgnlAmt
	 */
	protected void serializeBdms01MbOrgnlAmt(BigDecimal bdms01MbOrgnlAmt) {
	       putNumber(beginBdms01MbOrgnlAmt,bdms01MbOrgnlAmt,BDMS_01_MB_ORGNL_AMT_LEN,BDMS_01_MB_ORGNL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01MbOrgnlAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01MbOrgnlAmt
	 */
   	protected  BigDecimal serializeBdms01MbOrgnlAmt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01MbOrgnlAmt
		       ,18
		      );		 localBdms01MbOrgnlAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_MB_ORGNL_AMT_LEN,BDMS_01_MB_ORGNL_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01MbOrgnlAmt", beginBdms01MbOrgnlAmt,BDMS_01_MB_ORGNL_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01MbOrgnlAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01MbOrgnlAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01MbOrgnlAmt
			            ,BDMS_01_MB_ORGNL_AMT_LEN
			            ,BDMS_01_MB_ORGNL_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01MbOrgnlAmt", beginBdms01MbOrgnlAmt,BDMS_01_MB_ORGNL_AMT_LEN);
    }
   	}
     int localBdms01AvgWghtMatAmtCounter = -1;
     
     public boolean isBdms01AvgWghtMatAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01AvgWghtMatAmtCounter != sharedCounter;
         localBdms01AvgWghtMatAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01AvgWghtMatAmt
	 *	@return bdms01AvgWghtMatAmt
	 */
	public char[]  getBdms01AvgWghtMatAmtString() {
	    return getCharArray(beginBdms01AvgWghtMatAmt,BDMS_01_AVG_WGHT_MAT_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01AvgWghtMatAmtIsNumeric() {
		    return isNumeric(beginBdms01AvgWghtMatAmt
	                    ,beginBdms01AvgWghtMatAmt + BDMS_01_AVG_WGHT_MAT_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_AVG_WGHT_MAT_AMT_LEN = 18;
  protected  static final int BDMS_01_AVG_WGHT_MAT_AMT_SCALE = 8;

   protected BigDecimal checkBdms01AvgWghtMatAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeBdms01AvgWghtMatAmt
	 */
	protected void serializeBdms01AvgWghtMatAmt(BigDecimal bdms01AvgWghtMatAmt) {
	       putNumber(beginBdms01AvgWghtMatAmt,bdms01AvgWghtMatAmt,BDMS_01_AVG_WGHT_MAT_AMT_LEN,BDMS_01_AVG_WGHT_MAT_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01AvgWghtMatAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01AvgWghtMatAmt
	 */
   	protected  BigDecimal serializeBdms01AvgWghtMatAmt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginBdms01AvgWghtMatAmt
		       ,18
		      );		 localBdms01AvgWghtMatAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_AVG_WGHT_MAT_AMT_LEN,BDMS_01_AVG_WGHT_MAT_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01AvgWghtMatAmt", beginBdms01AvgWghtMatAmt,BDMS_01_AVG_WGHT_MAT_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01AvgWghtMatAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01AvgWghtMatAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01AvgWghtMatAmt
			            ,BDMS_01_AVG_WGHT_MAT_AMT_LEN
			            ,BDMS_01_AVG_WGHT_MAT_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01AvgWghtMatAmt", beginBdms01AvgWghtMatAmt,BDMS_01_AVG_WGHT_MAT_AMT_LEN);
    }
   	}
     int localBdms01MbDayDelayQtyCounter = -1;
     public boolean isBdms01MbDayDelayQtyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01MbDayDelayQtyCounter != sharedCounter;
         localBdms01MbDayDelayQtyCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of bdms01MbDayDelayQty
	 *	@return bdms01MbDayDelayQty
	 */
	public char[]  getBdms01MbDayDelayQtyString() {
	     return getCharArray(beginBdms01MbDayDelayQty,BDMS_01_MB_DAY_DELAY_QTY_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01MbDayDelayQtyIsNumeric() {
	    return isNumeric(beginBdms01MbDayDelayQty
	                    ,beginBdms01MbDayDelayQty + BDMS_01_MB_DAY_DELAY_QTY_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int BDMS_01_MB_DAY_DELAY_QTY_LEN = 3;
  	/**
	 * serializeBdms01MbDayDelayQty
	 */
	protected void serializeBdms01MbDayDelayQty(int bdms01MbDayDelayQty) {
		 putNumber(beginBdms01MbDayDelayQty,bdms01MbDayDelayQty,BDMS_01_MB_DAY_DELAY_QTY_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01MbDayDelayQtyCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeBdms01MbDayDelayQty
	 */
   	protected  int serializeBdms01MbDayDelayQty(char[] value) {
	    int  bdms01MbDayDelayQty;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    bdms01MbDayDelayQty = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginBdms01MbDayDelayQty
		       ,3
		      );
		 localBdms01MbDayDelayQtyCounter = shareString.getSerializedField().getModifiedCounter();
		return  bdms01MbDayDelayQty;
    }

   protected int checkBdms01MbDayDelayQtyMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshBdms01MbDayDelayQty is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshBdms01MbDayDelayQty() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginBdms01MbDayDelayQty
			                 ,BDMS_01_MB_DAY_DELAY_QTY_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01MbDayDelayQty", beginBdms01MbDayDelayQty,BDMS_01_MB_DAY_DELAY_QTY_LEN);
    }
   	}




}
  
