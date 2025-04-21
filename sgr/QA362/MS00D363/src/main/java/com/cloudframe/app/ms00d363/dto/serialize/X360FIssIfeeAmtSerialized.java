package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FIssIfeeAmtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FIssIfeeAmtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FIssIfeeAmtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FISS_IFEE_AMT_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FIssFinIfeeDb;
            protected  int beginX360FIssFinIfeeCr;
            protected  int beginX360FIssNfIfeeDb;
            protected  int beginX360FIssNfIfeeCr;
            protected  int beginX360FIssPctIfeeDb;
            protected  int beginX360FIssPctIfeeCr;
            protected  int beginX360FIssNobillIfeeDb;
            protected  int beginX360FIssNobillIfeeCr;
	
	/**
	* Constructor for X360FIssIfeeAmtSerialized
	**/
    public X360FIssIfeeAmtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FIssIfeeAmtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssIfeeAmtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FIssIfeeAmtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1233); // serialize this field at offset 1233 by default 
    }
    
	/**
	* sets parent for this X360FIssIfeeAmtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1233 by default
    }    
	/**
	* initializes the field in X360FIssIfeeAmtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FISS_IFEE_AMT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FIssFinIfeeDb = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FIssFinIfeeCr = getStartOffset() + 8;	// set offset for serialization
  
             beginX360FIssNfIfeeDb = getStartOffset() + 16;	// set offset for serialization
  
             beginX360FIssNfIfeeCr = getStartOffset() + 24;	// set offset for serialization
  
             beginX360FIssPctIfeeDb = getStartOffset() + 32;	// set offset for serialization
  
             beginX360FIssPctIfeeCr = getStartOffset() + 40;	// set offset for serialization
  
             beginX360FIssNobillIfeeDb = getStartOffset() + 48;	// set offset for serialization
  
             beginX360FIssNobillIfeeCr = getStartOffset() + 56;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FIssFinIfeeDbCounter = -1;
        public boolean isX360FIssFinIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssFinIfeeDbCounter != sharedCounter;
           localX360FIssFinIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssFinIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssFinIfeeDb,X_360_FISS_FIN_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_FIN_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssFinIfeeDb
	 */
	protected void serializeX360FIssFinIfeeDb(long x360FIssFinIfeeDb) {
		   putDecimal(beginX360FIssFinIfeeDb,x360FIssFinIfeeDb,X_360_FISS_FIN_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FIssFinIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssFinIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssFinIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssFinIfeeDb,X_360_FISS_FIN_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssFinIfeeDb", beginX360FIssFinIfeeDb,X_360_FISS_FIN_IFEE_DB_LEN);
     }
   	}
        int localX360FIssFinIfeeCrCounter = -1;
        public boolean isX360FIssFinIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssFinIfeeCrCounter != sharedCounter;
           localX360FIssFinIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssFinIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssFinIfeeCr,X_360_FISS_FIN_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_FIN_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssFinIfeeCr
	 */
	protected void serializeX360FIssFinIfeeCr(long x360FIssFinIfeeCr) {
		   putDecimal(beginX360FIssFinIfeeCr,x360FIssFinIfeeCr,X_360_FISS_FIN_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FIssFinIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssFinIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssFinIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssFinIfeeCr,X_360_FISS_FIN_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssFinIfeeCr", beginX360FIssFinIfeeCr,X_360_FISS_FIN_IFEE_CR_LEN);
     }
   	}
        int localX360FIssNfIfeeDbCounter = -1;
        public boolean isX360FIssNfIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssNfIfeeDbCounter != sharedCounter;
           localX360FIssNfIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssNfIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssNfIfeeDb,X_360_FISS_NF_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_NF_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssNfIfeeDb
	 */
	protected void serializeX360FIssNfIfeeDb(long x360FIssNfIfeeDb) {
		   putDecimal(beginX360FIssNfIfeeDb,x360FIssNfIfeeDb,X_360_FISS_NF_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FIssNfIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssNfIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssNfIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssNfIfeeDb,X_360_FISS_NF_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssNfIfeeDb", beginX360FIssNfIfeeDb,X_360_FISS_NF_IFEE_DB_LEN);
     }
   	}
        int localX360FIssNfIfeeCrCounter = -1;
        public boolean isX360FIssNfIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssNfIfeeCrCounter != sharedCounter;
           localX360FIssNfIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssNfIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssNfIfeeCr,X_360_FISS_NF_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_NF_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssNfIfeeCr
	 */
	protected void serializeX360FIssNfIfeeCr(long x360FIssNfIfeeCr) {
		   putDecimal(beginX360FIssNfIfeeCr,x360FIssNfIfeeCr,X_360_FISS_NF_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FIssNfIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssNfIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssNfIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssNfIfeeCr,X_360_FISS_NF_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssNfIfeeCr", beginX360FIssNfIfeeCr,X_360_FISS_NF_IFEE_CR_LEN);
     }
   	}
        int localX360FIssPctIfeeDbCounter = -1;
        public boolean isX360FIssPctIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssPctIfeeDbCounter != sharedCounter;
           localX360FIssPctIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssPctIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssPctIfeeDb,X_360_FISS_PCT_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_PCT_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssPctIfeeDb
	 */
	protected void serializeX360FIssPctIfeeDb(long x360FIssPctIfeeDb) {
		   putDecimal(beginX360FIssPctIfeeDb,x360FIssPctIfeeDb,X_360_FISS_PCT_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FIssPctIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssPctIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssPctIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssPctIfeeDb,X_360_FISS_PCT_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssPctIfeeDb", beginX360FIssPctIfeeDb,X_360_FISS_PCT_IFEE_DB_LEN);
     }
   	}
        int localX360FIssPctIfeeCrCounter = -1;
        public boolean isX360FIssPctIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssPctIfeeCrCounter != sharedCounter;
           localX360FIssPctIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssPctIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssPctIfeeCr,X_360_FISS_PCT_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_PCT_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssPctIfeeCr
	 */
	protected void serializeX360FIssPctIfeeCr(long x360FIssPctIfeeCr) {
		   putDecimal(beginX360FIssPctIfeeCr,x360FIssPctIfeeCr,X_360_FISS_PCT_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FIssPctIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssPctIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssPctIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssPctIfeeCr,X_360_FISS_PCT_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssPctIfeeCr", beginX360FIssPctIfeeCr,X_360_FISS_PCT_IFEE_CR_LEN);
     }
   	}
        int localX360FIssNobillIfeeDbCounter = -1;
        public boolean isX360FIssNobillIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssNobillIfeeDbCounter != sharedCounter;
           localX360FIssNobillIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssNobillIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FIssNobillIfeeDb,X_360_FISS_NOBILL_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_NOBILL_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FIssNobillIfeeDb
	 */
	protected void serializeX360FIssNobillIfeeDb(long x360FIssNobillIfeeDb) {
		   putDecimal(beginX360FIssNobillIfeeDb,x360FIssNobillIfeeDb,X_360_FISS_NOBILL_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FIssNobillIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssNobillIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssNobillIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssNobillIfeeDb,X_360_FISS_NOBILL_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssNobillIfeeDb", beginX360FIssNobillIfeeDb,X_360_FISS_NOBILL_IFEE_DB_LEN);
     }
   	}
        int localX360FIssNobillIfeeCrCounter = -1;
        public boolean isX360FIssNobillIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssNobillIfeeCrCounter != sharedCounter;
           localX360FIssNobillIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssNobillIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FIssNobillIfeeCr,X_360_FISS_NOBILL_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_NOBILL_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FIssNobillIfeeCr
	 */
	protected void serializeX360FIssNobillIfeeCr(long x360FIssNobillIfeeCr) {
		   putDecimal(beginX360FIssNobillIfeeCr,x360FIssNobillIfeeCr,X_360_FISS_NOBILL_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FIssNobillIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssNobillIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FIssNobillIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FIssNobillIfeeCr,X_360_FISS_NOBILL_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssNobillIfeeCr", beginX360FIssNobillIfeeCr,X_360_FISS_NOBILL_IFEE_CR_LEN);
     }
   	}




}
  
