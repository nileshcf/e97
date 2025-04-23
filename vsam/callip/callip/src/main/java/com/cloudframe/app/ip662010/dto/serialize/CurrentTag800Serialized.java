package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class CurrentTag800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class CurrentTag800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(CurrentTag800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int CURRENT_TAG_800_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSubfldNo800;
            protected  int beginStart800;
            protected  int beginLength800;
	
	/**
	* Constructor for CurrentTag800Serialized
	**/
    public CurrentTag800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in CurrentTag800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(CURRENT_TAG_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginSubfldNo800 = getStartOffset() + 4;	// set offset for serialization
  
             beginStart800 = getStartOffset() + 6;	// set offset for serialization
  
             beginLength800 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localSubfldNo800Counter = -1;
         public boolean isSubfldNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSubfldNo800Counter != sharedCounter;
            localSubfldNo800Counter = sharedCounter; return hasModified; 
         }
   protected static final int SUBFLD_NO_800_LEN = 2;
  	/**
	 * serializeSubfldNo800
	 */
	protected void serializeSubfldNo800(short subfldNo800) {
           replaceValue( //  save the value as string
                   getBinaryString( subfldNo800,SUBFLD_NO_800_LEN)
                  ,beginSubfldNo800
                  ,SUBFLD_NO_800_LEN
                 );
            localSubfldNo800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSubfldNo800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSubfldNo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSubfldNo800() {	 
			return (getShort(beginSubfldNo800));
   	}
         int localStart800Counter = -1;
         public boolean isStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localStart800Counter != sharedCounter;
            localStart800Counter = sharedCounter; return hasModified; 
         }
   protected static final int START_800_LEN = 2;
  	/**
	 * serializeStart800
	 */
	protected void serializeStart800(short start800) {
           replaceValue( //  save the value as string
                   getBinaryString( start800,START_800_LEN)
                  ,beginStart800
                  ,START_800_LEN
                 );
            localStart800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkStart800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshStart800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshStart800() {	 
			return (getShort(beginStart800));
   	}
         int localLength800Counter = -1;
         public boolean isLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLength800Counter != sharedCounter;
            localLength800Counter = sharedCounter; return hasModified; 
         }
   protected static final int LENGTH_800_LEN = 2;
  	/**
	 * serializeLength800
	 */
	protected void serializeLength800(short length800) {
           replaceValue( //  save the value as string
                   getBinaryString( length800,LENGTH_800_LEN)
                  ,beginLength800
                  ,LENGTH_800_LEN
                 );
            localLength800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLength800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLength800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLength800() {	 
			return (getShort(beginLength800));
   	}




}
  
