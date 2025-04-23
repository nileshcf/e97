package com.cloudframe.app.ip661020.dto.serialize;

/**
*  The class ErrorMessage600Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ErrorMessage600Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ErrorMessage600Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ERROR_MESSAGE_600_LENGTH = 70;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginErrorParagraph600;
            protected  int beginFailingAction600;
            protected  int beginBadStatusCode600;
	
	/**
	* Constructor for ErrorMessage600Serialized
	**/
    public ErrorMessage600Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ErrorMessage600Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ERROR_MESSAGE_600_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginErrorParagraph600 = getStartOffset() + 8;	// set offset for serialization
  
  
             beginFailingAction600 = getStartOffset() + 31;	// set offset for serialization
  
  
             beginBadStatusCode600 = getStartOffset() + 66;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localErrorParagraph600Counter = -1;
     public boolean isErrorParagraph600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localErrorParagraph600Counter != sharedCounter;
         localErrorParagraph600Counter = sharedCounter; return hasModified;
     }
	protected static final int ERROR_PARAGRAPH_600_LEN = 4;
	/**
	 * 	serialize this ErrorParagraph600
	 */
   protected void serializeErrorParagraph600(char[] errorParagraph600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(errorParagraph600,0,getStringValue(),beginErrorParagraph600,ERROR_PARAGRAPH_600_LEN);
       localErrorParagraph600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkErrorParagraph600Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshErrorParagraph600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshErrorParagraph600() {	 
   		return (substring(getStringValue(),beginErrorParagraph600,beginErrorParagraph600 + ERROR_PARAGRAPH_600_LEN));
   	}
     int localFailingAction600Counter = -1;
     public boolean isFailingAction600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFailingAction600Counter != sharedCounter;
         localFailingAction600Counter = sharedCounter; return hasModified;
     }
	protected static final int FAILING_ACTION_600_LEN = 5;
	/**
	 * 	serialize this FailingAction600
	 */
   protected void serializeFailingAction600(char[] failingAction600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(failingAction600,0,getStringValue(),beginFailingAction600,FAILING_ACTION_600_LEN);
       localFailingAction600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFailingAction600Constraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
    /**
	 *	refreshFailingAction600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFailingAction600() {	 
   		return (substring(getStringValue(),beginFailingAction600,beginFailingAction600 + FAILING_ACTION_600_LEN));
   	}
     int localBadStatusCode600Counter = -1;
     public boolean isBadStatusCode600Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBadStatusCode600Counter != sharedCounter;
         localBadStatusCode600Counter = sharedCounter; return hasModified;
     }
	protected static final int BAD_STATUS_CODE_600_LEN = 2;
	/**
	 * 	serialize this BadStatusCode600
	 */
   protected void serializeBadStatusCode600(char[] badStatusCode600) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(badStatusCode600,0,getStringValue(),beginBadStatusCode600,BAD_STATUS_CODE_600_LEN);
       localBadStatusCode600Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBadStatusCode600Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshBadStatusCode600 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBadStatusCode600() {	 
   		return (substring(getStringValue(),beginBadStatusCode600,beginBadStatusCode600 + BAD_STATUS_CODE_600_LEN));
   	}




}
  
