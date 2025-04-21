package com.cloudframe.app.sf311010.dto.serialize;

/**
*  The class BiaDataConv800RedefinedSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:07. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BiaDataConv800RedefinedSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BiaDataConv800RedefinedSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIA_DATA_CONV_800_REDEFINED_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginConvData800;
	
	/**
	* Constructor for BiaDataConv800RedefinedSerialized
	**/
    public BiaDataConv800RedefinedSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BiaDataConv800RedefinedSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiaDataConv800RedefinedSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BiaDataConv800RedefinedSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BiaDataConv800RedefinedSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BiaDataConv800RedefinedSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIA_DATA_CONV_800_REDEFINED_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginConvData800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localConvData800Counter = -1;
         public boolean isConvData800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localConvData800Counter != sharedCounter;
            localConvData800Counter = sharedCounter; return hasModified; 
         }
   protected static final int CONV_DATA_800_LEN = 2;
  	/**
	 * serializeConvData800
	 */
	protected void serializeConvData800(int convData800) {
           replaceValue( //  save the value as string
                   getBinaryString( convData800,CONV_DATA_800_LEN)
                  ,beginConvData800
                  ,CONV_DATA_800_LEN
                 );
            localConvData800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkConvData800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, false/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshConvData800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshConvData800() {	 
			return (getUnsignedShort(beginConvData800));
   	}




}
  
