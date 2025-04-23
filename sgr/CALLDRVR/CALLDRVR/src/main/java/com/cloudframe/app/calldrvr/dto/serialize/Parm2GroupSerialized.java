package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Parm2GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:13. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Parm2GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Parm2GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PARM_2_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginParm2;
	
	/**
	* Constructor for Parm2GroupSerialized
	**/
    public Parm2GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Parm2GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Parm2GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Parm2GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this Parm2GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in Parm2GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PARM_2_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginParm2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localParm2Counter = -1;
         public boolean isParm2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localParm2Counter != sharedCounter;
            localParm2Counter = sharedCounter; return hasModified; 
         }
   protected static final int PARM_2_LEN = 2;
  	/**
	 * serializeParm2
	 */
	protected void serializeParm2(short parm2) {
           replaceValue( //  save the value as string
                   getBinaryString( parm2,PARM_2_LEN)
                  ,beginParm2
                  ,PARM_2_LEN
                 );
            localParm2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkParm2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshParm2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshParm2() {	 
			return (getShort(beginParm2));
   	}




}
  
