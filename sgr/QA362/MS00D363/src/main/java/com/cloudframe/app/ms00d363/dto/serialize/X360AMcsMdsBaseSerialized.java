package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360AMcsMdsBaseSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360AMcsMdsBaseSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360AMcsMdsBaseSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_AMCS_MDS_BASE_LENGTH = 143;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360AMcsMdsOrgReq;
            protected  int beginX360AMcsMdsOrgAmt;
            protected  int beginX360AMcsMdsNewAmt;
            protected  int beginX360AMcsMdsAdjAdjAmtCr;
            protected  int beginX360AMcsMdsAdjAdjAmtDb;
            protected  int beginX360AMcsMdsCnvRte;
            protected  int beginX360AMcsMdsMccrAmt;
            protected  int beginX360AMcsMdsCnvMccr;
            protected  int beginX360AMcsMdsIccrAmt;
            protected  int beginX360AMcsMdsCnvIccr;
            protected  int beginX360ABaseIfeeAmtIssCr;
            protected  int beginX360ABaseIfeeAmtIssDb;
            protected  int beginX360ABseToLocRate;
            protected  int beginX360ABaseIfeeAmtAcqCr;
            protected  int beginX360ABaseIfeeAmtAcqDb;
            protected  int beginX360AAcqA09IfeeAmtCr;
            protected  int beginX360AAcqA09IfeeAmtDb;
	
	/**
	* Constructor for X360AMcsMdsBaseSerialized
	**/
    public X360AMcsMdsBaseSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360AMcsMdsBaseSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360AMcsMdsBaseSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360AMcsMdsBaseSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,588); // serialize this field at offset 588 by default 
    }
    
	/**
	* sets parent for this X360AMcsMdsBaseSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 588 by default
    }    
	/**
	* initializes the field in X360AMcsMdsBaseSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_AMCS_MDS_BASE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360AMcsMdsOrgReq = getStartOffset() + 0;	// set offset for serialization
  
             beginX360AMcsMdsOrgAmt = getStartOffset() + 8;	// set offset for serialization
  
             beginX360AMcsMdsNewAmt = getStartOffset() + 16;	// set offset for serialization
  
             beginX360AMcsMdsAdjAdjAmtCr = getStartOffset() + 24;	// set offset for serialization
  
             beginX360AMcsMdsAdjAdjAmtDb = getStartOffset() + 32;	// set offset for serialization
  
             beginX360AMcsMdsCnvRte = getStartOffset() + 40;	// set offset for serialization
  
             beginX360AMcsMdsMccrAmt = getStartOffset() + 48;	// set offset for serialization
  
             beginX360AMcsMdsCnvMccr = getStartOffset() + 56;	// set offset for serialization
  
             beginX360AMcsMdsIccrAmt = getStartOffset() + 64;	// set offset for serialization
  
             beginX360AMcsMdsCnvIccr = getStartOffset() + 72;	// set offset for serialization
  
             beginX360ABaseIfeeAmtIssCr = getStartOffset() + 80;	// set offset for serialization
  
             beginX360ABaseIfeeAmtIssDb = getStartOffset() + 88;	// set offset for serialization
  
             beginX360ABseToLocRate = getStartOffset() + 96;	// set offset for serialization
  
             beginX360ABaseIfeeAmtAcqCr = getStartOffset() + 111;	// set offset for serialization
  
             beginX360ABaseIfeeAmtAcqDb = getStartOffset() + 119;	// set offset for serialization
  
             beginX360AAcqA09IfeeAmtCr = getStartOffset() + 127;	// set offset for serialization
  
             beginX360AAcqA09IfeeAmtDb = getStartOffset() + 135;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360AMcsMdsOrgReqCounter = -1;
        public boolean isX360AMcsMdsOrgReqModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsMdsOrgReqCounter != sharedCounter;
           localX360AMcsMdsOrgReqCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsMdsOrgReqIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsMdsOrgReq,X_360_AMCS_MDS_ORG_REQ_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_MDS_ORG_REQ_LEN = 8;
  	/**
	 * 	serializeX360AMcsMdsOrgReq
	 */
	protected void serializeX360AMcsMdsOrgReq(long x360AMcsMdsOrgReq) {
		   putDecimal(beginX360AMcsMdsOrgReq,x360AMcsMdsOrgReq,X_360_AMCS_MDS_ORG_REQ_LEN,true);
   }
   

   protected long checkX360AMcsMdsOrgReqMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsMdsOrgReq is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsOrgReq() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsMdsOrgReq,X_360_AMCS_MDS_ORG_REQ_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsOrgReq", beginX360AMcsMdsOrgReq,X_360_AMCS_MDS_ORG_REQ_LEN);
     }
   	}
        int localX360AMcsMdsOrgAmtCounter = -1;
        public boolean isX360AMcsMdsOrgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsMdsOrgAmtCounter != sharedCounter;
           localX360AMcsMdsOrgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsMdsOrgAmtIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsMdsOrgAmt,X_360_AMCS_MDS_ORG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_MDS_ORG_AMT_LEN = 8;
  	/**
	 * 	serializeX360AMcsMdsOrgAmt
	 */
	protected void serializeX360AMcsMdsOrgAmt(long x360AMcsMdsOrgAmt) {
		   putDecimal(beginX360AMcsMdsOrgAmt,x360AMcsMdsOrgAmt,X_360_AMCS_MDS_ORG_AMT_LEN,true);
   }
   

   protected long checkX360AMcsMdsOrgAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsMdsOrgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsOrgAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsMdsOrgAmt,X_360_AMCS_MDS_ORG_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsOrgAmt", beginX360AMcsMdsOrgAmt,X_360_AMCS_MDS_ORG_AMT_LEN);
     }
   	}
        int localX360AMcsMdsNewAmtCounter = -1;
        public boolean isX360AMcsMdsNewAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsMdsNewAmtCounter != sharedCounter;
           localX360AMcsMdsNewAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsMdsNewAmtIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsMdsNewAmt,X_360_AMCS_MDS_NEW_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_MDS_NEW_AMT_LEN = 8;
  	/**
	 * 	serializeX360AMcsMdsNewAmt
	 */
	protected void serializeX360AMcsMdsNewAmt(long x360AMcsMdsNewAmt) {
		   putDecimal(beginX360AMcsMdsNewAmt,x360AMcsMdsNewAmt,X_360_AMCS_MDS_NEW_AMT_LEN,true);
   }
   

   protected long checkX360AMcsMdsNewAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsMdsNewAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsNewAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsMdsNewAmt,X_360_AMCS_MDS_NEW_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsNewAmt", beginX360AMcsMdsNewAmt,X_360_AMCS_MDS_NEW_AMT_LEN);
     }
   	}
        int localX360AMcsMdsAdjAdjAmtCrCounter = -1;
        public boolean isX360AMcsMdsAdjAdjAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsMdsAdjAdjAmtCrCounter != sharedCounter;
           localX360AMcsMdsAdjAdjAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsMdsAdjAdjAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsMdsAdjAdjAmtCr,X_360_AMCS_MDS_ADJ_ADJ_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_MDS_ADJ_ADJ_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AMcsMdsAdjAdjAmtCr
	 */
	protected void serializeX360AMcsMdsAdjAdjAmtCr(long x360AMcsMdsAdjAdjAmtCr) {
		   putDecimal(beginX360AMcsMdsAdjAdjAmtCr,x360AMcsMdsAdjAdjAmtCr,X_360_AMCS_MDS_ADJ_ADJ_AMT_CR_LEN,true);
   }
   

   protected long checkX360AMcsMdsAdjAdjAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsMdsAdjAdjAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsAdjAdjAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsMdsAdjAdjAmtCr,X_360_AMCS_MDS_ADJ_ADJ_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsAdjAdjAmtCr", beginX360AMcsMdsAdjAdjAmtCr,X_360_AMCS_MDS_ADJ_ADJ_AMT_CR_LEN);
     }
   	}
        int localX360AMcsMdsAdjAdjAmtDbCounter = -1;
        public boolean isX360AMcsMdsAdjAdjAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsMdsAdjAdjAmtDbCounter != sharedCounter;
           localX360AMcsMdsAdjAdjAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsMdsAdjAdjAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsMdsAdjAdjAmtDb,X_360_AMCS_MDS_ADJ_ADJ_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_MDS_ADJ_ADJ_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AMcsMdsAdjAdjAmtDb
	 */
	protected void serializeX360AMcsMdsAdjAdjAmtDb(long x360AMcsMdsAdjAdjAmtDb) {
		   putDecimal(beginX360AMcsMdsAdjAdjAmtDb,x360AMcsMdsAdjAdjAmtDb,X_360_AMCS_MDS_ADJ_ADJ_AMT_DB_LEN,true);
   }
   

   protected long checkX360AMcsMdsAdjAdjAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsMdsAdjAdjAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsAdjAdjAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsMdsAdjAdjAmtDb,X_360_AMCS_MDS_ADJ_ADJ_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsAdjAdjAmtDb", beginX360AMcsMdsAdjAdjAmtDb,X_360_AMCS_MDS_ADJ_ADJ_AMT_DB_LEN);
     }
   	}
     int localX360AMcsMdsCnvRteCounter = -1;
     public boolean isX360AMcsMdsCnvRteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsMdsCnvRteCounter != sharedCounter;
         localX360AMcsMdsCnvRteCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsMdsCnvRte
	 *	@return x360AMcsMdsCnvRte
	 */
	public char[]  getX360AMcsMdsCnvRteString() {
	     return getCharArray(beginX360AMcsMdsCnvRte,X_360_AMCS_MDS_CNV_RTE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsMdsCnvRteIsNumeric() {
	    return isNumeric(beginX360AMcsMdsCnvRte
	                    ,beginX360AMcsMdsCnvRte + X_360_AMCS_MDS_CNV_RTE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_MDS_CNV_RTE_LEN = 8;
  	/**
	 * serializeX360AMcsMdsCnvRte
	 */
	protected void serializeX360AMcsMdsCnvRte(long x360AMcsMdsCnvRte) {
		 putNumber(beginX360AMcsMdsCnvRte,x360AMcsMdsCnvRte,X_360_AMCS_MDS_CNV_RTE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsMdsCnvRteCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsMdsCnvRte
	 */
   	protected  long serializeX360AMcsMdsCnvRte(char[] value) {
	    long  x360AMcsMdsCnvRte;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsMdsCnvRte = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360AMcsMdsCnvRte
		       ,8
		      );
		 localX360AMcsMdsCnvRteCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsMdsCnvRte;
    }

   protected long checkX360AMcsMdsCnvRteMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsMdsCnvRte is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsCnvRte() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsMdsCnvRte
			                 ,X_360_AMCS_MDS_CNV_RTE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsCnvRte", beginX360AMcsMdsCnvRte,X_360_AMCS_MDS_CNV_RTE_LEN);
    }
   	}
        int localX360AMcsMdsMccrAmtCounter = -1;
        public boolean isX360AMcsMdsMccrAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsMdsMccrAmtCounter != sharedCounter;
           localX360AMcsMdsMccrAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsMdsMccrAmtIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsMdsMccrAmt,X_360_AMCS_MDS_MCCR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_MDS_MCCR_AMT_LEN = 8;
  	/**
	 * 	serializeX360AMcsMdsMccrAmt
	 */
	protected void serializeX360AMcsMdsMccrAmt(long x360AMcsMdsMccrAmt) {
		   putDecimal(beginX360AMcsMdsMccrAmt,x360AMcsMdsMccrAmt,X_360_AMCS_MDS_MCCR_AMT_LEN,true);
   }
   

   protected long checkX360AMcsMdsMccrAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsMdsMccrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsMccrAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsMdsMccrAmt,X_360_AMCS_MDS_MCCR_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsMccrAmt", beginX360AMcsMdsMccrAmt,X_360_AMCS_MDS_MCCR_AMT_LEN);
     }
   	}
     int localX360AMcsMdsCnvMccrCounter = -1;
     public boolean isX360AMcsMdsCnvMccrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsMdsCnvMccrCounter != sharedCounter;
         localX360AMcsMdsCnvMccrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsMdsCnvMccr
	 *	@return x360AMcsMdsCnvMccr
	 */
	public char[]  getX360AMcsMdsCnvMccrString() {
	     return getCharArray(beginX360AMcsMdsCnvMccr,X_360_AMCS_MDS_CNV_MCCR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsMdsCnvMccrIsNumeric() {
	    return isNumeric(beginX360AMcsMdsCnvMccr
	                    ,beginX360AMcsMdsCnvMccr + X_360_AMCS_MDS_CNV_MCCR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_MDS_CNV_MCCR_LEN = 8;
  	/**
	 * serializeX360AMcsMdsCnvMccr
	 */
	protected void serializeX360AMcsMdsCnvMccr(long x360AMcsMdsCnvMccr) {
		 putNumber(beginX360AMcsMdsCnvMccr,x360AMcsMdsCnvMccr,X_360_AMCS_MDS_CNV_MCCR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsMdsCnvMccrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsMdsCnvMccr
	 */
   	protected  long serializeX360AMcsMdsCnvMccr(char[] value) {
	    long  x360AMcsMdsCnvMccr;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsMdsCnvMccr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360AMcsMdsCnvMccr
		       ,8
		      );
		 localX360AMcsMdsCnvMccrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsMdsCnvMccr;
    }

   protected long checkX360AMcsMdsCnvMccrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsMdsCnvMccr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsCnvMccr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsMdsCnvMccr
			                 ,X_360_AMCS_MDS_CNV_MCCR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsCnvMccr", beginX360AMcsMdsCnvMccr,X_360_AMCS_MDS_CNV_MCCR_LEN);
    }
   	}
        int localX360AMcsMdsIccrAmtCounter = -1;
        public boolean isX360AMcsMdsIccrAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AMcsMdsIccrAmtCounter != sharedCounter;
           localX360AMcsMdsIccrAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AMcsMdsIccrAmtIsNumeric() {
	      return decimalIsNumeric(beginX360AMcsMdsIccrAmt,X_360_AMCS_MDS_ICCR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AMCS_MDS_ICCR_AMT_LEN = 8;
  	/**
	 * 	serializeX360AMcsMdsIccrAmt
	 */
	protected void serializeX360AMcsMdsIccrAmt(long x360AMcsMdsIccrAmt) {
		   putDecimal(beginX360AMcsMdsIccrAmt,x360AMcsMdsIccrAmt,X_360_AMCS_MDS_ICCR_AMT_LEN,true);
   }
   

   protected long checkX360AMcsMdsIccrAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AMcsMdsIccrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsIccrAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AMcsMdsIccrAmt,X_360_AMCS_MDS_ICCR_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsIccrAmt", beginX360AMcsMdsIccrAmt,X_360_AMCS_MDS_ICCR_AMT_LEN);
     }
   	}
     int localX360AMcsMdsCnvIccrCounter = -1;
     public boolean isX360AMcsMdsCnvIccrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360AMcsMdsCnvIccrCounter != sharedCounter;
         localX360AMcsMdsCnvIccrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360AMcsMdsCnvIccr
	 *	@return x360AMcsMdsCnvIccr
	 */
	public char[]  getX360AMcsMdsCnvIccrString() {
	     return getCharArray(beginX360AMcsMdsCnvIccr,X_360_AMCS_MDS_CNV_ICCR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360AMcsMdsCnvIccrIsNumeric() {
	    return isNumeric(beginX360AMcsMdsCnvIccr
	                    ,beginX360AMcsMdsCnvIccr + X_360_AMCS_MDS_CNV_ICCR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_AMCS_MDS_CNV_ICCR_LEN = 8;
  	/**
	 * serializeX360AMcsMdsCnvIccr
	 */
	protected void serializeX360AMcsMdsCnvIccr(long x360AMcsMdsCnvIccr) {
		 putNumber(beginX360AMcsMdsCnvIccr,x360AMcsMdsCnvIccr,X_360_AMCS_MDS_CNV_ICCR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360AMcsMdsCnvIccrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360AMcsMdsCnvIccr
	 */
   	protected  long serializeX360AMcsMdsCnvIccr(char[] value) {
	    long  x360AMcsMdsCnvIccr;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360AMcsMdsCnvIccr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360AMcsMdsCnvIccr
		       ,8
		      );
		 localX360AMcsMdsCnvIccrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360AMcsMdsCnvIccr;
    }

   protected long checkX360AMcsMdsCnvIccrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360AMcsMdsCnvIccr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AMcsMdsCnvIccr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360AMcsMdsCnvIccr
			                 ,X_360_AMCS_MDS_CNV_ICCR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360AMcsMdsCnvIccr", beginX360AMcsMdsCnvIccr,X_360_AMCS_MDS_CNV_ICCR_LEN);
    }
   	}
        int localX360ABaseIfeeAmtIssCrCounter = -1;
        public boolean isX360ABaseIfeeAmtIssCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360ABaseIfeeAmtIssCrCounter != sharedCounter;
           localX360ABaseIfeeAmtIssCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360ABaseIfeeAmtIssCrIsNumeric() {
	      return decimalIsNumeric(beginX360ABaseIfeeAmtIssCr,X_360_ABASE_IFEE_AMT_ISS_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_ABASE_IFEE_AMT_ISS_CR_LEN = 8;
  	/**
	 * 	serializeX360ABaseIfeeAmtIssCr
	 */
	protected void serializeX360ABaseIfeeAmtIssCr(long x360ABaseIfeeAmtIssCr) {
		   putDecimal(beginX360ABaseIfeeAmtIssCr,x360ABaseIfeeAmtIssCr,X_360_ABASE_IFEE_AMT_ISS_CR_LEN,true);
   }
   

   protected long checkX360ABaseIfeeAmtIssCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360ABaseIfeeAmtIssCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360ABaseIfeeAmtIssCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360ABaseIfeeAmtIssCr,X_360_ABASE_IFEE_AMT_ISS_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360ABaseIfeeAmtIssCr", beginX360ABaseIfeeAmtIssCr,X_360_ABASE_IFEE_AMT_ISS_CR_LEN);
     }
   	}
        int localX360ABaseIfeeAmtIssDbCounter = -1;
        public boolean isX360ABaseIfeeAmtIssDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360ABaseIfeeAmtIssDbCounter != sharedCounter;
           localX360ABaseIfeeAmtIssDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360ABaseIfeeAmtIssDbIsNumeric() {
	      return decimalIsNumeric(beginX360ABaseIfeeAmtIssDb,X_360_ABASE_IFEE_AMT_ISS_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_ABASE_IFEE_AMT_ISS_DB_LEN = 8;
  	/**
	 * 	serializeX360ABaseIfeeAmtIssDb
	 */
	protected void serializeX360ABaseIfeeAmtIssDb(long x360ABaseIfeeAmtIssDb) {
		   putDecimal(beginX360ABaseIfeeAmtIssDb,x360ABaseIfeeAmtIssDb,X_360_ABASE_IFEE_AMT_ISS_DB_LEN,true);
   }
   

   protected long checkX360ABaseIfeeAmtIssDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360ABaseIfeeAmtIssDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360ABaseIfeeAmtIssDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360ABaseIfeeAmtIssDb,X_360_ABASE_IFEE_AMT_ISS_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360ABaseIfeeAmtIssDb", beginX360ABaseIfeeAmtIssDb,X_360_ABASE_IFEE_AMT_ISS_DB_LEN);
     }
   	}
     int localX360ABseToLocRateCounter = -1;
     
     public boolean isX360ABseToLocRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360ABseToLocRateCounter != sharedCounter;
         localX360ABseToLocRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of x360ABseToLocRate
	 *	@return x360ABseToLocRate
	 */
	public char[]  getX360ABseToLocRateString() {
	    return getCharArray(beginX360ABseToLocRate,X_360_ABSE_TO_LOC_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360ABseToLocRateIsNumeric() {
		    return isNumeric(beginX360ABseToLocRate
	                    ,beginX360ABseToLocRate + X_360_ABSE_TO_LOC_RATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int X_360_ABSE_TO_LOC_RATE_LEN = 15;
  protected  static final int X_360_ABSE_TO_LOC_RATE_SCALE = 7;

   protected BigDecimal checkX360ABseToLocRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeX360ABseToLocRate
	 */
	protected void serializeX360ABseToLocRate(BigDecimal x360ABseToLocRate) {
	       putNumber(beginX360ABseToLocRate,x360ABseToLocRate,X_360_ABSE_TO_LOC_RATE_LEN,X_360_ABSE_TO_LOC_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360ABseToLocRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeX360ABseToLocRate
	 */
   	protected  BigDecimal serializeX360ABseToLocRate(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginX360ABseToLocRate
		       ,15
		      );		 localX360ABseToLocRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,X_360_ABSE_TO_LOC_RATE_LEN,X_360_ABSE_TO_LOC_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("x360ABseToLocRate", beginX360ABseToLocRate,X_360_ABSE_TO_LOC_RATE_LEN);
    	}
    }
    /**
	 *	refreshX360ABseToLocRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360ABseToLocRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginX360ABseToLocRate
			            ,X_360_ABSE_TO_LOC_RATE_LEN
			            ,X_360_ABSE_TO_LOC_RATE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("x360ABseToLocRate", beginX360ABseToLocRate,X_360_ABSE_TO_LOC_RATE_LEN);
    }
   	}
        int localX360ABaseIfeeAmtAcqCrCounter = -1;
        public boolean isX360ABaseIfeeAmtAcqCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360ABaseIfeeAmtAcqCrCounter != sharedCounter;
           localX360ABaseIfeeAmtAcqCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360ABaseIfeeAmtAcqCrIsNumeric() {
	      return decimalIsNumeric(beginX360ABaseIfeeAmtAcqCr,X_360_ABASE_IFEE_AMT_ACQ_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_ABASE_IFEE_AMT_ACQ_CR_LEN = 8;
  	/**
	 * 	serializeX360ABaseIfeeAmtAcqCr
	 */
	protected void serializeX360ABaseIfeeAmtAcqCr(long x360ABaseIfeeAmtAcqCr) {
		   putDecimal(beginX360ABaseIfeeAmtAcqCr,x360ABaseIfeeAmtAcqCr,X_360_ABASE_IFEE_AMT_ACQ_CR_LEN,true);
   }
   

   protected long checkX360ABaseIfeeAmtAcqCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360ABaseIfeeAmtAcqCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360ABaseIfeeAmtAcqCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360ABaseIfeeAmtAcqCr,X_360_ABASE_IFEE_AMT_ACQ_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360ABaseIfeeAmtAcqCr", beginX360ABaseIfeeAmtAcqCr,X_360_ABASE_IFEE_AMT_ACQ_CR_LEN);
     }
   	}
        int localX360ABaseIfeeAmtAcqDbCounter = -1;
        public boolean isX360ABaseIfeeAmtAcqDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360ABaseIfeeAmtAcqDbCounter != sharedCounter;
           localX360ABaseIfeeAmtAcqDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360ABaseIfeeAmtAcqDbIsNumeric() {
	      return decimalIsNumeric(beginX360ABaseIfeeAmtAcqDb,X_360_ABASE_IFEE_AMT_ACQ_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_ABASE_IFEE_AMT_ACQ_DB_LEN = 8;
  	/**
	 * 	serializeX360ABaseIfeeAmtAcqDb
	 */
	protected void serializeX360ABaseIfeeAmtAcqDb(long x360ABaseIfeeAmtAcqDb) {
		   putDecimal(beginX360ABaseIfeeAmtAcqDb,x360ABaseIfeeAmtAcqDb,X_360_ABASE_IFEE_AMT_ACQ_DB_LEN,true);
   }
   

   protected long checkX360ABaseIfeeAmtAcqDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360ABaseIfeeAmtAcqDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360ABaseIfeeAmtAcqDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360ABaseIfeeAmtAcqDb,X_360_ABASE_IFEE_AMT_ACQ_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360ABaseIfeeAmtAcqDb", beginX360ABaseIfeeAmtAcqDb,X_360_ABASE_IFEE_AMT_ACQ_DB_LEN);
     }
   	}
        int localX360AAcqA09IfeeAmtCrCounter = -1;
        public boolean isX360AAcqA09IfeeAmtCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09IfeeAmtCrCounter != sharedCounter;
           localX360AAcqA09IfeeAmtCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09IfeeAmtCrIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09IfeeAmtCr,X_360_AACQ_A_09_IFEE_AMT_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_IFEE_AMT_CR_LEN = 8;
  	/**
	 * 	serializeX360AAcqA09IfeeAmtCr
	 */
	protected void serializeX360AAcqA09IfeeAmtCr(long x360AAcqA09IfeeAmtCr) {
		   putDecimal(beginX360AAcqA09IfeeAmtCr,x360AAcqA09IfeeAmtCr,X_360_AACQ_A_09_IFEE_AMT_CR_LEN,true);
   }
   

   protected long checkX360AAcqA09IfeeAmtCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09IfeeAmtCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqA09IfeeAmtCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqA09IfeeAmtCr,X_360_AACQ_A_09_IFEE_AMT_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09IfeeAmtCr", beginX360AAcqA09IfeeAmtCr,X_360_AACQ_A_09_IFEE_AMT_CR_LEN);
     }
   	}
        int localX360AAcqA09IfeeAmtDbCounter = -1;
        public boolean isX360AAcqA09IfeeAmtDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360AAcqA09IfeeAmtDbCounter != sharedCounter;
           localX360AAcqA09IfeeAmtDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360AAcqA09IfeeAmtDbIsNumeric() {
	      return decimalIsNumeric(beginX360AAcqA09IfeeAmtDb,X_360_AACQ_A_09_IFEE_AMT_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_AACQ_A_09_IFEE_AMT_DB_LEN = 8;
  	/**
	 * 	serializeX360AAcqA09IfeeAmtDb
	 */
	protected void serializeX360AAcqA09IfeeAmtDb(long x360AAcqA09IfeeAmtDb) {
		   putDecimal(beginX360AAcqA09IfeeAmtDb,x360AAcqA09IfeeAmtDb,X_360_AACQ_A_09_IFEE_AMT_DB_LEN,true);
   }
   

   protected long checkX360AAcqA09IfeeAmtDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360AAcqA09IfeeAmtDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360AAcqA09IfeeAmtDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360AAcqA09IfeeAmtDb,X_360_AACQ_A_09_IFEE_AMT_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360AAcqA09IfeeAmtDb", beginX360AAcqA09IfeeAmtDb,X_360_AACQ_A_09_IFEE_AMT_DB_LEN);
     }
   	}




}
  
