package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class RpEmailHeading1200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class RpEmailHeading1200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(RpEmailHeading1200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RP_EMAIL_HEADING_1200_LENGTH = 132;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginRpH1RptCode1200;
            protected  int beginRpH1CurrentDate1200;
            protected  int beginRpH1Curtime1200;
	
	/**
	* Constructor for RpEmailHeading1200Serialized
	**/
    public RpEmailHeading1200Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in RpEmailHeading1200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RP_EMAIL_HEADING_1200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginRpH1RptCode1200 = getStartOffset() + 9;	// set offset for serialization
  
  
  
  
  
             beginRpH1CurrentDate1200 = getStartOffset() + 107;	// set offset for serialization
  
  
  
             beginRpH1Curtime1200 = getStartOffset() + 124;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localRpH1RptCode1200Counter = -1;
     public boolean isRpH1RptCode1200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpH1RptCode1200Counter != sharedCounter;
         localRpH1RptCode1200Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_H_1_RPT_CODE_1200_LEN = 2;
	/**
	 * 	serialize this RpH1RptCode1200
	 */
   protected void serializeRpH1RptCode1200(char[] rpH1RptCode1200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpH1RptCode1200,0,getStringValue(),beginRpH1RptCode1200,RP_H_1_RPT_CODE_1200_LEN);
       localRpH1RptCode1200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpH1RptCode1200Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshRpH1RptCode1200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpH1RptCode1200() {	 
   		return (substring(getStringValue(),beginRpH1RptCode1200,beginRpH1RptCode1200 + RP_H_1_RPT_CODE_1200_LEN));
   	}
     int localRpH1CurrentDate1200Counter = -1;
     public boolean isRpH1CurrentDate1200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpH1CurrentDate1200Counter != sharedCounter;
         localRpH1CurrentDate1200Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_H_1_CURRENT_DATE_1200_LEN = 8;
	/**
	 * 	serialize this RpH1CurrentDate1200
	 */
   protected void serializeRpH1CurrentDate1200(char[] rpH1CurrentDate1200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpH1CurrentDate1200,0,getStringValue(),beginRpH1CurrentDate1200,RP_H_1_CURRENT_DATE_1200_LEN);
       localRpH1CurrentDate1200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpH1CurrentDate1200Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpH1CurrentDate1200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpH1CurrentDate1200() {	 
   		return (substring(getStringValue(),beginRpH1CurrentDate1200,beginRpH1CurrentDate1200 + RP_H_1_CURRENT_DATE_1200_LEN));
   	}
     int localRpH1Curtime1200Counter = -1;
     public boolean isRpH1Curtime1200Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localRpH1Curtime1200Counter != sharedCounter;
         localRpH1Curtime1200Counter = sharedCounter; return hasModified;
     }
	protected static final int RP_H_1_CURTIME_1200_LEN = 8;
	/**
	 * 	serialize this RpH1Curtime1200
	 */
   protected void serializeRpH1Curtime1200(char[] rpH1Curtime1200) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(rpH1Curtime1200,0,getStringValue(),beginRpH1Curtime1200,RP_H_1_CURTIME_1200_LEN);
       localRpH1Curtime1200Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkRpH1Curtime1200Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshRpH1Curtime1200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshRpH1Curtime1200() {	 
   		return (substring(getStringValue(),beginRpH1Curtime1200,beginRpH1Curtime1200 + RP_H_1_CURTIME_1200_LEN));
   	}




}
  
