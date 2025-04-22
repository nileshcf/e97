package com.cloudframe.app.db2func.dto.serialize;

/**
*  The class ParmSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ParmSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ParmSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_LENGTH = 25;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParmLen01;
            protected  int beginUseSysin;
            protected  int beginCommand;
	
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
             beginParmLen01 = getStartOffset() + 0;	// set offset for serialization
  
             beginUseSysin = getStartOffset() + 2;	// set offset for serialization
  
  
             beginCommand = getStartOffset() + 4;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localParmLen01Counter = -1;
         public boolean isParmLen01Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParmLen01Counter != sharedCounter;
            localParmLen01Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_LEN_01_LEN = 2;
  	/**
	 * serializeParmLen01
	 */
	protected void serializeParmLen01(short parmLen01) {
           replaceValue( //  save the value as string
                   getBinaryString( parmLen01,PARM_LEN_01_LEN)
                  ,beginParmLen01
                  ,PARM_LEN_01_LEN
                 );
            localParmLen01Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParmLen01MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParmLen01 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParmLen01() {	 
			return (getShort(beginParmLen01));
   	}
     int localUseSysinCounter = -1;
     public boolean isUseSysinModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localUseSysinCounter != sharedCounter;
         localUseSysinCounter = sharedCounter; return hasModified;
     }
	protected static final int USE_SYSIN_LEN = 1;
	/**
	 * 	serialize this UseSysin
	 */
   protected void serializeUseSysin(char[] useSysin) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(useSysin,0,getStringValue(),beginUseSysin,USE_SYSIN_LEN);
       localUseSysinCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkUseSysinConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshUseSysin is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshUseSysin() {	 
   		return (substring(getStringValue(),beginUseSysin,beginUseSysin + USE_SYSIN_LEN));
   	}
     int localCommandCounter = -1;
     public boolean isCommandModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localCommandCounter != sharedCounter;
         localCommandCounter = sharedCounter; return hasModified;
     }
	protected static final int COMMAND_LEN = 20;
	/**
	 * 	serialize this Command
	 */
   protected void serializeCommand(char[] command) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(command,0,getStringValue(),beginCommand,COMMAND_LEN);
       localCommandCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkCommandConstraints(char[] value) {
   			return super.checkConstraints(value , 20 ,false, false);
   }
    /**
	 *	refreshCommand is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshCommand() {	 
   		return (substring(getStringValue(),beginCommand,beginCommand + COMMAND_LEN));
   	}




}
  
