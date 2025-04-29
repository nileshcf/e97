package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class ResultFill800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:28. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ResultFill800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ResultFill800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int RESULT_FILL_800_LENGTH = 8;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginResultFillStart800;
            protected  int beginResultFillCount800;
	
	/**
	* Constructor for ResultFill800Serialized
	**/
    public ResultFill800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ResultFill800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ResultFill800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ResultFill800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,1401); // serialize this field at offset 1401 by default 
    }
    
	/**
	* sets parent for this ResultFill800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 1401 by default
    }    
	/**
	* initializes the field in ResultFill800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(RESULT_FILL_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginResultFillStart800 = getStartOffset() + 0;	// set offset for serialization
  
             beginResultFillCount800 = getStartOffset() + 4;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localResultFillStart800Counter = -1;
         public boolean isResultFillStart800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localResultFillStart800Counter != sharedCounter;
            localResultFillStart800Counter = sharedCounter; return hasModified; 
         }
   protected static final int RESULT_FILL_START_800_LEN = 4;
  	/**
	 * serializeResultFillStart800
	 */
	protected void serializeResultFillStart800(int resultFillStart800) {
           replaceValue( //  save the value as string
                   getBinaryString( resultFillStart800,RESULT_FILL_START_800_LEN)
                  ,beginResultFillStart800
                  ,RESULT_FILL_START_800_LEN
                 );
            localResultFillStart800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkResultFillStart800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshResultFillStart800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshResultFillStart800() {	 
			return (getInt(beginResultFillStart800));
   	}
         int localResultFillCount800Counter = -1;
         public boolean isResultFillCount800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localResultFillCount800Counter != sharedCounter;
            localResultFillCount800Counter = sharedCounter; return hasModified; 
         }
   protected static final int RESULT_FILL_COUNT_800_LEN = 4;
  	/**
	 * serializeResultFillCount800
	 */
	protected void serializeResultFillCount800(int resultFillCount800) {
           replaceValue( //  save the value as string
                   getBinaryString( resultFillCount800,RESULT_FILL_COUNT_800_LEN)
                  ,beginResultFillCount800
                  ,RESULT_FILL_COUNT_800_LEN
                 );
            localResultFillCount800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkResultFillCount800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshResultFillCount800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshResultFillCount800() {	 
			return (getInt(beginResultFillCount800));
   	}




}
  
