package com.cloudframe.app.cfsort02.file.records.serialize;

/**
*  The class StudentNameIRedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class StudentNameIRedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(StudentNameIRedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int STUDENT_NAME_IREDEFINED_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStudentSeqNo01;
	
	/**
	* Constructor for StudentNameIRedefinedSerialized
	**/
    public StudentNameIRedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for StudentNameIRedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public StudentNameIRedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this StudentNameIRedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,5); // serialize this field at offset 5 by default 
    }
    
	/**
	* sets parent for this StudentNameIRedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 5 by default
    }    
	/**
	* initializes the field in StudentNameIRedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(STUDENT_NAME_IREDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStudentSeqNo01 = getStartOffset() + 22;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStudentSeqNo01Counter = -1;
     public boolean isStudentSeqNo01Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStudentSeqNo01Counter != sharedCounter;
         localStudentSeqNo01Counter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of studentSeqNo01
	 *	@return studentSeqNo01
	 */
	public char[]  getStudentSeqNo01String() {
	     return getCharArray(beginStudentSeqNo01,STUDENT_SEQ_NO_01_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentSeqNo01IsNumeric() {
	    return isNumeric(beginStudentSeqNo01
	                    ,beginStudentSeqNo01 + STUDENT_SEQ_NO_01_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STUDENT_SEQ_NO_01_LEN = 3;
  	/**
	 * serializeStudentSeqNo01
	 */
	protected void serializeStudentSeqNo01(int studentSeqNo01) {
		 putNumber(beginStudentSeqNo01,studentSeqNo01,STUDENT_SEQ_NO_01_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStudentSeqNo01Counter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStudentSeqNo01
	 */
   	protected  int serializeStudentSeqNo01(char[] value) {
	    int  studentSeqNo01;
	    if(value.length >0 && value.length!= 3)
            value = new String(value).trim().toCharArray();
	    if (value.length < 3) value = pad(3, value, ' ', LEFT_PAD);
	    else if (value.length > 3) value = substring(value,0,3);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    studentSeqNo01 = (int) convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(3,value,false/*isSigned?*/)
		       ,beginStudentSeqNo01
		       ,3
		      );
		 localStudentSeqNo01Counter = shareString.getSerializedField().getModifiedCounter();
		return  studentSeqNo01;
    }

   protected int checkStudentSeqNo01MaxLimit(long number) {

	   return (int)checkMaxLimit(number , MAX_1000/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStudentSeqNo01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshStudentSeqNo01() throws CFException {
   	try {	 
			return (
			          getIntNumber(
			                  beginStudentSeqNo01
			                 ,STUDENT_SEQ_NO_01_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("studentSeqNo01", beginStudentSeqNo01,STUDENT_SEQ_NO_01_LEN);
    }
   	}




}
  
