package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpHeading1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:37. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpHeading1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpHeading1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_HEADING_1_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpH1RptCode;
            protected  int beginRpH1CurrentDate;
            protected  int beginRpH1Curtime;
	
	/**
	* Constructor for RpHeading1Serialized
	**/
    public RpHeading1Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpHeading1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_HEADING_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
             beginRpH1RptCode = getStartOffset() + 10;	// set offset for serialization
  
  
  
  
  
             beginRpH1CurrentDate = getStartOffset() + 108;	// set offset for serialization
  
  
  
             beginRpH1Curtime = getStartOffset() + 125;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpH1RptCodeCounter = -1;
     public boolean isRpH1RptCodeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpH1RptCodeCounter != sharedCounter;
         localRpH1RptCodeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_H_1_RPT_CODE_LEN = 2;
	/**
	 * 	serialize this RpH1RptCode
	 */
   protected void serializeRpH1RptCode(char[] rpH1RptCode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpH1RptCode,0,getStringValue(),beginRpH1RptCode,RP_H_1_RPT_CODE_LEN);
       localRpH1RptCodeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpH1RptCodeConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRpH1RptCode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpH1RptCode() {	 
   		return (substring(getStringValue(),beginRpH1RptCode,beginRpH1RptCode + RP_H_1_RPT_CODE_LEN));
   	}
     int localRpH1CurrentDateCounter = -1;
     public boolean isRpH1CurrentDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpH1CurrentDateCounter != sharedCounter;
         localRpH1CurrentDateCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_H_1_CURRENT_DATE_LEN = 8;
	/**
	 * 	serialize this RpH1CurrentDate
	 */
   protected void serializeRpH1CurrentDate(char[] rpH1CurrentDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpH1CurrentDate,0,getStringValue(),beginRpH1CurrentDate,RP_H_1_CURRENT_DATE_LEN);
       localRpH1CurrentDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpH1CurrentDateConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpH1CurrentDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpH1CurrentDate() {	 
   		return (substring(getStringValue(),beginRpH1CurrentDate,beginRpH1CurrentDate + RP_H_1_CURRENT_DATE_LEN));
   	}
     int localRpH1CurtimeCounter = -1;
     public boolean isRpH1CurtimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpH1CurtimeCounter != sharedCounter;
         localRpH1CurtimeCounter = sharedCounter; return hasModified;
     }
	protected static final int RP_H_1_CURTIME_LEN = 8;
	/**
	 * 	serialize this RpH1Curtime
	 */
   protected void serializeRpH1Curtime(char[] rpH1Curtime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpH1Curtime,0,getStringValue(),beginRpH1Curtime,RP_H_1_CURTIME_LEN);
       localRpH1CurtimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpH1CurtimeConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpH1Curtime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpH1Curtime() {	 
   		return (substring(getStringValue(),beginRpH1Curtime,beginRpH1Curtime + RP_H_1_CURTIME_LEN));
   	}




}
  
