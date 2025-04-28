package com.cloudframe.app.vsammon1.dto.serialize;

/**
*  The class DeleteDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:59. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class DeleteDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(DeleteDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int DELETE_DATA_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIDeleteKey;
	
	/**
	* Constructor for DeleteDataSerialized
	**/
    public DeleteDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for DeleteDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public DeleteDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this DeleteDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this DeleteDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in DeleteDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(DELETE_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIDeleteKey = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIDeleteKeyCounter = -1;
     public boolean isIDeleteKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIDeleteKeyCounter != sharedCounter;
         localIDeleteKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int I_DELETE_KEY_LEN = 65;
	/**
	 * 	serialize this IDeleteKey
	 */
   protected void serializeIDeleteKey(char[] iDeleteKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iDeleteKey,0,getStringValue(),beginIDeleteKey,I_DELETE_KEY_LEN);
       localIDeleteKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIDeleteKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 65 ,false, false);
   }
    /**
	 *	refreshIDeleteKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIDeleteKey() {	 
   		return (substring(getStringValue(),beginIDeleteKey,beginIDeleteKey + I_DELETE_KEY_LEN));
   	}




}
  
