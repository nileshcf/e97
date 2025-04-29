package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class Ar649UserParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ar649UserParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ar649UserParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int AR_649_USER_PARMS_LENGTH = 14;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAr649UserBulkId;
            protected  int beginAr649UserEndptId;
            protected  int beginAr649UserCyclNum;
	
	/**
	* Constructor for Ar649UserParmsSerialized
	**/
    public Ar649UserParmsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ar649UserParmsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ar649UserParmsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ar649UserParmsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this Ar649UserParmsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in Ar649UserParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(AR_649_USER_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginAr649UserBulkId = getStartOffset() + 0;	// set offset for serialization
  
             beginAr649UserEndptId = getStartOffset() + 4;	// set offset for serialization
  
             beginAr649UserCyclNum = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localAr649UserBulkIdCounter = -1;
     public boolean isAr649UserBulkIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649UserBulkIdCounter != sharedCounter;
         localAr649UserBulkIdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_649_USER_BULK_ID_LEN = 4;
	/**
	 * 	serialize this Ar649UserBulkId
	 */
   protected void serializeAr649UserBulkId(char[] ar649UserBulkId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar649UserBulkId,0,getStringValue(),beginAr649UserBulkId,AR_649_USER_BULK_ID_LEN);
       localAr649UserBulkIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr649UserBulkIdConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshAr649UserBulkId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr649UserBulkId() {	 
   		return (substring(getStringValue(),beginAr649UserBulkId,beginAr649UserBulkId + AR_649_USER_BULK_ID_LEN));
   	}
     int localAr649UserEndptIdCounter = -1;
     public boolean isAr649UserEndptIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649UserEndptIdCounter != sharedCounter;
         localAr649UserEndptIdCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_649_USER_ENDPT_ID_LEN = 7;
	/**
	 * 	serialize this Ar649UserEndptId
	 */
   protected void serializeAr649UserEndptId(char[] ar649UserEndptId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar649UserEndptId,0,getStringValue(),beginAr649UserEndptId,AR_649_USER_ENDPT_ID_LEN);
       localAr649UserEndptIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr649UserEndptIdConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshAr649UserEndptId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr649UserEndptId() {	 
   		return (substring(getStringValue(),beginAr649UserEndptId,beginAr649UserEndptId + AR_649_USER_ENDPT_ID_LEN));
   	}
     int localAr649UserCyclNumCounter = -1;
     public boolean isAr649UserCyclNumModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAr649UserCyclNumCounter != sharedCounter;
         localAr649UserCyclNumCounter = sharedCounter; return hasModified;
     }
	protected static final int AR_649_USER_CYCL_NUM_LEN = 3;
	/**
	 * 	serialize this Ar649UserCyclNum
	 */
   protected void serializeAr649UserCyclNum(char[] ar649UserCyclNum) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ar649UserCyclNum,0,getStringValue(),beginAr649UserCyclNum,AR_649_USER_CYCL_NUM_LEN);
       localAr649UserCyclNumCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkAr649UserCyclNumConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshAr649UserCyclNum is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshAr649UserCyclNum() {	 
   		return (substring(getStringValue(),beginAr649UserCyclNum,beginAr649UserCyclNum + AR_649_USER_CYCL_NUM_LEN));
   	}




}
  
