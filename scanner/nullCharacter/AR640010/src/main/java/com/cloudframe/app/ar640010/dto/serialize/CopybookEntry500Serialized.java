package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class CopybookEntry500Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CopybookEntry500Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CopybookEntry500Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int COPYBOOK_ENTRY_500_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCopybookDate500;
            protected  int beginCopybookMod500;
	
	/**
	* Constructor for CopybookEntry500Serialized
	**/
    public CopybookEntry500Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CopybookEntry500Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CopybookEntry500Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CopybookEntry500Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this CopybookEntry500Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in CopybookEntry500Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(COPYBOOK_ENTRY_500_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCopybookDate500 = getStartOffset() + 0;	// set offset for serialization
  
             beginCopybookMod500 = getStartOffset() + 11;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCopybookDate500Counter = -1;
     public boolean isCopybookDate500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybookDate500Counter != sharedCounter;
         localCopybookDate500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_DATE_500_LEN = 10;
	/**
	 * 	serialize this CopybookDate500
	 */
   protected void serializeCopybookDate500(char[] copybookDate500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybookDate500,0,getStringValue(),beginCopybookDate500,COPYBOOK_DATE_500_LEN);
       localCopybookDate500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybookDate500Constraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCopybookDate500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybookDate500() {	 
   		return (substring(getStringValue(),beginCopybookDate500,beginCopybookDate500 + COPYBOOK_DATE_500_LEN));
   	}
     int localCopybookMod500Counter = -1;
     public boolean isCopybookMod500Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCopybookMod500Counter != sharedCounter;
         localCopybookMod500Counter = sharedCounter; return hasModified;
     }
	protected static final int COPYBOOK_MOD_500_LEN = 1;
	/**
	 * 	serialize this CopybookMod500
	 */
   protected void serializeCopybookMod500(char[] copybookMod500) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(copybookMod500,0,getStringValue(),beginCopybookMod500,COPYBOOK_MOD_500_LEN);
       localCopybookMod500Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCopybookMod500Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshCopybookMod500 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCopybookMod500() {	 
   		return (substring(getStringValue(),beginCopybookMod500,beginCopybookMod500 + COPYBOOK_MOD_500_LEN));
   	}




}
  
