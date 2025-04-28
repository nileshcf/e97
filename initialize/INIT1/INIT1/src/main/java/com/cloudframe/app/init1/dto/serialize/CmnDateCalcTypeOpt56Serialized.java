package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcTypeOpt56Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcTypeOpt56Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcTypeOpt56Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_TYPE_OPT_56_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcDowIndicator;
	
	/**
	* Constructor for CmnDateCalcTypeOpt56Serialized
	**/
    public CmnDateCalcTypeOpt56Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcTypeOpt56Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcTypeOpt56Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcTypeOpt56Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1028); // serialize this field at offset 1028 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcTypeOpt56Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1028 by default
    }    
	/**
	* initializes the field in CmnDateCalcTypeOpt56Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_TYPE_OPT_56_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcDowIndicator = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcDowIndicatorCounter = -1;
     public boolean isCmnDateCalcDowIndicatorModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcDowIndicatorCounter != sharedCounter;
         localCmnDateCalcDowIndicatorCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_DOW_INDICATOR_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcDowIndicator
	 */
   protected void serializeCmnDateCalcDowIndicator(char[] cmnDateCalcDowIndicator) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcDowIndicator,0,getStringValue(),beginCmnDateCalcDowIndicator,CMN_DATE_CALC_DOW_INDICATOR_LEN);
       localCmnDateCalcDowIndicatorCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcDowIndicatorConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcDowIndicator is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcDowIndicator() {	 
   		return (substring(getStringValue(),beginCmnDateCalcDowIndicator,beginCmnDateCalcDowIndicator + CMN_DATE_CALC_DOW_INDICATOR_LEN));
   	}




}
  
