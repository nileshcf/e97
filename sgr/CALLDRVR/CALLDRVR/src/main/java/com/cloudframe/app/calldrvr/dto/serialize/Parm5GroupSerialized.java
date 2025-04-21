package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Parm5GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 11:09. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parm5GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parm5GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_5_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParm5;
	
	/**
	* Constructor for Parm5GroupSerialized
	**/
    public Parm5GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parm5GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm5GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parm5GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21); // serialize this field at offset 21 by default 
    }
    
	/**
	* sets parent for this Parm5GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21 by default
    }    
	/**
	* initializes the field in Parm5GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_5_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParm5 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localParm5Counter = -1;
         public boolean isParm5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParm5Counter != sharedCounter;
            localParm5Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_5_LEN = 2;
  	/**
	 * serializeParm5
	 */
	protected void serializeParm5(short parm5) {
           replaceValue( //  save the value as string
                   getBinaryString( parm5,PARM_5_LEN)
                  ,beginParm5
                  ,PARM_5_LEN
                 );
            localParm5Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParm5MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParm5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParm5() {	 
			return (getShort(beginParm5));
   	}




}
  
