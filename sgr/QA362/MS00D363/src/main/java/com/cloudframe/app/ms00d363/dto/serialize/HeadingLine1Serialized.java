package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class HeadingLine1Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:35. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class HeadingLine1Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(HeadingLine1Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int HEADING_LINE_1_LENGTH = 133;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginHd11Cc;
            protected  int beginHd11ProgName;
	
	/**
	* Constructor for HeadingLine1Serialized
	**/
    public HeadingLine1Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for HeadingLine1Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public HeadingLine1Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this HeadingLine1Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this HeadingLine1Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in HeadingLine1Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(HEADING_LINE_1_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginHd11Cc = getStartOffset() + 0;	// set offset for serialization
  
             beginHd11ProgName = getStartOffset() + 1;	// set offset for serialization
  
  
  
  
	   /*  end of offset */
	}
     int localHd11CcCounter = -1;
     public boolean isHd11CcModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd11CcCounter != sharedCounter;
         localHd11CcCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_11_CC_LEN = 1;
	/**
	 * 	serialize this Hd11Cc
	 */
   protected void serializeHd11Cc(char[] hd11Cc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd11Cc,0,getStringValue(),beginHd11Cc,HD_11_CC_LEN);
       localHd11CcCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd11CcConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshHd11Cc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd11Cc() {	 
   		return (substring(getStringValue(),beginHd11Cc,beginHd11Cc + HD_11_CC_LEN));
   	}
     int localHd11ProgNameCounter = -1;
     public boolean isHd11ProgNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localHd11ProgNameCounter != sharedCounter;
         localHd11ProgNameCounter = sharedCounter; return hasModified;
     }
	protected static final int HD_11_PROG_NAME_LEN = 10;
	/**
	 * 	serialize this Hd11ProgName
	 */
   protected void serializeHd11ProgName(char[] hd11ProgName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(hd11ProgName,0,getStringValue(),beginHd11ProgName,HD_11_PROG_NAME_LEN);
       localHd11ProgNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkHd11ProgNameConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshHd11ProgName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshHd11ProgName() {	 
   		return (substring(getStringValue(),beginHd11ProgName,beginHd11ProgName + HD_11_PROG_NAME_LEN));
   	}




}
  
