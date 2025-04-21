package com.cloudframe.app.ms00d363.dto;

/**
*  The class ProductKeyEntry is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:12. using version 5.0.0.256
**/


import com.cloudframe.app.ms00d363.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class ProductKeyEntry extends ProductKeyEntrySerialized { 
   

						private char[] tblKeyProd = Field.fillLowValue(3);

						private char[] tblKeyDesc = Field.fillLowValue(25);
	
	/**
	* Constructor for ProductKeyEntry
	**/
    public ProductKeyEntry() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for ProductKeyEntry. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public ProductKeyEntry(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    

	/**
	 *	Returns the value of tblKeyProd
	 *	@return tblKeyProd
	 */
   public char[] getTblKeyProd() throws CFException{
     if (isTblKeyProdModified()) { 
        tblKeyProd = refreshTblKeyProd();
     }
   		return tblKeyProd;
   }

  
	/**
	*  set variable tblKeyProd
	*  Corresponding COBOL Variable is TBL-KEY-PROD
	*  @param value
	**/
   public void setTblKeyProd(char[] value) {
      tblKeyProd = checkTblKeyProdConstraints(value);
      serializeTblKeyProd(tblKeyProd);
   } 

     /**
	 * 	Update TblKeyProd 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTblKeyProd(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTblKeyProd,tblKeyProd.length);
   	
   }
   
   public void setTblKeyProd(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTblKeyProd,tblKeyProd.length);
   	
   }
   
     /**
	 * 	Update TblKeyProd 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTblKeyProd(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTblKeyProd+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TblKeyProd with another Field
	 *	@param value
	 */
   public void setTblKeyProd(Field source) {
       replace(source,0,source.length(),beginTblKeyProd,TBL_KEY_PROD_LEN);
   	
   }  
   
     /**
	 * 	Update TblKeyProd 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTblKeyProd(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTblKeyProd,TBL_KEY_PROD_LEN);
   	
   }
   
     /**
	 * 	Update TblKeyProd 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTblKeyProd(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTblKeyProd+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of tblKeyDesc
	 *	@return tblKeyDesc
	 */
   public char[] getTblKeyDesc() throws CFException{
     if (isTblKeyDescModified()) { 
        tblKeyDesc = refreshTblKeyDesc();
     }
   		return tblKeyDesc;
   }

  
	/**
	*  set variable tblKeyDesc
	*  Corresponding COBOL Variable is TBL-KEY-DESC
	*  @param value
	**/
   public void setTblKeyDesc(char[] value) {
      tblKeyDesc = checkTblKeyDescConstraints(value);
      serializeTblKeyDesc(tblKeyDesc);
   } 

     /**
	 * 	Update TblKeyDesc 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setTblKeyDesc(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginTblKeyDesc,tblKeyDesc.length);
   	
   }
   
   public void setTblKeyDesc(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginTblKeyDesc,tblKeyDesc.length);
   	
   }
   
     /**
	 * 	Update TblKeyDesc 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setTblKeyDesc(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTblKeyDesc+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update TblKeyDesc with another Field
	 *	@param value
	 */
   public void setTblKeyDesc(Field source) {
       replace(source,0,source.length(),beginTblKeyDesc,TBL_KEY_DESC_LEN);
   	
   }  
   
     /**
	 * 	Update TblKeyDesc 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setTblKeyDesc(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginTblKeyDesc,TBL_KEY_DESC_LEN);
   	
   }
   
     /**
	 * 	Update TblKeyDesc 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setTblKeyDesc(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginTblKeyDesc+targetIndex,targetLen);
    
   }

	
	
	

		public static int getProductKeyEntryFieldLength() {
			return PRODUCT_KEY_ENTRY_LENGTH;
		}

}
  
