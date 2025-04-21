package com.cloudframe.app.cfsort01.file.records.serialize;

/**
*  The class OutputStudentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OutputStudentSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OutputStudentSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OUTPUT_STUDENT_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStudentNameO;
	
	/**
	* Constructor for OutputStudentSerialized
	**/
    public OutputStudentSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in OutputStudentSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OUTPUT_STUDENT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStudentNameO = getStartOffset() + 5;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStudentNameOCounter = -1;
     public boolean isStudentNameOModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStudentNameOCounter != sharedCounter;
         localStudentNameOCounter = sharedCounter; return hasModified;
     }
	protected static final int STUDENT_NAME_O_LEN = 25;
	/**
	 * 	serialize this StudentNameO
	 */
   protected void serializeStudentNameO(char[] studentNameO) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(studentNameO,0,getStringValue(),beginStudentNameO,STUDENT_NAME_O_LEN);
       localStudentNameOCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkStudentNameOConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshStudentNameO is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshStudentNameO() {	 
   		return (substring(getStringValue(),beginStudentNameO,beginStudentNameO + STUDENT_NAME_O_LEN));
   	}




}
  
