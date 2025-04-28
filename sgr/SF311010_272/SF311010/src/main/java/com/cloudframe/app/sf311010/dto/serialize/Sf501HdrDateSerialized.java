package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class Sf501HdrDateSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf501HdrDateSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf501HdrDateSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_501_HDR_DATE_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf501HdrMon;
            protected  int beginSf501HdrDay;
            protected  int beginSf501HdrYear;
	
	/**
	* Constructor for Sf501HdrDateSerialized
	**/
    public Sf501HdrDateSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf501HdrDateSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf501HdrDateSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf501HdrDateSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,14); // serialize this field at offset 14 by default 
    }
    
	/**
	* sets parent for this Sf501HdrDateSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 14 by default
    }    
	/**
	* initializes the field in Sf501HdrDateSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_501_HDR_DATE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf501HdrMon = getStartOffset() + 0;	// set offset for serialization
  
             beginSf501HdrDay = getStartOffset() + 1;	// set offset for serialization
  
             beginSf501HdrYear = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf501HdrMonCounter = -1;
     public boolean isSf501HdrMonModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501HdrMonCounter != sharedCounter;
         localSf501HdrMonCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_HDR_MON_LEN = 1;
	/**
	 * 	serialize this Sf501HdrMon
	 */
   protected void serializeSf501HdrMon(char[] sf501HdrMon) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501HdrMon,0,getStringValue(),beginSf501HdrMon,SF_501_HDR_MON_LEN);
       localSf501HdrMonCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501HdrMonConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501HdrMon is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501HdrMon() {	 
   		return (substring(getStringValue(),beginSf501HdrMon,beginSf501HdrMon + SF_501_HDR_MON_LEN));
   	}
     int localSf501HdrDayCounter = -1;
     public boolean isSf501HdrDayModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501HdrDayCounter != sharedCounter;
         localSf501HdrDayCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_HDR_DAY_LEN = 1;
	/**
	 * 	serialize this Sf501HdrDay
	 */
   protected void serializeSf501HdrDay(char[] sf501HdrDay) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501HdrDay,0,getStringValue(),beginSf501HdrDay,SF_501_HDR_DAY_LEN);
       localSf501HdrDayCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501HdrDayConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501HdrDay is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501HdrDay() {	 
   		return (substring(getStringValue(),beginSf501HdrDay,beginSf501HdrDay + SF_501_HDR_DAY_LEN));
   	}
     int localSf501HdrYearCounter = -1;
     public boolean isSf501HdrYearModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf501HdrYearCounter != sharedCounter;
         localSf501HdrYearCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_501_HDR_YEAR_LEN = 1;
	/**
	 * 	serialize this Sf501HdrYear
	 */
   protected void serializeSf501HdrYear(char[] sf501HdrYear) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf501HdrYear,0,getStringValue(),beginSf501HdrYear,SF_501_HDR_YEAR_LEN);
       localSf501HdrYearCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf501HdrYearConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf501HdrYear is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf501HdrYear() {	 
   		return (substring(getStringValue(),beginSf501HdrYear,beginSf501HdrYear + SF_501_HDR_YEAR_LEN));
   	}




}
  
