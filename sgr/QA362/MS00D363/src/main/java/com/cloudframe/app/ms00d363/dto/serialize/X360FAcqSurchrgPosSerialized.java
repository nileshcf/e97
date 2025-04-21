package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FAcqSurchrgPosSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FAcqSurchrgPosSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FAcqSurchrgPosSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FACQ_SURCHRG_POS_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FAcqSurchrgCntCrP;
            protected  int beginX360FAcqSurchrgCntDbP;
            protected  int beginX360FAcqSurchrgAmtCrP;
            protected  int beginX360FAcqSurchrgAmtDbP;
	
	/**
	* Constructor for X360FAcqSurchrgPosSerialized
	**/
    public X360FAcqSurchrgPosSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FAcqSurchrgPosSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgPosSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FAcqSurchrgPosSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1144); // serialize this field at offset 1144 by default 
    }
    
	/**
	* sets parent for this X360FAcqSurchrgPosSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1144 by default
    }    
	/**
	* initializes the field in X360FAcqSurchrgPosSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FACQ_SURCHRG_POS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FAcqSurchrgCntCrP = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FAcqSurchrgCntDbP = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FAcqSurchrgAmtCrP = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FAcqSurchrgAmtDbP = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FAcqSurchrgCntCrPCounter = -1;
        public boolean isX360FAcqSurchrgCntCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgCntCrPCounter != sharedCounter;
           localX360FAcqSurchrgCntCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgCntCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgCntCrP,X_360_FACQ_SURCHRG_CNT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_CNT_CR_P_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgCntCrP
	 */
	protected void serializeX360FAcqSurchrgCntCrP(int x360FAcqSurchrgCntCrP) {
		   putDecimal(beginX360FAcqSurchrgCntCrP,x360FAcqSurchrgCntCrP,X_360_FACQ_SURCHRG_CNT_CR_P_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgCntCrPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgCntCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgCntCrP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgCntCrP,X_360_FACQ_SURCHRG_CNT_CR_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgCntCrP", beginX360FAcqSurchrgCntCrP,X_360_FACQ_SURCHRG_CNT_CR_P_LEN);
     }
   	}
        int localX360FAcqSurchrgCntDbPCounter = -1;
        public boolean isX360FAcqSurchrgCntDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgCntDbPCounter != sharedCounter;
           localX360FAcqSurchrgCntDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgCntDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgCntDbP,X_360_FACQ_SURCHRG_CNT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_CNT_DB_P_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgCntDbP
	 */
	protected void serializeX360FAcqSurchrgCntDbP(int x360FAcqSurchrgCntDbP) {
		   putDecimal(beginX360FAcqSurchrgCntDbP,x360FAcqSurchrgCntDbP,X_360_FACQ_SURCHRG_CNT_DB_P_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgCntDbPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgCntDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgCntDbP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgCntDbP,X_360_FACQ_SURCHRG_CNT_DB_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgCntDbP", beginX360FAcqSurchrgCntDbP,X_360_FACQ_SURCHRG_CNT_DB_P_LEN);
     }
   	}
        int localX360FAcqSurchrgAmtCrPCounter = -1;
        public boolean isX360FAcqSurchrgAmtCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgAmtCrPCounter != sharedCounter;
           localX360FAcqSurchrgAmtCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgAmtCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgAmtCrP,X_360_FACQ_SURCHRG_AMT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgAmtCrPString() {
            return getPackedString(beginX360FAcqSurchrgAmtCrP,X_360_FACQ_SURCHRG_AMT_CR_P_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_AMT_CR_P_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_AMT_CR_P_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgAmtCrP
	 */
	protected void serializeX360FAcqSurchrgAmtCrP(BigDecimal x360FAcqSurchrgAmtCrP) {
		   putDecimal(beginX360FAcqSurchrgAmtCrP,x360FAcqSurchrgAmtCrP,X_360_FACQ_SURCHRG_AMT_CR_P_LEN,X_360_FACQ_SURCHRG_AMT_CR_P_SCALE,true);
		 localX360FAcqSurchrgAmtCrPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgAmtCrPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgAmtCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgAmtCrP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgAmtCrP,X_360_FACQ_SURCHRG_AMT_CR_P_LEN,X_360_FACQ_SURCHRG_AMT_CR_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgAmtCrP", beginX360FAcqSurchrgAmtCrP,X_360_FACQ_SURCHRG_AMT_CR_P_LEN);
     }
   	}
        int localX360FAcqSurchrgAmtDbPCounter = -1;
        public boolean isX360FAcqSurchrgAmtDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgAmtDbPCounter != sharedCounter;
           localX360FAcqSurchrgAmtDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgAmtDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgAmtDbP,X_360_FACQ_SURCHRG_AMT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgAmtDbPString() {
            return getPackedString(beginX360FAcqSurchrgAmtDbP,X_360_FACQ_SURCHRG_AMT_DB_P_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_AMT_DB_P_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_AMT_DB_P_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgAmtDbP
	 */
	protected void serializeX360FAcqSurchrgAmtDbP(BigDecimal x360FAcqSurchrgAmtDbP) {
		   putDecimal(beginX360FAcqSurchrgAmtDbP,x360FAcqSurchrgAmtDbP,X_360_FACQ_SURCHRG_AMT_DB_P_LEN,X_360_FACQ_SURCHRG_AMT_DB_P_SCALE,true);
		 localX360FAcqSurchrgAmtDbPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgAmtDbPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgAmtDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgAmtDbP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgAmtDbP,X_360_FACQ_SURCHRG_AMT_DB_P_LEN,X_360_FACQ_SURCHRG_AMT_DB_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgAmtDbP", beginX360FAcqSurchrgAmtDbP,X_360_FACQ_SURCHRG_AMT_DB_P_LEN);
     }
   	}




}
  
