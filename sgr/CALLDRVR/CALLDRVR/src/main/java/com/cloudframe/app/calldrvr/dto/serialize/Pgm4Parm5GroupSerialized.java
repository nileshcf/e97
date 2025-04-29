package com.cloudframe.app.calldrvr.dto.serialize;

/**
*  The class Pgm4Parm5GroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:31. using version 5.0.0.257
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Pgm4Parm5GroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Pgm4Parm5GroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PGM_4_PARM_5_GROUP_LENGTH = 2;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginPgm4Parm5;
	
	/**
	* Constructor for Pgm4Parm5GroupSerialized
	**/
    public Pgm4Parm5GroupSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Pgm4Parm5GroupSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Pgm4Parm5GroupSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Pgm4Parm5GroupSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,21); // serialize this field at offset 21 by default 
    }
    
	/**
	* sets parent for this Pgm4Parm5GroupSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 21 by default
    }    
	/**
	* initializes the field in Pgm4Parm5GroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PGM_4_PARM_5_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginPgm4Parm5 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localPgm4Parm5Counter = -1;
         public boolean isPgm4Parm5Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPgm4Parm5Counter != sharedCounter;
            localPgm4Parm5Counter = sharedCounter; return hasModified; 
         }
   protected static final int PGM_4_PARM_5_LEN = 2;
  	/**
	 * serializePgm4Parm5
	 */
	protected void serializePgm4Parm5(short pgm4Parm5) {
           replaceValue( //  save the value as string
                   getBinaryString( pgm4Parm5,PGM_4_PARM_5_LEN)
                  ,beginPgm4Parm5
                  ,PGM_4_PARM_5_LEN
                 );
            localPgm4Parm5Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkPgm4Parm5MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshPgm4Parm5 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshPgm4Parm5() {	 
			return (getShort(beginPgm4Parm5));
   	}




}
  
