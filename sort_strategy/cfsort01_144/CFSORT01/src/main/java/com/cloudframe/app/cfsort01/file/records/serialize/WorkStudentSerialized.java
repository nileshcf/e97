package com.cloudframe.app.cfsort01.file.records.serialize;

/**
*  The class WorkStudentSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:02. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkStudentSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkStudentSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_STUDENT_LENGTH = 30;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginStudentIdW;
	
	/**
	* Constructor for WorkStudentSerialized
	**/
    public WorkStudentSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkStudentSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_STUDENT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginStudentIdW = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localStudentIdWCounter = -1;
     public boolean isStudentIdWModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localStudentIdWCounter != sharedCounter;
         localStudentIdWCounter = sharedCounter; return hasModified; 
     }     

	/**
	 *	Returns String value of studentIdW
	 *	@return studentIdW
	 */
	public char[]  getStudentIdWString() {
	     return getCharArray(beginStudentIdW,STUDENT_ID_W_LEN);
	}
	
	 /**
	 *  This method allows testing if there is a numeric value stored in the serialized String
	 *	@return true if numeric value is stored in the string
	 */
	public boolean studentIdWIsNumeric() {
	    return isNumeric(beginStudentIdW
	                    ,beginStudentIdW + STUDENT_ID_W_LEN
	                    ,false/*Signed*/,true/*isSign trailing*/,false/*isSignStoredSeparately*/);
	}

  
   protected  static final int STUDENT_ID_W_LEN = 5;
  	/**
	 * serializeStudentIdW
	 */
	protected void serializeStudentIdW(long studentIdW) {
		 putNumber(beginStudentIdW,studentIdW,STUDENT_ID_W_LEN,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/); 
		 localStudentIdWCounter = shareString.getSerializedField().getModifiedCounter();

    }
    /**
	 * serializeStudentIdW
	 */
   	protected  long serializeStudentIdW(char[] value) {
	    long  studentIdW;
	    if(value.length >0 && value.length!= 5)
            value = new String(value).trim().toCharArray();
	    if (value.length < 5) value = pad(5, value, ' ', LEFT_PAD);
	    else if (value.length > 5) value = substring(value,0,5);
	    /*  String can consists of digit or a non digit characters, in case of non digit characters, mimic COBOL Behavior and take only the last 4 bits per char and convert that to a number */
	    studentIdW = convertString2Number(value,false/*isSigned?*/,true/*signTrailing?*/,false/*storeSignSeparate?*/);
		replaceValue(
		       padNumber(5,value,false/*isSigned?*/)
		       ,beginStudentIdW
		       ,5
		      );
		 localStudentIdWCounter = shareString.getSerializedField().getModifiedCounter();
		return  studentIdW;
    }

   protected long checkStudentIdWMaxLimit(long number) {

        return checkMaxLimit(number , MAX_100K/*limit*/  , false/*isSigned*/);
   }
    /**
	 *	refreshStudentIdW is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshStudentIdW() throws CFException {
   	try {	 
			return (
			          getLongNumber(
			                  beginStudentIdW
			                 ,STUDENT_ID_W_LEN
			                 ,false/*isSigned*/,true/*isSignTrailing*/,false/*isSignStoredSeparate*/)              			                 
			          ); 
	} catch(Exception ex) {
    	throw getSoc7ABend("studentIdW", beginStudentIdW,STUDENT_ID_W_LEN);
    }
   	}




}
  
