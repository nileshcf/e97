package com.cloudframe.app.vsammon7.dto.serialize;

/**
*  The class KeyreadDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:06. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class KeyreadDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(KeyreadDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int KEYREAD_DATA_LENGTH = 65;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIKeyread;
	
	/**
	* Constructor for KeyreadDataSerialized
	**/
    public KeyreadDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for KeyreadDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public KeyreadDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this KeyreadDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,7); // serialize this field at offset 7 by default 
    }
    
	/**
	* sets parent for this KeyreadDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 7 by default
    }    
	/**
	* initializes the field in KeyreadDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(KEYREAD_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIKeyread = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIKeyreadCounter = -1;
     public boolean isIKeyreadModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIKeyreadCounter != sharedCounter;
         localIKeyreadCounter = sharedCounter; return hasModified;
     }
	protected static final int I_KEYREAD_LEN = 65;
	/**
	 * 	serialize this IKeyread
	 */
   protected void serializeIKeyread(char[] iKeyread) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(iKeyread,0,getStringValue(),beginIKeyread,I_KEYREAD_LEN);
       localIKeyreadCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIKeyreadConstraints(char[] value) {
   			return super.checkConstraints(value , 65 ,false, false);
   }
    /**
	 *	refreshIKeyread is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIKeyread() {	 
   		return (substring(getStringValue(),beginIKeyread,beginIKeyread + I_KEYREAD_LEN));
   	}




}
  
