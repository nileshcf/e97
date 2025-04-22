package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnDateTimeOutputAreaSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnDateTimeOutputAreaSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnDateTimeOutputAreaSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_DATE_TIME_OUTPUT_AREA_LENGTH = 19;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnDateRetrieved;
            protected  int beginCmnDateRetrievedR;
            protected  int beginCmnTimeRetrieved;
	
	/**
	* Constructor for CmnDateTimeOutputAreaSerialized
	**/
    public CmnDateTimeOutputAreaSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnDateTimeOutputAreaSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnDateTimeOutputAreaSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnDateTimeOutputAreaSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1024); // serialize this field at offset 1024 by default 
    }
    
	/**
	* sets parent for this CmnDateTimeOutputAreaSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1024 by default
    }    
	/**
	* initializes the field in CmnDateTimeOutputAreaSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_DATE_TIME_OUTPUT_AREA_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnDateRetrieved = getStartOffset() + 1;	// set offset for serialization
  
             beginCmnDateRetrievedR = getStartOffset() + 1;	// set offset for serialization
  
             beginCmnTimeRetrieved = getStartOffset() + 11;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localCmnDateRetrievedCounter = -1;
     public boolean isCmnDateRetrievedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetrievedCounter != sharedCounter;
         localCmnDateRetrievedCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RETRIEVED_LEN = 10;
	/**
	 * 	serialize this CmnDateRetrieved
	 */
   protected void serializeCmnDateRetrieved(char[] cmnDateRetrieved) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetrieved,0,getStringValue(),beginCmnDateRetrieved,CMN_DATE_RETRIEVED_LEN);
       localCmnDateRetrievedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetrievedConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateRetrieved is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetrieved() {	 
   		return (substring(getStringValue(),beginCmnDateRetrieved,beginCmnDateRetrieved + CMN_DATE_RETRIEVED_LEN));
   	}
     int localCmnDateRetrievedRCounter = -1;
     public boolean isCmnDateRetrievedRModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnDateRetrievedRCounter != sharedCounter;
         localCmnDateRetrievedRCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_DATE_RETRIEVED_R_LEN = 10;
	/**
	 * 	serialize this CmnDateRetrievedR
	 */
   protected void serializeCmnDateRetrievedR(char[] cmnDateRetrievedR) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnDateRetrievedR,0,getStringValue(),beginCmnDateRetrievedR,CMN_DATE_RETRIEVED_R_LEN);
       localCmnDateRetrievedRCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnDateRetrievedRConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
    /**
	 *	refreshCmnDateRetrievedR is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnDateRetrievedR() {	 
   		return (substring(getStringValue(),beginCmnDateRetrievedR,beginCmnDateRetrievedR + CMN_DATE_RETRIEVED_R_LEN));
   	}
     int localCmnTimeRetrievedCounter = -1;
     public boolean isCmnTimeRetrievedModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeRetrievedCounter != sharedCounter;
         localCmnTimeRetrievedCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_RETRIEVED_LEN = 8;
	/**
	 * 	serialize this CmnTimeRetrieved
	 */
   protected void serializeCmnTimeRetrieved(char[] cmnTimeRetrieved) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeRetrieved,0,getStringValue(),beginCmnTimeRetrieved,CMN_TIME_RETRIEVED_LEN);
       localCmnTimeRetrievedCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeRetrievedConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshCmnTimeRetrieved is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeRetrieved() {	 
   		return (substring(getStringValue(),beginCmnTimeRetrieved,beginCmnTimeRetrieved + CMN_TIME_RETRIEVED_LEN));
   	}




}
  
