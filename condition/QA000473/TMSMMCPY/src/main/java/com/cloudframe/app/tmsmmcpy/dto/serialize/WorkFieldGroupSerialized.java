package com.cloudframe.app.tmsmmcpy.dto.serialize;

/**
*  The class WorkFieldGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkFieldGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkFieldGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_FIELD_GROUP_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginWorkField;
            protected  int beginWorkFieldN;
	
	/**
	* Constructor for WorkFieldGroupSerialized
	**/
    public WorkFieldGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkFieldGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_FIELD_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginWorkField = getStartOffset() + 0;	// set offset for serialization
  
             beginWorkFieldN = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localWorkFieldCounter = -1;
     public boolean isWorkFieldModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkFieldCounter != sharedCounter;
         localWorkFieldCounter = sharedCounter; return hasModified;
     }
	protected static final int WORK_FIELD_LEN = 10;
	/**
	 * 	serialize this WorkField
	 */
   protected void serializeWorkField(char[] workField) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(workField,0,getStringValue(),beginWorkField,WORK_FIELD_LEN);
       localWorkFieldCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkWorkFieldConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshWorkField is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshWorkField() {	 
   		return (substring(getStringValue(),beginWorkField,beginWorkField + WORK_FIELD_LEN));
   	}
     int localWorkFieldNCounter = -1;
     
     public boolean isWorkFieldNModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWorkFieldNCounter != sharedCounter;
         localWorkFieldNCounter = sharedCounter; return hasModified; 
     }  	
	
	 /**
	 *	Returns String value of workFieldN
	 *	@return workFieldN
	 */
	public char[]  getWorkFieldNString() {
	    return getCharArray(beginWorkFieldN,WORK_FIELD_N_LEN);
	}

	/**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean workFieldNIsNumeric() {
		    return isNumeric(beginWorkFieldN
	                    ,beginWorkFieldN + WORK_FIELD_N_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
  protected  static final int WORK_FIELD_N_LEN = 10;
  protected  static final int WORK_FIELD_N_SCALE = 2;

   protected BigDecimal checkWorkFieldNMaxLimit(BigDecimal number) {
		return checkMaxLimit(number,2/*scale*/,10/*precision*/);
   }

  	/**
	 * serializeWorkFieldN
	 */
	protected void serializeWorkFieldN(BigDecimal workFieldN) {
	       putNumber(beginWorkFieldN,workFieldN,WORK_FIELD_N_LEN,WORK_FIELD_N_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localWorkFieldNCounter = shareString.getSerializedField().getModifiedCounter();
   }
  
    /**
	 * serializeWorkFieldN
	 */
   	protected  BigDecimal serializeWorkFieldN(char[] value) throws CFException {
        if (value.length < 10) value = pad(10, value, ' ', RIGHT_PAD);
        replaceValue(
		       padNumber(10,value,false/*isSigned?*/)
		       ,beginWorkFieldN
		       ,10
		      );		 localWorkFieldNCounter = shareString.getSerializedField().getModifiedCounter();
		try {
			return  convertString2Decimal(value,WORK_FIELD_N_LEN,WORK_FIELD_N_SCALE,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
    	} catch(Exception ex) {
    		throw getSoc7ABend("workFieldN", beginWorkFieldN,WORK_FIELD_N_LEN);
    	}
    }
    /**
	 *	refreshWorkFieldN is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public BigDecimal refreshWorkFieldN() throws CFException {
   	try {	 
			return (
			         getDecimalNumber(
			             beginWorkFieldN
			            ,WORK_FIELD_N_LEN
			            ,WORK_FIELD_N_SCALE
			            ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 			        
			        );
	} catch(Exception ex) {
    	throw getSoc7ABend("workFieldN", beginWorkFieldN,WORK_FIELD_N_LEN);
    }
   	}




}
  
