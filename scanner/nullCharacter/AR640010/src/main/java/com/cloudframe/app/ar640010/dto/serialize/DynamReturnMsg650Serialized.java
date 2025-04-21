package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class DynamReturnMsg650Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DynamReturnMsg650Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DynamReturnMsg650Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DYNAM_RETURN_MSG_650_LENGTH = 88;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginDynamSvc99Rc650;
            protected  int beginDynamSvc99Err650;
            protected  int beginDynamSvc99Inf650;
	
	/**
	* Constructor for DynamReturnMsg650Serialized
	**/
    public DynamReturnMsg650Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in DynamReturnMsg650Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DYNAM_RETURN_MSG_650_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginDynamSvc99Rc650 = getStartOffset() + 34;	// set offset for serialization
  
  
             beginDynamSvc99Err650 = getStartOffset() + 57;	// set offset for serialization
  
  
             beginDynamSvc99Inf650 = getStartOffset() + 79;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localDynamSvc99Rc650Counter = -1;
     public boolean isDynamSvc99Rc650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamSvc99Rc650Counter != sharedCounter;
         localDynamSvc99Rc650Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_SVC_99_RC_650_LEN = 9;
	/**
	 * 	serialize this DynamSvc99Rc650
	 */
   protected void serializeDynamSvc99Rc650(char[] dynamSvc99Rc650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamSvc99Rc650,0,getStringValue(),beginDynamSvc99Rc650,DYNAM_SVC_99_RC_650_LEN);
       localDynamSvc99Rc650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamSvc99Rc650Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDynamSvc99Rc650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamSvc99Rc650() {	 
   		return (substring(getStringValue(),beginDynamSvc99Rc650,beginDynamSvc99Rc650 + DYNAM_SVC_99_RC_650_LEN));
   	}
     int localDynamSvc99Err650Counter = -1;
     public boolean isDynamSvc99Err650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamSvc99Err650Counter != sharedCounter;
         localDynamSvc99Err650Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_SVC_99_ERR_650_LEN = 9;
	/**
	 * 	serialize this DynamSvc99Err650
	 */
   protected void serializeDynamSvc99Err650(char[] dynamSvc99Err650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamSvc99Err650,0,getStringValue(),beginDynamSvc99Err650,DYNAM_SVC_99_ERR_650_LEN);
       localDynamSvc99Err650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamSvc99Err650Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDynamSvc99Err650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamSvc99Err650() {	 
   		return (substring(getStringValue(),beginDynamSvc99Err650,beginDynamSvc99Err650 + DYNAM_SVC_99_ERR_650_LEN));
   	}
     int localDynamSvc99Inf650Counter = -1;
     public boolean isDynamSvc99Inf650Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localDynamSvc99Inf650Counter != sharedCounter;
         localDynamSvc99Inf650Counter = sharedCounter; return hasModified;
     }
	protected static final int DYNAM_SVC_99_INF_650_LEN = 9;
	/**
	 * 	serialize this DynamSvc99Inf650
	 */
   protected void serializeDynamSvc99Inf650(char[] dynamSvc99Inf650) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(dynamSvc99Inf650,0,getStringValue(),beginDynamSvc99Inf650,DYNAM_SVC_99_INF_650_LEN);
       localDynamSvc99Inf650Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkDynamSvc99Inf650Constraints(char[] value) {
   			return super.checkConstraints(value , 9 ,false, false);
   }
    /**
	 *	refreshDynamSvc99Inf650 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshDynamSvc99Inf650() {	 
   		return (substring(getStringValue(),beginDynamSvc99Inf650,beginDynamSvc99Inf650 + DYNAM_SVC_99_INF_650_LEN));
   	}




}
  
