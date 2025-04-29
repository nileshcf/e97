package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FIssSurchrgRvPosSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FIssSurchrgRvPosSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FIssSurchrgRvPosSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FISS_SURCHRG_RV_POS_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FIssSurchrgRvCntCrP;
            protected  int beginX360FIssSurchrgRvCntDbP;
            protected  int beginX360FIssSurchrgRvAmtCrP;
            protected  int beginX360FIssSurchrgRvAmtDbP;
	
	/**
	* Constructor for X360FIssSurchrgRvPosSerialized
	**/
    public X360FIssSurchrgRvPosSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FIssSurchrgRvPosSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgRvPosSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FIssSurchrgRvPosSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1180); // serialize this field at offset 1180 by default 
    }
    
	/**
	* sets parent for this X360FIssSurchrgRvPosSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1180 by default
    }    
	/**
	* initializes the field in X360FIssSurchrgRvPosSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FISS_SURCHRG_RV_POS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FIssSurchrgRvCntCrP = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FIssSurchrgRvCntDbP = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FIssSurchrgRvAmtCrP = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FIssSurchrgRvAmtDbP = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FIssSurchrgRvCntCrPCounter = -1;
        public boolean isX360FIssSurchrgRvCntCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvCntCrPCounter != sharedCounter;
           localX360FIssSurchrgRvCntCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvCntCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvCntCrP,X_360_FISS_SURCHRG_RV_CNT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_RV_CNT_CR_P_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgRvCntCrP
	 */
	protected void serializeX360FIssSurchrgRvCntCrP(int x360FIssSurchrgRvCntCrP) {
		   putDecimal(beginX360FIssSurchrgRvCntCrP,x360FIssSurchrgRvCntCrP,X_360_FISS_SURCHRG_RV_CNT_CR_P_LEN,true);
   }
   

   protected int checkX360FIssSurchrgRvCntCrPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgRvCntCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgRvCntCrP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgRvCntCrP,X_360_FISS_SURCHRG_RV_CNT_CR_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvCntCrP", beginX360FIssSurchrgRvCntCrP,X_360_FISS_SURCHRG_RV_CNT_CR_P_LEN);
     }
   	}
        int localX360FIssSurchrgRvCntDbPCounter = -1;
        public boolean isX360FIssSurchrgRvCntDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvCntDbPCounter != sharedCounter;
           localX360FIssSurchrgRvCntDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvCntDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvCntDbP,X_360_FISS_SURCHRG_RV_CNT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_RV_CNT_DB_P_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgRvCntDbP
	 */
	protected void serializeX360FIssSurchrgRvCntDbP(int x360FIssSurchrgRvCntDbP) {
		   putDecimal(beginX360FIssSurchrgRvCntDbP,x360FIssSurchrgRvCntDbP,X_360_FISS_SURCHRG_RV_CNT_DB_P_LEN,true);
   }
   

   protected int checkX360FIssSurchrgRvCntDbPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgRvCntDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgRvCntDbP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgRvCntDbP,X_360_FISS_SURCHRG_RV_CNT_DB_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvCntDbP", beginX360FIssSurchrgRvCntDbP,X_360_FISS_SURCHRG_RV_CNT_DB_P_LEN);
     }
   	}
        int localX360FIssSurchrgRvAmtCrPCounter = -1;
        public boolean isX360FIssSurchrgRvAmtCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvAmtCrPCounter != sharedCounter;
           localX360FIssSurchrgRvAmtCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvAmtCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvAmtCrP,X_360_FISS_SURCHRG_RV_AMT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgRvAmtCrPString() {
            return getPackedString(beginX360FIssSurchrgRvAmtCrP,X_360_FISS_SURCHRG_RV_AMT_CR_P_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_RV_AMT_CR_P_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_RV_AMT_CR_P_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgRvAmtCrP
	 */
	protected void serializeX360FIssSurchrgRvAmtCrP(BigDecimal x360FIssSurchrgRvAmtCrP) {
		   putDecimal(beginX360FIssSurchrgRvAmtCrP,x360FIssSurchrgRvAmtCrP,X_360_FISS_SURCHRG_RV_AMT_CR_P_LEN,X_360_FISS_SURCHRG_RV_AMT_CR_P_SCALE,true);
		 localX360FIssSurchrgRvAmtCrPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgRvAmtCrPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgRvAmtCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgRvAmtCrP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgRvAmtCrP,X_360_FISS_SURCHRG_RV_AMT_CR_P_LEN,X_360_FISS_SURCHRG_RV_AMT_CR_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvAmtCrP", beginX360FIssSurchrgRvAmtCrP,X_360_FISS_SURCHRG_RV_AMT_CR_P_LEN);
     }
   	}
        int localX360FIssSurchrgRvAmtDbPCounter = -1;
        public boolean isX360FIssSurchrgRvAmtDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvAmtDbPCounter != sharedCounter;
           localX360FIssSurchrgRvAmtDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvAmtDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvAmtDbP,X_360_FISS_SURCHRG_RV_AMT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgRvAmtDbPString() {
            return getPackedString(beginX360FIssSurchrgRvAmtDbP,X_360_FISS_SURCHRG_RV_AMT_DB_P_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_RV_AMT_DB_P_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_RV_AMT_DB_P_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgRvAmtDbP
	 */
	protected void serializeX360FIssSurchrgRvAmtDbP(BigDecimal x360FIssSurchrgRvAmtDbP) {
		   putDecimal(beginX360FIssSurchrgRvAmtDbP,x360FIssSurchrgRvAmtDbP,X_360_FISS_SURCHRG_RV_AMT_DB_P_LEN,X_360_FISS_SURCHRG_RV_AMT_DB_P_SCALE,true);
		 localX360FIssSurchrgRvAmtDbPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgRvAmtDbPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgRvAmtDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgRvAmtDbP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgRvAmtDbP,X_360_FISS_SURCHRG_RV_AMT_DB_P_LEN,X_360_FISS_SURCHRG_RV_AMT_DB_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvAmtDbP", beginX360FIssSurchrgRvAmtDbP,X_360_FISS_SURCHRG_RV_AMT_DB_P_LEN);
     }
   	}




}
  
