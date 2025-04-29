package com.cloudframe.app.varchar1.dto.serialize;

/**
*  The class Vchar1TableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Vchar1TableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Vchar1TableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int VCHAR_1_TABLE_LENGTH = 51;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginVchar1Id;
            protected  int beginVchar1LastName;
	
	/**
	* Constructor for Vchar1TableSerialized
	**/
    public Vchar1TableSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Vchar1TableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(VCHAR_1_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginVchar1Id = getStartOffset() + 0;	// set offset for serialization
  
  
             beginVchar1LastName = getStartOffset() + 19;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localVchar1IdCounter = -1;
         public boolean isVchar1IdModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localVchar1IdCounter != sharedCounter;
            localVchar1IdCounter = sharedCounter; return hasModified; 
         }
   protected static final int VCHAR_1_ID_LEN = 2;
  	/**
	 * serializeVchar1Id
	 */
	protected void serializeVchar1Id(short vchar1Id) {
           replaceValue( //  save the value as string
                   getBinaryString( vchar1Id,VCHAR_1_ID_LEN)
                  ,beginVchar1Id
                  ,VCHAR_1_ID_LEN
                 );
            localVchar1IdCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkVchar1IdMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshVchar1Id is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshVchar1Id() {	 
			return (getShort(beginVchar1Id));
   	}
     int localVchar1LastNameCounter = -1;
     public boolean isVchar1LastNameModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localVchar1LastNameCounter != sharedCounter;
         localVchar1LastNameCounter = sharedCounter; return hasModified;
     }
	protected static final int VCHAR_1_LAST_NAME_LEN = 15;
	/**
	 * 	serialize this Vchar1LastName
	 */
   protected void serializeVchar1LastName(char[] vchar1LastName) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(vchar1LastName,0,getStringValue(),beginVchar1LastName,VCHAR_1_LAST_NAME_LEN);
       localVchar1LastNameCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkVchar1LastNameConstraints(char[] value) {
   			return super.checkConstraints(value , 15 ,false, false);
   }
    /**
	 *	refreshVchar1LastName is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshVchar1LastName() {	 
   		return (substring(getStringValue(),beginVchar1LastName,beginVchar1LastName + VCHAR_1_LAST_NAME_LEN));
   	}




}
  
