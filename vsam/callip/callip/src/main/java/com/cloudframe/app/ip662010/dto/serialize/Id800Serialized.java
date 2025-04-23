package com.cloudframe.app.ip662010.dto.serialize;

/**
*  The class Id800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:59. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Id800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Id800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int ID_800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginType800;
            protected  int beginNo800;
	
	/**
	* Constructor for Id800Serialized
	**/
    public Id800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Id800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Id800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Id800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this Id800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in Id800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(ID_800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginType800 = getStartOffset() + 0;	// set offset for serialization
  
             beginNo800 = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localType800Counter = -1;
         public boolean isType800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localType800Counter != sharedCounter;
            localType800Counter = sharedCounter; return hasModified; 
         }
   protected static final int TYPE_800_LEN = 2;
  	/**
	 * serializeType800
	 */
	protected void serializeType800(short type800) {
           replaceValue( //  save the value as string
                   getBinaryString( type800,TYPE_800_LEN)
                  ,beginType800
                  ,TYPE_800_LEN
                 );
            localType800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkType800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshType800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshType800() {	 
			return (getShort(beginType800));
   	}
         int localNo800Counter = -1;
         public boolean isNo800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localNo800Counter != sharedCounter;
            localNo800Counter = sharedCounter; return hasModified; 
         }
   protected static final int NO_800_LEN = 2;
  	/**
	 * serializeNo800
	 */
	protected void serializeNo800(short no800) {
           replaceValue( //  save the value as string
                   getBinaryString( no800,NO_800_LEN)
                  ,beginNo800
                  ,NO_800_LEN
                 );
            localNo800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkNo800MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshNo800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshNo800() {	 
			return (getShort(beginNo800));
   	}




}
  
