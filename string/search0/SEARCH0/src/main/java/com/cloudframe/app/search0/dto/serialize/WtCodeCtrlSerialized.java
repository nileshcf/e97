package com.cloudframe.app.search0.dto.serialize;

/**
*  The class WtCodeCtrlSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WtCodeCtrlSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WtCodeCtrlSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WT_CODE_CTRL_LENGTH = 6;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCodeValue;
            protected  int beginCodeDesc;
	
	/**
	* Constructor for WtCodeCtrlSerialized
	**/
    public WtCodeCtrlSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for WtCodeCtrlSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public WtCodeCtrlSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this WtCodeCtrlSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this WtCodeCtrlSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in WtCodeCtrlSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WT_CODE_CTRL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCodeValue = getStartOffset() + 0;	// set offset for serialization
  
             beginCodeDesc = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCodeValueCounter = -1;
     public boolean isCodeValueModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCodeValueCounter != sharedCounter;
         localCodeValueCounter = sharedCounter; return hasModified;
     }
	protected static final int CODE_VALUE_LEN = 3;
	/**
	 * 	serialize this CodeValue
	 */
   protected void serializeCodeValue(char[] codeValue) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(codeValue,0,getStringValue(),beginCodeValue,CODE_VALUE_LEN);
       localCodeValueCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCodeValueConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCodeValue is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCodeValue() {	 
   		return (substring(getStringValue(),beginCodeValue,beginCodeValue + CODE_VALUE_LEN));
   	}
     int localCodeDescCounter = -1;
     public boolean isCodeDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCodeDescCounter != sharedCounter;
         localCodeDescCounter = sharedCounter; return hasModified;
     }
	protected static final int CODE_DESC_LEN = 3;
	/**
	 * 	serialize this CodeDesc
	 */
   protected void serializeCodeDesc(char[] codeDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(codeDesc,0,getStringValue(),beginCodeDesc,CODE_DESC_LEN);
       localCodeDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCodeDescConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshCodeDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCodeDesc() {	 
   		return (substring(getStringValue(),beginCodeDesc,beginCodeDesc + CODE_DESC_LEN));
   	}




}
  
