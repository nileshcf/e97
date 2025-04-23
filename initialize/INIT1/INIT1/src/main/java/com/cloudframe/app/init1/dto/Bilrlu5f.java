package com.cloudframe.app.init1.dto;

/**
*  The class Bilrlu5f is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 09:56. using version 5.0.0.254
**/


import com.cloudframe.app.init1.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class Bilrlu5f extends Bilrlu5fSerialized {
   
				private Rlu5fChrgCrdDtl rlu5fChrgCrdDtl = new Rlu5fChrgCrdDtl();
	
	/**
	* Constructor for Bilrlu5f
	**/
    public Bilrlu5f() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			rlu5fChrgCrdDtl.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of rlu5fChrgCrdDtl
	 *	@return rlu5fChrgCrdDtl
	 */   
	 public Rlu5fChrgCrdDtl getRlu5fChrgCrdDtl() {
   	return rlu5fChrgCrdDtl;
   }
   /**
	* 	Update Rlu5fChrgCrdDtl with the passed value
	*   Corresponding COBOL Variable is RLU5F-CHRG-CRD-DTL
	*	@param value
	*/
   public void setRlu5fChrgCrdDtl(char[] value) {
      rlu5fChrgCrdDtl.setString(value); 
   }   
    
     /**
	 * 	Update Rlu5fChrgCrdDtl 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setRlu5fChrgCrdDtl(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fChrgCrdDtl.begin,rlu5fChrgCrdDtl.length());
   }
   
     /**
	 * 	Update Rlu5fChrgCrdDtl 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fChrgCrdDtl(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fChrgCrdDtl.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Rlu5fChrgCrdDtl with another Field
	 *	@param value
	 */
   public void setRlu5fChrgCrdDtl(Field source) {
   	replace(source,0,source.length(),rlu5fChrgCrdDtl.begin,rlu5fChrgCrdDtl.length());
   }  
   
     /**
	 * 	Update Rlu5fChrgCrdDtl 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setRlu5fChrgCrdDtl(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fChrgCrdDtl.begin,rlu5fChrgCrdDtl.length());
   }
   
     /**
	 * 	Update Rlu5fChrgCrdDtl 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setRlu5fChrgCrdDtl(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,rlu5fChrgCrdDtl.begin+targetIndex,targetLen);
   }

	
	
	
	/**
	 * 	initializes Bilrlu5f
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          rlu5fChrgCrdDtl.initialize();
     
   }

		public static int getBilrlu5fFieldLength() {
			return BILRLU_5F_LENGTH;
		}

}
  
