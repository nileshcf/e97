package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CurrentTs840RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentTs840RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentTs840RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_TS_840_REDEFINED_LENGTH = 26;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrentYear840;
            protected  int beginCurrentMonth840;
            protected  int beginCurrentDay840;
            protected  int beginCurrentHour840;
            protected  int beginCurrentMinute840;
            protected  int beginCurrentSecond840;
	
	/**
	* Constructor for CurrentTs840RedefinedSerialized
	**/
    public CurrentTs840RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrentTs840RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentTs840RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrentTs840RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CurrentTs840RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CurrentTs840RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_TS_840_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCurrentYear840 = getStartOffset() + 0;	// set offset for serialization
  
             beginCurrentMonth840 = getStartOffset() + 5;	// set offset for serialization
  
             beginCurrentDay840 = getStartOffset() + 8;	// set offset for serialization
  
             beginCurrentHour840 = getStartOffset() + 11;	// set offset for serialization
  
             beginCurrentMinute840 = getStartOffset() + 14;	// set offset for serialization
  
             beginCurrentSecond840 = getStartOffset() + 17;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrentYear840Counter = -1;
     public boolean isCurrentYear840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentYear840Counter != sharedCounter;
         localCurrentYear840Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_YEAR_840_LEN = 4;
	/**
	 * 	serialize this CurrentYear840
	 */
   protected void serializeCurrentYear840(char[] currentYear840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentYear840,0,getStringValue(),beginCurrentYear840,CURRENT_YEAR_840_LEN);
       localCurrentYear840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentYear840Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCurrentYear840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentYear840() {	 
   		return (substring(getStringValue(),beginCurrentYear840,beginCurrentYear840 + CURRENT_YEAR_840_LEN));
   	}
     int localCurrentMonth840Counter = -1;
     public boolean isCurrentMonth840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentMonth840Counter != sharedCounter;
         localCurrentMonth840Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_MONTH_840_LEN = 2;
	/**
	 * 	serialize this CurrentMonth840
	 */
   protected void serializeCurrentMonth840(char[] currentMonth840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentMonth840,0,getStringValue(),beginCurrentMonth840,CURRENT_MONTH_840_LEN);
       localCurrentMonth840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentMonth840Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrentMonth840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentMonth840() {	 
   		return (substring(getStringValue(),beginCurrentMonth840,beginCurrentMonth840 + CURRENT_MONTH_840_LEN));
   	}
     int localCurrentDay840Counter = -1;
     public boolean isCurrentDay840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentDay840Counter != sharedCounter;
         localCurrentDay840Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_DAY_840_LEN = 2;
	/**
	 * 	serialize this CurrentDay840
	 */
   protected void serializeCurrentDay840(char[] currentDay840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentDay840,0,getStringValue(),beginCurrentDay840,CURRENT_DAY_840_LEN);
       localCurrentDay840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentDay840Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrentDay840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentDay840() {	 
   		return (substring(getStringValue(),beginCurrentDay840,beginCurrentDay840 + CURRENT_DAY_840_LEN));
   	}
     int localCurrentHour840Counter = -1;
     public boolean isCurrentHour840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentHour840Counter != sharedCounter;
         localCurrentHour840Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_HOUR_840_LEN = 2;
	/**
	 * 	serialize this CurrentHour840
	 */
   protected void serializeCurrentHour840(char[] currentHour840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentHour840,0,getStringValue(),beginCurrentHour840,CURRENT_HOUR_840_LEN);
       localCurrentHour840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentHour840Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrentHour840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentHour840() {	 
   		return (substring(getStringValue(),beginCurrentHour840,beginCurrentHour840 + CURRENT_HOUR_840_LEN));
   	}
     int localCurrentMinute840Counter = -1;
     public boolean isCurrentMinute840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentMinute840Counter != sharedCounter;
         localCurrentMinute840Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_MINUTE_840_LEN = 2;
	/**
	 * 	serialize this CurrentMinute840
	 */
   protected void serializeCurrentMinute840(char[] currentMinute840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentMinute840,0,getStringValue(),beginCurrentMinute840,CURRENT_MINUTE_840_LEN);
       localCurrentMinute840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentMinute840Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrentMinute840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentMinute840() {	 
   		return (substring(getStringValue(),beginCurrentMinute840,beginCurrentMinute840 + CURRENT_MINUTE_840_LEN));
   	}
     int localCurrentSecond840Counter = -1;
     public boolean isCurrentSecond840Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentSecond840Counter != sharedCounter;
         localCurrentSecond840Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_SECOND_840_LEN = 2;
	/**
	 * 	serialize this CurrentSecond840
	 */
   protected void serializeCurrentSecond840(char[] currentSecond840) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentSecond840,0,getStringValue(),beginCurrentSecond840,CURRENT_SECOND_840_LEN);
       localCurrentSecond840Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentSecond840Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCurrentSecond840 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentSecond840() {	 
   		return (substring(getStringValue(),beginCurrentSecond840,beginCurrentSecond840 + CURRENT_SECOND_840_LEN));
   	}




}
  
