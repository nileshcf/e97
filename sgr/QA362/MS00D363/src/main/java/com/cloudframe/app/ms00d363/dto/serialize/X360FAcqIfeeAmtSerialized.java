package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FAcqIfeeAmtSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FAcqIfeeAmtSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FAcqIfeeAmtSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FACQ_IFEE_AMT_LENGTH = 64;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FAcqFinIfeeDb;
            protected  int beginX360FAcqFinIfeeCr;
            protected  int beginX360FAcqNfIfeeDb;
            protected  int beginX360FAcqNfIfeeCr;
            protected  int beginX360FAcqPctIfeeDb;
            protected  int beginX360FAcqPctIfeeCr;
            protected  int beginX360FAcqNobillIfeeDb;
            protected  int beginX360FAcqNobillIfeeCr;
	
	/**
	* Constructor for X360FAcqIfeeAmtSerialized
	**/
    public X360FAcqIfeeAmtSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FAcqIfeeAmtSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqIfeeAmtSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FAcqIfeeAmtSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1233); // serialize this field at offset 1233 by default 
    }
    
	/**
	* sets parent for this X360FAcqIfeeAmtSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1233 by default
    }    
	/**
	* initializes the field in X360FAcqIfeeAmtSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FACQ_IFEE_AMT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FAcqFinIfeeDb = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FAcqFinIfeeCr = getStartOffset() + 8;	// set offset for serialization
  
             beginX360FAcqNfIfeeDb = getStartOffset() + 16;	// set offset for serialization
  
             beginX360FAcqNfIfeeCr = getStartOffset() + 24;	// set offset for serialization
  
             beginX360FAcqPctIfeeDb = getStartOffset() + 32;	// set offset for serialization
  
             beginX360FAcqPctIfeeCr = getStartOffset() + 40;	// set offset for serialization
  
             beginX360FAcqNobillIfeeDb = getStartOffset() + 48;	// set offset for serialization
  
             beginX360FAcqNobillIfeeCr = getStartOffset() + 56;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FAcqFinIfeeDbCounter = -1;
        public boolean isX360FAcqFinIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqFinIfeeDbCounter != sharedCounter;
           localX360FAcqFinIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqFinIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqFinIfeeDb,X_360_FACQ_FIN_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_FIN_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FAcqFinIfeeDb
	 */
	protected void serializeX360FAcqFinIfeeDb(long x360FAcqFinIfeeDb) {
		   putDecimal(beginX360FAcqFinIfeeDb,x360FAcqFinIfeeDb,X_360_FACQ_FIN_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FAcqFinIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqFinIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqFinIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqFinIfeeDb,X_360_FACQ_FIN_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqFinIfeeDb", beginX360FAcqFinIfeeDb,X_360_FACQ_FIN_IFEE_DB_LEN);
     }
   	}
        int localX360FAcqFinIfeeCrCounter = -1;
        public boolean isX360FAcqFinIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqFinIfeeCrCounter != sharedCounter;
           localX360FAcqFinIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqFinIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqFinIfeeCr,X_360_FACQ_FIN_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_FIN_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FAcqFinIfeeCr
	 */
	protected void serializeX360FAcqFinIfeeCr(long x360FAcqFinIfeeCr) {
		   putDecimal(beginX360FAcqFinIfeeCr,x360FAcqFinIfeeCr,X_360_FACQ_FIN_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FAcqFinIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqFinIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqFinIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqFinIfeeCr,X_360_FACQ_FIN_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqFinIfeeCr", beginX360FAcqFinIfeeCr,X_360_FACQ_FIN_IFEE_CR_LEN);
     }
   	}
        int localX360FAcqNfIfeeDbCounter = -1;
        public boolean isX360FAcqNfIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqNfIfeeDbCounter != sharedCounter;
           localX360FAcqNfIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqNfIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqNfIfeeDb,X_360_FACQ_NF_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_NF_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FAcqNfIfeeDb
	 */
	protected void serializeX360FAcqNfIfeeDb(long x360FAcqNfIfeeDb) {
		   putDecimal(beginX360FAcqNfIfeeDb,x360FAcqNfIfeeDb,X_360_FACQ_NF_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FAcqNfIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqNfIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqNfIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqNfIfeeDb,X_360_FACQ_NF_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqNfIfeeDb", beginX360FAcqNfIfeeDb,X_360_FACQ_NF_IFEE_DB_LEN);
     }
   	}
        int localX360FAcqNfIfeeCrCounter = -1;
        public boolean isX360FAcqNfIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqNfIfeeCrCounter != sharedCounter;
           localX360FAcqNfIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqNfIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqNfIfeeCr,X_360_FACQ_NF_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_NF_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FAcqNfIfeeCr
	 */
	protected void serializeX360FAcqNfIfeeCr(long x360FAcqNfIfeeCr) {
		   putDecimal(beginX360FAcqNfIfeeCr,x360FAcqNfIfeeCr,X_360_FACQ_NF_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FAcqNfIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqNfIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqNfIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqNfIfeeCr,X_360_FACQ_NF_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqNfIfeeCr", beginX360FAcqNfIfeeCr,X_360_FACQ_NF_IFEE_CR_LEN);
     }
   	}
        int localX360FAcqPctIfeeDbCounter = -1;
        public boolean isX360FAcqPctIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqPctIfeeDbCounter != sharedCounter;
           localX360FAcqPctIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqPctIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqPctIfeeDb,X_360_FACQ_PCT_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_PCT_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FAcqPctIfeeDb
	 */
	protected void serializeX360FAcqPctIfeeDb(long x360FAcqPctIfeeDb) {
		   putDecimal(beginX360FAcqPctIfeeDb,x360FAcqPctIfeeDb,X_360_FACQ_PCT_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FAcqPctIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqPctIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqPctIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqPctIfeeDb,X_360_FACQ_PCT_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqPctIfeeDb", beginX360FAcqPctIfeeDb,X_360_FACQ_PCT_IFEE_DB_LEN);
     }
   	}
        int localX360FAcqPctIfeeCrCounter = -1;
        public boolean isX360FAcqPctIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqPctIfeeCrCounter != sharedCounter;
           localX360FAcqPctIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqPctIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqPctIfeeCr,X_360_FACQ_PCT_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_PCT_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FAcqPctIfeeCr
	 */
	protected void serializeX360FAcqPctIfeeCr(long x360FAcqPctIfeeCr) {
		   putDecimal(beginX360FAcqPctIfeeCr,x360FAcqPctIfeeCr,X_360_FACQ_PCT_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FAcqPctIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqPctIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqPctIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqPctIfeeCr,X_360_FACQ_PCT_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqPctIfeeCr", beginX360FAcqPctIfeeCr,X_360_FACQ_PCT_IFEE_CR_LEN);
     }
   	}
        int localX360FAcqNobillIfeeDbCounter = -1;
        public boolean isX360FAcqNobillIfeeDbModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqNobillIfeeDbCounter != sharedCounter;
           localX360FAcqNobillIfeeDbCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqNobillIfeeDbIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqNobillIfeeDb,X_360_FACQ_NOBILL_IFEE_DB_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_NOBILL_IFEE_DB_LEN = 8;
  	/**
	 * 	serializeX360FAcqNobillIfeeDb
	 */
	protected void serializeX360FAcqNobillIfeeDb(long x360FAcqNobillIfeeDb) {
		   putDecimal(beginX360FAcqNobillIfeeDb,x360FAcqNobillIfeeDb,X_360_FACQ_NOBILL_IFEE_DB_LEN,true);
   }
   

   protected long checkX360FAcqNobillIfeeDbMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqNobillIfeeDb is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqNobillIfeeDb() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqNobillIfeeDb,X_360_FACQ_NOBILL_IFEE_DB_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqNobillIfeeDb", beginX360FAcqNobillIfeeDb,X_360_FACQ_NOBILL_IFEE_DB_LEN);
     }
   	}
        int localX360FAcqNobillIfeeCrCounter = -1;
        public boolean isX360FAcqNobillIfeeCrModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqNobillIfeeCrCounter != sharedCounter;
           localX360FAcqNobillIfeeCrCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqNobillIfeeCrIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqNobillIfeeCr,X_360_FACQ_NOBILL_IFEE_CR_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_NOBILL_IFEE_CR_LEN = 8;
  	/**
	 * 	serializeX360FAcqNobillIfeeCr
	 */
	protected void serializeX360FAcqNobillIfeeCr(long x360FAcqNobillIfeeCr) {
		   putDecimal(beginX360FAcqNobillIfeeCr,x360FAcqNobillIfeeCr,X_360_FACQ_NOBILL_IFEE_CR_LEN,true);
   }
   

   protected long checkX360FAcqNobillIfeeCrMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqNobillIfeeCr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshX360FAcqNobillIfeeCr() throws CFException {	
   	try { 
		 return (getLongDecimal(beginX360FAcqNobillIfeeCr,X_360_FACQ_NOBILL_IFEE_CR_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqNobillIfeeCr", beginX360FAcqNobillIfeeCr,X_360_FACQ_NOBILL_IFEE_CR_LEN);
     }
   	}




}
  
