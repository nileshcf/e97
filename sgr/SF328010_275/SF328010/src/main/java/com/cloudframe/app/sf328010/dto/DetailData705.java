package com.cloudframe.app.sf328010.dto;

/**
*  The class DetailData705 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 07:20. using version 5.0.0.257
**/


import com.cloudframe.app.sf328010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class DetailData705 extends DetailData705Serialized {
   
				private Detail705 detail705 = new Detail705();
	
	/**
	* Constructor for DetailData705
	**/
    public DetailData705() {
		super();
		/*  set the parent of each child as this which are a group variable */
	       			detail705.setParent(this,getStartOffset() + 0);
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of detail705
	 *	@return detail705
	 */   
	 public Detail705 getDetail705() {
   	return detail705;
   }
   /**
	* 	Update Detail705 with the passed value
	*   Corresponding COBOL Variable is 705-DETAIL
	*	@param value
	*/
   public void setDetail705(char[] value) {
      detail705.setString(value); 
   }   
    
     /**
	 * 	Update Detail705 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setDetail705(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail705.begin,detail705.length());
   }
   
     /**
	 * 	Update Detail705 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setDetail705(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail705.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update Detail705 with another Field
	 *	@param value
	 */
   public void setDetail705(Field source) {
   	replace(source,0,source.length(),detail705.begin,detail705.length());
   }  
   
     /**
	 * 	Update Detail705 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setDetail705(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,detail705.begin,detail705.length());
   }
   
     /**
	 * 	Update Detail705 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setDetail705(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,detail705.begin+targetIndex,targetLen);
   }

	
	
	

		public static int getDetailData705FieldLength() {
			return DETAIL_DATA_705_LENGTH;
		}

}
  
