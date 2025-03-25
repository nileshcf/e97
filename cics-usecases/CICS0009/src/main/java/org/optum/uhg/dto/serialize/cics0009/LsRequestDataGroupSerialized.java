package org.optum.uhg.dto.serialize.cics0009;

/**
*  The class LsRequestDataGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:15. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LsRequestDataGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LsRequestDataGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_REQUEST_DATA_GROUP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLsRequestData;
	
	/**
	* Constructor for LsRequestDataGroupSerialized
	**/
    public LsRequestDataGroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for LsRequestDataGroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public LsRequestDataGroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this LsRequestDataGroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,2); // serialize this field at offset 2 by default 
    }
    
	/**
	* sets parent for this LsRequestDataGroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 2 by default
    }    
	/**
	* initializes the field in LsRequestDataGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_REQUEST_DATA_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLsRequestData = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLsRequestDataCounter = -1;
     public boolean isLsRequestDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLsRequestDataCounter != sharedCounter;
         localLsRequestDataCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_REQUEST_DATA_LEN = 100;
	/**
	 * 	serialize this LsRequestData
	 */
   protected void serializeLsRequestData(char[] lsRequestData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lsRequestData,0,getStringValue(),beginLsRequestData,LS_REQUEST_DATA_LEN);
       localLsRequestDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLsRequestDataConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshLsRequestData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLsRequestData() {	 
   		return (substring(getStringValue(),beginLsRequestData,beginLsRequestData + LS_REQUEST_DATA_LEN));
   	}




}
  
