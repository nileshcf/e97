package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnDateCalcCalculationsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcCalculationsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcCalculationsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_CALCULATIONS_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcNewDateCalc;
            protected  int beginCmnDateCalcNewDateCalcR;
	
	/**
	* Constructor for CmnDateCalcCalculationsSerialized
	**/
    public CmnDateCalcCalculationsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcCalculationsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalculationsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcCalculationsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1058); // serialize this field at offset 1058 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcCalculationsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1058 by default
    }    
	/**
	* initializes the field in CmnDateCalcCalculationsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_CALCULATIONS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcNewDateCalc = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcNewDateCalcR = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcNewDateCalcCounter = -1;
     public boolean isCmnDateCalcNewDateCalcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateCalcCounter != sharedCounter;
         localCmnDateCalcNewDateCalcCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_NEW_DATE_CALC_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcNewDateCalc
	 */
   protected void serializeCmnDateCalcNewDateCalc(char[] cmnDateCalcNewDateCalc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcNewDateCalc,0,getStringValue(),beginCmnDateCalcNewDateCalc,CMN_DATE_CALC_NEW_DATE_CALC_LEN);
       localCmnDateCalcNewDateCalcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcNewDateCalcConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcNewDateCalc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcNewDateCalc() {	 
   		return (substring(getStringValue(),beginCmnDateCalcNewDateCalc,beginCmnDateCalcNewDateCalc + CMN_DATE_CALC_NEW_DATE_CALC_LEN));
   	}
     int localCmnDateCalcNewDateCalcRCounter = -1;
     public boolean isCmnDateCalcNewDateCalcRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcNewDateCalcRCounter != sharedCounter;
         localCmnDateCalcNewDateCalcRCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_NEW_DATE_CALC_R_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcNewDateCalcR
	 */
   protected void serializeCmnDateCalcNewDateCalcR(char[] cmnDateCalcNewDateCalcR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcNewDateCalcR,0,getStringValue(),beginCmnDateCalcNewDateCalcR,CMN_DATE_CALC_NEW_DATE_CALC_R_LEN);
       localCmnDateCalcNewDateCalcRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcNewDateCalcRConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcNewDateCalcR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcNewDateCalcR() {	 
   		return (substring(getStringValue(),beginCmnDateCalcNewDateCalcR,beginCmnDateCalcNewDateCalcR + CMN_DATE_CALC_NEW_DATE_CALC_R_LEN));
   	}




}
  
