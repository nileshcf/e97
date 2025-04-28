package com.cloudframe.app.sf328010.dto;

/**
*  The class DetailData2705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 06:58. using version 5.0.0.256
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DetailData2705 extends DetailData2705Serialized {
   
				private Detail170501 detail170501 = new Detail170501();
	
	/**
	* Constructor for DetailData2705
	**/
    public DetailData2705() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			detail170501.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of detail170501
	 *	@return detail170501
	 */   
	 public Detail170501 getDetail170501() {
   	return detail170501;
   }
   /**
	* 	Update Detail170501 with the passed value
	*   Corresponding COBOL Variable is 705-DETAIL1
	*	@param value
	*/
   public void setDetail170501(char[] value) {
      detail170501.setString(value); 
   }   
    
     /**
	 * 	Update Detail170501 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDetail170501(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail170501.begin,detail170501.length());
   }
   
     /**
	 * 	Update Detail170501 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetail170501(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail170501.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Detail170501 with another Field
	 *	@param value
	 */
   public void setDetail170501(Field source) {
   	replace(source,0,source.length(),detail170501.begin,detail170501.length());
   }  
   
     /**
	 * 	Update Detail170501 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDetail170501(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail170501.begin,detail170501.length());
   }
   
     /**
	 * 	Update Detail170501 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetail170501(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail170501.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDetailData2705FieldLength() {
			return DETAIL_DATA_2705_LENGTH;
		}

}
  
