package com.cloudframe.app.ip343900.dto.serialize;

/**
*  The class Ip28221PaTableRestartSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip28221PaTableRestartSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip28221PaTableRestartSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_28221_PA_TABLE_RESTART_LENGTH = 82;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp28221PaTableLength;
            protected  int beginIp28221Restart;
           protected int beginIp28221RestartTable;
           protected static final int IP_28221_RESTART_TABLE_SIZE = 10;
            protected  int beginIp28221Filler;
	
	/**
	* Constructor for Ip28221PaTableRestartSerialized
	**/
    public Ip28221PaTableRestartSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ip28221PaTableRestartSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_28221_PA_TABLE_RESTART_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp28221PaTableLength = getStartOffset() + 0;	// set offset for serialization
  
             beginIp28221Restart = getStartOffset() + 2;	// set offset for serialization
  
	        beginIp28221RestartTable = getStartOffset() + 3; // set offset for serialization
  
             beginIp28221Filler = getStartOffset() + 43;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localIp28221PaTableLengthCounter = -1;
         public boolean isIp28221PaTableLengthModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp28221PaTableLengthCounter != sharedCounter;
            localIp28221PaTableLengthCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_28221_PA_TABLE_LENGTH_LEN = 2;
  	/**
	 * serializeIp28221PaTableLength
	 */
	protected void serializeIp28221PaTableLength(short ip28221PaTableLength) {
           replaceValue( //  save the value as string
                   getBinaryString( ip28221PaTableLength,IP_28221_PA_TABLE_LENGTH_LEN)
                  ,beginIp28221PaTableLength
                  ,IP_28221_PA_TABLE_LENGTH_LEN
                 );
            localIp28221PaTableLengthCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp28221PaTableLengthMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp28221PaTableLength is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp28221PaTableLength() {	 
			return (getShort(beginIp28221PaTableLength));
   	}
     int localIp28221RestartCounter = -1;
     public boolean isIp28221RestartModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp28221RestartCounter != sharedCounter;
         localIp28221RestartCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_28221_RESTART_LEN = 1;
	/**
	 * 	serialize this Ip28221Restart
	 */
   protected void serializeIp28221Restart(char[] ip28221Restart) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip28221Restart,0,getStringValue(),beginIp28221Restart,IP_28221_RESTART_LEN);
       localIp28221RestartCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp28221RestartConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshIp28221Restart is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp28221Restart() {	 
   		return (substring(getStringValue(),beginIp28221Restart,beginIp28221Restart + IP_28221_RESTART_LEN));
   	}
     int localIp28221FillerCounter = -1;
     public boolean isIp28221FillerModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localIp28221FillerCounter != sharedCounter;
         localIp28221FillerCounter = sharedCounter; return hasModified;
     }
	protected static final int IP_28221_FILLER_LEN = 39;
	/**
	 * 	serialize this Ip28221Filler
	 */
   protected void serializeIp28221Filler(char[] ip28221Filler) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(ip28221Filler,0,getStringValue(),beginIp28221Filler,IP_28221_FILLER_LEN);
       localIp28221FillerCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkIp28221FillerConstraints(char[] value) {
   			return super.checkConstraints(value , 39 ,false, false);
   }
    /**
	 *	refreshIp28221Filler is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshIp28221Filler() {	 
   		return (substring(getStringValue(),beginIp28221Filler,beginIp28221Filler + IP_28221_FILLER_LEN));
   	}

		public int ip28221RestartTableSize() {
			return IP_28221_RESTART_TABLE_SIZE;
		}



}
  
