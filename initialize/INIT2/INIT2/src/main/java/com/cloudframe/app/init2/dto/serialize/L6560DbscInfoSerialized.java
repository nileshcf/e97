package com.cloudframe.app.init2.dto.serialize;

/**
*  The class L6560DbscInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class L6560DbscInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(L6560DbscInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_6560_DBSC_INFO_LENGTH = 50;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginL6560DbscApplicableInd;
            protected  int beginL6560DbscTotSurrAmt;
            protected  int beginL6560DbscTotChrgAmt;
            protected  int beginL6560DbscTotFreeAmt;
            protected  int beginL6560DbscAssSurrAmt;
            protected  int beginL6560DbscAssChrgAmt;
            protected  int beginL6560DbscAssFreeAmt;
            protected  int beginL6560PlanFndTypCd;
	
	/**
	* Constructor for L6560DbscInfoSerialized
	**/
    public L6560DbscInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for L6560DbscInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560DbscInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this L6560DbscInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,56); // serialize this field at offset 56 by default 
    }
    
	/**
	* sets parent for this L6560DbscInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 56 by default
    }    
	/**
	* initializes the field in L6560DbscInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_6560_DBSC_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginL6560DbscApplicableInd = getStartOffset() + 0;	// set offset for serialization
  
             beginL6560DbscTotSurrAmt = getStartOffset() + 1;	// set offset for serialization
  
             beginL6560DbscTotChrgAmt = getStartOffset() + 9;	// set offset for serialization
  
             beginL6560DbscTotFreeAmt = getStartOffset() + 17;	// set offset for serialization
  
             beginL6560DbscAssSurrAmt = getStartOffset() + 25;	// set offset for serialization
  
             beginL6560DbscAssChrgAmt = getStartOffset() + 33;	// set offset for serialization
  
             beginL6560DbscAssFreeAmt = getStartOffset() + 41;	// set offset for serialization
  
             beginL6560PlanFndTypCd = getStartOffset() + 49;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localL6560DbscApplicableIndCounter = -1;
     public boolean isL6560DbscApplicableIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560DbscApplicableIndCounter != sharedCounter;
         localL6560DbscApplicableIndCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_DBSC_APPLICABLE_IND_LEN = 1;
	/**
	 * 	serialize this L6560DbscApplicableInd
	 */
   protected void serializeL6560DbscApplicableInd(char[] l6560DbscApplicableInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560DbscApplicableInd,0,getStringValue(),beginL6560DbscApplicableInd,L_6560_DBSC_APPLICABLE_IND_LEN);
       localL6560DbscApplicableIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560DbscApplicableIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL6560DbscApplicableInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560DbscApplicableInd() {	 
   		return (substring(getStringValue(),beginL6560DbscApplicableInd,beginL6560DbscApplicableInd + L_6560_DBSC_APPLICABLE_IND_LEN));
   	}
        int localL6560DbscTotSurrAmtCounter = -1;
        public boolean isL6560DbscTotSurrAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560DbscTotSurrAmtCounter != sharedCounter;
           localL6560DbscTotSurrAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560DbscTotSurrAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560DbscTotSurrAmt,L_6560_DBSC_TOT_SURR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560DbscTotSurrAmtString() {
            return getPackedString(beginL6560DbscTotSurrAmt,L_6560_DBSC_TOT_SURR_AMT_LEN);
         }
   protected static final int L_6560_DBSC_TOT_SURR_AMT_LEN = 8;
   protected static final int L_6560_DBSC_TOT_SURR_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560DbscTotSurrAmt
	 */
	protected void serializeL6560DbscTotSurrAmt(BigDecimal l6560DbscTotSurrAmt) {
		   putDecimal(beginL6560DbscTotSurrAmt,l6560DbscTotSurrAmt,L_6560_DBSC_TOT_SURR_AMT_LEN,L_6560_DBSC_TOT_SURR_AMT_SCALE,true);
		 localL6560DbscTotSurrAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560DbscTotSurrAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560DbscTotSurrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560DbscTotSurrAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560DbscTotSurrAmt,L_6560_DBSC_TOT_SURR_AMT_LEN,L_6560_DBSC_TOT_SURR_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560DbscTotSurrAmt", beginL6560DbscTotSurrAmt,L_6560_DBSC_TOT_SURR_AMT_LEN);
     }
   	}
        int localL6560DbscTotChrgAmtCounter = -1;
        public boolean isL6560DbscTotChrgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560DbscTotChrgAmtCounter != sharedCounter;
           localL6560DbscTotChrgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560DbscTotChrgAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560DbscTotChrgAmt,L_6560_DBSC_TOT_CHRG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560DbscTotChrgAmtString() {
            return getPackedString(beginL6560DbscTotChrgAmt,L_6560_DBSC_TOT_CHRG_AMT_LEN);
         }
   protected static final int L_6560_DBSC_TOT_CHRG_AMT_LEN = 8;
   protected static final int L_6560_DBSC_TOT_CHRG_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560DbscTotChrgAmt
	 */
	protected void serializeL6560DbscTotChrgAmt(BigDecimal l6560DbscTotChrgAmt) {
		   putDecimal(beginL6560DbscTotChrgAmt,l6560DbscTotChrgAmt,L_6560_DBSC_TOT_CHRG_AMT_LEN,L_6560_DBSC_TOT_CHRG_AMT_SCALE,true);
		 localL6560DbscTotChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560DbscTotChrgAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560DbscTotChrgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560DbscTotChrgAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560DbscTotChrgAmt,L_6560_DBSC_TOT_CHRG_AMT_LEN,L_6560_DBSC_TOT_CHRG_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560DbscTotChrgAmt", beginL6560DbscTotChrgAmt,L_6560_DBSC_TOT_CHRG_AMT_LEN);
     }
   	}
        int localL6560DbscTotFreeAmtCounter = -1;
        public boolean isL6560DbscTotFreeAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560DbscTotFreeAmtCounter != sharedCounter;
           localL6560DbscTotFreeAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560DbscTotFreeAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560DbscTotFreeAmt,L_6560_DBSC_TOT_FREE_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560DbscTotFreeAmtString() {
            return getPackedString(beginL6560DbscTotFreeAmt,L_6560_DBSC_TOT_FREE_AMT_LEN);
         }
   protected static final int L_6560_DBSC_TOT_FREE_AMT_LEN = 8;
   protected static final int L_6560_DBSC_TOT_FREE_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560DbscTotFreeAmt
	 */
	protected void serializeL6560DbscTotFreeAmt(BigDecimal l6560DbscTotFreeAmt) {
		   putDecimal(beginL6560DbscTotFreeAmt,l6560DbscTotFreeAmt,L_6560_DBSC_TOT_FREE_AMT_LEN,L_6560_DBSC_TOT_FREE_AMT_SCALE,true);
		 localL6560DbscTotFreeAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560DbscTotFreeAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560DbscTotFreeAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560DbscTotFreeAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560DbscTotFreeAmt,L_6560_DBSC_TOT_FREE_AMT_LEN,L_6560_DBSC_TOT_FREE_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560DbscTotFreeAmt", beginL6560DbscTotFreeAmt,L_6560_DBSC_TOT_FREE_AMT_LEN);
     }
   	}
        int localL6560DbscAssSurrAmtCounter = -1;
        public boolean isL6560DbscAssSurrAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560DbscAssSurrAmtCounter != sharedCounter;
           localL6560DbscAssSurrAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560DbscAssSurrAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560DbscAssSurrAmt,L_6560_DBSC_ASS_SURR_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560DbscAssSurrAmtString() {
            return getPackedString(beginL6560DbscAssSurrAmt,L_6560_DBSC_ASS_SURR_AMT_LEN);
         }
   protected static final int L_6560_DBSC_ASS_SURR_AMT_LEN = 8;
   protected static final int L_6560_DBSC_ASS_SURR_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560DbscAssSurrAmt
	 */
	protected void serializeL6560DbscAssSurrAmt(BigDecimal l6560DbscAssSurrAmt) {
		   putDecimal(beginL6560DbscAssSurrAmt,l6560DbscAssSurrAmt,L_6560_DBSC_ASS_SURR_AMT_LEN,L_6560_DBSC_ASS_SURR_AMT_SCALE,true);
		 localL6560DbscAssSurrAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560DbscAssSurrAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560DbscAssSurrAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560DbscAssSurrAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560DbscAssSurrAmt,L_6560_DBSC_ASS_SURR_AMT_LEN,L_6560_DBSC_ASS_SURR_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560DbscAssSurrAmt", beginL6560DbscAssSurrAmt,L_6560_DBSC_ASS_SURR_AMT_LEN);
     }
   	}
        int localL6560DbscAssChrgAmtCounter = -1;
        public boolean isL6560DbscAssChrgAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560DbscAssChrgAmtCounter != sharedCounter;
           localL6560DbscAssChrgAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560DbscAssChrgAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560DbscAssChrgAmt,L_6560_DBSC_ASS_CHRG_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560DbscAssChrgAmtString() {
            return getPackedString(beginL6560DbscAssChrgAmt,L_6560_DBSC_ASS_CHRG_AMT_LEN);
         }
   protected static final int L_6560_DBSC_ASS_CHRG_AMT_LEN = 8;
   protected static final int L_6560_DBSC_ASS_CHRG_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560DbscAssChrgAmt
	 */
	protected void serializeL6560DbscAssChrgAmt(BigDecimal l6560DbscAssChrgAmt) {
		   putDecimal(beginL6560DbscAssChrgAmt,l6560DbscAssChrgAmt,L_6560_DBSC_ASS_CHRG_AMT_LEN,L_6560_DBSC_ASS_CHRG_AMT_SCALE,true);
		 localL6560DbscAssChrgAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560DbscAssChrgAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560DbscAssChrgAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560DbscAssChrgAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560DbscAssChrgAmt,L_6560_DBSC_ASS_CHRG_AMT_LEN,L_6560_DBSC_ASS_CHRG_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560DbscAssChrgAmt", beginL6560DbscAssChrgAmt,L_6560_DBSC_ASS_CHRG_AMT_LEN);
     }
   	}
        int localL6560DbscAssFreeAmtCounter = -1;
        public boolean isL6560DbscAssFreeAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560DbscAssFreeAmtCounter != sharedCounter;
           localL6560DbscAssFreeAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560DbscAssFreeAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560DbscAssFreeAmt,L_6560_DBSC_ASS_FREE_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560DbscAssFreeAmtString() {
            return getPackedString(beginL6560DbscAssFreeAmt,L_6560_DBSC_ASS_FREE_AMT_LEN);
         }
   protected static final int L_6560_DBSC_ASS_FREE_AMT_LEN = 8;
   protected static final int L_6560_DBSC_ASS_FREE_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560DbscAssFreeAmt
	 */
	protected void serializeL6560DbscAssFreeAmt(BigDecimal l6560DbscAssFreeAmt) {
		   putDecimal(beginL6560DbscAssFreeAmt,l6560DbscAssFreeAmt,L_6560_DBSC_ASS_FREE_AMT_LEN,L_6560_DBSC_ASS_FREE_AMT_SCALE,true);
		 localL6560DbscAssFreeAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560DbscAssFreeAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560DbscAssFreeAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560DbscAssFreeAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560DbscAssFreeAmt,L_6560_DBSC_ASS_FREE_AMT_LEN,L_6560_DBSC_ASS_FREE_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560DbscAssFreeAmt", beginL6560DbscAssFreeAmt,L_6560_DBSC_ASS_FREE_AMT_LEN);
     }
   	}
     int localL6560PlanFndTypCdCounter = -1;
     public boolean isL6560PlanFndTypCdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localL6560PlanFndTypCdCounter != sharedCounter;
         localL6560PlanFndTypCdCounter = sharedCounter; return hasModified;
     }
	protected static final int L_6560_PLAN_FND_TYP_CD_LEN = 1;
	/**
	 * 	serialize this L6560PlanFndTypCd
	 */
   protected void serializeL6560PlanFndTypCd(char[] l6560PlanFndTypCd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(l6560PlanFndTypCd,0,getStringValue(),beginL6560PlanFndTypCd,L_6560_PLAN_FND_TYP_CD_LEN);
       localL6560PlanFndTypCdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkL6560PlanFndTypCdConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshL6560PlanFndTypCd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshL6560PlanFndTypCd() {	 
   		return (substring(getStringValue(),beginL6560PlanFndTypCd,beginL6560PlanFndTypCd + L_6560_PLAN_FND_TYP_CD_LEN));
   	}




}
  
