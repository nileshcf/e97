package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360AMcsAcqSetlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360AMcsAcqSetlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360AMcsAcqSetlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_AMCS_ACQ_SETL_LENGTH = 269;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360AMcsAcqApprovedCntCr;
            protected  int beginX360AMcsAcqApprovedCntDb;
            protected  int beginX360AMcsAcqDeniedCntCr;
            protected  int beginX360AMcsAcqDeniedCntDb;
            protected  int beginX360AMcsAcqAmtCr;
            protected  int beginX360AMcsAcqAmtDb;
            protected  int beginX360AMcsAcqCnvRteBse;
            protected  int beginX360AMcsAcqCurrCde;
            protected  int beginX360AMcsAcqCnvRteLoc;
            protected  int beginX360AMcsAcqSetlIca;
            protected  int beginX360AAcqFinIfeeCnt;
            protected  int beginX360AAcqNfIfeeCnt;
            protected  int beginX360AAcqPctIfeeCnt;
            protected  int beginX360AAcqNobillIfeeCnt;
            protected  int beginX360AAcqIfeeAmtCr;
            protected  int beginX360AAcqIfeeAmtDb;
            protected  int beginX360AAcqOrigAmtCr;
            protected  int beginX360AAcqOrigAmtDb;
            protected  int beginX360AAcqNewAmtCr;
            protected  int beginX360AAcqNewAmtDb;
            protected  int beginX360AAcqAdjAmtCr;
            protected  int beginX360AAcqAdjAmtDb;
            protected  int beginX360AAcqMccrAmtCrNotused;
            protected  int beginX360AAcqMccrAmtDbNotused;
            protected  int beginX360AAcqIccrAmtCrNotused;
            protected  int beginX360AAcqIccrAmtDbNotused;
            protected  int beginX360AAcqA09ApprovedCntCr;
            protected  int beginX360AAcqA09ApprovedCntDb;
            protected  int beginX360AAcqA09ApprovedAmtCr;
            protected  int beginX360AAcqA09ApprovedAmtDb;
            protected  int beginX360AAcqBaseSetlAmtCr;
            protected  int beginX360AAcqBaseSetlAmtDb;
            protected  int beginX360AAcqMccrA09CrNotused;
            protected  int beginX360AAcqMccrA09DbNotused;
            protected  int beginX360FaVatAcqNfCnt;
            protected  int beginX360FaVatAcqFinAmt;
            protected  int beginX360FaVatAcqNfAmt;
            protected  int beginX360FaVatAcqFinVat;
            protected  int beginX360FaVatAcqNfVat;
	
	/**
	* Constructor for X360AMcsAcqSetlSerialized
	**/
    public X360AMcsAcqSetlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360AMcsAcqSetlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsAcqSetlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360AMcsAcqSetlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,731); // serialize this field at offset 731 by default 
    }
    
	/**
	* sets parent for this X360AMcsAcqSetlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 731 by default
    }    
	/**
	* initializes the field in X360AMcsAcqSetlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_AMCS_ACQ_SETL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360AMcsAcqApprovedCntCr = getStartOffset() + 0;	// set offset for serialization
  
             beginX360AMcsAcqApprovedCntDb = getStartOffset() + 5;	// set offset for serialization
  
             beginX360AMcsAcqDeniedCntCr = getStartOffset() + 10;	// set offset for serialization
  
             beginX360AMcsAcqDeniedCntDb = getStartOffset() + 15;	// set offset for serialization
  
             beginX360AMcsAcqAmtCr = getStartOffset() + 20;	// set offset for serialization
  
             beginX360AMcsAcqAmtDb = getStartOffset() + 28;	// set offset for serialization
  
             beginX360AMcsAcqCnvRteBse = getStartOffset() + 36;	// set offset for serialization
  
             beginX360AMcsAcqCurrCde = getStartOffset() + 44;	// set offset for serialization
  
             beginX360AMcsAcqCnvRteLoc = getStartOffset() + 47;	// set offset for serialization
  
  
             beginX360AMcsAcqSetlIca = getStartOffset() + 56;	// set offset for serialization
  
             beginX360AAcqFinIfeeCnt = getStartOffset() + 62;	// set offset for serialization
  
             beginX360AAcqNfIfeeCnt = getStartOffset() + 67;	// set offset for serialization
  
             beginX360AAcqPctIfeeCnt = getStartOffset() + 72;	// set offset for serialization
  
             beginX360AAcqNobillIfeeCnt = getStartOffset() + 77;	// set offset for serialization
  
             beginX360AAcqIfeeAmtCr = getStartOffset() + 82;	// set offset for serialization
  
             beginX360AAcqIfeeAmtDb = getStartOffset() + 90;	// set offset for serialization
  
             beginX360AAcqOrigAmtCr = getStartOffset() + 98;	// set offset for serialization
  
             beginX360AAcqOrigAmtDb = getStartOffset() + 106;	// set offset for serialization
  
             beginX360AAcqNewAmtCr = getStartOffset() + 114;	// set offset for serialization
  
             beginX360AAcqNewAmtDb = getStartOffset() + 122;	// set offset for serialization
  
             beginX360AAcqAdjAmtCr = getStartOffset() + 130;	// set offset for serialization
  
             beginX360AAcqAdjAmtDb = getStartOffset() + 138;	// set offset for serialization
  
             beginX360AAcqMccrAmtCrNotused = getStartOffset() + 146;	// set offset for serialization
  
             beginX360AAcqMccrAmtDbNotused = getStartOffset() + 154;	// set offset for serialization
  
             beginX360AAcqIccrAmtCrNotused = getStartOffset() + 162;	// set offset for serialization
  
             beginX360AAcqIccrAmtDbNotused = getStartOffset() + 170;	// set offset for serialization
  
             beginX360AAcqA09ApprovedCntCr = getStartOffset() + 178;	// set offset for serialization
  
             beginX360AAcqA09ApprovedCntDb = getStartOffset() + 183;	// set offset for serialization
  
             beginX360AAcqA09ApprovedAmtCr = getStartOffset() + 188;	// set offset for serialization
  
             beginX360AAcqA09ApprovedAmtDb = getStartOffset() + 196;	// set offset for serialization
  
             beginX360AAcqBaseSetlAmtCr = getStartOffset() + 204;	// set offset for serialization
  
             beginX360AAcqBaseSetlAmtDb = getStartOffset() + 212;	// set offset for serialization
  
             beginX360AAcqMccrA09CrNotused = getStartOffset() + 220;	// set offset for serialization
  
             beginX360AAcqMccrA09DbNotused = getStartOffset() + 228;	// set offset for serialization
  
             beginX360FaVatAcqNfCnt = getStartOffset() + 236;	// set offset for serialization
  
             beginX360FaVatAcqFinAmt = getStartOffset() + 241;	// set offset for serialization
  
             beginX360FaVatAcqNfAmt = getStartOffset() + 249;	// set offset for serialization
  
             beginX360FaVatAcqFinVat = getStartOffset() + 257;	// set offset for serialization
  
             beginX360FaVatAcqNfVat = getStartOffset() + 263;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360AMcsAcqApprovedCntCrCounter = -1;
        public boolean isX360AMcsAcqApprovedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsAcqApprovedCntCrCounter != sharedCounter;
           localX360AMcsAcqApprovedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsAcqApprovedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsAcqApprovedCntCr,X_360_AMCS_ACQ_APPROVED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ACQ_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360AMcsAcqApprovedCntCr
	 */
	protected void serializeX360AMcsAcqApprovedCntCr(int x360AMcsAcqApprovedCntCr) {
		   putDecimal(beginX360AMcsAcqApprovedCntCr,x360AMcsAcqApprovedCntCr,X_360_AMCS_ACQ_APPROVED_CNT_CR_LEN,true);
   }
   

   protected int checkX360AMcsAcqApprovedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsAcqApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsAcqApprovedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsAcqApprovedCntCr,X_360_AMCS_ACQ_APPROVED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqApprovedCntCr", beginX360AMcsAcqApprovedCntCr,X_360_AMCS_ACQ_APPROVED_CNT_CR_LEN);
     }
   	}
        int localX360AMcsAcqApprovedCntDbCounter = -1;
        public boolean isX360AMcsAcqApprovedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsAcqApprovedCntDbCounter != sharedCounter;
           localX360AMcsAcqApprovedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsAcqApprovedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsAcqApprovedCntDb,X_360_AMCS_ACQ_APPROVED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ACQ_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360AMcsAcqApprovedCntDb
	 */
	protected void serializeX360AMcsAcqApprovedCntDb(int x360AMcsAcqApprovedCntDb) {
		   putDecimal(beginX360AMcsAcqApprovedCntDb,x360AMcsAcqApprovedCntDb,X_360_AMCS_ACQ_APPROVED_CNT_DB_LEN,true);
   }
   

   protected int checkX360AMcsAcqApprovedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsAcqApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsAcqApprovedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsAcqApprovedCntDb,X_360_AMCS_ACQ_APPROVED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqApprovedCntDb", beginX360AMcsAcqApprovedCntDb,X_360_AMCS_ACQ_APPROVED_CNT_DB_LEN);
     }
   	}
        int localX360AMcsAcqDeniedCntCrCounter = -1;
        public boolean isX360AMcsAcqDeniedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsAcqDeniedCntCrCounter != sharedCounter;
           localX360AMcsAcqDeniedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsAcqDeniedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsAcqDeniedCntCr,X_360_AMCS_ACQ_DENIED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ACQ_DENIED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360AMcsAcqDeniedCntCr
	 */
	protected void serializeX360AMcsAcqDeniedCntCr(int x360AMcsAcqDeniedCntCr) {
		   putDecimal(beginX360AMcsAcqDeniedCntCr,x360AMcsAcqDeniedCntCr,X_360_AMCS_ACQ_DENIED_CNT_CR_LEN,true);
   }
   

   protected int checkX360AMcsAcqDeniedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsAcqDeniedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsAcqDeniedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsAcqDeniedCntCr,X_360_AMCS_ACQ_DENIED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqDeniedCntCr", beginX360AMcsAcqDeniedCntCr,X_360_AMCS_ACQ_DENIED_CNT_CR_LEN);
     }
   	}
        int localX360AMcsAcqDeniedCntDbCounter = -1;
        public boolean isX360AMcsAcqDeniedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsAcqDeniedCntDbCounter != sharedCounter;
           localX360AMcsAcqDeniedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsAcqDeniedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsAcqDeniedCntDb,X_360_AMCS_ACQ_DENIED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ACQ_DENIED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360AMcsAcqDeniedCntDb
	 */
	protected void serializeX360AMcsAcqDeniedCntDb(int x360AMcsAcqDeniedCntDb) {
		   putDecimal(beginX360AMcsAcqDeniedCntDb,x360AMcsAcqDeniedCntDb,X_360_AMCS_ACQ_DENIED_CNT_DB_LEN,true);
   }
   

   protected int checkX360AMcsAcqDeniedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsAcqDeniedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsAcqDeniedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsAcqDeniedCntDb,X_360_AMCS_ACQ_DENIED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqDeniedCntDb", beginX360AMcsAcqDeniedCntDb,X_360_AMCS_ACQ_DENIED_CNT_DB_LEN);
     }
   	}
        int localX360AMcsAcqAmtCrCounter = -1;
        public boolean isX360AMcsAcqAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsAcqAmtCrCounter != sharedCounter;
           localX360AMcsAcqAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsAcqAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsAcqAmtCr,X_360_AMCS_ACQ_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ACQ_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AMcsAcqAmtCr
	 */
	protected void serializeX360AMcsAcqAmtCr(long x360AMcsAcqAmtCr) {
		   putDecimal(beginX360AMcsAcqAmtCr,x360AMcsAcqAmtCr,X_360_AMCS_ACQ_AMT_CR_LEN,true);
   }
   

   protected long checkX360AMcsAcqAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsAcqAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsAcqAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsAcqAmtCr,X_360_AMCS_ACQ_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqAmtCr", beginX360AMcsAcqAmtCr,X_360_AMCS_ACQ_AMT_CR_LEN);
     }
   	}
        int localX360AMcsAcqAmtDbCounter = -1;
        public boolean isX360AMcsAcqAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsAcqAmtDbCounter != sharedCounter;
           localX360AMcsAcqAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsAcqAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsAcqAmtDb,X_360_AMCS_ACQ_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ACQ_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AMcsAcqAmtDb
	 */
	protected void serializeX360AMcsAcqAmtDb(long x360AMcsAcqAmtDb) {
		   putDecimal(beginX360AMcsAcqAmtDb,x360AMcsAcqAmtDb,X_360_AMCS_ACQ_AMT_DB_LEN,true);
   }
   

   protected long checkX360AMcsAcqAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsAcqAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsAcqAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsAcqAmtDb,X_360_AMCS_ACQ_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqAmtDb", beginX360AMcsAcqAmtDb,X_360_AMCS_ACQ_AMT_DB_LEN);
     }
   	}
     int localX360AMcsAcqCnvRteBseCounter = -1;
     public boolean isX360AMcsAcqCnvRteBseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsAcqCnvRteBseCounter != sharedCounter;
         localX360AMcsAcqCnvRteBseCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsAcqCnvRteBse
	 *	@return x360AMcsAcqCnvRteBse
	 */
	public char[]  getX360AMcsAcqCnvRteBseString() {
	     return getCharArray(beginX360AMcsAcqCnvRteBse,X_360_AMCS_ACQ_CNV_RTE_BSE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsAcqCnvRteBseIsNumeric() {
	    return isNumeric(beginX360AMcsAcqCnvRteBse
	                    ,beginX360AMcsAcqCnvRteBse + X_360_AMCS_ACQ_CNV_RTE_BSE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ACQ_CNV_RTE_BSE_LEN = 8;
  	/**
	 * serializeX360AMcsAcqCnvRteBse
	 */
	protected void serializeX360AMcsAcqCnvRteBse(long x360AMcsAcqCnvRteBse) {
		 putNumber(beginX360AMcsAcqCnvRteBse,x360AMcsAcqCnvRteBse,X_360_AMCS_ACQ_CNV_RTE_BSE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsAcqCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsAcqCnvRteBse
	 */
   	protected  long serializeX360AMcsAcqCnvRteBse(char[] value) {
	    long  x360AMcsAcqCnvRteBse;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsAcqCnvRteBse = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360AMcsAcqCnvRteBse
		       ,8
		      );
		 localX360AMcsAcqCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsAcqCnvRteBse;
    }

   protected long checkX360AMcsAcqCnvRteBseMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsAcqCnvRteBse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsAcqCnvRteBse() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsAcqCnvRteBse
			                 ,X_360_AMCS_ACQ_CNV_RTE_BSE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqCnvRteBse", beginX360AMcsAcqCnvRteBse,X_360_AMCS_ACQ_CNV_RTE_BSE_LEN);
    }
   	}
     int localX360AMcsAcqCurrCdeCounter = -1;
     public boolean isX360AMcsAcqCurrCdeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsAcqCurrCdeCounter != sharedCounter;
         localX360AMcsAcqCurrCdeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsAcqCurrCde
	 *	@return x360AMcsAcqCurrCde
	 */
	public char[]  getX360AMcsAcqCurrCdeString() {
	     return getCharArray(beginX360AMcsAcqCurrCde,X_360_AMCS_ACQ_CURR_CDE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsAcqCurrCdeIsNumeric() {
	    return isNumeric(beginX360AMcsAcqCurrCde
	                    ,beginX360AMcsAcqCurrCde + X_360_AMCS_ACQ_CURR_CDE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ACQ_CURR_CDE_LEN = 3;
  	/**
	 * serializeX360AMcsAcqCurrCde
	 */
	protected void serializeX360AMcsAcqCurrCde(int x360AMcsAcqCurrCde) {
		 putNumber(beginX360AMcsAcqCurrCde,x360AMcsAcqCurrCde,X_360_AMCS_ACQ_CURR_CDE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsAcqCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsAcqCurrCde
	 */
   	protected  int serializeX360AMcsAcqCurrCde(char[] value) {
	    int  x360AMcsAcqCurrCde;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsAcqCurrCde = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginX360AMcsAcqCurrCde
		       ,3
		      );
		 localX360AMcsAcqCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsAcqCurrCde;
    }

   protected int checkX360AMcsAcqCurrCdeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsAcqCurrCde is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsAcqCurrCde() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360AMcsAcqCurrCde
			                 ,X_360_AMCS_ACQ_CURR_CDE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqCurrCde", beginX360AMcsAcqCurrCde,X_360_AMCS_ACQ_CURR_CDE_LEN);
    }
   	}
     int localX360AMcsAcqCnvRteLocCounter = -1;
     public boolean isX360AMcsAcqCnvRteLocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsAcqCnvRteLocCounter != sharedCounter;
         localX360AMcsAcqCnvRteLocCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsAcqCnvRteLoc
	 *	@return x360AMcsAcqCnvRteLoc
	 */
	public char[]  getX360AMcsAcqCnvRteLocString() {
	     return getCharArray(beginX360AMcsAcqCnvRteLoc,X_360_AMCS_ACQ_CNV_RTE_LOC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsAcqCnvRteLocIsNumeric() {
	    return isNumeric(beginX360AMcsAcqCnvRteLoc
	                    ,beginX360AMcsAcqCnvRteLoc + X_360_AMCS_ACQ_CNV_RTE_LOC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ACQ_CNV_RTE_LOC_LEN = 8;
  	/**
	 * serializeX360AMcsAcqCnvRteLoc
	 */
	protected void serializeX360AMcsAcqCnvRteLoc(long x360AMcsAcqCnvRteLoc) {
		 putNumber(beginX360AMcsAcqCnvRteLoc,x360AMcsAcqCnvRteLoc,X_360_AMCS_ACQ_CNV_RTE_LOC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsAcqCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsAcqCnvRteLoc
	 */
   	protected  long serializeX360AMcsAcqCnvRteLoc(char[] value) {
	    long  x360AMcsAcqCnvRteLoc;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsAcqCnvRteLoc = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360AMcsAcqCnvRteLoc
		       ,8
		      );
		 localX360AMcsAcqCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsAcqCnvRteLoc;
    }

   protected long checkX360AMcsAcqCnvRteLocMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsAcqCnvRteLoc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsAcqCnvRteLoc() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsAcqCnvRteLoc
			                 ,X_360_AMCS_ACQ_CNV_RTE_LOC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqCnvRteLoc", beginX360AMcsAcqCnvRteLoc,X_360_AMCS_ACQ_CNV_RTE_LOC_LEN);
    }
   	}
     int localX360AMcsAcqSetlIcaCounter = -1;
     public boolean isX360AMcsAcqSetlIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsAcqSetlIcaCounter != sharedCounter;
         localX360AMcsAcqSetlIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsAcqSetlIca
	 *	@return x360AMcsAcqSetlIca
	 */
	public char[]  getX360AMcsAcqSetlIcaString() {
	     return getCharArray(beginX360AMcsAcqSetlIca,X_360_AMCS_ACQ_SETL_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsAcqSetlIcaIsNumeric() {
	    return isNumeric(beginX360AMcsAcqSetlIca
	                    ,beginX360AMcsAcqSetlIca + X_360_AMCS_ACQ_SETL_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ACQ_SETL_ICA_LEN = 6;
  	/**
	 * serializeX360AMcsAcqSetlIca
	 */
	protected void serializeX360AMcsAcqSetlIca(long x360AMcsAcqSetlIca) {
		 putNumber(beginX360AMcsAcqSetlIca,x360AMcsAcqSetlIca,X_360_AMCS_ACQ_SETL_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsAcqSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsAcqSetlIca
	 */
   	protected  long serializeX360AMcsAcqSetlIca(char[] value) {
	    long  x360AMcsAcqSetlIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsAcqSetlIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360AMcsAcqSetlIca
		       ,6
		      );
		 localX360AMcsAcqSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsAcqSetlIca;
    }

   protected long checkX360AMcsAcqSetlIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsAcqSetlIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsAcqSetlIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsAcqSetlIca
			                 ,X_360_AMCS_ACQ_SETL_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsAcqSetlIca", beginX360AMcsAcqSetlIca,X_360_AMCS_ACQ_SETL_ICA_LEN);
    }
   	}
        int localX360AAcqFinIfeeCntCounter = -1;
        public boolean isX360AAcqFinIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqFinIfeeCntCounter != sharedCounter;
           localX360AAcqFinIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqFinIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqFinIfeeCnt,X_360_AACQ_FIN_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_FIN_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AAcqFinIfeeCnt
	 */
	protected void serializeX360AAcqFinIfeeCnt(int x360AAcqFinIfeeCnt) {
		   putDecimal(beginX360AAcqFinIfeeCnt,x360AAcqFinIfeeCnt,X_360_AACQ_FIN_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AAcqFinIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqFinIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqFinIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqFinIfeeCnt,X_360_AACQ_FIN_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqFinIfeeCnt", beginX360AAcqFinIfeeCnt,X_360_AACQ_FIN_IFEE_CNT_LEN);
     }
   	}
        int localX360AAcqNfIfeeCntCounter = -1;
        public boolean isX360AAcqNfIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqNfIfeeCntCounter != sharedCounter;
           localX360AAcqNfIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqNfIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqNfIfeeCnt,X_360_AACQ_NF_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_NF_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AAcqNfIfeeCnt
	 */
	protected void serializeX360AAcqNfIfeeCnt(int x360AAcqNfIfeeCnt) {
		   putDecimal(beginX360AAcqNfIfeeCnt,x360AAcqNfIfeeCnt,X_360_AACQ_NF_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AAcqNfIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqNfIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqNfIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqNfIfeeCnt,X_360_AACQ_NF_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqNfIfeeCnt", beginX360AAcqNfIfeeCnt,X_360_AACQ_NF_IFEE_CNT_LEN);
     }
   	}
        int localX360AAcqPctIfeeCntCounter = -1;
        public boolean isX360AAcqPctIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqPctIfeeCntCounter != sharedCounter;
           localX360AAcqPctIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqPctIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqPctIfeeCnt,X_360_AACQ_PCT_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_PCT_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AAcqPctIfeeCnt
	 */
	protected void serializeX360AAcqPctIfeeCnt(int x360AAcqPctIfeeCnt) {
		   putDecimal(beginX360AAcqPctIfeeCnt,x360AAcqPctIfeeCnt,X_360_AACQ_PCT_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AAcqPctIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqPctIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqPctIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqPctIfeeCnt,X_360_AACQ_PCT_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqPctIfeeCnt", beginX360AAcqPctIfeeCnt,X_360_AACQ_PCT_IFEE_CNT_LEN);
     }
   	}
        int localX360AAcqNobillIfeeCntCounter = -1;
        public boolean isX360AAcqNobillIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqNobillIfeeCntCounter != sharedCounter;
           localX360AAcqNobillIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqNobillIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqNobillIfeeCnt,X_360_AACQ_NOBILL_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_NOBILL_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AAcqNobillIfeeCnt
	 */
	protected void serializeX360AAcqNobillIfeeCnt(int x360AAcqNobillIfeeCnt) {
		   putDecimal(beginX360AAcqNobillIfeeCnt,x360AAcqNobillIfeeCnt,X_360_AACQ_NOBILL_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AAcqNobillIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqNobillIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqNobillIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqNobillIfeeCnt,X_360_AACQ_NOBILL_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqNobillIfeeCnt", beginX360AAcqNobillIfeeCnt,X_360_AACQ_NOBILL_IFEE_CNT_LEN);
     }
   	}
        int localX360AAcqIfeeAmtCrCounter = -1;
        public boolean isX360AAcqIfeeAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqIfeeAmtCrCounter != sharedCounter;
           localX360AAcqIfeeAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqIfeeAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqIfeeAmtCr,X_360_AACQ_IFEE_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_IFEE_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AAcqIfeeAmtCr
	 */
	protected void serializeX360AAcqIfeeAmtCr(long x360AAcqIfeeAmtCr) {
		   putDecimal(beginX360AAcqIfeeAmtCr,x360AAcqIfeeAmtCr,X_360_AACQ_IFEE_AMT_CR_LEN,true);
   }
   

   protected long checkX360AAcqIfeeAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqIfeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqIfeeAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqIfeeAmtCr,X_360_AACQ_IFEE_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqIfeeAmtCr", beginX360AAcqIfeeAmtCr,X_360_AACQ_IFEE_AMT_CR_LEN);
     }
   	}
        int localX360AAcqIfeeAmtDbCounter = -1;
        public boolean isX360AAcqIfeeAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqIfeeAmtDbCounter != sharedCounter;
           localX360AAcqIfeeAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqIfeeAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqIfeeAmtDb,X_360_AACQ_IFEE_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_IFEE_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AAcqIfeeAmtDb
	 */
	protected void serializeX360AAcqIfeeAmtDb(long x360AAcqIfeeAmtDb) {
		   putDecimal(beginX360AAcqIfeeAmtDb,x360AAcqIfeeAmtDb,X_360_AACQ_IFEE_AMT_DB_LEN,true);
   }
   

   protected long checkX360AAcqIfeeAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqIfeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqIfeeAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqIfeeAmtDb,X_360_AACQ_IFEE_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqIfeeAmtDb", beginX360AAcqIfeeAmtDb,X_360_AACQ_IFEE_AMT_DB_LEN);
     }
   	}
        int localX360AAcqOrigAmtCrCounter = -1;
        public boolean isX360AAcqOrigAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqOrigAmtCrCounter != sharedCounter;
           localX360AAcqOrigAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqOrigAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqOrigAmtCr,X_360_AACQ_ORIG_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_ORIG_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AAcqOrigAmtCr
	 */
	protected void serializeX360AAcqOrigAmtCr(long x360AAcqOrigAmtCr) {
		   putDecimal(beginX360AAcqOrigAmtCr,x360AAcqOrigAmtCr,X_360_AACQ_ORIG_AMT_CR_LEN,true);
   }
   

   protected long checkX360AAcqOrigAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqOrigAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqOrigAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqOrigAmtCr,X_360_AACQ_ORIG_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqOrigAmtCr", beginX360AAcqOrigAmtCr,X_360_AACQ_ORIG_AMT_CR_LEN);
     }
   	}
        int localX360AAcqOrigAmtDbCounter = -1;
        public boolean isX360AAcqOrigAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqOrigAmtDbCounter != sharedCounter;
           localX360AAcqOrigAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqOrigAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqOrigAmtDb,X_360_AACQ_ORIG_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_ORIG_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AAcqOrigAmtDb
	 */
	protected void serializeX360AAcqOrigAmtDb(long x360AAcqOrigAmtDb) {
		   putDecimal(beginX360AAcqOrigAmtDb,x360AAcqOrigAmtDb,X_360_AACQ_ORIG_AMT_DB_LEN,true);
   }
   

   protected long checkX360AAcqOrigAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqOrigAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqOrigAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqOrigAmtDb,X_360_AACQ_ORIG_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqOrigAmtDb", beginX360AAcqOrigAmtDb,X_360_AACQ_ORIG_AMT_DB_LEN);
     }
   	}
        int localX360AAcqNewAmtCrCounter = -1;
        public boolean isX360AAcqNewAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqNewAmtCrCounter != sharedCounter;
           localX360AAcqNewAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqNewAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqNewAmtCr,X_360_AACQ_NEW_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_NEW_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AAcqNewAmtCr
	 */
	protected void serializeX360AAcqNewAmtCr(long x360AAcqNewAmtCr) {
		   putDecimal(beginX360AAcqNewAmtCr,x360AAcqNewAmtCr,X_360_AACQ_NEW_AMT_CR_LEN,true);
   }
   

   protected long checkX360AAcqNewAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqNewAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqNewAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqNewAmtCr,X_360_AACQ_NEW_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqNewAmtCr", beginX360AAcqNewAmtCr,X_360_AACQ_NEW_AMT_CR_LEN);
     }
   	}
        int localX360AAcqNewAmtDbCounter = -1;
        public boolean isX360AAcqNewAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqNewAmtDbCounter != sharedCounter;
           localX360AAcqNewAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqNewAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqNewAmtDb,X_360_AACQ_NEW_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_NEW_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AAcqNewAmtDb
	 */
	protected void serializeX360AAcqNewAmtDb(long x360AAcqNewAmtDb) {
		   putDecimal(beginX360AAcqNewAmtDb,x360AAcqNewAmtDb,X_360_AACQ_NEW_AMT_DB_LEN,true);
   }
   

   protected long checkX360AAcqNewAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqNewAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqNewAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqNewAmtDb,X_360_AACQ_NEW_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqNewAmtDb", beginX360AAcqNewAmtDb,X_360_AACQ_NEW_AMT_DB_LEN);
     }
   	}
        int localX360AAcqAdjAmtCrCounter = -1;
        public boolean isX360AAcqAdjAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqAdjAmtCrCounter != sharedCounter;
           localX360AAcqAdjAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqAdjAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqAdjAmtCr,X_360_AACQ_ADJ_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_ADJ_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AAcqAdjAmtCr
	 */
	protected void serializeX360AAcqAdjAmtCr(long x360AAcqAdjAmtCr) {
		   putDecimal(beginX360AAcqAdjAmtCr,x360AAcqAdjAmtCr,X_360_AACQ_ADJ_AMT_CR_LEN,true);
   }
   

   protected long checkX360AAcqAdjAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqAdjAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqAdjAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqAdjAmtCr,X_360_AACQ_ADJ_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqAdjAmtCr", beginX360AAcqAdjAmtCr,X_360_AACQ_ADJ_AMT_CR_LEN);
     }
   	}
        int localX360AAcqAdjAmtDbCounter = -1;
        public boolean isX360AAcqAdjAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqAdjAmtDbCounter != sharedCounter;
           localX360AAcqAdjAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqAdjAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqAdjAmtDb,X_360_AACQ_ADJ_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_ADJ_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AAcqAdjAmtDb
	 */
	protected void serializeX360AAcqAdjAmtDb(long x360AAcqAdjAmtDb) {
		   putDecimal(beginX360AAcqAdjAmtDb,x360AAcqAdjAmtDb,X_360_AACQ_ADJ_AMT_DB_LEN,true);
   }
   

   protected long checkX360AAcqAdjAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqAdjAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqAdjAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqAdjAmtDb,X_360_AACQ_ADJ_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqAdjAmtDb", beginX360AAcqAdjAmtDb,X_360_AACQ_ADJ_AMT_DB_LEN);
     }
   	}
        int localX360AAcqMccrAmtCrNotusedCounter = -1;
        public boolean isX360AAcqMccrAmtCrNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqMccrAmtCrNotusedCounter != sharedCounter;
           localX360AAcqMccrAmtCrNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqMccrAmtCrNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqMccrAmtCrNotused,X_360_AACQ_MCCR_AMT_CR_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_MCCR_AMT_CR_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360AAcqMccrAmtCrNotused
	 */
	protected void serializeX360AAcqMccrAmtCrNotused(long x360AAcqMccrAmtCrNotused) {
		   putDecimal(beginX360AAcqMccrAmtCrNotused,x360AAcqMccrAmtCrNotused,X_360_AACQ_MCCR_AMT_CR_NOTUSED_LEN,true);
   }
   

   protected long checkX360AAcqMccrAmtCrNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqMccrAmtCrNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqMccrAmtCrNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqMccrAmtCrNotused,X_360_AACQ_MCCR_AMT_CR_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqMccrAmtCrNotused", beginX360AAcqMccrAmtCrNotused,X_360_AACQ_MCCR_AMT_CR_NOTUSED_LEN);
     }
   	}
        int localX360AAcqMccrAmtDbNotusedCounter = -1;
        public boolean isX360AAcqMccrAmtDbNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqMccrAmtDbNotusedCounter != sharedCounter;
           localX360AAcqMccrAmtDbNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqMccrAmtDbNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqMccrAmtDbNotused,X_360_AACQ_MCCR_AMT_DB_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_MCCR_AMT_DB_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360AAcqMccrAmtDbNotused
	 */
	protected void serializeX360AAcqMccrAmtDbNotused(long x360AAcqMccrAmtDbNotused) {
		   putDecimal(beginX360AAcqMccrAmtDbNotused,x360AAcqMccrAmtDbNotused,X_360_AACQ_MCCR_AMT_DB_NOTUSED_LEN,true);
   }
   

   protected long checkX360AAcqMccrAmtDbNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqMccrAmtDbNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqMccrAmtDbNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqMccrAmtDbNotused,X_360_AACQ_MCCR_AMT_DB_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqMccrAmtDbNotused", beginX360AAcqMccrAmtDbNotused,X_360_AACQ_MCCR_AMT_DB_NOTUSED_LEN);
     }
   	}
        int localX360AAcqIccrAmtCrNotusedCounter = -1;
        public boolean isX360AAcqIccrAmtCrNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqIccrAmtCrNotusedCounter != sharedCounter;
           localX360AAcqIccrAmtCrNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqIccrAmtCrNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqIccrAmtCrNotused,X_360_AACQ_ICCR_AMT_CR_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_ICCR_AMT_CR_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360AAcqIccrAmtCrNotused
	 */
	protected void serializeX360AAcqIccrAmtCrNotused(long x360AAcqIccrAmtCrNotused) {
		   putDecimal(beginX360AAcqIccrAmtCrNotused,x360AAcqIccrAmtCrNotused,X_360_AACQ_ICCR_AMT_CR_NOTUSED_LEN,true);
   }
   

   protected long checkX360AAcqIccrAmtCrNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqIccrAmtCrNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqIccrAmtCrNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqIccrAmtCrNotused,X_360_AACQ_ICCR_AMT_CR_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqIccrAmtCrNotused", beginX360AAcqIccrAmtCrNotused,X_360_AACQ_ICCR_AMT_CR_NOTUSED_LEN);
     }
   	}
        int localX360AAcqIccrAmtDbNotusedCounter = -1;
        public boolean isX360AAcqIccrAmtDbNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqIccrAmtDbNotusedCounter != sharedCounter;
           localX360AAcqIccrAmtDbNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqIccrAmtDbNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqIccrAmtDbNotused,X_360_AACQ_ICCR_AMT_DB_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_ICCR_AMT_DB_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360AAcqIccrAmtDbNotused
	 */
	protected void serializeX360AAcqIccrAmtDbNotused(long x360AAcqIccrAmtDbNotused) {
		   putDecimal(beginX360AAcqIccrAmtDbNotused,x360AAcqIccrAmtDbNotused,X_360_AACQ_ICCR_AMT_DB_NOTUSED_LEN,true);
   }
   

   protected long checkX360AAcqIccrAmtDbNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqIccrAmtDbNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqIccrAmtDbNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqIccrAmtDbNotused,X_360_AACQ_ICCR_AMT_DB_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqIccrAmtDbNotused", beginX360AAcqIccrAmtDbNotused,X_360_AACQ_ICCR_AMT_DB_NOTUSED_LEN);
     }
   	}
        int localX360AAcqA09ApprovedCntCrCounter = -1;
        public boolean isX360AAcqA09ApprovedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09ApprovedCntCrCounter != sharedCounter;
           localX360AAcqA09ApprovedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09ApprovedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09ApprovedCntCr,X_360_AACQ_A_09_APPROVED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360AAcqA09ApprovedCntCr
	 */
	protected void serializeX360AAcqA09ApprovedCntCr(int x360AAcqA09ApprovedCntCr) {
		   putDecimal(beginX360AAcqA09ApprovedCntCr,x360AAcqA09ApprovedCntCr,X_360_AACQ_A_09_APPROVED_CNT_CR_LEN,true);
   }
   

   protected int checkX360AAcqA09ApprovedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09ApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqA09ApprovedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqA09ApprovedCntCr,X_360_AACQ_A_09_APPROVED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09ApprovedCntCr", beginX360AAcqA09ApprovedCntCr,X_360_AACQ_A_09_APPROVED_CNT_CR_LEN);
     }
   	}
        int localX360AAcqA09ApprovedCntDbCounter = -1;
        public boolean isX360AAcqA09ApprovedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09ApprovedCntDbCounter != sharedCounter;
           localX360AAcqA09ApprovedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09ApprovedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09ApprovedCntDb,X_360_AACQ_A_09_APPROVED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360AAcqA09ApprovedCntDb
	 */
	protected void serializeX360AAcqA09ApprovedCntDb(int x360AAcqA09ApprovedCntDb) {
		   putDecimal(beginX360AAcqA09ApprovedCntDb,x360AAcqA09ApprovedCntDb,X_360_AACQ_A_09_APPROVED_CNT_DB_LEN,true);
   }
   

   protected int checkX360AAcqA09ApprovedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09ApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AAcqA09ApprovedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AAcqA09ApprovedCntDb,X_360_AACQ_A_09_APPROVED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09ApprovedCntDb", beginX360AAcqA09ApprovedCntDb,X_360_AACQ_A_09_APPROVED_CNT_DB_LEN);
     }
   	}
        int localX360AAcqA09ApprovedAmtCrCounter = -1;
        public boolean isX360AAcqA09ApprovedAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09ApprovedAmtCrCounter != sharedCounter;
           localX360AAcqA09ApprovedAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09ApprovedAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09ApprovedAmtCr,X_360_AACQ_A_09_APPROVED_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_APPROVED_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AAcqA09ApprovedAmtCr
	 */
	protected void serializeX360AAcqA09ApprovedAmtCr(long x360AAcqA09ApprovedAmtCr) {
		   putDecimal(beginX360AAcqA09ApprovedAmtCr,x360AAcqA09ApprovedAmtCr,X_360_AACQ_A_09_APPROVED_AMT_CR_LEN,true);
   }
   

   protected long checkX360AAcqA09ApprovedAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09ApprovedAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqA09ApprovedAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqA09ApprovedAmtCr,X_360_AACQ_A_09_APPROVED_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09ApprovedAmtCr", beginX360AAcqA09ApprovedAmtCr,X_360_AACQ_A_09_APPROVED_AMT_CR_LEN);
     }
   	}
        int localX360AAcqA09ApprovedAmtDbCounter = -1;
        public boolean isX360AAcqA09ApprovedAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09ApprovedAmtDbCounter != sharedCounter;
           localX360AAcqA09ApprovedAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09ApprovedAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09ApprovedAmtDb,X_360_AACQ_A_09_APPROVED_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_APPROVED_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AAcqA09ApprovedAmtDb
	 */
	protected void serializeX360AAcqA09ApprovedAmtDb(long x360AAcqA09ApprovedAmtDb) {
		   putDecimal(beginX360AAcqA09ApprovedAmtDb,x360AAcqA09ApprovedAmtDb,X_360_AACQ_A_09_APPROVED_AMT_DB_LEN,true);
   }
   

   protected long checkX360AAcqA09ApprovedAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09ApprovedAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqA09ApprovedAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqA09ApprovedAmtDb,X_360_AACQ_A_09_APPROVED_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09ApprovedAmtDb", beginX360AAcqA09ApprovedAmtDb,X_360_AACQ_A_09_APPROVED_AMT_DB_LEN);
     }
   	}
        int localX360AAcqBaseSetlAmtCrCounter = -1;
        public boolean isX360AAcqBaseSetlAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqBaseSetlAmtCrCounter != sharedCounter;
           localX360AAcqBaseSetlAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqBaseSetlAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqBaseSetlAmtCr,X_360_AACQ_BASE_SETL_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_BASE_SETL_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AAcqBaseSetlAmtCr
	 */
	protected void serializeX360AAcqBaseSetlAmtCr(long x360AAcqBaseSetlAmtCr) {
		   putDecimal(beginX360AAcqBaseSetlAmtCr,x360AAcqBaseSetlAmtCr,X_360_AACQ_BASE_SETL_AMT_CR_LEN,true);
   }
   

   protected long checkX360AAcqBaseSetlAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqBaseSetlAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqBaseSetlAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqBaseSetlAmtCr,X_360_AACQ_BASE_SETL_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqBaseSetlAmtCr", beginX360AAcqBaseSetlAmtCr,X_360_AACQ_BASE_SETL_AMT_CR_LEN);
     }
   	}
        int localX360AAcqBaseSetlAmtDbCounter = -1;
        public boolean isX360AAcqBaseSetlAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqBaseSetlAmtDbCounter != sharedCounter;
           localX360AAcqBaseSetlAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqBaseSetlAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqBaseSetlAmtDb,X_360_AACQ_BASE_SETL_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_BASE_SETL_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AAcqBaseSetlAmtDb
	 */
	protected void serializeX360AAcqBaseSetlAmtDb(long x360AAcqBaseSetlAmtDb) {
		   putDecimal(beginX360AAcqBaseSetlAmtDb,x360AAcqBaseSetlAmtDb,X_360_AACQ_BASE_SETL_AMT_DB_LEN,true);
   }
   

   protected long checkX360AAcqBaseSetlAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqBaseSetlAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqBaseSetlAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqBaseSetlAmtDb,X_360_AACQ_BASE_SETL_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqBaseSetlAmtDb", beginX360AAcqBaseSetlAmtDb,X_360_AACQ_BASE_SETL_AMT_DB_LEN);
     }
   	}
        int localX360AAcqMccrA09CrNotusedCounter = -1;
        public boolean isX360AAcqMccrA09CrNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqMccrA09CrNotusedCounter != sharedCounter;
           localX360AAcqMccrA09CrNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqMccrA09CrNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqMccrA09CrNotused,X_360_AACQ_MCCR_A_09_CR_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_MCCR_A_09_CR_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360AAcqMccrA09CrNotused
	 */
	protected void serializeX360AAcqMccrA09CrNotused(long x360AAcqMccrA09CrNotused) {
		   putDecimal(beginX360AAcqMccrA09CrNotused,x360AAcqMccrA09CrNotused,X_360_AACQ_MCCR_A_09_CR_NOTUSED_LEN,true);
   }
   

   protected long checkX360AAcqMccrA09CrNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqMccrA09CrNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqMccrA09CrNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqMccrA09CrNotused,X_360_AACQ_MCCR_A_09_CR_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqMccrA09CrNotused", beginX360AAcqMccrA09CrNotused,X_360_AACQ_MCCR_A_09_CR_NOTUSED_LEN);
     }
   	}
        int localX360AAcqMccrA09DbNotusedCounter = -1;
        public boolean isX360AAcqMccrA09DbNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqMccrA09DbNotusedCounter != sharedCounter;
           localX360AAcqMccrA09DbNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqMccrA09DbNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqMccrA09DbNotused,X_360_AACQ_MCCR_A_09_DB_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_MCCR_A_09_DB_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360AAcqMccrA09DbNotused
	 */
	protected void serializeX360AAcqMccrA09DbNotused(long x360AAcqMccrA09DbNotused) {
		   putDecimal(beginX360AAcqMccrA09DbNotused,x360AAcqMccrA09DbNotused,X_360_AACQ_MCCR_A_09_DB_NOTUSED_LEN,true);
   }
   

   protected long checkX360AAcqMccrA09DbNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqMccrA09DbNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqMccrA09DbNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqMccrA09DbNotused,X_360_AACQ_MCCR_A_09_DB_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqMccrA09DbNotused", beginX360AAcqMccrA09DbNotused,X_360_AACQ_MCCR_A_09_DB_NOTUSED_LEN);
     }
   	}
        int localX360FaVatAcqNfCntCounter = -1;
        public boolean isX360FaVatAcqNfCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatAcqNfCntCounter != sharedCounter;
           localX360FaVatAcqNfCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatAcqNfCntIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatAcqNfCnt,X_360_FA_VAT_ACQ_NF_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ACQ_NF_CNT_LEN = 5;
  	/**
	 * 	serializeX360FaVatAcqNfCnt
	 */
	protected void serializeX360FaVatAcqNfCnt(int x360FaVatAcqNfCnt) {
		   putDecimal(beginX360FaVatAcqNfCnt,x360FaVatAcqNfCnt,X_360_FA_VAT_ACQ_NF_CNT_LEN,true);
   }
   

   protected int checkX360FaVatAcqNfCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatAcqNfCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FaVatAcqNfCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FaVatAcqNfCnt,X_360_FA_VAT_ACQ_NF_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatAcqNfCnt", beginX360FaVatAcqNfCnt,X_360_FA_VAT_ACQ_NF_CNT_LEN);
     }
   	}
        int localX360FaVatAcqFinAmtCounter = -1;
        public boolean isX360FaVatAcqFinAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatAcqFinAmtCounter != sharedCounter;
           localX360FaVatAcqFinAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatAcqFinAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatAcqFinAmt,X_360_FA_VAT_ACQ_FIN_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ACQ_FIN_AMT_LEN = 8;
  	/**
	 * 	serializeX360FaVatAcqFinAmt
	 */
	protected void serializeX360FaVatAcqFinAmt(long x360FaVatAcqFinAmt) {
		   putDecimal(beginX360FaVatAcqFinAmt,x360FaVatAcqFinAmt,X_360_FA_VAT_ACQ_FIN_AMT_LEN,true);
   }
   

   protected long checkX360FaVatAcqFinAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatAcqFinAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatAcqFinAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatAcqFinAmt,X_360_FA_VAT_ACQ_FIN_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatAcqFinAmt", beginX360FaVatAcqFinAmt,X_360_FA_VAT_ACQ_FIN_AMT_LEN);
     }
   	}
        int localX360FaVatAcqNfAmtCounter = -1;
        public boolean isX360FaVatAcqNfAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatAcqNfAmtCounter != sharedCounter;
           localX360FaVatAcqNfAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatAcqNfAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatAcqNfAmt,X_360_FA_VAT_ACQ_NF_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ACQ_NF_AMT_LEN = 8;
  	/**
	 * 	serializeX360FaVatAcqNfAmt
	 */
	protected void serializeX360FaVatAcqNfAmt(long x360FaVatAcqNfAmt) {
		   putDecimal(beginX360FaVatAcqNfAmt,x360FaVatAcqNfAmt,X_360_FA_VAT_ACQ_NF_AMT_LEN,true);
   }
   

   protected long checkX360FaVatAcqNfAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatAcqNfAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatAcqNfAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatAcqNfAmt,X_360_FA_VAT_ACQ_NF_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatAcqNfAmt", beginX360FaVatAcqNfAmt,X_360_FA_VAT_ACQ_NF_AMT_LEN);
     }
   	}
        int localX360FaVatAcqFinVatCounter = -1;
        public boolean isX360FaVatAcqFinVatModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatAcqFinVatCounter != sharedCounter;
           localX360FaVatAcqFinVatCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatAcqFinVatIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatAcqFinVat,X_360_FA_VAT_ACQ_FIN_VAT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ACQ_FIN_VAT_LEN = 6;
  	/**
	 * 	serializeX360FaVatAcqFinVat
	 */
	protected void serializeX360FaVatAcqFinVat(long x360FaVatAcqFinVat) {
		   putDecimal(beginX360FaVatAcqFinVat,x360FaVatAcqFinVat,X_360_FA_VAT_ACQ_FIN_VAT_LEN,true);
   }
   

   protected long checkX360FaVatAcqFinVatMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatAcqFinVat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatAcqFinVat() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatAcqFinVat,X_360_FA_VAT_ACQ_FIN_VAT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatAcqFinVat", beginX360FaVatAcqFinVat,X_360_FA_VAT_ACQ_FIN_VAT_LEN);
     }
   	}
        int localX360FaVatAcqNfVatCounter = -1;
        public boolean isX360FaVatAcqNfVatModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatAcqNfVatCounter != sharedCounter;
           localX360FaVatAcqNfVatCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatAcqNfVatIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatAcqNfVat,X_360_FA_VAT_ACQ_NF_VAT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ACQ_NF_VAT_LEN = 6;
  	/**
	 * 	serializeX360FaVatAcqNfVat
	 */
	protected void serializeX360FaVatAcqNfVat(long x360FaVatAcqNfVat) {
		   putDecimal(beginX360FaVatAcqNfVat,x360FaVatAcqNfVat,X_360_FA_VAT_ACQ_NF_VAT_LEN,true);
   }
   

   protected long checkX360FaVatAcqNfVatMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatAcqNfVat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatAcqNfVat() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatAcqNfVat,X_360_FA_VAT_ACQ_NF_VAT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatAcqNfVat", beginX360FaVatAcqNfVat,X_360_FA_VAT_ACQ_NF_VAT_LEN);
     }
   	}




}
  
