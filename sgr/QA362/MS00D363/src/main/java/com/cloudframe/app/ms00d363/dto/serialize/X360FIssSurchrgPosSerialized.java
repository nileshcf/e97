package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FIssSurchrgPosSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FIssSurchrgPosSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FIssSurchrgPosSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FISS_SURCHRG_POS_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FIssSurchrgCntCrP;
            protected  int beginX360FIssSurchrgCntDbP;
            protected  int beginX360FIssSurchrgAmtCrP;
            protected  int beginX360FIssSurchrgAmtDbP;
	
	/**
	* Constructor for X360FIssSurchrgPosSerialized
	**/
    public X360FIssSurchrgPosSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FIssSurchrgPosSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgPosSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FIssSurchrgPosSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1144); // serialize this field at offset 1144 by default 
    }
    
	/**
	* sets parent for this X360FIssSurchrgPosSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1144 by default
    }    
	/**
	* initializes the field in X360FIssSurchrgPosSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FISS_SURCHRG_POS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FIssSurchrgCntCrP = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FIssSurchrgCntDbP = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FIssSurchrgAmtCrP = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FIssSurchrgAmtDbP = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FIssSurchrgCntCrPCounter = -1;
        public boolean isX360FIssSurchrgCntCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgCntCrPCounter != sharedCounter;
           localX360FIssSurchrgCntCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgCntCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgCntCrP,X_360_FISS_SURCHRG_CNT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_CNT_CR_P_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgCntCrP
	 */
	protected void serializeX360FIssSurchrgCntCrP(int x360FIssSurchrgCntCrP) {
		   putDecimal(beginX360FIssSurchrgCntCrP,x360FIssSurchrgCntCrP,X_360_FISS_SURCHRG_CNT_CR_P_LEN,true);
   }
   

   protected int checkX360FIssSurchrgCntCrPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgCntCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgCntCrP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgCntCrP,X_360_FISS_SURCHRG_CNT_CR_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgCntCrP", beginX360FIssSurchrgCntCrP,X_360_FISS_SURCHRG_CNT_CR_P_LEN);
     }
   	}
        int localX360FIssSurchrgCntDbPCounter = -1;
        public boolean isX360FIssSurchrgCntDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgCntDbPCounter != sharedCounter;
           localX360FIssSurchrgCntDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgCntDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgCntDbP,X_360_FISS_SURCHRG_CNT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_CNT_DB_P_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgCntDbP
	 */
	protected void serializeX360FIssSurchrgCntDbP(int x360FIssSurchrgCntDbP) {
		   putDecimal(beginX360FIssSurchrgCntDbP,x360FIssSurchrgCntDbP,X_360_FISS_SURCHRG_CNT_DB_P_LEN,true);
   }
   

   protected int checkX360FIssSurchrgCntDbPMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgCntDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgCntDbP() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgCntDbP,X_360_FISS_SURCHRG_CNT_DB_P_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgCntDbP", beginX360FIssSurchrgCntDbP,X_360_FISS_SURCHRG_CNT_DB_P_LEN);
     }
   	}
        int localX360FIssSurchrgAmtCrPCounter = -1;
        public boolean isX360FIssSurchrgAmtCrPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgAmtCrPCounter != sharedCounter;
           localX360FIssSurchrgAmtCrPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgAmtCrPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgAmtCrP,X_360_FISS_SURCHRG_AMT_CR_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgAmtCrPString() {
            return getPackedString(beginX360FIssSurchrgAmtCrP,X_360_FISS_SURCHRG_AMT_CR_P_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_AMT_CR_P_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_AMT_CR_P_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgAmtCrP
	 */
	protected void serializeX360FIssSurchrgAmtCrP(BigDecimal x360FIssSurchrgAmtCrP) {
		   putDecimal(beginX360FIssSurchrgAmtCrP,x360FIssSurchrgAmtCrP,X_360_FISS_SURCHRG_AMT_CR_P_LEN,X_360_FISS_SURCHRG_AMT_CR_P_SCALE,true);
		 localX360FIssSurchrgAmtCrPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgAmtCrPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgAmtCrP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgAmtCrP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgAmtCrP,X_360_FISS_SURCHRG_AMT_CR_P_LEN,X_360_FISS_SURCHRG_AMT_CR_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgAmtCrP", beginX360FIssSurchrgAmtCrP,X_360_FISS_SURCHRG_AMT_CR_P_LEN);
     }
   	}
        int localX360FIssSurchrgAmtDbPCounter = -1;
        public boolean isX360FIssSurchrgAmtDbPModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgAmtDbPCounter != sharedCounter;
           localX360FIssSurchrgAmtDbPCounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgAmtDbPIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgAmtDbP,X_360_FISS_SURCHRG_AMT_DB_P_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgAmtDbPString() {
            return getPackedString(beginX360FIssSurchrgAmtDbP,X_360_FISS_SURCHRG_AMT_DB_P_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_AMT_DB_P_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_AMT_DB_P_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgAmtDbP
	 */
	protected void serializeX360FIssSurchrgAmtDbP(BigDecimal x360FIssSurchrgAmtDbP) {
		   putDecimal(beginX360FIssSurchrgAmtDbP,x360FIssSurchrgAmtDbP,X_360_FISS_SURCHRG_AMT_DB_P_LEN,X_360_FISS_SURCHRG_AMT_DB_P_SCALE,true);
		 localX360FIssSurchrgAmtDbPCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgAmtDbPMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgAmtDbP is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgAmtDbP() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgAmtDbP,X_360_FISS_SURCHRG_AMT_DB_P_LEN,X_360_FISS_SURCHRG_AMT_DB_P_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgAmtDbP", beginX360FIssSurchrgAmtDbP,X_360_FISS_SURCHRG_AMT_DB_P_LEN);
     }
   	}




}
  
