package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CurrentMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_MSG_600_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCurrentDate600;
            protected  int beginCurrentTime600;
	
	/**
	* Constructor for CurrentMsg600Serialized
	**/
    public CurrentMsg600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CurrentMsg600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CurrentMsg600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CurrentMsg600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,322); // serialize this field at offset 322 by default 
    }
    
	/**
	* sets parent for this CurrentMsg600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 322 by default
    }    
	/**
	* initializes the field in CurrentMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginCurrentDate600 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginCurrentTime600 = getStartOffset() + 37;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCurrentDate600Counter = -1;
     public boolean isCurrentDate600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentDate600Counter != sharedCounter;
         localCurrentDate600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_DATE_600_LEN = 10;
	/**
	 * 	serialize this CurrentDate600
	 */
   protected void serializeCurrentDate600(char[] currentDate600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentDate600,0,getStringValue(),beginCurrentDate600,CURRENT_DATE_600_LEN);
       localCurrentDate600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentDate600Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCurrentDate600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentDate600() {	 
   		return (substring(getStringValue(),beginCurrentDate600,beginCurrentDate600 + CURRENT_DATE_600_LEN));
   	}
     int localCurrentTime600Counter = -1;
     public boolean isCurrentTime600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCurrentTime600Counter != sharedCounter;
         localCurrentTime600Counter = sharedCounter; return hasModified;
     }
	protected static final int CURRENT_TIME_600_LEN = 8;
	/**
	 * 	serialize this CurrentTime600
	 */
   protected void serializeCurrentTime600(char[] currentTime600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(currentTime600,0,getStringValue(),beginCurrentTime600,CURRENT_TIME_600_LEN);
       localCurrentTime600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCurrentTime600Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCurrentTime600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCurrentTime600() {	 
   		return (substring(getStringValue(),beginCurrentTime600,beginCurrentTime600 + CURRENT_TIME_600_LEN));
   	}




}
  
