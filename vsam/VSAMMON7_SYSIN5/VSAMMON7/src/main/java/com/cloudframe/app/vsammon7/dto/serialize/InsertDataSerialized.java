package com.cloudframe.app.vsammon7.dto.serialize;

/**
*  The class InsertDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:00. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class InsertDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(InsertDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INSERT_DATA_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIInsertKey;
	
	/**
	* Constructor for InsertDataSerialized
	**/
    public InsertDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for InsertDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public InsertDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this InsertDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this InsertDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in InsertDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INSERT_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIInsertKey = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIInsertKeyCounter = -1;
     public boolean isIInsertKeyModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIInsertKeyCounter != sharedCounter;
         localIInsertKeyCounter = sharedCounter; return hasModified;
     }
	protected static final int I_INSERT_KEY_LEN = 65;
	/**
	 * 	serialize this IInsertKey
	 */
   protected void serializeIInsertKey(char[] iInsertKey) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iInsertKey,0,getStringValue(),beginIInsertKey,I_INSERT_KEY_LEN);
       localIInsertKeyCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIInsertKeyConstraints(char[] value) {
   			return super.checkConstraints(value , 65 ,false, false);
   }
    /**
	 *	refreshIInsertKey is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIInsertKey() {	 
   		return (substring(getStringValue(),beginIInsertKey,beginIInsertKey + I_INSERT_KEY_LEN));
   	}




}
  
