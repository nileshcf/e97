package com.cloudframe.app.mcindex.dto.serialize;

/**
*  The class ZeroValGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:19. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ZeroValGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ZeroValGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ZERO_VAL_GROUP_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZeroVal800;
            protected  int beginZero800;
	
	/**
	* Constructor for ZeroValGroup800Serialized
	**/
    public ZeroValGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ZeroValGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ZERO_VAL_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginZeroVal800 = getStartOffset() + 0;	// set offset for serialization
  
             beginZero800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localZeroVal800Counter = -1;
         public boolean isZeroVal800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localZeroVal800Counter != sharedCounter;
            localZeroVal800Counter = sharedCounter; return hasModified; 
         }
   protected static final int ZERO_VAL_800_LEN = 4;
  	/**
	 * serializeZeroVal800
	 */
	protected void serializeZeroVal800(int zeroVal800) {
           replaceValue( //  save the value as string
                   getBinaryString( zeroVal800,ZERO_VAL_800_LEN)
                  ,beginZeroVal800
                  ,ZERO_VAL_800_LEN
                 );
            localZeroVal800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkZeroVal800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshZeroVal800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZeroVal800() {	 
			return (getInt(beginZeroVal800));
   	}
         int localZero800Counter = -1;
         public boolean isZero800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localZero800Counter != sharedCounter;
            localZero800Counter = sharedCounter; return hasModified; 
         }
   protected static final int ZERO_800_LEN = 4;
  	/**
	 * serializeZero800
	 */
	protected void serializeZero800(int zero800) {
           replaceValue( //  save the value as string
                   getBinaryString( zero800,ZERO_800_LEN)
                  ,beginZero800
                  ,ZERO_800_LEN
                 );
            localZero800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkZero800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshZero800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZero800() {	 
			return (getInt(beginZero800));
   	}




}
  
