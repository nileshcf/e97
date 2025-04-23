package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnDateCalcInputDateAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateCalcInputDateAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateCalcInputDateAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_CALC_INPUT_DATE_AREA_LENGTH = 27;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateCalcStartDate;
            protected  int beginCmnDateCalcStartDateR;
            protected  int beginCmnDateCalcEndDate;
            protected  int beginCmnDateCalcEndDateR;
	
	/**
	* Constructor for CmnDateCalcInputDateAreaSerialized
	**/
    public CmnDateCalcInputDateAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateCalcInputDateAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateCalcInputDateAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateCalcInputDateAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1029); // serialize this field at offset 1029 by default 
    }
    
	/**
	* sets parent for this CmnDateCalcInputDateAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1029 by default
    }    
	/**
	* initializes the field in CmnDateCalcInputDateAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_CALC_INPUT_DATE_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateCalcStartDate = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcStartDateR = getStartOffset() + 0;	// set offset for serialization
  
             beginCmnDateCalcEndDate = getStartOffset() + 10;	// set offset for serialization
  
             beginCmnDateCalcEndDateR = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnDateCalcStartDateCounter = -1;
     public boolean isCmnDateCalcStartDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartDateCounter != sharedCounter;
         localCmnDateCalcStartDateCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_START_DATE_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcStartDate
	 */
   protected void serializeCmnDateCalcStartDate(char[] cmnDateCalcStartDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcStartDate,0,getStringValue(),beginCmnDateCalcStartDate,CMN_DATE_CALC_START_DATE_LEN);
       localCmnDateCalcStartDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcStartDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcStartDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcStartDate() {	 
   		return (substring(getStringValue(),beginCmnDateCalcStartDate,beginCmnDateCalcStartDate + CMN_DATE_CALC_START_DATE_LEN));
   	}
     int localCmnDateCalcStartDateRCounter = -1;
     public boolean isCmnDateCalcStartDateRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcStartDateRCounter != sharedCounter;
         localCmnDateCalcStartDateRCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_START_DATE_R_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcStartDateR
	 */
   protected void serializeCmnDateCalcStartDateR(char[] cmnDateCalcStartDateR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcStartDateR,0,getStringValue(),beginCmnDateCalcStartDateR,CMN_DATE_CALC_START_DATE_R_LEN);
       localCmnDateCalcStartDateRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcStartDateRConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcStartDateR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcStartDateR() {	 
   		return (substring(getStringValue(),beginCmnDateCalcStartDateR,beginCmnDateCalcStartDateR + CMN_DATE_CALC_START_DATE_R_LEN));
   	}
     int localCmnDateCalcEndDateCounter = -1;
     public boolean isCmnDateCalcEndDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndDateCounter != sharedCounter;
         localCmnDateCalcEndDateCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_END_DATE_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcEndDate
	 */
   protected void serializeCmnDateCalcEndDate(char[] cmnDateCalcEndDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcEndDate,0,getStringValue(),beginCmnDateCalcEndDate,CMN_DATE_CALC_END_DATE_LEN);
       localCmnDateCalcEndDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcEndDateConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcEndDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcEndDate() {	 
   		return (substring(getStringValue(),beginCmnDateCalcEndDate,beginCmnDateCalcEndDate + CMN_DATE_CALC_END_DATE_LEN));
   	}
     int localCmnDateCalcEndDateRCounter = -1;
     public boolean isCmnDateCalcEndDateRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateCalcEndDateRCounter != sharedCounter;
         localCmnDateCalcEndDateRCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_CALC_END_DATE_R_LEN = 10;
	/**
	 * 	serialize this CmnDateCalcEndDateR
	 */
   protected void serializeCmnDateCalcEndDateR(char[] cmnDateCalcEndDateR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateCalcEndDateR,0,getStringValue(),beginCmnDateCalcEndDateR,CMN_DATE_CALC_END_DATE_R_LEN);
       localCmnDateCalcEndDateRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateCalcEndDateRConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateCalcEndDateR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateCalcEndDateR() {	 
   		return (substring(getStringValue(),beginCmnDateCalcEndDateR,beginCmnDateCalcEndDateR + CMN_DATE_CALC_END_DATE_R_LEN));
   	}




}
  
