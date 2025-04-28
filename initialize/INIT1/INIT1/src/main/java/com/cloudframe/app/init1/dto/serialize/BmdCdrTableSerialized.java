package com.cloudframe.app.init1.dto.serialize;

/**
*  The class BmdCdrTableSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:55. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class BmdCdrTableSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(BmdCdrTableSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int BMD_CDR_TABLE_LENGTH = 22;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTableCtr;
            protected  int beginTableNo;
	
	/**
	* Constructor for BmdCdrTableSerialized
	**/
    public BmdCdrTableSerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for BmdCdrTableSerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public BmdCdrTableSerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this BmdCdrTableSerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this BmdCdrTableSerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in BmdCdrTableSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(BMD_CDR_TABLE_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTableCtr = getStartOffset() + 0;	// set offset for serialization
  
             beginTableNo = getStartOffset() + 2;	// set offset for serialization
  
	   /*  end of offset */
	}
         int localTableCtrCounter = -1;
         public boolean isTableCtrModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTableCtrCounter != sharedCounter;
            localTableCtrCounter = sharedCounter; return hasModified; 
         }
   protected static final int TABLE_CTR_LEN = 2;
  	/**
	 * serializeTableCtr
	 */
	protected void serializeTableCtr(short tableCtr) {
           replaceValue( //  save the value as string
                   getBinaryString( tableCtr,TABLE_CTR_LEN)
                  ,beginTableCtr
                  ,TABLE_CTR_LEN
                 );
            localTableCtrCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTableCtrMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTableCtr is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTableCtr() {	 
			return (getShort(beginTableCtr));
   	}
         int localTableNoCounter = -1;
         public boolean isTableNoModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localTableNoCounter != sharedCounter;
            localTableNoCounter = sharedCounter; return hasModified; 
         }
   protected static final int TABLE_NO_LEN = 2;
  	/**
	 * serializeTableNo
	 */
	protected void serializeTableNo(short tableNo) {
           replaceValue( //  save the value as string
                   getBinaryString( tableNo,TABLE_NO_LEN)
                  ,beginTableNo
                  ,TABLE_NO_LEN
                 );
            localTableNoCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkTableNoMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshTableNo is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshTableNo() {	 
			return (getShort(beginTableNo));
   	}




}
  
