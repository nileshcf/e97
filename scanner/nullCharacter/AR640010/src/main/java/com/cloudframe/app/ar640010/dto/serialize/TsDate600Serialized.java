package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class TsDate600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TsDate600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TsDate600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int TS_DATE_600_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTsYear600;
            protected  int beginTsMonth600;
            protected  int beginTsDay600;
	
	/**
	* Constructor for TsDate600Serialized
	**/
    public TsDate600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for TsDate600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public TsDate600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this TsDate600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,376); // serialize this field at offset 376 by default 
    }
    
	/**
	* sets parent for this TsDate600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 376 by default
    }    
	/**
	* initializes the field in TsDate600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(TS_DATE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTsYear600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginTsMonth600 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginTsDay600 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTsYear600Counter = -1;
     public boolean isTsYear600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTsYear600Counter != sharedCounter;
         localTsYear600Counter = sharedCounter; return hasModified;
     }
	protected static final int TS_YEAR_600_LEN = 4;
	/**
	 * 	serialize this TsYear600
	 */
   protected void serializeTsYear600(char[] tsYear600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tsYear600,0,getStringValue(),beginTsYear600,TS_YEAR_600_LEN);
       localTsYear600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTsYear600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshTsYear600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTsYear600() {	 
   		return (substring(getStringValue(),beginTsYear600,beginTsYear600 + TS_YEAR_600_LEN));
   	}
     int localTsMonth600Counter = -1;
     public boolean isTsMonth600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTsMonth600Counter != sharedCounter;
         localTsMonth600Counter = sharedCounter; return hasModified;
     }
	protected static final int TS_MONTH_600_LEN = 2;
	/**
	 * 	serialize this TsMonth600
	 */
   protected void serializeTsMonth600(char[] tsMonth600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tsMonth600,0,getStringValue(),beginTsMonth600,TS_MONTH_600_LEN);
       localTsMonth600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTsMonth600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTsMonth600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTsMonth600() {	 
   		return (substring(getStringValue(),beginTsMonth600,beginTsMonth600 + TS_MONTH_600_LEN));
   	}
     int localTsDay600Counter = -1;
     public boolean isTsDay600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTsDay600Counter != sharedCounter;
         localTsDay600Counter = sharedCounter; return hasModified;
     }
	protected static final int TS_DAY_600_LEN = 2;
	/**
	 * 	serialize this TsDay600
	 */
   protected void serializeTsDay600(char[] tsDay600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tsDay600,0,getStringValue(),beginTsDay600,TS_DAY_600_LEN);
       localTsDay600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTsDay600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshTsDay600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTsDay600() {	 
   		return (substring(getStringValue(),beginTsDay600,beginTsDay600 + TS_DAY_600_LEN));
   	}




}
  
