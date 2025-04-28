package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WlilhMrTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WlilhMrTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WlilhMrTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WLILH_MR_TBL_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWlilhMrTblPayInd;
            protected  int beginWlilhMrTblLoanAmt;
	
	/**
	* Constructor for WlilhMrTblSerialized
	**/
    public WlilhMrTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WlilhMrTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WlilhMrTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WlilhMrTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WlilhMrTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WlilhMrTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WLILH_MR_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWlilhMrTblPayInd = getStartOffset() + 0;	// set offset for serialization
  
             beginWlilhMrTblLoanAmt = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWlilhMrTblPayIndCounter = -1;
     public boolean isWlilhMrTblPayIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWlilhMrTblPayIndCounter != sharedCounter;
         localWlilhMrTblPayIndCounter = sharedCounter; return hasModified;
     }
	protected static final int WLILH_MR_TBL_PAY_IND_LEN = 1;
	/**
	 * 	serialize this WlilhMrTblPayInd
	 */
   protected void serializeWlilhMrTblPayInd(char[] wlilhMrTblPayInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(wlilhMrTblPayInd,0,getStringValue(),beginWlilhMrTblPayInd,WLILH_MR_TBL_PAY_IND_LEN);
       localWlilhMrTblPayIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWlilhMrTblPayIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshWlilhMrTblPayInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWlilhMrTblPayInd() {	 
   		return (substring(getStringValue(),beginWlilhMrTblPayInd,beginWlilhMrTblPayInd + WLILH_MR_TBL_PAY_IND_LEN));
   	}
        int localWlilhMrTblLoanAmtCounter = -1;
        public boolean isWlilhMrTblLoanAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWlilhMrTblLoanAmtCounter != sharedCounter;
           localWlilhMrTblLoanAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean wlilhMrTblLoanAmtIsNumeric() {
	      return decimalIsNumeric(beginWlilhMrTblLoanAmt,WLILH_MR_TBL_LOAN_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wlilhMrTblLoanAmtString() {
            return getPackedString(beginWlilhMrTblLoanAmt,WLILH_MR_TBL_LOAN_AMT_LEN);
         }
   protected static final int WLILH_MR_TBL_LOAN_AMT_LEN = 6;
   protected static final int WLILH_MR_TBL_LOAN_AMT_SCALE = 2;
  	/**
	 * 	serializeWlilhMrTblLoanAmt
	 */
	protected void serializeWlilhMrTblLoanAmt(BigDecimal wlilhMrTblLoanAmt) {
		   putDecimal(beginWlilhMrTblLoanAmt,wlilhMrTblLoanAmt,WLILH_MR_TBL_LOAN_AMT_LEN,WLILH_MR_TBL_LOAN_AMT_SCALE,true);
		 localWlilhMrTblLoanAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWlilhMrTblLoanAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshWlilhMrTblLoanAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWlilhMrTblLoanAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginWlilhMrTblLoanAmt,WLILH_MR_TBL_LOAN_AMT_LEN,WLILH_MR_TBL_LOAN_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wlilhMrTblLoanAmt", beginWlilhMrTblLoanAmt,WLILH_MR_TBL_LOAN_AMT_LEN);
     }
   	}




}
  
