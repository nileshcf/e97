package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class EnvArea800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class EnvArea800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(EnvArea800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ENV_AREA_800_LENGTH = 80;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginEnvironmentInd800;
            protected  int beginFiller800;
	
	/**
	* Constructor for EnvArea800Serialized
	**/
    public EnvArea800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in EnvArea800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ENV_AREA_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginEnvironmentInd800 = getStartOffset() + 0;	// set offset for serialization
  
             beginFiller800 = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localEnvironmentInd800Counter = -1;
     public boolean isEnvironmentInd800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localEnvironmentInd800Counter != sharedCounter;
         localEnvironmentInd800Counter = sharedCounter; return hasModified;
     }
	protected static final int ENVIRONMENT_IND_800_LEN = 3;
	/**
	 * 	serialize this EnvironmentInd800
	 */
   protected void serializeEnvironmentInd800(char[] environmentInd800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(environmentInd800,0,getStringValue(),beginEnvironmentInd800,ENVIRONMENT_IND_800_LEN);
       localEnvironmentInd800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkEnvironmentInd800Constraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshEnvironmentInd800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshEnvironmentInd800() {	 
   		return (substring(getStringValue(),beginEnvironmentInd800,beginEnvironmentInd800 + ENVIRONMENT_IND_800_LEN));
   	}
     int localFiller800Counter = -1;
     public boolean isFiller800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFiller800Counter != sharedCounter;
         localFiller800Counter = sharedCounter; return hasModified;
     }
	protected static final int FILLER_800_LEN = 77;
	/**
	 * 	serialize this Filler800
	 */
   protected void serializeFiller800(char[] filler800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(filler800,0,getStringValue(),beginFiller800,FILLER_800_LEN);
       localFiller800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkFiller800Constraints(char[] value) {
   			return super.checkConstraints(value , 77 ,false, false);
   }
    /**
	 *	refreshFiller800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshFiller800() {	 
   		return (substring(getStringValue(),beginFiller800,beginFiller800 + FILLER_800_LEN));
   	}




}
  
