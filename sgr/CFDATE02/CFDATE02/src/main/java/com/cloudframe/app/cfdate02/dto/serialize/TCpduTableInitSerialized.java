package com.cloudframe.app.cfdate02.dto.serialize;

/**
*  The class TCpduTableInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:43. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class TCpduTableInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(TCpduTableInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int T_CPDU_TABLE_INIT_LENGTH = 801267;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTCpduErrorInit;
	
	/**
	* Constructor for TCpduTableInitSerialized
	**/
    public TCpduTableInitSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in TCpduTableInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(T_CPDU_TABLE_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginTCpduErrorInit = getStartOffset() + 162;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localTCpduErrorInitCounter = -1;
     public boolean isTCpduErrorInitModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTCpduErrorInitCounter != sharedCounter;
         localTCpduErrorInitCounter = sharedCounter; return hasModified;
     }
	protected static final int T_CPDU_ERROR_INIT_LEN = 6;
	/**
	 * 	serialize this TCpduErrorInit
	 */
   protected void serializeTCpduErrorInit(char[] tCpduErrorInit) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tCpduErrorInit,0,getStringValue(),beginTCpduErrorInit,T_CPDU_ERROR_INIT_LEN);
       localTCpduErrorInitCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTCpduErrorInitConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
    /**
	 *	refreshTCpduErrorInit is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTCpduErrorInit() {	 
   		return (substring(getStringValue(),beginTCpduErrorInit,beginTCpduErrorInit + T_CPDU_ERROR_INIT_LEN));
   	}




}
  
