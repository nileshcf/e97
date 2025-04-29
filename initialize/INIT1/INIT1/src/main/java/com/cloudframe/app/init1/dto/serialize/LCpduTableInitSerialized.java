package com.cloudframe.app.init1.dto.serialize;

/**
*  The class LCpduTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:22. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LCpduTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LCpduTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int L_CPDU_TABLE_INIT_LENGTH = 801267;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLCpduErrorInit;
	
	/**
	* Constructor for LCpduTableInitSerialized
	**/
    public LCpduTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LCpduTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(L_CPDU_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginLCpduErrorInit = getStartOffset() + 162;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localLCpduErrorInitCounter = -1;
     public boolean isLCpduErrorInitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLCpduErrorInitCounter != sharedCounter;
         localLCpduErrorInitCounter = sharedCounter; return hasModified;
     }
	protected static final int L_CPDU_ERROR_INIT_LEN = 6;
	/**
	 * 	serialize this LCpduErrorInit
	 */
   protected void serializeLCpduErrorInit(char[] lCpduErrorInit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lCpduErrorInit,0,getStringValue(),beginLCpduErrorInit,L_CPDU_ERROR_INIT_LEN);
       localLCpduErrorInitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLCpduErrorInitConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshLCpduErrorInit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLCpduErrorInit() {	 
   		return (substring(getStringValue(),beginLCpduErrorInit,beginLCpduErrorInit + L_CPDU_ERROR_INIT_LEN));
   	}




}
  
