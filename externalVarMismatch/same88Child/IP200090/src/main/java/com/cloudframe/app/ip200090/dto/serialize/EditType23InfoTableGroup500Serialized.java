package com.cloudframe.app.ip200090.dto.serialize;

/**
*  The class EditType23InfoTableGroup500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:05. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EditType23InfoTableGroup500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EditType23InfoTableGroup500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int EDIT_TYPE_23_INFO_TABLE_GROUP_500_LENGTH = 31344;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEditType23InfoTable500;
            protected  int beginEditType23InfoTable500Redefined;
	
	/**
	* Constructor for EditType23InfoTableGroup500Serialized
	**/
    public EditType23InfoTableGroup500Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in EditType23InfoTableGroup500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(EDIT_TYPE_23_INFO_TABLE_GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEditType23InfoTable500 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginEditType23InfoTable500Redefined = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEditType23InfoTable500Counter = -1;
     public boolean isEditType23InfoTable500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditType23InfoTable500Counter != sharedCounter;
         localEditType23InfoTable500Counter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_TYPE_23_INFO_TABLE_500_LEN = 31344;
	/**
	 * 	serialize this EditType23InfoTable500
	 */
   protected void serializeEditType23InfoTable500(char[] editType23InfoTable500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(editType23InfoTable500,0,getStringValue(),beginEditType23InfoTable500,EDIT_TYPE_23_INFO_TABLE_500_LEN);
       localEditType23InfoTable500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditType23InfoTable500Constraints(char[] value) {
   			return super.checkConstraints(value , 31344 ,false, false);
   }
    /**
	 *	refreshEditType23InfoTable500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEditType23InfoTable500() {	 
   		return (substring(getStringValue(),beginEditType23InfoTable500,beginEditType23InfoTable500 + EDIT_TYPE_23_INFO_TABLE_500_LEN));
   	}
     int localEditType23InfoTable500RedefinedCounter = -1;
     public boolean isEditType23InfoTable500RedefinedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEditType23InfoTable500RedefinedCounter != sharedCounter;
         localEditType23InfoTable500RedefinedCounter = sharedCounter; return hasModified;
     }
	protected static final int EDIT_TYPE_23_INFO_TABLE_500_REDEFINED_LEN = 31344;
	/**
	 * 	serialize this EditType23InfoTable500Redefined
	 */
   protected void serializeEditType23InfoTable500Redefined(char[] editType23InfoTable500Redefined) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(editType23InfoTable500Redefined,0,getStringValue(),beginEditType23InfoTable500Redefined,EDIT_TYPE_23_INFO_TABLE_500_REDEFINED_LEN);
       localEditType23InfoTable500RedefinedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEditType23InfoTable500RedefinedConstraints(char[] value) {
   			return super.checkConstraints(value , 31344 ,false, false);
   }
    /**
	 *	refreshEditType23InfoTable500Redefined is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEditType23InfoTable500Redefined() {	 
   		return (substring(getStringValue(),beginEditType23InfoTable500Redefined,beginEditType23InfoTable500Redefined + EDIT_TYPE_23_INFO_TABLE_500_REDEFINED_LEN));
   	}




}
  
