package com.cloudframe.app.bm8090m.dto;

/**
*  The class IoPe8090p is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 12:05. using version 5.0.0.256
**/


import com.cloudframe.app.bm8090m.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class IoPe8090p extends IoPe8090pSerialized {
   
				private Pe8090p pe8090p = new Pe8090p();
	
	/**
	* Constructor for IoPe8090p
	**/
    public IoPe8090p() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			pe8090p.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of pe8090p
	 *	@return pe8090p
	 */   
	 public Pe8090p getPe8090p() {
   	return pe8090p;
   }
   /**
	* 	Update Pe8090p with the passed value
	*   Corresponding COBOL Variable is PE8090P
	*	@param value
	*/
   public void setPe8090p(char[] value) {
      pe8090p.setString(value); 
   }   
    
     /**
	 * 	Update Pe8090p 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setPe8090p(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pe8090p.begin,pe8090p.length());
   }
   
     /**
	 * 	Update Pe8090p 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setPe8090p(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pe8090p.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Pe8090p with another Field
	 *	@param value
	 */
   public void setPe8090p(Field source) {
   	replace(source,0,source.length(),pe8090p.begin,pe8090p.length());
   }  
   
     /**
	 * 	Update Pe8090p 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setPe8090p(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,pe8090p.begin,pe8090p.length());
   }
   
     /**
	 * 	Update Pe8090p 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setPe8090p(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,pe8090p.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getIoPe8090pFieldLength() {
			return IO_PE_8090P_LENGTH;
		}

}
  
