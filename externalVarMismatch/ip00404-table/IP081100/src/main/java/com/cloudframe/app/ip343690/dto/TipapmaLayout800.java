package com.cloudframe.app.ip343690.dto;

/**
*  The class TipapmaLayout800 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:27. using version 5.0.0.257
**/


import com.cloudframe.app.ip343690.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class TipapmaLayout800 extends TipapmaLayout800Serialized {
   

						private char[] virtualAccountNbr800 = Field.fillLowValue(19);

						private char[] primAccountNbr800 = Field.fillLowValue(19);
	
	/**
	* Constructor for TipapmaLayout800
	**/
    public TipapmaLayout800() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of virtualAccountNbr800
	 *	@return virtualAccountNbr800
	 */
   public char[] getVirtualAccountNbr800() throws CFException{
     if (isVirtualAccountNbr800Modified()) { 
        virtualAccountNbr800 = refreshVirtualAccountNbr800();
     }
   		return virtualAccountNbr800;
   }

  
	/**
	*  set variable virtualAccountNbr800
	*  Corresponding COBOL Variable is 800-VIRTUAL-ACCOUNT-NBR
	*  @param value
	**/
   public void setVirtualAccountNbr800(char[] value) {
      virtualAccountNbr800 = checkVirtualAccountNbr800Constraints(value);
      serializeVirtualAccountNbr800(virtualAccountNbr800);
   } 

     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginVirtualAccountNbr800,virtualAccountNbr800.length);
   	
   }
   
   public void setVirtualAccountNbr800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginVirtualAccountNbr800,virtualAccountNbr800.length);
   	
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVirtualAccountNbr800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update VirtualAccountNbr800 with another Field
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source) {
       replace(source,0,source.length(),beginVirtualAccountNbr800,VIRTUAL_ACCOUNT_NBR_800_LEN);
   	
   }  
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginVirtualAccountNbr800,VIRTUAL_ACCOUNT_NBR_800_LEN);
   	
   }
   
     /**
	 * 	Update VirtualAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setVirtualAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginVirtualAccountNbr800+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of primAccountNbr800
	 *	@return primAccountNbr800
	 */
   public char[] getPrimAccountNbr800() throws CFException{
     if (isPrimAccountNbr800Modified()) { 
        primAccountNbr800 = refreshPrimAccountNbr800();
     }
   		return primAccountNbr800;
   }

  
	/**
	*  set variable primAccountNbr800
	*  Corresponding COBOL Variable is 800-PRIM-ACCOUNT-NBR
	*  @param value
	**/
   public void setPrimAccountNbr800(char[] value) {
      primAccountNbr800 = checkPrimAccountNbr800Constraints(value);
      serializePrimAccountNbr800(primAccountNbr800);
   } 

     /**
	 * 	Update PrimAccountNbr800 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setPrimAccountNbr800(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginPrimAccountNbr800,primAccountNbr800.length);
   	
   }
   
   public void setPrimAccountNbr800(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginPrimAccountNbr800,primAccountNbr800.length);
   	
   }
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPrimAccountNbr800(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrimAccountNbr800+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update PrimAccountNbr800 with another Field
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source) {
       replace(source,0,source.length(),beginPrimAccountNbr800,PRIM_ACCOUNT_NBR_800_LEN);
   	
   }  
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginPrimAccountNbr800,PRIM_ACCOUNT_NBR_800_LEN);
   	
   }
   
     /**
	 * 	Update PrimAccountNbr800 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPrimAccountNbr800(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginPrimAccountNbr800+targetIndex,targetLen);
    
   }

	
	
	

		public static int getTipapmaLayout800FieldLength() {
			return TIPAPMA_LAYOUT_800_LENGTH;
		}

}
  
