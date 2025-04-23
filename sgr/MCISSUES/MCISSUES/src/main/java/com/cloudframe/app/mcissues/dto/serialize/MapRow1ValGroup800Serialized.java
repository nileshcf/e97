package com.cloudframe.app.mcissues.dto.serialize;

/**
*  The class MapRow1ValGroup800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MapRow1ValGroup800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MapRow1ValGroup800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MAP_ROW_1_VAL_GROUP_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginMapRow1Val800;
            protected  int beginMapRow1800;
	
	/**
	* Constructor for MapRow1ValGroup800Serialized
	**/
    public MapRow1ValGroup800Serialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in MapRow1ValGroup800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MAP_ROW_1_VAL_GROUP_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginMapRow1Val800 = getStartOffset() + 0;	// set offset for serialization
  
             beginMapRow1800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localMapRow1Val800Counter = -1;
         public boolean isMapRow1Val800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMapRow1Val800Counter != sharedCounter;
            localMapRow1Val800Counter = sharedCounter; return hasModified; 
         }
   protected static final int MAP_ROW_1_VAL_800_LEN = 4;
  	/**
	 * serializeMapRow1Val800
	 */
	protected void serializeMapRow1Val800(int mapRow1Val800) {
           replaceValue( //  save the value as string
                   getBinaryString( mapRow1Val800,MAP_ROW_1_VAL_800_LEN)
                  ,beginMapRow1Val800
                  ,MAP_ROW_1_VAL_800_LEN
                 );
            localMapRow1Val800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMapRow1Val800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMapRow1Val800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMapRow1Val800() {	 
			return (getInt(beginMapRow1Val800));
   	}
         int localMapRow1800Counter = -1;
         public boolean isMapRow1800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localMapRow1800Counter != sharedCounter;
            localMapRow1800Counter = sharedCounter; return hasModified; 
         }
   protected static final int MAP_ROW_1800_LEN = 4;
  	/**
	 * serializeMapRow1800
	 */
	protected void serializeMapRow1800(int mapRow1800) {
           replaceValue( //  save the value as string
                   getBinaryString( mapRow1800,MAP_ROW_1800_LEN)
                  ,beginMapRow1800
                  ,MAP_ROW_1800_LEN
                 );
            localMapRow1800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkMapRow1800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshMapRow1800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshMapRow1800() {	 
			return (getInt(beginMapRow1800));
   	}




}
  
