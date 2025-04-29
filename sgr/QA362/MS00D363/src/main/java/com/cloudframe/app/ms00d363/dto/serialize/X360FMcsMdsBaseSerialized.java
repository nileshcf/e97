package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FMcsMdsBaseSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FMcsMdsBaseSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FMcsMdsBaseSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FMCS_MDS_BASE_LENGTH = 119;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FMcsMdsReqAmt;
            protected  int beginX360FMcsMdsCmpAmt;
            protected  int beginX360FMcsMdsCnvRteBse;
            protected  int beginX360FMcsMdsMccrAmt;
            protected  int beginX360FMcsMdsCnvMccr;
            protected  int beginX360FMcsMdsIccrAmt;
            protected  int beginX360FMcsMdsCnvIccr;
            protected  int beginX360FBaseIfeeAmtIssCr;
            protected  int beginX360FBaseIfeeAmtIssDb;
            protected  int beginX360FBseToLocRate;
            protected  int beginX360FBaseIfeeAmtAcqCr;
            protected  int beginX360FBaseIfeeAmtAcqDb;
            protected  int beginX360FAcqIssDeniedAmt;
	
	/**
	* Constructor for X360FMcsMdsBaseSerialized
	**/
    public X360FMcsMdsBaseSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FMcsMdsBaseSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FMcsMdsBaseSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FMcsMdsBaseSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,224); // serialize this field at offset 224 by default 
    }
    
	/**
	* sets parent for this X360FMcsMdsBaseSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 224 by default
    }    
	/**
	* initializes the field in X360FMcsMdsBaseSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FMCS_MDS_BASE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FMcsMdsReqAmt = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FMcsMdsCmpAmt = getStartOffset() + 8;	// set offset for serialization
  
             beginX360FMcsMdsCnvRteBse = getStartOffset() + 16;	// set offset for serialization
  
             beginX360FMcsMdsMccrAmt = getStartOffset() + 24;	// set offset for serialization
  
             beginX360FMcsMdsCnvMccr = getStartOffset() + 32;	// set offset for serialization
  
             beginX360FMcsMdsIccrAmt = getStartOffset() + 40;	// set offset for serialization
  
             beginX360FMcsMdsCnvIccr = getStartOffset() + 48;	// set offset for serialization
  
             beginX360FBaseIfeeAmtIssCr = getStartOffset() + 56;	// set offset for serialization
  
             beginX360FBaseIfeeAmtIssDb = getStartOffset() + 64;	// set offset for serialization
  
             beginX360FBseToLocRate = getStartOffset() + 72;	// set offset for serialization
  
             beginX360FBaseIfeeAmtAcqCr = getStartOffset() + 87;	// set offset for serialization
  
             beginX360FBaseIfeeAmtAcqDb = getStartOffset() + 95;	// set offset for serialization
  
             beginX360FAcqIssDeniedAmt = getStartOffset() + 103;	// set offset for serialization
  
  
	   /*  end of offset */
	}
        int localX360FMcsMdsReqAmtCounter = -1;
        public boolean isX360FMcsMdsReqAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsMdsReqAmtCounter != sharedCounter;
           localX360FMcsMdsReqAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsMdsReqAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsMdsReqAmt,X_360_FMCS_MDS_REQ_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_MDS_REQ_AMT_LEN = 8;
  	/**
	 * 	serializeX360FMcsMdsReqAmt
	 */
	protected void serializeX360FMcsMdsReqAmt(long x360FMcsMdsReqAmt) {
		   putDecimal(beginX360FMcsMdsReqAmt,x360FMcsMdsReqAmt,X_360_FMCS_MDS_REQ_AMT_LEN,true);
   }
   

   protected long checkX360FMcsMdsReqAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsMdsReqAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsMdsReqAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsMdsReqAmt,X_360_FMCS_MDS_REQ_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsMdsReqAmt", beginX360FMcsMdsReqAmt,X_360_FMCS_MDS_REQ_AMT_LEN);
     }
   	}
        int localX360FMcsMdsCmpAmtCounter = -1;
        public boolean isX360FMcsMdsCmpAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsMdsCmpAmtCounter != sharedCounter;
           localX360FMcsMdsCmpAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsMdsCmpAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsMdsCmpAmt,X_360_FMCS_MDS_CMP_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_MDS_CMP_AMT_LEN = 8;
  	/**
	 * 	serializeX360FMcsMdsCmpAmt
	 */
	protected void serializeX360FMcsMdsCmpAmt(long x360FMcsMdsCmpAmt) {
		   putDecimal(beginX360FMcsMdsCmpAmt,x360FMcsMdsCmpAmt,X_360_FMCS_MDS_CMP_AMT_LEN,true);
   }
   

   protected long checkX360FMcsMdsCmpAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsMdsCmpAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsMdsCmpAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsMdsCmpAmt,X_360_FMCS_MDS_CMP_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsMdsCmpAmt", beginX360FMcsMdsCmpAmt,X_360_FMCS_MDS_CMP_AMT_LEN);
     }
   	}
     int localX360FMcsMdsCnvRteBseCounter = -1;
     public boolean isX360FMcsMdsCnvRteBseModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsMdsCnvRteBseCounter != sharedCounter;
         localX360FMcsMdsCnvRteBseCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsMdsCnvRteBse
	 *	@return x360FMcsMdsCnvRteBse
	 */
	public char[]  getX360FMcsMdsCnvRteBseString() {
	     return getCharArray(beginX360FMcsMdsCnvRteBse,X_360_FMCS_MDS_CNV_RTE_BSE_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsMdsCnvRteBseIsNumeric() {
	    return isNumeric(beginX360FMcsMdsCnvRteBse
	                    ,beginX360FMcsMdsCnvRteBse + X_360_FMCS_MDS_CNV_RTE_BSE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_MDS_CNV_RTE_BSE_LEN = 8;
  	/**
	 * serializeX360FMcsMdsCnvRteBse
	 */
	protected void serializeX360FMcsMdsCnvRteBse(long x360FMcsMdsCnvRteBse) {
		 putNumber(beginX360FMcsMdsCnvRteBse,x360FMcsMdsCnvRteBse,X_360_FMCS_MDS_CNV_RTE_BSE_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsMdsCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsMdsCnvRteBse
	 */
   	protected  long serializeX360FMcsMdsCnvRteBse(char[] value) {
	    long  x360FMcsMdsCnvRteBse;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsMdsCnvRteBse = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360FMcsMdsCnvRteBse
		       ,8
		      );
		 localX360FMcsMdsCnvRteBseCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsMdsCnvRteBse;
    }

   protected long checkX360FMcsMdsCnvRteBseMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsMdsCnvRteBse is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsMdsCnvRteBse() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsMdsCnvRteBse
			                 ,X_360_FMCS_MDS_CNV_RTE_BSE_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsMdsCnvRteBse", beginX360FMcsMdsCnvRteBse,X_360_FMCS_MDS_CNV_RTE_BSE_LEN);
    }
   	}
        int localX360FMcsMdsMccrAmtCounter = -1;
        public boolean isX360FMcsMdsMccrAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsMdsMccrAmtCounter != sharedCounter;
           localX360FMcsMdsMccrAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsMdsMccrAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsMdsMccrAmt,X_360_FMCS_MDS_MCCR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_MDS_MCCR_AMT_LEN = 8;
  	/**
	 * 	serializeX360FMcsMdsMccrAmt
	 */
	protected void serializeX360FMcsMdsMccrAmt(long x360FMcsMdsMccrAmt) {
		   putDecimal(beginX360FMcsMdsMccrAmt,x360FMcsMdsMccrAmt,X_360_FMCS_MDS_MCCR_AMT_LEN,true);
   }
   

   protected long checkX360FMcsMdsMccrAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsMdsMccrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsMdsMccrAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsMdsMccrAmt,X_360_FMCS_MDS_MCCR_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsMdsMccrAmt", beginX360FMcsMdsMccrAmt,X_360_FMCS_MDS_MCCR_AMT_LEN);
     }
   	}
     int localX360FMcsMdsCnvMccrCounter = -1;
     public boolean isX360FMcsMdsCnvMccrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsMdsCnvMccrCounter != sharedCounter;
         localX360FMcsMdsCnvMccrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsMdsCnvMccr
	 *	@return x360FMcsMdsCnvMccr
	 */
	public char[]  getX360FMcsMdsCnvMccrString() {
	     return getCharArray(beginX360FMcsMdsCnvMccr,X_360_FMCS_MDS_CNV_MCCR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsMdsCnvMccrIsNumeric() {
	    return isNumeric(beginX360FMcsMdsCnvMccr
	                    ,beginX360FMcsMdsCnvMccr + X_360_FMCS_MDS_CNV_MCCR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_MDS_CNV_MCCR_LEN = 8;
  	/**
	 * serializeX360FMcsMdsCnvMccr
	 */
	protected void serializeX360FMcsMdsCnvMccr(long x360FMcsMdsCnvMccr) {
		 putNumber(beginX360FMcsMdsCnvMccr,x360FMcsMdsCnvMccr,X_360_FMCS_MDS_CNV_MCCR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsMdsCnvMccrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsMdsCnvMccr
	 */
   	protected  long serializeX360FMcsMdsCnvMccr(char[] value) {
	    long  x360FMcsMdsCnvMccr;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsMdsCnvMccr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360FMcsMdsCnvMccr
		       ,8
		      );
		 localX360FMcsMdsCnvMccrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsMdsCnvMccr;
    }

   protected long checkX360FMcsMdsCnvMccrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsMdsCnvMccr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsMdsCnvMccr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsMdsCnvMccr
			                 ,X_360_FMCS_MDS_CNV_MCCR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsMdsCnvMccr", beginX360FMcsMdsCnvMccr,X_360_FMCS_MDS_CNV_MCCR_LEN);
    }
   	}
        int localX360FMcsMdsIccrAmtCounter = -1;
        public boolean isX360FMcsMdsIccrAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FMcsMdsIccrAmtCounter != sharedCounter;
           localX360FMcsMdsIccrAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FMcsMdsIccrAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FMcsMdsIccrAmt,X_360_FMCS_MDS_ICCR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FMCS_MDS_ICCR_AMT_LEN = 8;
  	/**
	 * 	serializeX360FMcsMdsIccrAmt
	 */
	protected void serializeX360FMcsMdsIccrAmt(long x360FMcsMdsIccrAmt) {
		   putDecimal(beginX360FMcsMdsIccrAmt,x360FMcsMdsIccrAmt,X_360_FMCS_MDS_ICCR_AMT_LEN,true);
   }
   

   protected long checkX360FMcsMdsIccrAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FMcsMdsIccrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsMdsIccrAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FMcsMdsIccrAmt,X_360_FMCS_MDS_ICCR_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsMdsIccrAmt", beginX360FMcsMdsIccrAmt,X_360_FMCS_MDS_ICCR_AMT_LEN);
     }
   	}
     int localX360FMcsMdsCnvIccrCounter = -1;
     public boolean isX360FMcsMdsCnvIccrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FMcsMdsCnvIccrCounter != sharedCounter;
         localX360FMcsMdsCnvIccrCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of x360FMcsMdsCnvIccr
	 *	@return x360FMcsMdsCnvIccr
	 */
	public char[]  getX360FMcsMdsCnvIccrString() {
	     return getCharArray(beginX360FMcsMdsCnvIccr,X_360_FMCS_MDS_CNV_ICCR_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FMcsMdsCnvIccrIsNumeric() {
	    return isNumeric(beginX360FMcsMdsCnvIccr
	                    ,beginX360FMcsMdsCnvIccr + X_360_FMCS_MDS_CNV_ICCR_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int X_360_FMCS_MDS_CNV_ICCR_LEN = 8;
  	/**
	 * serializeX360FMcsMdsCnvIccr
	 */
	protected void serializeX360FMcsMdsCnvIccr(long x360FMcsMdsCnvIccr) {
		 putNumber(beginX360FMcsMdsCnvIccr,x360FMcsMdsCnvIccr,X_360_FMCS_MDS_CNV_ICCR_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FMcsMdsCnvIccrCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeX360FMcsMdsCnvIccr
	 */
   	protected  long serializeX360FMcsMdsCnvIccr(char[] value) {
	    long  x360FMcsMdsCnvIccr;
	    if(value.length >0 && value.length!= 8)
            value = new String(value).trim().toCharArray();
	    if (value.length < 8) value = pad(8, value, ' ', LEFT_PAD);
	    else if (value.length > 8) value = substring(value,0,8);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    x360FMcsMdsCnvIccr = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(8,value,false/*isSigned?*/)
		       ,beginX360FMcsMdsCnvIccr
		       ,8
		      );
		 localX360FMcsMdsCnvIccrCounter = shareString.getSerializedField().getModifiedCounter();
		return  x360FMcsMdsCnvIccr;
    }

   protected long checkX360FMcsMdsCnvIccrMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100M/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshX360FMcsMdsCnvIccr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FMcsMdsCnvIccr() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginX360FMcsMdsCnvIccr
			                 ,X_360_FMCS_MDS_CNV_ICCR_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FMcsMdsCnvIccr", beginX360FMcsMdsCnvIccr,X_360_FMCS_MDS_CNV_ICCR_LEN);
    }
   	}
        int localX360FBaseIfeeAmtIssCrCounter = -1;
        public boolean isX360FBaseIfeeAmtIssCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBaseIfeeAmtIssCrCounter != sharedCounter;
           localX360FBaseIfeeAmtIssCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBaseIfeeAmtIssCrIsNumeric() {
	      return decimalIsNumeric(beginX360FBaseIfeeAmtIssCr,X_360_FBASE_IFEE_AMT_ISS_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBASE_IFEE_AMT_ISS_CR_LEN = 8;
  	/**
	 * 	serializeX360FBaseIfeeAmtIssCr
	 */
	protected void serializeX360FBaseIfeeAmtIssCr(long x360FBaseIfeeAmtIssCr) {
		   putDecimal(beginX360FBaseIfeeAmtIssCr,x360FBaseIfeeAmtIssCr,X_360_FBASE_IFEE_AMT_ISS_CR_LEN,true);
   }
   

   protected long checkX360FBaseIfeeAmtIssCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBaseIfeeAmtIssCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBaseIfeeAmtIssCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBaseIfeeAmtIssCr,X_360_FBASE_IFEE_AMT_ISS_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBaseIfeeAmtIssCr", beginX360FBaseIfeeAmtIssCr,X_360_FBASE_IFEE_AMT_ISS_CR_LEN);
     }
   	}
        int localX360FBaseIfeeAmtIssDbCounter = -1;
        public boolean isX360FBaseIfeeAmtIssDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBaseIfeeAmtIssDbCounter != sharedCounter;
           localX360FBaseIfeeAmtIssDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBaseIfeeAmtIssDbIsNumeric() {
	      return decimalIsNumeric(beginX360FBaseIfeeAmtIssDb,X_360_FBASE_IFEE_AMT_ISS_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBASE_IFEE_AMT_ISS_DB_LEN = 8;
  	/**
	 * 	serializeX360FBaseIfeeAmtIssDb
	 */
	protected void serializeX360FBaseIfeeAmtIssDb(long x360FBaseIfeeAmtIssDb) {
		   putDecimal(beginX360FBaseIfeeAmtIssDb,x360FBaseIfeeAmtIssDb,X_360_FBASE_IFEE_AMT_ISS_DB_LEN,true);
   }
   

   protected long checkX360FBaseIfeeAmtIssDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBaseIfeeAmtIssDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBaseIfeeAmtIssDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBaseIfeeAmtIssDb,X_360_FBASE_IFEE_AMT_ISS_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBaseIfeeAmtIssDb", beginX360FBaseIfeeAmtIssDb,X_360_FBASE_IFEE_AMT_ISS_DB_LEN);
     }
   	}
     int localX360FBseToLocRateCounter = -1;
     
     public boolean isX360FBseToLocRateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localX360FBseToLocRateCounter != sharedCounter;
         localX360FBseToLocRateCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of x360FBseToLocRate
	 *	@return x360FBseToLocRate
	 */
	public char[]  getX360FBseToLocRateString() {
	    return getCharArray(beginX360FBseToLocRate,X_360_FBSE_TO_LOC_RATE_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean x360FBseToLocRateIsNumeric() {
		    return isNumeric(beginX360FBseToLocRate
	                    ,beginX360FBseToLocRate + X_360_FBSE_TO_LOC_RATE_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int X_360_FBSE_TO_LOC_RATE_LEN = 15;
  protected  static final int X_360_FBSE_TO_LOC_RATE_SCALE = 7;

   protected BigDecimal checkX360FBseToLocRateMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,7/*scale*/,15/*precision*/);
   }

  	/**
	 * serializeX360FBseToLocRate
	 */
	protected void serializeX360FBseToLocRate(BigDecimal x360FBseToLocRate) {
	       putNumber(beginX360FBseToLocRate,x360FBseToLocRate,X_360_FBSE_TO_LOC_RATE_LEN,X_360_FBSE_TO_LOC_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localX360FBseToLocRateCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeX360FBseToLocRate
	 */
   	protected  BigDecimal serializeX360FBseToLocRate(char[] value) throws CFException {
        if (value.length < 15) value = pad(15, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(15,value,false/*isSigned?*/)
		       ,beginX360FBseToLocRate
		       ,15
		      );		 localX360FBseToLocRateCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,X_360_FBSE_TO_LOC_RATE_LEN,X_360_FBSE_TO_LOC_RATE_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("x360FBseToLocRate", beginX360FBseToLocRate,X_360_FBSE_TO_LOC_RATE_LEN);
    	}
    }
    /**
	 *	refreshX360FBseToLocRate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FBseToLocRate() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginX360FBseToLocRate
			            ,X_360_FBSE_TO_LOC_RATE_LEN
			            ,X_360_FBSE_TO_LOC_RATE_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("x360FBseToLocRate", beginX360FBseToLocRate,X_360_FBSE_TO_LOC_RATE_LEN);
    }
   	}
        int localX360FBaseIfeeAmtAcqCrCounter = -1;
        public boolean isX360FBaseIfeeAmtAcqCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBaseIfeeAmtAcqCrCounter != sharedCounter;
           localX360FBaseIfeeAmtAcqCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBaseIfeeAmtAcqCrIsNumeric() {
	      return decimalIsNumeric(beginX360FBaseIfeeAmtAcqCr,X_360_FBASE_IFEE_AMT_ACQ_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBASE_IFEE_AMT_ACQ_CR_LEN = 8;
  	/**
	 * 	serializeX360FBaseIfeeAmtAcqCr
	 */
	protected void serializeX360FBaseIfeeAmtAcqCr(long x360FBaseIfeeAmtAcqCr) {
		   putDecimal(beginX360FBaseIfeeAmtAcqCr,x360FBaseIfeeAmtAcqCr,X_360_FBASE_IFEE_AMT_ACQ_CR_LEN,true);
   }
   

   protected long checkX360FBaseIfeeAmtAcqCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBaseIfeeAmtAcqCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBaseIfeeAmtAcqCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBaseIfeeAmtAcqCr,X_360_FBASE_IFEE_AMT_ACQ_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBaseIfeeAmtAcqCr", beginX360FBaseIfeeAmtAcqCr,X_360_FBASE_IFEE_AMT_ACQ_CR_LEN);
     }
   	}
        int localX360FBaseIfeeAmtAcqDbCounter = -1;
        public boolean isX360FBaseIfeeAmtAcqDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FBaseIfeeAmtAcqDbCounter != sharedCounter;
           localX360FBaseIfeeAmtAcqDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FBaseIfeeAmtAcqDbIsNumeric() {
	      return decimalIsNumeric(beginX360FBaseIfeeAmtAcqDb,X_360_FBASE_IFEE_AMT_ACQ_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FBASE_IFEE_AMT_ACQ_DB_LEN = 8;
  	/**
	 * 	serializeX360FBaseIfeeAmtAcqDb
	 */
	protected void serializeX360FBaseIfeeAmtAcqDb(long x360FBaseIfeeAmtAcqDb) {
		   putDecimal(beginX360FBaseIfeeAmtAcqDb,x360FBaseIfeeAmtAcqDb,X_360_FBASE_IFEE_AMT_ACQ_DB_LEN,true);
   }
   

   protected long checkX360FBaseIfeeAmtAcqDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FBaseIfeeAmtAcqDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FBaseIfeeAmtAcqDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FBaseIfeeAmtAcqDb,X_360_FBASE_IFEE_AMT_ACQ_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FBaseIfeeAmtAcqDb", beginX360FBaseIfeeAmtAcqDb,X_360_FBASE_IFEE_AMT_ACQ_DB_LEN);
     }
   	}
        int localX360FAcqIssDeniedAmtCounter = -1;
        public boolean isX360FAcqIssDeniedAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqIssDeniedAmtCounter != sharedCounter;
           localX360FAcqIssDeniedAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqIssDeniedAmtIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqIssDeniedAmt,X_360_FACQ_ISS_DENIED_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_ISS_DENIED_AMT_LEN = 8;
  	/**
	 * 	serializeX360FAcqIssDeniedAmt
	 */
	protected void serializeX360FAcqIssDeniedAmt(long x360FAcqIssDeniedAmt) {
		   putDecimal(beginX360FAcqIssDeniedAmt,x360FAcqIssDeniedAmt,X_360_FACQ_ISS_DENIED_AMT_LEN,true);
   }
   

   protected long checkX360FAcqIssDeniedAmtMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqIssDeniedAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqIssDeniedAmt() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqIssDeniedAmt,X_360_FACQ_ISS_DENIED_AMT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqIssDeniedAmt", beginX360FAcqIssDeniedAmt,X_360_FACQ_ISS_DENIED_AMT_LEN);
     }
   	}




}
  
