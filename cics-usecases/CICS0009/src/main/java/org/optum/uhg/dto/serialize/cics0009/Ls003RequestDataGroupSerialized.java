package org.optum.uhg.dto.serialize.cics0009;

/**
*  The class Ls003RequestDataGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2024-11-20 at 23:15. using version 5.0.0.158
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ls003RequestDataGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ls003RequestDataGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LS_003_REQUEST_DATA_GROUP_LENGTH = 100;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLs003RequestData;
	
	/**
	* Constructor for Ls003RequestDataGroupSerialized
	**/
    public Ls003RequestDataGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ls003RequestDataGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LS_003_REQUEST_DATA_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLs003RequestData = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLs003RequestDataCounter = -1;
     public boolean isLs003RequestDataModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLs003RequestDataCounter != sharedCounter;
         localLs003RequestDataCounter = sharedCounter; return hasModified;
     }
	protected static final int LS_003_REQUEST_DATA_LEN = 100;
	/**
	 * 	serialize this Ls003RequestData
	 */
   protected void serializeLs003RequestData(char[] ls003RequestData) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ls003RequestData,0,getStringValue(),beginLs003RequestData,LS_003_REQUEST_DATA_LEN);
       localLs003RequestDataCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLs003RequestDataConstraints(char[] value) {
   			return super.checkConstraints(value , 100 ,false, false);
   }
    /**
	 *	refreshLs003RequestData is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLs003RequestData() {	 
   		return (substring(getStringValue(),beginLs003RequestData,beginLs003RequestData + LS_003_REQUEST_DATA_LEN));
   	}




}
  
