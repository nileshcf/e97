package com.cloudframe.app.vsammon4.dto.serialize;

/**
*  The class OpenioDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class OpenioDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(OpenioDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int OPENIO_DATA_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIOpenMode;
	
	/**
	* Constructor for OpenioDataSerialized
	**/
    public OpenioDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for OpenioDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public OpenioDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this OpenioDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this OpenioDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in OpenioDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(OPENIO_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIOpenMode = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIOpenModeCounter = -1;
     public boolean isIOpenModeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIOpenModeCounter != sharedCounter;
         localIOpenModeCounter = sharedCounter; return hasModified;
     }
	protected static final int I_OPEN_MODE_LEN = 15;
	/**
	 * 	serialize this IOpenMode
	 */
   protected void serializeIOpenMode(char[] iOpenMode) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iOpenMode,0,getStringValue(),beginIOpenMode,I_OPEN_MODE_LEN);
       localIOpenModeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIOpenModeConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshIOpenMode is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIOpenMode() {	 
   		return (substring(getStringValue(),beginIOpenMode,beginIOpenMode + I_OPEN_MODE_LEN));
   	}




}
  
