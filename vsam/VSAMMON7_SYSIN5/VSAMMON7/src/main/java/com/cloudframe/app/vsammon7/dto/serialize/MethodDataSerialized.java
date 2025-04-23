package com.cloudframe.app.vsammon7.dto.serialize;

/**
*  The class MethodDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:57. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MethodDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MethodDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int METHOD_DATA_LENGTH = 35;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIMethod;
	
	/**
	* Constructor for MethodDataSerialized
	**/
    public MethodDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MethodDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MethodDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MethodDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this MethodDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in MethodDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(METHOD_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIMethod = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIMethodCounter = -1;
     public boolean isIMethodModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIMethodCounter != sharedCounter;
         localIMethodCounter = sharedCounter; return hasModified;
     }
	protected static final int I_METHOD_LEN = 35;
	/**
	 * 	serialize this IMethod
	 */
   protected void serializeIMethod(char[] iMethod) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iMethod,0,getStringValue(),beginIMethod,I_METHOD_LEN);
       localIMethodCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIMethodConstraints(char[] value) {
   			return super.checkConstraints(value , 35 ,false, false);
   }
    /**
	 *	refreshIMethod is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIMethod() {	 
   		return (substring(getStringValue(),beginIMethod,beginIMethod + I_METHOD_LEN));
   	}




}
  
