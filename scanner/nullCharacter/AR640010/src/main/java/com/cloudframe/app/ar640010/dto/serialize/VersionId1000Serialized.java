package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class VersionId1000Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:13. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class VersionId1000Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(VersionId1000Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VERSION_ID_1000_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVersionDate1000;
            protected  int beginVersionMod1000;
	
	/**
	* Constructor for VersionId1000Serialized
	**/
    public VersionId1000Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for VersionId1000Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public VersionId1000Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this VersionId1000Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this VersionId1000Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in VersionId1000Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VERSION_ID_1000_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVersionDate1000 = getStartOffset() + 0;	// set offset for serialization
  
  
             beginVersionMod1000 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localVersionDate1000Counter = -1;
     public boolean isVersionDate1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVersionDate1000Counter != sharedCounter;
         localVersionDate1000Counter = sharedCounter; return hasModified;
     }
	protected static final int VERSION_DATE_1000_LEN = 10;
	/**
	 * 	serialize this VersionDate1000
	 */
   protected void serializeVersionDate1000(char[] versionDate1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(versionDate1000,0,getStringValue(),beginVersionDate1000,VERSION_DATE_1000_LEN);
       localVersionDate1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVersionDate1000Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshVersionDate1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVersionDate1000() {	 
   		return (substring(getStringValue(),beginVersionDate1000,beginVersionDate1000 + VERSION_DATE_1000_LEN));
   	}
     int localVersionMod1000Counter = -1;
     public boolean isVersionMod1000Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVersionMod1000Counter != sharedCounter;
         localVersionMod1000Counter = sharedCounter; return hasModified;
     }
	protected static final int VERSION_MOD_1000_LEN = 1;
	/**
	 * 	serialize this VersionMod1000
	 */
   protected void serializeVersionMod1000(char[] versionMod1000) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(versionMod1000,0,getStringValue(),beginVersionMod1000,VERSION_MOD_1000_LEN);
       localVersionMod1000Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVersionMod1000Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshVersionMod1000 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVersionMod1000() {	 
   		return (substring(getStringValue(),beginVersionMod1000,beginVersionMod1000 + VERSION_MOD_1000_LEN));
   	}




}
  
