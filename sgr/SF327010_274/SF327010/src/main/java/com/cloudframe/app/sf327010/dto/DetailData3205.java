package com.cloudframe.app.sf327010.dto;

/**
*  The class DetailData3205 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-21 at 10:59. using version 5.0.0.256
**/


import com.cloudframe.app.sf327010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DetailData3205 extends DetailData3205Serialized {
   
				private Detail1205 detail1205 = new Detail1205();
	
	/**
	* Constructor for DetailData3205
	**/
    public DetailData3205() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			detail1205.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of detail1205
	 *	@return detail1205
	 */   
	 public Detail1205 getDetail1205() {
   	return detail1205;
   }
   /**
	* 	Update Detail1205 with the passed value
	*   Corresponding COBOL Variable is 205-DETAIL1
	*	@param value
	*/
   public void setDetail1205(char[] value) {
      detail1205.setString(value); 
   }   
    
     /**
	 * 	Update Detail1205 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDetail1205(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail1205.begin,detail1205.length());
   }
   
     /**
	 * 	Update Detail1205 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetail1205(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail1205.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Detail1205 with another Field
	 *	@param value
	 */
   public void setDetail1205(Field source) {
   	replace(source,0,source.length(),detail1205.begin,detail1205.length());
   }  
   
     /**
	 * 	Update Detail1205 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDetail1205(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail1205.begin,detail1205.length());
   }
   
     /**
	 * 	Update Detail1205 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetail1205(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail1205.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDetailData3205FieldLength() {
			return DETAIL_DATA_3205_LENGTH;
		}

}
  
