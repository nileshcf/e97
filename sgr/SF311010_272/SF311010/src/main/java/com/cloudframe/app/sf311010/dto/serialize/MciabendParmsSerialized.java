package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class MciabendParmsSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MciabendParmsSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MciabendParmsSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MCIABEND_PARMS_LENGTH = 20;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMciabendModule;
            protected  int beginMcabendModule;
	
	/**
	* Constructor for MciabendParmsSerialized
	**/
    public MciabendParmsSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MciabendParmsSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MCIABEND_PARMS_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMciabendModule = getStartOffset() + 0;	// set offset for serialization
  
             beginMcabendModule = getStartOffset() + 8;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localMciabendModuleCounter = -1;
     public boolean isMciabendModuleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMciabendModuleCounter != sharedCounter;
         localMciabendModuleCounter = sharedCounter; return hasModified;
     }
	protected static final int MCIABEND_MODULE_LEN = 8;
	/**
	 * 	serialize this MciabendModule
	 */
   protected void serializeMciabendModule(char[] mciabendModule) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mciabendModule,0,getStringValue(),beginMciabendModule,MCIABEND_MODULE_LEN);
       localMciabendModuleCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMciabendModuleConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMciabendModule is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMciabendModule() {	 
   		return (substring(getStringValue(),beginMciabendModule,beginMciabendModule + MCIABEND_MODULE_LEN));
   	}
     int localMcabendModuleCounter = -1;
     public boolean isMcabendModuleModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localMcabendModuleCounter != sharedCounter;
         localMcabendModuleCounter = sharedCounter; return hasModified;
     }
	protected static final int MCABEND_MODULE_LEN = 8;
	/**
	 * 	serialize this McabendModule
	 */
   protected void serializeMcabendModule(char[] mcabendModule) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(mcabendModule,0,getStringValue(),beginMcabendModule,MCABEND_MODULE_LEN);
       localMcabendModuleCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkMcabendModuleConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
    /**
	 *	refreshMcabendModule is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshMcabendModule() {	 
   		return (substring(getStringValue(),beginMcabendModule,beginMcabendModule + MCABEND_MODULE_LEN));
   	}




}
  
