package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FAcqSurchrgRvPosSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FAcqSurchrgRvPosSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FAcqSurchrgRvPosSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FACQ_SURCHRG_RV_POS_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FAcqSurchrgRvCntCrP;
            protected  int beginX360FAcqSurchrgRvCntDbP;
            protected  int beginX360FAcqSurchrgRvAmtCrP;
            protected  int beginX360FAcqSurchrgRvAmtDbP;
	
	/**
	* Constructor for X360FAcqSurchrgRvPosSerialized
	**/
    public X360FAcqSurchrgRvPosSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FAcqSurchrgRvPosSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgRvPosSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FAcqSurchrgRvPosSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1180); // serialize this field at offset 1180 by default 
    }
    
	/**
	* sets parent for this X360FAcqSurchrgRvPosSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1180 by default
    }    
	/**
	* initializes the field in X360FAcqSurchrgRvPosSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FACQ_SURCHRG_RV_POS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FAcqSurchrgRvCntCrP = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FAcqSurchrgRvCntDbP = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FAcqSurchrgRvAmtCrP = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FAcqSurchrgRvAmtDbP = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FAcqSurchrgRvCntCrPCounter = -1;
        public boolean isX360FAcqSurchrgRvCntCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvCntCrPCounter != sharedCounter;
           localX360FAcqSurchrgRvCntCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvCntCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvCntCrP,X_360_FACQ_SURCHRG_RV_CNT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_RV_CNT_CR_P_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgRvCntCrP
	 */
	protected void serializeX360FAcqSurchrgRvCntCrP(int x360FAcqSurchrgRvCntCrP) {
		   putDecimal(beginX360FAcqSurchrgRvCntCrP,x360FAcqSurchrgRvCntCrP,X_360_FACQ_SURCHRG_RV_CNT_CR_P_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgRvCntCrPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgRvCntCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgRvCntCrP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgRvCntCrP,X_360_FACQ_SURCHRG_RV_CNT_CR_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvCntCrP", beginX360FAcqSurchrgRvCntCrP,X_360_FACQ_SURCHRG_RV_CNT_CR_P_LEN);
     }
   	}
        int localX360FAcqSurchrgRvCntDbPCounter = -1;
        public boolean isX360FAcqSurchrgRvCntDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvCntDbPCounter != sharedCounter;
           localX360FAcqSurchrgRvCntDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvCntDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvCntDbP,X_360_FACQ_SURCHRG_RV_CNT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_RV_CNT_DB_P_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgRvCntDbP
	 */
	protected void serializeX360FAcqSurchrgRvCntDbP(int x360FAcqSurchrgRvCntDbP) {
		   putDecimal(beginX360FAcqSurchrgRvCntDbP,x360FAcqSurchrgRvCntDbP,X_360_FACQ_SURCHRG_RV_CNT_DB_P_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgRvCntDbPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgRvCntDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgRvCntDbP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgRvCntDbP,X_360_FACQ_SURCHRG_RV_CNT_DB_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvCntDbP", beginX360FAcqSurchrgRvCntDbP,X_360_FACQ_SURCHRG_RV_CNT_DB_P_LEN);
     }
   	}
        int localX360FAcqSurchrgRvAmtCrPCounter = -1;
        public boolean isX360FAcqSurchrgRvAmtCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvAmtCrPCounter != sharedCounter;
           localX360FAcqSurchrgRvAmtCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvAmtCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvAmtCrP,X_360_FACQ_SURCHRG_RV_AMT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgRvAmtCrPString() {
            return getPackedString(beginX360FAcqSurchrgRvAmtCrP,X_360_FACQ_SURCHRG_RV_AMT_CR_P_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_CR_P_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_CR_P_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgRvAmtCrP
	 */
	protected void serializeX360FAcqSurchrgRvAmtCrP(BigDecimal x360FAcqSurchrgRvAmtCrP) {
		   putDecimal(beginX360FAcqSurchrgRvAmtCrP,x360FAcqSurchrgRvAmtCrP,X_360_FACQ_SURCHRG_RV_AMT_CR_P_LEN,X_360_FACQ_SURCHRG_RV_AMT_CR_P_SCALE,true);
		 localX360FAcqSurchrgRvAmtCrPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgRvAmtCrPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgRvAmtCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgRvAmtCrP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgRvAmtCrP,X_360_FACQ_SURCHRG_RV_AMT_CR_P_LEN,X_360_FACQ_SURCHRG_RV_AMT_CR_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvAmtCrP", beginX360FAcqSurchrgRvAmtCrP,X_360_FACQ_SURCHRG_RV_AMT_CR_P_LEN);
     }
   	}
        int localX360FAcqSurchrgRvAmtDbPCounter = -1;
        public boolean isX360FAcqSurchrgRvAmtDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvAmtDbPCounter != sharedCounter;
           localX360FAcqSurchrgRvAmtDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvAmtDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvAmtDbP,X_360_FACQ_SURCHRG_RV_AMT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgRvAmtDbPString() {
            return getPackedString(beginX360FAcqSurchrgRvAmtDbP,X_360_FACQ_SURCHRG_RV_AMT_DB_P_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_DB_P_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_DB_P_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgRvAmtDbP
	 */
	protected void serializeX360FAcqSurchrgRvAmtDbP(BigDecimal x360FAcqSurchrgRvAmtDbP) {
		   putDecimal(beginX360FAcqSurchrgRvAmtDbP,x360FAcqSurchrgRvAmtDbP,X_360_FACQ_SURCHRG_RV_AMT_DB_P_LEN,X_360_FACQ_SURCHRG_RV_AMT_DB_P_SCALE,true);
		 localX360FAcqSurchrgRvAmtDbPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgRvAmtDbPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgRvAmtDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgRvAmtDbP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgRvAmtDbP,X_360_FACQ_SURCHRG_RV_AMT_DB_P_LEN,X_360_FACQ_SURCHRG_RV_AMT_DB_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvAmtDbP", beginX360FAcqSurchrgRvAmtDbP,X_360_FACQ_SURCHRG_RV_AMT_DB_P_LEN);
     }
   	}




}
  
