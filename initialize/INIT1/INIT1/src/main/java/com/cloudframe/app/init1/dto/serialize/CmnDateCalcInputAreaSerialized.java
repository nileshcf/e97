package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcInputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcInputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcInputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_INPUT_AREA_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcType;
	
	/**
	* Constructor for CmnDateCalcInputAreaSerialized
	**/
    public CmnDateCalcInputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcInputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcInputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcInputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnDateCalcInputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_INPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcType = getStartOffset() + 0;	// set offset for serialization
  
  
  
	   /*  end of offset */
	}
     int localCmnDateCalcTypeCounter = -1;
     public boolean isCmnDateCalcTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcTypeCounter != sharedCounter;
         localCmnDateCalcTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_TYPE_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcType
	 */
   protected void serializeCmnDateCalcType(char[] cmnDateCalcType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcType,0,getStringValue(),beginCmnDateCalcType,CMN_DATE_CALC_TYPE_LEN);
       localCmnDateCalcTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcType() {	 
   		return (substring(getStringValue(),beginCmnDateCalcType,beginCmnDateCalcType + CMN_DATE_CALC_TYPE_LEN));
   	}




}
  
