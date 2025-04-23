package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip002102RecreateConvTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip002102RecreateConvTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip002102RecreateConvTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_002102_RECREATE_CONV_TABLE_LENGTH = 10504;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp002102RowCount;
           protected int beginIp002102TableData;
           protected static final int IP_002102_TABLE_DATA_SIZE = 500;
	
	/**
	* Constructor for Ip002102RecreateConvTableSerialized
	**/
    public Ip002102RecreateConvTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* initializes the field in Ip002102RecreateConvTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_002102_RECREATE_CONV_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp002102RowCount = getStartOffset() + 0;	// set offset for serialization
  
	        beginIp002102TableData = getStartOffset() + 4; // set offset for serialization
  
	   /*  end of offset */
	}
         int localIp002102RowCountCounter = -1;
         public boolean isIp002102RowCountModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp002102RowCountCounter != sharedCounter;
            localIp002102RowCountCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_002102_ROW_COUNT_LEN = 4;
  	/**
	 * serializeIp002102RowCount
	 */
	protected void serializeIp002102RowCount(int ip002102RowCount) {
           replaceValue( //  save the value as string
                   getBinaryString( ip002102RowCount,IP_002102_ROW_COUNT_LEN)
                  ,beginIp002102RowCount
                  ,IP_002102_ROW_COUNT_LEN
                 );
            localIp002102RowCountCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkIp002102RowCountMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshIp002102RowCount is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshIp002102RowCount() {	 
			return (getInt(beginIp002102RowCount));
   	}

		public int ip002102TableDataSize() {
			return IP_002102_TABLE_DATA_SIZE;
		}



     private int dependValue = 0;  
     
  	 public void setDependingValue(int dependValue) {
	   this.dependValue = dependValue;
  	 }

     public int getVariableLength() {
     	return 4 + (dependValue *  21);
     }
     
     public int getVariableLength(int idx) {
     	return 4 + (idx *  21);
     }
}
  
