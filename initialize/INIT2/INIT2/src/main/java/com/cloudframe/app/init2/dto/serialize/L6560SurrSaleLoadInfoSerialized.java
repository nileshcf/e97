package com.cloudframe.app.init2.dto.serialize;

/**
*  The class L6560SurrSaleLoadInfoSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class L6560SurrSaleLoadInfoSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(L6560SurrSaleLoadInfoSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_6560_SURR_SALE_LOAD_INFO_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginL6560SurrSaleLoadAmt;
	
	/**
	* Constructor for L6560SurrSaleLoadInfoSerialized
	**/
    public L6560SurrSaleLoadInfoSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for L6560SurrSaleLoadInfoSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public L6560SurrSaleLoadInfoSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this L6560SurrSaleLoadInfoSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,192); // serialize this field at offset 192 by default 
    }
    
	/**
	* sets parent for this L6560SurrSaleLoadInfoSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 192 by default
    }    
	/**
	* initializes the field in L6560SurrSaleLoadInfoSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_6560_SURR_SALE_LOAD_INFO_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginL6560SurrSaleLoadAmt = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localL6560SurrSaleLoadAmtCounter = -1;
        public boolean isL6560SurrSaleLoadAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localL6560SurrSaleLoadAmtCounter != sharedCounter;
           localL6560SurrSaleLoadAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean l6560SurrSaleLoadAmtIsNumeric() {
	      return decimalIsNumeric(beginL6560SurrSaleLoadAmt,L_6560_SURR_SALE_LOAD_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] l6560SurrSaleLoadAmtString() {
            return getPackedString(beginL6560SurrSaleLoadAmt,L_6560_SURR_SALE_LOAD_AMT_LEN);
         }
   protected static final int L_6560_SURR_SALE_LOAD_AMT_LEN = 8;
   protected static final int L_6560_SURR_SALE_LOAD_AMT_SCALE = 2;
  	/**
	 * 	serializeL6560SurrSaleLoadAmt
	 */
	protected void serializeL6560SurrSaleLoadAmt(BigDecimal l6560SurrSaleLoadAmt) {
		   putDecimal(beginL6560SurrSaleLoadAmt,l6560SurrSaleLoadAmt,L_6560_SURR_SALE_LOAD_AMT_LEN,L_6560_SURR_SALE_LOAD_AMT_SCALE,true);
		 localL6560SurrSaleLoadAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkL6560SurrSaleLoadAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshL6560SurrSaleLoadAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshL6560SurrSaleLoadAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginL6560SurrSaleLoadAmt,L_6560_SURR_SALE_LOAD_AMT_LEN,L_6560_SURR_SALE_LOAD_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("l6560SurrSaleLoadAmt", beginL6560SurrSaleLoadAmt,L_6560_SURR_SALE_LOAD_AMT_LEN);
     }
   	}




}
  
