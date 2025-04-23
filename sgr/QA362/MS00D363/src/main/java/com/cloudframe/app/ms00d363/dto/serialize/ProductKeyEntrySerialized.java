package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class ProductKeyEntrySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 23:32. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProductKeyEntrySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProductKeyEntrySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRODUCT_KEY_ENTRY_LENGTH = 28;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginTblKeyProd;
            protected  int beginTblKeyDesc;
	
	/**
	* Constructor for ProductKeyEntrySerialized
	**/
    public ProductKeyEntrySerialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for ProductKeyEntrySerialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProductKeyEntrySerialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this ProductKeyEntrySerialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,0); // serialize this field at offset 0 by default 
    }
    
	/**
	* sets parent for this ProductKeyEntrySerialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 0 by default
    }    
	/**
	* initializes the field in ProductKeyEntrySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRODUCT_KEY_ENTRY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginTblKeyProd = getStartOffset() + 0;	// set offset for serialization
  
             beginTblKeyDesc = getStartOffset() + 3;	// set offset for serialization
  
	   /*  end of offset */
	}
     int localTblKeyProdCounter = -1;
     public boolean isTblKeyProdModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblKeyProdCounter != sharedCounter;
         localTblKeyProdCounter = sharedCounter; return hasModified;
     }
	protected static final int TBL_KEY_PROD_LEN = 3;
	/**
	 * 	serialize this TblKeyProd
	 */
   protected void serializeTblKeyProd(char[] tblKeyProd) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tblKeyProd,0,getStringValue(),beginTblKeyProd,TBL_KEY_PROD_LEN);
       localTblKeyProdCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTblKeyProdConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
    /**
	 *	refreshTblKeyProd is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTblKeyProd() {	 
   		return (substring(getStringValue(),beginTblKeyProd,beginTblKeyProd + TBL_KEY_PROD_LEN));
   	}
     int localTblKeyDescCounter = -1;
     public boolean isTblKeyDescModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localTblKeyDescCounter != sharedCounter;
         localTblKeyDescCounter = sharedCounter; return hasModified;
     }
	protected static final int TBL_KEY_DESC_LEN = 25;
	/**
	 * 	serialize this TblKeyDesc
	 */
   protected void serializeTblKeyDesc(char[] tblKeyDesc) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(tblKeyDesc,0,getStringValue(),beginTblKeyDesc,TBL_KEY_DESC_LEN);
       localTblKeyDescCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkTblKeyDescConstraints(char[] value) {
   			return super.checkConstraints(value , 25 ,false, false);
   }
    /**
	 *	refreshTblKeyDesc is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshTblKeyDesc() {	 
   		return (substring(getStringValue(),beginTblKeyDesc,beginTblKeyDesc + TBL_KEY_DESC_LEN));
   	}




}
  
