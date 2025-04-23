package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503Bd32BulkIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:34. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503Bd32BulkIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503Bd32BulkIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_BD_32_BULK_ID_LENGTH = 32;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503Bd32Type;
	
	/**
	* Constructor for Sf503Bd32BulkIdSerialized
	**/
    public Sf503Bd32BulkIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503Bd32BulkIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503Bd32BulkIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503Bd32BulkIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,16); // serialize this field at offset 16 by default 
    }
    
	/**
	* sets parent for this Sf503Bd32BulkIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 16 by default
    }    
	/**
	* initializes the field in Sf503Bd32BulkIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_BD_32_BULK_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503Bd32Type = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503Bd32TypeCounter = -1;
     public boolean isSf503Bd32TypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503Bd32TypeCounter != sharedCounter;
         localSf503Bd32TypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_BD_32_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf503Bd32Type
	 */
   protected void serializeSf503Bd32Type(char[] sf503Bd32Type) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503Bd32Type,0,getStringValue(),beginSf503Bd32Type,SF_503_BD_32_TYPE_LEN);
       localSf503Bd32TypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503Bd32TypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503Bd32Type is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503Bd32Type() {	 
   		return (substring(getStringValue(),beginSf503Bd32Type,beginSf503Bd32Type + SF_503_BD_32_TYPE_LEN));
   	}




}
  
