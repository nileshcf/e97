package com.cloudframe.app.init1.dto.serialize;

/**
*  The class Rlu5fDeviceTaxSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Rlu5fDeviceTaxSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Rlu5fDeviceTaxSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RLU_5F_DEVICE_TAX_LENGTH = 56;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRlu5fDeviceTaxDesc;
            protected  int beginRlu5fDeviceTaxAmt;
	
	/**
	* Constructor for Rlu5fDeviceTaxSerialized
	**/
    public Rlu5fDeviceTaxSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Rlu5fDeviceTaxSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Rlu5fDeviceTaxSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Rlu5fDeviceTaxSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,686); // serialize this field at offset 686 by default 
    }
    
	/**
	* sets parent for this Rlu5fDeviceTaxSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 686 by default
    }    
	/**
	* initializes the field in Rlu5fDeviceTaxSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RLU_5F_DEVICE_TAX_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRlu5fDeviceTaxDesc = getStartOffset() + 0;	// set offset for serialization
  
             beginRlu5fDeviceTaxAmt = getStartOffset() + 50;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRlu5fDeviceTaxDescCounter = -1;
     public boolean isRlu5fDeviceTaxDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRlu5fDeviceTaxDescCounter != sharedCounter;
         localRlu5fDeviceTaxDescCounter = sharedCounter; return hasModified;
     }
	protected static final int RLU_5F_DEVICE_TAX_DESC_LEN = 50;
	/**
	 * 	serialize this Rlu5fDeviceTaxDesc
	 */
   protected void serializeRlu5fDeviceTaxDesc(char[] rlu5fDeviceTaxDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rlu5fDeviceTaxDesc,0,getStringValue(),beginRlu5fDeviceTaxDesc,RLU_5F_DEVICE_TAX_DESC_LEN);
       localRlu5fDeviceTaxDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRlu5fDeviceTaxDescConstraints(char[] value) {
   			return super.checkConstraints(value , 50 ,false, false);
   }
    /**
	 *	refreshRlu5fDeviceTaxDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRlu5fDeviceTaxDesc() {	 
   		return (substring(getStringValue(),beginRlu5fDeviceTaxDesc,beginRlu5fDeviceTaxDesc + RLU_5F_DEVICE_TAX_DESC_LEN));
   	}
        int localRlu5fDeviceTaxAmtCounter = -1;
        public boolean isRlu5fDeviceTaxAmtModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localRlu5fDeviceTaxAmtCounter != sharedCounter;
           localRlu5fDeviceTaxAmtCounter = sharedCounter; return hasModified; 
        }
	    public boolean rlu5fDeviceTaxAmtIsNumeric() {
	      return decimalIsNumeric(beginRlu5fDeviceTaxAmt,RLU_5F_DEVICE_TAX_AMT_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] rlu5fDeviceTaxAmtString() {
            return getPackedString(beginRlu5fDeviceTaxAmt,RLU_5F_DEVICE_TAX_AMT_LEN);
         }
   protected static final int RLU_5F_DEVICE_TAX_AMT_LEN = 6;
   protected static final int RLU_5F_DEVICE_TAX_AMT_SCALE = 2;
  	/**
	 * 	serializeRlu5fDeviceTaxAmt
	 */
	protected void serializeRlu5fDeviceTaxAmt(BigDecimal rlu5fDeviceTaxAmt) {
		   putDecimal(beginRlu5fDeviceTaxAmt,rlu5fDeviceTaxAmt,RLU_5F_DEVICE_TAX_AMT_LEN,RLU_5F_DEVICE_TAX_AMT_SCALE,true);
		 localRlu5fDeviceTaxAmtCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkRlu5fDeviceTaxAmtMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,2/*scale*/,11/*precision*/);
   }
     /**
	 *	refreshRlu5fDeviceTaxAmt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshRlu5fDeviceTaxAmt() throws CFException {	
   	try { 
		 return (getDecimal(beginRlu5fDeviceTaxAmt,RLU_5F_DEVICE_TAX_AMT_LEN,RLU_5F_DEVICE_TAX_AMT_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("rlu5fDeviceTaxAmt", beginRlu5fDeviceTaxAmt,RLU_5F_DEVICE_TAX_AMT_LEN);
     }
   	}




}
  
