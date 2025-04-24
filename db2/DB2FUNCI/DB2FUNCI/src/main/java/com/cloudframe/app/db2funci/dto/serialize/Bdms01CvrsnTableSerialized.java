package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class Bdms01CvrsnTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Bdms01CvrsnTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01CvrsnTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_CVRSN_TABLE_LENGTH = 77;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01CvrsnCvtblRt;
            protected  int beginBdms01CvrsnCvtblExerCd;
            protected  int beginBdms01CvrsnCvtblExpDt;
            protected  int beginBdms01CvrsnExerSecId;
            protected  int beginBdms01CvrsnExerCncyCd;
            protected  int beginBdms01CvrsnCvtblPrcAmt;
            protected  int beginBdms01CvrsnExerSecCd;
            protected  int beginBdms01CvrsnExerExchRt;
            protected  int beginBdms01CvrsnExerRtCd;
            protected  int beginBdms01CvrsnExerPrcCd;
	
	/**
	* Constructor for Bdms01CvrsnTableSerialized
	**/
    public Bdms01CvrsnTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01CvrsnTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01CvrsnTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01CvrsnTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4848); // serialize this field at offset 4848 by default 
    }
    
	/**
	* sets parent for this Bdms01CvrsnTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4848 by default
    }    
	/**
	* initializes the field in Bdms01CvrsnTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_CVRSN_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01CvrsnCvtblRt = getStartOffset() + 0;	// set offset for serialization
  
             beginBdms01CvrsnCvtblExerCd = getStartOffset() + 15;	// set offset for serialization
  
             beginBdms01CvrsnCvtblExpDt = getStartOffset() + 19;	// set offset for serialization
  
             beginBdms01CvrsnExerSecId = getStartOffset() + 29;	// set offset for serialization
  
             beginBdms01CvrsnExerCncyCd = getStartOffset() + 41;	// set offset for serialization
  
             beginBdms01CvrsnCvtblPrcAmt = getStartOffset() + 44;	// set offset for serialization
  
             beginBdms01CvrsnExerSecCd = getStartOffset() + 59;	// set offset for serialization
  
             beginBdms01CvrsnExerExchRt = getStartOffset() + 60;	// set offset for serialization
  
             beginBdms01CvrsnExerRtCd = getStartOffset() + 75;	// set offset for serialization
  
             beginBdms01CvrsnExerPrcCd = getStartOffset() + 76;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01CvrsnCvtblRtCounter = -1;
     
     public boolean isBdms01CvrsnCvtblRtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnCvtblRtCounter != sharedCounter;
         localBdms01CvrsnCvtblRtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01CvrsnCvtblRt
	 *	@return bdms01CvrsnCvtblRt
	 */
	public char[]  getBdms01CvrsnCvtblRtString() {
	    return getCharArray(beginBdms01CvrsnCvtblRt,BDMS_01_CVRSN_CVTBL_RT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CvrsnCvtblRtIsNumeric() {
		    return isNumeric(beginBdms01CvrsnCvtblRt
	                    ,beginBdms01CvrsnCvtblRt + BDMS_01_CVRSN_CVTBL_RT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_CVRSN_CVTBL_RT_LEN = 15;
  protected  static final int BDMS_01_CVRSN_CVTBL_RT_SCALE = 8;

   protected BigDecimal checkBdms01CvrsnCvtblRtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01CvrsnCvtblRt
	 */
	protected void serializeBdms01CvrsnCvtblRt(BigDecimal bdms01CvrsnCvtblRt) {
	       putNumber(beginBdms01CvrsnCvtblRt,bdms01CvrsnCvtblRt,BDMS_01_CVRSN_CVTBL_RT_LEN,BDMS_01_CVRSN_CVTBL_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CvrsnCvtblRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01CvrsnCvtblRt
	 */
   	protected  BigDecimal serializeBdms01CvrsnCvtblRt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01CvrsnCvtblRt
		       ,15
		      );		 localBdms01CvrsnCvtblRtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_CVRSN_CVTBL_RT_LEN,BDMS_01_CVRSN_CVTBL_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01CvrsnCvtblRt", beginBdms01CvrsnCvtblRt,BDMS_01_CVRSN_CVTBL_RT_LEN);
    	}
    }
    /**
	 *	refreshBdms01CvrsnCvtblRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01CvrsnCvtblRt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01CvrsnCvtblRt
			            ,BDMS_01_CVRSN_CVTBL_RT_LEN
			            ,BDMS_01_CVRSN_CVTBL_RT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CvrsnCvtblRt", beginBdms01CvrsnCvtblRt,BDMS_01_CVRSN_CVTBL_RT_LEN);
    }
   	}
     int localBdms01CvrsnCvtblExerCdCounter = -1;
     public boolean isBdms01CvrsnCvtblExerCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnCvtblExerCdCounter != sharedCounter;
         localBdms01CvrsnCvtblExerCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_CVTBL_EXER_CD_LEN = 4;
	/**
	 * 	serialize this Bdms01CvrsnCvtblExerCd
	 */
   protected void serializeBdms01CvrsnCvtblExerCd(char[] bdms01CvrsnCvtblExerCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnCvtblExerCd,0,getStringValue(),beginBdms01CvrsnCvtblExerCd,BDMS_01_CVRSN_CVTBL_EXER_CD_LEN);
       localBdms01CvrsnCvtblExerCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnCvtblExerCdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnCvtblExerCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnCvtblExerCd() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnCvtblExerCd,beginBdms01CvrsnCvtblExerCd + BDMS_01_CVRSN_CVTBL_EXER_CD_LEN));
   	}
     int localBdms01CvrsnCvtblExpDtCounter = -1;
     public boolean isBdms01CvrsnCvtblExpDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnCvtblExpDtCounter != sharedCounter;
         localBdms01CvrsnCvtblExpDtCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_CVTBL_EXP_DT_LEN = 10;
	/**
	 * 	serialize this Bdms01CvrsnCvtblExpDt
	 */
   protected void serializeBdms01CvrsnCvtblExpDt(char[] bdms01CvrsnCvtblExpDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnCvtblExpDt,0,getStringValue(),beginBdms01CvrsnCvtblExpDt,BDMS_01_CVRSN_CVTBL_EXP_DT_LEN);
       localBdms01CvrsnCvtblExpDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnCvtblExpDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnCvtblExpDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnCvtblExpDt() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnCvtblExpDt,beginBdms01CvrsnCvtblExpDt + BDMS_01_CVRSN_CVTBL_EXP_DT_LEN));
   	}
     int localBdms01CvrsnExerSecIdCounter = -1;
     public boolean isBdms01CvrsnExerSecIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExerSecIdCounter != sharedCounter;
         localBdms01CvrsnExerSecIdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_EXER_SEC_ID_LEN = 12;
	/**
	 * 	serialize this Bdms01CvrsnExerSecId
	 */
   protected void serializeBdms01CvrsnExerSecId(char[] bdms01CvrsnExerSecId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnExerSecId,0,getStringValue(),beginBdms01CvrsnExerSecId,BDMS_01_CVRSN_EXER_SEC_ID_LEN);
       localBdms01CvrsnExerSecIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnExerSecIdConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnExerSecId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnExerSecId() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnExerSecId,beginBdms01CvrsnExerSecId + BDMS_01_CVRSN_EXER_SEC_ID_LEN));
   	}
     int localBdms01CvrsnExerCncyCdCounter = -1;
     public boolean isBdms01CvrsnExerCncyCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExerCncyCdCounter != sharedCounter;
         localBdms01CvrsnExerCncyCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_EXER_CNCY_CD_LEN = 3;
	/**
	 * 	serialize this Bdms01CvrsnExerCncyCd
	 */
   protected void serializeBdms01CvrsnExerCncyCd(char[] bdms01CvrsnExerCncyCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnExerCncyCd,0,getStringValue(),beginBdms01CvrsnExerCncyCd,BDMS_01_CVRSN_EXER_CNCY_CD_LEN);
       localBdms01CvrsnExerCncyCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnExerCncyCdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnExerCncyCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnExerCncyCd() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnExerCncyCd,beginBdms01CvrsnExerCncyCd + BDMS_01_CVRSN_EXER_CNCY_CD_LEN));
   	}
     int localBdms01CvrsnCvtblPrcAmtCounter = -1;
     
     public boolean isBdms01CvrsnCvtblPrcAmtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnCvtblPrcAmtCounter != sharedCounter;
         localBdms01CvrsnCvtblPrcAmtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01CvrsnCvtblPrcAmt
	 *	@return bdms01CvrsnCvtblPrcAmt
	 */
	public char[]  getBdms01CvrsnCvtblPrcAmtString() {
	    return getCharArray(beginBdms01CvrsnCvtblPrcAmt,BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CvrsnCvtblPrcAmtIsNumeric() {
		    return isNumeric(beginBdms01CvrsnCvtblPrcAmt
	                    ,beginBdms01CvrsnCvtblPrcAmt + BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN = 15;
  protected  static final int BDMS_01_CVRSN_CVTBL_PRC_AMT_SCALE = 8;

   protected BigDecimal checkBdms01CvrsnCvtblPrcAmtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01CvrsnCvtblPrcAmt
	 */
	protected void serializeBdms01CvrsnCvtblPrcAmt(BigDecimal bdms01CvrsnCvtblPrcAmt) {
	       putNumber(beginBdms01CvrsnCvtblPrcAmt,bdms01CvrsnCvtblPrcAmt,BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN,BDMS_01_CVRSN_CVTBL_PRC_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CvrsnCvtblPrcAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01CvrsnCvtblPrcAmt
	 */
   	protected  BigDecimal serializeBdms01CvrsnCvtblPrcAmt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01CvrsnCvtblPrcAmt
		       ,15
		      );		 localBdms01CvrsnCvtblPrcAmtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN,BDMS_01_CVRSN_CVTBL_PRC_AMT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01CvrsnCvtblPrcAmt", beginBdms01CvrsnCvtblPrcAmt,BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN);
    	}
    }
    /**
	 *	refreshBdms01CvrsnCvtblPrcAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01CvrsnCvtblPrcAmt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01CvrsnCvtblPrcAmt
			            ,BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN
			            ,BDMS_01_CVRSN_CVTBL_PRC_AMT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CvrsnCvtblPrcAmt", beginBdms01CvrsnCvtblPrcAmt,BDMS_01_CVRSN_CVTBL_PRC_AMT_LEN);
    }
   	}
     int localBdms01CvrsnExerSecCdCounter = -1;
     public boolean isBdms01CvrsnExerSecCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExerSecCdCounter != sharedCounter;
         localBdms01CvrsnExerSecCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_EXER_SEC_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CvrsnExerSecCd
	 */
   protected void serializeBdms01CvrsnExerSecCd(char[] bdms01CvrsnExerSecCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnExerSecCd,0,getStringValue(),beginBdms01CvrsnExerSecCd,BDMS_01_CVRSN_EXER_SEC_CD_LEN);
       localBdms01CvrsnExerSecCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnExerSecCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnExerSecCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnExerSecCd() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnExerSecCd,beginBdms01CvrsnExerSecCd + BDMS_01_CVRSN_EXER_SEC_CD_LEN));
   	}
     int localBdms01CvrsnExerExchRtCounter = -1;
     
     public boolean isBdms01CvrsnExerExchRtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExerExchRtCounter != sharedCounter;
         localBdms01CvrsnExerExchRtCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of bdms01CvrsnExerExchRt
	 *	@return bdms01CvrsnExerExchRt
	 */
	public char[]  getBdms01CvrsnExerExchRtString() {
	    return getCharArray(beginBdms01CvrsnExerExchRt,BDMS_01_CVRSN_EXER_EXCH_RT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean bdms01CvrsnExerExchRtIsNumeric() {
		    return isNumeric(beginBdms01CvrsnExerExchRt
	                    ,beginBdms01CvrsnExerExchRt + BDMS_01_CVRSN_EXER_EXCH_RT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int BDMS_01_CVRSN_EXER_EXCH_RT_LEN = 15;
  protected  static final int BDMS_01_CVRSN_EXER_EXCH_RT_SCALE = 8;

   protected BigDecimal checkBdms01CvrsnExerExchRtMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,8/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeBdms01CvrsnExerExchRt
	 */
	protected void serializeBdms01CvrsnExerExchRt(BigDecimal bdms01CvrsnExerExchRt) {
	       putNumber(beginBdms01CvrsnExerExchRt,bdms01CvrsnExerExchRt,BDMS_01_CVRSN_EXER_EXCH_RT_LEN,BDMS_01_CVRSN_EXER_EXCH_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localBdms01CvrsnExerExchRtCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeBdms01CvrsnExerExchRt
	 */
   	protected  BigDecimal serializeBdms01CvrsnExerExchRt(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginBdms01CvrsnExerExchRt
		       ,15
		      );		 localBdms01CvrsnExerExchRtCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,BDMS_01_CVRSN_EXER_EXCH_RT_LEN,BDMS_01_CVRSN_EXER_EXCH_RT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("bdms01CvrsnExerExchRt", beginBdms01CvrsnExerExchRt,BDMS_01_CVRSN_EXER_EXCH_RT_LEN);
    	}
    }
    /**
	 *	refreshBdms01CvrsnExerExchRt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshBdms01CvrsnExerExchRt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginBdms01CvrsnExerExchRt
			            ,BDMS_01_CVRSN_EXER_EXCH_RT_LEN
			            ,BDMS_01_CVRSN_EXER_EXCH_RT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("bdms01CvrsnExerExchRt", beginBdms01CvrsnExerExchRt,BDMS_01_CVRSN_EXER_EXCH_RT_LEN);
    }
   	}
     int localBdms01CvrsnExerRtCdCounter = -1;
     public boolean isBdms01CvrsnExerRtCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExerRtCdCounter != sharedCounter;
         localBdms01CvrsnExerRtCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_EXER_RT_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CvrsnExerRtCd
	 */
   protected void serializeBdms01CvrsnExerRtCd(char[] bdms01CvrsnExerRtCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnExerRtCd,0,getStringValue(),beginBdms01CvrsnExerRtCd,BDMS_01_CVRSN_EXER_RT_CD_LEN);
       localBdms01CvrsnExerRtCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnExerRtCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnExerRtCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnExerRtCd() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnExerRtCd,beginBdms01CvrsnExerRtCd + BDMS_01_CVRSN_EXER_RT_CD_LEN));
   	}
     int localBdms01CvrsnExerPrcCdCounter = -1;
     public boolean isBdms01CvrsnExerPrcCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01CvrsnExerPrcCdCounter != sharedCounter;
         localBdms01CvrsnExerPrcCdCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_CVRSN_EXER_PRC_CD_LEN = 1;
	/**
	 * 	serialize this Bdms01CvrsnExerPrcCd
	 */
   protected void serializeBdms01CvrsnExerPrcCd(char[] bdms01CvrsnExerPrcCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01CvrsnExerPrcCd,0,getStringValue(),beginBdms01CvrsnExerPrcCd,BDMS_01_CVRSN_EXER_PRC_CD_LEN);
       localBdms01CvrsnExerPrcCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01CvrsnExerPrcCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01CvrsnExerPrcCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01CvrsnExerPrcCd() {	 
   		return (substring(getStringValue(),beginBdms01CvrsnExerPrcCd,beginBdms01CvrsnExerPrcCd + BDMS_01_CVRSN_EXER_PRC_CD_LEN));
   	}




}
  
