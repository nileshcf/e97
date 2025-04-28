package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class ApplicationCodeListGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ApplicationCodeListGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ApplicationCodeListGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int APPLICATION_CODE_LIST_GROUP_LENGTH = 21;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginApplicationCodeList;
	
	/**
	* Constructor for ApplicationCodeListGroupSerialized
	**/
    public ApplicationCodeListGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ApplicationCodeListGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(APPLICATION_CODE_LIST_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginApplicationCodeList = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localApplicationCodeListCounter = -1;
     public boolean isApplicationCodeListModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localApplicationCodeListCounter != sharedCounter;
         localApplicationCodeListCounter = sharedCounter; return hasModified;
     }
	protected static final int APPLICATION_CODE_LIST_LEN = 21;
	/**
	 * 	serialize this ApplicationCodeList
	 */
   protected void serializeApplicationCodeList(char[] applicationCodeList) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(applicationCodeList,0,getStringValue(),beginApplicationCodeList,APPLICATION_CODE_LIST_LEN);
       localApplicationCodeListCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkApplicationCodeListConstraints(char[] value) {
   			return super.checkConstraints(value , 21 ,false, false);
   }
    /**
	 *	refreshApplicationCodeList is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshApplicationCodeList() {	 
   		return (substring(getStringValue(),beginApplicationCodeList,beginApplicationCodeList + APPLICATION_CODE_LIST_LEN));
   	}




}
  
