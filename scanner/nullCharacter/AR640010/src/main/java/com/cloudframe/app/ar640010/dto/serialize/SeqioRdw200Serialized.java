package com.cloudframe.app.ar640010.dto.serialize;

/**
*  The class SeqioRdw200Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class SeqioRdw200Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(SeqioRdw200Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int SEQIO_RDW_200_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginSeqioLrecl200;
	
	/**
	* Constructor for SeqioRdw200Serialized
	**/
    public SeqioRdw200Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for SeqioRdw200Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public SeqioRdw200Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this SeqioRdw200Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this SeqioRdw200Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in SeqioRdw200Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(SEQIO_RDW_200_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginSeqioLrecl200 = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localSeqioLrecl200Counter = -1;
         public boolean isSeqioLrecl200Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSeqioLrecl200Counter != sharedCounter;
            localSeqioLrecl200Counter = sharedCounter; return hasModified; 
         }
   protected static final int SEQIO_LRECL_200_LEN = 2;
  	/**
	 * serializeSeqioLrecl200
	 */
	protected void serializeSeqioLrecl200(short seqioLrecl200) {
           replaceValue( //  save the value as string
                   getBinaryString( seqioLrecl200,SEQIO_LRECL_200_LEN)
                  ,beginSeqioLrecl200
                  ,SEQIO_LRECL_200_LEN
                 );
            localSeqioLrecl200Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkSeqioLrecl200MaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshSeqioLrecl200 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshSeqioLrecl200() {	 
			return (getShort(beginSeqioLrecl200));
   	}




}
  
