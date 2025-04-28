package com.cloudframe.app.sf327010.dto.serialize;

/**
*  The class CompileDate600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CompileDate600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CompileDate600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COMPILE_DATE_600_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCompDateYyyy600;
            protected  int beginCompDateMm600;
            protected  int beginCompDateDd600;
	
	/**
	* Constructor for CompileDate600Serialized
	**/
    public CompileDate600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CompileDate600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileDate600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CompileDate600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,29); // serialize this field at offset 29 by default 
    }
    
	/**
	* sets parent for this CompileDate600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 29 by default
    }    
	/**
	* initializes the field in CompileDate600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COMPILE_DATE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCompDateYyyy600 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginCompDateMm600 = getStartOffset() + 5;	// set offset for serialization
  
  
             beginCompDateDd600 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCompDateYyyy600Counter = -1;
     public boolean isCompDateYyyy600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompDateYyyy600Counter != sharedCounter;
         localCompDateYyyy600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMP_DATE_YYYY_600_LEN = 4;
	/**
	 * 	serialize this CompDateYyyy600
	 */
   protected void serializeCompDateYyyy600(char[] compDateYyyy600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compDateYyyy600,0,getStringValue(),beginCompDateYyyy600,COMP_DATE_YYYY_600_LEN);
       localCompDateYyyy600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompDateYyyy600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCompDateYyyy600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompDateYyyy600() {	 
   		return (substring(getStringValue(),beginCompDateYyyy600,beginCompDateYyyy600 + COMP_DATE_YYYY_600_LEN));
   	}
     int localCompDateMm600Counter = -1;
     public boolean isCompDateMm600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompDateMm600Counter != sharedCounter;
         localCompDateMm600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMP_DATE_MM_600_LEN = 2;
	/**
	 * 	serialize this CompDateMm600
	 */
   protected void serializeCompDateMm600(char[] compDateMm600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compDateMm600,0,getStringValue(),beginCompDateMm600,COMP_DATE_MM_600_LEN);
       localCompDateMm600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompDateMm600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompDateMm600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompDateMm600() {	 
   		return (substring(getStringValue(),beginCompDateMm600,beginCompDateMm600 + COMP_DATE_MM_600_LEN));
   	}
     int localCompDateDd600Counter = -1;
     public boolean isCompDateDd600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompDateDd600Counter != sharedCounter;
         localCompDateDd600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMP_DATE_DD_600_LEN = 2;
	/**
	 * 	serialize this CompDateDd600
	 */
   protected void serializeCompDateDd600(char[] compDateDd600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compDateDd600,0,getStringValue(),beginCompDateDd600,COMP_DATE_DD_600_LEN);
       localCompDateDd600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompDateDd600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompDateDd600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompDateDd600() {	 
   		return (substring(getStringValue(),beginCompDateDd600,beginCompDateDd600 + COMP_DATE_DD_600_LEN));
   	}




}
  
