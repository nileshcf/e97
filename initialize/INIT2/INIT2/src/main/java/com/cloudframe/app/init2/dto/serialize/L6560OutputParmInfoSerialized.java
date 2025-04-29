package com.cloudframe.app.init2.dto.serialize;

/**
*  The class L6560OutputParmInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:12. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class L6560OutputParmInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(L6560OutputParmInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_6560_OUTPUT_PARM_INFO_LENGTH = 860;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginL6560RetrnCd;
            protected  int beginL6560SurrChrgAmt;
            protected  int beginL6560SurrChrgFlatAmt;
            protected  int beginL6560SurrChrgPct;
            protected  int beginL6560MktvalAdjAmt;
           protected int beginL6560SurrSaleLoadInfo;
           protected static final int L_6560_SURR_SALE_LOAD_INFO_SIZE = 99;
            protected  int beginL6560FreeWthdrwAmt;
	
	/**
	* Constructor for L6560OutputParmInfoSerialized
	**/
    public L6560OutputParmInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for L6560OutputParmInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560OutputParmInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this L6560OutputParmInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,157); // serialize this field at offset 157 by default 
    }
    
	/**
	* sets parent for this L6560OutputParmInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 157 by default
    }    
	/**
	* initializes the field in L6560OutputParmInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_6560_OUTPUT_PARM_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginL6560RetrnCd = getStartOffset() + 0;	// set offset for serialization
  
             beginL6560SurrChrgAmt = getStartOffset() + 2;	// set offset for serialization
  
             beginL6560SurrChrgFlatAmt = getStartOffset() + 10;	// set offset for serialization
  
             beginL6560SurrChrgPct = getStartOffset() + 18;	// set offset for serialization
  
             beginL6560MktvalAdjAmt = getStartOffset() + 27;	// set offset for serialization
  
	        beginL6560SurrSaleLoadInfo = getStartOffset() + 35; // set offset for serialization
  
             beginL6560FreeWthdrwAmt = getStartOffset() + 827;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localL6560RetrnCdCounter = -1;
         public boolean isL6560RetrnCdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localL6560RetrnCdCounter != sharedCounter;
            localL6560RetrnCdCounter = sharedCounter; return hasModified; 
         }
   protected static final int L_6560_RETRN_CD_LEN = 2;
  	/**
	 * serializeL6560RetrnCd
	 */
	protected void serializeL6560RetrnCd(short l6560RetrnCd) {
           replaceValue( //  save the value as string
                   getBinaryString( l6560RetrnCd,L_6560_RETRN_CD_LEN)
                  ,beginL6560RetrnCd
                  ,L_6560_RETRN_CD_LEN
                 );
            localL6560RetrnCdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkL6560RetrnCdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshL6560RetrnCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshL6560RetrnCd() {	 
			return (getShort(beginL6560RetrnCd));
   	}
        int localL6560SurrChrgAmtCounter = -1;
        public boolean isL6560SurrChrgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560SurrChrgAmtCounter != sharedCounter;
           localL6560SurrChrgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560SurrChrgAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560SurrChrgAmt,L_6560_SURR_CHRG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560SurrChrgAmtString() {
            return getPackedString(beginL6560SurrChrgAmt,L_6560_SURR_CHRG_AMT_LEN);
         }
   protected static final int L_6560_SURR_CHRG_AMT_LEN = 8;
   protected static final int L_6560_SURR_CHRG_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560SurrChrgAmt
	 */
	protected void serializeL6560SurrChrgAmt(BigDecimal l6560SurrChrgAmt) {
		   putDecimal(beginL6560SurrChrgAmt,l6560SurrChrgAmt,L_6560_SURR_CHRG_AMT_LEN,L_6560_SURR_CHRG_AMT_SCALE,true);
		 localL6560SurrChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560SurrChrgAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560SurrChrgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560SurrChrgAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560SurrChrgAmt,L_6560_SURR_CHRG_AMT_LEN,L_6560_SURR_CHRG_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560SurrChrgAmt", beginL6560SurrChrgAmt,L_6560_SURR_CHRG_AMT_LEN);
     }
   	}
        int localL6560SurrChrgFlatAmtCounter = -1;
        public boolean isL6560SurrChrgFlatAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560SurrChrgFlatAmtCounter != sharedCounter;
           localL6560SurrChrgFlatAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560SurrChrgFlatAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560SurrChrgFlatAmt,L_6560_SURR_CHRG_FLAT_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560SurrChrgFlatAmtString() {
            return getPackedString(beginL6560SurrChrgFlatAmt,L_6560_SURR_CHRG_FLAT_AMT_LEN);
         }
   protected static final int L_6560_SURR_CHRG_FLAT_AMT_LEN = 8;
   protected static final int L_6560_SURR_CHRG_FLAT_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560SurrChrgFlatAmt
	 */
	protected void serializeL6560SurrChrgFlatAmt(BigDecimal l6560SurrChrgFlatAmt) {
		   putDecimal(beginL6560SurrChrgFlatAmt,l6560SurrChrgFlatAmt,L_6560_SURR_CHRG_FLAT_AMT_LEN,L_6560_SURR_CHRG_FLAT_AMT_SCALE,true);
		 localL6560SurrChrgFlatAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560SurrChrgFlatAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560SurrChrgFlatAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560SurrChrgFlatAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560SurrChrgFlatAmt,L_6560_SURR_CHRG_FLAT_AMT_LEN,L_6560_SURR_CHRG_FLAT_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560SurrChrgFlatAmt", beginL6560SurrChrgFlatAmt,L_6560_SURR_CHRG_FLAT_AMT_LEN);
     }
   	}
        int localL6560SurrChrgPctCounter = -1;
        public boolean isL6560SurrChrgPctModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560SurrChrgPctCounter != sharedCounter;
           localL6560SurrChrgPctCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560SurrChrgPctIsNumeric() {
	      return decimalIsNumeric(beginL6560SurrChrgPct,L_6560_SURR_CHRG_PCT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560SurrChrgPctString() {
            return getPackedString(beginL6560SurrChrgPct,L_6560_SURR_CHRG_PCT_LEN);
         }
   protected static final int L_6560_SURR_CHRG_PCT_LEN = 9;
   protected static final int L_6560_SURR_CHRG_PCT_SCALE = 8;
  	/**
	 * 	serializeL6560SurrChrgPct
	 */
	protected void serializeL6560SurrChrgPct(BigDecimal l6560SurrChrgPct) {
		   putDecimal(beginL6560SurrChrgPct,l6560SurrChrgPct,L_6560_SURR_CHRG_PCT_LEN,L_6560_SURR_CHRG_PCT_SCALE,true);
		 localL6560SurrChrgPctCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560SurrChrgPctMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,8/*scale*/,17/*precision*/);
   }
     /**
	 *	refreshL6560SurrChrgPct is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560SurrChrgPct() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560SurrChrgPct,L_6560_SURR_CHRG_PCT_LEN,L_6560_SURR_CHRG_PCT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560SurrChrgPct", beginL6560SurrChrgPct,L_6560_SURR_CHRG_PCT_LEN);
     }
   	}
        int localL6560MktvalAdjAmtCounter = -1;
        public boolean isL6560MktvalAdjAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560MktvalAdjAmtCounter != sharedCounter;
           localL6560MktvalAdjAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560MktvalAdjAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560MktvalAdjAmt,L_6560_MKTVAL_ADJ_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560MktvalAdjAmtString() {
            return getPackedString(beginL6560MktvalAdjAmt,L_6560_MKTVAL_ADJ_AMT_LEN);
         }
   protected static final int L_6560_MKTVAL_ADJ_AMT_LEN = 8;
   protected static final int L_6560_MKTVAL_ADJ_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560MktvalAdjAmt
	 */
	protected void serializeL6560MktvalAdjAmt(BigDecimal l6560MktvalAdjAmt) {
		   putDecimal(beginL6560MktvalAdjAmt,l6560MktvalAdjAmt,L_6560_MKTVAL_ADJ_AMT_LEN,L_6560_MKTVAL_ADJ_AMT_SCALE,true);
		 localL6560MktvalAdjAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560MktvalAdjAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560MktvalAdjAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560MktvalAdjAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560MktvalAdjAmt,L_6560_MKTVAL_ADJ_AMT_LEN,L_6560_MKTVAL_ADJ_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560MktvalAdjAmt", beginL6560MktvalAdjAmt,L_6560_MKTVAL_ADJ_AMT_LEN);
     }
   	}
        int localL6560FreeWthdrwAmtCounter = -1;
        public boolean isL6560FreeWthdrwAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560FreeWthdrwAmtCounter != sharedCounter;
           localL6560FreeWthdrwAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560FreeWthdrwAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560FreeWthdrwAmt,L_6560_FREE_WTHDRW_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560FreeWthdrwAmtString() {
            return getPackedString(beginL6560FreeWthdrwAmt,L_6560_FREE_WTHDRW_AMT_LEN);
         }
   protected static final int L_6560_FREE_WTHDRW_AMT_LEN = 8;
   protected static final int L_6560_FREE_WTHDRW_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560FreeWthdrwAmt
	 */
	protected void serializeL6560FreeWthdrwAmt(BigDecimal l6560FreeWthdrwAmt) {
		   putDecimal(beginL6560FreeWthdrwAmt,l6560FreeWthdrwAmt,L_6560_FREE_WTHDRW_AMT_LEN,L_6560_FREE_WTHDRW_AMT_SCALE,true);
		 localL6560FreeWthdrwAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560FreeWthdrwAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560FreeWthdrwAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560FreeWthdrwAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560FreeWthdrwAmt,L_6560_FREE_WTHDRW_AMT_LEN,L_6560_FREE_WTHDRW_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560FreeWthdrwAmt", beginL6560FreeWthdrwAmt,L_6560_FREE_WTHDRW_AMT_LEN);
     }
   	}

		public int l6560SurrSaleLoadInfoSize() {
			return L_6560_SURR_SALE_LOAD_INFO_SIZE;
		}



}
  
