package com.cloudframe.app.cfsort04.file.records.serialize;

/**
*  The class OutputStudentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:03. using version 5.0.0.256
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
            protected  int beginStudentIdO;
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
             beginStudentIdO = getStartOffset() + 0;	// set offset for serialization
  
             beginStudentNameO = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localStudentIdOCounter = -1;
     public boolean isStudentIdOModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStudentIdOCounter != sharedCounter;
         localStudentIdOCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of studentIdO
	 *	@return studentIdO
	 */
	public char[]  getStudentIdOString() {
	     return getCharArray(beginStudentIdO,STUDENT_ID_O_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdOIsNumeric() {
	    return isNumeric(beginStudentIdO
	                    ,beginStudentIdO + STUDENT_ID_O_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STUDENT_ID_O_LEN = 5;
  	/**
	 * serializeStudentIdO
	 */
	protected void serializeStudentIdO(long studentIdO) {
		 putNumber(beginStudentIdO,studentIdO,STUDENT_ID_O_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStudentIdOCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStudentIdO
	 */
   	protected  long serializeStudentIdO(char[] value) {
	    long  studentIdO;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    studentIdO = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginStudentIdO
		       ,5
		      );
		 localStudentIdOCounter = shareString.getSerializedField().getModifiedCounter();
		return  studentIdO;
    }

   protected long checkStudentIdOMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStudentIdO is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStudentIdO() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStudentIdO
			                 ,STUDENT_ID_O_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("studentIdO", beginStudentIdO,STUDENT_ID_O_LEN);
    }
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
  
