package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CompileMsg600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CompileMsg600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CompileMsg600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COMPILE_MSG_600_LENGTH = 45;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCompileYear600;
            protected  int beginCompileMonth600;
            protected  int beginCompileDay600;
            protected  int beginCompileHour600;
            protected  int beginCompileMinute600;
            protected  int beginCompileSecond600;
	
	/**
	* Constructor for CompileMsg600Serialized
	**/
    public CompileMsg600Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CompileMsg600Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CompileMsg600Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CompileMsg600Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,277); // serialize this field at offset 277 by default 
    }
    
	/**
	* sets parent for this CompileMsg600Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 277 by default
    }    
	/**
	* initializes the field in CompileMsg600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COMPILE_MSG_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginCompileYear600 = getStartOffset() + 19;	// set offset for serialization
  
  
             beginCompileMonth600 = getStartOffset() + 24;	// set offset for serialization
  
  
             beginCompileDay600 = getStartOffset() + 27;	// set offset for serialization
  
  
             beginCompileHour600 = getStartOffset() + 37;	// set offset for serialization
  
  
             beginCompileMinute600 = getStartOffset() + 40;	// set offset for serialization
  
  
             beginCompileSecond600 = getStartOffset() + 43;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCompileYear600Counter = -1;
     public boolean isCompileYear600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileYear600Counter != sharedCounter;
         localCompileYear600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_YEAR_600_LEN = 4;
	/**
	 * 	serialize this CompileYear600
	 */
   protected void serializeCompileYear600(char[] compileYear600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileYear600,0,getStringValue(),beginCompileYear600,COMPILE_YEAR_600_LEN);
       localCompileYear600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileYear600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshCompileYear600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileYear600() {	 
   		return (substring(getStringValue(),beginCompileYear600,beginCompileYear600 + COMPILE_YEAR_600_LEN));
   	}
     int localCompileMonth600Counter = -1;
     public boolean isCompileMonth600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileMonth600Counter != sharedCounter;
         localCompileMonth600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_MONTH_600_LEN = 2;
	/**
	 * 	serialize this CompileMonth600
	 */
   protected void serializeCompileMonth600(char[] compileMonth600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileMonth600,0,getStringValue(),beginCompileMonth600,COMPILE_MONTH_600_LEN);
       localCompileMonth600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileMonth600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompileMonth600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileMonth600() {	 
   		return (substring(getStringValue(),beginCompileMonth600,beginCompileMonth600 + COMPILE_MONTH_600_LEN));
   	}
     int localCompileDay600Counter = -1;
     public boolean isCompileDay600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileDay600Counter != sharedCounter;
         localCompileDay600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_DAY_600_LEN = 2;
	/**
	 * 	serialize this CompileDay600
	 */
   protected void serializeCompileDay600(char[] compileDay600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileDay600,0,getStringValue(),beginCompileDay600,COMPILE_DAY_600_LEN);
       localCompileDay600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileDay600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompileDay600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileDay600() {	 
   		return (substring(getStringValue(),beginCompileDay600,beginCompileDay600 + COMPILE_DAY_600_LEN));
   	}
     int localCompileHour600Counter = -1;
     public boolean isCompileHour600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileHour600Counter != sharedCounter;
         localCompileHour600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_HOUR_600_LEN = 2;
	/**
	 * 	serialize this CompileHour600
	 */
   protected void serializeCompileHour600(char[] compileHour600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileHour600,0,getStringValue(),beginCompileHour600,COMPILE_HOUR_600_LEN);
       localCompileHour600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileHour600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompileHour600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileHour600() {	 
   		return (substring(getStringValue(),beginCompileHour600,beginCompileHour600 + COMPILE_HOUR_600_LEN));
   	}
     int localCompileMinute600Counter = -1;
     public boolean isCompileMinute600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileMinute600Counter != sharedCounter;
         localCompileMinute600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_MINUTE_600_LEN = 2;
	/**
	 * 	serialize this CompileMinute600
	 */
   protected void serializeCompileMinute600(char[] compileMinute600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileMinute600,0,getStringValue(),beginCompileMinute600,COMPILE_MINUTE_600_LEN);
       localCompileMinute600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileMinute600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompileMinute600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileMinute600() {	 
   		return (substring(getStringValue(),beginCompileMinute600,beginCompileMinute600 + COMPILE_MINUTE_600_LEN));
   	}
     int localCompileSecond600Counter = -1;
     public boolean isCompileSecond600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCompileSecond600Counter != sharedCounter;
         localCompileSecond600Counter = sharedCounter; return hasModified;
     }
	protected static final int COMPILE_SECOND_600_LEN = 2;
	/**
	 * 	serialize this CompileSecond600
	 */
   protected void serializeCompileSecond600(char[] compileSecond600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(compileSecond600,0,getStringValue(),beginCompileSecond600,COMPILE_SECOND_600_LEN);
       localCompileSecond600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCompileSecond600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCompileSecond600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCompileSecond600() {	 
   		return (substring(getStringValue(),beginCompileSecond600,beginCompileSecond600 + COMPILE_SECOND_600_LEN));
   	}




}
  
