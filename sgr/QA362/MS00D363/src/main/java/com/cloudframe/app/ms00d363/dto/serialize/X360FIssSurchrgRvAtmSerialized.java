package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FIssSurchrgRvAtmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:44. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FIssSurchrgRvAtmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FIssSurchrgRvAtmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FISS_SURCHRG_RV_ATM_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FIssSurchrgRvCntCrA;
            protected  int beginX360FIssSurchrgRvCntDbA;
            protected  int beginX360FIssSurchrgRvAmtCrA;
            protected  int beginX360FIssSurchrgRvAmtDbA;
	
	/**
	* Constructor for X360FIssSurchrgRvAtmSerialized
	**/
    public X360FIssSurchrgRvAtmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FIssSurchrgRvAtmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FIssSurchrgRvAtmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FIssSurchrgRvAtmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1206); // serialize this field at offset 1206 by default 
    }
    
	/**
	* sets parent for this X360FIssSurchrgRvAtmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1206 by default
    }    
	/**
	* initializes the field in X360FIssSurchrgRvAtmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FISS_SURCHRG_RV_ATM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FIssSurchrgRvCntCrA = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FIssSurchrgRvCntDbA = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FIssSurchrgRvAmtCrA = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FIssSurchrgRvAmtDbA = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FIssSurchrgRvCntCrACounter = -1;
        public boolean isX360FIssSurchrgRvCntCrAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvCntCrACounter != sharedCounter;
           localX360FIssSurchrgRvCntCrACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvCntCrAIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvCntCrA,X_360_FISS_SURCHRG_RV_CNT_CR_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_RV_CNT_CR_A_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgRvCntCrA
	 */
	protected void serializeX360FIssSurchrgRvCntCrA(int x360FIssSurchrgRvCntCrA) {
		   putDecimal(beginX360FIssSurchrgRvCntCrA,x360FIssSurchrgRvCntCrA,X_360_FISS_SURCHRG_RV_CNT_CR_A_LEN,true);
   }
   

   protected int checkX360FIssSurchrgRvCntCrAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgRvCntCrA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgRvCntCrA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgRvCntCrA,X_360_FISS_SURCHRG_RV_CNT_CR_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvCntCrA", beginX360FIssSurchrgRvCntCrA,X_360_FISS_SURCHRG_RV_CNT_CR_A_LEN);
     }
   	}
        int localX360FIssSurchrgRvCntDbACounter = -1;
        public boolean isX360FIssSurchrgRvCntDbAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvCntDbACounter != sharedCounter;
           localX360FIssSurchrgRvCntDbACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvCntDbAIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvCntDbA,X_360_FISS_SURCHRG_RV_CNT_DB_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FISS_SURCHRG_RV_CNT_DB_A_LEN = 5;
  	/**
	 * 	serializeX360FIssSurchrgRvCntDbA
	 */
	protected void serializeX360FIssSurchrgRvCntDbA(int x360FIssSurchrgRvCntDbA) {
		   putDecimal(beginX360FIssSurchrgRvCntDbA,x360FIssSurchrgRvCntDbA,X_360_FISS_SURCHRG_RV_CNT_DB_A_LEN,true);
   }
   

   protected int checkX360FIssSurchrgRvCntDbAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FIssSurchrgRvCntDbA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FIssSurchrgRvCntDbA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FIssSurchrgRvCntDbA,X_360_FISS_SURCHRG_RV_CNT_DB_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvCntDbA", beginX360FIssSurchrgRvCntDbA,X_360_FISS_SURCHRG_RV_CNT_DB_A_LEN);
     }
   	}
        int localX360FIssSurchrgRvAmtCrACounter = -1;
        public boolean isX360FIssSurchrgRvAmtCrAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvAmtCrACounter != sharedCounter;
           localX360FIssSurchrgRvAmtCrACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvAmtCrAIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvAmtCrA,X_360_FISS_SURCHRG_RV_AMT_CR_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgRvAmtCrAString() {
            return getPackedString(beginX360FIssSurchrgRvAmtCrA,X_360_FISS_SURCHRG_RV_AMT_CR_A_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_RV_AMT_CR_A_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_RV_AMT_CR_A_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgRvAmtCrA
	 */
	protected void serializeX360FIssSurchrgRvAmtCrA(BigDecimal x360FIssSurchrgRvAmtCrA) {
		   putDecimal(beginX360FIssSurchrgRvAmtCrA,x360FIssSurchrgRvAmtCrA,X_360_FISS_SURCHRG_RV_AMT_CR_A_LEN,X_360_FISS_SURCHRG_RV_AMT_CR_A_SCALE,true);
		 localX360FIssSurchrgRvAmtCrACounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgRvAmtCrAMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgRvAmtCrA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgRvAmtCrA() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgRvAmtCrA,X_360_FISS_SURCHRG_RV_AMT_CR_A_LEN,X_360_FISS_SURCHRG_RV_AMT_CR_A_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvAmtCrA", beginX360FIssSurchrgRvAmtCrA,X_360_FISS_SURCHRG_RV_AMT_CR_A_LEN);
     }
   	}
        int localX360FIssSurchrgRvAmtDbACounter = -1;
        public boolean isX360FIssSurchrgRvAmtDbAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FIssSurchrgRvAmtDbACounter != sharedCounter;
           localX360FIssSurchrgRvAmtDbACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FIssSurchrgRvAmtDbAIsNumeric() {
	      return decimalIsNumeric(beginX360FIssSurchrgRvAmtDbA,X_360_FISS_SURCHRG_RV_AMT_DB_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FIssSurchrgRvAmtDbAString() {
            return getPackedString(beginX360FIssSurchrgRvAmtDbA,X_360_FISS_SURCHRG_RV_AMT_DB_A_LEN);
         }
   protected static final int X_360_FISS_SURCHRG_RV_AMT_DB_A_LEN = 8;
   protected static final int X_360_FISS_SURCHRG_RV_AMT_DB_A_SCALE = 2;
  	/**
	 * 	serializeX360FIssSurchrgRvAmtDbA
	 */
	protected void serializeX360FIssSurchrgRvAmtDbA(BigDecimal x360FIssSurchrgRvAmtDbA) {
		   putDecimal(beginX360FIssSurchrgRvAmtDbA,x360FIssSurchrgRvAmtDbA,X_360_FISS_SURCHRG_RV_AMT_DB_A_LEN,X_360_FISS_SURCHRG_RV_AMT_DB_A_SCALE,true);
		 localX360FIssSurchrgRvAmtDbACounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FIssSurchrgRvAmtDbAMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FIssSurchrgRvAmtDbA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FIssSurchrgRvAmtDbA() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FIssSurchrgRvAmtDbA,X_360_FISS_SURCHRG_RV_AMT_DB_A_LEN,X_360_FISS_SURCHRG_RV_AMT_DB_A_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FIssSurchrgRvAmtDbA", beginX360FIssSurchrgRvAmtDbA,X_360_FISS_SURCHRG_RV_AMT_DB_A_LEN);
     }
   	}




}
  
