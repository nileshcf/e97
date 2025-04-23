package com.cloudframe.app.init1.dto.serialize;

/**
*  The class BillPeriodDatesSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:18. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BillPeriodDatesSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BillPeriodDatesSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BILL_PERIOD_DATES_LENGTH = 162;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDateBlCycNo;
            protected  int beginDateCycMthYr;
            protected  int beginNextCycStartDt;
           protected int beginBpDates;
           protected static final int BP_DATES_SIZE = 4;
	
	/**
	* Constructor for BillPeriodDatesSerialized
	**/
    public BillPeriodDatesSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BillPeriodDatesSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BillPeriodDatesSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BillPeriodDatesSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BillPeriodDatesSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BillPeriodDatesSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BILL_PERIOD_DATES_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginDateBlCycNo = getStartOffset() + 0;	// set offset for serialization
  
             beginDateCycMthYr = getStartOffset() + 2;	// set offset for serialization
  
             beginNextCycStartDt = getStartOffset() + 8;	// set offset for serialization
  
	        beginBpDates = getStartOffset() + 18; // set offset for serialization
  
	   /*  end of offset */
	}
     int localDateBlCycNoCounter = -1;
     public boolean isDateBlCycNoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateBlCycNoCounter != sharedCounter;
         localDateBlCycNoCounter = sharedCounter; return hasModified;
     }
	protected static final int DATE_BL_CYC_NO_LEN = 2;
	/**
	 * 	serialize this DateBlCycNo
	 */
   protected void serializeDateBlCycNo(char[] dateBlCycNo) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateBlCycNo,0,getStringValue(),beginDateBlCycNo,DATE_BL_CYC_NO_LEN);
       localDateBlCycNoCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateBlCycNoConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshDateBlCycNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateBlCycNo() {	 
   		return (substring(getStringValue(),beginDateBlCycNo,beginDateBlCycNo + DATE_BL_CYC_NO_LEN));
   	}
     int localDateCycMthYrCounter = -1;
     public boolean isDateCycMthYrModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDateCycMthYrCounter != sharedCounter;
         localDateCycMthYrCounter = sharedCounter; return hasModified;
     }
	protected static final int DATE_CYC_MTH_YR_LEN = 6;
	/**
	 * 	serialize this DateCycMthYr
	 */
   protected void serializeDateCycMthYr(char[] dateCycMthYr) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dateCycMthYr,0,getStringValue(),beginDateCycMthYr,DATE_CYC_MTH_YR_LEN);
       localDateCycMthYrCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDateCycMthYrConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshDateCycMthYr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDateCycMthYr() {	 
   		return (substring(getStringValue(),beginDateCycMthYr,beginDateCycMthYr + DATE_CYC_MTH_YR_LEN));
   	}
     int localNextCycStartDtCounter = -1;
     public boolean isNextCycStartDtModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNextCycStartDtCounter != sharedCounter;
         localNextCycStartDtCounter = sharedCounter; return hasModified;
     }
	protected static final int NEXT_CYC_START_DT_LEN = 10;
	/**
	 * 	serialize this NextCycStartDt
	 */
   protected void serializeNextCycStartDt(char[] nextCycStartDt) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(nextCycStartDt,0,getStringValue(),beginNextCycStartDt,NEXT_CYC_START_DT_LEN);
       localNextCycStartDtCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNextCycStartDtConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshNextCycStartDt is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNextCycStartDt() {	 
   		return (substring(getStringValue(),beginNextCycStartDt,beginNextCycStartDt + NEXT_CYC_START_DT_LEN));
   	}

		public int bpDatesSize() {
			return BP_DATES_SIZE;
		}



}
  
