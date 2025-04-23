package com.cloudframe.app.sf305120.dto.serialize;

/**
*  The class CompileTime600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CompileTime600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CompileTime600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COMPILE_TIME_600_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCompTimeHh600;
            protected  int beginCompTimeMm600;
            protected  int beginCompTimeSs600;
	
	/**
	* Constructor for CompileTime600Serialized
	**/
    public CompileTime600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CompileTime600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileTime600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CompileTime600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,49); // serialize this field at offset 49 by default 
    }
    
	/**
	* sets parent for this CompileTime600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 49 by default
    }    
	/**
	* initializes the field in CompileTime600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COMPILE_TIME_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCompTimeHh600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCompTimeMm600 = getStartOffset() + 3;	// set offset for serialization
  
  
             beginCompTimeSs600 = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCompTimeHh600Counter = -1;
     public boolean isCompTimeHh600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompTimeHh600Counter != sharedCounter;
         localCompTimeHh600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMP_TIME_HH_600_LEN = 2;
	/**
	 * 	serialize this CompTimeHh600
	 */
   protected void serializeCompTimeHh600(char[] compTimeHh600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compTimeHh600,0,getStringValue(),beginCompTimeHh600,COMP_TIME_HH_600_LEN);
       localCompTimeHh600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompTimeHh600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompTimeHh600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompTimeHh600() {	 
   		return (substring(getStringValue(),beginCompTimeHh600,beginCompTimeHh600 + COMP_TIME_HH_600_LEN));
   	}
     int localCompTimeMm600Counter = -1;
     public boolean isCompTimeMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompTimeMm600Counter != sharedCounter;
         localCompTimeMm600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMP_TIME_MM_600_LEN = 2;
	/**
	 * 	serialize this CompTimeMm600
	 */
   protected void serializeCompTimeMm600(char[] compTimeMm600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compTimeMm600,0,getStringValue(),beginCompTimeMm600,COMP_TIME_MM_600_LEN);
       localCompTimeMm600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompTimeMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompTimeMm600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompTimeMm600() {	 
   		return (substring(getStringValue(),beginCompTimeMm600,beginCompTimeMm600 + COMP_TIME_MM_600_LEN));
   	}
     int localCompTimeSs600Counter = -1;
     public boolean isCompTimeSs600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompTimeSs600Counter != sharedCounter;
         localCompTimeSs600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMP_TIME_SS_600_LEN = 2;
	/**
	 * 	serialize this CompTimeSs600
	 */
   protected void serializeCompTimeSs600(char[] compTimeSs600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compTimeSs600,0,getStringValue(),beginCompTimeSs600,COMP_TIME_SS_600_LEN);
       localCompTimeSs600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompTimeSs600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompTimeSs600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompTimeSs600() {	 
   		return (substring(getStringValue(),beginCompTimeSs600,beginCompTimeSs600 + COMP_TIME_SS_600_LEN));
   	}




}
  
