package com.cloudframe.app.init1.dto.serialize;

/**
*  The class BiypInitSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:30. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BiypInitSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BiypInitSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BIYP_INIT_LENGTH = 52;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginFillerc;
	
	/**
	* Constructor for BiypInitSerialized
	**/
    public BiypInitSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BiypInitSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BiypInitSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BiypInitSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BiypInitSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BiypInitSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BIYP_INIT_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginFillerc = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localFillercCounter = -1;
         public boolean isFillercModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localFillercCounter != sharedCounter;
            localFillercCounter = sharedCounter; return hasModified; 
         }
   protected static final int FILLERC_LEN = 4;
  	/**
	 * serializeFillerc
	 */
	protected void serializeFillerc(int fillerc) {
           replaceValue( //  save the value as string
                   getBinaryString( fillerc,FILLERC_LEN)
                  ,beginFillerc
                  ,FILLERC_LEN
                 );
            localFillercCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkFillercMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshFillerc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshFillerc() {	 
			return (getInt(beginFillerc));
   	}




}
  
