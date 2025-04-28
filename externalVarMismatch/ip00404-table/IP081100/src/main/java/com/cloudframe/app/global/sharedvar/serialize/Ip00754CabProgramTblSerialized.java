package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip00754CabProgramTblSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:03. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip00754CabProgramTblSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip00754CabProgramTblSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_00754_CAB_PROGRAM_TBL_LENGTH = 5;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp00754CabProgram;
            protected  int beginIp00754CabPgmLifecycleInd;
	
	/**
	* Constructor for Ip00754CabProgramTblSerialized
	**/
    public Ip00754CabProgramTblSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip00754CabProgramTblSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip00754CabProgramTblSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip00754CabProgramTblSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,6); // serialize this field at offset 6 by default 
    }
    
	/**
	* sets parent for this Ip00754CabProgramTblSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 6 by default
    }    
	/**
	* initializes the field in Ip00754CabProgramTblSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_00754_CAB_PROGRAM_TBL_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp00754CabProgram = getStartOffset() + 0;	// set offset for serialization
  
             beginIp00754CabPgmLifecycleInd = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localIp00754CabProgramCounter = -1;
     public boolean isIp00754CabProgramModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00754CabProgramCounter != sharedCounter;
         localIp00754CabProgramCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00754_CAB_PROGRAM_LEN = 4;
	/**
	 * 	serialize this Ip00754CabProgram
	 */
   protected void serializeIp00754CabProgram(char[] ip00754CabProgram) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00754CabProgram,0,getStringValue(),beginIp00754CabProgram,IP_00754_CAB_PROGRAM_LEN);
       localIp00754CabProgramCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00754CabProgramConstraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshIp00754CabProgram is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00754CabProgram() {	 
   		return (substring(getStringValue(),beginIp00754CabProgram,beginIp00754CabProgram + IP_00754_CAB_PROGRAM_LEN));
   	}
     int localIp00754CabPgmLifecycleIndCounter = -1;
     public boolean isIp00754CabPgmLifecycleIndModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp00754CabPgmLifecycleIndCounter != sharedCounter;
         localIp00754CabPgmLifecycleIndCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_00754_CAB_PGM_LIFECYCLE_IND_LEN = 1;
	/**
	 * 	serialize this Ip00754CabPgmLifecycleInd
	 */
   protected void serializeIp00754CabPgmLifecycleInd(char[] ip00754CabPgmLifecycleInd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip00754CabPgmLifecycleInd,0,getStringValue(),beginIp00754CabPgmLifecycleInd,IP_00754_CAB_PGM_LIFECYCLE_IND_LEN);
       localIp00754CabPgmLifecycleIndCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp00754CabPgmLifecycleIndConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp00754CabPgmLifecycleInd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp00754CabPgmLifecycleInd() {	 
   		return (substring(getStringValue(),beginIp00754CabPgmLifecycleInd,beginIp00754CabPgmLifecycleInd + IP_00754_CAB_PGM_LIFECYCLE_IND_LEN));
   	}




}
  
