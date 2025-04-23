package com.cloudframe.app.ms00d363.dto;

/**
*  The class ProductTable is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:11. using version 5.0.0.254
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import java.util.*;
import com.cloudframe.app.data.Field;


public class ProductTable extends ProductTableSerialized { 
   
			private List<ProductKeyEntry> productKeyEntry = new ArrayList<>();
    	
	
	/**
	* Constructor for ProductTable
	**/
    public ProductTable() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ProductTable. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProductTable(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the  value of productKeyEntry
	 *  Corresponding COBOL Variable is PRODUCT-KEY-ENTRY
	 *	@return productKeyEntry
	 */
   public List<ProductKeyEntry> getProductKeyEntry() {
       return productKeyEntry;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return productKeyEntry
	 */
	public ProductKeyEntry getProductKeyEntry(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getProductKeyEntry(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= PRODUCT_KEY_ENTRY_SIZE) {
             	index = PRODUCT_KEY_ENTRY_SIZE -1; // can't exceed max array size
             	logger.trace("productKeyEntry - Array index exceeded max Size {}, resetting it to max allowed",PRODUCT_KEY_ENTRY_SIZE); 
	    }
		if (index >= productKeyEntry.size()) {
       		for (int fillIndex =  productKeyEntry.size() -1; fillIndex < index;fillIndex++) {
		       productKeyEntry.add(null);
		    }
			productKeyEntry.set(index,
			   	   	new ProductKeyEntry(this,beginProductKeyEntry + index * ProductKeyEntry.getProductKeyEntryFieldLength()) 
				                        ); 	
		} 
   	   ProductKeyEntry value = productKeyEntry.get(index);
   	   if (value == null) {
   	      productKeyEntry.set(index,
			   	   	new ProductKeyEntry(this,beginProductKeyEntry + index * ProductKeyEntry.getProductKeyEntryFieldLength()) 
				                        ); 
		  value = productKeyEntry.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update ProductKeyEntry at index with the passed value
	 *  Corresponding COBOL Variable is PRODUCT-KEY-ENTRY
	 *  @param index
	 *	@param value
	 */
  public void setProductKeyEntry(int index,char[] value) {
   	getProductKeyEntry(index).setString(value);
   }
   
	

	
	
	

		public static int getProductTableFieldLength() {
			return PRODUCT_TABLE_LENGTH;
		}

}
  
