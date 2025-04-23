package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpPsTransAmountXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpPsTransAmountXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpPsTransAmountXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_PS_TRANS_AMOUNT_X_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpPsTransAmount;
	
	/**
	* Constructor for RpPsTransAmountXSerialized
	**/
    public RpPsTransAmountXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for RpPsTransAmountXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public RpPsTransAmountXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this RpPsTransAmountXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,100); // serialize this field at offset 100 by default 
    }
    
	/**
	* sets parent for this RpPsTransAmountXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 100 by default
    }    
	/**
	* initializes the field in RpPsTransAmountXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_PS_TRANS_AMOUNT_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginRpPsTransAmount = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpPsTransAmountCounter = -1;
     public boolean isRpPsTransAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpPsTransAmountCounter != sharedCounter;
         localRpPsTransAmountCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_PS_TRANS_AMOUNT_LEN = 8;
	/**
	 * 	serialize this RpPsTransAmount
	 */
   protected void serializeRpPsTransAmount(char[] rpPsTransAmount) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpPsTransAmount,0,getStringValue(),beginRpPsTransAmount,RP_PS_TRANS_AMOUNT_LEN);
       localRpPsTransAmountCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpPsTransAmountConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpPsTransAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpPsTransAmount() {	 
   		return (substring(getStringValue(),beginRpPsTransAmount,beginRpPsTransAmount + RP_PS_TRANS_AMOUNT_LEN));
   	}




}
  
