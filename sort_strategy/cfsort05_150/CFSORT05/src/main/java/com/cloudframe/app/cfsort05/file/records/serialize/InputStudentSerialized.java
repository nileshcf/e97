package com.cloudframe.app.cfsort05.file.records.serialize;

/**
*  The class InputStudentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:29. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InputStudentSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InputStudentSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INPUT_STUDENT_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStudentNameI;
	
	/**
	* Constructor for InputStudentSerialized
	**/
    public InputStudentSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in InputStudentSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INPUT_STUDENT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStudentNameI = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStudentNameICounter = -1;
     public boolean isStudentNameIModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStudentNameICounter != sharedCounter;
         localStudentNameICounter = sharedCounter; return hasModified;
     }
	protected static final int STUDENT_NAME_I_LEN = 25;
	/**
	 * 	serialize this StudentNameI
	 */
   protected void serializeStudentNameI(char[] studentNameI) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(studentNameI,0,getStringValue(),beginStudentNameI,STUDENT_NAME_I_LEN);
       localStudentNameICounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStudentNameIConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshStudentNameI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStudentNameI() {	 
   		return (substring(getStringValue(),beginStudentNameI,beginStudentNameI + STUDENT_NAME_I_LEN));
   	}




}
  
