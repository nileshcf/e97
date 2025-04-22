package com.cloudframe.app.divide0.dto.serialize;

/**
*  The class DaTblEntriesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:21. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class DaTblEntriesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DaTblEntriesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DA_TBL_ENTRIES_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDaPercent;
	
	/**
	* Constructor for DaTblEntriesSerialized
	**/
    public DaTblEntriesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DaTblEntriesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DaTblEntriesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DaTblEntriesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,38); // serialize this field at offset 38 by default 
    }
    
	/**
	* sets parent for this DaTblEntriesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 38 by default
    }    
	/**
	* initializes the field in DaTblEntriesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DA_TBL_ENTRIES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDaPercent = getStartOffset() + 13;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDaPercentCounter = -1;
     
     public boolean isDaPercentModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDaPercentCounter != sharedCounter;
         localDaPercentCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of daPercent
	 *	@return daPercent
	 */
	public char[]  getDaPercentString() {
	    return getCharArray(beginDaPercent,DA_PERCENT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean daPercentIsNumeric() {
		    return isNumeric(beginDaPercent
	                    ,beginDaPercent + DA_PERCENT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int DA_PERCENT_LEN = 5;
  protected  static final int DA_PERCENT_SCALE = 2;

   protected BigDecimal checkDaPercentMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,5/*precision*/);
   }

  	/**
	 * serializeDaPercent
	 */
	protected void serializeDaPercent(BigDecimal daPercent) {
	       putNumber(beginDaPercent,daPercent,DA_PERCENT_LEN,DA_PERCENT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localDaPercentCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeDaPercent
	 */
   	protected  BigDecimal serializeDaPercent(char[] value) throws CFException {
        if (value.length < 5) value = pad(5, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginDaPercent
		       ,5
		      );		 localDaPercentCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,DA_PERCENT_LEN,DA_PERCENT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("daPercent", beginDaPercent,DA_PERCENT_LEN);
    	}
    }
    /**
	 *	refreshDaPercent is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshDaPercent() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginDaPercent
			            ,DA_PERCENT_LEN
			            ,DA_PERCENT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("daPercent", beginDaPercent,DA_PERCENT_LEN);
    }
   	}




}
  
