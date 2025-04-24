package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FMcsIssSetlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FMcsIssSetlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FMcsIssSetlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FMCS_ISS_SETL_LENGTH = 240;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FMcsIssApprovedCntCr;
            protected  int beginX360FMcsIssApprovedCntDb;
            protected  int beginX360FMcsIssDeniedCntCr;
            protected  int beginX360FMcsIssDeniedCntDb;
            protected  int beginX360FMcsIssAmtCr;
            protected  int beginX360FMcsIssAmtDb;
            protected  int beginX360FMcsIssCnvRteBse;
            protected  int beginX360FMcsIssCurrCde;
            protected  int beginX360FMcsIssCnvRteLoc;
            protected  int beginX360FMcsIssSetlIca;
            protected  int beginX360FIssFinIfeeCnt;
            protected  int beginX360FIssNfIfeeCnt;
            protected  int beginX360FIssPctIfeeCnt;
            protected  int beginX360FIssNobillIfeeCnt;
            protected  int beginX360FIssIfeeAmtCr;
            protected  int beginX360FIssIfeeAmtDb;
            protected  int beginX360FIssCmpAmtCr;
            protected  int beginX360FIssCmpAmtDb;
            protected  int beginX360FIssbMccrAmtCr;
            protected  int beginX360FIssbMccrAmtDb;
            protected  int beginX360FIssbIccrAmtCr;
            protected  int beginX360FIssbIccrAmtDb;
            protected  int beginX360FIssSurchrgCntCr;
            protected  int beginX360FIssSurchrgCntDb;
            protected  int beginX360FIssSurchrgAmtCr;
            protected  int beginX360FIssSurchrgAmtDb;
            protected  int beginX360FBseIssStlAmtCr;
            protected  int beginX360FBseIssStlAmtDb;
            protected  int beginX360FEccfCntDb;
            protected  int beginX360FEccfAmtDb;
            protected  int beginX360FEccfCntCr;
            protected  int beginX360FEccfAmtCr;
            protected  int beginX360FaVatIssFinCnt;
	
	/**
	* Constructor for X360FMcsIssSetlSerialized
	**/
    public X360FMcsIssSetlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FMcsIssSetlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FMcsIssSetlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FMcsIssSetlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,343); // serialize this field at offset 343 by default 
    }
    
	/**
	* sets parent for this X360FMcsIssSetlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 343 by default
    }    
	/**
	* initializes the field in X360FMcsIssSetlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FMCS_ISS_SETL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FMcsIssApprovedCntCr = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FMcsIssApprovedCntDb = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FMcsIssDeniedCntCr = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FMcsIssDeniedCntDb = getStartOffset() + 15;	// set offset for serialization
  
             beginX360FMcsIssAmtCr = getStartOffset() + 20;	// set offset for serialization
  
             beginX360FMcsIssAmtDb = getStartOffset() + 28;	// set offset for serialization
  
             beginX360FMcsIssCnvRteBse = getStartOffset() + 36;	// set offset for serialization
  
             beginX360FMcsIssCurrCde = getStartOffset() + 44;	// set offset for serialization
  
             beginX360FMcsIssCnvRteLoc = getStartOffset() + 47;	// set offset for serialization
  
  
             beginX360FMcsIssSetlIca = getStartOffset() + 56;	// set offset for serialization
  
             beginX360FIssFinIfeeCnt = getStartOffset() + 62;	// set offset for serialization
  
             beginX360FIssNfIfeeCnt = getStartOffset() + 67;	// set offset for serialization
  
             beginX360FIssPctIfeeCnt = getStartOffset() + 72;	// set offset for serialization
  
             beginX360FIssNobillIfeeCnt = getStartOffset() + 77;	// set offset for serialization
  
             beginX360FIssIfeeAmtCr = getStartOffset() + 82;	// set offset for serialization
  
             beginX360FIssIfeeAmtDb = getStartOffset() + 90;	// set offset for serialization
  
             beginX360FIssCmpAmtCr = getStartOffset() + 98;	// set offset for serialization
  
             beginX360FIssCmpAmtDb = getStartOffset() + 106;	// set offset for serialization
  
             beginX360FIssbMccrAmtCr = getStartOffset() + 114;	// set offset for serialization
  
             beginX360FIssbMccrAmtDb = getStartOffset() + 122;	// set offset for serialization
  
             beginX360FIssbIccrAmtCr = getStartOffset() + 130;	// set offset for serialization
  
             beginX360FIssbIccrAmtDb = getStartOffset() + 138;	// set offset for serialization
  
             beginX360FIssSurchrgCntCr = getStartOffset() + 146;	// set offset for serialization
  
             beginX360FIssSurchrgCntDb = getStartOffset() + 151;	// set offset for serialization
  
             beginX360FIssSurchrgAmtCr = getStartOffset() + 156;	// set offset for serialization
  
             beginX360FIssSurchrgAmtDb = getStartOffset() + 164;	// set offset for serialization
  
             beginX360FBseIssStlAmtCr = getStartOffset() + 172;	// set offset for serialization
  
             beginX360FBseIssStlAmtDb = getStartOffset() + 180;	// set offset for serialization
  
  
  
             beginX360FEccfCntDb = getStartOffset() + 200;	// set offset for serialization
  
             beginX360FEccfAmtDb = getStartOffset() + 206;	// set offset for serialization
  
             beginX360FEccfCntCr = getStartOffset() + 217;	// set offset for serialization
  
             beginX360FEccfAmtCr = getStartOffset() + 223;	// set offset for serialization
  
             beginX360FaVatIssFinCnt = getStartOffset() + 234;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localX360FMcsIssApprovedCntCrCounter = -1;
        public boolean isX360FMcsIssApprovedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsIssApprovedCntCrCounter != sharedCounter;
           localX360FMcsIssApprovedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsIssApprovedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsIssApprovedCntCr,X_360_FMCS_ISS_APPROVED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ISS_APPROVED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360FMcsIssApprovedCntCr
	 */
	protected void serializeX360FMcsIssApprovedCntCr(int x360FMcsIssApprovedCntCr) {
		   putDecimal(beginX360FMcsIssApprovedCntCr,x360FMcsIssApprovedCntCr,X_360_FMCS_ISS_APPROVED_CNT_CR_LEN,true);
   }
   

   protected int checkX360FMcsIssApprovedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsIssApprovedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsIssApprovedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsIssApprovedCntCr,X_360_FMCS_ISS_APPROVED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssApprovedCntCr", beginX360FMcsIssApprovedCntCr,X_360_FMCS_ISS_APPROVED_CNT_CR_LEN);
     }
   	}
        int localX360FMcsIssApprovedCntDbCounter = -1;
        public boolean isX360FMcsIssApprovedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsIssApprovedCntDbCounter != sharedCounter;
           localX360FMcsIssApprovedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsIssApprovedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsIssApprovedCntDb,X_360_FMCS_ISS_APPROVED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ISS_APPROVED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360FMcsIssApprovedCntDb
	 */
	protected void serializeX360FMcsIssApprovedCntDb(int x360FMcsIssApprovedCntDb) {
		   putDecimal(beginX360FMcsIssApprovedCntDb,x360FMcsIssApprovedCntDb,X_360_FMCS_ISS_APPROVED_CNT_DB_LEN,true);
   }
   

   protected int checkX360FMcsIssApprovedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsIssApprovedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsIssApprovedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsIssApprovedCntDb,X_360_FMCS_ISS_APPROVED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssApprovedCntDb", beginX360FMcsIssApprovedCntDb,X_360_FMCS_ISS_APPROVED_CNT_DB_LEN);
     }
   	}
        int localX360FMcsIssDeniedCntCrCounter = -1;
        public boolean isX360FMcsIssDeniedCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsIssDeniedCntCrCounter != sharedCounter;
           localX360FMcsIssDeniedCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsIssDeniedCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsIssDeniedCntCr,X_360_FMCS_ISS_DENIED_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ISS_DENIED_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360FMcsIssDeniedCntCr
	 */
	protected void serializeX360FMcsIssDeniedCntCr(int x360FMcsIssDeniedCntCr) {
		   putDecimal(beginX360FMcsIssDeniedCntCr,x360FMcsIssDeniedCntCr,X_360_FMCS_ISS_DENIED_CNT_CR_LEN,true);
   }
   

   protected int checkX360FMcsIssDeniedCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsIssDeniedCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsIssDeniedCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsIssDeniedCntCr,X_360_FMCS_ISS_DENIED_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssDeniedCntCr", beginX360FMcsIssDeniedCntCr,X_360_FMCS_ISS_DENIED_CNT_CR_LEN);
     }
   	}
        int localX360FMcsIssDeniedCntDbCounter = -1;
        public boolean isX360FMcsIssDeniedCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsIssDeniedCntDbCounter != sharedCounter;
           localX360FMcsIssDeniedCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsIssDeniedCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsIssDeniedCntDb,X_360_FMCS_ISS_DENIED_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ISS_DENIED_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360FMcsIssDeniedCntDb
	 */
	protected void serializeX360FMcsIssDeniedCntDb(int x360FMcsIssDeniedCntDb) {
		   putDecimal(beginX360FMcsIssDeniedCntDb,x360FMcsIssDeniedCntDb,X_360_FMCS_ISS_DENIED_CNT_DB_LEN,true);
   }
   

   protected int checkX360FMcsIssDeniedCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsIssDeniedCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsIssDeniedCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FMcsIssDeniedCntDb,X_360_FMCS_ISS_DENIED_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssDeniedCntDb", beginX360FMcsIssDeniedCntDb,X_360_FMCS_ISS_DENIED_CNT_DB_LEN);
     }
   	}
        int localX360FMcsIssAmtCrCounter = -1;
        public boolean isX360FMcsIssAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsIssAmtCrCounter != sharedCounter;
           localX360FMcsIssAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsIssAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsIssAmtCr,X_360_FMCS_ISS_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ISS_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FMcsIssAmtCr
	 */
	protected void serializeX360FMcsIssAmtCr(long x360FMcsIssAmtCr) {
		   putDecimal(beginX360FMcsIssAmtCr,x360FMcsIssAmtCr,X_360_FMCS_ISS_AMT_CR_LEN,true);
   }
   

   protected long checkX360FMcsIssAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsIssAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsIssAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsIssAmtCr,X_360_FMCS_ISS_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssAmtCr", beginX360FMcsIssAmtCr,X_360_FMCS_ISS_AMT_CR_LEN);
     }
   	}
        int localX360FMcsIssAmtDbCounter = -1;
        public boolean isX360FMcsIssAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsIssAmtDbCounter != sharedCounter;
           localX360FMcsIssAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsIssAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsIssAmtDb,X_360_FMCS_ISS_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_ISS_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FMcsIssAmtDb
	 */
	protected void serializeX360FMcsIssAmtDb(long x360FMcsIssAmtDb) {
		   putDecimal(beginX360FMcsIssAmtDb,x360FMcsIssAmtDb,X_360_FMCS_ISS_AMT_DB_LEN,true);
   }
   

   protected long checkX360FMcsIssAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsIssAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsIssAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsIssAmtDb,X_360_FMCS_ISS_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssAmtDb", beginX360FMcsIssAmtDb,X_360_FMCS_ISS_AMT_DB_LEN);
     }
   	}
     int localX360FMcsIssCnvRteBseCounter = -1;
     public boolean isX360FMcsIssCnvRteBseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsIssCnvRteBseCounter != sharedCounter;
         localX360FMcsIssCnvRteBseCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsIssCnvRteBse
	 *	@return x360FMcsIssCnvRteBse
	 */
	public char[]  getX360FMcsIssCnvRteBseString() {
	     return getCharArray(beginX360FMcsIssCnvRteBse,X_360_FMCS_ISS_CNV_RTE_BSE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsIssCnvRteBseIsNumeric() {
	    return isNumeric(beginX360FMcsIssCnvRteBse
	                    ,beginX360FMcsIssCnvRteBse + X_360_FMCS_ISS_CNV_RTE_BSE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ISS_CNV_RTE_BSE_LEN = 8;
  	/**
	 * serializeX360FMcsIssCnvRteBse
	 */
	protected void serializeX360FMcsIssCnvRteBse(long x360FMcsIssCnvRteBse) {
		 putNumber(beginX360FMcsIssCnvRteBse,x360FMcsIssCnvRteBse,X_360_FMCS_ISS_CNV_RTE_BSE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsIssCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsIssCnvRteBse
	 */
   	protected  long serializeX360FMcsIssCnvRteBse(char[] value) {
	    long  x360FMcsIssCnvRteBse;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsIssCnvRteBse = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360FMcsIssCnvRteBse
		       ,8
		      );
		 localX360FMcsIssCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsIssCnvRteBse;
    }

   protected long checkX360FMcsIssCnvRteBseMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsIssCnvRteBse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsIssCnvRteBse() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsIssCnvRteBse
			                 ,X_360_FMCS_ISS_CNV_RTE_BSE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssCnvRteBse", beginX360FMcsIssCnvRteBse,X_360_FMCS_ISS_CNV_RTE_BSE_LEN);
    }
   	}
     int localX360FMcsIssCurrCdeCounter = -1;
     public boolean isX360FMcsIssCurrCdeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsIssCurrCdeCounter != sharedCounter;
         localX360FMcsIssCurrCdeCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsIssCurrCde
	 *	@return x360FMcsIssCurrCde
	 */
	public char[]  getX360FMcsIssCurrCdeString() {
	     return getCharArray(beginX360FMcsIssCurrCde,X_360_FMCS_ISS_CURR_CDE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsIssCurrCdeIsNumeric() {
	    return isNumeric(beginX360FMcsIssCurrCde
	                    ,beginX360FMcsIssCurrCde + X_360_FMCS_ISS_CURR_CDE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ISS_CURR_CDE_LEN = 3;
  	/**
	 * serializeX360FMcsIssCurrCde
	 */
	protected void serializeX360FMcsIssCurrCde(int x360FMcsIssCurrCde) {
		 putNumber(beginX360FMcsIssCurrCde,x360FMcsIssCurrCde,X_360_FMCS_ISS_CURR_CDE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsIssCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsIssCurrCde
	 */
   	protected  int serializeX360FMcsIssCurrCde(char[] value) {
	    int  x360FMcsIssCurrCde;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsIssCurrCde = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginX360FMcsIssCurrCde
		       ,3
		      );
		 localX360FMcsIssCurrCdeCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsIssCurrCde;
    }

   protected int checkX360FMcsIssCurrCdeMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsIssCurrCde is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FMcsIssCurrCde() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FMcsIssCurrCde
			                 ,X_360_FMCS_ISS_CURR_CDE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssCurrCde", beginX360FMcsIssCurrCde,X_360_FMCS_ISS_CURR_CDE_LEN);
    }
   	}
     int localX360FMcsIssCnvRteLocCounter = -1;
     public boolean isX360FMcsIssCnvRteLocModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsIssCnvRteLocCounter != sharedCounter;
         localX360FMcsIssCnvRteLocCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsIssCnvRteLoc
	 *	@return x360FMcsIssCnvRteLoc
	 */
	public char[]  getX360FMcsIssCnvRteLocString() {
	     return getCharArray(beginX360FMcsIssCnvRteLoc,X_360_FMCS_ISS_CNV_RTE_LOC_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsIssCnvRteLocIsNumeric() {
	    return isNumeric(beginX360FMcsIssCnvRteLoc
	                    ,beginX360FMcsIssCnvRteLoc + X_360_FMCS_ISS_CNV_RTE_LOC_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ISS_CNV_RTE_LOC_LEN = 8;
  	/**
	 * serializeX360FMcsIssCnvRteLoc
	 */
	protected void serializeX360FMcsIssCnvRteLoc(long x360FMcsIssCnvRteLoc) {
		 putNumber(beginX360FMcsIssCnvRteLoc,x360FMcsIssCnvRteLoc,X_360_FMCS_ISS_CNV_RTE_LOC_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsIssCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsIssCnvRteLoc
	 */
   	protected  long serializeX360FMcsIssCnvRteLoc(char[] value) {
	    long  x360FMcsIssCnvRteLoc;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsIssCnvRteLoc = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360FMcsIssCnvRteLoc
		       ,8
		      );
		 localX360FMcsIssCnvRteLocCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsIssCnvRteLoc;
    }

   protected long checkX360FMcsIssCnvRteLocMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsIssCnvRteLoc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsIssCnvRteLoc() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsIssCnvRteLoc
			                 ,X_360_FMCS_ISS_CNV_RTE_LOC_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssCnvRteLoc", beginX360FMcsIssCnvRteLoc,X_360_FMCS_ISS_CNV_RTE_LOC_LEN);
    }
   	}
     int localX360FMcsIssSetlIcaCounter = -1;
     public boolean isX360FMcsIssSetlIcaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsIssSetlIcaCounter != sharedCounter;
         localX360FMcsIssSetlIcaCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsIssSetlIca
	 *	@return x360FMcsIssSetlIca
	 */
	public char[]  getX360FMcsIssSetlIcaString() {
	     return getCharArray(beginX360FMcsIssSetlIca,X_360_FMCS_ISS_SETL_ICA_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsIssSetlIcaIsNumeric() {
	    return isNumeric(beginX360FMcsIssSetlIca
	                    ,beginX360FMcsIssSetlIca + X_360_FMCS_ISS_SETL_ICA_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_ISS_SETL_ICA_LEN = 6;
  	/**
	 * serializeX360FMcsIssSetlIca
	 */
	protected void serializeX360FMcsIssSetlIca(long x360FMcsIssSetlIca) {
		 putNumber(beginX360FMcsIssSetlIca,x360FMcsIssSetlIca,X_360_FMCS_ISS_SETL_ICA_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsIssSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsIssSetlIca
	 */
   	protected  long serializeX360FMcsIssSetlIca(char[] value) {
	    long  x360FMcsIssSetlIca;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsIssSetlIca = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,false/*isSigned?*/)
		       ,beginX360FMcsIssSetlIca
		       ,6
		      );
		 localX360FMcsIssSetlIcaCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsIssSetlIca;
    }

   protected long checkX360FMcsIssSetlIcaMaxLimit(long number) {

        return checkMaxLimit(number , MAX_1M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsIssSetlIca is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsIssSetlIca() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsIssSetlIca
			                 ,X_360_FMCS_ISS_SETL_ICA_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsIssSetlIca", beginX360FMcsIssSetlIca,X_360_FMCS_ISS_SETL_ICA_LEN);
    }
   	}
        int localX360FIssFinIfeeCntCounter = -1;
        public boolean isX360FIssFinIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssFinIfeeCntCounter != sharedCounter;
           localX360FIssFinIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssFinIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FIssFinIfeeCnt,X_360_FISS_FIN_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_FIN_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FIssFinIfeeCnt
	 */
	protected void serializeX360FIssFinIfeeCnt(int x360FIssFinIfeeCnt) {
		   putDecimal(beginX360FIssFinIfeeCnt,x360FIssFinIfeeCnt,X_360_FISS_FIN_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FIssFinIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssFinIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssFinIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssFinIfeeCnt,X_360_FISS_FIN_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssFinIfeeCnt", beginX360FIssFinIfeeCnt,X_360_FISS_FIN_IFEE_CNT_LEN);
     }
   	}
        int localX360FIssNfIfeeCntCounter = -1;
        public boolean isX360FIssNfIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssNfIfeeCntCounter != sharedCounter;
           localX360FIssNfIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssNfIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FIssNfIfeeCnt,X_360_FISS_NF_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_NF_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FIssNfIfeeCnt
	 */
	protected void serializeX360FIssNfIfeeCnt(int x360FIssNfIfeeCnt) {
		   putDecimal(beginX360FIssNfIfeeCnt,x360FIssNfIfeeCnt,X_360_FISS_NF_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FIssNfIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssNfIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssNfIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssNfIfeeCnt,X_360_FISS_NF_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssNfIfeeCnt", beginX360FIssNfIfeeCnt,X_360_FISS_NF_IFEE_CNT_LEN);
     }
   	}
        int localX360FIssPctIfeeCntCounter = -1;
        public boolean isX360FIssPctIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssPctIfeeCntCounter != sharedCounter;
           localX360FIssPctIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssPctIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FIssPctIfeeCnt,X_360_FISS_PCT_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_PCT_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FIssPctIfeeCnt
	 */
	protected void serializeX360FIssPctIfeeCnt(int x360FIssPctIfeeCnt) {
		   putDecimal(beginX360FIssPctIfeeCnt,x360FIssPctIfeeCnt,X_360_FISS_PCT_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FIssPctIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssPctIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssPctIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssPctIfeeCnt,X_360_FISS_PCT_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssPctIfeeCnt", beginX360FIssPctIfeeCnt,X_360_FISS_PCT_IFEE_CNT_LEN);
     }
   	}
        int localX360FIssNobillIfeeCntCounter = -1;
        public boolean isX360FIssNobillIfeeCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssNobillIfeeCntCounter != sharedCounter;
           localX360FIssNobillIfeeCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssNobillIfeeCntIsNumeric() {
	      return decimalIsNumeric(beginX360FIssNobillIfeeCnt,X_360_FISS_NOBILL_IFEE_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_NOBILL_IFEE_CNT_LEN = 5;
  	/**
	 * 	serializeX360FIssNobillIfeeCnt
	 */
	protected void serializeX360FIssNobillIfeeCnt(int x360FIssNobillIfeeCnt) {
		   putDecimal(beginX360FIssNobillIfeeCnt,x360FIssNobillIfeeCnt,X_360_FISS_NOBILL_IFEE_CNT_LEN,true);
   }
   

   protected int checkX360FIssNobillIfeeCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssNobillIfeeCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssNobillIfeeCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssNobillIfeeCnt,X_360_FISS_NOBILL_IFEE_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssNobillIfeeCnt", beginX360FIssNobillIfeeCnt,X_360_FISS_NOBILL_IFEE_CNT_LEN);
     }
   	}
        int localX360FIssIfeeAmtCrCounter = -1;
        public boolean isX360FIssIfeeAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssIfeeAmtCrCounter != sharedCounter;
           localX360FIssIfeeAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssIfeeAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssIfeeAmtCr,X_360_FISS_IFEE_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_IFEE_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssIfeeAmtCr
	 */
	protected void serializeX360FIssIfeeAmtCr(long x360FIssIfeeAmtCr) {
		   putDecimal(beginX360FIssIfeeAmtCr,x360FIssIfeeAmtCr,X_360_FISS_IFEE_AMT_CR_LEN,true);
   }
   

   protected long checkX360FIssIfeeAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssIfeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssIfeeAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssIfeeAmtCr,X_360_FISS_IFEE_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssIfeeAmtCr", beginX360FIssIfeeAmtCr,X_360_FISS_IFEE_AMT_CR_LEN);
     }
   	}
        int localX360FIssIfeeAmtDbCounter = -1;
        public boolean isX360FIssIfeeAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssIfeeAmtDbCounter != sharedCounter;
           localX360FIssIfeeAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssIfeeAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssIfeeAmtDb,X_360_FISS_IFEE_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_IFEE_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssIfeeAmtDb
	 */
	protected void serializeX360FIssIfeeAmtDb(long x360FIssIfeeAmtDb) {
		   putDecimal(beginX360FIssIfeeAmtDb,x360FIssIfeeAmtDb,X_360_FISS_IFEE_AMT_DB_LEN,true);
   }
   

   protected long checkX360FIssIfeeAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssIfeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssIfeeAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssIfeeAmtDb,X_360_FISS_IFEE_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssIfeeAmtDb", beginX360FIssIfeeAmtDb,X_360_FISS_IFEE_AMT_DB_LEN);
     }
   	}
        int localX360FIssCmpAmtCrCounter = -1;
        public boolean isX360FIssCmpAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssCmpAmtCrCounter != sharedCounter;
           localX360FIssCmpAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssCmpAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssCmpAmtCr,X_360_FISS_CMP_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_CMP_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssCmpAmtCr
	 */
	protected void serializeX360FIssCmpAmtCr(long x360FIssCmpAmtCr) {
		   putDecimal(beginX360FIssCmpAmtCr,x360FIssCmpAmtCr,X_360_FISS_CMP_AMT_CR_LEN,true);
   }
   

   protected long checkX360FIssCmpAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssCmpAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssCmpAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssCmpAmtCr,X_360_FISS_CMP_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssCmpAmtCr", beginX360FIssCmpAmtCr,X_360_FISS_CMP_AMT_CR_LEN);
     }
   	}
        int localX360FIssCmpAmtDbCounter = -1;
        public boolean isX360FIssCmpAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssCmpAmtDbCounter != sharedCounter;
           localX360FIssCmpAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssCmpAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssCmpAmtDb,X_360_FISS_CMP_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_CMP_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssCmpAmtDb
	 */
	protected void serializeX360FIssCmpAmtDb(long x360FIssCmpAmtDb) {
		   putDecimal(beginX360FIssCmpAmtDb,x360FIssCmpAmtDb,X_360_FISS_CMP_AMT_DB_LEN,true);
   }
   

   protected long checkX360FIssCmpAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssCmpAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssCmpAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssCmpAmtDb,X_360_FISS_CMP_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssCmpAmtDb", beginX360FIssCmpAmtDb,X_360_FISS_CMP_AMT_DB_LEN);
     }
   	}
        int localX360FIssbMccrAmtCrCounter = -1;
        public boolean isX360FIssbMccrAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssbMccrAmtCrCounter != sharedCounter;
           localX360FIssbMccrAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssbMccrAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssbMccrAmtCr,X_360_FISSB_MCCR_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISSB_MCCR_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssbMccrAmtCr
	 */
	protected void serializeX360FIssbMccrAmtCr(long x360FIssbMccrAmtCr) {
		   putDecimal(beginX360FIssbMccrAmtCr,x360FIssbMccrAmtCr,X_360_FISSB_MCCR_AMT_CR_LEN,true);
   }
   

   protected long checkX360FIssbMccrAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssbMccrAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssbMccrAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssbMccrAmtCr,X_360_FISSB_MCCR_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssbMccrAmtCr", beginX360FIssbMccrAmtCr,X_360_FISSB_MCCR_AMT_CR_LEN);
     }
   	}
        int localX360FIssbMccrAmtDbCounter = -1;
        public boolean isX360FIssbMccrAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssbMccrAmtDbCounter != sharedCounter;
           localX360FIssbMccrAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssbMccrAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssbMccrAmtDb,X_360_FISSB_MCCR_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISSB_MCCR_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssbMccrAmtDb
	 */
	protected void serializeX360FIssbMccrAmtDb(long x360FIssbMccrAmtDb) {
		   putDecimal(beginX360FIssbMccrAmtDb,x360FIssbMccrAmtDb,X_360_FISSB_MCCR_AMT_DB_LEN,true);
   }
   

   protected long checkX360FIssbMccrAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssbMccrAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssbMccrAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssbMccrAmtDb,X_360_FISSB_MCCR_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssbMccrAmtDb", beginX360FIssbMccrAmtDb,X_360_FISSB_MCCR_AMT_DB_LEN);
     }
   	}
        int localX360FIssbIccrAmtCrCounter = -1;
        public boolean isX360FIssbIccrAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssbIccrAmtCrCounter != sharedCounter;
           localX360FIssbIccrAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssbIccrAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssbIccrAmtCr,X_360_FISSB_ICCR_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISSB_ICCR_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssbIccrAmtCr
	 */
	protected void serializeX360FIssbIccrAmtCr(long x360FIssbIccrAmtCr) {
		   putDecimal(beginX360FIssbIccrAmtCr,x360FIssbIccrAmtCr,X_360_FISSB_ICCR_AMT_CR_LEN,true);
   }
   

   protected long checkX360FIssbIccrAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssbIccrAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssbIccrAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssbIccrAmtCr,X_360_FISSB_ICCR_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssbIccrAmtCr", beginX360FIssbIccrAmtCr,X_360_FISSB_ICCR_AMT_CR_LEN);
     }
   	}
        int localX360FIssbIccrAmtDbCounter = -1;
        public boolean isX360FIssbIccrAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssbIccrAmtDbCounter != sharedCounter;
           localX360FIssbIccrAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssbIccrAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssbIccrAmtDb,X_360_FISSB_ICCR_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISSB_ICCR_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssbIccrAmtDb
	 */
	protected void serializeX360FIssbIccrAmtDb(long x360FIssbIccrAmtDb) {
		   putDecimal(beginX360FIssbIccrAmtDb,x360FIssbIccrAmtDb,X_360_FISSB_ICCR_AMT_DB_LEN,true);
   }
   

   protected long checkX360FIssbIccrAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssbIccrAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssbIccrAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssbIccrAmtDb,X_360_FISSB_ICCR_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssbIccrAmtDb", beginX360FIssbIccrAmtDb,X_360_FISSB_ICCR_AMT_DB_LEN);
     }
   	}
        int localX360FIssSurchrgCntCrCounter = -1;
        public boolean isX360FIssSurchrgCntCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgCntCrCounter != sharedCounter;
           localX360FIssSurchrgCntCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgCntCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgCntCr,X_360_FISS_SURCHRG_CNT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_CNT_CR_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgCntCr
	 */
	protected void serializeX360FIssSurchrgCntCr(int x360FIssSurchrgCntCr) {
		   putDecimal(beginX360FIssSurchrgCntCr,x360FIssSurchrgCntCr,X_360_FISS_SURCHRG_CNT_CR_LEN,true);
   }
   

   protected int checkX360FIssSurchrgCntCrMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgCntCr() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgCntCr,X_360_FISS_SURCHRG_CNT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgCntCr", beginX360FIssSurchrgCntCr,X_360_FISS_SURCHRG_CNT_CR_LEN);
     }
   	}
        int localX360FIssSurchrgCntDbCounter = -1;
        public boolean isX360FIssSurchrgCntDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgCntDbCounter != sharedCounter;
           localX360FIssSurchrgCntDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgCntDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgCntDb,X_360_FISS_SURCHRG_CNT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_CNT_DB_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgCntDb
	 */
	protected void serializeX360FIssSurchrgCntDb(int x360FIssSurchrgCntDb) {
		   putDecimal(beginX360FIssSurchrgCntDb,x360FIssSurchrgCntDb,X_360_FISS_SURCHRG_CNT_DB_LEN,true);
   }
   

   protected int checkX360FIssSurchrgCntDbMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgCntDb() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgCntDb,X_360_FISS_SURCHRG_CNT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgCntDb", beginX360FIssSurchrgCntDb,X_360_FISS_SURCHRG_CNT_DB_LEN);
     }
   	}
        int localX360FIssSurchrgAmtCrCounter = -1;
        public boolean isX360FIssSurchrgAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgAmtCrCounter != sharedCounter;
           localX360FIssSurchrgAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgAmtCr,X_360_FISS_SURCHRG_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgAmtCrString() {
            return getPackedString(beginX360FIssSurchrgAmtCr,X_360_FISS_SURCHRG_AMT_CR_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_AMT_CR_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_AMT_CR_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgAmtCr
	 */
	protected void serializeX360FIssSurchrgAmtCr(BigDecimal x360FIssSurchrgAmtCr) {
		   putDecimal(beginX360FIssSurchrgAmtCr,x360FIssSurchrgAmtCr,X_360_FISS_SURCHRG_AMT_CR_LEN,X_360_FISS_SURCHRG_AMT_CR_SCALE,true);
		 localX360FIssSurchrgAmtCrCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgAmtCrMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgAmtCr() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgAmtCr,X_360_FISS_SURCHRG_AMT_CR_LEN,X_360_FISS_SURCHRG_AMT_CR_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgAmtCr", beginX360FIssSurchrgAmtCr,X_360_FISS_SURCHRG_AMT_CR_LEN);
     }
   	}
        int localX360FIssSurchrgAmtDbCounter = -1;
        public boolean isX360FIssSurchrgAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgAmtDbCounter != sharedCounter;
           localX360FIssSurchrgAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgAmtDb,X_360_FISS_SURCHRG_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgAmtDbString() {
            return getPackedString(beginX360FIssSurchrgAmtDb,X_360_FISS_SURCHRG_AMT_DB_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_AMT_DB_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_AMT_DB_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgAmtDb
	 */
	protected void serializeX360FIssSurchrgAmtDb(BigDecimal x360FIssSurchrgAmtDb) {
		   putDecimal(beginX360FIssSurchrgAmtDb,x360FIssSurchrgAmtDb,X_360_FISS_SURCHRG_AMT_DB_LEN,X_360_FISS_SURCHRG_AMT_DB_SCALE,true);
		 localX360FIssSurchrgAmtDbCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgAmtDbMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgAmtDb() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgAmtDb,X_360_FISS_SURCHRG_AMT_DB_LEN,X_360_FISS_SURCHRG_AMT_DB_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgAmtDb", beginX360FIssSurchrgAmtDb,X_360_FISS_SURCHRG_AMT_DB_LEN);
     }
   	}
        int localX360FBseIssStlAmtCrCounter = -1;
        public boolean isX360FBseIssStlAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBseIssStlAmtCrCounter != sharedCounter;
           localX360FBseIssStlAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBseIssStlAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360FBseIssStlAmtCr,X_360_FBSE_ISS_STL_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBSE_ISS_STL_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360FBseIssStlAmtCr
	 */
	protected void serializeX360FBseIssStlAmtCr(long x360FBseIssStlAmtCr) {
		   putDecimal(beginX360FBseIssStlAmtCr,x360FBseIssStlAmtCr,X_360_FBSE_ISS_STL_AMT_CR_LEN,true);
   }
   

   protected long checkX360FBseIssStlAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBseIssStlAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBseIssStlAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBseIssStlAmtCr,X_360_FBSE_ISS_STL_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBseIssStlAmtCr", beginX360FBseIssStlAmtCr,X_360_FBSE_ISS_STL_AMT_CR_LEN);
     }
   	}
        int localX360FBseIssStlAmtDbCounter = -1;
        public boolean isX360FBseIssStlAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBseIssStlAmtDbCounter != sharedCounter;
           localX360FBseIssStlAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBseIssStlAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360FBseIssStlAmtDb,X_360_FBSE_ISS_STL_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBSE_ISS_STL_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360FBseIssStlAmtDb
	 */
	protected void serializeX360FBseIssStlAmtDb(long x360FBseIssStlAmtDb) {
		   putDecimal(beginX360FBseIssStlAmtDb,x360FBseIssStlAmtDb,X_360_FBSE_ISS_STL_AMT_DB_LEN,true);
   }
   

   protected long checkX360FBseIssStlAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBseIssStlAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBseIssStlAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBseIssStlAmtDb,X_360_FBSE_ISS_STL_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBseIssStlAmtDb", beginX360FBseIssStlAmtDb,X_360_FBSE_ISS_STL_AMT_DB_LEN);
     }
   	}
     int localX360FEccfCntDbCounter = -1;
     public boolean isX360FEccfCntDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfCntDbCounter != sharedCounter;
         localX360FEccfCntDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfCntDb
	 *	@return x360FEccfCntDb
	 */
	public char[]  getX360FEccfCntDbString() {
	     return getCharArray(beginX360FEccfCntDb,X_360_FECCF_CNT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfCntDbIsNumeric() {
	    return isNumeric(beginX360FEccfCntDb
	                    ,beginX360FEccfCntDb + X_360_FECCF_CNT_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_CNT_DB_LEN = 6;
  	/**
	 * serializeX360FEccfCntDb
	 */
	protected void serializeX360FEccfCntDb(int x360FEccfCntDb) {
		 putNumber(beginX360FEccfCntDb,x360FEccfCntDb,X_360_FECCF_CNT_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfCntDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfCntDb
	 */
   	protected  int serializeX360FEccfCntDb(char[] value) {
	    int  x360FEccfCntDb;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfCntDb = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginX360FEccfCntDb
		       ,6
		      );
		 localX360FEccfCntDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfCntDb;
    }

   protected int checkX360FEccfCntDbMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfCntDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FEccfCntDb() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FEccfCntDb
			                 ,X_360_FECCF_CNT_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfCntDb", beginX360FEccfCntDb,X_360_FECCF_CNT_DB_LEN);
    }
   	}
     int localX360FEccfAmtDbCounter = -1;
     public boolean isX360FEccfAmtDbModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfAmtDbCounter != sharedCounter;
         localX360FEccfAmtDbCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfAmtDb
	 *	@return x360FEccfAmtDb
	 */
	public char[]  getX360FEccfAmtDbString() {
	     return getCharArray(beginX360FEccfAmtDb,X_360_FECCF_AMT_DB_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfAmtDbIsNumeric() {
	    return isNumeric(beginX360FEccfAmtDb
	                    ,beginX360FEccfAmtDb + X_360_FECCF_AMT_DB_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_AMT_DB_LEN = 11;
  	/**
	 * serializeX360FEccfAmtDb
	 */
	protected void serializeX360FEccfAmtDb(long x360FEccfAmtDb) {
		 putNumber(beginX360FEccfAmtDb,x360FEccfAmtDb,X_360_FECCF_AMT_DB_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfAmtDbCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfAmtDb
	 */
   	protected  long serializeX360FEccfAmtDb(char[] value) {
	    long  x360FEccfAmtDb;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfAmtDb = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginX360FEccfAmtDb
		       ,11
		      );
		 localX360FEccfAmtDbCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfAmtDb;
    }

   protected long checkX360FEccfAmtDbMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FEccfAmtDb() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FEccfAmtDb
			                 ,X_360_FECCF_AMT_DB_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfAmtDb", beginX360FEccfAmtDb,X_360_FECCF_AMT_DB_LEN);
    }
   	}
     int localX360FEccfCntCrCounter = -1;
     public boolean isX360FEccfCntCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfCntCrCounter != sharedCounter;
         localX360FEccfCntCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfCntCr
	 *	@return x360FEccfCntCr
	 */
	public char[]  getX360FEccfCntCrString() {
	     return getCharArray(beginX360FEccfCntCr,X_360_FECCF_CNT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfCntCrIsNumeric() {
	    return isNumeric(beginX360FEccfCntCr
	                    ,beginX360FEccfCntCr + X_360_FECCF_CNT_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_CNT_CR_LEN = 6;
  	/**
	 * serializeX360FEccfCntCr
	 */
	protected void serializeX360FEccfCntCr(int x360FEccfCntCr) {
		 putNumber(beginX360FEccfCntCr,x360FEccfCntCr,X_360_FECCF_CNT_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfCntCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfCntCr
	 */
   	protected  int serializeX360FEccfCntCr(char[] value) {
	    int  x360FEccfCntCr;
	    if(value.length >0 && value.length!= 6)
            value = new String(value).trim().toCharArray();
	    if (value.length < 6) value = pad(6, value, ' ', LEFT_PAD);
	    else if (value.length > 6) value = substring(value,0,6);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfCntCr = (int) convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(6,value,true/*isSigned?*/)
		       ,beginX360FEccfCntCr
		       ,6
		      );
		 localX360FEccfCntCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfCntCr;
    }

   protected int checkX360FEccfCntCrMaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1M/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfCntCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FEccfCntCr() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginX360FEccfCntCr
			                 ,X_360_FECCF_CNT_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfCntCr", beginX360FEccfCntCr,X_360_FECCF_CNT_CR_LEN);
    }
   	}
     int localX360FEccfAmtCrCounter = -1;
     public boolean isX360FEccfAmtCrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FEccfAmtCrCounter != sharedCounter;
         localX360FEccfAmtCrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FEccfAmtCr
	 *	@return x360FEccfAmtCr
	 */
	public char[]  getX360FEccfAmtCrString() {
	     return getCharArray(beginX360FEccfAmtCr,X_360_FECCF_AMT_CR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FEccfAmtCrIsNumeric() {
	    return isNumeric(beginX360FEccfAmtCr
	                    ,beginX360FEccfAmtCr + X_360_FECCF_AMT_CR_LEN
	                    ,true/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FECCF_AMT_CR_LEN = 11;
  	/**
	 * serializeX360FEccfAmtCr
	 */
	protected void serializeX360FEccfAmtCr(long x360FEccfAmtCr) {
		 putNumber(beginX360FEccfAmtCr,x360FEccfAmtCr,X_360_FECCF_AMT_CR_LEN,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FEccfAmtCrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FEccfAmtCr
	 */
   	protected  long serializeX360FEccfAmtCr(char[] value) {
	    long  x360FEccfAmtCr;
	    if(value.length >0 && value.length!= 11)
            value = new String(value).trim().toCharArray();
	    if (value.length < 11) value = pad(11, value, ' ', LEFT_PAD);
	    else if (value.length > 11) value = substring(value,0,11);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FEccfAmtCr = convertString2Number(value,true/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(11,value,true/*isSigned?*/)
		       ,beginX360FEccfAmtCr
		       ,11
		      );
		 localX360FEccfAmtCrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FEccfAmtCr;
    }

   protected long checkX360FEccfAmtCrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100G/*limit*/  , true/*isSigned*/);
   }
    /**
	 *	refreshX360FEccfAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FEccfAmtCr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FEccfAmtCr
			                 ,X_360_FECCF_AMT_CR_LEN
			                 ,true/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FEccfAmtCr", beginX360FEccfAmtCr,X_360_FECCF_AMT_CR_LEN);
    }
   	}
        int localX360FaVatIssFinCntCounter = -1;
        public boolean isX360FaVatIssFinCntModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FaVatIssFinCntCounter != sharedCounter;
           localX360FaVatIssFinCntCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FaVatIssFinCntIsNumeric() {
	      return decimalIsNumeric(beginX360FaVatIssFinCnt,X_360_FA_VAT_ISS_FIN_CNT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FA_VAT_ISS_FIN_CNT_LEN = 5;
  	/**
	 * 	serializeX360FaVatIssFinCnt
	 */
	protected void serializeX360FaVatIssFinCnt(int x360FaVatIssFinCnt) {
		   putDecimal(beginX360FaVatIssFinCnt,x360FaVatIssFinCnt,X_360_FA_VAT_ISS_FIN_CNT_LEN,true);
   }
   

   protected int checkX360FaVatIssFinCntMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FaVatIssFinCnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FaVatIssFinCnt() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FaVatIssFinCnt,X_360_FA_VAT_ISS_FIN_CNT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FaVatIssFinCnt", beginX360FaVatIssFinCnt,X_360_FA_VAT_ISS_FIN_CNT_LEN);
     }
   	}




}
  
