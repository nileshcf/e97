package com.cloudframe.app.cfsort02.file.records.serialize;

/**
*  The class InputStudentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:08. using version 5.0.0.256
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
            protected  int beginStudentIdI;
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
             beginStudentIdI = getStartOffset() + 0;	// set offset for serialization
  
             beginStudentNameI = getStartOffset() + 5;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localStudentIdICounter = -1;
     public boolean isStudentIdIModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStudentIdICounter != sharedCounter;
         localStudentIdICounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of studentIdI
	 *	@return studentIdI
	 */
	public char[]  getStudentIdIString() {
	     return getCharArray(beginStudentIdI,STUDENT_ID_I_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdIIsNumeric() {
	    return isNumeric(beginStudentIdI
	                    ,beginStudentIdI + STUDENT_ID_I_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STUDENT_ID_I_LEN = 5;
  	/**
	 * serializeStudentIdI
	 */
	protected void serializeStudentIdI(long studentIdI) {
		 putNumber(beginStudentIdI,studentIdI,STUDENT_ID_I_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStudentIdICounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStudentIdI
	 */
   	protected  long serializeStudentIdI(char[] value) {
	    long  studentIdI;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    studentIdI = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginStudentIdI
		       ,5
		      );
		 localStudentIdICounter = shareString.getSerializedField().getModifiedCounter();
		return  studentIdI;
    }

   protected long checkStudentIdIMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStudentIdI is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStudentIdI() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStudentIdI
			                 ,STUDENT_ID_I_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("studentIdI", beginStudentIdI,STUDENT_ID_I_LEN);
    }
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
  
