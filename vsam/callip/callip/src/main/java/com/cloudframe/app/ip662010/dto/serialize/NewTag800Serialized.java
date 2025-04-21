package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class NewTag800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class NewTag800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(NewTag800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int NEW_TAG_800_LENGTH = 11;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginNewType800;
            protected  int beginNewNo800;
            protected  int beginNewSubfldNo800;
            protected  int beginNewStart800;
            protected  int beginNewLength800;
            protected  int beginNewStatus800;
	
	/**
	* Constructor for NewTag800Serialized
	**/
    public NewTag800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in NewTag800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(NEW_TAG_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginNewType800 = getStartOffset() + 0;	// set offset for serialization
  
             beginNewNo800 = getStartOffset() + 2;	// set offset for serialization
  
             beginNewSubfldNo800 = getStartOffset() + 4;	// set offset for serialization
  
             beginNewStart800 = getStartOffset() + 6;	// set offset for serialization
  
             beginNewLength800 = getStartOffset() + 8;	// set offset for serialization
  
             beginNewStatus800 = getStartOffset() + 10;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localNewType800Counter = -1;
         public boolean isNewType800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNewType800Counter != sharedCounter;
            localNewType800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NEW_TYPE_800_LEN = 2;
  	/**
	 * serializeNewType800
	 */
	protected void serializeNewType800(short newType800) {
           replaceValue( //  save the value as string
                   getBinaryString( newType800,NEW_TYPE_800_LEN)
                  ,beginNewType800
                  ,NEW_TYPE_800_LEN
                 );
            localNewType800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNewType800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNewType800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNewType800() {	 
			return (getShort(beginNewType800));
   	}
         int localNewNo800Counter = -1;
         public boolean isNewNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNewNo800Counter != sharedCounter;
            localNewNo800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NEW_NO_800_LEN = 2;
  	/**
	 * serializeNewNo800
	 */
	protected void serializeNewNo800(short newNo800) {
           replaceValue( //  save the value as string
                   getBinaryString( newNo800,NEW_NO_800_LEN)
                  ,beginNewNo800
                  ,NEW_NO_800_LEN
                 );
            localNewNo800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNewNo800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNewNo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNewNo800() {	 
			return (getShort(beginNewNo800));
   	}
         int localNewSubfldNo800Counter = -1;
         public boolean isNewSubfldNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNewSubfldNo800Counter != sharedCounter;
            localNewSubfldNo800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NEW_SUBFLD_NO_800_LEN = 2;
  	/**
	 * serializeNewSubfldNo800
	 */
	protected void serializeNewSubfldNo800(short newSubfldNo800) {
           replaceValue( //  save the value as string
                   getBinaryString( newSubfldNo800,NEW_SUBFLD_NO_800_LEN)
                  ,beginNewSubfldNo800
                  ,NEW_SUBFLD_NO_800_LEN
                 );
            localNewSubfldNo800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNewSubfldNo800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNewSubfldNo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNewSubfldNo800() {	 
			return (getShort(beginNewSubfldNo800));
   	}
         int localNewStart800Counter = -1;
         public boolean isNewStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNewStart800Counter != sharedCounter;
            localNewStart800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NEW_START_800_LEN = 2;
  	/**
	 * serializeNewStart800
	 */
	protected void serializeNewStart800(short newStart800) {
           replaceValue( //  save the value as string
                   getBinaryString( newStart800,NEW_START_800_LEN)
                  ,beginNewStart800
                  ,NEW_START_800_LEN
                 );
            localNewStart800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNewStart800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNewStart800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNewStart800() {	 
			return (getShort(beginNewStart800));
   	}
         int localNewLength800Counter = -1;
         public boolean isNewLength800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNewLength800Counter != sharedCounter;
            localNewLength800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NEW_LENGTH_800_LEN = 2;
  	/**
	 * serializeNewLength800
	 */
	protected void serializeNewLength800(short newLength800) {
           replaceValue( //  save the value as string
                   getBinaryString( newLength800,NEW_LENGTH_800_LEN)
                  ,beginNewLength800
                  ,NEW_LENGTH_800_LEN
                 );
            localNewLength800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNewLength800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNewLength800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNewLength800() {	 
			return (getShort(beginNewLength800));
   	}
     int localNewStatus800Counter = -1;
     public boolean isNewStatus800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localNewStatus800Counter != sharedCounter;
         localNewStatus800Counter = sharedCounter; return hasModified;
     }
	protected static final int NEW_STATUS_800_LEN = 1;
	/**
	 * 	serialize this NewStatus800
	 */
   protected void serializeNewStatus800(char[] newStatus800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(newStatus800,0,getStringValue(),beginNewStatus800,NEW_STATUS_800_LEN);
       localNewStatus800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkNewStatus800Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
    /**
	 *	refreshNewStatus800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshNewStatus800() {	 
   		return (substring(getStringValue(),beginNewStatus800,beginNewStatus800 + NEW_STATUS_800_LEN));
   	}




}
  
