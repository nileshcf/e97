package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class X360FAcqSurchrgRvAtmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class X360FAcqSurchrgRvAtmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(X360FAcqSurchrgRvAtmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int X_360_FACQ_SURCHRG_RV_ATM_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginX360FAcqSurchrgRvCntCrA;
            protected  int beginX360FAcqSurchrgRvCntDbA;
            protected  int beginX360FAcqSurchrgRvAmtCrA;
            protected  int beginX360FAcqSurchrgRvAmtDbA;
	
	/**
	* Constructor for X360FAcqSurchrgRvAtmSerialized
	**/
    public X360FAcqSurchrgRvAtmSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for X360FAcqSurchrgRvAtmSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public X360FAcqSurchrgRvAtmSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this X360FAcqSurchrgRvAtmSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1206); // serialize this field at offset 1206 by default 
    }
    
	/**
	* sets parent for this X360FAcqSurchrgRvAtmSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1206 by default
    }    
	/**
	* initializes the field in X360FAcqSurchrgRvAtmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(X_360_FACQ_SURCHRG_RV_ATM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginX360FAcqSurchrgRvCntCrA = getStartOffset() + 0;	// set offset for serialization
  
             beginX360FAcqSurchrgRvCntDbA = getStartOffset() + 5;	// set offset for serialization
  
             beginX360FAcqSurchrgRvAmtCrA = getStartOffset() + 10;	// set offset for serialization
  
             beginX360FAcqSurchrgRvAmtDbA = getStartOffset() + 18;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localX360FAcqSurchrgRvCntCrACounter = -1;
        public boolean isX360FAcqSurchrgRvCntCrAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvCntCrACounter != sharedCounter;
           localX360FAcqSurchrgRvCntCrACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvCntCrAIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvCntCrA,X_360_FACQ_SURCHRG_RV_CNT_CR_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_RV_CNT_CR_A_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgRvCntCrA
	 */
	protected void serializeX360FAcqSurchrgRvCntCrA(int x360FAcqSurchrgRvCntCrA) {
		   putDecimal(beginX360FAcqSurchrgRvCntCrA,x360FAcqSurchrgRvCntCrA,X_360_FACQ_SURCHRG_RV_CNT_CR_A_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgRvCntCrAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgRvCntCrA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgRvCntCrA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgRvCntCrA,X_360_FACQ_SURCHRG_RV_CNT_CR_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvCntCrA", beginX360FAcqSurchrgRvCntCrA,X_360_FACQ_SURCHRG_RV_CNT_CR_A_LEN);
     }
   	}
        int localX360FAcqSurchrgRvCntDbACounter = -1;
        public boolean isX360FAcqSurchrgRvCntDbAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvCntDbACounter != sharedCounter;
           localX360FAcqSurchrgRvCntDbACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvCntDbAIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvCntDbA,X_360_FACQ_SURCHRG_RV_CNT_DB_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int X_360_FACQ_SURCHRG_RV_CNT_DB_A_LEN = 5;
  	/**
	 * 	serializeX360FAcqSurchrgRvCntDbA
	 */
	protected void serializeX360FAcqSurchrgRvCntDbA(int x360FAcqSurchrgRvCntDbA) {
		   putDecimal(beginX360FAcqSurchrgRvCntDbA,x360FAcqSurchrgRvCntDbA,X_360_FACQ_SURCHRG_RV_CNT_DB_A_LEN,true);
   }
   

   protected int checkX360FAcqSurchrgRvCntDbAMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_1G /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshX360FAcqSurchrgRvCntDbA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshX360FAcqSurchrgRvCntDbA() throws CFException {	
   	try { 
		 return (getIntDecimal(beginX360FAcqSurchrgRvCntDbA,X_360_FACQ_SURCHRG_RV_CNT_DB_A_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvCntDbA", beginX360FAcqSurchrgRvCntDbA,X_360_FACQ_SURCHRG_RV_CNT_DB_A_LEN);
     }
   	}
        int localX360FAcqSurchrgRvAmtCrACounter = -1;
        public boolean isX360FAcqSurchrgRvAmtCrAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvAmtCrACounter != sharedCounter;
           localX360FAcqSurchrgRvAmtCrACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvAmtCrAIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvAmtCrA,X_360_FACQ_SURCHRG_RV_AMT_CR_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgRvAmtCrAString() {
            return getPackedString(beginX360FAcqSurchrgRvAmtCrA,X_360_FACQ_SURCHRG_RV_AMT_CR_A_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_CR_A_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_CR_A_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgRvAmtCrA
	 */
	protected void serializeX360FAcqSurchrgRvAmtCrA(BigDecimal x360FAcqSurchrgRvAmtCrA) {
		   putDecimal(beginX360FAcqSurchrgRvAmtCrA,x360FAcqSurchrgRvAmtCrA,X_360_FACQ_SURCHRG_RV_AMT_CR_A_LEN,X_360_FACQ_SURCHRG_RV_AMT_CR_A_SCALE,true);
		 localX360FAcqSurchrgRvAmtCrACounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgRvAmtCrAMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgRvAmtCrA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgRvAmtCrA() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgRvAmtCrA,X_360_FACQ_SURCHRG_RV_AMT_CR_A_LEN,X_360_FACQ_SURCHRG_RV_AMT_CR_A_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvAmtCrA", beginX360FAcqSurchrgRvAmtCrA,X_360_FACQ_SURCHRG_RV_AMT_CR_A_LEN);
     }
   	}
        int localX360FAcqSurchrgRvAmtDbACounter = -1;
        public boolean isX360FAcqSurchrgRvAmtDbAModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localX360FAcqSurchrgRvAmtDbACounter != sharedCounter;
           localX360FAcqSurchrgRvAmtDbACounter = sharedCounter; return hasModified; 
        }
	    public boolean x360FAcqSurchrgRvAmtDbAIsNumeric() {
	      return decimalIsNumeric(beginX360FAcqSurchrgRvAmtDbA,X_360_FACQ_SURCHRG_RV_AMT_DB_A_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] x360FAcqSurchrgRvAmtDbAString() {
            return getPackedString(beginX360FAcqSurchrgRvAmtDbA,X_360_FACQ_SURCHRG_RV_AMT_DB_A_LEN);
         }
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_DB_A_LEN = 8;
   protected static final int X_360_FACQ_SURCHRG_RV_AMT_DB_A_SCALE = 2;
  	/**
	 * 	serializeX360FAcqSurchrgRvAmtDbA
	 */
	protected void serializeX360FAcqSurchrgRvAmtDbA(BigDecimal x360FAcqSurchrgRvAmtDbA) {
		   putDecimal(beginX360FAcqSurchrgRvAmtDbA,x360FAcqSurchrgRvAmtDbA,X_360_FACQ_SURCHRG_RV_AMT_DB_A_LEN,X_360_FACQ_SURCHRG_RV_AMT_DB_A_SCALE,true);
		 localX360FAcqSurchrgRvAmtDbACounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkX360FAcqSurchrgRvAmtDbAMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshX360FAcqSurchrgRvAmtDbA is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshX360FAcqSurchrgRvAmtDbA() throws CFException {	
   	try { 
		 return (getDecimal(beginX360FAcqSurchrgRvAmtDbA,X_360_FACQ_SURCHRG_RV_AMT_DB_A_LEN,X_360_FACQ_SURCHRG_RV_AMT_DB_A_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("x360FAcqSurchrgRvAmtDbA", beginX360FAcqSurchrgRvAmtDbA,X_360_FACQ_SURCHRG_RV_AMT_DB_A_LEN);
     }
   	}




}
  
