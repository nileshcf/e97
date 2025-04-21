package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503TypeIiTranLogSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:08. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503TypeIiTranLogSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503TypeIiTranLogSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_TYPE_II_TRAN_LOG_LENGTH = 32737;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503T2RecordType;
	
	/**
	* Constructor for Sf503TypeIiTranLogSerialized
	**/
    public Sf503TypeIiTranLogSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503TypeIiTranLogSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503TypeIiTranLogSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503TypeIiTranLogSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,15); // serialize this field at offset 15 by default 
    }
    
	/**
	* sets parent for this Sf503TypeIiTranLogSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 15 by default
    }    
	/**
	* initializes the field in Sf503TypeIiTranLogSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_TYPE_II_TRAN_LOG_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503T2RecordType = getStartOffset() + 1;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503T2RecordTypeCounter = -1;
     public boolean isSf503T2RecordTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503T2RecordTypeCounter != sharedCounter;
         localSf503T2RecordTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_T_2_RECORD_TYPE_LEN = 1;
	/**
	 * 	serialize this Sf503T2RecordType
	 */
   protected void serializeSf503T2RecordType(char[] sf503T2RecordType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503T2RecordType,0,getStringValue(),beginSf503T2RecordType,SF_503_T_2_RECORD_TYPE_LEN);
       localSf503T2RecordTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503T2RecordTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshSf503T2RecordType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503T2RecordType() {	 
   		return (substring(getStringValue(),beginSf503T2RecordType,beginSf503T2RecordType + SF_503_T_2_RECORD_TYPE_LEN));
   	}




}
  
