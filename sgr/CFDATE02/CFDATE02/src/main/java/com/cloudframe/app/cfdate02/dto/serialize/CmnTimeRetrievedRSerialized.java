package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class CmnTimeRetrievedRSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:05. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CmnTimeRetrievedRSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CmnTimeRetrievedRSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CMN_TIME_RETRIEVED_R_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginCmnTimeRetSs;
	
	/**
	* Constructor for CmnTimeRetrievedRSerialized
	**/
    public CmnTimeRetrievedRSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for CmnTimeRetrievedRSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public CmnTimeRetrievedRSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this CmnTimeRetrievedRSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1035); // serialize this field at offset 1035 by default 
    }
    
	/**
	* sets parent for this CmnTimeRetrievedRSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1035 by default
    }    
	/**
	* initializes the field in CmnTimeRetrievedRSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CMN_TIME_RETRIEVED_R_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginCmnTimeRetSs = getStartOffset() + 6;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localCmnTimeRetSsCounter = -1;
     public boolean isCmnTimeRetSsModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCmnTimeRetSsCounter != sharedCounter;
         localCmnTimeRetSsCounter = sharedCounter; return hasModified;
     }
	protected static final int CMN_TIME_RET_SS_LEN = 2;
	/**
	 * 	serialize this CmnTimeRetSs
	 */
   protected void serializeCmnTimeRetSs(char[] cmnTimeRetSs) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(cmnTimeRetSs,0,getStringValue(),beginCmnTimeRetSs,CMN_TIME_RET_SS_LEN);
       localCmnTimeRetSsCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCmnTimeRetSsConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
    /**
	 *	refreshCmnTimeRetSs is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCmnTimeRetSs() {	 
   		return (substring(getStringValue(),beginCmnTimeRetSs,beginCmnTimeRetSs + CMN_TIME_RET_SS_LEN));
   	}




}
  
