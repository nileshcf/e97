package com.cloudframe.app.db2funci.dto.serialize;

/**
*  The class MsdOtherExchangeSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:25. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class MsdOtherExchangeSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(MsdOtherExchangeSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int MSD_OTHER_EXCHANGE_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginMsdOthExch;
           protected static final int MSD_OTH_EXCH_SIZE = 4;
	
	/**
	* Constructor for MsdOtherExchangeSerialized
	**/
    public MsdOtherExchangeSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for MsdOtherExchangeSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdOtherExchangeSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this MsdOtherExchangeSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,736); // serialize this field at offset 736 by default 
    }
    
	/**
	* sets parent for this MsdOtherExchangeSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 736 by default
    }    
	/**
	* initializes the field in MsdOtherExchangeSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(MSD_OTHER_EXCHANGE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginMsdOthExch = getStartOffset() + 0; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int MSD_OTH_EXCH_LEN = 1;
   /**
	 *	serializeMsdOthExch as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeMsdOthExch(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginMsdOthExch + index*MSD_OTH_EXCH_LEN)
   	          , MSD_OTH_EXCH_LEN 
   	          );
   }

		public int msdOthExchSize() {
			return MSD_OTH_EXCH_SIZE;
		}



}
  
