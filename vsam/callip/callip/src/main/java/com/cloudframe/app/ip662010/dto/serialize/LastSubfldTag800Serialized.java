package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class LastSubfldTag800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:01. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class LastSubfldTag800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(LastSubfldTag800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int LAST_SUBFLD_TAG_800_LENGTH = 10;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginLastSubId800;
            protected  int beginLastSubfldNo800;
            protected  int beginLastSubStart800;
            protected  int beginLastSubLngth800;
	
	/**
	* Constructor for LastSubfldTag800Serialized
	**/
    public LastSubfldTag800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in LastSubfldTag800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(LAST_SUBFLD_TAG_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginLastSubId800 = getStartOffset() + 0;	// set offset for serialization
  
             beginLastSubfldNo800 = getStartOffset() + 4;	// set offset for serialization
  
             beginLastSubStart800 = getStartOffset() + 6;	// set offset for serialization
  
             beginLastSubLngth800 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localLastSubId800Counter = -1;
     public boolean isLastSubId800Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLastSubId800Counter != sharedCounter;
         localLastSubId800Counter = sharedCounter; return hasModified;
     }
	protected static final int LAST_SUB_ID_800_LEN = 4;
	/**
	 * 	serialize this LastSubId800
	 */
   protected void serializeLastSubId800(char[] lastSubId800) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(lastSubId800,0,getStringValue(),beginLastSubId800,LAST_SUB_ID_800_LEN);
       localLastSubId800Counter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkLastSubId800Constraints(char[] value) {
   			return super.checkConstraints(value , 4 ,false, false);
   }
    /**
	 *	refreshLastSubId800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshLastSubId800() {	 
   		return (substring(getStringValue(),beginLastSubId800,beginLastSubId800 + LAST_SUB_ID_800_LEN));
   	}
         int localLastSubfldNo800Counter = -1;
         public boolean isLastSubfldNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLastSubfldNo800Counter != sharedCounter;
            localLastSubfldNo800Counter = sharedCounter; return hasModified; 
         }
   protected static final int LAST_SUBFLD_NO_800_LEN = 2;
  	/**
	 * serializeLastSubfldNo800
	 */
	protected void serializeLastSubfldNo800(short lastSubfldNo800) {
           replaceValue( //  save the value as string
                   getBinaryString( lastSubfldNo800,LAST_SUBFLD_NO_800_LEN)
                  ,beginLastSubfldNo800
                  ,LAST_SUBFLD_NO_800_LEN
                 );
            localLastSubfldNo800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLastSubfldNo800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLastSubfldNo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLastSubfldNo800() {	 
			return (getShort(beginLastSubfldNo800));
   	}
         int localLastSubStart800Counter = -1;
         public boolean isLastSubStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLastSubStart800Counter != sharedCounter;
            localLastSubStart800Counter = sharedCounter; return hasModified; 
         }
   protected static final int LAST_SUB_START_800_LEN = 2;
  	/**
	 * serializeLastSubStart800
	 */
	protected void serializeLastSubStart800(short lastSubStart800) {
           replaceValue( //  save the value as string
                   getBinaryString( lastSubStart800,LAST_SUB_START_800_LEN)
                  ,beginLastSubStart800
                  ,LAST_SUB_START_800_LEN
                 );
            localLastSubStart800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLastSubStart800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLastSubStart800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLastSubStart800() {	 
			return (getShort(beginLastSubStart800));
   	}
         int localLastSubLngth800Counter = -1;
         public boolean isLastSubLngth800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localLastSubLngth800Counter != sharedCounter;
            localLastSubLngth800Counter = sharedCounter; return hasModified; 
         }
   protected static final int LAST_SUB_LNGTH_800_LEN = 2;
  	/**
	 * serializeLastSubLngth800
	 */
	protected void serializeLastSubLngth800(short lastSubLngth800) {
           replaceValue( //  save the value as string
                   getBinaryString( lastSubLngth800,LAST_SUB_LNGTH_800_LEN)
                  ,beginLastSubLngth800
                  ,LAST_SUB_LNGTH_800_LEN
                 );
            localLastSubLngth800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkLastSubLngth800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshLastSubLngth800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshLastSubLngth800() {	 
			return (getShort(beginLastSubLngth800));
   	}




}
  
