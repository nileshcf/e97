package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class ParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_LENGTH = 18;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmInType;
            protected  int beginParmErlyFlag;
            protected  int beginParmHeir;
            protected  int beginParmEsrvFlag;
	
	/**
	* Constructor for ParmSerialized
	**/
    public ParmSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ParmSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginParmInType = getStartOffset() + 2;	// set offset for serialization
  
  
             beginParmErlyFlag = getStartOffset() + 10;	// set offset for serialization
  
  
             beginParmHeir = getStartOffset() + 12;	// set offset for serialization
  
  
             beginParmEsrvFlag = getStartOffset() + 17;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localParmInTypeCounter = -1;
     public boolean isParmInTypeModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmInTypeCounter != sharedCounter;
         localParmInTypeCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_IN_TYPE_LEN = 7;
	/**
	 * 	serialize this ParmInType
	 */
   protected void serializeParmInType(char[] parmInType) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmInType,0,getStringValue(),beginParmInType,PARM_IN_TYPE_LEN);
       localParmInTypeCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmInTypeConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
    /**
	 *	refreshParmInType is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmInType() {	 
   		return (substring(getStringValue(),beginParmInType,beginParmInType + PARM_IN_TYPE_LEN));
   	}
     int localParmErlyFlagCounter = -1;
     public boolean isParmErlyFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmErlyFlagCounter != sharedCounter;
         localParmErlyFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_ERLY_FLAG_LEN = 1;
	/**
	 * 	serialize this ParmErlyFlag
	 */
   protected void serializeParmErlyFlag(char[] parmErlyFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmErlyFlag,0,getStringValue(),beginParmErlyFlag,PARM_ERLY_FLAG_LEN);
       localParmErlyFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmErlyFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshParmErlyFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmErlyFlag() {	 
   		return (substring(getStringValue(),beginParmErlyFlag,beginParmErlyFlag + PARM_ERLY_FLAG_LEN));
   	}
     int localParmHeirCounter = -1;
     public boolean isParmHeirModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmHeirCounter != sharedCounter;
         localParmHeirCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_HEIR_LEN = 4;
	/**
	 * 	serialize this ParmHeir
	 */
   protected void serializeParmHeir(char[] parmHeir) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmHeir,0,getStringValue(),beginParmHeir,PARM_HEIR_LEN);
       localParmHeirCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmHeirConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshParmHeir is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmHeir() {	 
   		return (substring(getStringValue(),beginParmHeir,beginParmHeir + PARM_HEIR_LEN));
   	}
     int localParmEsrvFlagCounter = -1;
     public boolean isParmEsrvFlagModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localParmEsrvFlagCounter != sharedCounter;
         localParmEsrvFlagCounter = sharedCounter; return hasModified;
     }
	protected static final int PARM_ESRV_FLAG_LEN = 1;
	/**
	 * 	serialize this ParmEsrvFlag
	 */
   protected void serializeParmEsrvFlag(char[] parmEsrvFlag) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(parmEsrvFlag,0,getStringValue(),beginParmEsrvFlag,PARM_ESRV_FLAG_LEN);
       localParmEsrvFlagCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkParmEsrvFlagConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshParmEsrvFlag is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshParmEsrvFlag() {	 
   		return (substring(getStringValue(),beginParmEsrvFlag,beginParmEsrvFlag + PARM_ESRV_FLAG_LEN));
   	}




}
  
