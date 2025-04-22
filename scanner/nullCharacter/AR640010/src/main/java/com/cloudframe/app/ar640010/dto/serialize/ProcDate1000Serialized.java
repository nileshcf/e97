package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ProcDate1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProcDate1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProcDate1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PROC_DATE_1000_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProcDateYear1000;
            protected  int beginProcDateDlm11000;
            protected  int beginProcDateMonth1000;
            protected  int beginProcDateDlm21000;
            protected  int beginProcDateDay1000;
	
	/**
	* Constructor for ProcDate1000Serialized
	**/
    public ProcDate1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ProcDate1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProcDate1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ProcDate1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,120); // serialize this field at offset 120 by default 
    }
    
	/**
	* sets parent for this ProcDate1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 120 by default
    }    
	/**
	* initializes the field in ProcDate1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PROC_DATE_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginProcDateYear1000 = getStartOffset() + 0;	// set offset for serialization
  
             beginProcDateDlm11000 = getStartOffset() + 4;	// set offset for serialization
  
             beginProcDateMonth1000 = getStartOffset() + 5;	// set offset for serialization
  
             beginProcDateDlm21000 = getStartOffset() + 7;	// set offset for serialization
  
             beginProcDateDay1000 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localProcDateYear1000Counter = -1;
     public boolean isProcDateYear1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDateYear1000Counter != sharedCounter;
         localProcDateYear1000Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DATE_YEAR_1000_LEN = 4;
	/**
	 * 	serialize this ProcDateYear1000
	 */
   protected void serializeProcDateYear1000(char[] procDateYear1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDateYear1000,0,getStringValue(),beginProcDateYear1000,PROC_DATE_YEAR_1000_LEN);
       localProcDateYear1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDateYear1000Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshProcDateYear1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDateYear1000() {	 
   		return (substring(getStringValue(),beginProcDateYear1000,beginProcDateYear1000 + PROC_DATE_YEAR_1000_LEN));
   	}
     int localProcDateDlm11000Counter = -1;
     public boolean isProcDateDlm11000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDateDlm11000Counter != sharedCounter;
         localProcDateDlm11000Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DATE_DLM_11000_LEN = 1;
	/**
	 * 	serialize this ProcDateDlm11000
	 */
   protected void serializeProcDateDlm11000(char[] procDateDlm11000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDateDlm11000,0,getStringValue(),beginProcDateDlm11000,PROC_DATE_DLM_11000_LEN);
       localProcDateDlm11000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDateDlm11000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshProcDateDlm11000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDateDlm11000() {	 
   		return (substring(getStringValue(),beginProcDateDlm11000,beginProcDateDlm11000 + PROC_DATE_DLM_11000_LEN));
   	}
     int localProcDateMonth1000Counter = -1;
     public boolean isProcDateMonth1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDateMonth1000Counter != sharedCounter;
         localProcDateMonth1000Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DATE_MONTH_1000_LEN = 2;
	/**
	 * 	serialize this ProcDateMonth1000
	 */
   protected void serializeProcDateMonth1000(char[] procDateMonth1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDateMonth1000,0,getStringValue(),beginProcDateMonth1000,PROC_DATE_MONTH_1000_LEN);
       localProcDateMonth1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDateMonth1000Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshProcDateMonth1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDateMonth1000() {	 
   		return (substring(getStringValue(),beginProcDateMonth1000,beginProcDateMonth1000 + PROC_DATE_MONTH_1000_LEN));
   	}
     int localProcDateDlm21000Counter = -1;
     public boolean isProcDateDlm21000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDateDlm21000Counter != sharedCounter;
         localProcDateDlm21000Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DATE_DLM_21000_LEN = 1;
	/**
	 * 	serialize this ProcDateDlm21000
	 */
   protected void serializeProcDateDlm21000(char[] procDateDlm21000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDateDlm21000,0,getStringValue(),beginProcDateDlm21000,PROC_DATE_DLM_21000_LEN);
       localProcDateDlm21000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDateDlm21000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshProcDateDlm21000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDateDlm21000() {	 
   		return (substring(getStringValue(),beginProcDateDlm21000,beginProcDateDlm21000 + PROC_DATE_DLM_21000_LEN));
   	}
     int localProcDateDay1000Counter = -1;
     public boolean isProcDateDay1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProcDateDay1000Counter != sharedCounter;
         localProcDateDay1000Counter = sharedCounter; return hasModified;
     }
	protected static final int PROC_DATE_DAY_1000_LEN = 2;
	/**
	 * 	serialize this ProcDateDay1000
	 */
   protected void serializeProcDateDay1000(char[] procDateDay1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(procDateDay1000,0,getStringValue(),beginProcDateDay1000,PROC_DATE_DAY_1000_LEN);
       localProcDateDay1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProcDateDay1000Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshProcDateDay1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProcDateDay1000() {	 
   		return (substring(getStringValue(),beginProcDateDay1000,beginProcDateDay1000 + PROC_DATE_DAY_1000_LEN));
   	}




}
  
