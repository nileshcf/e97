package com.cloudframe.app.ms00d363.dto;

/**
*  The class ProductTblGroup is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProductTblGroup extends ProductTblGroupSerialized {
   

						private char[] productTbl = new char[588];
					private ProductTable productTable = new ProductTable();
	
	/**
	* Constructor for ProductTblGroup
	**/
    public ProductTblGroup() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			productTable.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
								setProductTbl("010CIRRUS                   020MASTERCARD               030MASTERCARD CHIP          040MAESTRO POS              050MAESTRO ATM              060MAESTRO                  070DEBIT MASTERCARD AUTH    080DEBIT MASTERCARD CLEARING090DEBIT MASTERCARD PAYMENT 100PLUS                     105ACCEL/EXCHANGE           110VISA                     120AMERICAN EXPRESS         130MASTER BANKING           140VISA CASH                150DISCOVER                 160DINERS CLUB              170JCB                      180PRIVATE LABEL            925NO ACTIVITY              999FUTURE USE               ".toCharArray());
    }


 

	/**
	 *	Returns the value of productTbl
	 *	@return productTbl
	 */
   public char[] getProductTbl() throws CFException{
     if (isProductTblModified()) { 
        productTbl = refreshProductTbl();
     }
   		return productTbl;
   }

  
	/**
	*  set variable productTbl
	*  Corresponding COBOL Variable is PRODUCT-TBL
	*  @param value
	**/
   public void setProductTbl(char[] value) {
      productTbl = checkProductTblConstraints(value);
      serializeProductTbl(productTbl);
   } 

     /**
	 * 	Update ProductTbl 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setProductTbl(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginProductTbl,productTbl.length);
   	
   }
   
   public void setProductTbl(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginProductTbl,productTbl.length);
   	
   }
   
     /**
	 * 	Update ProductTbl 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProductTbl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProductTbl+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update ProductTbl with another Field
	 *	@param value
	 */
   public void setProductTbl(Field source) {
       replace(source,0,source.length(),beginProductTbl,PRODUCT_TBL_LEN);
   	
   }  
   
     /**
	 * 	Update ProductTbl 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setProductTbl(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginProductTbl,PRODUCT_TBL_LEN);
   	
   }
   
     /**
	 * 	Update ProductTbl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProductTbl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginProductTbl+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of productTable
	 *	@return productTable
	 */   
	 public ProductTable getProductTable() {
   	return productTable;
   }
   /**
	* 	Update ProductTable with the passed value
	*   Corresponding COBOL Variable is PRODUCT-TABLE
	*	@param value
	*/
   public void setProductTable(char[] value) {
      productTable.setString(value); 
   }   
    
     /**
	 * 	Update ProductTable 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setProductTable(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,productTable.begin,productTable.length());
   }
   
     /**
	 * 	Update ProductTable 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setProductTable(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,productTable.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update ProductTable with another Field
	 *	@param value
	 */
   public void setProductTable(Field source) {
   	replace(source,0,source.length(),productTable.begin,productTable.length());
   }  
   
     /**
	 * 	Update ProductTable 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setProductTable(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,productTable.begin,productTable.length());
   }
   
     /**
	 * 	Update ProductTable 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setProductTable(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,productTable.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getProductTblGroupFieldLength() {
			return PRODUCT_TBL_GROUP_LENGTH;
		}

}
  
