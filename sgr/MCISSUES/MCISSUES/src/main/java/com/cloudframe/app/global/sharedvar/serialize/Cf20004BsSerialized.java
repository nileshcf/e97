package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Cf20004BsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:36. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Cf20004BsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Cf20004BsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CF_20004_BS_LENGTH = 7;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCf20004BsLevel;
            protected  int beginCf20004BsId;
	
	/**
	* Constructor for Cf20004BsSerialized
	**/
    public Cf20004BsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Cf20004BsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Cf20004BsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Cf20004BsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21); // serialize this field at offset 21 by default 
    }
    
	/**
	* sets parent for this Cf20004BsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21 by default
    }    
	/**
	* initializes the field in Cf20004BsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CF_20004_BS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCf20004BsLevel = getStartOffset() + 0;	// set offset for serialization
  
             beginCf20004BsId = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCf20004BsLevelCounter = -1;
     public boolean isCf20004BsLevelModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004BsLevelCounter != sharedCounter;
         localCf20004BsLevelCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_20004_BS_LEVEL_LEN = 1;
	/**
	 * 	serialize this Cf20004BsLevel
	 */
   protected void serializeCf20004BsLevel(char[] cf20004BsLevel) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf20004BsLevel,0,getStringValue(),beginCf20004BsLevel,CF_20004_BS_LEVEL_LEN);
       localCf20004BsLevelCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf20004BsLevelConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCf20004BsLevel is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf20004BsLevel() {	 
   		return (substring(getStringValue(),beginCf20004BsLevel,beginCf20004BsLevel + CF_20004_BS_LEVEL_LEN));
   	}
     int localCf20004BsIdCounter = -1;
     public boolean isCf20004BsIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCf20004BsIdCounter != sharedCounter;
         localCf20004BsIdCounter = sharedCounter; return hasModified;
     }
	protected static final int CF_20004_BS_ID_LEN = 6;
	/**
	 * 	serialize this Cf20004BsId
	 */
   protected void serializeCf20004BsId(char[] cf20004BsId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cf20004BsId,0,getStringValue(),beginCf20004BsId,CF_20004_BS_ID_LEN);
       localCf20004BsIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCf20004BsIdConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshCf20004BsId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCf20004BsId() {	 
   		return (substring(getStringValue(),beginCf20004BsId,beginCf20004BsId + CF_20004_BS_ID_LEN));
   	}




}
  
