package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class WhenCompiled804Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WhenCompiled804Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WhenCompiled804Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WHEN_COMPILED_804_LENGTH = 24;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCompileDate804;
            protected  int beginCompileTime804;
	
	/**
	* Constructor for WhenCompiled804Serialized
	**/
    public WhenCompiled804Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WhenCompiled804Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WHEN_COMPILED_804_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCompileDate804 = getStartOffset() + 0;	// set offset for serialization
  
             beginCompileTime804 = getStartOffset() + 8;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCompileDate804Counter = -1;
     public boolean isCompileDate804Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileDate804Counter != sharedCounter;
         localCompileDate804Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_DATE_804_LEN = 8;
	/**
	 * 	serialize this CompileDate804
	 */
   protected void serializeCompileDate804(char[] compileDate804) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileDate804,0,getStringValue(),beginCompileDate804,COMPILE_DATE_804_LEN);
       localCompileDate804Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileDate804Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCompileDate804 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileDate804() {	 
   		return (substring(getStringValue(),beginCompileDate804,beginCompileDate804 + COMPILE_DATE_804_LEN));
   	}
     int localCompileTime804Counter = -1;
     public boolean isCompileTime804Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileTime804Counter != sharedCounter;
         localCompileTime804Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_TIME_804_LEN = 8;
	/**
	 * 	serialize this CompileTime804
	 */
   protected void serializeCompileTime804(char[] compileTime804) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileTime804,0,getStringValue(),beginCompileTime804,COMPILE_TIME_804_LEN);
       localCompileTime804Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileTime804Constraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCompileTime804 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileTime804() {	 
   		return (substring(getStringValue(),beginCompileTime804,beginCompileTime804 + COMPILE_TIME_804_LEN));
   	}




}
  
