package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Pgm4Parm2GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:15. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pgm4Parm2GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pgm4Parm2GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_4_PARM_2_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgm4Parm2;
	
	/**
	* Constructor for Pgm4Parm2GroupSerialized
	**/
    public Pgm4Parm2GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pgm4Parm2GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm2GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pgm4Parm2GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,8); // serialize this field at offset 8 by default 
    }
    
	/**
	* sets parent for this Pgm4Parm2GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 8 by default
    }    
	/**
	* initializes the field in Pgm4Parm2GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_4_PARM_2_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgm4Parm2 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localPgm4Parm2Counter = -1;
         public boolean isPgm4Parm2Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPgm4Parm2Counter != sharedCounter;
            localPgm4Parm2Counter = sharedCounter; return hasModified; 
         }
   protected static final int PGM_4_PARM_2_LEN = 2;
  	/**
	 * serializePgm4Parm2
	 */
	protected void serializePgm4Parm2(short pgm4Parm2) {
           replaceValue( //  save the value as string
                   getBinaryString( pgm4Parm2,PGM_4_PARM_2_LEN)
                  ,beginPgm4Parm2
                  ,PGM_4_PARM_2_LEN
                 );
            localPgm4Parm2Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPgm4Parm2MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPgm4Parm2 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPgm4Parm2() {	 
			return (getShort(beginPgm4Parm2));
   	}




}
  
