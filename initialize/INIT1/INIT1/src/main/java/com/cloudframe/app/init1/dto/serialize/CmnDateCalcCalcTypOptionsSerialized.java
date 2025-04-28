package com.cloudframe.app.init1.dto.serialize;

/**
*  The class CmnDateCalcCalcTypOptionsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:52. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcCalcTypOptionsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcCalcTypOptionsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_CALC_TYP_OPTIONS_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcTypeOpt1;
            protected  int beginCmnDateCalcTypeOpt123;
            protected  int beginCmnDateCalcTypeOpt23;
	
	/**
	* Constructor for CmnDateCalcCalcTypOptionsSerialized
	**/
    public CmnDateCalcCalcTypOptionsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcCalcTypOptionsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcCalcTypOptionsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcCalcTypOptionsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1025); // serialize this field at offset 1025 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcCalcTypOptionsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1025 by default
    }    
	/**
	* initializes the field in CmnDateCalcCalcTypOptionsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_CALC_TYP_OPTIONS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcTypeOpt1 = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcTypeOpt123 = getStartOffset() + 1;	// set offset for serialization
  
             beginCmnDateCalcTypeOpt23 = getStartOffset() + 2;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateCalcTypeOpt1Counter = -1;
     public boolean isCmnDateCalcTypeOpt1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcTypeOpt1Counter != sharedCounter;
         localCmnDateCalcTypeOpt1Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_TYPE_OPT_1_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcTypeOpt1
	 */
   protected void serializeCmnDateCalcTypeOpt1(char[] cmnDateCalcTypeOpt1) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcTypeOpt1,0,getStringValue(),beginCmnDateCalcTypeOpt1,CMN_DATE_CALC_TYPE_OPT_1_LEN);
       localCmnDateCalcTypeOpt1Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcTypeOpt1Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcTypeOpt1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcTypeOpt1() {	 
   		return (substring(getStringValue(),beginCmnDateCalcTypeOpt1,beginCmnDateCalcTypeOpt1 + CMN_DATE_CALC_TYPE_OPT_1_LEN));
   	}
     int localCmnDateCalcTypeOpt123Counter = -1;
     public boolean isCmnDateCalcTypeOpt123Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcTypeOpt123Counter != sharedCounter;
         localCmnDateCalcTypeOpt123Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_TYPE_OPT_123_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcTypeOpt123
	 */
   protected void serializeCmnDateCalcTypeOpt123(char[] cmnDateCalcTypeOpt123) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcTypeOpt123,0,getStringValue(),beginCmnDateCalcTypeOpt123,CMN_DATE_CALC_TYPE_OPT_123_LEN);
       localCmnDateCalcTypeOpt123Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcTypeOpt123Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcTypeOpt123 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcTypeOpt123() {	 
   		return (substring(getStringValue(),beginCmnDateCalcTypeOpt123,beginCmnDateCalcTypeOpt123 + CMN_DATE_CALC_TYPE_OPT_123_LEN));
   	}
     int localCmnDateCalcTypeOpt23Counter = -1;
     public boolean isCmnDateCalcTypeOpt23Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcTypeOpt23Counter != sharedCounter;
         localCmnDateCalcTypeOpt23Counter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_TYPE_OPT_23_LEN = 1;
	/**
	 * 	serialize this CmnDateCalcTypeOpt23
	 */
   protected void serializeCmnDateCalcTypeOpt23(char[] cmnDateCalcTypeOpt23) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcTypeOpt23,0,getStringValue(),beginCmnDateCalcTypeOpt23,CMN_DATE_CALC_TYPE_OPT_23_LEN);
       localCmnDateCalcTypeOpt23Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcTypeOpt23Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcTypeOpt23 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcTypeOpt23() {	 
   		return (substring(getStringValue(),beginCmnDateCalcTypeOpt23,beginCmnDateCalcTypeOpt23 + CMN_DATE_CALC_TYPE_OPT_23_LEN));
   	}




}
  
