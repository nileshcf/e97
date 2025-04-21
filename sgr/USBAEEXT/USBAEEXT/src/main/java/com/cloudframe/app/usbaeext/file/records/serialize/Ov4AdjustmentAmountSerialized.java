package com.cloudframe.app.usbaeext.file.records.serialize;

/**
*  The class Ov4AdjustmentAmountSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class Ov4AdjustmentAmountSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ov4AdjustmentAmountSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OV_4_ADJUSTMENT_AMOUNT_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginOv4AdjSign;
            protected  int beginOv4AdjAmnt;
	
	/**
	* Constructor for Ov4AdjustmentAmountSerialized
	**/
    public Ov4AdjustmentAmountSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ov4AdjustmentAmountSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ov4AdjustmentAmountSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ov4AdjustmentAmountSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,192); // serialize this field at offset 192 by default 
    }
    
	/**
	* sets parent for this Ov4AdjustmentAmountSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 192 by default
    }    
	/**
	* initializes the field in Ov4AdjustmentAmountSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OV_4_ADJUSTMENT_AMOUNT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginOv4AdjSign = getStartOffset() + 0;	// set offset for serialization
  
             beginOv4AdjAmnt = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localOv4AdjSignCounter = -1;
     public boolean isOv4AdjSignModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AdjSignCounter != sharedCounter;
         localOv4AdjSignCounter = sharedCounter; return hasModified;
     }
	protected static final int OV_4_ADJ_SIGN_LEN = 1;
	/**
	 * 	serialize this Ov4AdjSign
	 */
   protected void serializeOv4AdjSign(char[] ov4AdjSign) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ov4AdjSign,0,getStringValue(),beginOv4AdjSign,OV_4_ADJ_SIGN_LEN);
       localOv4AdjSignCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkOv4AdjSignConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshOv4AdjSign is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshOv4AdjSign() {	 
   		return (substring(getStringValue(),beginOv4AdjSign,beginOv4AdjSign + OV_4_ADJ_SIGN_LEN));
   	}
     int localOv4AdjAmntCounter = -1;
     
     public boolean isOv4AdjAmntModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localOv4AdjAmntCounter != sharedCounter;
         localOv4AdjAmntCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of ov4AdjAmnt
	 *	@return ov4AdjAmnt
	 */
	public char[]  getOv4AdjAmntString() {
	    return getCharArray(beginOv4AdjAmnt,OV_4_ADJ_AMNT_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean ov4AdjAmntIsNumeric() {
		    return isNumeric(beginOv4AdjAmnt
	                    ,beginOv4AdjAmnt + OV_4_ADJ_AMNT_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int OV_4_ADJ_AMNT_LEN = 18;
  protected  static final int OV_4_ADJ_AMNT_SCALE = 2;

   protected BigDecimal checkOv4AdjAmntMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,18/*precision*/);
   }

  	/**
	 * serializeOv4AdjAmnt
	 */
	protected void serializeOv4AdjAmnt(BigDecimal ov4AdjAmnt) {
	       putNumber(beginOv4AdjAmnt,ov4AdjAmnt,OV_4_ADJ_AMNT_LEN,OV_4_ADJ_AMNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localOv4AdjAmntCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeOv4AdjAmnt
	 */
   	protected  BigDecimal serializeOv4AdjAmnt(char[] value) throws CFException {
        if (value.length < 18) value = pad(18, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(18,value,false/*isSigned?*/)
		       ,beginOv4AdjAmnt
		       ,18
		      );		 localOv4AdjAmntCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,OV_4_ADJ_AMNT_LEN,OV_4_ADJ_AMNT_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("ov4AdjAmnt", beginOv4AdjAmnt,OV_4_ADJ_AMNT_LEN);
    	}
    }
    /**
	 *	refreshOv4AdjAmnt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshOv4AdjAmnt() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginOv4AdjAmnt
			            ,OV_4_ADJ_AMNT_LEN
			            ,OV_4_ADJ_AMNT_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("ov4AdjAmnt", beginOv4AdjAmnt,OV_4_ADJ_AMNT_LEN);
    }
   	}




}
  
