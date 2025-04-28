package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FMcsAcqSetlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FMcsAcqSetlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FMcsAcqSetlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FMCS_ACQ_SETL_LENGTH = 240;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FMcsAcqApprovedCntCr;
            protected  int beginX360FMcsAcqApprovedCntDb;
            protected  int beginX360FMcsAcqDeniedCntCr;
            protected  int beginX360FMcsAcqDeniedCntDb;
            protected  int beginX360FMcsAcqAmtCr;
            protected  int beginX360FMcsAcqAmtDb;
            protected  int beginX360FMcsAcqCnvRteBse;
            protected  int beginX360FMcsAcqCurrCde;
            protected  int beginX360FMcsAcqCnvRteLoc;
            protected  int beginX360FMcsAcqSetlIca;
            protected  int beginX360FAcqFinIfeeCnt;
            protected  int beginX360FAcqNfIfeeCnt;
            protected  int beginX360FAcqPctIfeeCnt;
            protected  int beginX360FAcqNobillIfeeCnt;
            protected  int beginX360FAcqIfeeAmtCr;
            protected  int beginX360FAcqIfeeAmtDb;
            protected  int beginX360FAcqCmpAmtCr;
            protected  int beginX360FAcqCmpAmtDb;
            protected  int beginX360FAcqMccrAmtCrNotused;
            protected  int beginX360FAcqMccrAmtDbNotused;
            protected  int beginX360FAcqIccrAmtCrNotused;
            protected  int beginX360FAcqIccrAmtDbNotused;
            protected  int beginX360FAcqSurchrgCntCr;
            protected  int beginX360FAcqSurchrgCntDb;
            protected  int beginX360FAcqSurchrgAmtCr;
            protected  int beginX360FAcqSurchrgAmtDb;
            protected  int beginX360FBseAcqStlAmtCr;
            protected  int beginX360FBseAcqStlAmtDb;
            protected  int beginX360FEccfCntDbFil;
            protected  int beginX360FEccfAmtDbFil;
            protected  int beginX360FEccfCntCrFil;
            protected  int beginX360FEccfAmtCrFil;
            protected  int beginX360FaVatAcqFinCnt;
	
	/**
	* Constructor for X360FMcsAcqSetlSerialized
	**/
    public X360FMcsAcqSetlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FMcsAcqSetlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FMcsAcqSetlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FMcsAcqSetlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,343); // serialize this field at offset 343 by default 
    }
    
	/**
	* sets parent for this X360FMcsAcqSetlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 343 by default
    }    
	/**
	* initializes the field in X360FMcsAcqSetlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FMCS_ACQ_SETL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FMcsAcqApprovedCntCr = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FMcsAcqApprovedCntDb = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FMcsAcqDeniedCntCr = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FMcsAcqDeniedCntDb = getStartOffset() + 15;	// set offset for serialization
  
             beginX360FMcsAcqAmtCr = getStartOffset() + 20;	// set offset for serialization
  
             beginX360FMcsAcqAmtDb = getStartOffset() + 28;	// set offset for serialization
  
             beginX360FMcsAcqCnvRteBse = getStartOffset() + 36;	// set offset for serialization
  
             beginX360FMcsAcqCurrCde = getStartOffset() + 44;	// set offset for serialization
  
             beginX360FMcsAcqCnvRteLoc = getStartOffset() + 47;	// set offset for serialization
  
  
             beginX360FMcsAcqSetlIca = getStartOffset() + 56;	// set offset for serialization
  
             beginX360FAcqFinIfeeCnt = getStartOffset() + 62;	// set offset for serialization
  
             beginX360FAcqNfIfeeCnt = getStartOffset() + 67;	// set offset for serialization
  
             beginX360FAcqPctIfeeCnt = getStartOffset() + 72;	// set offset for serialization
  
             beginX360FAcqNobillIfeeCnt = getStartOffset() + 77;	// set offset for serialization
  
             beginX360FAcqIfeeAmtCr = getStartOffset() + 82;	// set offset for serialization
  
             beginX360FAcqIfeeAmtDb = getStartOffset() + 90;	// set offset for serialization
  
             beginX360FAcqCmpAmtCr = getStartOffset() + 98;	// set offset for serialization
  
             beginX360FAcqCmpAmtDb = getStartOffset() + 106;	// set offset for serialization
  
             beginX360FAcqMccrAmtCrNotused = getStartOffset() + 114;	// set offset for serialization
  
             beginX360FAcqMccrAmtDbNotused = getStartOffset() + 122;	// set offset for serialization
  
             beginX360FAcqIccrAmtCrNotused = getStartOffset() + 130;	// set offset for serialization
  
             beginX360FAcqIccrAmtDbNotused = getStartOffset() + 138;	// set offset for serialization
  
             beginX360FAcqSurchrgCntCr = getStartOffset() + 146;	// set offset for serialization
  
             beginX360FAcqSurchrgCntDb = getStartOffset() + 151;	// set offset for serialization
  
             beginX360FAcqSurchrgAmtCr = getStartOffset() + 156;	// set offset for serialization
  
             beginX360FAcqSurchrgAmtDb = getStartOffset() + 164;	// set offset for serialization
  
             beginX360FBseAcqStlAmtCr = getStartOffset() + 172;	// set offset for serialization
  
             beginX360FBseAcqStlAmtDb = getStartOffset() + 180;	// set offset for serialization
  
  
  
             beginX360FEccfCntDbFil = getStartOffset() + 200;	// set offset for serialization
  
             beginX360FEccfAmtDbFil = getStartOffset() + 206;	// set offset for serialization
  
             beginX360FEccfCntCrFil = getStartOffset() + 217;	// set offset for serialization
  
             beginX360FEccfAmtCrFil = getStartOffset() + 223;	// set offset for serialization
  
             beginX360FaVatAcqFinCnt = getStartOffset() + 234;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localX360FMcsAcqApprovedCntCrCounter = -1;
        public boolean isX360FMcsAcqApprovedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsAcqApprovedCntCrCounter != sharedCounter;
           localX360FMcsAcqApprovedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsAcqApprovedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsAcqApprovedCntCr,X_360_FMCS_ACQ_APPROVED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ACQ_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360FMcsAcqApprovedCntCr
	 */
	protected void serializeX360FMcsAcqApprovedCntCr(int x360FMcsAcqApprovedCntCr) {
		   putDecimal(beginX360FMcsAcqApprovedCntCr,x360FMcsAcqApprovedCntCr,X_360_FMCS_ACQ_APPROVED_CNT_CR_LEN,true);
   }
   

   protected int checkX360FMcsAcqApprovedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsAcqApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsAcqApprovedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsAcqApprovedCntCr,X_360_FMCS_ACQ_APPROVED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqApprovedCntCr", beginX360FMcsAcqApprovedCntCr,X_360_FMCS_ACQ_APPROVED_CNT_CR_LEN);
     }
   	}
        int localX360FMcsAcqApprovedCntDbCounter = -1;
        public boolean isX360FMcsAcqApprovedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsAcqApprovedCntDbCounter != sharedCounter;
           localX360FMcsAcqApprovedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsAcqApprovedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsAcqApprovedCntDb,X_360_FMCS_ACQ_APPROVED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ACQ_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360FMcsAcqApprovedCntDb
	 */
	protected void serializeX360FMcsAcqApprovedCntDb(int x360FMcsAcqApprovedCntDb) {
		   putDecimal(beginX360FMcsAcqApprovedCntDb,x360FMcsAcqApprovedCntDb,X_360_FMCS_ACQ_APPROVED_CNT_DB_LEN,true);
   }
   

   protected int checkX360FMcsAcqApprovedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsAcqApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsAcqApprovedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsAcqApprovedCntDb,X_360_FMCS_ACQ_APPROVED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqApprovedCntDb", beginX360FMcsAcqApprovedCntDb,X_360_FMCS_ACQ_APPROVED_CNT_DB_LEN);
     }
   	}
        int localX360FMcsAcqDeniedCntCrCounter = -1;
        public boolean isX360FMcsAcqDeniedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsAcqDeniedCntCrCounter != sharedCounter;
           localX360FMcsAcqDeniedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsAcqDeniedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsAcqDeniedCntCr,X_360_FMCS_ACQ_DENIED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ACQ_DENIED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360FMcsAcqDeniedCntCr
	 */
	protected void serializeX360FMcsAcqDeniedCntCr(int x360FMcsAcqDeniedCntCr) {
		   putDecimal(beginX360FMcsAcqDeniedCntCr,x360FMcsAcqDeniedCntCr,X_360_FMCS_ACQ_DENIED_CNT_CR_LEN,true);
   }
   

   protected int checkX360FMcsAcqDeniedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsAcqDeniedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsAcqDeniedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsAcqDeniedCntCr,X_360_FMCS_ACQ_DENIED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqDeniedCntCr", beginX360FMcsAcqDeniedCntCr,X_360_FMCS_ACQ_DENIED_CNT_CR_LEN);
     }
   	}
        int localX360FMcsAcqDeniedCntDbCounter = -1;
        public boolean isX360FMcsAcqDeniedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsAcqDeniedCntDbCounter != sharedCounter;
           localX360FMcsAcqDeniedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsAcqDeniedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsAcqDeniedCntDb,X_360_FMCS_ACQ_DENIED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ACQ_DENIED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360FMcsAcqDeniedCntDb
	 */
	protected void serializeX360FMcsAcqDeniedCntDb(int x360FMcsAcqDeniedCntDb) {
		   putDecimal(beginX360FMcsAcqDeniedCntDb,x360FMcsAcqDeniedCntDb,X_360_FMCS_ACQ_DENIED_CNT_DB_LEN,true);
   }
   

   protected int checkX360FMcsAcqDeniedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsAcqDeniedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsAcqDeniedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsAcqDeniedCntDb,X_360_FMCS_ACQ_DENIED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqDeniedCntDb", beginX360FMcsAcqDeniedCntDb,X_360_FMCS_ACQ_DENIED_CNT_DB_LEN);
     }
   	}
        int localX360FMcsAcqAmtCrCounter = -1;
        public boolean isX360FMcsAcqAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsAcqAmtCrCounter != sharedCounter;
           localX360FMcsAcqAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsAcqAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsAcqAmtCr,X_360_FMCS_ACQ_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ACQ_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FMcsAcqAmtCr
	 */
	protected void serializeX360FMcsAcqAmtCr(long x360FMcsAcqAmtCr) {
		   putDecimal(beginX360FMcsAcqAmtCr,x360FMcsAcqAmtCr,X_360_FMCS_ACQ_AMT_CR_LEN,true);
   }
   

   protected long checkX360FMcsAcqAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsAcqAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsAcqAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsAcqAmtCr,X_360_FMCS_ACQ_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqAmtCr", beginX360FMcsAcqAmtCr,X_360_FMCS_ACQ_AMT_CR_LEN);
     }
   	}
        int localX360FMcsAcqAmtDbCounter = -1;
        public boolean isX360FMcsAcqAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsAcqAmtDbCounter != sharedCounter;
           localX360FMcsAcqAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsAcqAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsAcqAmtDb,X_360_FMCS_ACQ_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ACQ_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FMcsAcqAmtDb
	 */
	protected void serializeX360FMcsAcqAmtDb(long x360FMcsAcqAmtDb) {
		   putDecimal(beginX360FMcsAcqAmtDb,x360FMcsAcqAmtDb,X_360_FMCS_ACQ_AMT_DB_LEN,true);
   }
   

   protected long checkX360FMcsAcqAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsAcqAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsAcqAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsAcqAmtDb,X_360_FMCS_ACQ_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqAmtDb", beginX360FMcsAcqAmtDb,X_360_FMCS_ACQ_AMT_DB_LEN);
     }
   	}
     int localX360FMcsAcqCnvRteBseCounter = -1;
     public boolean isX360FMcsAcqCnvRteBseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsAcqCnvRteBseCounter != sharedCounter;
         localX360FMcsAcqCnvRteBseCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsAcqCnvRteBse
	 *	@return x360FMcsAcqCnvRteBse
	 */
	public char[]  getX360FMcsAcqCnvRteBseString() {
	     return getCharArray(beginX360FMcsAcqCnvRteBse,X_360_FMCS_ACQ_CNV_RTE_BSE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsAcqCnvRteBseIsNumeric() {
	    return isNumeric(beginX360FMcsAcqCnvRteBse
	                    ,beginX360FMcsAcqCnvRteBse + X_360_FMCS_ACQ_CNV_RTE_BSE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ACQ_CNV_RTE_BSE_LEN = 8;
  	/**
	 * serializeX360FMcsAcqCnvRteBse
	 */
	protected void serializeX360FMcsAcqCnvRteBse(long x360FMcsAcqCnvRteBse) {
		 putNumber(beginX360FMcsAcqCnvRteBse,x360FMcsAcqCnvRteBse,X_360_FMCS_ACQ_CNV_RTE_BSE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsAcqCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsAcqCnvRteBse
	 */
   	protected  long serializeX360FMcsAcqCnvRteBse(char[] value) {
	    long  x360FMcsAcqCnvRteBse;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsAcqCnvRteBse = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360FMcsAcqCnvRteBse
		       ,8
		      );
		 localX360FMcsAcqCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsAcqCnvRteBse;
    }

   protected long checkX360FMcsAcqCnvRteBseMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsAcqCnvRteBse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsAcqCnvRteBse() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsAcqCnvRteBse
			                 ,X_360_FMCS_ACQ_CNV_RTE_BSE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqCnvRteBse", beginX360FMcsAcqCnvRteBse,X_360_FMCS_ACQ_CNV_RTE_BSE_LEN);
    }
   	}
     int localX360FMcsAcqCurrCdeCounter = -1;
     public boolean isX360FMcsAcqCurrCdeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsAcqCurrCdeCounter != sharedCounter;
         localX360FMcsAcqCurrCdeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsAcqCurrCde
	 *	@return x360FMcsAcqCurrCde
	 */
	public char[]  getX360FMcsAcqCurrCdeString() {
	     return getCharArray(beginX360FMcsAcqCurrCde,X_360_FMCS_ACQ_CURR_CDE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsAcqCurrCdeIsNumeric() {
	    return isNumeric(beginX360FMcsAcqCurrCde
	                    ,beginX360FMcsAcqCurrCde + X_360_FMCS_ACQ_CURR_CDE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ACQ_CURR_CDE_LEN = 3;
  	/**
	 * serializeX360FMcsAcqCurrCde
	 */
	protected void serializeX360FMcsAcqCurrCde(int x360FMcsAcqCurrCde) {
		 putNumber(beginX360FMcsAcqCurrCde,x360FMcsAcqCurrCde,X_360_FMCS_ACQ_CURR_CDE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsAcqCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsAcqCurrCde
	 */
   	protected  int serializeX360FMcsAcqCurrCde(char[] value) {
	    int  x360FMcsAcqCurrCde;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsAcqCurrCde = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginX360FMcsAcqCurrCde
		       ,3
		      );
		 localX360FMcsAcqCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsAcqCurrCde;
    }

   protected int checkX360FMcsAcqCurrCdeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsAcqCurrCde is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsAcqCurrCde() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FMcsAcqCurrCde
			                 ,X_360_FMCS_ACQ_CURR_CDE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqCurrCde", beginX360FMcsAcqCurrCde,X_360_FMCS_ACQ_CURR_CDE_LEN);
    }
   	}
     int localX360FMcsAcqCnvRteLocCounter = -1;
     public boolean isX360FMcsAcqCnvRteLocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsAcqCnvRteLocCounter != sharedCounter;
         localX360FMcsAcqCnvRteLocCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsAcqCnvRteLoc
	 *	@return x360FMcsAcqCnvRteLoc
	 */
	public char[]  getX360FMcsAcqCnvRteLocString() {
	     return getCharArray(beginX360FMcsAcqCnvRteLoc,X_360_FMCS_ACQ_CNV_RTE_LOC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsAcqCnvRteLocIsNumeric() {
	    return isNumeric(beginX360FMcsAcqCnvRteLoc
	                    ,beginX360FMcsAcqCnvRteLoc + X_360_FMCS_ACQ_CNV_RTE_LOC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ACQ_CNV_RTE_LOC_LEN = 8;
  	/**
	 * serializeX360FMcsAcqCnvRteLoc
	 */
	protected void serializeX360FMcsAcqCnvRteLoc(long x360FMcsAcqCnvRteLoc) {
		 putNumber(beginX360FMcsAcqCnvRteLoc,x360FMcsAcqCnvRteLoc,X_360_FMCS_ACQ_CNV_RTE_LOC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsAcqCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsAcqCnvRteLoc
	 */
   	protected  long serializeX360FMcsAcqCnvRteLoc(char[] value) {
	    long  x360FMcsAcqCnvRteLoc;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsAcqCnvRteLoc = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360FMcsAcqCnvRteLoc
		       ,8
		      );
		 localX360FMcsAcqCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsAcqCnvRteLoc;
    }

   protected long checkX360FMcsAcqCnvRteLocMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsAcqCnvRteLoc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsAcqCnvRteLoc() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsAcqCnvRteLoc
			                 ,X_360_FMCS_ACQ_CNV_RTE_LOC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqCnvRteLoc", beginX360FMcsAcqCnvRteLoc,X_360_FMCS_ACQ_CNV_RTE_LOC_LEN);
    }
   	}
     int localX360FMcsAcqSetlIcaCounter = -1;
     public boolean isX360FMcsAcqSetlIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsAcqSetlIcaCounter != sharedCounter;
         localX360FMcsAcqSetlIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsAcqSetlIca
	 *	@return x360FMcsAcqSetlIca
	 */
	public char[]  getX360FMcsAcqSetlIcaString() {
	     return getCharArray(beginX360FMcsAcqSetlIca,X_360_FMCS_ACQ_SETL_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsAcqSetlIcaIsNumeric() {
	    return isNumeric(beginX360FMcsAcqSetlIca
	                    ,beginX360FMcsAcqSetlIca + X_360_FMCS_ACQ_SETL_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ACQ_SETL_ICA_LEN = 6;
  	/**
	 * serializeX360FMcsAcqSetlIca
	 */
	protected void serializeX360FMcsAcqSetlIca(long x360FMcsAcqSetlIca) {
		 putNumber(beginX360FMcsAcqSetlIca,x360FMcsAcqSetlIca,X_360_FMCS_ACQ_SETL_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsAcqSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsAcqSetlIca
	 */
   	protected  long serializeX360FMcsAcqSetlIca(char[] value) {
	    long  x360FMcsAcqSetlIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsAcqSetlIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360FMcsAcqSetlIca
		       ,6
		      );
		 localX360FMcsAcqSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsAcqSetlIca;
    }

   protected long checkX360FMcsAcqSetlIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsAcqSetlIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsAcqSetlIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsAcqSetlIca
			                 ,X_360_FMCS_ACQ_SETL_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsAcqSetlIca", beginX360FMcsAcqSetlIca,X_360_FMCS_ACQ_SETL_ICA_LEN);
    }
   	}
        int localX360FAcqFinIfeeCntCounter = -1;
        public boolean isX360FAcqFinIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqFinIfeeCntCounter != sharedCounter;
           localX360FAcqFinIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqFinIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqFinIfeeCnt,X_360_FACQ_FIN_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_FIN_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FAcqFinIfeeCnt
	 */
	protected void serializeX360FAcqFinIfeeCnt(int x360FAcqFinIfeeCnt) {
		   putDecimal(beginX360FAcqFinIfeeCnt,x360FAcqFinIfeeCnt,X_360_FACQ_FIN_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FAcqFinIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqFinIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqFinIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqFinIfeeCnt,X_360_FACQ_FIN_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqFinIfeeCnt", beginX360FAcqFinIfeeCnt,X_360_FACQ_FIN_IFEE_CNT_LEN);
     }
   	}
        int localX360FAcqNfIfeeCntCounter = -1;
        public boolean isX360FAcqNfIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqNfIfeeCntCounter != sharedCounter;
           localX360FAcqNfIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqNfIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqNfIfeeCnt,X_360_FACQ_NF_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_NF_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FAcqNfIfeeCnt
	 */
	protected void serializeX360FAcqNfIfeeCnt(int x360FAcqNfIfeeCnt) {
		   putDecimal(beginX360FAcqNfIfeeCnt,x360FAcqNfIfeeCnt,X_360_FACQ_NF_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FAcqNfIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqNfIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqNfIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqNfIfeeCnt,X_360_FACQ_NF_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqNfIfeeCnt", beginX360FAcqNfIfeeCnt,X_360_FACQ_NF_IFEE_CNT_LEN);
     }
   	}
        int localX360FAcqPctIfeeCntCounter = -1;
        public boolean isX360FAcqPctIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqPctIfeeCntCounter != sharedCounter;
           localX360FAcqPctIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqPctIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqPctIfeeCnt,X_360_FACQ_PCT_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_PCT_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FAcqPctIfeeCnt
	 */
	protected void serializeX360FAcqPctIfeeCnt(int x360FAcqPctIfeeCnt) {
		   putDecimal(beginX360FAcqPctIfeeCnt,x360FAcqPctIfeeCnt,X_360_FACQ_PCT_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FAcqPctIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqPctIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqPctIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqPctIfeeCnt,X_360_FACQ_PCT_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqPctIfeeCnt", beginX360FAcqPctIfeeCnt,X_360_FACQ_PCT_IFEE_CNT_LEN);
     }
   	}
        int localX360FAcqNobillIfeeCntCounter = -1;
        public boolean isX360FAcqNobillIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqNobillIfeeCntCounter != sharedCounter;
           localX360FAcqNobillIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqNobillIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqNobillIfeeCnt,X_360_FACQ_NOBILL_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_NOBILL_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FAcqNobillIfeeCnt
	 */
	protected void serializeX360FAcqNobillIfeeCnt(int x360FAcqNobillIfeeCnt) {
		   putDecimal(beginX360FAcqNobillIfeeCnt,x360FAcqNobillIfeeCnt,X_360_FACQ_NOBILL_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FAcqNobillIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqNobillIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqNobillIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqNobillIfeeCnt,X_360_FACQ_NOBILL_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqNobillIfeeCnt", beginX360FAcqNobillIfeeCnt,X_360_FACQ_NOBILL_IFEE_CNT_LEN);
     }
   	}
        int localX360FAcqIfeeAmtCrCounter = -1;
        public boolean isX360FAcqIfeeAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqIfeeAmtCrCounter != sharedCounter;
           localX360FAcqIfeeAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqIfeeAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqIfeeAmtCr,X_360_FACQ_IFEE_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_IFEE_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FAcqIfeeAmtCr
	 */
	protected void serializeX360FAcqIfeeAmtCr(long x360FAcqIfeeAmtCr) {
		   putDecimal(beginX360FAcqIfeeAmtCr,x360FAcqIfeeAmtCr,X_360_FACQ_IFEE_AMT_CR_LEN,true);
   }
   

   protected long checkX360FAcqIfeeAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqIfeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqIfeeAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqIfeeAmtCr,X_360_FACQ_IFEE_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqIfeeAmtCr", beginX360FAcqIfeeAmtCr,X_360_FACQ_IFEE_AMT_CR_LEN);
     }
   	}
        int localX360FAcqIfeeAmtDbCounter = -1;
        public boolean isX360FAcqIfeeAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqIfeeAmtDbCounter != sharedCounter;
           localX360FAcqIfeeAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqIfeeAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqIfeeAmtDb,X_360_FACQ_IFEE_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_IFEE_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FAcqIfeeAmtDb
	 */
	protected void serializeX360FAcqIfeeAmtDb(long x360FAcqIfeeAmtDb) {
		   putDecimal(beginX360FAcqIfeeAmtDb,x360FAcqIfeeAmtDb,X_360_FACQ_IFEE_AMT_DB_LEN,true);
   }
   

   protected long checkX360FAcqIfeeAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqIfeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqIfeeAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqIfeeAmtDb,X_360_FACQ_IFEE_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqIfeeAmtDb", beginX360FAcqIfeeAmtDb,X_360_FACQ_IFEE_AMT_DB_LEN);
     }
   	}
        int localX360FAcqCmpAmtCrCounter = -1;
        public boolean isX360FAcqCmpAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqCmpAmtCrCounter != sharedCounter;
           localX360FAcqCmpAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqCmpAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqCmpAmtCr,X_360_FACQ_CMP_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_CMP_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FAcqCmpAmtCr
	 */
	protected void serializeX360FAcqCmpAmtCr(long x360FAcqCmpAmtCr) {
		   putDecimal(beginX360FAcqCmpAmtCr,x360FAcqCmpAmtCr,X_360_FACQ_CMP_AMT_CR_LEN,true);
   }
   

   protected long checkX360FAcqCmpAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqCmpAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqCmpAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqCmpAmtCr,X_360_FACQ_CMP_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqCmpAmtCr", beginX360FAcqCmpAmtCr,X_360_FACQ_CMP_AMT_CR_LEN);
     }
   	}
        int localX360FAcqCmpAmtDbCounter = -1;
        public boolean isX360FAcqCmpAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqCmpAmtDbCounter != sharedCounter;
           localX360FAcqCmpAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqCmpAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqCmpAmtDb,X_360_FACQ_CMP_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_CMP_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FAcqCmpAmtDb
	 */
	protected void serializeX360FAcqCmpAmtDb(long x360FAcqCmpAmtDb) {
		   putDecimal(beginX360FAcqCmpAmtDb,x360FAcqCmpAmtDb,X_360_FACQ_CMP_AMT_DB_LEN,true);
   }
   

   protected long checkX360FAcqCmpAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqCmpAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqCmpAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqCmpAmtDb,X_360_FACQ_CMP_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqCmpAmtDb", beginX360FAcqCmpAmtDb,X_360_FACQ_CMP_AMT_DB_LEN);
     }
   	}
        int localX360FAcqMccrAmtCrNotusedCounter = -1;
        public boolean isX360FAcqMccrAmtCrNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqMccrAmtCrNotusedCounter != sharedCounter;
           localX360FAcqMccrAmtCrNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqMccrAmtCrNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqMccrAmtCrNotused,X_360_FACQ_MCCR_AMT_CR_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_MCCR_AMT_CR_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360FAcqMccrAmtCrNotused
	 */
	protected void serializeX360FAcqMccrAmtCrNotused(long x360FAcqMccrAmtCrNotused) {
		   putDecimal(beginX360FAcqMccrAmtCrNotused,x360FAcqMccrAmtCrNotused,X_360_FACQ_MCCR_AMT_CR_NOTUSED_LEN,true);
   }
   

   protected long checkX360FAcqMccrAmtCrNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqMccrAmtCrNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqMccrAmtCrNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqMccrAmtCrNotused,X_360_FACQ_MCCR_AMT_CR_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqMccrAmtCrNotused", beginX360FAcqMccrAmtCrNotused,X_360_FACQ_MCCR_AMT_CR_NOTUSED_LEN);
     }
   	}
        int localX360FAcqMccrAmtDbNotusedCounter = -1;
        public boolean isX360FAcqMccrAmtDbNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqMccrAmtDbNotusedCounter != sharedCounter;
           localX360FAcqMccrAmtDbNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqMccrAmtDbNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqMccrAmtDbNotused,X_360_FACQ_MCCR_AMT_DB_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_MCCR_AMT_DB_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360FAcqMccrAmtDbNotused
	 */
	protected void serializeX360FAcqMccrAmtDbNotused(long x360FAcqMccrAmtDbNotused) {
		   putDecimal(beginX360FAcqMccrAmtDbNotused,x360FAcqMccrAmtDbNotused,X_360_FACQ_MCCR_AMT_DB_NOTUSED_LEN,true);
   }
   

   protected long checkX360FAcqMccrAmtDbNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqMccrAmtDbNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqMccrAmtDbNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqMccrAmtDbNotused,X_360_FACQ_MCCR_AMT_DB_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqMccrAmtDbNotused", beginX360FAcqMccrAmtDbNotused,X_360_FACQ_MCCR_AMT_DB_NOTUSED_LEN);
     }
   	}
        int localX360FAcqIccrAmtCrNotusedCounter = -1;
        public boolean isX360FAcqIccrAmtCrNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqIccrAmtCrNotusedCounter != sharedCounter;
           localX360FAcqIccrAmtCrNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqIccrAmtCrNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqIccrAmtCrNotused,X_360_FACQ_ICCR_AMT_CR_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_ICCR_AMT_CR_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360FAcqIccrAmtCrNotused
	 */
	protected void serializeX360FAcqIccrAmtCrNotused(long x360FAcqIccrAmtCrNotused) {
		   putDecimal(beginX360FAcqIccrAmtCrNotused,x360FAcqIccrAmtCrNotused,X_360_FACQ_ICCR_AMT_CR_NOTUSED_LEN,true);
   }
   

   protected long checkX360FAcqIccrAmtCrNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqIccrAmtCrNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqIccrAmtCrNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqIccrAmtCrNotused,X_360_FACQ_ICCR_AMT_CR_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqIccrAmtCrNotused", beginX360FAcqIccrAmtCrNotused,X_360_FACQ_ICCR_AMT_CR_NOTUSED_LEN);
     }
   	}
        int localX360FAcqIccrAmtDbNotusedCounter = -1;
        public boolean isX360FAcqIccrAmtDbNotusedModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqIccrAmtDbNotusedCounter != sharedCounter;
           localX360FAcqIccrAmtDbNotusedCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqIccrAmtDbNotusedIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqIccrAmtDbNotused,X_360_FACQ_ICCR_AMT_DB_NOTUSED_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_ICCR_AMT_DB_NOTUSED_LEN = 8;
  	/**
	 * 	serializeX360FAcqIccrAmtDbNotused
	 */
	protected void serializeX360FAcqIccrAmtDbNotused(long x360FAcqIccrAmtDbNotused) {
		   putDecimal(beginX360FAcqIccrAmtDbNotused,x360FAcqIccrAmtDbNotused,X_360_FACQ_ICCR_AMT_DB_NOTUSED_LEN,true);
   }
   

   protected long checkX360FAcqIccrAmtDbNotusedMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqIccrAmtDbNotused is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqIccrAmtDbNotused() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqIccrAmtDbNotused,X_360_FACQ_ICCR_AMT_DB_NOTUSED_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqIccrAmtDbNotused", beginX360FAcqIccrAmtDbNotused,X_360_FACQ_ICCR_AMT_DB_NOTUSED_LEN);
     }
   	}
        int localX360FAcqSurchrgCntCrCounter = -1;
        public boolean isX360FAcqSurchrgCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgCntCrCounter != sharedCounter;
           localX360FAcqSurchrgCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgCntCr,X_360_FACQ_SURCHRG_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgCntCr
	 */
	protected void serializeX360FAcqSurchrgCntCr(int x360FAcqSurchrgCntCr) {
		   putDecimal(beginX360FAcqSurchrgCntCr,x360FAcqSurchrgCntCr,X_360_FACQ_SURCHRG_CNT_CR_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgCntCr,X_360_FACQ_SURCHRG_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgCntCr", beginX360FAcqSurchrgCntCr,X_360_FACQ_SURCHRG_CNT_CR_LEN);
     }
   	}
        int localX360FAcqSurchrgCntDbCounter = -1;
        public boolean isX360FAcqSurchrgCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgCntDbCounter != sharedCounter;
           localX360FAcqSurchrgCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgCntDb,X_360_FACQ_SURCHRG_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgCntDb
	 */
	protected void serializeX360FAcqSurchrgCntDb(int x360FAcqSurchrgCntDb) {
		   putDecimal(beginX360FAcqSurchrgCntDb,x360FAcqSurchrgCntDb,X_360_FACQ_SURCHRG_CNT_DB_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgCntDb,X_360_FACQ_SURCHRG_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgCntDb", beginX360FAcqSurchrgCntDb,X_360_FACQ_SURCHRG_CNT_DB_LEN);
     }
   	}
        int localX360FAcqSurchrgAmtCrCounter = -1;
        public boolean isX360FAcqSurchrgAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgAmtCrCounter != sharedCounter;
           localX360FAcqSurchrgAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgAmtCr,X_360_FACQ_SURCHRG_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgAmtCrString() {
            return getPackedString(beginX360FAcqSurchrgAmtCr,X_360_FACQ_SURCHRG_AMT_CR_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_AMT_CR_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_AMT_CR_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgAmtCr
	 */
	protected void serializeX360FAcqSurchrgAmtCr(BigDecimal x360FAcqSurchrgAmtCr) {
		   putDecimal(beginX360FAcqSurchrgAmtCr,x360FAcqSurchrgAmtCr,X_360_FACQ_SURCHRG_AMT_CR_LEN,X_360_FACQ_SURCHRG_AMT_CR_SCALE,true);
		 localX360FAcqSurchrgAmtCrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgAmtCrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgAmtCr() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgAmtCr,X_360_FACQ_SURCHRG_AMT_CR_LEN,X_360_FACQ_SURCHRG_AMT_CR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgAmtCr", beginX360FAcqSurchrgAmtCr,X_360_FACQ_SURCHRG_AMT_CR_LEN);
     }
   	}
        int localX360FAcqSurchrgAmtDbCounter = -1;
        public boolean isX360FAcqSurchrgAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgAmtDbCounter != sharedCounter;
           localX360FAcqSurchrgAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgAmtDb,X_360_FACQ_SURCHRG_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgAmtDbString() {
            return getPackedString(beginX360FAcqSurchrgAmtDb,X_360_FACQ_SURCHRG_AMT_DB_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_AMT_DB_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_AMT_DB_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgAmtDb
	 */
	protected void serializeX360FAcqSurchrgAmtDb(BigDecimal x360FAcqSurchrgAmtDb) {
		   putDecimal(beginX360FAcqSurchrgAmtDb,x360FAcqSurchrgAmtDb,X_360_FACQ_SURCHRG_AMT_DB_LEN,X_360_FACQ_SURCHRG_AMT_DB_SCALE,true);
		 localX360FAcqSurchrgAmtDbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgAmtDbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgAmtDb() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgAmtDb,X_360_FACQ_SURCHRG_AMT_DB_LEN,X_360_FACQ_SURCHRG_AMT_DB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgAmtDb", beginX360FAcqSurchrgAmtDb,X_360_FACQ_SURCHRG_AMT_DB_LEN);
     }
   	}
        int localX360FBseAcqStlAmtCrCounter = -1;
        public boolean isX360FBseAcqStlAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBseAcqStlAmtCrCounter != sharedCounter;
           localX360FBseAcqStlAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBseAcqStlAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FBseAcqStlAmtCr,X_360_FBSE_ACQ_STL_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBSE_ACQ_STL_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FBseAcqStlAmtCr
	 */
	protected void serializeX360FBseAcqStlAmtCr(long x360FBseAcqStlAmtCr) {
		   putDecimal(beginX360FBseAcqStlAmtCr,x360FBseAcqStlAmtCr,X_360_FBSE_ACQ_STL_AMT_CR_LEN,true);
   }
   

   protected long checkX360FBseAcqStlAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBseAcqStlAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBseAcqStlAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBseAcqStlAmtCr,X_360_FBSE_ACQ_STL_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBseAcqStlAmtCr", beginX360FBseAcqStlAmtCr,X_360_FBSE_ACQ_STL_AMT_CR_LEN);
     }
   	}
        int localX360FBseAcqStlAmtDbCounter = -1;
        public boolean isX360FBseAcqStlAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBseAcqStlAmtDbCounter != sharedCounter;
           localX360FBseAcqStlAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBseAcqStlAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FBseAcqStlAmtDb,X_360_FBSE_ACQ_STL_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBSE_ACQ_STL_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FBseAcqStlAmtDb
	 */
	protected void serializeX360FBseAcqStlAmtDb(long x360FBseAcqStlAmtDb) {
		   putDecimal(beginX360FBseAcqStlAmtDb,x360FBseAcqStlAmtDb,X_360_FBSE_ACQ_STL_AMT_DB_LEN,true);
   }
   

   protected long checkX360FBseAcqStlAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBseAcqStlAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBseAcqStlAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBseAcqStlAmtDb,X_360_FBSE_ACQ_STL_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBseAcqStlAmtDb", beginX360FBseAcqStlAmtDb,X_360_FBSE_ACQ_STL_AMT_DB_LEN);
     }
   	}
     int localX360FEccfCntDbFilCounter = -1;
     public boolean isX360FEccfCntDbFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfCntDbFilCounter != sharedCounter;
         localX360FEccfCntDbFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfCntDbFil
	 *	@return x360FEccfCntDbFil
	 */
	public char[]  getX360FEccfCntDbFilString() {
	     return getCharArray(beginX360FEccfCntDbFil,X_360_FECCF_CNT_DB_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfCntDbFilIsNumeric() {
	    return isNumeric(beginX360FEccfCntDbFil
	                    ,beginX360FEccfCntDbFil + X_360_FECCF_CNT_DB_FIL_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_CNT_DB_FIL_LEN = 6;
  	/**
	 * serializeX360FEccfCntDbFil
	 */
	protected void serializeX360FEccfCntDbFil(int x360FEccfCntDbFil) {
		 putNumber(beginX360FEccfCntDbFil,x360FEccfCntDbFil,X_360_FECCF_CNT_DB_FIL_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfCntDbFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfCntDbFil
	 */
   	protected  int serializeX360FEccfCntDbFil(char[] value) {
	    int  x360FEccfCntDbFil;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfCntDbFil = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginX360FEccfCntDbFil
		       ,6
		      );
		 localX360FEccfCntDbFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfCntDbFil;
    }

   protected int checkX360FEccfCntDbFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfCntDbFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FEccfCntDbFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FEccfCntDbFil
			                 ,X_360_FECCF_CNT_DB_FIL_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfCntDbFil", beginX360FEccfCntDbFil,X_360_FECCF_CNT_DB_FIL_LEN);
    }
   	}
     int localX360FEccfAmtDbFilCounter = -1;
     public boolean isX360FEccfAmtDbFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfAmtDbFilCounter != sharedCounter;
         localX360FEccfAmtDbFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfAmtDbFil
	 *	@return x360FEccfAmtDbFil
	 */
	public char[]  getX360FEccfAmtDbFilString() {
	     return getCharArray(beginX360FEccfAmtDbFil,X_360_FECCF_AMT_DB_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfAmtDbFilIsNumeric() {
	    return isNumeric(beginX360FEccfAmtDbFil
	                    ,beginX360FEccfAmtDbFil + X_360_FECCF_AMT_DB_FIL_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_AMT_DB_FIL_LEN = 11;
  	/**
	 * serializeX360FEccfAmtDbFil
	 */
	protected void serializeX360FEccfAmtDbFil(long x360FEccfAmtDbFil) {
		 putNumber(beginX360FEccfAmtDbFil,x360FEccfAmtDbFil,X_360_FECCF_AMT_DB_FIL_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfAmtDbFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfAmtDbFil
	 */
   	protected  long serializeX360FEccfAmtDbFil(char[] value) {
	    long  x360FEccfAmtDbFil;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfAmtDbFil = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginX360FEccfAmtDbFil
		       ,11
		      );
		 localX360FEccfAmtDbFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfAmtDbFil;
    }

   protected long checkX360FEccfAmtDbFilMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfAmtDbFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FEccfAmtDbFil() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FEccfAmtDbFil
			                 ,X_360_FECCF_AMT_DB_FIL_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfAmtDbFil", beginX360FEccfAmtDbFil,X_360_FECCF_AMT_DB_FIL_LEN);
    }
   	}
     int localX360FEccfCntCrFilCounter = -1;
     public boolean isX360FEccfCntCrFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfCntCrFilCounter != sharedCounter;
         localX360FEccfCntCrFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfCntCrFil
	 *	@return x360FEccfCntCrFil
	 */
	public char[]  getX360FEccfCntCrFilString() {
	     return getCharArray(beginX360FEccfCntCrFil,X_360_FECCF_CNT_CR_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfCntCrFilIsNumeric() {
	    return isNumeric(beginX360FEccfCntCrFil
	                    ,beginX360FEccfCntCrFil + X_360_FECCF_CNT_CR_FIL_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_CNT_CR_FIL_LEN = 6;
  	/**
	 * serializeX360FEccfCntCrFil
	 */
	protected void serializeX360FEccfCntCrFil(int x360FEccfCntCrFil) {
		 putNumber(beginX360FEccfCntCrFil,x360FEccfCntCrFil,X_360_FECCF_CNT_CR_FIL_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfCntCrFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfCntCrFil
	 */
   	protected  int serializeX360FEccfCntCrFil(char[] value) {
	    int  x360FEccfCntCrFil;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfCntCrFil = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginX360FEccfCntCrFil
		       ,6
		      );
		 localX360FEccfCntCrFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfCntCrFil;
    }

   protected int checkX360FEccfCntCrFilMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfCntCrFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FEccfCntCrFil() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FEccfCntCrFil
			                 ,X_360_FECCF_CNT_CR_FIL_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfCntCrFil", beginX360FEccfCntCrFil,X_360_FECCF_CNT_CR_FIL_LEN);
    }
   	}
     int localX360FEccfAmtCrFilCounter = -1;
     public boolean isX360FEccfAmtCrFilModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfAmtCrFilCounter != sharedCounter;
         localX360FEccfAmtCrFilCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfAmtCrFil
	 *	@return x360FEccfAmtCrFil
	 */
	public char[]  getX360FEccfAmtCrFilString() {
	     return getCharArray(beginX360FEccfAmtCrFil,X_360_FECCF_AMT_CR_FIL_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfAmtCrFilIsNumeric() {
	    return isNumeric(beginX360FEccfAmtCrFil
	                    ,beginX360FEccfAmtCrFil + X_360_FECCF_AMT_CR_FIL_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_AMT_CR_FIL_LEN = 11;
  	/**
	 * serializeX360FEccfAmtCrFil
	 */
	protected void serializeX360FEccfAmtCrFil(long x360FEccfAmtCrFil) {
		 putNumber(beginX360FEccfAmtCrFil,x360FEccfAmtCrFil,X_360_FECCF_AMT_CR_FIL_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfAmtCrFilCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfAmtCrFil
	 */
   	protected  long serializeX360FEccfAmtCrFil(char[] value) {
	    long  x360FEccfAmtCrFil;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfAmtCrFil = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginX360FEccfAmtCrFil
		       ,11
		      );
		 localX360FEccfAmtCrFilCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfAmtCrFil;
    }

   protected long checkX360FEccfAmtCrFilMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfAmtCrFil is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FEccfAmtCrFil() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FEccfAmtCrFil
			                 ,X_360_FECCF_AMT_CR_FIL_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfAmtCrFil", beginX360FEccfAmtCrFil,X_360_FECCF_AMT_CR_FIL_LEN);
    }
   	}
        int localX360FaVatAcqFinCntCounter = -1;
        public boolean isX360FaVatAcqFinCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatAcqFinCntCounter != sharedCounter;
           localX360FaVatAcqFinCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatAcqFinCntIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatAcqFinCnt,X_360_FA_VAT_ACQ_FIN_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ACQ_FIN_CNT_LEN = 5;
  	/**
	 * 	serializeX360FaVatAcqFinCnt
	 */
	protected void serializeX360FaVatAcqFinCnt(int x360FaVatAcqFinCnt) {
		   putDecimal(beginX360FaVatAcqFinCnt,x360FaVatAcqFinCnt,X_360_FA_VAT_ACQ_FIN_CNT_LEN,true);
   }
   

   protected int checkX360FaVatAcqFinCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatAcqFinCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FaVatAcqFinCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FaVatAcqFinCnt,X_360_FA_VAT_ACQ_FIN_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatAcqFinCnt", beginX360FaVatAcqFinCnt,X_360_FA_VAT_ACQ_FIN_CNT_LEN);
     }
   	}




}
  
