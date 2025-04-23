package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class Group500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:33. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Group500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Group500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GROUP_500_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginData500;
	
	/**
	* Constructor for Group500Serialized
	**/
    public Group500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Group500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Group500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Group500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Group500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Group500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GROUP_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginData500 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localData500Counter = -1;
     public boolean isData500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localData500Counter != sharedCounter;
         localData500Counter = sharedCounter; return hasModified;
     }
	protected static final int DATA_500_LEN = 4;
	/**
	 * 	serialize this Data500
	 */
   protected void serializeData500(char[] data500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(data500,0,getStringValue(),beginData500,DATA_500_LEN);
       localData500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkData500Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshData500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshData500() {	 
   		return (substring(getStringValue(),beginData500,beginData500 + DATA_500_LEN));
   	}




}
  
