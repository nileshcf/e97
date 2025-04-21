package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360AMcsIssSetlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360AMcsIssSetlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360AMcsIssSetlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_AMCS_ISS_SETL_LENGTH = 269;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360AMcsIssApprovedCntCr;
            protected  int beginX360AMcsIssApprovedCntDb;
            protected  int beginX360AMcsIssDeniedCntCr;
            protected  int beginX360AMcsIssDeniedCntDb;
            protected  int beginX360AMcsIssAmtCr;
            protected  int beginX360AMcsIssAmtDb;
            protected  int beginX360AMcsIssCnvRteBse;
            protected  int beginX360AMcsIssCurrCde;
            protected  int beginX360AMcsIssCnvRteLoc;
            protected  int beginX360AMcsIssSetlIca;
            protected  int beginX360AIssFinIfeeCnt;
            protected  int beginX360AIssNfIfeeCnt;
            protected  int beginX360AIssPctIfeeCnt;
            protected  int beginX360AIssNobillIfeeCnt;
            protected  int beginX360AIssIfeeAmtCr;
            protected  int beginX360AIssIfeeAmtDb;
            protected  int beginX360AIssOrigAmtCr;
            protected  int beginX360AIssOrigAmtDb;
            protected  int beginX360AIssNewAmtCr;
            protected  int beginX360AIssNewAmtDb;
            protected  int beginX360AIssAdjAmtCr;
            protected  int beginX360AIssAdjAmtDb;
            protected  int beginX360AIssbMccrAmtCr;
            protected  int beginX360AIssbMccrAmtDb;
            protected  int beginX360AIssbIccrAmtCr;
            protected  int beginX360AIssbIccrAmtDb;
            protected  int beginX360AIssA09ApprovedCntCr;
            protected  int beginX360AIssA09ApprovedCntDb;
            protected  int beginX360AIssA09ApprovedAmtCr;
            protected  int beginX360AIssA09ApprovedAmtDb;
            protected  int beginX360AIssBaseSetlAmtCr;
            protected  int beginX360AIssBaseSetlAmtDb;
            protected  int beginX360AIssbMccrA09Cr;
            protected  int beginX360AIssbMccrA09Db;
            protected  int beginX360FaVatIssNfCnt;
            protected  int beginX360FaVatIssFinAmt;
            protected  int beginX360FaVatIssNfAmt;
            protected  int beginX360FaVatIssFinVat;
            protected  int beginX360FaVatIssNfVat;
	
	/**
	* Constructor for X360AMcsIssSetlSerialized
	**/
    public X360AMcsIssSetlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360AMcsIssSetlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsIssSetlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360AMcsIssSetlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,731); // serialize this field at offset 731 by default 
    }
    
	/**
	* sets parent for this X360AMcsIssSetlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 731 by default
    }    
	/**
	* initializes the field in X360AMcsIssSetlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_AMCS_ISS_SETL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360AMcsIssApprovedCntCr = getStartOffset() + 0;	// set offset for serialization
  
             beginX360AMcsIssApprovedCntDb = getStartOffset() + 5;	// set offset for serialization
  
             beginX360AMcsIssDeniedCntCr = getStartOffset() + 10;	// set offset for serialization
  
             beginX360AMcsIssDeniedCntDb = getStartOffset() + 15;	// set offset for serialization
  
             beginX360AMcsIssAmtCr = getStartOffset() + 20;	// set offset for serialization
  
             beginX360AMcsIssAmtDb = getStartOffset() + 28;	// set offset for serialization
  
             beginX360AMcsIssCnvRteBse = getStartOffset() + 36;	// set offset for serialization
  
             beginX360AMcsIssCurrCde = getStartOffset() + 44;	// set offset for serialization
  
             beginX360AMcsIssCnvRteLoc = getStartOffset() + 47;	// set offset for serialization
  
  
             beginX360AMcsIssSetlIca = getStartOffset() + 56;	// set offset for serialization
  
             beginX360AIssFinIfeeCnt = getStartOffset() + 62;	// set offset for serialization
  
             beginX360AIssNfIfeeCnt = getStartOffset() + 67;	// set offset for serialization
  
             beginX360AIssPctIfeeCnt = getStartOffset() + 72;	// set offset for serialization
  
             beginX360AIssNobillIfeeCnt = getStartOffset() + 77;	// set offset for serialization
  
             beginX360AIssIfeeAmtCr = getStartOffset() + 82;	// set offset for serialization
  
             beginX360AIssIfeeAmtDb = getStartOffset() + 90;	// set offset for serialization
  
             beginX360AIssOrigAmtCr = getStartOffset() + 98;	// set offset for serialization
  
             beginX360AIssOrigAmtDb = getStartOffset() + 106;	// set offset for serialization
  
             beginX360AIssNewAmtCr = getStartOffset() + 114;	// set offset for serialization
  
             beginX360AIssNewAmtDb = getStartOffset() + 122;	// set offset for serialization
  
             beginX360AIssAdjAmtCr = getStartOffset() + 130;	// set offset for serialization
  
             beginX360AIssAdjAmtDb = getStartOffset() + 138;	// set offset for serialization
  
             beginX360AIssbMccrAmtCr = getStartOffset() + 146;	// set offset for serialization
  
             beginX360AIssbMccrAmtDb = getStartOffset() + 154;	// set offset for serialization
  
             beginX360AIssbIccrAmtCr = getStartOffset() + 162;	// set offset for serialization
  
             beginX360AIssbIccrAmtDb = getStartOffset() + 170;	// set offset for serialization
  
             beginX360AIssA09ApprovedCntCr = getStartOffset() + 178;	// set offset for serialization
  
             beginX360AIssA09ApprovedCntDb = getStartOffset() + 183;	// set offset for serialization
  
             beginX360AIssA09ApprovedAmtCr = getStartOffset() + 188;	// set offset for serialization
  
             beginX360AIssA09ApprovedAmtDb = getStartOffset() + 196;	// set offset for serialization
  
             beginX360AIssBaseSetlAmtCr = getStartOffset() + 204;	// set offset for serialization
  
             beginX360AIssBaseSetlAmtDb = getStartOffset() + 212;	// set offset for serialization
  
             beginX360AIssbMccrA09Cr = getStartOffset() + 220;	// set offset for serialization
  
             beginX360AIssbMccrA09Db = getStartOffset() + 228;	// set offset for serialization
  
             beginX360FaVatIssNfCnt = getStartOffset() + 236;	// set offset for serialization
  
             beginX360FaVatIssFinAmt = getStartOffset() + 241;	// set offset for serialization
  
             beginX360FaVatIssNfAmt = getStartOffset() + 249;	// set offset for serialization
  
             beginX360FaVatIssFinVat = getStartOffset() + 257;	// set offset for serialization
  
             beginX360FaVatIssNfVat = getStartOffset() + 263;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360AMcsIssApprovedCntCrCounter = -1;
        public boolean isX360AMcsIssApprovedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsIssApprovedCntCrCounter != sharedCounter;
           localX360AMcsIssApprovedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsIssApprovedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsIssApprovedCntCr,X_360_AMCS_ISS_APPROVED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ISS_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360AMcsIssApprovedCntCr
	 */
	protected void serializeX360AMcsIssApprovedCntCr(int x360AMcsIssApprovedCntCr) {
		   putDecimal(beginX360AMcsIssApprovedCntCr,x360AMcsIssApprovedCntCr,X_360_AMCS_ISS_APPROVED_CNT_CR_LEN,true);
   }
   

   protected int checkX360AMcsIssApprovedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsIssApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsIssApprovedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsIssApprovedCntCr,X_360_AMCS_ISS_APPROVED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssApprovedCntCr", beginX360AMcsIssApprovedCntCr,X_360_AMCS_ISS_APPROVED_CNT_CR_LEN);
     }
   	}
        int localX360AMcsIssApprovedCntDbCounter = -1;
        public boolean isX360AMcsIssApprovedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsIssApprovedCntDbCounter != sharedCounter;
           localX360AMcsIssApprovedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsIssApprovedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsIssApprovedCntDb,X_360_AMCS_ISS_APPROVED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ISS_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360AMcsIssApprovedCntDb
	 */
	protected void serializeX360AMcsIssApprovedCntDb(int x360AMcsIssApprovedCntDb) {
		   putDecimal(beginX360AMcsIssApprovedCntDb,x360AMcsIssApprovedCntDb,X_360_AMCS_ISS_APPROVED_CNT_DB_LEN,true);
   }
   

   protected int checkX360AMcsIssApprovedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsIssApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsIssApprovedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsIssApprovedCntDb,X_360_AMCS_ISS_APPROVED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssApprovedCntDb", beginX360AMcsIssApprovedCntDb,X_360_AMCS_ISS_APPROVED_CNT_DB_LEN);
     }
   	}
        int localX360AMcsIssDeniedCntCrCounter = -1;
        public boolean isX360AMcsIssDeniedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsIssDeniedCntCrCounter != sharedCounter;
           localX360AMcsIssDeniedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsIssDeniedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsIssDeniedCntCr,X_360_AMCS_ISS_DENIED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ISS_DENIED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360AMcsIssDeniedCntCr
	 */
	protected void serializeX360AMcsIssDeniedCntCr(int x360AMcsIssDeniedCntCr) {
		   putDecimal(beginX360AMcsIssDeniedCntCr,x360AMcsIssDeniedCntCr,X_360_AMCS_ISS_DENIED_CNT_CR_LEN,true);
   }
   

   protected int checkX360AMcsIssDeniedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsIssDeniedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsIssDeniedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsIssDeniedCntCr,X_360_AMCS_ISS_DENIED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssDeniedCntCr", beginX360AMcsIssDeniedCntCr,X_360_AMCS_ISS_DENIED_CNT_CR_LEN);
     }
   	}
        int localX360AMcsIssDeniedCntDbCounter = -1;
        public boolean isX360AMcsIssDeniedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsIssDeniedCntDbCounter != sharedCounter;
           localX360AMcsIssDeniedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsIssDeniedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsIssDeniedCntDb,X_360_AMCS_ISS_DENIED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ISS_DENIED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360AMcsIssDeniedCntDb
	 */
	protected void serializeX360AMcsIssDeniedCntDb(int x360AMcsIssDeniedCntDb) {
		   putDecimal(beginX360AMcsIssDeniedCntDb,x360AMcsIssDeniedCntDb,X_360_AMCS_ISS_DENIED_CNT_DB_LEN,true);
   }
   

   protected int checkX360AMcsIssDeniedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsIssDeniedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsIssDeniedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AMcsIssDeniedCntDb,X_360_AMCS_ISS_DENIED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssDeniedCntDb", beginX360AMcsIssDeniedCntDb,X_360_AMCS_ISS_DENIED_CNT_DB_LEN);
     }
   	}
        int localX360AMcsIssAmtCrCounter = -1;
        public boolean isX360AMcsIssAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsIssAmtCrCounter != sharedCounter;
           localX360AMcsIssAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsIssAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsIssAmtCr,X_360_AMCS_ISS_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ISS_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AMcsIssAmtCr
	 */
	protected void serializeX360AMcsIssAmtCr(long x360AMcsIssAmtCr) {
		   putDecimal(beginX360AMcsIssAmtCr,x360AMcsIssAmtCr,X_360_AMCS_ISS_AMT_CR_LEN,true);
   }
   

   protected long checkX360AMcsIssAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsIssAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsIssAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsIssAmtCr,X_360_AMCS_ISS_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssAmtCr", beginX360AMcsIssAmtCr,X_360_AMCS_ISS_AMT_CR_LEN);
     }
   	}
        int localX360AMcsIssAmtDbCounter = -1;
        public boolean isX360AMcsIssAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsIssAmtDbCounter != sharedCounter;
           localX360AMcsIssAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsIssAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsIssAmtDb,X_360_AMCS_ISS_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_ISS_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AMcsIssAmtDb
	 */
	protected void serializeX360AMcsIssAmtDb(long x360AMcsIssAmtDb) {
		   putDecimal(beginX360AMcsIssAmtDb,x360AMcsIssAmtDb,X_360_AMCS_ISS_AMT_DB_LEN,true);
   }
   

   protected long checkX360AMcsIssAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsIssAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsIssAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsIssAmtDb,X_360_AMCS_ISS_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssAmtDb", beginX360AMcsIssAmtDb,X_360_AMCS_ISS_AMT_DB_LEN);
     }
   	}
     int localX360AMcsIssCnvRteBseCounter = -1;
     public boolean isX360AMcsIssCnvRteBseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsIssCnvRteBseCounter != sharedCounter;
         localX360AMcsIssCnvRteBseCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsIssCnvRteBse
	 *	@return x360AMcsIssCnvRteBse
	 */
	public char[]  getX360AMcsIssCnvRteBseString() {
	     return getCharArray(beginX360AMcsIssCnvRteBse,X_360_AMCS_ISS_CNV_RTE_BSE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsIssCnvRteBseIsNumeric() {
	    return isNumeric(beginX360AMcsIssCnvRteBse
	                    ,beginX360AMcsIssCnvRteBse + X_360_AMCS_ISS_CNV_RTE_BSE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ISS_CNV_RTE_BSE_LEN = 8;
  	/**
	 * serializeX360AMcsIssCnvRteBse
	 */
	protected void serializeX360AMcsIssCnvRteBse(long x360AMcsIssCnvRteBse) {
		 putNumber(beginX360AMcsIssCnvRteBse,x360AMcsIssCnvRteBse,X_360_AMCS_ISS_CNV_RTE_BSE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsIssCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsIssCnvRteBse
	 */
   	protected  long serializeX360AMcsIssCnvRteBse(char[] value) {
	    long  x360AMcsIssCnvRteBse;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsIssCnvRteBse = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360AMcsIssCnvRteBse
		       ,8
		      );
		 localX360AMcsIssCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsIssCnvRteBse;
    }

   protected long checkX360AMcsIssCnvRteBseMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsIssCnvRteBse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsIssCnvRteBse() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsIssCnvRteBse
			                 ,X_360_AMCS_ISS_CNV_RTE_BSE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssCnvRteBse", beginX360AMcsIssCnvRteBse,X_360_AMCS_ISS_CNV_RTE_BSE_LEN);
    }
   	}
     int localX360AMcsIssCurrCdeCounter = -1;
     public boolean isX360AMcsIssCurrCdeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsIssCurrCdeCounter != sharedCounter;
         localX360AMcsIssCurrCdeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsIssCurrCde
	 *	@return x360AMcsIssCurrCde
	 */
	public char[]  getX360AMcsIssCurrCdeString() {
	     return getCharArray(beginX360AMcsIssCurrCde,X_360_AMCS_ISS_CURR_CDE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsIssCurrCdeIsNumeric() {
	    return isNumeric(beginX360AMcsIssCurrCde
	                    ,beginX360AMcsIssCurrCde + X_360_AMCS_ISS_CURR_CDE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ISS_CURR_CDE_LEN = 3;
  	/**
	 * serializeX360AMcsIssCurrCde
	 */
	protected void serializeX360AMcsIssCurrCde(int x360AMcsIssCurrCde) {
		 putNumber(beginX360AMcsIssCurrCde,x360AMcsIssCurrCde,X_360_AMCS_ISS_CURR_CDE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsIssCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsIssCurrCde
	 */
   	protected  int serializeX360AMcsIssCurrCde(char[] value) {
	    int  x360AMcsIssCurrCde;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsIssCurrCde = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginX360AMcsIssCurrCde
		       ,3
		      );
		 localX360AMcsIssCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsIssCurrCde;
    }

   protected int checkX360AMcsIssCurrCdeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsIssCurrCde is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AMcsIssCurrCde() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360AMcsIssCurrCde
			                 ,X_360_AMCS_ISS_CURR_CDE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssCurrCde", beginX360AMcsIssCurrCde,X_360_AMCS_ISS_CURR_CDE_LEN);
    }
   	}
     int localX360AMcsIssCnvRteLocCounter = -1;
     public boolean isX360AMcsIssCnvRteLocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsIssCnvRteLocCounter != sharedCounter;
         localX360AMcsIssCnvRteLocCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsIssCnvRteLoc
	 *	@return x360AMcsIssCnvRteLoc
	 */
	public char[]  getX360AMcsIssCnvRteLocString() {
	     return getCharArray(beginX360AMcsIssCnvRteLoc,X_360_AMCS_ISS_CNV_RTE_LOC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsIssCnvRteLocIsNumeric() {
	    return isNumeric(beginX360AMcsIssCnvRteLoc
	                    ,beginX360AMcsIssCnvRteLoc + X_360_AMCS_ISS_CNV_RTE_LOC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ISS_CNV_RTE_LOC_LEN = 8;
  	/**
	 * serializeX360AMcsIssCnvRteLoc
	 */
	protected void serializeX360AMcsIssCnvRteLoc(long x360AMcsIssCnvRteLoc) {
		 putNumber(beginX360AMcsIssCnvRteLoc,x360AMcsIssCnvRteLoc,X_360_AMCS_ISS_CNV_RTE_LOC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsIssCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsIssCnvRteLoc
	 */
   	protected  long serializeX360AMcsIssCnvRteLoc(char[] value) {
	    long  x360AMcsIssCnvRteLoc;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsIssCnvRteLoc = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360AMcsIssCnvRteLoc
		       ,8
		      );
		 localX360AMcsIssCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsIssCnvRteLoc;
    }

   protected long checkX360AMcsIssCnvRteLocMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsIssCnvRteLoc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsIssCnvRteLoc() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsIssCnvRteLoc
			                 ,X_360_AMCS_ISS_CNV_RTE_LOC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssCnvRteLoc", beginX360AMcsIssCnvRteLoc,X_360_AMCS_ISS_CNV_RTE_LOC_LEN);
    }
   	}
     int localX360AMcsIssSetlIcaCounter = -1;
     public boolean isX360AMcsIssSetlIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsIssSetlIcaCounter != sharedCounter;
         localX360AMcsIssSetlIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsIssSetlIca
	 *	@return x360AMcsIssSetlIca
	 */
	public char[]  getX360AMcsIssSetlIcaString() {
	     return getCharArray(beginX360AMcsIssSetlIca,X_360_AMCS_ISS_SETL_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsIssSetlIcaIsNumeric() {
	    return isNumeric(beginX360AMcsIssSetlIca
	                    ,beginX360AMcsIssSetlIca + X_360_AMCS_ISS_SETL_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_ISS_SETL_ICA_LEN = 6;
  	/**
	 * serializeX360AMcsIssSetlIca
	 */
	protected void serializeX360AMcsIssSetlIca(long x360AMcsIssSetlIca) {
		 putNumber(beginX360AMcsIssSetlIca,x360AMcsIssSetlIca,X_360_AMCS_ISS_SETL_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsIssSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsIssSetlIca
	 */
   	protected  long serializeX360AMcsIssSetlIca(char[] value) {
	    long  x360AMcsIssSetlIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsIssSetlIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360AMcsIssSetlIca
		       ,6
		      );
		 localX360AMcsIssSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsIssSetlIca;
    }

   protected long checkX360AMcsIssSetlIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsIssSetlIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsIssSetlIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsIssSetlIca
			                 ,X_360_AMCS_ISS_SETL_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsIssSetlIca", beginX360AMcsIssSetlIca,X_360_AMCS_ISS_SETL_ICA_LEN);
    }
   	}
        int localX360AIssFinIfeeCntCounter = -1;
        public boolean isX360AIssFinIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssFinIfeeCntCounter != sharedCounter;
           localX360AIssFinIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssFinIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AIssFinIfeeCnt,X_360_AISS_FIN_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_FIN_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AIssFinIfeeCnt
	 */
	protected void serializeX360AIssFinIfeeCnt(int x360AIssFinIfeeCnt) {
		   putDecimal(beginX360AIssFinIfeeCnt,x360AIssFinIfeeCnt,X_360_AISS_FIN_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AIssFinIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssFinIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AIssFinIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AIssFinIfeeCnt,X_360_AISS_FIN_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssFinIfeeCnt", beginX360AIssFinIfeeCnt,X_360_AISS_FIN_IFEE_CNT_LEN);
     }
   	}
        int localX360AIssNfIfeeCntCounter = -1;
        public boolean isX360AIssNfIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssNfIfeeCntCounter != sharedCounter;
           localX360AIssNfIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssNfIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AIssNfIfeeCnt,X_360_AISS_NF_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_NF_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AIssNfIfeeCnt
	 */
	protected void serializeX360AIssNfIfeeCnt(int x360AIssNfIfeeCnt) {
		   putDecimal(beginX360AIssNfIfeeCnt,x360AIssNfIfeeCnt,X_360_AISS_NF_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AIssNfIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssNfIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AIssNfIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AIssNfIfeeCnt,X_360_AISS_NF_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssNfIfeeCnt", beginX360AIssNfIfeeCnt,X_360_AISS_NF_IFEE_CNT_LEN);
     }
   	}
        int localX360AIssPctIfeeCntCounter = -1;
        public boolean isX360AIssPctIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssPctIfeeCntCounter != sharedCounter;
           localX360AIssPctIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssPctIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AIssPctIfeeCnt,X_360_AISS_PCT_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_PCT_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AIssPctIfeeCnt
	 */
	protected void serializeX360AIssPctIfeeCnt(int x360AIssPctIfeeCnt) {
		   putDecimal(beginX360AIssPctIfeeCnt,x360AIssPctIfeeCnt,X_360_AISS_PCT_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AIssPctIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssPctIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AIssPctIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AIssPctIfeeCnt,X_360_AISS_PCT_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssPctIfeeCnt", beginX360AIssPctIfeeCnt,X_360_AISS_PCT_IFEE_CNT_LEN);
     }
   	}
        int localX360AIssNobillIfeeCntCounter = -1;
        public boolean isX360AIssNobillIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssNobillIfeeCntCounter != sharedCounter;
           localX360AIssNobillIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssNobillIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360AIssNobillIfeeCnt,X_360_AISS_NOBILL_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_NOBILL_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360AIssNobillIfeeCnt
	 */
	protected void serializeX360AIssNobillIfeeCnt(int x360AIssNobillIfeeCnt) {
		   putDecimal(beginX360AIssNobillIfeeCnt,x360AIssNobillIfeeCnt,X_360_AISS_NOBILL_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360AIssNobillIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssNobillIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AIssNobillIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AIssNobillIfeeCnt,X_360_AISS_NOBILL_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssNobillIfeeCnt", beginX360AIssNobillIfeeCnt,X_360_AISS_NOBILL_IFEE_CNT_LEN);
     }
   	}
        int localX360AIssIfeeAmtCrCounter = -1;
        public boolean isX360AIssIfeeAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssIfeeAmtCrCounter != sharedCounter;
           localX360AIssIfeeAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssIfeeAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssIfeeAmtCr,X_360_AISS_IFEE_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_IFEE_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssIfeeAmtCr
	 */
	protected void serializeX360AIssIfeeAmtCr(long x360AIssIfeeAmtCr) {
		   putDecimal(beginX360AIssIfeeAmtCr,x360AIssIfeeAmtCr,X_360_AISS_IFEE_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssIfeeAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssIfeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssIfeeAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssIfeeAmtCr,X_360_AISS_IFEE_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssIfeeAmtCr", beginX360AIssIfeeAmtCr,X_360_AISS_IFEE_AMT_CR_LEN);
     }
   	}
        int localX360AIssIfeeAmtDbCounter = -1;
        public boolean isX360AIssIfeeAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssIfeeAmtDbCounter != sharedCounter;
           localX360AIssIfeeAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssIfeeAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssIfeeAmtDb,X_360_AISS_IFEE_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_IFEE_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssIfeeAmtDb
	 */
	protected void serializeX360AIssIfeeAmtDb(long x360AIssIfeeAmtDb) {
		   putDecimal(beginX360AIssIfeeAmtDb,x360AIssIfeeAmtDb,X_360_AISS_IFEE_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssIfeeAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssIfeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssIfeeAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssIfeeAmtDb,X_360_AISS_IFEE_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssIfeeAmtDb", beginX360AIssIfeeAmtDb,X_360_AISS_IFEE_AMT_DB_LEN);
     }
   	}
        int localX360AIssOrigAmtCrCounter = -1;
        public boolean isX360AIssOrigAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssOrigAmtCrCounter != sharedCounter;
           localX360AIssOrigAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssOrigAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssOrigAmtCr,X_360_AISS_ORIG_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_ORIG_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssOrigAmtCr
	 */
	protected void serializeX360AIssOrigAmtCr(long x360AIssOrigAmtCr) {
		   putDecimal(beginX360AIssOrigAmtCr,x360AIssOrigAmtCr,X_360_AISS_ORIG_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssOrigAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssOrigAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssOrigAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssOrigAmtCr,X_360_AISS_ORIG_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssOrigAmtCr", beginX360AIssOrigAmtCr,X_360_AISS_ORIG_AMT_CR_LEN);
     }
   	}
        int localX360AIssOrigAmtDbCounter = -1;
        public boolean isX360AIssOrigAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssOrigAmtDbCounter != sharedCounter;
           localX360AIssOrigAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssOrigAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssOrigAmtDb,X_360_AISS_ORIG_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_ORIG_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssOrigAmtDb
	 */
	protected void serializeX360AIssOrigAmtDb(long x360AIssOrigAmtDb) {
		   putDecimal(beginX360AIssOrigAmtDb,x360AIssOrigAmtDb,X_360_AISS_ORIG_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssOrigAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssOrigAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssOrigAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssOrigAmtDb,X_360_AISS_ORIG_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssOrigAmtDb", beginX360AIssOrigAmtDb,X_360_AISS_ORIG_AMT_DB_LEN);
     }
   	}
        int localX360AIssNewAmtCrCounter = -1;
        public boolean isX360AIssNewAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssNewAmtCrCounter != sharedCounter;
           localX360AIssNewAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssNewAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssNewAmtCr,X_360_AISS_NEW_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_NEW_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssNewAmtCr
	 */
	protected void serializeX360AIssNewAmtCr(long x360AIssNewAmtCr) {
		   putDecimal(beginX360AIssNewAmtCr,x360AIssNewAmtCr,X_360_AISS_NEW_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssNewAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssNewAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssNewAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssNewAmtCr,X_360_AISS_NEW_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssNewAmtCr", beginX360AIssNewAmtCr,X_360_AISS_NEW_AMT_CR_LEN);
     }
   	}
        int localX360AIssNewAmtDbCounter = -1;
        public boolean isX360AIssNewAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssNewAmtDbCounter != sharedCounter;
           localX360AIssNewAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssNewAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssNewAmtDb,X_360_AISS_NEW_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_NEW_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssNewAmtDb
	 */
	protected void serializeX360AIssNewAmtDb(long x360AIssNewAmtDb) {
		   putDecimal(beginX360AIssNewAmtDb,x360AIssNewAmtDb,X_360_AISS_NEW_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssNewAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssNewAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssNewAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssNewAmtDb,X_360_AISS_NEW_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssNewAmtDb", beginX360AIssNewAmtDb,X_360_AISS_NEW_AMT_DB_LEN);
     }
   	}
        int localX360AIssAdjAmtCrCounter = -1;
        public boolean isX360AIssAdjAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssAdjAmtCrCounter != sharedCounter;
           localX360AIssAdjAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssAdjAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssAdjAmtCr,X_360_AISS_ADJ_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_ADJ_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssAdjAmtCr
	 */
	protected void serializeX360AIssAdjAmtCr(long x360AIssAdjAmtCr) {
		   putDecimal(beginX360AIssAdjAmtCr,x360AIssAdjAmtCr,X_360_AISS_ADJ_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssAdjAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssAdjAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssAdjAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssAdjAmtCr,X_360_AISS_ADJ_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssAdjAmtCr", beginX360AIssAdjAmtCr,X_360_AISS_ADJ_AMT_CR_LEN);
     }
   	}
        int localX360AIssAdjAmtDbCounter = -1;
        public boolean isX360AIssAdjAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssAdjAmtDbCounter != sharedCounter;
           localX360AIssAdjAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssAdjAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssAdjAmtDb,X_360_AISS_ADJ_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_ADJ_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssAdjAmtDb
	 */
	protected void serializeX360AIssAdjAmtDb(long x360AIssAdjAmtDb) {
		   putDecimal(beginX360AIssAdjAmtDb,x360AIssAdjAmtDb,X_360_AISS_ADJ_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssAdjAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssAdjAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssAdjAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssAdjAmtDb,X_360_AISS_ADJ_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssAdjAmtDb", beginX360AIssAdjAmtDb,X_360_AISS_ADJ_AMT_DB_LEN);
     }
   	}
        int localX360AIssbMccrAmtCrCounter = -1;
        public boolean isX360AIssbMccrAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssbMccrAmtCrCounter != sharedCounter;
           localX360AIssbMccrAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssbMccrAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssbMccrAmtCr,X_360_AISSB_MCCR_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISSB_MCCR_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssbMccrAmtCr
	 */
	protected void serializeX360AIssbMccrAmtCr(long x360AIssbMccrAmtCr) {
		   putDecimal(beginX360AIssbMccrAmtCr,x360AIssbMccrAmtCr,X_360_AISSB_MCCR_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssbMccrAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssbMccrAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssbMccrAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssbMccrAmtCr,X_360_AISSB_MCCR_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssbMccrAmtCr", beginX360AIssbMccrAmtCr,X_360_AISSB_MCCR_AMT_CR_LEN);
     }
   	}
        int localX360AIssbMccrAmtDbCounter = -1;
        public boolean isX360AIssbMccrAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssbMccrAmtDbCounter != sharedCounter;
           localX360AIssbMccrAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssbMccrAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssbMccrAmtDb,X_360_AISSB_MCCR_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISSB_MCCR_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssbMccrAmtDb
	 */
	protected void serializeX360AIssbMccrAmtDb(long x360AIssbMccrAmtDb) {
		   putDecimal(beginX360AIssbMccrAmtDb,x360AIssbMccrAmtDb,X_360_AISSB_MCCR_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssbMccrAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssbMccrAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssbMccrAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssbMccrAmtDb,X_360_AISSB_MCCR_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssbMccrAmtDb", beginX360AIssbMccrAmtDb,X_360_AISSB_MCCR_AMT_DB_LEN);
     }
   	}
        int localX360AIssbIccrAmtCrCounter = -1;
        public boolean isX360AIssbIccrAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssbIccrAmtCrCounter != sharedCounter;
           localX360AIssbIccrAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssbIccrAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssbIccrAmtCr,X_360_AISSB_ICCR_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISSB_ICCR_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssbIccrAmtCr
	 */
	protected void serializeX360AIssbIccrAmtCr(long x360AIssbIccrAmtCr) {
		   putDecimal(beginX360AIssbIccrAmtCr,x360AIssbIccrAmtCr,X_360_AISSB_ICCR_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssbIccrAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssbIccrAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssbIccrAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssbIccrAmtCr,X_360_AISSB_ICCR_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssbIccrAmtCr", beginX360AIssbIccrAmtCr,X_360_AISSB_ICCR_AMT_CR_LEN);
     }
   	}
        int localX360AIssbIccrAmtDbCounter = -1;
        public boolean isX360AIssbIccrAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssbIccrAmtDbCounter != sharedCounter;
           localX360AIssbIccrAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssbIccrAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssbIccrAmtDb,X_360_AISSB_ICCR_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISSB_ICCR_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssbIccrAmtDb
	 */
	protected void serializeX360AIssbIccrAmtDb(long x360AIssbIccrAmtDb) {
		   putDecimal(beginX360AIssbIccrAmtDb,x360AIssbIccrAmtDb,X_360_AISSB_ICCR_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssbIccrAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssbIccrAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssbIccrAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssbIccrAmtDb,X_360_AISSB_ICCR_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssbIccrAmtDb", beginX360AIssbIccrAmtDb,X_360_AISSB_ICCR_AMT_DB_LEN);
     }
   	}
        int localX360AIssA09ApprovedCntCrCounter = -1;
        public boolean isX360AIssA09ApprovedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssA09ApprovedCntCrCounter != sharedCounter;
           localX360AIssA09ApprovedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssA09ApprovedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssA09ApprovedCntCr,X_360_AISS_A_09_APPROVED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_A_09_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360AIssA09ApprovedCntCr
	 */
	protected void serializeX360AIssA09ApprovedCntCr(int x360AIssA09ApprovedCntCr) {
		   putDecimal(beginX360AIssA09ApprovedCntCr,x360AIssA09ApprovedCntCr,X_360_AISS_A_09_APPROVED_CNT_CR_LEN,true);
   }
   

   protected int checkX360AIssA09ApprovedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssA09ApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AIssA09ApprovedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AIssA09ApprovedCntCr,X_360_AISS_A_09_APPROVED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssA09ApprovedCntCr", beginX360AIssA09ApprovedCntCr,X_360_AISS_A_09_APPROVED_CNT_CR_LEN);
     }
   	}
        int localX360AIssA09ApprovedCntDbCounter = -1;
        public boolean isX360AIssA09ApprovedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssA09ApprovedCntDbCounter != sharedCounter;
           localX360AIssA09ApprovedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssA09ApprovedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssA09ApprovedCntDb,X_360_AISS_A_09_APPROVED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_A_09_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360AIssA09ApprovedCntDb
	 */
	protected void serializeX360AIssA09ApprovedCntDb(int x360AIssA09ApprovedCntDb) {
		   putDecimal(beginX360AIssA09ApprovedCntDb,x360AIssA09ApprovedCntDb,X_360_AISS_A_09_APPROVED_CNT_DB_LEN,true);
   }
   

   protected int checkX360AIssA09ApprovedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssA09ApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360AIssA09ApprovedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360AIssA09ApprovedCntDb,X_360_AISS_A_09_APPROVED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssA09ApprovedCntDb", beginX360AIssA09ApprovedCntDb,X_360_AISS_A_09_APPROVED_CNT_DB_LEN);
     }
   	}
        int localX360AIssA09ApprovedAmtCrCounter = -1;
        public boolean isX360AIssA09ApprovedAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssA09ApprovedAmtCrCounter != sharedCounter;
           localX360AIssA09ApprovedAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssA09ApprovedAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssA09ApprovedAmtCr,X_360_AISS_A_09_APPROVED_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_A_09_APPROVED_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssA09ApprovedAmtCr
	 */
	protected void serializeX360AIssA09ApprovedAmtCr(long x360AIssA09ApprovedAmtCr) {
		   putDecimal(beginX360AIssA09ApprovedAmtCr,x360AIssA09ApprovedAmtCr,X_360_AISS_A_09_APPROVED_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssA09ApprovedAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssA09ApprovedAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssA09ApprovedAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssA09ApprovedAmtCr,X_360_AISS_A_09_APPROVED_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssA09ApprovedAmtCr", beginX360AIssA09ApprovedAmtCr,X_360_AISS_A_09_APPROVED_AMT_CR_LEN);
     }
   	}
        int localX360AIssA09ApprovedAmtDbCounter = -1;
        public boolean isX360AIssA09ApprovedAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssA09ApprovedAmtDbCounter != sharedCounter;
           localX360AIssA09ApprovedAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssA09ApprovedAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssA09ApprovedAmtDb,X_360_AISS_A_09_APPROVED_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_A_09_APPROVED_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssA09ApprovedAmtDb
	 */
	protected void serializeX360AIssA09ApprovedAmtDb(long x360AIssA09ApprovedAmtDb) {
		   putDecimal(beginX360AIssA09ApprovedAmtDb,x360AIssA09ApprovedAmtDb,X_360_AISS_A_09_APPROVED_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssA09ApprovedAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssA09ApprovedAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssA09ApprovedAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssA09ApprovedAmtDb,X_360_AISS_A_09_APPROVED_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssA09ApprovedAmtDb", beginX360AIssA09ApprovedAmtDb,X_360_AISS_A_09_APPROVED_AMT_DB_LEN);
     }
   	}
        int localX360AIssBaseSetlAmtCrCounter = -1;
        public boolean isX360AIssBaseSetlAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssBaseSetlAmtCrCounter != sharedCounter;
           localX360AIssBaseSetlAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssBaseSetlAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssBaseSetlAmtCr,X_360_AISS_BASE_SETL_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_BASE_SETL_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssBaseSetlAmtCr
	 */
	protected void serializeX360AIssBaseSetlAmtCr(long x360AIssBaseSetlAmtCr) {
		   putDecimal(beginX360AIssBaseSetlAmtCr,x360AIssBaseSetlAmtCr,X_360_AISS_BASE_SETL_AMT_CR_LEN,true);
   }
   

   protected long checkX360AIssBaseSetlAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssBaseSetlAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssBaseSetlAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssBaseSetlAmtCr,X_360_AISS_BASE_SETL_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssBaseSetlAmtCr", beginX360AIssBaseSetlAmtCr,X_360_AISS_BASE_SETL_AMT_CR_LEN);
     }
   	}
        int localX360AIssBaseSetlAmtDbCounter = -1;
        public boolean isX360AIssBaseSetlAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssBaseSetlAmtDbCounter != sharedCounter;
           localX360AIssBaseSetlAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssBaseSetlAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssBaseSetlAmtDb,X_360_AISS_BASE_SETL_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISS_BASE_SETL_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssBaseSetlAmtDb
	 */
	protected void serializeX360AIssBaseSetlAmtDb(long x360AIssBaseSetlAmtDb) {
		   putDecimal(beginX360AIssBaseSetlAmtDb,x360AIssBaseSetlAmtDb,X_360_AISS_BASE_SETL_AMT_DB_LEN,true);
   }
   

   protected long checkX360AIssBaseSetlAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssBaseSetlAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssBaseSetlAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssBaseSetlAmtDb,X_360_AISS_BASE_SETL_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssBaseSetlAmtDb", beginX360AIssBaseSetlAmtDb,X_360_AISS_BASE_SETL_AMT_DB_LEN);
     }
   	}
        int localX360AIssbMccrA09CrCounter = -1;
        public boolean isX360AIssbMccrA09CrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssbMccrA09CrCounter != sharedCounter;
           localX360AIssbMccrA09CrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssbMccrA09CrIsNumeric() {
	      return decimalIsNumeric(beginX360AIssbMccrA09Cr,X_360_AISSB_MCCR_A_09_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISSB_MCCR_A_09_CR_LEN = 8;
  	/**
	 * 	serializeX360AIssbMccrA09Cr
	 */
	protected void serializeX360AIssbMccrA09Cr(long x360AIssbMccrA09Cr) {
		   putDecimal(beginX360AIssbMccrA09Cr,x360AIssbMccrA09Cr,X_360_AISSB_MCCR_A_09_CR_LEN,true);
   }
   

   protected long checkX360AIssbMccrA09CrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssbMccrA09Cr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssbMccrA09Cr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssbMccrA09Cr,X_360_AISSB_MCCR_A_09_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssbMccrA09Cr", beginX360AIssbMccrA09Cr,X_360_AISSB_MCCR_A_09_CR_LEN);
     }
   	}
        int localX360AIssbMccrA09DbCounter = -1;
        public boolean isX360AIssbMccrA09DbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AIssbMccrA09DbCounter != sharedCounter;
           localX360AIssbMccrA09DbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AIssbMccrA09DbIsNumeric() {
	      return decimalIsNumeric(beginX360AIssbMccrA09Db,X_360_AISSB_MCCR_A_09_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AISSB_MCCR_A_09_DB_LEN = 8;
  	/**
	 * 	serializeX360AIssbMccrA09Db
	 */
	protected void serializeX360AIssbMccrA09Db(long x360AIssbMccrA09Db) {
		   putDecimal(beginX360AIssbMccrA09Db,x360AIssbMccrA09Db,X_360_AISSB_MCCR_A_09_DB_LEN,true);
   }
   

   protected long checkX360AIssbMccrA09DbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AIssbMccrA09Db is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AIssbMccrA09Db() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AIssbMccrA09Db,X_360_AISSB_MCCR_A_09_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AIssbMccrA09Db", beginX360AIssbMccrA09Db,X_360_AISSB_MCCR_A_09_DB_LEN);
     }
   	}
        int localX360FaVatIssNfCntCounter = -1;
        public boolean isX360FaVatIssNfCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatIssNfCntCounter != sharedCounter;
           localX360FaVatIssNfCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatIssNfCntIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatIssNfCnt,X_360_FA_VAT_ISS_NF_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ISS_NF_CNT_LEN = 5;
  	/**
	 * 	serializeX360FaVatIssNfCnt
	 */
	protected void serializeX360FaVatIssNfCnt(int x360FaVatIssNfCnt) {
		   putDecimal(beginX360FaVatIssNfCnt,x360FaVatIssNfCnt,X_360_FA_VAT_ISS_NF_CNT_LEN,true);
   }
   

   protected int checkX360FaVatIssNfCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatIssNfCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FaVatIssNfCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FaVatIssNfCnt,X_360_FA_VAT_ISS_NF_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatIssNfCnt", beginX360FaVatIssNfCnt,X_360_FA_VAT_ISS_NF_CNT_LEN);
     }
   	}
        int localX360FaVatIssFinAmtCounter = -1;
        public boolean isX360FaVatIssFinAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatIssFinAmtCounter != sharedCounter;
           localX360FaVatIssFinAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatIssFinAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatIssFinAmt,X_360_FA_VAT_ISS_FIN_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ISS_FIN_AMT_LEN = 8;
  	/**
	 * 	serializeX360FaVatIssFinAmt
	 */
	protected void serializeX360FaVatIssFinAmt(long x360FaVatIssFinAmt) {
		   putDecimal(beginX360FaVatIssFinAmt,x360FaVatIssFinAmt,X_360_FA_VAT_ISS_FIN_AMT_LEN,true);
   }
   

   protected long checkX360FaVatIssFinAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatIssFinAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatIssFinAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatIssFinAmt,X_360_FA_VAT_ISS_FIN_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatIssFinAmt", beginX360FaVatIssFinAmt,X_360_FA_VAT_ISS_FIN_AMT_LEN);
     }
   	}
        int localX360FaVatIssNfAmtCounter = -1;
        public boolean isX360FaVatIssNfAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatIssNfAmtCounter != sharedCounter;
           localX360FaVatIssNfAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatIssNfAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatIssNfAmt,X_360_FA_VAT_ISS_NF_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ISS_NF_AMT_LEN = 8;
  	/**
	 * 	serializeX360FaVatIssNfAmt
	 */
	protected void serializeX360FaVatIssNfAmt(long x360FaVatIssNfAmt) {
		   putDecimal(beginX360FaVatIssNfAmt,x360FaVatIssNfAmt,X_360_FA_VAT_ISS_NF_AMT_LEN,true);
   }
   

   protected long checkX360FaVatIssNfAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatIssNfAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatIssNfAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatIssNfAmt,X_360_FA_VAT_ISS_NF_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatIssNfAmt", beginX360FaVatIssNfAmt,X_360_FA_VAT_ISS_NF_AMT_LEN);
     }
   	}
        int localX360FaVatIssFinVatCounter = -1;
        public boolean isX360FaVatIssFinVatModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatIssFinVatCounter != sharedCounter;
           localX360FaVatIssFinVatCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatIssFinVatIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatIssFinVat,X_360_FA_VAT_ISS_FIN_VAT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ISS_FIN_VAT_LEN = 6;
  	/**
	 * 	serializeX360FaVatIssFinVat
	 */
	protected void serializeX360FaVatIssFinVat(long x360FaVatIssFinVat) {
		   putDecimal(beginX360FaVatIssFinVat,x360FaVatIssFinVat,X_360_FA_VAT_ISS_FIN_VAT_LEN,true);
   }
   

   protected long checkX360FaVatIssFinVatMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatIssFinVat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatIssFinVat() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatIssFinVat,X_360_FA_VAT_ISS_FIN_VAT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatIssFinVat", beginX360FaVatIssFinVat,X_360_FA_VAT_ISS_FIN_VAT_LEN);
     }
   	}
        int localX360FaVatIssNfVatCounter = -1;
        public boolean isX360FaVatIssNfVatModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatIssNfVatCounter != sharedCounter;
           localX360FaVatIssNfVatCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatIssNfVatIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatIssNfVat,X_360_FA_VAT_ISS_NF_VAT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ISS_NF_VAT_LEN = 6;
  	/**
	 * 	serializeX360FaVatIssNfVat
	 */
	protected void serializeX360FaVatIssNfVat(long x360FaVatIssNfVat) {
		   putDecimal(beginX360FaVatIssNfVat,x360FaVatIssNfVat,X_360_FA_VAT_ISS_NF_VAT_LEN,true);
   }
   

   protected long checkX360FaVatIssNfVatMaxLimit(long number) {
        return checkMaxLimit(number , MAX_100G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatIssNfVat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FaVatIssNfVat() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FaVatIssNfVat,X_360_FA_VAT_ISS_NF_VAT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatIssNfVat", beginX360FaVatIssNfVat,X_360_FA_VAT_ISS_NF_VAT_LEN);
     }
   	}




}
  
