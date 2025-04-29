package com.cloudframe.app.ip343690.dto.serialize;

/**
*  The class AbendCode800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class AbendCode800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(AbendCode800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ABEND_CODE_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginAbend800;
	
	/**
	* Constructor for AbendCode800Serialized
	**/
    public AbendCode800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for AbendCode800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public AbendCode800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this AbendCode800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,4); // serialize this field at offset 4 by default 
    }
    
	/**
	* sets parent for this AbendCode800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 4 by default
    }    
	/**
	* initializes the field in AbendCode800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ABEND_CODE_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
             beginAbend800 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localAbend800Counter = -1;
         public boolean isAbend800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localAbend800Counter != sharedCounter;
            localAbend800Counter = sharedCounter; return hasModified; 
         }
   protected static final int ABEND_800_LEN = 2;
  	/**
	 * serializeAbend800
	 */
	protected void serializeAbend800(short abend800) {
           replaceValue( //  save the value as string
                   getBinaryString( abend800,ABEND_800_LEN)
                  ,beginAbend800
                  ,ABEND_800_LEN
                 );
            localAbend800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkAbend800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshAbend800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshAbend800() {	 
			return (getShort(beginAbend800));
   	}




}
  
