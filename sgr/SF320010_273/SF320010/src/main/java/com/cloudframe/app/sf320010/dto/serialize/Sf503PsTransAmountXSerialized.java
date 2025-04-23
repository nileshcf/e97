package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503PsTransAmountXSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Sf503PsTransAmountXSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503PsTransAmountXSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_PS_TRANS_AMOUNT_X_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503PsTransAmount;
	
	/**
	* Constructor for Sf503PsTransAmountXSerialized
	**/
    public Sf503PsTransAmountXSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503PsTransAmountXSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503PsTransAmountXSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503PsTransAmountXSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,110); // serialize this field at offset 110 by default 
    }
    
	/**
	* sets parent for this Sf503PsTransAmountXSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 110 by default
    }    
	/**
	* initializes the field in Sf503PsTransAmountXSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_PS_TRANS_AMOUNT_X_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503PsTransAmount = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503PsTransAmountCounter = -1;
     
     public boolean isSf503PsTransAmountModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503PsTransAmountCounter != sharedCounter;
         localSf503PsTransAmountCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of sf503PsTransAmount
	 *	@return sf503PsTransAmount
	 */
	public char[]  getSf503PsTransAmountString() {
	    return getCharArray(beginSf503PsTransAmount,SF_503_PS_TRANS_AMOUNT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean sf503PsTransAmountIsNumeric() {
		    return isNumeric(beginSf503PsTransAmount
	                    ,beginSf503PsTransAmount + SF_503_PS_TRANS_AMOUNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int SF_503_PS_TRANS_AMOUNT_LEN = 7;
  protected  static final int SF_503_PS_TRANS_AMOUNT_SCALE = 2;

   protected BigDecimal checkSf503PsTransAmountMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,7/*precision*/);
   }

  	/**
	 * serializeSf503PsTransAmount
	 */
	protected void serializeSf503PsTransAmount(BigDecimal sf503PsTransAmount) {
	       putNumber(beginSf503PsTransAmount,sf503PsTransAmount,SF_503_PS_TRANS_AMOUNT_LEN,SF_503_PS_TRANS_AMOUNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localSf503PsTransAmountCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeSf503PsTransAmount
	 */
   	protected  BigDecimal serializeSf503PsTransAmount(char[] value) throws CFException {
        if (value.length < 7) value = pad(7, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(7,value,false/*isSigned?*/)
		       ,beginSf503PsTransAmount
		       ,7
		      );		 localSf503PsTransAmountCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,SF_503_PS_TRANS_AMOUNT_LEN,SF_503_PS_TRANS_AMOUNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("sf503PsTransAmount", beginSf503PsTransAmount,SF_503_PS_TRANS_AMOUNT_LEN);
    	}
    }
    /**
	 *	refreshSf503PsTransAmount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshSf503PsTransAmount() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginSf503PsTransAmount
			            ,SF_503_PS_TRANS_AMOUNT_LEN
			            ,SF_503_PS_TRANS_AMOUNT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("sf503PsTransAmount", beginSf503PsTransAmount,SF_503_PS_TRANS_AMOUNT_LEN);
    }
   	}




}
  
