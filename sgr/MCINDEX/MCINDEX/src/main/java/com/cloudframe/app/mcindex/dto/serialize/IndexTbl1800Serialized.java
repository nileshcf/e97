package com.cloudframe.app.mcindex.dto.serialize;

/**
*  The class IndexTbl1800Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:27. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class IndexTbl1800Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(IndexTbl1800Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int INDEX_TBL_1800_LENGTH = 4;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginZeroIdx5800;
	
	/**
	* Constructor for IndexTbl1800Serialized
	**/
    public IndexTbl1800Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for IndexTbl1800Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public IndexTbl1800Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this IndexTbl1800Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,40); // serialize this field at offset 40 by default 
    }
    
	/**
	* sets parent for this IndexTbl1800Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 40 by default
    }    
	/**
	* initializes the field in IndexTbl1800Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(INDEX_TBL_1800_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginZeroIdx5800 = getStartOffset() + 0;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localZeroIdx5800Counter = -1;
         public boolean isZeroIdx5800Modified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localZeroIdx5800Counter != sharedCounter;
            localZeroIdx5800Counter = sharedCounter; return hasModified; 
         }
   protected static final int ZERO_IDX_5800_LEN = 4;
  	/**
	 * serializeZeroIdx5800
	 */
	protected void serializeZeroIdx5800(int zeroIdx5800) {
           replaceValue( //  save the value as string
                   getBinaryString( zeroIdx5800,ZERO_IDX_5800_LEN)
                  ,beginZeroIdx5800
                  ,ZERO_IDX_5800_LEN
                 );
            localZeroIdx5800Counter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected int checkZeroIdx5800MaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     /**
	 *	refreshZeroIdx5800 is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshZeroIdx5800() {	 
			return (getInt(beginZeroIdx5800));
   	}




}
  
