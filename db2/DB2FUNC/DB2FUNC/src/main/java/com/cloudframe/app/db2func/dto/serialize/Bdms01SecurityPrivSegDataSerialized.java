package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class Bdms01SecurityPrivSegDataSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Bdms01SecurityPrivSegDataSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Bdms01SecurityPrivSegDataSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BDMS_01_SECURITY_PRIV_SEG_DATA_LENGTH = 1;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginBdms01PrivateSecInd;
	
	/**
	* Constructor for Bdms01SecurityPrivSegDataSerialized
	**/
    public Bdms01SecurityPrivSegDataSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Bdms01SecurityPrivSegDataSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Bdms01SecurityPrivSegDataSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Bdms01SecurityPrivSegDataSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4630); // serialize this field at offset 4630 by default 
    }
    
	/**
	* sets parent for this Bdms01SecurityPrivSegDataSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4630 by default
    }    
	/**
	* initializes the field in Bdms01SecurityPrivSegDataSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BDMS_01_SECURITY_PRIV_SEG_DATA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginBdms01PrivateSecInd = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localBdms01PrivateSecIndCounter = -1;
     public boolean isBdms01PrivateSecIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localBdms01PrivateSecIndCounter != sharedCounter;
         localBdms01PrivateSecIndCounter = sharedCounter; return hasModified;
     }
	protected static final int BDMS_01_PRIVATE_SEC_IND_LEN = 1;
	/**
	 * 	serialize this Bdms01PrivateSecInd
	 */
   protected void serializeBdms01PrivateSecInd(char[] bdms01PrivateSecInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(bdms01PrivateSecInd,0,getStringValue(),beginBdms01PrivateSecInd,BDMS_01_PRIVATE_SEC_IND_LEN);
       localBdms01PrivateSecIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkBdms01PrivateSecIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshBdms01PrivateSecInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshBdms01PrivateSecInd() {	 
   		return (substring(getStringValue(),beginBdms01PrivateSecInd,beginBdms01PrivateSecInd + BDMS_01_PRIVATE_SEC_IND_LEN));
   	}




}
  
