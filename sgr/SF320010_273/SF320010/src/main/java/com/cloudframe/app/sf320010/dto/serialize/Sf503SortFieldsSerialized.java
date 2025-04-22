package com.cloudframe.app.sf320010.dto.serialize;

/**
*  The class Sf503SortFieldsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:20. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Sf503SortFieldsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Sf503SortFieldsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SF_503_SORT_FIELDS_LENGTH = 15;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSf503SortMipId;
            protected  int beginSf503SortDate;
            protected  int beginSf503SortTime;
	
	/**
	* Constructor for Sf503SortFieldsSerialized
	**/
    public Sf503SortFieldsSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Sf503SortFieldsSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Sf503SortFieldsSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Sf503SortFieldsSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Sf503SortFieldsSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Sf503SortFieldsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SF_503_SORT_FIELDS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSf503SortMipId = getStartOffset() + 0;	// set offset for serialization
  
             beginSf503SortDate = getStartOffset() + 3;	// set offset for serialization
  
             beginSf503SortTime = getStartOffset() + 9;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localSf503SortMipIdCounter = -1;
     public boolean isSf503SortMipIdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503SortMipIdCounter != sharedCounter;
         localSf503SortMipIdCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_SORT_MIP_ID_LEN = 3;
	/**
	 * 	serialize this Sf503SortMipId
	 */
   protected void serializeSf503SortMipId(char[] sf503SortMipId) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503SortMipId,0,getStringValue(),beginSf503SortMipId,SF_503_SORT_MIP_ID_LEN);
       localSf503SortMipIdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503SortMipIdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshSf503SortMipId is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503SortMipId() {	 
   		return (substring(getStringValue(),beginSf503SortMipId,beginSf503SortMipId + SF_503_SORT_MIP_ID_LEN));
   	}
     int localSf503SortDateCounter = -1;
     public boolean isSf503SortDateModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503SortDateCounter != sharedCounter;
         localSf503SortDateCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_SORT_DATE_LEN = 6;
	/**
	 * 	serialize this Sf503SortDate
	 */
   protected void serializeSf503SortDate(char[] sf503SortDate) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503SortDate,0,getStringValue(),beginSf503SortDate,SF_503_SORT_DATE_LEN);
       localSf503SortDateCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503SortDateConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503SortDate is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503SortDate() {	 
   		return (substring(getStringValue(),beginSf503SortDate,beginSf503SortDate + SF_503_SORT_DATE_LEN));
   	}
     int localSf503SortTimeCounter = -1;
     public boolean isSf503SortTimeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSf503SortTimeCounter != sharedCounter;
         localSf503SortTimeCounter = sharedCounter; return hasModified;
     }
	protected static final int SF_503_SORT_TIME_LEN = 6;
	/**
	 * 	serialize this Sf503SortTime
	 */
   protected void serializeSf503SortTime(char[] sf503SortTime) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(sf503SortTime,0,getStringValue(),beginSf503SortTime,SF_503_SORT_TIME_LEN);
       localSf503SortTimeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkSf503SortTimeConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshSf503SortTime is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshSf503SortTime() {	 
   		return (substring(getStringValue(),beginSf503SortTime,beginSf503SortTime + SF_503_SORT_TIME_LEN));
   	}




}
  
