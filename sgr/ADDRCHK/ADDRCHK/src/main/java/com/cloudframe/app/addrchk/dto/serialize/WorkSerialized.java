package com.cloudframe.app.addrchk.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:10. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 12;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPrimvar1;
            protected  int beginPrimvar2;
            protected  int beginPrimvar3;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPrimvar1 = getStartOffset() + 0;	// set offset for serialization
  
             beginPrimvar2 = getStartOffset() + 4;	// set offset for serialization
  
             beginPrimvar3 = getStartOffset() + 8;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localPrimvar1Counter = -1;
     public boolean isPrimvar1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimvar1Counter != sharedCounter;
         localPrimvar1Counter = sharedCounter; return hasModified; 
     }
   protected static final int PRIMVAR_1_LEN = 4;
  	/**
	 * serializePrimvar1
	 */
	protected void serializePrimvar1(int primvar1) {
           replaceValue( //  save the value as string
                   getBinaryString( primvar1,PRIMVAR_1_LEN)
                  ,beginPrimvar1
                  ,PRIMVAR_1_LEN
                 );
            localPrimvar1Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPrimvar1MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPrimvar1 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPrimvar1() {	 
			return (getInt(beginPrimvar1));
   	}
     int localPrimvar2Counter = -1;
     public boolean isPrimvar2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimvar2Counter != sharedCounter;
         localPrimvar2Counter = sharedCounter; return hasModified; 
     }
   protected static final int PRIMVAR_2_LEN = 4;
  	/**
	 * serializePrimvar2
	 */
	protected void serializePrimvar2(int primvar2) {
           replaceValue( //  save the value as string
                   getBinaryString( primvar2,PRIMVAR_2_LEN)
                  ,beginPrimvar2
                  ,PRIMVAR_2_LEN
                 );
            localPrimvar2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPrimvar2MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPrimvar2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPrimvar2() {	 
			return (getInt(beginPrimvar2));
   	}
     int localPrimvar3Counter = -1;
     public boolean isPrimvar3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localPrimvar3Counter != sharedCounter;
         localPrimvar3Counter = sharedCounter; return hasModified; 
     }
   protected static final int PRIMVAR_3_LEN = 4;
  	/**
	 * serializePrimvar3
	 */
	protected void serializePrimvar3(int primvar3) {
           replaceValue( //  save the value as string
                   getBinaryString( primvar3,PRIMVAR_3_LEN)
                  ,beginPrimvar3
                  ,PRIMVAR_3_LEN
                 );
            localPrimvar3Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkPrimvar3MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshPrimvar3 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshPrimvar3() {	 
			return (getInt(beginPrimvar3));
   	}




}
  
