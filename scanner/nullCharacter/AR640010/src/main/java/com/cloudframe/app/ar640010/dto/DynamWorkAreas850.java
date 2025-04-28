package com.cloudframe.app.ar640010.dto;

/**
*  The class DynamWorkAreas850 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:11. using version 5.0.0.256
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DynamWorkAreas850 extends DynamWorkAreas850Serialized {
   

								private int dynamPointer850;
				private DynamFunctionGroup850 dynamFunctionGroup850 = new DynamFunctionGroup850();
				private DynamAllocParms850 dynamAllocParms850 = new DynamAllocParms850();
				private DynamInfoIdent850 dynamInfoIdent850 = new DynamInfoIdent850();
				private DynamInfoParms850 dynamInfoParms850 = new DynamInfoParms850();
	
	/**
	* Constructor for DynamWorkAreas850
	**/
    public DynamWorkAreas850() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			dynamFunctionGroup850.setParent(this,getStartOffset() + 4);
	       			dynamAllocParms850.setParent(this,getStartOffset() + 12);
	       			dynamInfoIdent850.setParent(this,getStartOffset() + 236);
	       			dynamInfoParms850.setParent(this,getStartOffset() + 248);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of dynamPointer850
	 *	@return dynamPointer850
	 */
	public int getDynamPointer850() throws CFException {
        if (isDynamPointer850Modified()) { 
           dynamPointer850 = refreshDynamPointer850();
        }
   		return dynamPointer850;
	}
	
	/**
	 * 	Update DynamPointer850 with the passed value
	 *  Corresponding COBOL Variable is 850-DYNAM-POINTER
	 *	@param number
	 */
	public void setDynamPointer850(int number) {
	     // Truncate if the number is beyond +/- Max range
	    dynamPointer850 = checkDynamPointer850MaxLimit(number); 
		serializeDynamPointer850(dynamPointer850);
	}


	public void setDynamPointer850(long number) {
	    number = checkDynamPointer850MaxLimit(number); // Truncate if value is beyond +/- Max range
		setDynamPointer850((int)number);
	}
	
	/**
	 *	Returns the value of dynamFunctionGroup850
	 *	@return dynamFunctionGroup850
	 */   
	 public DynamFunctionGroup850 getDynamFunctionGroup850() {
   	return dynamFunctionGroup850;
   }
   /**
	* 	Update DynamFunctionGroup850 with the passed value
	*   Corresponding COBOL Variable is 850-DYNAM-FUNCTION-GROUP
	*	@param value
	*/
   public void setDynamFunctionGroup850(char[] value) {
      dynamFunctionGroup850.setString(value); 
   }   
    
     /**
	 * 	Update DynamFunctionGroup850 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDynamFunctionGroup850(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamFunctionGroup850.begin,dynamFunctionGroup850.length());
   }
   
     /**
	 * 	Update DynamFunctionGroup850 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamFunctionGroup850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamFunctionGroup850.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DynamFunctionGroup850 with another Field
	 *	@param value
	 */
   public void setDynamFunctionGroup850(Field source) {
   	replace(source,0,source.length(),dynamFunctionGroup850.begin,dynamFunctionGroup850.length());
   }  
   
     /**
	 * 	Update DynamFunctionGroup850 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDynamFunctionGroup850(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamFunctionGroup850.begin,dynamFunctionGroup850.length());
   }
   
     /**
	 * 	Update DynamFunctionGroup850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamFunctionGroup850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamFunctionGroup850.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dynamAllocParms850
	 *	@return dynamAllocParms850
	 */   
	 public DynamAllocParms850 getDynamAllocParms850() {
   	return dynamAllocParms850;
   }
   /**
	* 	Update DynamAllocParms850 with the passed value
	*   Corresponding COBOL Variable is 850-DYNAM-ALLOC-PARMS
	*	@param value
	*/
   public void setDynamAllocParms850(char[] value) {
      dynamAllocParms850.setString(value); 
   }   
    
     /**
	 * 	Update DynamAllocParms850 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDynamAllocParms850(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamAllocParms850.begin,dynamAllocParms850.length());
   }
   
     /**
	 * 	Update DynamAllocParms850 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamAllocParms850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamAllocParms850.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DynamAllocParms850 with another Field
	 *	@param value
	 */
   public void setDynamAllocParms850(Field source) {
   	replace(source,0,source.length(),dynamAllocParms850.begin,dynamAllocParms850.length());
   }  
   
     /**
	 * 	Update DynamAllocParms850 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDynamAllocParms850(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamAllocParms850.begin,dynamAllocParms850.length());
   }
   
     /**
	 * 	Update DynamAllocParms850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamAllocParms850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamAllocParms850.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dynamInfoIdent850
	 *	@return dynamInfoIdent850
	 */   
	 public DynamInfoIdent850 getDynamInfoIdent850() {
   	return dynamInfoIdent850;
   }
   /**
	* 	Update DynamInfoIdent850 with the passed value
	*   Corresponding COBOL Variable is 850-DYNAM-INFO-IDENT
	*	@param value
	*/
   public void setDynamInfoIdent850(char[] value) {
      dynamInfoIdent850.setString(value); 
   }   
    
     /**
	 * 	Update DynamInfoIdent850 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoIdent850(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoIdent850.begin,dynamInfoIdent850.length());
   }
   
     /**
	 * 	Update DynamInfoIdent850 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoIdent850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoIdent850.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DynamInfoIdent850 with another Field
	 *	@param value
	 */
   public void setDynamInfoIdent850(Field source) {
   	replace(source,0,source.length(),dynamInfoIdent850.begin,dynamInfoIdent850.length());
   }  
   
     /**
	 * 	Update DynamInfoIdent850 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoIdent850(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoIdent850.begin,dynamInfoIdent850.length());
   }
   
     /**
	 * 	Update DynamInfoIdent850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoIdent850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoIdent850.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of dynamInfoParms850
	 *	@return dynamInfoParms850
	 */   
	 public DynamInfoParms850 getDynamInfoParms850() {
   	return dynamInfoParms850;
   }
   /**
	* 	Update DynamInfoParms850 with the passed value
	*   Corresponding COBOL Variable is 850-DYNAM-INFO-PARMS
	*	@param value
	*/
   public void setDynamInfoParms850(char[] value) {
      dynamInfoParms850.setString(value); 
   }   
    
     /**
	 * 	Update DynamInfoParms850 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoParms850(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoParms850.begin,dynamInfoParms850.length());
   }
   
     /**
	 * 	Update DynamInfoParms850 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoParms850(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoParms850.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update DynamInfoParms850 with another Field
	 *	@param value
	 */
   public void setDynamInfoParms850(Field source) {
   	replace(source,0,source.length(),dynamInfoParms850.begin,dynamInfoParms850.length());
   }  
   
     /**
	 * 	Update DynamInfoParms850 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDynamInfoParms850(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoParms850.begin,dynamInfoParms850.length());
   }
   
     /**
	 * 	Update DynamInfoParms850 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDynamInfoParms850(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,dynamInfoParms850.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDynamWorkAreas850FieldLength() {
			return DYNAM_WORK_AREAS_850_LENGTH;
		}

}
  
