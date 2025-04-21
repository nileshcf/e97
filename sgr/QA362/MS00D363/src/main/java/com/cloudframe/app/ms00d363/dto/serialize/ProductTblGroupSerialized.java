package com.cloudframe.app.ms00d363.dto.serialize;

/**
*  The class ProductTblGroupSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class ProductTblGroupSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(ProductTblGroupSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int PRODUCT_TBL_GROUP_LENGTH = 588;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginProductTbl;
	
	/**
	* Constructor for ProductTblGroupSerialized
	**/
    public ProductTblGroupSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in ProductTblGroupSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(PRODUCT_TBL_GROUP_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginProductTbl = getStartOffset() + 0;	// set offset for serialization
  
  
	   /*  end of offset */
	}
     int localProductTblCounter = -1;
     public boolean isProductTblModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localProductTblCounter != sharedCounter;
         localProductTblCounter = sharedCounter; return hasModified;
     }
	protected static final int PRODUCT_TBL_LEN = 588;
	/**
	 * 	serialize this ProductTbl
	 */
   protected void serializeProductTbl(char[] productTbl) {
        shareString.getSerializedField().incrementCounter();
        arraycopy(productTbl,0,getStringValue(),beginProductTbl,PRODUCT_TBL_LEN);
       localProductTblCounter = shareString.getSerializedField().getModifiedCounter();  	
   }

   protected char[] checkProductTblConstraints(char[] value) {
   			return super.checkConstraints(value , 588 ,false, false);
   }
    /**
	 *	refreshProductTbl is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public char[] refreshProductTbl() {	 
   		return (substring(getStringValue(),beginProductTbl,beginProductTbl + PRODUCT_TBL_LEN));
   	}




}
  
