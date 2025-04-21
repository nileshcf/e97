package com.cloudframe.app.comput5.dto.serialize;

/**
*  The class WtExposureDetailsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:11. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WtExposureDetailsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtExposureDetailsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WT_EXPOSURE_DETAILS_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWtExposure;
	
	/**
	* Constructor for WtExposureDetailsSerialized
	**/
    public WtExposureDetailsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WtExposureDetailsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtExposureDetailsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WtExposureDetailsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WtExposureDetailsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WtExposureDetailsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WT_EXPOSURE_DETAILS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWtExposure = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
        int localWtExposureCounter = -1;
        public boolean isWtExposureModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localWtExposureCounter != sharedCounter;
           localWtExposureCounter = sharedCounter; return hasModified; 
        }
	    public boolean wtExposureIsNumeric() {
	      return decimalIsNumeric(beginWtExposure,WT_EXPOSURE_LEN);// check Packed Decimal field to see if it contains valid Number
	    }
         /**
         *  This method returns packed Decimal String in the mainframe format
         *	@return char[]
         */
         public char[] wtExposureString() {
            return getPackedString(beginWtExposure,WT_EXPOSURE_LEN);
         }
   protected static final int WT_EXPOSURE_LEN = 8;
   protected static final int WT_EXPOSURE_SCALE = 6;
  	/**
	 * 	serializeWtExposure
	 */
	protected void serializeWtExposure(BigDecimal wtExposure) {
		   putDecimal(beginWtExposure,wtExposure,WT_EXPOSURE_LEN,WT_EXPOSURE_SCALE,true);
		 localWtExposureCounter = shareString.getSerializedField().getModifiedCounter();
   }
   
   protected BigDecimal checkWtExposureMaxLimit(BigDecimal number) {
			return checkMaxLimit(number,6/*scale*/,15/*precision*/);
   }
     /**
	 *	refreshWtExposure is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWtExposure() throws CFException {	
   	try { 
		 return (getDecimal(beginWtExposure,WT_EXPOSURE_LEN,WT_EXPOSURE_SCALE));	
	 } catch(Exception ex) {
    	throw getSoc7ABend("wtExposure", beginWtExposure,WT_EXPOSURE_LEN);
     }
   	}




}
  
