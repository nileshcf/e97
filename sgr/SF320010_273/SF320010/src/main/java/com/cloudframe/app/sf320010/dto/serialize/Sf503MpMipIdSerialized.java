package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503MpMipIdSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503MpMipIdSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503MpMipIdSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_MP_MIP_ID_LENGTH = 3;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503MpMid;
	
	/**
	* Constructor for Sf503MpMipIdSerialized
	**/
    public Sf503MpMipIdSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503MpMipIdSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503MpMipIdSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503MpMipIdSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,29); // serialize this field at offset 29 by default 
    }
    
	/**
	* sets parent for this Sf503MpMipIdSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 29 by default
    }    
	/**
	* initializes the field in Sf503MpMipIdSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_MP_MIP_ID_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503MpMid = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503MpMidCounter = -1;
     public boolean isSf503MpMidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503MpMidCounter != sharedCounter;
         localSf503MpMidCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_MP_MID_LEN = 3;
	/**
	 * 	serialize this Sf503MpMid
	 */
   protected void serializeSf503MpMid(char[] sf503MpMid) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503MpMid,0,getStringValue(),beginSf503MpMid,SF_503_MP_MID_LEN);
       localSf503MpMidCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503MpMidConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf503MpMid is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503MpMid() {	 
   		return (substring(getStringValue(),beginSf503MpMid,beginSf503MpMid + SF_503_MP_MID_LEN));
   	}




}
  
